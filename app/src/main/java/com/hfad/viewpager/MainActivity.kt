package com.hfad.viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.hfad.viewpager.adapters.ViewPagerAdapter
import com.hfad.viewpager.databinding.ActivityMainBinding

val fragmentsArray = arrayOf(
    "First",
    "Second"
)

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        with(binding) {
            val viewPager = viewPager
            val tabLayout = tabLayout

            val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
            viewPager.adapter = adapter

            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                tab.text = fragmentsArray[position]
            }.attach()
        }
    }
}
