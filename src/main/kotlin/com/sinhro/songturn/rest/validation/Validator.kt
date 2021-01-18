package com.sinhro.songturn.rest.validation

class Validator {

    fun validate(obj: Any): ValidatorResult {
        val map = mutableMapOf<String, List<ValidationResult>>()
        for (f in obj::class.java.declaredFields)
            if (f.name != "Companion" &&
                    f.canAccess(obj) || f.trySetAccessible()) {
                val validatorResults = validateValue(f.get(obj), f.annotations)
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

        for (annotation in annotationsToCheck) {
            when (annotation) {
                is MinMaxLength -> {
                    if (fieldValue is String && fieldValue.length < annotation.minLength)
                        res.add(ValidationResult(
                                ValidationResultType.MinLengthError,
                                "Field must contains more than ${annotation.minLength - 1} symbols"
                        ))
                    if (fieldValue is String && fieldValue.length > annotation.maxLength)
                        res.add(ValidationResult(
                                ValidationResultType.MaxLengthError,
                                "Field must contains less than ${annotation.maxLength + 1} symbols"
                        ))
                }
                is MinLength -> {
                    if (fieldValue is String && fieldValue.length < annotation.minLength)
                        res.add(ValidationResult(
                                ValidationResultType.MinLengthError,
                                "Field must contains more than ${annotation.minLength - 1} symbols"
                        ))
                }
                is MaxLength -> {
                    if (fieldValue is String && fieldValue.length > annotation.maxLength)
                        res.add(ValidationResult(
                                ValidationResultType.MaxLengthError,
                                "Field must contains less than ${annotation.maxLength + 1} symbols"
                        ))
                }
                is MinMaxValue -> {
                    if (fieldValue is Int && fieldValue < annotation.minValue)
                        res.add(ValidationResult(
                                ValidationResultType.MinValueError,
                                "Field value must be more than ${annotation.minValue - 1}"
                        ))
                    if (fieldValue is Int && fieldValue > annotation.maxValue)
                        res.add(ValidationResult(
                                ValidationResultType.MaxValueError,
                                "Field value must be less than ${annotation.maxValue + 1}"
                        ))
                }
                is MinValue -> {
                    if (fieldValue is Int && fieldValue < annotation.minValue)
                        res.add(ValidationResult(
                                ValidationResultType.MinValueError,
                                "Field value must be more than ${annotation.minValue - 1}"
                        ))
                }
                is MaxValue -> {
                    if (fieldValue is Int && fieldValue > annotation.maxValue)
                        res.add(ValidationResult(
                                ValidationResultType.MaxValueError,
                                "Field value must be less than ${annotation.maxValue + 1}"
                        ))
                }
                is Contains -> {
                    for (char in annotation.chars) {
                        if (!fieldValue.toString().contains(char))
                            res.add(ValidationResult(
                                    ValidationResultType.MustContainsError,
                                    "Field value must contains symbol $char",
                                    char
                            ))
                    }
                }
                is NotContains -> {
                    for (char in annotation.chars) {
                        if (fieldValue.toString().contains(char))
                            res.add(ValidationResult(
                                    ValidationResultType.MustNotContainsError,
                                    "Field value must not contains symbol $char",
                                    char
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
        return res.filter {
            entry ->
            entry.value.isNotEmpty()
        }
    }
}