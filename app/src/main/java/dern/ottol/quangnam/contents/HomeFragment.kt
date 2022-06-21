package dern.ottol.quangnam.contents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import dern.ottol.quangnam.R
import dern.ottol.quangnam.common.base.BaseFragment
import dern.ottol.quangnam.common.binding.viewBinding
import dern.ottol.quangnam.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    private val desc = MutableLiveData("Xổ số là gì - Xổ số là một trò chơi mà các con số được quay ngẫu nhiên và có thể trúng thưởng. Giá vé thường rất thấp và tiềm năng thu về rất cao. Đó là lý do tại sao các trò chơi xổ số rất hấp dẫn - bạn có thể kiếm 1 triệu đô la ở đâu khác.\n" +
            "\n" +
            "Chơi xổ số đã trở thành một trò tiêu khiển rất phổ biến đối với nhiều người - 49% người trưởng thành ở Hoa Kỳ. đã chơi xổ số của bang vào năm ngoái, theo một cuộc khảo sát của Gallup. Vì vậy, công ty của bạn rất tốt, thường thì một nửa dân số của bất kỳ quốc gia nào cũng sẽ đến chơi, thậm chí thỉnh thoảng mới chơi.\n" +
            "Tất nhiên, đây vẫn là một hình thức đánh bạc nhưng nhìn chung được coi là dễ chấp nhận hơn do giá vé tham gia thấp hơn.")

    override fun setupViews() {
        with(binding){
            desc.observe(this@HomeFragment){
                textViewDescription.text = it
            }
        }

    }

    override fun viewModelObservers() {
    }

}