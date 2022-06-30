package com.example.playandroid.common.base

import java.io.Serializable

data class BaseResponse<out T>(
    val errorMsg: String,
    val errorCode: Int,
    val data: T
) : Serializable
