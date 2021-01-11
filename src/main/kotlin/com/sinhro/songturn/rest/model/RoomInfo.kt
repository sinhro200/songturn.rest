package com.sinhro.songturn.rest.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.sinhro.songturn.rest.model.FullUserInfo

class RoomInfo(
        var title: String? = null,
        @JsonProperty("invite_code")
        var inviteCode: String? = null,
        @JsonProperty("room_token")
        var roomToken: String? = null,
        var owner: FullUserInfo? = null
) {
    companion object
}