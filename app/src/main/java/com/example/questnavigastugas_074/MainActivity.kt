package com.example.questnavigastugas_074

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
// Pastikan nama tema Anda benar, sesuaikan jika perlu
import com.example.questnavigastugas_074.ui.theme.QuestNavigasTugas_074Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Pastikan nama tema ini sesuai dengan file Theme.kt Anda
            QuestNavigasTugas_074Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // PANGGIL INI (DARI Navigasi.kt)
                    // JANGAN PANGGIL WelcomeScreen() SECARA LANGSUNG
                    AplikasiPendaftaran()
                }
            }
        }
    }
}