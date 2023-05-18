package com.wiapp.woof.composable

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.wiapp.woof.model.CategoryDatas

@Composable
fun WoofAppList(categoryDatas: List<CategoryDatas>) {
    LazyColumn {
        items(categoryDatas) { categoryDatas ->

            WoofAppCard(categoryDatas)
        }
    }
}

