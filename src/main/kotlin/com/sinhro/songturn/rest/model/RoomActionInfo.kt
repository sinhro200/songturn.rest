package com.sinhro.songturn.rest.model

class RoomActionInfo(
        val needUpdate: RoomActionType
)

enum class RoomActionType(
        val code: Int
) {
    PLAYLIST_SONGS(1),
    PLAYLIST_INFO(2),
    PLAYLIST_CURRENT_PLAYING_SONG(3),
    ROOM_INFO(101),
    ROOM_USERS(102),

    ;

    companion object {
        fun usingCode(code: Int): RoomActionType? = RoomActionType.values().find { it.code == code }
    }
}