package dern.ottol.quangnam.contents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import dern.ottol.quangnam.R
import dern.ottol.quangnam.common.base.BaseFragment
import dern.ottol.quangnam.common.binding.viewBinding
import dern.ottol.quangnam.databinding.FragmentTipsBinding


class TipsFragment : BaseFragment(R.layout.fragment_tips) {

    private val binding by viewBinding(FragmentTipsBinding::bind)

    private val title = MutableLiveData("Chọn Số Trúng Xổ Số Như Thế Nào")

    private val desc = MutableLiveData("Nó khác nhau giữa các trò chơi, nhưng có hai cách để rút ra các con số.\n" +
            "Thứ nhất, chúng tôi có các trận hòa theo kiểu truyền thống 'dựa trên bóng'. Những điều này vẫn còn khá phổ biến nhưng đang trở nên hiếm hơn. Chủ yếu là vì chúng đắt tiền để chạy.\n" +
            "Bản thân các máy khác nhau về thiết kế, nhưng tất cả đều hoạt động theo cùng một cách chung.\n" +
            "The balls are loaded into tubes in numeric order. The machine is started up and a paddle or spinner starts to rotate. The balls are dropped into the main drum, and get bounced around and mixed up. Then one by one a ball is removed. It’s all done automatically without anyone touching the machine itself.\n" +
            "The second-way numbers are picked is by using a computer-based lottery draw machine. These computer-generated draws are becoming the more common way to manage lottery games. Mainly because it’s cheaper.\n" +
            "Computer draws do use a pretty standard PC. But with some extra highly specialized hardware.")

    override fun setupViews() {
        with(binding){
            desc.observe(this@TipsFragment){
                textViewDescription.text = it
            }
            title.observe(this@TipsFragment){
                textViewTitle.text = it
            }
        }
    }

    override fun viewModelObservers() {
    }

}