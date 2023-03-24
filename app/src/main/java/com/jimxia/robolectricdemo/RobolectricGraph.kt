package com.jimxia.robolectricdemo

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jimxia.robolectricdemo.module1.Module1Screen
import com.jimxia.robolectricdemo.module2.Module2Screen
import com.jimxia.robolectricdemo.module3.Module3Screen
import com.jimxia.robolectricdemo.module4.Module4Screen

const val MODULE1_SCREEN = "module1"
const val MODULE2_SCREEN = "module2"
const val MODULE3_SCREEN = "module3"
const val MODULE4_SCREEN = "module4"

@Composable
fun RobolectricGraph(
    navHostController: NavHostController,
    startDestination: String,
) {
    NavHost(
        navController = navHostController,
        startDestination = startDestination,
        modifier = Modifier,
    ) {
        composable(
            route = MODULE1_SCREEN,
            content = @Composable { navBackStackEntry ->
                Module1Screen(navController = navHostController)
            },
        )

        composable(
            route = MODULE2_SCREEN,
            content = @Composable { navBackStackEntry ->
                Module2Screen(navController = navHostController)
            },
        )

        composable(
            route = MODULE3_SCREEN,
            content = @Composable { navBackStackEntry ->
                Module3Screen(navController = navHostController)
            },
        )

        composable(
            route = MODULE4_SCREEN,
            content = @Composable { navBackStackEntry ->
                Module4Screen(navController = navHostController)
            },
        )
    }
}
