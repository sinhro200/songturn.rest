package com.sinhro.songturn.rest.core

import com.sinhro.songturn.rest.ErrorCodes

open class CommonResponse<T : Any>(
        var body: T? = null,
        var error: CommonError? = null
){
    public companion object{
        fun buildError(
                code: ErrorCodes,
                message: String,
                description: String? = null,
                extra:Any? = null
        ): CommonResponse<Any> {
            return buildError(CommonError(code,message, description,extra))
        }

        fun buildError(
                ce : CommonError
        ): CommonResponse<Any> {
            return CommonResponse(error = ce)
        }

        fun <T : Any>buildSuccess(
                responseBody:T
        ): CommonResponse<T> {
            val cr = CommonResponse(responseBody)
            cr.body = responseBody
            return cr
        }
    }


}