package com.example.fnatic_fitness

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PullAdapter(private val mList: List<Model>) : RecyclerView.Adapter<PullAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PullAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder (holder: ViewHolder, position : Int){
        val dataPush = mList[position]
        holder.setupView(dataPush.Title, dataPush.Title_Description, dataPush.Image)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        var TitlePushProgram : TextView
        var DescriptionPushProgram : TextView
        var ImagePushProgram : ImageView

        init {
            TitlePushProgram= view.findViewById(R.id.Judul_program)
            DescriptionPushProgram = view.findViewById(R.id.keterangan_program)
            ImagePushProgram = view.findViewById(R.id.imageprogram)
        }

        fun setupView(titleData: String, descriptionData: String, imageData : Int) {
            TitlePushProgram.text = titleData
            DescriptionPushProgram.text = descriptionData
            ImagePushProgram.setImageResource(imageData)
        }
    }
}