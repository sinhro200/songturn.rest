package com.sinhro.songturn.rest.core

import com.fasterxml.jackson.annotation.JsonProperty
import com.sinhro.songturn.rest.ErrorCodes

open class CommonError(
        @JsonProperty("ERROR_CODE")
        var ecode: ErrorCodes = ErrorCodes.INTERNAL_SERVER_EXC,
        var message: String? = null,
        var description: String? = null,
        var extra: Any? = null
) {
    override fun toString(): String {
        return "${ecode.toString()}, $message, $description, ${extra.toString()}"
    }
}