package com.sinhro.songturn.rest.model

import com.fasterxml.jackson.annotation.JsonProperty

class RoomInfo(
        var title: String? = null,
        @JsonProperty("invite_code")
        var inviteCode: String? = null,
        @JsonProperty("room_token")
        var roomToken: String? = null,
        @JsonProperty("owner_id")
        var ownerId: Int? = null
) {
    companion object
}