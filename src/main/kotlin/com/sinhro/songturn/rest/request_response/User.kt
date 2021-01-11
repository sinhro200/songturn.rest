package com.sinhro.songturn.rest.request_response

import com.fasterxml.jackson.annotation.JsonProperty
import com.sinhro.songturn.rest.model.FullUserInfo
import com.sinhro.songturn.rest.model.PublicUserInfo

class PublicUserInfoReqData(
        @JsonProperty("user_info")
        var publicUserInfo: PublicUserInfo? = null
)

class FullUserInfoReqData(
        @JsonProperty("user_info")
        var fullUserInfo: FullUserInfo? = null
)

class PublicUserInfoRespBody(
        @JsonProperty("user_info")
        var publicUserInfo: PublicUserInfo? = null
)

class FullUserInfoRespBody(
        @JsonProperty("user_info")
        var fullUserInfo: FullUserInfo? = null
)