package com.sinhro.songturn.rest.model

import java.time.LocalDateTime

class SongInfo(
        val title: String = "",
        val artist: String = "",
        val duration: Int = 0,
        val link: String? = null,
        val expiresAt: LocalDateTime? = null,
        val userId: Int? = null
) {
    companion object
}