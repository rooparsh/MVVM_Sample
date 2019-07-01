package com.darklabs.darkbasemvvm.ui.base

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.databinding.ObservableBoolean
import android.view.View
import com.darklabs.darkbasemvvm.data.DataManager
import com.darklabs.darkbasemvvm.util.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable

/**
 *
 * Created by Rooparsh Kalia on 2019-05-05
 *
 **/
abstract class BaseViewModel(
    private val mDataManager: DataManager,
    private val mSchedulerProvider: SchedulerProvider
) :
    ViewModel() {

    private var mCompositeDisposable: CompositeDisposable = CompositeDisposable()
    private var mIsLoading: ObservableBoolean = ObservableBoolean()

    var loadingVisibility: MutableLiveData<Int> = MutableLiveData()
    val errorMessage: MutableLiveData<Int> = MutableLiveData()
    val errorClickListener = View.OnClickListener { retryClickListener() }


    override fun onCleared() {
        this.mCompositeDisposable.dispose()
        super.onCleared()
    }

    fun getCompositeDisposable(): CompositeDisposable {
        return mCompositeDisposable
    }

    fun getIsLoading(): ObservableBoolean {
        return mIsLoading
    }

    fun getLoadingVisibility(): Int {
        return loadingVisibility.value!!
    }

    fun setIsLoading(isLoading: Boolean) {
        this.mIsLoading.set(isLoading)
    }

    fun getSchedulerProvider(): SchedulerProvider {
        return mSchedulerProvider
    }

    fun getDataManager(): DataManager {
        return mDataManager
    }


    abstract fun retryClickListener()
}