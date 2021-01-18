package com.sinhro.songturn.rest.model

class RoomInfo(
        val title: String,
        val inviteCode: String,
        val roomToken: String,
        val ownerId: Int
) {
    companion object
}