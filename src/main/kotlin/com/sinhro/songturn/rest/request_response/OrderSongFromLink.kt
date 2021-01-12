package com.sinhro.songturn.rest.request_response

import com.fasterxml.jackson.annotation.JsonProperty
import com.sinhro.songturn.rest.model.SongInfo

class OrderSongFromLinkReqData(
        @JsonProperty("room_token")
        var roomToken: String? = null,
        @JsonProperty("song_link")
        var songLink: String? = null,
        @JsonProperty("music_service_auth_info")
        var authInfo:String? = null
)

class OrderSongFromLinkRespBody(
        @JsonProperty("song_info")
        var songInfo: SongInfo? = null
)