package br.com.ioasys.camp.educao.ui.main

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.ioasys.camp.educao.R
import kotlinx.android.synthetic.main.item_monitor.view.*

class MonitorAdapter(private val monitors: List<Monitor>) :
        RecyclerView.Adapter<MonitorAdapter.MonitorViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MonitorViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_monitor, parent, false)
    )

    override fun getItemCount(): Int {
        return monitors.size
    }

    override fun onBindViewHolder(holder: MonitorViewHolder, position: Int) {

        val monitor: Monitor = monitors[position]

        holder.bind(monitor)

    }


    class MonitorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(monitor: Monitor) {

            itemView.itemNameTxt.text = monitor.name
            itemView.itemAgeTxt.text = monitor.age
            itemView.itemUniversityTxt.text = monitor.university

            val drawable = itemView.resources.getDrawable(R.drawable.ic_girl)

            itemView.avatarImg.setImageDrawable(drawable)
        }

    }


}