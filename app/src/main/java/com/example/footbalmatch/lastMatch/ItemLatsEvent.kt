package com.example.footbalmatch.lastMatch

import com.google.gson.annotations.SerializedName

class ItemLatsEvent (
    @SerializedName("idEvent")
    var eventId : String? = null,

    @SerializedName("strEvent")
    var strEvent : String? = null,

    @SerializedName("intHomeScore")
    var intHomeScore : String? = null,

    @SerializedName("intAwayScore")
    var intAwayScore: String? = null



)