package com.darklabs.darkbasemvvm.data

import com.darklabs.darkbasemvvm.data.local.db.DbHelper
import com.darklabs.darkbasemvvm.data.remote.ApiHelper

/**
 *
 * Created by Rooparsh Kalia on 2019-06-29
 *
 **/
interface DataManager : DbHelper, ApiHelper {

}