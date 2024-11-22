package com.jetbrains.mula.strings

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.jetbrains.kmpapp.R

object LocalizedStrings {
    @Composable
    fun appName() = stringResource(R.string.app_name)
    @Composable
    fun labelTitle() = stringResource(R.string.label_title)
    @Composable
    fun labelArtist() = stringResource(R.string.label_artist)
    @Composable
    fun labelDate() = stringResource(R.string.label_date)
    @Composable
    fun labelDimensions() = stringResource(R.string.label_dimensions)
    @Composable
    fun labelMedium() = stringResource(R.string.label_medium)
    @Composable
    fun labelDepartment() = stringResource(R.string.label_department)
    @Composable
    fun labelRepository() = stringResource(R.string.label_repository)
    @Composable
    fun labelCredits() = stringResource(R.string.label_credits)
    @Composable
    fun back() = stringResource(R.string.back)
    @Composable
    fun noDataAvailable() = stringResource(R.string.no_data_available)
}
