package com.example.level3_task1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_rating.*

// TODO: Rename parameter arguments, choose names that match

const val ARG_GAME_NAME = "arg_game_name"
const val ARG_GAME_RATING = "arg_game_rating"

class SummaryFragment : Fragment() {
    class SummaryFragment : Fragment() {

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_summary, container, false)
        }
    }

}
