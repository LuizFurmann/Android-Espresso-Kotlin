package com.aplicativo.espressotutorial.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aplicativo.espressotutorial.ViewPagerAdapter
import com.aplicativo.espressotutorial.databinding.ActivityTabLayoutBinding
import com.google.android.material.tabs.TabLayoutMediator

class TabLayoutActivity : AppCompatActivity() {

    private lateinit var binding : ActivityTabLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        val animalsArray = arrayOf(
            "Contas",
            "Contatos",
            "Calendário"
        )

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = animalsArray[position]
        }.attach()
    }
}