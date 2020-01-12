package com.simplyfire.viewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_page.view.*

class ViewPagerAdapter : RecyclerView.Adapter<PagerVH>() {

    private val colors = intArrayOf(
        android.R.color.black,
        android.R.color.holo_red_light,
        android.R.color.holo_blue_dark,
        android.R.color.holo_purple
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH =
        PagerVH(LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false))

    override fun getItemCount(): Int = colors.size

    override fun onBindViewHolder(holder: PagerVH, position: Int) = holder.itemView.run {
        tvTitle.text = "item $position"
        container.setBackgroundResource(colors[position])
    }
}

class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView)