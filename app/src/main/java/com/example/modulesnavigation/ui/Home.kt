package com.example.modulesnavigation.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Home(onItemSelected: (String) -> Unit = {}){
    LazyColumn(
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(6.dp),
    ) {
        items(screens){ screenText ->
            Button(onClick = { onItemSelected(screenText) }) {
                Text(text = screenText.uppercase())
            }
        }
    }
}

val screens = listOf(1,2,3,4,5,6).map { index -> "screen_$index" }
