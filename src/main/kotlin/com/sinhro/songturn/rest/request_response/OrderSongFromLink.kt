package com.sinhro.songturn.rest.request_response

import com.sinhro.songturn.rest.model.SongInfo

class OrderSongFromLinkReqData(
        var roomToken: String? = null,
        var songLink: String? = null,
        var authInfo:String? = null
)

class OrderSongFromLinkRespBody(
        var songInfo: SongInfo? = null
)