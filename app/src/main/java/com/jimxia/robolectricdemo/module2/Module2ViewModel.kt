package com.jimxia.robolectricdemo.module2

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jimxia.robolectricdemo.Logger
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class Module2ViewModel @Inject constructor() : ViewModel() {
    var testState by mutableStateOf(false)
        private set

    fun loadData() {
        viewModelScope.launch {
            repeat(5) {
                delay(1000)
                testState = !testState
                Logger.i(TAG, "[loadData] testState: $testState")
            }
        }
    }

    companion object {
        private const val TAG = "Module2ViewModel"
    }
}
