package com.bangkit.naraspeak.ui.shop

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bangkit.naraspeak.R
import com.bangkit.naraspeak.databinding.ActivityShopBinding

class ShopActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShopBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityShopBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var isSelected = false
        binding.premiumWeeklyCard.root.setOnClickListener {
//            if (!isSelected) {
//                binding.premiumWeeklyCard.root.setBackgroundColor(getColor(R.color.secondary_6))
//
//            } else {
//                binding.premiumWeeklyCard.root.setBackgroundColor(getColor(R.color.accent_black))
//
//            }
//            isSelected = !isSelected
        }

    }
}