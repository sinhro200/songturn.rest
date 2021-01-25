package com.sinhro.songturn.rest.request_response

import com.sinhro.songturn.rest.model.SongInfo

class GetSongsReqData(
        val roomToken: String = "",
        val playlistTitle: String = "",
)

class GetSongsRespBody(
        val songs: List<SongInfo> = listOf()
)

class OrderSongReqData(
        val roomToken: String = "",
        val playlistTitle: String = "",
        val songLink: String = "",
        val musicServiceAuthInfo: String = "",
)

class OrderSongRespBody(
        val songInfo: SongInfo = SongInfo()
)

//### Vote for song
class VoteForSongReqData(
        val roomToken: String = "",
        val playlistTitle: String = "",
        val songId: Int = 0,
        val action: Int = 0
)

class VoteForSongRespBody(
        val songInfo: SongInfo = SongInfo()
)