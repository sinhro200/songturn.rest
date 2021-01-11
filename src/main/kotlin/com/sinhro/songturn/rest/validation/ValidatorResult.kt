package com.sinhro.songturn.rest.validation

data class ValidatorResult(
        val type:ValidatorResultType,
        val simpleMessage : String
)

public enum class ValidatorResultType {
    OK,
    MinLengthError,
    MaxLengthError,
    MinValueError,
    MaxValueError,
    NotNullError,
}