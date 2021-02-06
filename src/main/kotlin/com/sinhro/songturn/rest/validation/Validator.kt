package com.sinhro.songturn.rest.validation

class Validator {

    fun validate(obj: Any): ValidatorResult {
        val map = mutableMapOf<String, List<ValidationResult>>()
        for (f in obj::class.java.declaredFields) {
            f.isAccessible = true
            if (f.name != "Companion" &&
                    (
//                            f.canAccess(obj) ||
//                            f.trySetAccessible()
                            // should be isAccesible,
                            // because using this code on android/kotlin throws exception
                            // except isAccesible
                            f.isAccessible
                            )
            ) {
                val validatorResults = validateValue(f.get(obj), f.annotations)
                map.put(f.name, validatorResults)
            }
        }
        for (f in obj::class.java.fields)
            if (f.name != "Companion" &&
                    (
//                            f.canAccess(obj) ||
//                            f.trySetAccessible()
                            // should be isAccesible,
                            // because using this code on android/kotlin throws exception
                            // except isAccesible
                            f.isAccessible
                            )
            ) {
                val validatorResults = validateValue(f.get(obj), f.annotations)
                if (!map.containsKey(f.name) || map[f.name]!!.isEmpty())
                    map.put(f.name, validatorResults)
            }
        return ValidatorResult(map)
    }

    private fun validateValue(fieldValue: Any?, annotationsToCheck: Array<Annotation>)
            : List<ValidationResult> {
        val res = mutableListOf<ValidationResult>()
        if (fieldValue == null) {
            if (annotationsToCheck.find { annotation: Annotation -> annotation is NotNull } != null)
                res.add(ValidationResult(
                        ValidationResultType.NotNullError,
                        "Field must not be null or empty"
                ))
            return res
        }
        if (annotationsToCheck.find { ann: Annotation -> ann is CanBeEmpty } != null)
            if (fieldValue.toString().isBlank()) {
                return res
            }

        for (annotation in annotationsToCheck) {
            when (annotation) {
                is MinMaxLength -> {
                    if (fieldValue is String && fieldValue.length < annotation.minLength)
                        res.add(ValidationResult(
                                ValidationResultType.MinLengthError,
                                "Field must contains more than ${annotation.minLength - 1} symbols",
                                annotation.minLength
                        ))
                    if (fieldValue is String && fieldValue.length > annotation.maxLength)
                        res.add(ValidationResult(
                                ValidationResultType.MaxLengthError,
                                "Field must contains less than ${annotation.maxLength + 1} symbols",
                                annotation.maxLength
                        ))
                }
                is MinLength -> {
                    if (fieldValue is String && fieldValue.length < annotation.minLength)
                        res.add(ValidationResult(
                                ValidationResultType.MinLengthError,
                                "Field must contains more than ${annotation.minLength - 1} symbols",
                                annotation.minLength
                        ))
                }
                is MaxLength -> {
                    if (fieldValue is String && fieldValue.length > annotation.maxLength)
                        res.add(ValidationResult(
                                ValidationResultType.MaxLengthError,
                                "Field must contains less than ${annotation.maxLength + 1} symbols",
                                annotation.maxLength
                        ))
                }
                is MinMaxValue -> {
                    if (fieldValue is Int && fieldValue < annotation.minValue)
                        res.add(ValidationResult(
                                ValidationResultType.MinValueError,
                                "Field value must be more than ${annotation.minValue - 1}",
                                annotation.minValue
                        ))
                    if (fieldValue is Int && fieldValue > annotation.maxValue)
                        res.add(ValidationResult(
                                ValidationResultType.MaxValueError,
                                "Field value must be less than ${annotation.maxValue + 1}",
                                annotation.maxValue
                        ))
                }
                is MinValue -> {
                    if (fieldValue is Int && fieldValue < annotation.minValue)
                        res.add(ValidationResult(
                                ValidationResultType.MinValueError,
                                "Field value must be more than ${annotation.minValue - 1}",
                                annotation.minValue
                        ))
                }
                is MaxValue -> {
                    if (fieldValue is Int && fieldValue > annotation.maxValue)
                        res.add(ValidationResult(
                                ValidationResultType.MaxValueError,
                                "Field value must be less than ${annotation.maxValue + 1}",
                                annotation.maxValue
                        ))
                }
                is Contains -> {
                    for (char in annotation.chars) {
                        if (!fieldValue.toString().contains(char))
                            res.add(ValidationResult(
                                    ValidationResultType.MustContainsError,
                                    "Field value must contains symbol $char",
                                    char.toString()
                            ))
                    }
                }
                is NotContains -> {
                    for (char in annotation.chars) {
                        if (fieldValue.toString().contains(char))
                            res.add(ValidationResult(
                                    ValidationResultType.MustNotContainsError,
                                    "Field value must not contains symbol $char",
                                    char.toString()
                            ))
                    }
                }
            }
        }
        return res
    }
}

class ValidatorResult(
        private val res: MutableMap<String, List<ValidationResult>>
) {
    fun resultForEveryField(): MutableMap<String, List<ValidationResult>> {
        return res
    }

    fun resultForErrorFields(): Map<String, List<ValidationResult>> {
        return res.filter { entry ->
            entry.value.isNotEmpty()
        }
    }
}