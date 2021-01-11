package com.sinhro.songturn.rest.core

import java.lang.RuntimeException

class CommonException : RuntimeException {
    val commonError: CommonError


    constructor(commonError: CommonError, message: String, cause: Throwable)
            : super(message, cause) {
        this.commonError = commonError
    }

    constructor(commonError: CommonError, message: String)
            : super(message) {
        this.commonError = commonError
    }

    constructor(commonError: CommonError)
            : this(commonError, commonError.message.toString())

    constructor(commonError: CommonError, cause: Throwable)
            : this(commonError, commonError.message.toString(), cause)

    override fun toString(): String {
        return "CommonError: $commonError \nCommonException: ${message} , ${cause}"
    }
}