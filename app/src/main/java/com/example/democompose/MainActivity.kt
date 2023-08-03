package com.example.democompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.democompose.screens.NotificationScreen
import com.example.democompose.screens.PreviewItem


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewItem()
//            NotificationScreen()
        }
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun PreviewFunction() {
        NotificationScreen()
//        TextView()

        // Text field handliing
        /*    Column(modifier = Modifier.padding(8.dp)) {
                TextInput(Color.Black,5,"Enter your email")
                Spacer(modifier = Modifier.padding(8.dp))
                TextInput(Color.Red,10,"Enter your password")
            }*/

//        Linear Layout vertical reference in compose
        /* Column(verticalArrangement = Arrangement.SpaceEvenly,
             horizontalAlignment = Alignment.CenterHorizontally) {
             Text(text = "A", fontSize = 20.sp)
             Text(text = "B", fontSize = 20.sp)
         }*/

        // List Items in compose
        /*Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            ListViewItem(R.drawable.user,"Ramesh Pal","Software Developer")
            ListViewItem(R.drawable.user,"Jetpack","Software Developer")
            ListViewItem(R.drawable.user,"Ramesh Pal","Software Developer")
            ListViewItem(R.drawable.user,"Jetpack","Software Developer")
            ListViewItem(R.drawable.user,"Ramesh Pal","Software Developer")
            ListViewItem(R.drawable.user,"Jetpack","Software Developer")
            ListViewItem(R.drawable.user,"Ramesh Pal","Software Developer")
            ListViewItem(R.drawable.user,"Jetpack","Software Developer")
        }*/

        /*check how to use card in compose functions*/
//        BlogCategory()
    }

    @Composable
    fun TextView() {
        Text(
            text = "Hello World",
            fontWeight = FontWeight.Bold,
            fontSize = 21.sp
        )
    }

    // this example contains row column ui concept
    @Composable
    fun ListViewItem(imgId: Int, name: String, occupation: String) {
        Row(Modifier.padding(8.dp)) {
            Image(
                painter = painterResource(id = imgId),
                contentDescription = "",
                Modifier.size(40.dp)
            )

            Spacer(modifier = Modifier.padding(4.dp))

            Column(verticalArrangement = Arrangement.SpaceBetween) {
                Text(
                    text = name,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = occupation,
                    fontWeight = FontWeight.Thin,
                    fontSize = 12.sp
                )
            }
        }
    }

    //parameterized composable function
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun TextInput(borderColor: Color, borderRadius: Int, label: String) {
        val state = remember { mutableStateOf("") }
        TextField(
            modifier = Modifier
                .border(
                    BorderStroke(1.dp, color = borderColor),
                    shape = RoundedCornerShape(borderRadius)
                )
                .fillMaxWidth()
                .height(50.dp),
            label = { Text(text = label) },
            value = state.value,
            onValueChange = {
                state.value = it
            },
        )
    }

}


