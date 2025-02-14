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
fun CardNumberInput(creditCardViewModel: CreditCardViewModel) {

    var valueInput by rememberSaveable { mutableStateOf("") }

    creditCardViewModel.cardNumber.observe(LocalLifecycleOwner.current){newValue ->
        valueInput = newValue
    }

    OutlinedTextField(
        placeholder = {
            Text(text = "0000-0000-0000-0000")
        },
        modifier = Modifier.fillMaxWidth(),
        value = valueInput, onValueChange = {
            creditCardViewModel.setCardNumber(it)
        })
}