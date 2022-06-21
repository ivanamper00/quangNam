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
import dern.ottol.quangnam.databinding.FragmentHistoryBinding

class HistoryFragment : BaseFragment(R.layout.fragment_history) {

    private val binding by viewBinding(FragmentHistoryBinding::bind)

    private val title = MutableLiveData("Xổ số bắt nguồn từ đâu")

    private val desc = MutableLiveData("Xổ số đã xuất hiện không lâu. Có những tài liệu tham khảo lâu đời hơn trong lịch sử thời kỳ đầu của Trung Quốc và La Mã, nhưng chúng giống như xổ số hơn là xổ số. Các trò chơi thực sự trông giống như xổ số hiện đại của chúng ta lần đầu tiên xuất hiện vào thế kỷ 15.")

    private val desc2= MutableLiveData("Có một ghi chép từ ngày 9 tháng 5 năm 1445 về trò chơi một lần để gây quỹ xây dựng công sự cho thị trấn Écluse ở Hà Lan. Vé đã được bán và bạn có thể giành được giải thưởng tiền mặt - lợi nhuận được chuyển cho dự án quốc phòng.\n" +
            "Nhưng đó là ở Genoa thế kỷ 15, Ý, nơi một trò chơi Lotto thông thường bắt đầu. Nó chỉ bắt đầu hai lần một năm vì nó dựa trên tên của các thành viên hội đồng được rút ra. Năm cái tên được chọn ngẫu nhiên từ một nhóm chín mươi ứng cử viên để trở thành ủy viên hội đồng được bầu.")

    override fun setupViews() {
        with(binding){
            desc.observe(this@HistoryFragment){
                textViewDescription.text = it
            }
            title.observe(this@HistoryFragment){
                textViewTitle.text = it
            }
            desc2.observe(this@HistoryFragment){
                textViewDescription2.text = it
            }
        }
    }

    override fun viewModelObservers() {
    }

}