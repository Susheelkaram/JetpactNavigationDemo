package com.susheelkaram.jetpacknavigationexample.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.susheelkaram.jetpacknavigationexample.R
import com.susheelkaram.jetpacknavigationexample.databinding.FragmentHomeBinding

class HomeFragment : Fragment() , View.OnClickListener{
    lateinit var B :FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        B =  FragmentHomeBinding.inflate(inflater, container, false)
        return  B.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        B.btnOpenPage1.setOnClickListener(this)
        B.btnOpenPage2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
           R.id.btn_OpenPage1 -> findNavController().navigate(R.id.actionOneFragment)
           R.id.btn_OpenPage2 -> findNavController().navigate(R.id.actionTwoFragment)
        }
    }
}