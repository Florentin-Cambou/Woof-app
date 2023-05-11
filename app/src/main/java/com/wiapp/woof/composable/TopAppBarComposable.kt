package com.wiapp.woof.composable

import androidx.compose.foundation.Image
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.wiapp.woof.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarComposable(){
    TopAppBar(
        title = { Text(text = "Woof")},
        navigationIcon = { Image(painter = painterResource(id = R.drawable.ic_woof_logo), contentDescription = null)}
    )
}