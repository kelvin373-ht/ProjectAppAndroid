package com.algokelvin.training.android.fragment.tablayout

import algokelvin.android.tablayout.AppsViewPageAdapter
import algokelvin.android.tablayout.SetupViewPager.setTextNameTabs
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_page.*

class PageFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val appsViewPageAdapter = AppsViewPageAdapter(childFragmentManager)
        appsViewPageAdapter.addAppsPage(TabsFragment(0), TabsFragment(1), TabsFragment(2), TabsFragment(3), TabsFragment(4))
        layoutViewPager.adapter = appsViewPageAdapter
        tabsLayout.setupWithViewPager(layoutViewPager)

        tabsLayout.setTextNameTabs("Tab 1", "Tab 2", "Tab 3", "Tab 4", "Tab 5")
    }

}