package com.sinhro.songturn.rest.request_response

import com.fasterxml.jackson.annotation.JsonProperty
import com.sinhro.songturn.rest.model.RegisterUserInfo
import com.sinhro.songturn.rest.validation.Contains
import com.sinhro.songturn.rest.validation.MinMaxLength
import com.sinhro.songturn.rest.validation.NotContains
import com.sinhro.songturn.rest.validation.NotNull

public class RegisterReqData(
        val userInfo: RegisterUserInfo = RegisterUserInfo()
)

public class RegisterRespBody(
        val message: String
)