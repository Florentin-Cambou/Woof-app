package com.wiapp.woof.composable

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldComposable(){
    Scaffold(
        topBar = { TopAppBarComposable() },
        content = { paddingValues -> WoofAppHome(paddingValues) }
    )
}