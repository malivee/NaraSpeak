package com.belajar.naraspeak.ui.homepage.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.belajar.naraspeak.R
import com.belajar.naraspeak.databinding.FragmentHomeBinding
import com.bumptech.glide.Glide


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toolbar.apply {
            setOnMenuItemClickListener {
                when (it.itemId) {
                    R.id.btn_shop -> {
                        findNavController().navigate(R.id.action_homeFragment_to_shopActivity)
                    }
                }
                true
            }
        }

        binding.cardFeature2.apply {
            Glide.with(requireActivity())
                .load(R.drawable.homepage_menu_3)
                .into(featureIcon)

            featureIcon.maxHeight = 130
        }
    }



}