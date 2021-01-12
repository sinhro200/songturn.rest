package com.sinhro.songturn.rest.request_response

import com.fasterxml.jackson.annotation.JsonProperty
import com.sinhro.songturn.rest.validation.Contains
import com.sinhro.songturn.rest.validation.MinMaxLength
import com.sinhro.songturn.rest.validation.NotContains
import com.sinhro.songturn.rest.validation.NotNull

public class RegisterReqData(
        @field:[MinMaxLength(5,50) NotNull NotContains("@.")]
        var login: String? = null,

        @field:[MinMaxLength(5,50) NotNull]
        var password: String? = null,

        @field:[MinMaxLength(5,50) NotNull]
        var nickname: String? = null,

        @field:MinMaxLength(2,50)
        @JsonProperty("first_name")
        var firstName: String? = null,

        @field:MinMaxLength(2,50)
        @JsonProperty("last_name")
        var lastName: String? = null,

        @field:[MinMaxLength(1,90) Contains("@.")]
        var email: String? = null
)

public class RegisterRespBody(
        @JsonProperty("success_message")
        var successRegister_message: String? = null
)