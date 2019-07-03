package com.darklabs.darkbasemvvm.di.builder

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.darklabs.darkbasemvvm.di.ViewModelFactory
import com.darklabs.darkbasemvvm.di.info.ViewModelInfo
import com.darklabs.darkbasemvvm.ui.post.PostListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 *
 * Created by Rooparsh Kalia on 2019-07-02
 *
 **/

@Module
internal abstract class ViewModuleBuilder {


    @Binds
    @IntoMap
    @ViewModelInfo(PostListViewModel::class)
    protected abstract fun postListViewModel(viewModel: PostListViewModel): ViewModel

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory


}