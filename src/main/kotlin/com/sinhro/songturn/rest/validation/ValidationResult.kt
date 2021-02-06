package com.sinhro.songturn.rest.validation

data class ValidationResult(
        val type: ValidationResultType,
        val simpleMessage: String,
        val extra: Any? = null
)

public enum class ValidationResultType {
    OK,
    MinLengthError,
    MaxLengthError,
    MinValueError,
    MaxValueError,
    NotNullError,
    MustContainsError,
    MustNotContainsError,
    MatchesError
}