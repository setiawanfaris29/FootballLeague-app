package com.example.footbalmatch.api.model

import com.google.gson.annotations.SerializedName

class modelItemLastEvent (
    @SerializedName("idEvent")
    var eventId : String? = null,

    @SerializedName("strEvent")
    var strEvent : String? = null,

    @SerializedName("intHomeScore")
    var intHomeScore : String? = null,

    @SerializedName("intAwayScore")
    var intAwayScore: String? = null



)