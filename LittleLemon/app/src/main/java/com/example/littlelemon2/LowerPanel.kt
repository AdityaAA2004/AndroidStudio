package com.example.littlelemon2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon2.data.Categories
import com.example.littlelemon2.data.Dish
import com.example.littlelemon2.data.dishes

@Composable
fun LowerPanel() {
//    Column {
//        WeeklySpecial()
//    }
    Column {
        LazyRow {
            items(Categories){category->
                MenuCategory(category = category)
            }
        }
        Divider(modifier = Modifier.padding(8.dp), thickness = 1.dp, color = Color.Gray)
        LazyColumn {
            items(dishes){
                dishes->
                MenuDish(dishes)
            }
        }
    }
}


@Composable
fun WeeklySpecial(){
    // to be defined
    Card(Modifier.fillMaxWidth()) {
        Text(text = "Weekly Special", fontSize = 26.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(8.dp),color=LittleLemonColor.charcoal)
    }
}


@Composable
fun MenuDish(dishes: Dish) {
    // to be defined
    Card() {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)) {
            Column {
                Text(text = dishes.name, fontSize = 18.sp, fontWeight = FontWeight.Bold,color=LittleLemonColor.charcoal)
                Text(text = dishes.description,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .fillMaxWidth(0.75f)
                        .padding(top = 5.dp, bottom = 5.dp),
                color=LittleLemonColor.green)
                Text(text = "$12.99", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = LittleLemonColor.green)
            }
            Image(painter = painterResource(id = dishes.image), contentDescription = dishes.name)

        }
    }
    Divider(modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        color = LittleLemonColor.yellow,
        thickness = 0.9.dp
    )

}

@Composable
fun MenuCategory(category: String){
    Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
    modifier = Modifier.padding(5.dp), shape = RoundedCornerShape(40)
    ) {
        Text(text = category)        
    }
}

@Preview(showBackground = true)
@Composable
fun LowerPanelPreview(){
    LowerPanel()
}
