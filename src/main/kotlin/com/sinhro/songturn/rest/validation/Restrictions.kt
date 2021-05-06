package com.sinhro.songturn.rest.validation

/*
        Patterns not handled, just for future
 */
//          ###     REGISTER DATA


val PATTERN_LOGIN = """[a-zA-Z0-9_\-\+\.]*"""
const val MIN_LENGTH_LOGIN = 2
const val MAX_LENGTH_LOGIN = 50

val PATTERN_PASSWORD = """[a-zA-Z0-9_\-\+\.]*"""
const val MIN_LENGTH_PASSWORD = 5
const val MAX_LENGTH_PASSWORD = 50

val PATTERN_NICKNAME = """[a-zA-Z0-9_\-\+\.]*"""
const val MIN_LENGTH_NICKNAME = 2
const val MAX_LENGTH_NICKNAME = 50

/**
 * Pattern for email is very simple, and does not take into account many situations.
 * But it doesn't matter, its just for study purposes.
 * For checking mail, it is better of course to send a message for confirmation
 */
val PATTERN_EMAIL = """([a-zA-Z0-9_\-\+\.]*)@([a-zA-Z0-9_\-\+\.]*).([a-zA-Z0-9_\-\+\.]*)"""
const val MIN_LENGTH_EMAIL = 3
const val MAX_LENGTH_EMAIL = 80

const val MIN_LENGTH_FIRST_NAME = 2
const val MAX_LENGTH_FIRST_NAME = 50

const val MIN_LENGTH_LAST_NAME = 2
const val MAX_LENGTH_LAST_NAME = 50

//          ###     OTHER DATA
const val MIN_LENGTH_ROOM_TITLE = 3
const val MAX_LENGTH_ROOM_TITLE = 30