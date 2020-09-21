package com.yangbw.libtest.api

import com.yangbw.libtest.common.BaseRes
import com.yangbw.libtest.dialog.coupon.CouponData
import com.yangbw.libtest.module.details.DetailsData
import com.yangbw.libtest.module.discover.hot.HotListData
import com.yangbw.libtest.module.discover.newest.NewestListData
import com.yangbw.libtest.module.discover.recommend.RecommendListData
import com.yangbw.libtest.module.home.BannerInfo
import com.yangbw.libtest.module.home.UpdateVersion
import com.yangbw.libtest.module.login.UserData
import com.yangbw.libtest.module.menu.MenuData
import com.yangbw.libtest.module.mine.MineData
import retrofit2.http.*

/**
 * API接口
 *
 * @author yangbw
 * @date 2020-03-16.
 */
interface ApiService {

    @POST("api/loginByPhone")
    @FormUrlEncoded
    suspend fun loginByPhone(
        @Field("phone") phone: String
    ): BaseRes<UserData>

    @POST("api/sendCode")
    @FormUrlEncoded
    suspend fun sendCode(
        @Field("phone") phone: String
    ): BaseRes<String>

    @POST("api/login")
    @FormUrlEncoded
    suspend fun login(
        @Field("phone") username: String,
        @Field("code") code: String
    ): BaseRes<UserData>

    @GET("api/banners")
    suspend fun banners(): BaseRes<List<BannerInfo>>

    @GET("api/updateVersion")
    suspend fun updateVersion(@Query("versionCode") versonCode: Int): BaseRes<UpdateVersion>

    @GET("api/homeDetails")
    suspend fun homeDetails(@Query("id") id: String): BaseRes<DetailsData>

    @POST("api/userInfo")
    suspend fun userInfo(): BaseRes<MineData>

    @POST("api/discoverHot")
    @FormUrlEncoded
    suspend fun discoverHot(@Field("pageNo") pageNo: Int): BaseRes<List<HotListData>>

    @POST("api/discoverNew")
    @FormUrlEncoded
    suspend fun discoverNew(@Field("pageNo") pageNo: Int): BaseRes<List<NewestListData>>

    @POST("api/discoverRecommend")
    @FormUrlEncoded
    suspend fun discoverRecommend(@Field("pageNo") pageNo: Int): BaseRes<List<RecommendListData>>

    @POST("api/menuList")
    @FormUrlEncoded
    suspend fun menuList(@Field("pageNo") pageNo: Int): BaseRes<List<MenuData>>

    @GET("api/couponList")
    suspend fun couponList(): BaseRes<List<CouponData>>
}