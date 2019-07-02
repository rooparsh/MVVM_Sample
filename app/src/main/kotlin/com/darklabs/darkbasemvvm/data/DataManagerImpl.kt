package com.darklabs.darkbasemvvm.data

import com.darklabs.darkbasemvvm.data.local.db.AppDbHelper
import com.darklabs.darkbasemvvm.data.model.Post
import com.darklabs.darkbasemvvm.data.remote.ApiHelper
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

/**
 *
 * Created by Rooparsh Kalia on 2019-06-29
 *
 **/

@Singleton
class DataManagerImpl @Inject constructor(
    private val mDbHelper: AppDbHelper,
    private val mApiHelper: ApiHelper
) : DataManager {


    override fun savePostsInDatabase(posts: List<Post>): Observable<Boolean> {
        return mDbHelper.savePostsInDatabase(posts)
    }

    override fun doPostsApiCall(): Observable<List<Post>> {
        return mApiHelper.doPostsApiCall()
    }

}