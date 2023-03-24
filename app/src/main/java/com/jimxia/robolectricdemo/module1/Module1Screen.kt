package com.jimxia.robolectricdemo.module1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.jimxia.robolectricdemo.MODULE2_SCREEN
import com.jimxia.robolectricdemo.MODULE3_SCREEN
import com.jimxia.robolectricdemo.MODULE4_SCREEN

@Composable
fun Module1Screen(
    viewModel: Module1ViewModel = hiltViewModel(),
    navController: NavController,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
    ) {
        Text(
            modifier = Modifier.testTag("title"),
            text = "Module1",
        )
        if (viewModel.testState) {
            Text(text = "test state from view model is ${viewModel.testState}")
        }

        Button(onClick = {
            viewModel.loadData()
        }) {
            Text(text = "Change Test State")
        }

        Button(onClick = {
            navController.navigate(MODULE2_SCREEN)
        }) {
            Text(text = "Open Module2")
        }
        Button(onClick = {
            navController.navigate(MODULE3_SCREEN)
        }) {
            Text(text = "Open Module3")
        }
        Button(onClick = {
            navController.navigate(MODULE4_SCREEN)
        }) {
            Text(text = "Open Module4")
        }
    }
}
