package com.sinhro.songturn.rest.model

class PlaylistInfo(
        val id: Int = 0,
        val title: String = "",
        val description: String = "",
        val roomId: Int = 0,
        val currentSongId: Int? = null,
        val listenerId: Int? = null

) {
    companion object
}