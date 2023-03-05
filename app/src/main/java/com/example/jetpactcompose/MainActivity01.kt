package com.example.jetpactcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity01 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard("My Android")
        }

        @Composable
        fun MessageCard(name:String){
            Text(text = "Hello $name!")
        }


    }

    @Composable
    private fun MessageCard(s: String) {
            Text(text = "Helllo $s!")
    }
    //预览函数是不能带参数的
    @Preview
    @Composable
    fun PreviewMessageCard(){
        MessageCard("Android")
    }
}

