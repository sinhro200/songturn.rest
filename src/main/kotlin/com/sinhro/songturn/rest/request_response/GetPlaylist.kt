package com.sinhro.songturn.rest.request_response

import com.sinhro.songturn.rest.model.SongInfo

class GetPlaylistReqData(
        var roomToken: String? = null,
        var offset: Int? = null
)

class GetPlaylistRespBody(
        var playlist: List<SongInfo>? = null
)