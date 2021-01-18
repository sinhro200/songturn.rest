package com.sinhro.songturn.rest.request_response

import com.sinhro.songturn.rest.model.FullUserInfo
import com.sinhro.songturn.rest.model.PublicUserInfo

class FullUserInfoReqData(
        val userInfo: FullUserInfo
)

class PublicUserInfoRespBody(
        val userInfo: PublicUserInfo
)

class FullUserInfoRespBody(
        val userInfo: FullUserInfo
)