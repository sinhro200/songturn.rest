package com.sinhro.songturn.rest.model

class RoomActionInfo(
        val needUpdate: RoomActionType
)

enum class RoomActionType(
        val code: Int
) {
    PLAYLIST_SONGS(1),
    PLAYLIST_INFO(2),
    ROOM_INFO(3),
    ROOM_USERS(4),

    ;

    companion object {
        fun usingCode(code: Int): RoomActionType? = RoomActionType.values().find { it.code == code }
    }
}