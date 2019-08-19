package com.example.footbalmatch.api

import com.example.footbalmatch.BuildConfig

object TheSportDBApi {
    fun getLastMatch(lastmatch: String?): String{
        return BuildConfig.BASE_URL +"api/v1/json/${BuildConfig.TSDB_API_KEY}" + "/eventslast.php?id=" + lastmatch
    }
}