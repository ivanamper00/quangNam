package dern.ottol.quangnam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import dern.ottol.quangnam.databinding.ItemBannerBinding

class BannerAdapter(
): RecyclerView.Adapter<BannerAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_banner, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        with(holder.binding){
            bannerImage.setBackgroundResource(Data.bannerList[position])
        }
    }

    override fun getItemCount(): Int = Data.bannerList.size

    class Holder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val binding by lazy {
            ItemBannerBinding.bind(itemView)
        }
    }

}