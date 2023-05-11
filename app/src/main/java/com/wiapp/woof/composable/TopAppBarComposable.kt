package com.wiapp.woof.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.wiapp.woof.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarComposable(){
    TopAppBar(
        modifier = Modifier.padding(start = 15.dp, top = 5.dp, bottom = 5.dp),
        title = { Text(text = "Woof")},
        navigationIcon = { Image(painter = painterResource(id = R.drawable.ic_woof_logo), contentDescription = null)}
    )
}