package com.jimxia.robolectricdemo.module4

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.navigation.NavController
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class Module4ScreenKtTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @MockK(relaxed = true)
    private lateinit var navController: NavController

    private lateinit var viewModel: Module4ViewModel

    @Before
    fun setUp() {
        MockKAnnotations.init(this)

        viewModel = Module4ViewModel()

        composeTestRule.setContent {
            Module4Screen(
                navController = navController,
                viewModel = viewModel,
            )
        }
    }

    @Test
    fun `module4 screen title should be exist`() {
        // given
        val title = composeTestRule.onNodeWithTag("title")

        // then
        title.assertDoesNotExist()
    }

    @After
    fun tearDown() {
    }
}
