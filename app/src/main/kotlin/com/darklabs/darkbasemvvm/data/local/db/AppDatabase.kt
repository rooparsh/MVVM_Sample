package com.darklabs.darkbasemvvm.data.local.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.darklabs.darkbasemvvm.data.local.db.dao.PostDao
import com.darklabs.darkbasemvvm.data.model.Post

/**
 *
 * Created by Rooparsh Kalia on 2019-05-05
 *
 **/
@Database(entities = [Post::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun postDao(): PostDao
}