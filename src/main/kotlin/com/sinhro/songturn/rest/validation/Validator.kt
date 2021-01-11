package com.sinhro.songturn.rest.validation

class Validator {

    fun validate(obj: Any): MutableMap<String, List<ValidatorResult>> {
        val map = mutableMapOf<String, List<ValidatorResult>>()
        for (f in obj::class.java.declaredFields)
            if (f.canAccess(obj) || f.trySetAccessible()) {
                val validatorResults = validateValue(f.get(obj), f.annotations)
                map.put(f.name, validatorResults)
            }
        return map
    }

    private fun validateValue(fieldValue: Any?, annotationsToCheck: Array<Annotation>)
            : List<ValidatorResult> {
        val res = mutableListOf<ValidatorResult>()
        if (fieldValue==null){
            if (annotationsToCheck.find {
                        annotation: Annotation -> annotation is NotNull } != null)
                res.add(ValidatorResult(
                        ValidatorResultType.NotNullError,
                        "Field must not be null or empty"
                ))
            return res
        }

        for (annotation in annotationsToCheck) {
            when (annotation) {
                is MinMaxLength -> {
                    if (fieldValue is String && fieldValue.length < annotation.minLength)
                        res.add(ValidatorResult(
                                ValidatorResultType.MinLengthError,
                                "Field must contains more than ${annotation.minLength-1} symbols"
                        ))
                    if (fieldValue is String && fieldValue.length > annotation.maxLength)
                        res.add(ValidatorResult(
                                ValidatorResultType.MaxLengthError,
                                "Field must contains less than ${annotation.maxLength+1} symbols"
                        ))
                }
                is MinLength -> {
                    if (fieldValue is String && fieldValue.length < annotation.minLength)
                        res.add(ValidatorResult(
                                ValidatorResultType.MinLengthError,
                                "Field must contains more than ${annotation.minLength-1} symbols"
                        ))
                }
                is MaxLength -> {
                    if (fieldValue is String && fieldValue.length > annotation.maxLength)
                        res.add(ValidatorResult(
                                ValidatorResultType.MaxLengthError,
                                "Field must contains less than ${annotation.maxLength+1} symbols"
                        ))
                }
                is MinMaxValue -> {
                    if (fieldValue is Int && fieldValue < annotation.minValue)
                        res.add(ValidatorResult(
                                ValidatorResultType.MinValueError,
                                "Field value must be more than ${annotation.minValue-1}"
                        ))
                    if (fieldValue is Int && fieldValue > annotation.maxValue)
                        res.add(ValidatorResult(
                                ValidatorResultType.MaxValueError,
                                "Field value must be less than ${annotation.maxValue+1}"
                        ))
                }
                is MinValue -> {
                    if (fieldValue is Int && fieldValue < annotation.minValue)
                        res.add(ValidatorResult(
                                ValidatorResultType.MinValueError,
                                "Field value must be more than ${annotation.minValue-1}"
                        ))
                }
                is MaxValue -> {
                    if (fieldValue is Int && fieldValue > annotation.maxValue)
                        res.add(ValidatorResult(
                                ValidatorResultType.MaxValueError,
                                "Field value must be less than ${annotation.maxValue+1}"
                        ))
                }
            }
        }
        return res
    }


}