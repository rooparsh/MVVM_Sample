package com.darklabs.darkbasemvvm.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.darklabs.darkbasemvvm.data.local.db.dao.PostDao
import com.darklabs.darkbasemvvm.data.model.Post

/**
 *
 * Created by Rooparsh Kalia on 2019-05-05
 *
 **/
@Database(entities = [Post::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun postDao(): PostDao
}