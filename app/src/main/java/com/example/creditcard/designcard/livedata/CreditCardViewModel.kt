package com.example.creditcard.designcard.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CreditCardViewModel : ViewModel(){
    private val _cardNumber = MutableLiveData<String>()
    val cardNumber: LiveData<String> = _cardNumber

    private val _cardHolder = MutableLiveData<String>()
    val cardHolder: LiveData<String> = _cardHolder

    private val _cardExpiration = MutableLiveData<String>()
    val expirationDate: LiveData<String> = _cardExpiration


    private var _cardColor = MutableLiveData<String>()
    val cardColor: LiveData<String> = _cardColor
    fun setCardColor(color: String){
        _cardColor.value = color
    }

    fun setCardNumber(number: String){
        if (number.length > 16){
            return
        }
        _cardNumber.value = number
    }

    fun setCardHolder(holder: String){
        _cardHolder.value = holder
    }

    fun setExpirationDate(expiration: String){

        if (expiration.length > 4){
            return
        }

        _cardExpiration.value = expiration
    }



}