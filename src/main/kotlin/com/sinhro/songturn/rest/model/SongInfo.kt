package com.sinhro.songturn.rest.model

import java.util.*

class SongInfo(
        val id: Int = 0,
        val title: String = "",
        val artist: String = "",
        val durationSeconds: Int = 0,
        val link: String? = null,
        val expiresAt: Date? = null,
        val userId: Int? = null
) {
    override fun toString(): String {
        return "[$id, $title, $artist, $durationSeconds, $link, $expiresAt, $userId]"
    }

    companion object
}

class SongInfoVoted (
    val songInfo: SongInfo = SongInfo(),
    val action: Int = 0
){
    companion object
}