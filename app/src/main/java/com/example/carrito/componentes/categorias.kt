package com.example.carrito.componentes

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carrito.R
import com.example.carrito.ui.theme.CarritoTheme

@Composable
fun AlignCategorias(
    @DrawableRes drawable: Int,
    @StringRes text: Int
){
    Column(
        modifier = Modifier
    ) {
        Image(
            painter = painterResource(drawable),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )
        Text(
            text = stringResource(text),
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.paddingFromBaseline(
                top = 24.dp, bottom = 8.dp
            )
        )
    }
}

@SuppressLint("ResourceType")
@Composable
fun Categorias(
    modifier: Modifier = Modifier
){
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(16.dp)
    ){
        items(catevar){
            item->
            AlignCategorias(item.drawable, item.text)
        }
    }
}


private val catevar = listOf(
    R.drawable.aseo to R.string.aseo,
    R.drawable.herramientas to R.string.herramientas,
    R.drawable.bebidas to R.string.bebidas,
    R.drawable.verduras to R.string.verduras
).map {
    variablesCategorias(it.first, it.second)
}


data class variablesCategorias(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)

@Composable
fun Section(
    @StringRes title: Int,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
){
    Column(modifier) {
        Text(
            text = stringResource(id = title),
            style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier
                .paddingFromBaseline(
                    top = 40.dp, bottom = 8.dp
                )
                .padding(16.dp)
        )
        content()
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun HomeSection(){
    CarritoTheme {
        Section(title = R.string.Categorias) {
            Categorias()
        }
    }
}