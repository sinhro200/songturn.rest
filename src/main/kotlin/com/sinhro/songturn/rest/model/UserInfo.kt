package com.sinhro.songturn.rest.model

import com.sinhro.songturn.rest.validation.*

class RegisterUserInfo(
        @field:[MinMaxLength(MIN_LENGTH_LOGIN, MAX_LENGTH_LOGIN) NotContains("@.")]
        val login: String = "",

        @field:[MinMaxLength(MIN_LENGTH_EMAIL, MAX_LENGTH_EMAIL) Contains("@.") CanBeEmpty]
        val email: String = "",

        @field:[MinMaxLength(MIN_LENGTH_FIRST_NAME, MAX_LENGTH_FIRST_NAME ) CanBeEmpty]
        val firstName: String = "",

        @field:[MinMaxLength(MIN_LENGTH_LAST_NAME, MAX_LENGTH_LAST_NAME) CanBeEmpty]
        val lastName: String = "",

        @field:[MinMaxLength(MIN_LENGTH_NICKNAME, MAX_LENGTH_NICKNAME)]
        val nickname: String = "",

        @field:[MinMaxLength(MIN_LENGTH_PASSWORD, MAX_LENGTH_PASSWORD)]
        val rawPassword: String = ""
) {
    companion object
}

class RegisterDemoUserInfo(
        @field:[MinMaxLength(MIN_LENGTH_LOGIN, MAX_LENGTH_LOGIN) NotContains("@.")]
        val login: String = "",
        @field:[MinMaxLength(MIN_LENGTH_NICKNAME, MAX_LENGTH_NICKNAME)]
        val nickname: String = ""
) {
    companion object
}

open class FullUserInfo(
        id: Int = 0,
        val login: String = "",
        val email: String = "",
        firstName: String = "",
        lastName: String = "",
        nickname: String = "",
        val isDemo: Boolean = true
) : PublicUserInfo(id, firstName, lastName, nickname) {
    override fun toString(): String {
        return "$id, $login, $email, $firstName, $lastName, $nickname"
    }

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