package com.sinhro.songturn.rest.request_response

import com.fasterxml.jackson.annotation.JsonProperty
import com.sinhro.songturn.rest.model.FullUserInfo


class AuthReqData(
    var login: String? = null,
    var password: String? = null
)

class AuthRespBody(
        @JsonProperty("user_info")
        var fullUserInfo: FullUserInfo? = null,
        @JsonProperty("access_token")
        var accessToken: String? = null
)