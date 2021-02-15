package com.sinhro.songturn.rest

enum class ErrorCodes(
        public val type :ErrorTypes
) {
    INTERNAL_SERVER_EXC(ErrorTypes.Internal),
    REQUEST_DATA_EXC(ErrorTypes.Internal),
    NETWORK_TIMEOUT(ErrorTypes.Internal),
    SMTH_WENT_WRONG(ErrorTypes.Internal),
    NET_CONNECTION_ERR(ErrorTypes.Internal),


    LOGIN_IS_USED(ErrorTypes.Internal),
    EMAIL_IS_USED(ErrorTypes.Internal),
    NICKNAME_IS_USED(ErrorTypes.Internal),
    REGISTER_FAILED(ErrorTypes.Internal),

    AUTH_USER_NOT_FOUND(ErrorTypes.Unauthorized),
    AUTH_PASSWORD_INCORRECT(ErrorTypes.Unauthorized),
    AUTH_USER_NOT_VERIFIED(ErrorTypes.Unauthorized),
    AUTH_JWT_EXPIRED(ErrorTypes.Unauthorized),
    AUTH_JWT_INVALID(ErrorTypes.Unauthorized),
    AUTHORIZATION_FAILED(ErrorTypes.Unauthorized),

    AUTH_DONT_HAVE_PERMISSIONS(ErrorTypes.Forbidden),
    BAD_REQUEST(ErrorTypes.Forbidden),

    MUSIC_SERVICE_EXC(ErrorTypes.NimuscMusicServices),
    MUSIC_SERVICE_AUTH(ErrorTypes.NimuscMusicServices),

    NIMUSC_SERVER_EXC(ErrorTypes.NimuscServer),
    NIMUSC_LINK_CONVERTING_BROKEN_LINK(ErrorTypes.NimuscServer),
    NIMUSC_LINK_CONVERTING_SONGS_NOT_FOUND(ErrorTypes.NimuscServer),

    ROOM_NOT_FOUND(ErrorTypes.Forbidden),
    MAX_ROOMS_OWNS(ErrorTypes.Forbidden),
    PLAYLIST_ALREADY_HAS_LISTENER(ErrorTypes.Forbidden),
    PLAYLIST_NOT_FOUND(ErrorTypes.Forbidden),
    USER_NOT_IN_ROOM(ErrorTypes.Forbidden)
;

    companion object

}