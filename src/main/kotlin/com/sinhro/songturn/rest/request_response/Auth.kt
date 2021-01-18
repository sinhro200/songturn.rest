package com.sinhro.songturn.rest.request_response

import com.sinhro.songturn.rest.model.FullUserInfo


class AuthReqData(
        val login: String = "",
        val password: String = ""
)

class AuthRespBody(
        val userInfo: FullUserInfo,
        val accessToken: String
)