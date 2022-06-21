package dern.ottol.quangnam

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import dern.ottol.quangnam.common.binding.viewBinding
import dern.ottol.quangnam.contents.*
import dern.ottol.quangnam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),
MainFragment.Listener {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    private lateinit var fragmentAdapter : ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupViews()
    }

    private val bannerAdapter by lazy {
        BannerAdapter()
    }

    val slideTimer = 3000L

    val sliderHandler = Handler(Looper.getMainLooper())

    val sliderRunnable = Runnable {
        val nextBanner = binding.bannerViewPager.currentItem + 1
        binding.bannerViewPager.setCurrentItem(
            if (bannerAdapter.itemCount - 1 < nextBanner) 0 else nextBanner,
            true
        )
    }

    private fun setupViews() {

        with(binding){

            bannerViewPager.adapter = bannerAdapter
            bannerViewPager.registerOnPageChangeCallback(object :
                ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    sliderHandler.removeCallbacks(sliderRunnable)
                    sliderHandler.postDelayed(sliderRunnable, slideTimer)
                }
            })

            fragmentAdapter = ViewPagerAdapter(this@MainActivity)
            fragmentViewPager.adapter = fragmentAdapter

            fragmentViewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    when(position){
                        0 -> setSelectedNav(R.id.main)
                        1 -> setSelectedNav(R.id.home)
                        2 -> setSelectedNav(R.id.about)
                        3 -> setSelectedNav(R.id.tips)
                        4 -> setSelectedNav(R.id.history)
                    }
                }
            })

            bottomNavigationView.setOnItemSelectedListener { menu ->
                when(menu.itemId){
                    R.id.main -> setCurrentItem(0)
                    R.id.home -> setCurrentItem(1)
                    R.id.about -> setCurrentItem(2)
                    R.id.tips -> setCurrentItem(3)
                    R.id.history -> setCurrentItem(4)
                    else -> {}
                }
                true
            }

        }

    }

    companion object {
        fun getStartIntent(context: Context): Intent = Intent(context, MainActivity::class.java)
    }

    private fun setCurrentItem(position: Int){
        binding.fragmentViewPager.setCurrentItem(position, true)
    }

    fun setSelectedNav(id: Int){
        binding.bottomNavigationView.selectedItemId = id
    }

    override fun onHome() {
        setSelectedNav(R.id.home)
    }

    override fun onAbout() {
        setSelectedNav(R.id.about)
    }

    override fun onTips() {
        setSelectedNav(R.id.tips)
    }

    override fun onHistory() {
        setSelectedNav(R.id.history)
    }
}