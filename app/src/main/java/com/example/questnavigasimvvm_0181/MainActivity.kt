package com.example.questnavigasimvvm_0181

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.questnavigasimvvm_0181.ui.theme.QuestNavigasiMVVM_0181Theme
import com.example.questnavigasimvvm_0181.view.FormIsian

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestNavigasiMVVM_0181Theme {
                // Mendapatkan context dari Compose untuk Toast
                val context = LocalContext.current

                FormIsian(
                    OnSubmitBtnClick = {
                        // Aksi yang dijalankan saat tombol diklik
                        Toast.makeText(
                            context,
                            "Data berhasil disubmit!",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestNavigasiMVVM_0181Theme {
        Greeting("Android")
    }
}