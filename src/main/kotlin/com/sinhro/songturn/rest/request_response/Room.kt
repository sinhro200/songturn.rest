package com.sinhro.songturn.rest.request_response

import com.sinhro.songturn.rest.model.PublicUserInfo
import com.sinhro.songturn.rest.model.RoomActionInfo
import com.sinhro.songturn.rest.model.RoomInfo
import com.sinhro.songturn.rest.validation.MinMaxLength
import com.sinhro.songturn.rest.validation.NotNull

//### Create Room
class CreateRoomReqData(
        @field:[MinMaxLength(5, 50) NotNull]
        val title: String = ""
)

class CreateRoomRespBody(
        val roomInfo: RoomInfo
)

//### Enter Room
class EnterRoomReqData(
        val inviteCode: String = ""
)

class EnterRoomRespBody(
        val roomInfo: RoomInfo
)

//### Leave Room
class LeaveRoomReqData(
        val roomToken: String = ""
)

class LeaveRoomRespBody(

)

//### Leave Room
class WhatShouldUpdateReqData(
        val roomToken: String = ""
)

class WhatShouldUpdateRespBody(
        val actions: List<RoomActionInfo>
)

//### Remove Room
class RemoveRoomReqData(
        val inviteOrToken: String = ""
)

class RemoveRoomRespBody(
        val countRemovedRooms: Int
)

//### Users in room
class UsersInRoomReqData(
        val roomToken: String = ""
)

class UsersInRoomRespBody(
        val users: List<PublicUserInfo>
)
//### Get Rooms

//request using GET method

class MyRoomsRespBody(
        val rooms: List<RoomInfo>
)
