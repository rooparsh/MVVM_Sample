package com.darklabs.darkbasemvvm.data.remote

import com.darklabs.darkbasemvvm.data.model.Post
import io.reactivex.Observable

/**
 *
 * Created by Rooparsh Kalia on 2019-06-29
 *
 **/
interface ApiHelper {

    fun doPostsApiCall(): Observable<List<Post>>
}