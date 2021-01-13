package com.sinhro.songturn.rest.model

import com.fasterxml.jackson.annotation.JsonProperty

class PlaylistInfo(
        var id: Int? = null,
        var title: String? = null,
        var description: String? = null,
        @JsonProperty("room_id")
        var roomId: Int? = null,
        @JsonProperty("current_song_id")
        var currentSongId: Int? = null,
        @JsonProperty("listener_id")
        var listenerId: Int? = null

) {
    companion object
}