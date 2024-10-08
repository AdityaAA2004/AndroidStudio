package com.example.littlelemon2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun MyTopAppBar(scaffoldState: ScaffoldState?=null, scope: CoroutineScope?=null){
    Row(horizontalArrangement = Arrangement.SpaceBetween,
    modifier = Modifier.fillMaxWidth(),
    verticalAlignment = Alignment.CenterVertically) {
        IconButton(onClick = { scope?.launch { scaffoldState?.drawerState?.open() } }) {//unnecessary nullable safe call.
            Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
        }

        Image(painter = painterResource(id =R.drawable.littlelemon),
            contentDescription = "Logo",
        modifier = Modifier.fillMaxWidth(0.5F).padding(horizontal = 20.dp))

        IconButton(onClick = {}) {
            Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Cart")
        }
    }


}