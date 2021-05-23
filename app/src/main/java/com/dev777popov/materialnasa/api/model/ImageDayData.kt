package com.dev777popov.materialnasa.api.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ImageDayData(
    val copyright: String?,
    val date: String?,
    val explanation: String?,
    val media_type: String?,
    val title: String?,
    val url: String?,
    val hdurl: String?
): Parcelable