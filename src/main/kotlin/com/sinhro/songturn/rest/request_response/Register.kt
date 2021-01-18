package com.sinhro.songturn.rest.request_response

import com.fasterxml.jackson.annotation.JsonProperty
import com.sinhro.songturn.rest.validation.Contains
import com.sinhro.songturn.rest.validation.MinMaxLength
import com.sinhro.songturn.rest.validation.NotContains
import com.sinhro.songturn.rest.validation.NotNull

public class RegisterReqData(
        @field:[MinMaxLength(5,50) NotNull NotContains("@.")]
        val login: String,

        @field:[MinMaxLength(5,50) NotNull]
        val password: String,

        @field:[MinMaxLength(5,50) NotNull]
        val nickname: String,

        @field:MinMaxLength(2,50)
        val firstName: String,

        @field:MinMaxLength(2,50)
        val lastName: String,

        @field:[MinMaxLength(1,90) Contains("@.")]
        val email: String
)

public class RegisterRespBody(
        val message: String
)