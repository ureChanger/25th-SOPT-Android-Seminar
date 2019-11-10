package com.gilhyeon.sopt_semina2_homework2.feature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gilhyeon.sopt_semina2_homework2.R
import com.gilhyeon.sopt_semina2_homework2.data.WebtoonDummyData

class WebtoonListActivity : AppCompatActivity() {
    private lateinit var rvWebtoon: RecyclerView
    private lateinit var webtoonAdapter: WebtoonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webtoon_list)

        rvWebtoon =findViewById(R.id.rvWebtoon)
        webtoonAdapter = WebtoonAdapter(this)
        rvWebtoon.adapter = webtoonAdapter
        rvWebtoon.layoutManager = GridLayoutManager(this, 3)

        webtoonAdapter.data = WebtoonDummyData().getWebtoonList()
    }
}
