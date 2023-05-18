package com.wiapp.woof.data

import androidx.compose.runtime.Composable
import com.wiapp.woof.R
import com.wiapp.woof.model.CategoryDatas

class DataSource {
    @Composable
    fun loadDataSource(): List<CategoryDatas>{
        return listOf<CategoryDatas>(
            CategoryDatas(R.drawable.img1, R.string.dog_1, R.string.dog_age_1, R.string.title_hobby, R.string.hobby_1),
            CategoryDatas(R.drawable.img2, R.string.dog_2, R.string.dog_age_2, R.string.title_hobby, R.string.hobby_2),
            CategoryDatas(R.drawable.img3, R.string.dog_3, R.string.dog_age_3, R.string.title_hobby, R.string.hobby_3),
            CategoryDatas(R.drawable.img4, R.string.dog_4, R.string.dog_age_4, R.string.title_hobby, R.string.hobby_4),
            CategoryDatas(R.drawable.img5, R.string.dog_5, R.string.dog_age_5, R.string.title_hobby, R.string.hobby_5),
            CategoryDatas(R.drawable.img6, R.string.dog_6, R.string.dog_age_6, R.string.title_hobby, R.string.hobby_6),
            CategoryDatas(R.drawable.img7, R.string.dog_7, R.string.dog_age_7, R.string.title_hobby, R.string.hobby_7),
            CategoryDatas(R.drawable.img8, R.string.dog_8, R.string.dog_age_8, R.string.title_hobby, R.string.hobby_8),
            CategoryDatas(R.drawable.img9, R.string.dog_9, R.string.dog_age_9, R.string.title_hobby, R.string.hobby_9),
            CategoryDatas(R.drawable.img10, R.string.dog_10, R.string.dog_age_10, R.string.title_hobby, R.string.hobby_10),
        )
    }
}