

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bankoti.jetpackapp.Components.ButtonComponent
import com.bankoti.jetpackapp.Components.CheckboxComponent
import com.bankoti.jetpackapp.Components.ClickableLoginTextComponent
import com.bankoti.jetpackapp.Components.DividerTextComponent
import com.bankoti.jetpackapp.Components.MyTextField
import com.bankoti.jetpackapp.Components.PasswordTextFieldComponent
import com.bankoti.jetpackapp.Components.headingTextComponent
import com.bankoti.jetpackapp.Components.normalTextComponent
import com.bankoti.jetpackapp.R
import com.bankoti.jetpackapp.navigation.PostOfficeAppRouter

@Composable
fun SignupScreen(){
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
            normalTextComponent(value= stringResource(id = R.string.slaute))
            headingTextComponent(value= stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.heightIn(20.dp))
            MyTextField(labelValue= stringResource(id = R.string.firstName),
                painterResource(id = R.drawable.account)
            )
            MyTextField(labelValue= stringResource(id = R.string.lastName),
                        painterResource(id = R.drawable.account))
            MyTextField(labelValue= stringResource(id = R.string.email),
                painterResource(id = R.drawable.email))
            PasswordTextFieldComponent(
                                        labelValue = stringResource(id = R.string.password),
                                        painterResource(id = R.drawable.password))
            CheckboxComponent(value = stringResource(id = R.string.terms_and_conditions),
                onTextSelected = {
                    PostOfficeAppRouter.navigateTo(com.bankoti.jetpackapp.navigation.Screen.TermsAndConditionsScreen)
                },
                onCheckedChange = {
                   // signupViewModel.onEvent(SignupUIEvent.PrivacyPolicyCheckBoxClicked(it))
                })
            Spacer(modifier = Modifier.height(40.dp))

            ButtonComponent(
                value = stringResource(id = R.string.register),
                onButtonClicked = {

                },

            )

            Spacer(modifier = Modifier.height(20.dp))
            DividerTextComponent();
            Spacer(modifier = Modifier.height(10.dp))
            ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {
                PostOfficeAppRouter.navigateTo(com.bankoti.jetpackapp.navigation.Screen.LoginScreen)
            })
            Spacer(modifier = Modifier.height(220.dp))

        }

    }
}
@Preview
@Composable
fun DefaultPreviewOfSignupScreen(){
    SignupScreen()
}