package com.messenger.kotlinmessenger.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class User(val uid: String, val username: String, val profileImageurl: String): Parcelable{
    constructor(): this("","","")
}
