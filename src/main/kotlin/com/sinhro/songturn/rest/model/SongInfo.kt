package com.sinhro.songturn.rest.model

import java.time.LocalDateTime

class SongInfo(
        val name: String,
        val artist: String,
        val link: String,
        val duration: Int,
        val expiresAt: LocalDateTime,
) {
    companion object
}