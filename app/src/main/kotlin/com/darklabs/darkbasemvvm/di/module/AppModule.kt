package com.darklabs.darkbasemvvm.di.module

import android.content.Context
import com.darklabs.darkbasemvvm.MyApplication
import com.darklabs.darkbasemvvm.data.DataManager
import com.darklabs.darkbasemvvm.data.DataManagerImpl
import com.darklabs.darkbasemvvm.data.remote.ApiHelper
import com.darklabs.darkbasemvvm.data.remote.AppApiHelper
import com.darklabs.darkbasemvvm.util.rx.SchedulerProvider
import com.darklabs.darkbasemvvm.util.rx.SchedulerProviderImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 *
 * Created by Rooparsh Kalia on 2019-06-29
 *
 **/
@Module
object AppModule {

    @Provides
    @Singleton
    @JvmStatic
    internal fun provideApiHelper(apiHelper: AppApiHelper): ApiHelper {
        return apiHelper
    }

    @Provides
    @Singleton
    @JvmStatic
    internal fun provideDataManager(dataManagerImpl: DataManagerImpl): DataManager {
        return dataManagerImpl
    }


    @Provides
    @Singleton
    @JvmStatic
    internal fun provideContext(application: MyApplication): Context {
        return application
    }

    @Provides
    @Singleton
    @JvmStatic
    internal fun provideSchedulerProvider(): SchedulerProvider {
        return SchedulerProviderImpl()
    }

}