package com.bankoti.jetpackapp.apps

import SignupScreen
import android.provider.CalendarContract.Colors
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.bankoti.jetpackapp.data.HomeViewModel
import com.bankoti.jetpackapp.navigation.PostOfficeAppRouter
import com.bankoti.jetpackapp.navigation.Screen
import com.bankoti.jetpackapp.screens.HomeScreen
import com.bankoti.jetpackapp.screens.LoginScreen
import com.bankoti.jetpackapp.screens.TermsAndConditionScreen


@Composable
fun postOfficeApp() {

 //   homeViewModel.checkForActiveSession()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {


        Crossfade(targetState = PostOfficeAppRouter.currentScreen, label = "") { currentState ->
            when (currentState.value) {
                is Screen.SignUpScreen -> {
                    SignupScreen()
                }

                is Screen.TermsAndConditionsScreen -> {
                    TermsAndConditionScreen()
                }

                is Screen.LoginScreen -> {
                   LoginScreen()
                }

                is Screen.HomeScreen -> {
                    HomeScreen()

                }
            }
        }

    }
}