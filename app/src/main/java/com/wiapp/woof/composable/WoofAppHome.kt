package com.wiapp.woof.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import com.wiapp.woof.data.DataSource

@Composable
fun WoofAppHome(paddingValues: PaddingValues) {
    WoofAppList(categoryDatas = DataSource().loadDataSource())
}