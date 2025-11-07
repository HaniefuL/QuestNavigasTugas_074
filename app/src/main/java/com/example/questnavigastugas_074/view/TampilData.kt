package com.example.questnavigastugas_074.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringArrayResource

@Composable
fun TampilData(navController: NavHostController){
    val pesertaList = stringArrayResource(id = R.array.data_peserta)
    val gradient = Brush.verticalGradient(
        colors = listOf(Color(0xFF313647), Color(0xFF1A3D64))
    )
}