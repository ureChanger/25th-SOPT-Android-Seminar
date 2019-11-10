package com.gilhyeon.sopt_semina2_homework2.feature

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gilhyeon.sopt_semina2_homework2.R
import com.gilhyeon.sopt_semina2_homework2.data.WebtoonItem

class WebtoonAdapter(private val context: Context): RecyclerView.Adapter<WebtoonViewHolder>() {
    var data = listOf<WebtoonItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WebtoonViewHolder {
        val view = LayoutInflater
            .from(context)
            .inflate(R.layout.rv_item_webtoon,
                parent, false)
        return WebtoonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: WebtoonViewHolder, position: Int) {
        holder.bind(data[position])
    }
}