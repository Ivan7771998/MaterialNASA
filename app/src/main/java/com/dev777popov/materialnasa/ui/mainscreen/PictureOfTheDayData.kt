package com.dev777popov.materialnasa.ui.mainscreen

import com.dev777popov.materialnasa.api.model.ImageDayData

sealed class PictureOfTheDayData {
    data class Success(val serverResponseData: ImageDayData) : PictureOfTheDayData()
    data class Error(val error: Throwable) : PictureOfTheDayData()
    data class Loading(val progress: Int?) : PictureOfTheDayData()
}
