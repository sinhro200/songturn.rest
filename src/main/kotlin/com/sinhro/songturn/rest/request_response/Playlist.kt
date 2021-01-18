package com.sinhro.songturn.rest.request_response

import com.fasterxml.jackson.annotation.JsonProperty
import com.sinhro.songturn.rest.model.PlaylistInfo
import com.sinhro.songturn.rest.model.SongInfo

class GetPlaylistsReqData(
        val roomToken: String = ""
)

class GetPlaylistsRespBody(
        val playlists: List<PlaylistInfo>
)

class ListenPlaylistReqData(
        val roomToken: String = "",
        val playlistTitle: String = ""
)

class ListenPlaylistRespBody(
        val playlist: PlaylistInfo
)

class StopListenPlaylistReqData(
        val roomToken: String = "",
        val playlistTitle: String = ""
)

class StopListenPlaylistRespBody(
        val playlist: PlaylistInfo
)