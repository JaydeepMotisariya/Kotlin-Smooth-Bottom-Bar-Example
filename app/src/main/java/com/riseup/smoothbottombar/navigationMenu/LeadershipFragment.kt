package com.riseup.smoothbottombar.navigationMenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.riseup.smoothbottombar.R

/**
Created by Jaydeep Motisariya
19th October 2021
 */

class LeadershipFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_leadership, container, false)
    }

}