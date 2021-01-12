package com.sinhro.songturn.rest.request_response

import com.fasterxml.jackson.annotation.JsonProperty
import com.sinhro.songturn.rest.model.RoomInfo
import com.sinhro.songturn.rest.validation.MinMaxLength
import com.sinhro.songturn.rest.validation.NotNull

//### Create Room
class CreateRoomReqData(
        @field:[MinMaxLength(5, 50) NotNull]
        var title: String? = null
)

class CreateRoomRespBody(
        @JsonProperty("room_info")
        var roomInfo: RoomInfo? = null
)

//### Enter Room
class EnterRoomReqData(
        @JsonProperty("invite_code")
        var inviteCode: String? = null
)

class EnterRoomRespBody(
        @JsonProperty("room_info")
        var roomInfo: RoomInfo? = null
)

//### Remove Room
class RemoveRoomReqData(
        @JsonProperty("invite_or_token")
        var inviteOrToken: String? = null
)

class RemoveRoomRespBody(
        @JsonProperty("count_removed_rooms")
        var countRemovedRooms: Int? = null
)

//### Get Rooms

//request using GET method

class OwnedRoomsRespBody (
    var rooms: List<RoomInfo>? = null
)
