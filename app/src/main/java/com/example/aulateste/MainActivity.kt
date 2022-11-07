package com.example.aulateste

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.aulateste.ui.theme.AulaTesteTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //metodo de adição do elemento texto
        super.onCreate(savedInstanceState)
        setContent { //define o layout da atividade em que as funções de composição são chamadas.
            MessageCard("Android")
        }
    }
}

@Composable // função composta
fun MessageCard(name: String) {
    Text(text = "Hello $name!")
}
@Preview //permite visualizar as funções de composição no Android Studio sem precisar criar e instalar o app
@Composable
fun PreviewMessageCard() {
    MessageCard("Android")
}
