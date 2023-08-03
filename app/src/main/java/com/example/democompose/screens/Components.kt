package com.example.democompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.democompose.R

object Components {

    @Composable
    fun MessageBar(value: Int) {
        Card(elevation = CardDefaults.cardElevation(5.dp), modifier = Modifier.padding(0.dp, 10.dp)) {
            Row(
                modifier = Modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = "",
                    modifier = Modifier.padding(5.dp)
                )

                Text(text = "You have sent $value notification")
            }
        }
    }

    @Composable
    fun NotificationCounter(value: Int, increment: () -> Unit) {
        Column(verticalArrangement = Arrangement.Center) {
            Text(text = "You have sent $value notification")
            Button(onClick = {
                increment()
            }) {
                Text(text = "Send Notification")
            }
        }
    }

    @Composable
    fun ItemDescription(title: String, subTitle: String, modifier: Modifier) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
        ) {

            Text(
                text = title,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = subTitle,
                fontWeight = FontWeight.Thin,
                fontSize = 12.sp
            )
        }
    }


    data class Category(val img: Int, val title: String, val subTitle: String)

    fun getCategoryList(): MutableList<Category> {
        val list = mutableListOf<Category>()
        list.add(Category(R.drawable.user, "Programming", "Learn Different Languages"))
        list.add(Category(R.drawable.user, "HTML & CSS", "Learn HTML & CSS Languages"))
        list.add(Category(R.drawable.user, "JAVA", "Learn JAVA Languages"))
        list.add(Category(R.drawable.user, "Angular", "Learn Angular Languages"))
        list.add(Category(R.drawable.user, "Android", "Learn Android Languages"))
        list.add(Category(R.drawable.user, "Node Js", "Learn Node Js Languages"))
        list.add(Category(R.drawable.user, "Python", "Learn Python Languages"))
        list.add(Category(R.drawable.user, "Dot Net", "Learn Dot Net Languages"))
        list.add(Category(R.drawable.user, "Programming", "Learn Different Languages"))
        list.add(Category(R.drawable.user, "HTML & CSS", "Learn HTML & CSS Languages"))
        list.add(Category(R.drawable.user, "JAVA", "Learn JAVA Languages"))
        list.add(Category(R.drawable.user, "Angular", "Learn Angular Languages"))
        list.add(Category(R.drawable.user, "Android", "Learn Android Languages"))
        list.add(Category(R.drawable.user, "Node Js", "Learn Node Js Languages"))
        list.add(Category(R.drawable.user, "Python", "Learn Python Languages"))
        list.add(Category(R.drawable.user, "Dot Net", "Learn Dot Net Languages"))
        list.add(Category(R.drawable.user, "Programming", "Learn Different Languages"))
        list.add(Category(R.drawable.user, "HTML & CSS", "Learn HTML & CSS Languages"))
        list.add(Category(R.drawable.user, "JAVA", "Learn JAVA Languages"))
        list.add(Category(R.drawable.user, "Angular", "Learn Angular Languages"))
        list.add(Category(R.drawable.user, "Android", "Learn Android Languages"))
        list.add(Category(R.drawable.user, "Node Js", "Learn Node Js Languages"))
        list.add(Category(R.drawable.user, "Python", "Learn Python Languages"))
        list.add(Category(R.drawable.user, "Dot Net", "Learn Dot Net Languages"))
        list.add(Category(R.drawable.user, "Programming", "Learn Different Languages"))
        list.add(Category(R.drawable.user, "HTML & CSS", "Learn HTML & CSS Languages"))
        list.add(Category(R.drawable.user, "JAVA", "Learn JAVA Languages"))
        list.add(Category(R.drawable.user, "Angular", "Learn Angular Languages"))
        list.add(Category(R.drawable.user, "Android", "Learn Android Languages"))
        list.add(Category(R.drawable.user, "Node Js", "Learn Node Js Languages"))
        list.add(Category(R.drawable.user, "Python", "Learn Python Languages"))
        list.add(Category(R.drawable.user, "Dot Net", "Learn Dot Net Languages"))

        return list
    }

}