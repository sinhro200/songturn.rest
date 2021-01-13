package com.sinhro.songturn.rest.request_response

import com.fasterxml.jackson.annotation.JsonProperty
import com.sinhro.songturn.rest.model.PlaylistInfo
import com.sinhro.songturn.rest.model.SongInfo

class GetPlaylistsReqData(
        @JsonProperty("room_token")
        var roomToken: String? = null
)

class GetPlaylistsRespBody(
        var playlists: List<PlaylistInfo>? = null
)