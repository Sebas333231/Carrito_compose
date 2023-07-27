package com.example.carrito.componentes

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Spa
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableInferredTarget
import androidx.compose.runtime.InternalComposeApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.carrito.R

@Composable
fun NavBar(
    modifier: Modifier = Modifier
){
    NavigationBar(
        modifier = modifier,
        containerColor = Color(0xFF4CAF50)
    ) {
        NavigationBarItem(
            selected = true,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    imageVector = Icons.Default.Spa,
                    contentDescription = null,
                    tint = Color(0xFFFFFFFF)
                )
            },
            label = {
                Text(
                    text = "Home",
                    color = Color(0xFFFFFFFF)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = null,
                    tint = Color(0xFFFFFFFF)
                )
            },
            label = {
                Text(
                    text = "Settings",
                    color = Color(0xFFFFFFFF)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = null,
                    tint = Color(0xFFFFFFFF)
                )
            },
            label = {
                Text(
                    text = "Favorites",
                    color = Color(0xFFFFFFFF)
                )
            }
        )
    }
}

@Composable
fun BotonFlotante(
    modifier: Modifier = Modifier
){
    FloatingActionButton(
        onClick = { /*TODO*/ },
        modifier = modifier,
        containerColor = Color(0xFF4CAF50)
    ) {
        Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Shopping", tint = Color(0xFFFFFFFF))
    }
}

@ExperimentalMaterial3Api
@Composable
fun AppBar(

){
   TopAppBar(
       title = {
           Text(
               text = "Tienda CBA"
           )
       },
       navigationIcon = {
           IconButton(onClick = {}){
               Icon(
                   imageVector = Icons.Filled.Menu,
                   contentDescription = null
               )
           }
       },
       actions = {
          Image(
              painter = painterResource(id = R.drawable.logooo),
              contentDescription = null,
              contentScale = ContentScale.Crop,
              modifier = Modifier.size(36.dp)
          )
       }
   )
}