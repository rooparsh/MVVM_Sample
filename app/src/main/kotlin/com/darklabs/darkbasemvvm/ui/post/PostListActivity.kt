package com.darklabs.darkbasemvvm.ui.post

import android.os.Bundle
import androidx.annotation.StringRes
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.darklabs.darkbasemvvm.BR
import com.darklabs.darkbasemvvm.R
import com.darklabs.darkbasemvvm.databinding.ActivityPostListBinding
import com.darklabs.darkbasemvvm.ui.base.BaseActivity
import com.google.android.material.snackbar.Snackbar

class PostListActivity : BaseActivity<ActivityPostListBinding, PostListViewModel>(), PostListNavigator {


    override fun openNextActivity() {

    }

    override fun getBindingVariable(): Int = BR.viewModel

    override fun getLayoutId(): Int = R.layout.activity_post_list

    override fun getViewModel(): PostListViewModel =
        ViewModelProviders.of(this, factory).get(PostListViewModel::class.java)


    private lateinit var mSnackBar: Snackbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getViewModel().errorMessage.observe(
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
        /*mSnackBar = Snackbar.make(this.root, error, Snackbar.LENGTH_INDEFINITE).also {
            it.setAction("Retry", mViewModel.errorClickListener)
            it.show()
        }*/
    }
}
