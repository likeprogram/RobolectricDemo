package com.jimxia.robolectricdemo.module4

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

@Composable
fun Module4Screen(
    viewModel: Module4ViewModel = hiltViewModel(),
    navController: NavController,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
    ) {
        Text(
            modifier = Modifier.testTag("title"),
            text = "Module4",
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
            navController.popBackStack()
        }) {
            Text(text = "Back")
        }
    }
}
