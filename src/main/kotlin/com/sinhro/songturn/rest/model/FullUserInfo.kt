package com.sinhro.songturn.rest.model

import com.fasterxml.jackson.annotation.JsonProperty

class FullUserInfo(
        var id: Int? = null,
        var login: String? = null,
        var email: String? = null,
        @JsonProperty("first_name")
        var firstName: String? = null,
        @JsonProperty("last_name")
        var lastName: String? = null,
        var nickname: String? = null
){
    companion object
}