package com.darklabs.darkbasemvvm.ui.splash

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.darklabs.darkbasemvvm.BR
import com.darklabs.darkbasemvvm.R
import com.darklabs.darkbasemvvm.databinding.ActivitySplashBinding
import com.darklabs.darkbasemvvm.ui.base.BaseActivity
import com.google.firebase.iid.FirebaseInstanceId

class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>(), SplashNavigator {

    override fun showRootDialog() {

    }

    override fun getBindingVariable(): Int = BR.viewModel

    override fun getLayoutId(): Int = R.layout.activity_splash

    override fun getViewModel(): SplashViewModel = ViewModelProviders.of(this).get(SplashViewModel::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getViewModel().setNavigator(this)
        FirebaseInstanceId.getInstance().instanceId.addOnSuccessListener(this) { }
    }
}
