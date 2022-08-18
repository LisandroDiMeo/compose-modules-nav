package com.example.authmodule.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeAuth(onClick: () -> Unit){
    Column(modifier = Modifier.fillMaxSize()) {
        Button(onClick) {
            Text(text = "go to app")
        }
    }
}