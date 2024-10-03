package com.example.contrapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contrapp.ui.theme.ContrAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContrAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Pantalla(2)
                }
            }
        }
    }
}

@Composable
fun Pantalla(number: Int, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Row {
            Cuenta(number)
        }
        Row {
            Usuario(number)
        }
        Row {
            Contrasenia(number)
        }
        Row {
            Text("....................")
        }
        Row {
            Botones()
        }
    }
}



@Composable
fun Cuenta(nombreCuenta: Int) {
    val cuentas: List<String> = listOf("Insta", "Netflix", "Youtube")
    Text(
        cuentas.get(nombreCuenta),
        fontSize = 80.sp,
        lineHeight = 116.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(bottom = 20.dp)
            .fillMaxWidth()
    )
}


@Composable
fun Usuario(nombreCuenta: Int) {
    val cuentas: List<String> = listOf("User1", "User2", "User3")
    Text(
        cuentas.get(nombreCuenta),
        fontSize = 40.sp,
        lineHeight = 116.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
    )
}


@Composable
fun Contrasenia(nombreCuenta: Int) {
    val cuentas: List<String> = listOf("Pass1", "Pass2", "Pass3")
    Text(
        cuentas.get(nombreCuenta),
        fontSize = 40.sp,
        lineHeight = 116.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
    )
}


@Composable
fun Botones() {
    /*<Button
    android:id="@+id/supabutton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="I'm a button" />


    IconButton(onClick = onNavigateToPagina2 ,
        modifier = Modifier.size(75.dp)) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "IMG",
            modifier = Modifier.fillMaxSize()
        )*/
    Button(
        onClick = {},
        shape = RectangleShape
    ) {
        Text("0")
    }
}