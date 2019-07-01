package com.darklabs.darkbasemvvm

import android.app.Activity
import com.darklabs.darkbasemvvm.di.component.DaggerAppInjector
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject

/**
 *
 * Created by Rooparsh Kalia on 2019-06-29
 *
 **/

open class MyApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out MyApplication> {
        return DaggerAppInjector.builder().create(this)
    }


    @Inject
    internal lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): DispatchingAndroidInjector<Activity> {
        return activityDispatchingAndroidInjector
    }


    override fun onCreate() {
        super.onCreate()
    }

}