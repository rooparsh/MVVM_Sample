package com.darklabs.darkbasemvvm.di.component

import com.darklabs.darkbasemvvm.MyApplication
import com.darklabs.darkbasemvvm.di.builder.ActivityBuilder
import com.darklabs.darkbasemvvm.di.module.AppModule
import com.darklabs.darkbasemvvm.di.module.NetworkModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

/**
 *
 * Created by Rooparsh Kalia on 2019-05-05
 *
 **/
@Singleton
@Component(modules = [AndroidInjectionModule::class, NetworkModule::class, AppModule::class, ActivityBuilder::class])
interface AppInjector : AndroidInjector<MyApplication> {


    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MyApplication>()
}