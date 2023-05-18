package com.wiapp.woof.composable

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.wiapp.woof.model.CategoryDatas

@Composable
fun WoofAppCard(categoryData: CategoryDatas) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .animateContentSize(animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
            ))
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(5.dp),
    ) {
        Row() {
            Image(
                painter = painterResource(id = categoryData.dogImg),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(5.dp)
                    .size(64.dp)
                    .clip(CircleShape)
            )
            Column(
                modifier = Modifier
                    .width(250.dp)
                    .padding(start = 5.dp, top = 5.dp),
                    //.size(64.dp),
                verticalArrangement = Arrangement.aligned(Alignment.CenterVertically)
            ) {
                Text(
                    text = stringResource(id = categoryData.dogName),
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = stringResource(id = categoryData.dogAge),
                    style = MaterialTheme.typography.bodyMedium
                )
                if (expanded){
                    Column(
                        modifier = Modifier
                            .padding(top = 10.dp, bottom = 10.dp)
                    ) {

                        Text(
                            text = stringResource(id = categoryData.titleAbout),
                            style = MaterialTheme.typography.titleSmall
                        )
                        Text(
                            text = stringResource(id = categoryData.dogAbout),
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.weight(1f))
            Row(
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(65.dp),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                DogItemButton(
                    expanded = false,
                    onClick = {expanded = !expanded}
                )
            }
        }
    }
}

