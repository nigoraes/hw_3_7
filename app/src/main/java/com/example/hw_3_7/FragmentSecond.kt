package com.example.hw_3_7

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide

import com.example.hw_3_7.databinding.FragmentSecondBinding
import com.example.hw_3_7.FirstFragment.Companion.KEY_FAM
import com.example.hw_3_7.FirstFragment.Companion.KEY_IMG
import com.example.hw_3_7.FirstFragment.Companion.KEY_NAME

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        result()
    }

    private fun result() {
        arguments?.apply {
            val username = getString(KEY_NAME)
            val password = getString(KEY_FAM)
            val img = getString(KEY_IMG)
            binding.apply {
                tvName.text = username
                tvFam.text = password
                Glide.with(binding.imgPhoto).load(img).into(binding.imgPhoto)
            }
        }
    }
}