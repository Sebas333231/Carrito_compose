package com.example.carrito.componentes

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carrito.R
import com.example.carrito.ui.theme.CarritoTheme

@Composable
fun PopularesCollections(
    @DrawableRes drawable: Int,
    @StringRes text: Int,
    modifier: Modifier
){
    Surface(
        shape = MaterialTheme.shapes.small,
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.width(192.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = drawable),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(210.dp)
                    .width(350.dp)
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = stringResource(id = text),
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier.paddingFromBaseline(
                    top = 24.dp, bottom = 8.dp
                ),
            )
        }
    }
}

@Composable
fun PopularesCard(
    modifier: Modifier = Modifier
){
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier.height(800.dp),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ){
        items(collections){item ->
            PopularesCollections(
                drawable = item.drawable,
                text = item.text,
                modifier = Modifier.height(250.dp).width(150.dp)
            )
        }
    }
}




private val collections = listOf(
    R.drawable.pizza to R.string.pizza,
    R.drawable.hamburguesa to R.string.ham,
    R.drawable.pan to R.string.pan,
    R.drawable.corona to R.string.corona,
    R.drawable.whiskies to R.string.whiskies,
    R.drawable.salchipapas to R.string.salchi
).map { Datos(it.first, it.second) }

data class Datos(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int,
)

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun HomeSection2(){
    CarritoTheme {
        Section(title = R.string.Populares) {
            PopularesCard()
        }
    }
}