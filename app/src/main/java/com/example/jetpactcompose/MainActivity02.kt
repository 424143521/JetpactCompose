package com.example.jetpactcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity02 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //会在模拟器显示
        setContent {
            MessageCard(msg = Message("Andoird","Jetpack Compose "))
        }

        @Composable
        fun MessageCard(name:String){

            Text(text = "Hello $name!")
        }


    }
    @Composable
    private fun MessageCard(msg: Message) {
        Row() {
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
            Column {
                Text(text = "${msg.author}")
                Text(text = "${msg.body}")

            }
        }

    }

    //预览函数是不能带参数的
    @Preview
    @Composable
    fun PreviewMessageCard(){
        MessageCard(msg = Message("Andoird","Jetpack Compose "))
    }
}
data class Message(val author:String,val body:String )
