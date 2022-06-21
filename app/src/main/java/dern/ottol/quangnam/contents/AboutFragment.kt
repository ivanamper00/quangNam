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
import dern.ottol.quangnam.databinding.FragmentAboutBinding


class AboutFragment : BaseFragment(R.layout.fragment_about) {

    private val binding by viewBinding(FragmentAboutBinding::bind)

    private val title = MutableLiveData("Làm thế nào để bạn giành chiến thắng")

    private val desc = MutableLiveData("Trò chơi xổ số của Việt Nam có nhiều người chơi cùng lúc. Bingo 90 số là một trò chơi may rủi. Khi một người chơi nhận thấy các số đã chọn được sắp xếp liên tiếp trên thẻ của họ, họ sẽ gọi \"Bingo!\". Những người chơi cạnh tranh với nhau để trở thành người đầu tiên sắp xếp chiến thắng cho giải thưởng hoặc giải độc đắc.\n" +
            "\n" +
            "ou giành chiến thắng trong xổ số bằng cách phù hợp với các con số được rút ra. Nếu bạn khớp với tất cả các con số được rút ra, bạn sẽ giành chiến thắng trong giải độc đắc. Nếu bạn phù hợp với một số con số nhưng không phải tất cả, bạn sẽ giành được một giải thưởng nhỏ hơn.")

    override fun setupViews() {
        with(binding){
            desc.observe(this@AboutFragment){
                textViewDescription.text = it
            }
            title.observe(this@AboutFragment){
                textViewTitle.text = it
            }
        }
    }

    override fun viewModelObservers() {
    }

}