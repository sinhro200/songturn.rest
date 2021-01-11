package com.sinhro.songturn.rest.request_response

import com.sinhro.songturn.rest.validation.MinMaxLength
import com.sinhro.songturn.rest.validation.NotNull

public class RegisterReqData(
        @field:[MinMaxLength(5,50) NotNull]
        var login: String? = null,

        @field:[MinMaxLength(5,50) NotNull]
        var password: String? = null,

        @field:[MinMaxLength(5,50) NotNull]
        var nickname: String? = null,

        @field:MinMaxLength(2,50)
        var firstName: String? = null,

        @field:MinMaxLength(2,50)
        var lastName: String? = null,

        @field:MinMaxLength(1,90)
        var email: String? = null
)

public class RegisterRespBody(
        var successRegister_message: String? = null
)