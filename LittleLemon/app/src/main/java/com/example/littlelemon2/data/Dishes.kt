package com.example.littlelemon2.data

import com.example.littlelemon2.R

data class Dish(
    val name:String,
    val price: String,
    val description: String,
    val image: Int //note this is because we use the integer ID of the image
    //when we say R.drawable.image
)

val dishes = listOf<Dish>(
    Dish("Greek Salad","$ 12.99","The famous Greek Salad of crispy lettuce, peppers, olives, our Chicago...",  R.drawable.greeksalad),
    Dish("Bruschetta","$11.99","Our Bruschetta is made from grilled bread that has been smeared with garlic....",R.drawable.bruschetta),
    Dish("Lemon Dessert","$9.99","This comes straight from grandma's receipe book, every last ingredient has ...",R.drawable.lemondessert),
    Dish("Greek Salad","$ 12.99","The famous Greek Salad of crispy lettuce, peppers, olives, our Chicago...",  R.drawable.greeksalad),
    Dish("Bruschetta","$11.99","Our Bruschetta is made from grilled bread that has been smeared with garlic....",R.drawable.bruschetta),
    Dish("Lemon Dessert","$9.99","This comes straight from grandma's receipe book, every last ingredient has ...",R.drawable.lemondessert)

)