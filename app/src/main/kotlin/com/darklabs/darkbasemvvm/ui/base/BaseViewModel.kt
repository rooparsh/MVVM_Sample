package com.darklabs.darkbasemvvm.ui.base

import android.view.View
import androidx.databinding.ObservableBoolean
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
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
    //private lateinit var mNavigator: WeakReference<N>

    val errorMessage: MutableLiveData<Int> = MutableLiveData()
    val errorClickListener = View.OnClickListener { retryClickListener() }


    override fun onCleared() {
        this.mCompositeDisposable.dispose()
        super.onCleared()
    }

    fun getCompositeDisposable(): CompositeDisposable = mCompositeDisposable

    fun getIsLoading(): ObservableBoolean = mIsLoading

    fun setIsLoading(isLoading: Boolean) {
        this.mIsLoading.set(isLoading)
    }

    fun getSchedulerProvider(): SchedulerProvider = mSchedulerProvider

    fun getDataManager(): DataManager = mDataManager

    /*fun getNavigator(): N? = mNavigator.get()

    fun setNavigator(navigator: N) {
        this.mNavigator = WeakReference(navigator)
    }*/

    abstract fun retryClickListener()
}