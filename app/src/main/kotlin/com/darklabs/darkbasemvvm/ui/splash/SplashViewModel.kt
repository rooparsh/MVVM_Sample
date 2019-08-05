package com.darklabs.darkbasemvvm.ui.splash

import com.darklabs.darkbasemvvm.data.DataManager
import com.darklabs.darkbasemvvm.ui.base.BaseViewModel
import com.darklabs.darkbasemvvm.util.RootUtil
import com.darklabs.darkbasemvvm.util.rx.SchedulerProvider
import javax.inject.Inject

/**
 *
 * Created by Rooparsh Kalia on 2019-08-05
 *
 **/
class SplashViewModel @Inject constructor(mDataManager: DataManager, mSchedulerProvider: SchedulerProvider) :
    BaseViewModel<SplashNavigator>(mDataManager, mSchedulerProvider) {



    init {
        if (RootUtil.isDeviceRooted()) {
            getNavigator().showRootDialog()
        }
    }


    override fun retryClickListener() {

    }
}