package com.darklabs.darkbasemvvm.data

import com.darklabs.darkbasemvvm.data.local.db.DbHelper
import com.darklabs.darkbasemvvm.data.model.Post
import com.darklabs.darkbasemvvm.data.remote.ApiHelper
import io.reactivex.Observable

/**
 *
 * Created by Rooparsh Kalia on 2019-06-29
 *
 **/
interface DataManager : DbHelper, ApiHelper {

    //fun doPostsApiCall(): Observable<List<Post>>
}