package com.sinhro.songturn.rest.request_response

import com.sinhro.songturn.rest.model.RoomInfo

class EnterRoomReqData(
        var inviteCode: String? = null
)

class EnterRoomRespBody(
        var roomInfo: RoomInfo? = null
)