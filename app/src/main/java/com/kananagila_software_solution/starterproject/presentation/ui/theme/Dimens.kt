package com.kananagila_software_solution.starterproject.presentation.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.Dp
import com.kananagila_software_solution.starterproject.R

object Dimens {
    val PaddingExtraSmall: Dp
        @Composable get() = dimensionResource(id = R.dimen.margin_extra_small)
    val PaddingSmall: Dp
        @Composable get() = dimensionResource(id = R.dimen.margin_small)
    val PaddingMedium: Dp
        @Composable get() = dimensionResource(id = R.dimen.margin_medium)
    val PaddingLarge: Dp
        @Composable get() = dimensionResource(id = R.dimen.margin_large)
}