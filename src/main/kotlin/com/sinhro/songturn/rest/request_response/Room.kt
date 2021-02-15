package com.sinhro.songturn.rest.request_response

import com.sinhro.songturn.rest.model.*
import com.sinhro.songturn.rest.validation.MAX_LENGTH_ROOM_TITLE
import com.sinhro.songturn.rest.validation.MIN_LENGTH_ROOM_TITLE
import com.sinhro.songturn.rest.validation.MinMaxLength
import com.sinhro.songturn.rest.validation.NotNull

//### Create Room
class CreateRoomReqData(
        @field:[MinMaxLength(MIN_LENGTH_ROOM_TITLE, MAX_LENGTH_ROOM_TITLE) NotNull]
        val title: String = "",
        val roomSettings: RoomSettings? = null
)

class CreateRoomRespBody(
        val roomInfo: RoomInfo = RoomInfo()
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

//### What should update
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

//### Room Info
class RoomInfoReqData(
        val roomToken: String = ""
)

//### Full Room Info

class FullRoomInfoRespBody(
        val roomInfo: RoomInfo,
        val usersInRoom: List<PublicUserInfo>,
        val playlists: List<PlaylistInfo>,
        val playlistSongs: Map<Int, PlaylistSongs>
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
