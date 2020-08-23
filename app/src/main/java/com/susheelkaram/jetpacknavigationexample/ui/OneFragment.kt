package com.susheelkaram.jetpacknavigationexample.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.susheelkaram.jetpacknavigationexample.R
import com.susheelkaram.jetpacknavigationexample.databinding.FragmentOneBinding

class OneFragment : Fragment(), View.OnClickListener {

    lateinit var B: FragmentOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        B = FragmentOneBinding.inflate(inflater, container, false)
        return B.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        B.btnOpenLevel2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_OpenLevel2 -> findNavController().navigate(R.id.action_oneFragment_to_levelTwoFragment)
        }
    }

}