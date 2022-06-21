package dern.ottol.quangnam.contents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dern.ottol.quangnam.R
import dern.ottol.quangnam.common.base.BaseFragment
import dern.ottol.quangnam.common.binding.viewBinding
import dern.ottol.quangnam.databinding.FragmentMainBinding

class MainFragment : BaseFragment(R.layout.fragment_main) {

    private val binding by viewBinding(FragmentMainBinding::bind)


    override fun setupViews() {
        with(binding){
            homeBtn.setOnClickListener { (requireActivity() as Listener).onHome() }
            aboutBtn.setOnClickListener { (requireActivity() as Listener).onAbout() }
            tipsBtn.setOnClickListener { (requireActivity() as Listener).onTips() }
            historyBtn.setOnClickListener { (requireActivity() as Listener).onHistory() }
        }
    }

    override fun viewModelObservers() {

    }

    interface Listener {
        fun onHome()
        fun onAbout()
        fun onTips()
        fun onHistory()
    }
}