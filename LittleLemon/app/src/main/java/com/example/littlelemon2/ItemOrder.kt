package com.example.littlelemon2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ItemOrder(){
    var count by rememberSaveable() {
        mutableStateOf(0)
    }
    ItemScreen(count,{count++},{count--});
}

@Composable
fun ItemScreen(count:Int,onIncrement:()->Unit,onDecrement:()->Unit){

    Column(
        Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally ) {
        Text(text = "Greek Salad", fontSize = 30.sp)
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically){
            IconButton(onClick = { onDecrement() }) {
                Image(painter = painterResource(id = R.drawable.ic_minus), contentDescription = "Remove")
            }
            Text(
                text = "$count",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(8.dp)
            )
            IconButton(onClick = { onIncrement() }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add"
                )
            }
        }
    }
}
