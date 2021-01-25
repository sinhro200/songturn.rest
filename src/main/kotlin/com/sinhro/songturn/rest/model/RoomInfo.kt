package com.sinhro.songturn.rest.model

class RoomInfo(
        val title: String = "",
        val inviteCode: String = "",
        val roomToken: String = "",
        val ownerId: Int = 0,
        val roomSettings: RoomSettings = RoomSettings()
) {
    companion object
}

class RoomSettings(
        val priorityRarelyOrderingUsers: Boolean = false,
        val allowVotes: Boolean = false,
        val songOwnersVisible: Boolean = false,
        val anyCanListen: Boolean = false
){
    companion object
}