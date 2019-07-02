package com.darklabs.darkbasemvvm.data.local.db

import com.darklabs.darkbasemvvm.data.model.Post
import io.reactivex.Observable


/**
 *
 * Created by Rooparsh Kalia on 2019-06-29
 *
 **/
interface DbHelper {

    fun savePostsInDatabase(posts: List<Post>): Observable<Boolean>
}