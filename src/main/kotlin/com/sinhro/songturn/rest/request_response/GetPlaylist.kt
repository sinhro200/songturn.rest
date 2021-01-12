package com.sinhro.songturn.rest.request_response

import com.fasterxml.jackson.annotation.JsonProperty
import com.sinhro.songturn.rest.model.SongInfo

class GetPlaylistReqData(
        @JsonProperty("room_token")
        var roomToken: String? = null,
        var offset: Int? = null
)

class GetPlaylistRespBody(
        var playlist: List<SongInfo>? = null
)