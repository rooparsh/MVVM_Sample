package com.darklabs.darkbasemvvm.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *
 * Created by Rooparsh Kalia on 2019-06-29
 *
 **/

@Entity
data class Post(
    val userId: Int,
    @field:PrimaryKey
    val id: Int,
    val title: String,
    val body: String
)