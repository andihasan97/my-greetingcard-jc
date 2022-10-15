package com.andihasan7.mygreetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.andihasan7.mygreetingcard.ui.theme.MyGreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyGreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    
                }
            }
        }
    }
}
@Composable
fun BirthdayGreetingWithText(message: String, from: String) {
    // fungsi text, mengubah ukuran text ke 36 sp
    // column untuk tampilan secara vertical
    Column {
        Text(text = message,
            fontSize = 36.sp
        )
        Text(text = from,
            fontSize = 24.sp
        )
    }
}

// ini hanya fungsi preview bukan tampilan asli di device nanti
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BirthDayCardPreview() {
    MyGreetingCardTheme {
        // memanggil fungsi BirthdayGreetingWithText untuk menampilkan pesan text
        BirthdayGreetingWithText(message = "Happy Birthday Sam!", from = "- from Andi")
    }
}