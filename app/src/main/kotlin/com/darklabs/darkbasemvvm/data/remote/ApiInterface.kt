package com.darklabs.darkbasemvvm.data.remote

import com.darklabs.darkbasemvvm.data.model.Post
import com.darklabs.darkbasemvvm.data.remote.ENDPOINT_POSTS
import io.reactivex.Observable
import retrofit2.http.GET

/**
 *
 * Created by Rooparsh Kalia on 2019-05-05
 *
 **/
interface ApiInterface {

    @GET(ENDPOINT_POSTS)
    fun getPosts(): Observable<List<Post>>
}