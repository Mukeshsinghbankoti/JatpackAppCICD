package com.bankoti.jetpackapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bankoti.jetpackapp.Components.headingTextComponent
import com.bankoti.jetpackapp.Components.normalTextComponent
import com.bankoti.jetpackapp.R
import com.bankoti.jetpackapp.navigation.PostOfficeAppRouter
import com.bankoti.jetpackapp.navigation.Screen
import com.bankoti.jetpackapp.navigation.SystemBackButtonHandler

@Composable
fun  TermsAndConditionScreen(){
    Surface(

        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(10.dp)
            .verticalScroll(rememberScrollState())
    ){
        Column(modifier = Modifier.fillMaxSize() .padding(10.dp)
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            normalTextComponent(value= stringResource(id = R.string.terms_and_conditions_header))
            headingTextComponent(value= stringResource(id = R.string.terms_and_conditions))
        }
    }
    SystemBackButtonHandler {
        PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
    }
}
@Preview
@Composable
fun DefaultPreviewOfTermsAndConditionScreen(){
    TermsAndConditionScreen()
}