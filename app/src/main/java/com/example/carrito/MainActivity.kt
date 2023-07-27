package com.example.carrito

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carrito.componentes.AppBar
import com.example.carrito.componentes.BotonFlotante
import com.example.carrito.componentes.HomeSection
import com.example.carrito.componentes.HomeSection2
import com.example.carrito.componentes.NavBar
import com.example.carrito.componentes.SearchBar
import com.example.carrito.ui.theme.CarritoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarritoTheme {
                ScreenContent()
            }
        }
    }
}

@Composable
fun HomePage(
    modifier: Modifier = Modifier
){
    Column(
        modifier
            .verticalScroll(rememberScrollState())
            .padding(vertical = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        SearchBar(Modifier.padding(16.dp))
        HomeSection()
        HomeSection2()
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(
    showBackground = true,
    backgroundColor = 0xFFF0EAE2
)
@Composable
fun ScreenContent(){
    CarritoTheme {
        Scaffold(
            topBar = {AppBar() },
            contentColor = Color(0xFF000000),
            containerColor = Color(0xFFDEECCD),
            bottomBar = { NavBar() },
            floatingActionButton = { BotonFlotante() }
        ) {
            padding ->
            HomePage(Modifier.padding(padding))
        }
    }
}