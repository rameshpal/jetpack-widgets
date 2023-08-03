package com.example.democompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.democompose.R
import com.example.democompose.screens.Components.ItemDescription
import com.example.democompose.screens.Components.MessageBar
import com.example.democompose.screens.Components.NotificationCounter
import com.example.democompose.screens.Components.getCategoryList


@Preview
@Composable
fun PreviewItem() {

//   List use as recyclerview
    LazyColumn(content = {
        items(getCategoryList()){
                BlogCategory(img = it.img, title = it.title, subTitle = it.subTitle)
        }
    })

//    first way to use normal list
   /* Column(modifier = Modifier.verticalScroll(rememberS)) {
        getCategoryList().map {
            BlogCategory(img = it.img, title = it.title, subTitle = it.subTitle)
        }
    }*/
}


@Composable
fun BlogCategory(img: Int, title: String, subTitle: String) {
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        ),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {

            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                Modifier
                    .size(48.dp)
                    .padding(5.dp)
                    .weight(.2f)
            )

            ItemDescription(
                title, subTitle,
                Modifier.Companion.weight(.8f, false)
            )
        }
    }
}


@Composable
fun NotificationScreen() {
    val count: MutableState<Int> = remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxWidth(1f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        NotificationCounter(count.value) { count.value++ }
        MessageBar(count.value)
    }
}


