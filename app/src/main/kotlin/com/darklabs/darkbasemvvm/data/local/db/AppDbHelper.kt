package com.darklabs.darkbasemvvm.data.local.db

import com.darklabs.darkbasemvvm.data.model.Post
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

/**
 *
 * Created by Rooparsh Kalia on 2019-06-29
 *
 **/

@Singleton
class AppDbHelper @Inject constructor(private val mAppDatabase: AppDatabase) : DbHelper {

    override fun savePostsInDatabase(posts: List<Post>): Observable<Boolean> {
        return Observable.fromCallable {
            mAppDatabase.postDao().insertAll(posts)
            true
        }
    }


}