package com.jimxia.robolectricdemo

import com.jimxia.robolectricdemo.module1.Module1ScreenKtTest
import com.jimxia.robolectricdemo.module1.Module1ViewModelTest
import com.jimxia.robolectricdemo.module2.Module2ScreenKtTest
import com.jimxia.robolectricdemo.module3.Module3ScreenKtTest
import com.jimxia.robolectricdemo.module4.Module4ScreenKtTest
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses

// @SuiteClasses(Module1ScreenKtTest::class, Module1ViewModelTest::class, Module2ScreenKtTest::class)
// @SuiteClasses(Module1ViewModelTest::class, Module1ScreenKtTest::class, Module2ScreenKtTest::class)
// @SuiteClasses(Module1ScreenKtTest::class, Module2ScreenKtTest::class, Module1ViewModelTest::class)
@RunWith(Suite::class)
@SuiteClasses(
    Module1ScreenKtTest::class,
    Module1ViewModelTest::class,
    Module2ScreenKtTest::class,
    Module3ScreenKtTest::class,
    Module4ScreenKtTest::class,
)
class RobolectricTestSuite
