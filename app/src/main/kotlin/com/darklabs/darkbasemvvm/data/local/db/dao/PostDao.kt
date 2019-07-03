package com.darklabs.darkbasemvvm.data.local.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.darklabs.darkbasemvvm.data.model.Post

/**
 *
 * Created by Rooparsh Kalia on 2019-06-29
 *
 **/

@Dao
interface PostDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(post: List<Post>)

    @get:Query("SELECT * FROM post")
    val allPosts: LiveData<List<Post>>
}