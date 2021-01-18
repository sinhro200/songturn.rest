package com.sinhro.songturn.rest.model

class RoomActionInfo(
        val roomActionType: RoomActionType
)


enum class RoomActionType(
        val code: Int
) {
    PLAYLIST_SONGS_UPDATED(1),
    PLAYLIST_INFO_UPDATED(2),
    ROOM_INFO_UPDATED(3),
    ROOM_USERS_UPDATED(4),

    ;

    companion object {
        fun usingCode(code: Int): RoomActionType? = RoomActionType.values().find { it.code == code }
    }
}