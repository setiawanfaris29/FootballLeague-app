package com.example.footbalmatch

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.footbalmatch.lastMatch.LastMatch

class ViewPagerAdapter(context: Context,fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val context: Context? = context

    private val pages = listOf(
        LastMatch(),
        NextMatch()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> context?.getString(R.string.last)
            1 -> context?.getString(R.string.next)
            else -> ""
        }
    }

}