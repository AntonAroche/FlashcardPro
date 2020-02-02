package com.example.flashcardpro.decks


import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.flashcardpro.R
import com.example.flashcardpro.databinding.DeckFragmentBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.deck_fragment.*

/**
 * A simple [Fragment] subclass.
 */
class DeckFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val binding: DeckFragmentBinding = DataBindingUtil.inflate(inflater,
            R.layout.deck_fragment, container, false)


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        return binding.root
    }


}
