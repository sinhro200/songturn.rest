package com.sinhro.songturn.rest.model

//class PlaylistInfo(
//        val id: Int = 0,
//        val title: String = "",
//        val description: String = "",
//        val roomId: Int = 0,
//        val currentSongId: Int? = null,
//        val listenerId: Int? = null
//
//) {
//    companion object
//}

class PlaylistInfo(
        val id: Int = 0,
        val title: String = "",
        val description: String = "",
        val roomId: Int = 0,
        val listenerId: Int? = null
) {
    companion object
}

class PlaylistSongs(
        val songsNotInQueue: List<SongInfo> = listOf(),
        val currentSong: SongInfo? = null,
        val songsInQueue: List<SongInfo> = listOf(),
) {
    companion object
}

class PlaylistSongsVoted(
        val songsNotInQueue: List<SongInfoVoted> = listOf(),
        val currentSong: SongInfoVoted? = null,
        val songsInQueue: List<SongInfoVoted> = listOf(),
) {
    companion object
}