package com.darklabs.darkbasemvvm.util

import android.content.Context
import android.net.ConnectivityManager

/**
 *
 * Created by Rooparsh Kalia on 2019-08-05
 *
 **/
object NetworkUtils {


    fun isNetworkConnected(context: Context): Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        cm.let {
            val activeNetwork = it.activeNetworkInfo
            return activeNetwork != null && activeNetwork.isConnected
        }

    }
}