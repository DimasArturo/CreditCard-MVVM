package com.example.creditcard.designcard.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.creditcard.designcard.livedata.CreditCardViewModel

@Composable
fun DesingCardScreen(){

    val creditCardViewModel = CreditCardViewModel()

    Scaffold { paddingValues ->

        Column (
            modifier = Modifier
                .padding(paddingValues)
        ){
            CreditCard (creditCardViewModel)
            FormCard(creditCardViewModel)
            ColorsOptions(creditCardViewModel)
        }

    }

}