package com.example.playandroid.api

import com.example.playandroid.common.base.BaseResponse
import com.example.playandroid.ui.home.bean.BannerBean
import retrofit2.http.GET

interface Api {
    /**
     *首页banner
     */
    @GET(HttpsApi.banner)
    suspend fun getBannerJson(): BaseResponse<List<BannerBean>>
}