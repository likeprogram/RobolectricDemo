package com.jimxia.robolectricdemo

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.jimxia.robolectricdemo.ui.theme.RobolectricDemoTheme

@Composable
fun RobolectricApp() {
    RobolectricDemoTheme {
        val navController = rememberNavController()
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
        Logger.i("RobolectricApp", "currentDestination: $currentDestination")

        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background,
        ) {
            RobolectricGraph(
                navHostController = navController,
                startDestination = "module1",
            )
        }
    }
}
