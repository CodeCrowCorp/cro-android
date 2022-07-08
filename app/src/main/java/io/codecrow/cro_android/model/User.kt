package io.codecrow.cro_android.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User (
    @SerializedName("username")
    @Expose
    var username: String,

    @SerializedName("customUsername")
    @Expose
    var customUsername: String,

    @SerializedName("displayName")
    @Expose
    var displayName: String,

    @SerializedName("avatar")
    @Expose
    var avatar: String
)