package com.sinhro.songturn.rest.request_response

import com.sinhro.songturn.rest.model.FullUserInfo


class AuthReqData(
        val login: String = "",
        val password: String = ""
)

class AuthRespBody(
        val userInfo: FullUserInfo = FullUserInfo(),
        val accessToken: String = ""
){
    override fun toString(): String {
        return "$userInfo, $accessToken"
    }
}