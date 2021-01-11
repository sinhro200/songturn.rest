package com.sinhro.songturn.rest.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

class SongInfo(
        var name: String? = null,
        var artist: String? = null,
        var link: String? = null,
        var duration: Int? = null,
        @JsonProperty("expires_at")
        var expiresAt: LocalDateTime? = null,
) {
    companion object
}