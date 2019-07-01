package com.darklabs.darkbasemvvm.ui.post

import com.darklabs.darkbasemvvm.R
import com.darklabs.darkbasemvvm.data.DataManager
import com.darklabs.darkbasemvvm.data.model.Post
import com.darklabs.darkbasemvvm.ui.base.BaseViewModel
import com.darklabs.darkbasemvvm.util.rx.SchedulerProvider

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
                .doAfterTerminate { hideLoading() }
                .subscribe({ result -> onRetrievePostListSuccess(result as List<Post>) }, { onRetrievePostListError() })
        )
    }

    private fun hideLoading() {
        setIsLoading(false)
    }

    private fun showLoading() {
        setIsLoading(true)
    }

    private fun onRetrievePostListSuccess(postList: List<Post>) {
        //postListAdapter.updatePostList(postList)
    }

    private fun onRetrievePostListError() {
        errorMessage.value = R.string.post_error
    }
}