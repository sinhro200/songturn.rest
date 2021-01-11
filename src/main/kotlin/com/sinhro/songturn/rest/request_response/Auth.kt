package com.sinhro.songturn.rest.request_response

import com.sinhro.songturn.rest.model.FullUserInfo


class AuthReqData(
    var login: String? = null,
    var password: String? = null
)

class AuthRespBody(
        var fullUserInfo: FullUserInfo? = null,
        var accessToken: String? = null
)