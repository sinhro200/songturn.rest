package com.sinhro.songturn.rest.model

import com.fasterxml.jackson.annotation.JsonProperty

class PublicUserInfo(
        @JsonProperty("first_name")
        var firstName: String? = null,
        @JsonProperty("last_name")
        var lastName: String? = null,
        var nickname: String? = null
) {
    companion object
}