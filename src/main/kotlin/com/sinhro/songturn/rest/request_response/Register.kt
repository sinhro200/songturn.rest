package com.sinhro.songturn.rest.request_response

import com.sinhro.songturn.rest.model.FullUserInfo
import com.sinhro.songturn.rest.model.RegisterDemoUserInfo
import com.sinhro.songturn.rest.model.RegisterUserInfo

public class RegisterReqData(
        val userInfo: RegisterUserInfo = RegisterUserInfo()
)

public class RegisterRespBody(
        val mustConfirmByMail: Boolean = true,
        val message: String = ""
)

public class RegisterDemoReqData(
        val userInfo: RegisterDemoUserInfo = RegisterDemoUserInfo()
)

public class RegisterDemoRespBody(
        val accessToken: String = ""
)