package com.darklabs.darkbasemvvm.data.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

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