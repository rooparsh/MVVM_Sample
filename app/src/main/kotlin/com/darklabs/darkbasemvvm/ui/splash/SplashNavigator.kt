package com.darklabs.darkbasemvvm.ui.splash

import com.darklabs.darkbasemvvm.ui.base.BaseNavigator

/**
 *
 * Created by Rooparsh Kalia on 2019-08-05
 *
 **/
interface SplashNavigator : BaseNavigator {

    fun showRootDialog()

    fun registerForFcmToken()
}