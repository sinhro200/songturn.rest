package com.sinhro.songturn.rest.model

import com.sinhro.songturn.rest.validation.Contains
import com.sinhro.songturn.rest.validation.MinMaxLength
import com.sinhro.songturn.rest.validation.NotContains

class RegisterUserInfo(

        @field:[MinMaxLength(5, 50) NotContains("@.")]
        val login: String = "",

        @field:[MinMaxLength(1, 90) Contains("@.")]
        val email: String = "",

        @field:MinMaxLength(2, 50)
        val firstName: String = "",

        @field:MinMaxLength(2, 50)
        val lastName: String = "",

        @field:[MinMaxLength(5, 50)]
        val nickname: String = "",

        @field:[MinMaxLength(5, 50)]
        val rawPassword: String = ""
) {
    companion object
}

open class FullUserInfo(
        id: Int = 0,
        val login: String = "",
        val email: String = "",
        firstName: String = "",
        lastName: String = "",
        nickname: String = ""
) : PublicUserInfo(id, firstName, lastName, nickname) {
    companion object
}

open class PublicUserInfo(
        val id: Int = 0,
        val firstName: String = "",
        val lastName: String = "",
        val nickname: String = ""
) {
    companion object
}