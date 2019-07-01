package com.darklabs.darkbasemvvm.data.remote

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
class AppApiHelper @Inject constructor(private val mApiInterface: ApiInterface) : ApiHelper {

    override fun doPostsApiCall(): Observable<List<Post>> {
        return mApiInterface.getPosts()
    }
}