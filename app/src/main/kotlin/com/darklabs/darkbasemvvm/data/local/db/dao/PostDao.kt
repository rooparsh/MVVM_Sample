package com.darklabs.darkbasemvvm.data.local.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.darklabs.darkbasemvvm.data.model.Post

/**
 *
 * Created by Rooparsh Kalia on 2019-06-29
 *
 **/

@Dao
interface PostDao {

    @Insert
    fun inserAll(vararg post: Post)

    @get:Query("SELECT * FROM post")
    val allPosts: List<Post>
}