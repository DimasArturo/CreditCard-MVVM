package com.example.creditcard.designcard.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.creditcard.designcard.livedata.CreditCardViewModel
import com.example.creditcard.designcard.views.form.CardExpirationInput
import com.example.creditcard.designcard.views.form.CardHolderInput
import com.example.creditcard.designcard.views.form.CardNumberInput

@Composable
fun FormCard(creditCardViewModel: CreditCardViewModel) {

    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)
        .padding(24.dp)
    ){
        Column {

            CardNumberInput(creditCardViewModel)

            Spacer(modifier = Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                CardHolderInput(creditCardViewModel)
                CardExpirationInput(creditCardViewModel)

            }
        }
    }
}