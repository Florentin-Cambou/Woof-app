package com.wiapp.woof.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.wiapp.woof.data.DataSource

@Composable
fun WoofAppHome(paddingValues: PaddingValues) {
    Surface(
        modifier = Modifier
            .padding(paddingValues)
    ) {
        WoofAppList(categoryDatas = DataSource().loadDataSource())
    }
}