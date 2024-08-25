package com.projects.affirmation_pos2024.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes var stringResourceId:Int,
    @DrawableRes val imageResourceId:Int
)
