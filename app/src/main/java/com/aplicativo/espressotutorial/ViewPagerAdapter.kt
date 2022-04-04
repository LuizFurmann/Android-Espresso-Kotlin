package com.aplicativo.espressotutorial

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.aplicativo.espressotutorial.view.fragments.CalendarioFragment
import com.aplicativo.espressotutorial.view.fragments.ContasFragment
import com.aplicativo.espressotutorial.view.fragments.ContatosFragment

private const val NUM_TABS = 3

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return ContasFragment()
            1 -> return ContatosFragment()
        }
        return CalendarioFragment()
    }
}