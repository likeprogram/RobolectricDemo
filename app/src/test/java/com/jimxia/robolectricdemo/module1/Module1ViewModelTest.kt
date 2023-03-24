package com.jimxia.robolectricdemo.module1

import com.jimxia.robolectricdemo.UnconfinedMainCoroutineRule
import kotlinx.coroutines.test.runTest
import org.assertj.core.api.Assertions
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class Module1ViewModelTest {
    @get:Rule
    val mainCoroutineRule = UnconfinedMainCoroutineRule()

    private lateinit var viewModel: Module1ViewModel

    @Before
    fun setUp() {
        viewModel = Module1ViewModel()
    }

    @Test
    fun `module1 view model test state should be true after load finished`() = runTest {
        // when
        viewModel.loadData()

        // then
        Assertions.assertThat(viewModel.testState).isEqualTo(true)
    }

    @After
    fun tearDown() {
    }
}
