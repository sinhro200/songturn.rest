package com.sinhro.songturn.rest.model

import java.time.LocalDateTime

class SongInfo(
        val id : Int = 0,
        val title: String = "",
        val artist: String = "",
        val durationSeconds: Int = 0,
        val link: String? = null,
        //через сколько, а не когда
        val expiresAt: LocalDateTime? = null,
        val userId: Int? = null
) {
    companion object
}