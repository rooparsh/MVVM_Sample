package com.darklabs.darkbasemvvm.ui.post

import android.view.View
import com.darklabs.darkbasemvvm.R
import com.darklabs.darkbasemvvm.ui.base.BaseViewModel
import com.darklabs.darkbasemvvm.data.DataManager
import com.darklabs.darkbasemvvm.data.model.Post
import com.darklabs.darkbasemvvm.data.remote.ApiInterface
import com.darklabs.darkbasemvvm.util.rx.SchedulerProvider
import javax.inject.Inject

/**
 *
 * Created by Rooparsh Kalia on 2019-05-05
 *
 **/
class PostListViewModel(
    mDataManager: DataManager,
    mSchedulerProvider: SchedulerProvider
) : BaseViewModel(mDataManager, mSchedulerProvider) {

    override fun retryClickListener() {
        loadPosts()
    }


    @Inject
    lateinit var apiInterface: ApiInterface


    init {
        loadPosts()
    }


    private fun loadPosts() {
        getCompositeDisposable().add(
            getDataManager()
                .doPostsApiCall()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .doOnSubscribe { showLoading() }
                .doOnTerminate { hideLoading() }
                .subscribe({ result -> onRetrievePostListSuccess(result as List<Post>) }, { onRetrievePostListError() })
        )
    }

    private fun hideLoading() {
        loadingVisibility.value = View.GONE
    }

    private fun showLoading() {
        loadingVisibility.value = View.VISIBLE
    }

    private fun onRetrievePostListSuccess(postList: List<Post>) {
        //postListAdapter.updatePostList(postList)
    }

    private fun onRetrievePostListError() {
        errorMessage.value = R.string.post_error
    }
}