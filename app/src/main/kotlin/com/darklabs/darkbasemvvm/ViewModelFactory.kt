package com.darklabs.darkbasemvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.darklabs.darkbasemvvm.data.DataManager
import com.darklabs.darkbasemvvm.ui.post.PostListViewModel
import com.darklabs.darkbasemvvm.util.rx.SchedulerProvider
import javax.inject.Inject
import javax.inject.Singleton

/**
 *
 * Created by Rooparsh Kalia on 2019-05-05
 *
 **/

@Singleton
class ViewModelFactory
@Inject constructor(
    private val mDataManager: DataManager,
    private val mSchedulerProvider: SchedulerProvider
) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PostListViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return PostListViewModel(mDataManager, mSchedulerProvider) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class") as Throwable
    }
}