package com.sinhro.songturn.rest.request_response

import com.sinhro.songturn.rest.model.RoomInfo
import com.sinhro.songturn.rest.validation.MinMaxLength
import com.sinhro.songturn.rest.validation.NotNull

class CreateRoomReqData(
        @field:[MinMaxLength(5, 50) NotNull]
        var title: String? = null
)

class CreateRoomRespBody(
        var roomInfo: RoomInfo? = null
)