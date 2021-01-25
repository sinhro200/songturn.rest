package com.sinhro.songturn.rest.core

import com.sinhro.songturn.rest.ErrorCodes

open class CommonError(
        var errorCode: ErrorCodes = ErrorCodes.INTERNAL_SERVER_EXC,
        var message: String? = null,
        var description: String? = null,
        var extra: Any? = null
) {
    override fun toString(): String {
        return "${errorCode.toString()}, $message, $description, ${extra.toString()}"
    }
}