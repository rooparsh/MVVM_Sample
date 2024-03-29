package com.darklabs.darkbasemvvm.di.builder

import com.darklabs.darkbasemvvm.ui.post.PostListActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 *
 * Created by Rooparsh Kalia on 2019-06-29
 *
 **/

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun bindPostListActivity(): PostListActivity
}