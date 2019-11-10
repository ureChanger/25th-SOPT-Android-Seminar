package com.gilhyeon.sopt_semina2_homework2.feature

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gilhyeon.sopt_semina2_homework2.R
import com.gilhyeon.sopt_semina2_homework2.data.WebtoonItem

class WebtoonViewHolder(view: View): RecyclerView.ViewHolder(view){
    val imgRvItemWebtoon: ImageView = view.findViewById(R.id.imgRvItemWebtoon)
    val txtRvItemTitle: TextView = view.findViewById(R.id.txtRvItemTitle)
    val imgRvItemStar: ImageView = view.findViewById(R.id.imgRvItemStar)
    val txtRvItemScore: TextView = view.findViewById(R.id.txtRvItemScore)
    val txtRvItemAuthor: TextView = view.findViewById(R.id.txtRvItemAuthor)

    fun bind(data: WebtoonItem){
        imgRvItemWebtoon.setImageResource(data.webtoonImage)
        txtRvItemTitle.text = data.title
        imgRvItemStar.setImageResource(data.starImage)
        txtRvItemScore.text = data.score
        txtRvItemAuthor.text = data.author
    }
}