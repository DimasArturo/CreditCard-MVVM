package com.example.creditcard.designcard.views.form

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import com.example.creditcard.designcard.livedata.CreditCardViewModel

@Composable
fun CardHolderInput(creditCardViewModel: CreditCardViewModel){
    var creditCardHolderValue by rememberSaveable { mutableStateOf("") }

    creditCardViewModel.cardHolder.observe(LocalLifecycleOwner.current){ newValue ->
        creditCardHolderValue = newValue
    }
    OutlinedTextField(
        placeholder = {
            Text(text = "Nombre del Titular")
        },
        modifier = Modifier.fillMaxWidth(fraction = 0.6f),
        value = creditCardHolderValue, onValueChange = {
            creditCardViewModel.setCardHolder(it)
        })
}