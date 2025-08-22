package com.example.searchbarapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			SearchBarApp()
		}
	}
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBarApp() {
	var query by remember { mutableStateOf("") }
	var active by remember { mutableStateOf(false) }
	val searchResults = remember(query) {
		if (query.isBlank()) emptyList() else List(5) { "Result ${'$'}{it + 1} for \"${'$'}query\"" }
	}

	MaterialTheme {
		Surface(modifier = Modifier.fillMaxSize()) {
			Scaffold { innerPadding ->
				SearchBar(
					modifier = Modifier
						.padding(innerPadding)
						.padding(16.dp),
					query = query,
					onQueryChange = { query = it },
					onSearch = { active = false },
					active = active,
					onActiveChange = { active = it },
					placeholder = { Text(text = "Search…") }
				) {
					searchResults.forEach { result ->
						Text(text = result, modifier = Modifier.padding(12.dp))
					}
				}
			}
		}
	}
}