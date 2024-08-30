package com.example.littlelemon2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            LazyVerticalGrid(columns = GridCells.Fixed(3)){
//                items(500){
//                    number -> MyGridCell(number)
//                }
//            }
            HomeScreen()
        }
    }
}



@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(){
    val scaffoldState = rememberScaffoldState() //two parameters,'drawer state' for drawer open or close. 'snackbar host state' for snackbars
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        drawerContent = { DrawerPanel(scaffoldState,scope)},
        topBar = {MyTopAppBar(scaffoldState,scope)},

    ) {
        Column {
//            MyTopAppBar()
            UpperPanel()
            LowerPanel()
//            ItemOrder()
        }
    }
}

@Composable
fun MyGridCell(number: Number){
    Card(modifier = Modifier.padding(8.dp), elevation = 20.dp) {
        Box(modifier = Modifier.aspectRatio(1f),
        contentAlignment = Alignment.Center) {
            Text(text = "Item "+number, fontSize = 20.sp)
        }
    }
}

