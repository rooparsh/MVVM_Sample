package com.darklabs.darkbasemvvm.ui.post

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.annotation.StringRes
import android.support.design.widget.Snackbar
import android.view.View
import com.darklabs.darkbasemvvm.BR
import com.darklabs.darkbasemvvm.R
import com.darklabs.darkbasemvvm.ui.base.BaseActivity
import com.darklabs.darkbasemvvm.databinding.ActivityPostListBinding
import com.darklabs.darkbasemvvm.ViewModelFactory
import kotlinx.android.synthetic.main.activity_post_list.*
import javax.inject.Inject

class PostListActivity : BaseActivity<ActivityPostListBinding, PostListViewModel>() {

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_post_list
    }

    override fun getViewModel(): PostListViewModel {
        mViewModel = ViewModelProviders.of(this, factory).get(PostListViewModel::class.java)
        return mViewModel as PostListViewModel
    }

    private lateinit var mSnackBar: Snackbar


    @Inject
    lateinit var factory: ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel?.errorMessage?.observe(
            this,
            Observer { errorMessage ->
                errorMessage?.let {
                    showError(it)
                } ?: kotlin.run { hideError() }
            })
    }

    private fun hideError() {
        mSnackBar.dismiss()
    }

    private fun showError(@StringRes error: Int) {
        /*mSnackBar = Snackbar.make(mBinding.root, error, Snackbar.LENGTH_INDEFINITE).also {
            it.setAction("Retry", mViewModel.errorClickListener)
            it.show()
        }*/
    }
}
