package dern.ottol.quangnam

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import dern.ottol.quangnam.common.base.BaseFragment
import dern.ottol.quangnam.contents.*

class ViewPagerAdapter(
    fragmentActivity: FragmentActivity
    ) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when(position){
            1 -> HomeFragment()
            2 -> AboutFragment()
            3 -> TipsFragment()
            4 -> HistoryFragment()
            else -> MainFragment()
        }
    }

    override fun getItemCount(): Int {
        return 5
    }
}