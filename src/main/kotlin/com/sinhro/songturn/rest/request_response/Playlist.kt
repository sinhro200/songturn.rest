package com.sinhro.songturn.rest.request_response

import com.sinhro.songturn.rest.model.PlaylistInfo
import com.sinhro.songturn.rest.model.SongInfo

class GetPlaylistsReqData(
        val roomToken: String = ""
)

class GetPlaylistsRespBody(
        val playlists: List<PlaylistInfo> = listOf<PlaylistInfo>()
)

class ListenPlaylistReqData(
        val roomToken: String = "",
        val playlistTitle: String = ""
)

class ListenPlaylistRespBody(
        val playlist: PlaylistInfo
)

//### Stop listen
class StopListenPlaylistReqData(
        val roomToken: String = "",
        val playlistTitle: String = ""
)

class StopListenPlaylistRespBody(
        val playlist: PlaylistInfo
)

//### SetCurrentPlaying
class SetCurrentPlayingSongReqData(
        val roomToken: String = "",
        val playlistTitle: String = "",
        val songId: Int
)

class SetCurrentPlayingSongRespBody(
        val playlistInfo: PlaylistInfo
)

//### CurrentPlaying
class CurrentPlayingSongReqData(
        val roomToken: String = "",
        val playlistTitle: String = ""
)

class CurrentPlayingSongRespBody(
        val songInfo: SongInfo?
)
