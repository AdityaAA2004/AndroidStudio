package com.example.animationpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.animationpractice.ui.theme.AnimationPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimationPracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    var visible by remember{
        mutableStateOf(true)
    }
    
    Column() {
        AnimatedVisibility(visible = visible,enter= fadeIn(),exit = fadeOut()) {
            Text(text = "Hello World")
        }
        Button(onClick = {visible = !visible}) {
            Text(text = "Button")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AnimationPracticeTheme {
        Greeting()
    }
}