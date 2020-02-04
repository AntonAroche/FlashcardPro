package com.example.flashcardpro.decks

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider

import com.example.flashcardpro.R
import com.example.flashcardpro.databinding.CreateDeckFragmentBinding

class CreateDeck : Fragment() {
    private val TAG = "CreateDeck"
    private lateinit var viewModel: CreateDeckViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val binding = CreateDeckFragmentBinding.inflate(inflater)
        viewModel = ViewModelProviders.of(this).get(CreateDeckViewModel::class.java)

        binding.viewModel = viewModel

        binding.deckNameText.setOnEditorActionListener { v, actionId, event ->
            when (actionId){
                EditorInfo.IME_ACTION_DONE -> {
                    Log.i(TAG, "done")
                    true
                }
                else -> false
            }
        }
        return binding.root
    }

    fun onTextEntered(binding: CreateDeckFragmentBinding) {
        Log.i(TAG, "Text entered")
        binding.enterButton.visibility = View.VISIBLE
    }

}
