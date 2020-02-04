package com.example.flashcardpro.decks

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.get
import androidx.navigation.findNavController
import com.example.flashcardpro.R
import com.example.flashcardpro.databinding.DeckFragmentBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.deck_fragment.*


class DeckFragment : Fragment() {

    private lateinit var viewModel: DeckFragmentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val binding = DeckFragmentBinding.inflate(inflater)

        viewModel = ViewModelProviders.of(this).get(DeckFragmentViewModel::class.java)

        System.out.println(viewModel)

        binding.viewModel = viewModel

        viewModel.navigateToCreateDeck.observe(viewLifecycleOwner,
            Observer<Boolean> {
                if (it){
                    binding.root.findNavController().navigate(R.id.action_deckFragment_to_createDeck)
                    viewModel.onNavigatedToCreateDeck()
                }
            })

        return binding.root
    }
}
