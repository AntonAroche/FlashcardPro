package com.example.flashcardpro.decks

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DeckFragmentViewModel: ViewModel() {
    private val _navigateToCreateDeck = MutableLiveData<Boolean>()
    val navigateToCreateDeck: LiveData<Boolean>
        get() = _navigateToCreateDeck

    fun onFabClicked() {
        _navigateToCreateDeck.value = true
    }

    fun onNavigatedToCreateDeck(){
        _navigateToCreateDeck.value = false
    }
}