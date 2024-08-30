package com.example.littlelemon2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GridCell(){
    Card(elevation = 16.dp,modifier = Modifier.padding(8.dp)) {
        Box(modifier = Modifier
            .size(100.dp, 180.dp)
            .padding(8.dp))
        {
            Image(painter = painterResource(id = R.drawable.greeksalad), contentDescription = "Greek Salad", Modifier.height(150.dp))
            Text(text = "Greek Salad", fontSize = 18.sp, fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
                    .background(Color.White)
                    .align(
                        Alignment.TopStart
                    ))
            Text(text = "$ 12.99", fontSize = 18.sp, fontWeight = FontWeight.Bold,
            modifier = Modifier
                .background(Color.White)
                .padding(start = 4.dp, end = 4.dp)
                .align(Alignment.BottomEnd))
        }
        
    }
}

@Composable
fun MenuGrid(){
    Column(modifier=Modifier.verticalScroll(state = rememberScrollState())) {
        repeat(10) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                repeat(2){
                    GridCell()
                }
            }
        }
    }
}