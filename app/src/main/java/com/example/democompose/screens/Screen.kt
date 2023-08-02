package com.example.democompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.democompose.R

@Composable
fun BlogCategory(){
 Card(elevation = CardDefaults.cardElevation(
     defaultElevation = 8.dp),
     modifier = Modifier.padding(8.dp)) {

     Row(verticalAlignment = Alignment.CenterVertically,
        modifier= Modifier.padding(8.dp)) {

         Image(painter = painterResource(id = R.drawable.user),
             contentDescription = "",
             Modifier
                 .size(48.dp)
                 .padding(5.dp)
                 .weight(.2f))

         Column(verticalArrangement = Arrangement.SpaceBetween,
             modifier = Modifier.weight(.8f,false)) {

             Text(text = "Programming",
                 fontWeight = FontWeight.Bold
             )

             Text(text = "Learn Different Languages",
                 fontWeight = FontWeight.Thin,
                 fontSize = 12.sp
             )
         }
     }
 }
}