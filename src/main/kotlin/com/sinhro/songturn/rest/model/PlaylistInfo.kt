package com.sinhro.songturn.rest.model

class PlaylistInfo(
        val id: Int,
        val title: String,
        val description: String,
        val roomId: Int,
        val currentSongId: Int? = null,
        val listenerId: Int? = null

) {
    companion object
}