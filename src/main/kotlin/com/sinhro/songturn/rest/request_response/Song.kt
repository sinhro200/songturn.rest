package com.sinhro.songturn.rest.request_response

import com.sinhro.songturn.rest.model.SongInfo

class GetSongsReqData(
        val roomToken: String = "",
        val playlistTitle: String = "",
)

class GetSongsRespBody(
        val songs: List<SongInfo>
)

class OrderSongReqData(
        val roomToken: String = "",
        val songLink: String = "",
        val musicServiceAuthInfo: String = "",
        val playlistTitle: String = ""
)

class OrderSongRespBody(

)