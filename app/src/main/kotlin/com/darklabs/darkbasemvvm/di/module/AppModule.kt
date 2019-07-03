package com.darklabs.darkbasemvvm.di.module

import android.content.Context
import androidx.room.Room
import com.darklabs.darkbasemvvm.MyApplication
import com.darklabs.darkbasemvvm.data.DataManager
import com.darklabs.darkbasemvvm.data.DataManagerImpl
import com.darklabs.darkbasemvvm.data.local.db.AppDatabase
import com.darklabs.darkbasemvvm.data.local.db.AppDbHelper
import com.darklabs.darkbasemvvm.data.local.db.DbHelper
import com.darklabs.darkbasemvvm.data.remote.ApiHelper
import com.darklabs.darkbasemvvm.data.remote.AppApiHelper
import com.darklabs.darkbasemvvm.di.info.DatabaseInfo
import com.darklabs.darkbasemvvm.util.DATABASE_NAME
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
    internal fun provideApiHelper(apiHelper: AppApiHelper): ApiHelper = apiHelper

    @Provides
    @Singleton
    @JvmStatic
    internal fun provideDataManager(dataManagerImpl: DataManagerImpl): DataManager = dataManagerImpl


    @Provides
    @Singleton
    @JvmStatic
    internal fun provideContext(application: MyApplication): Context = application


    @Provides
    @Singleton
    @JvmStatic
    internal fun provideSchedulerProvider(): SchedulerProvider = SchedulerProviderImpl()


    @Provides
    @Singleton
    @JvmStatic
    @DatabaseInfo
    internal fun provideDatabaseName(): String = DATABASE_NAME


    @Provides
    @Singleton
    @JvmStatic
    internal fun providesDbHelper(appDbHelper: AppDbHelper): DbHelper = appDbHelper


    @Provides
    @Singleton
    @JvmStatic
    internal fun providesDatabase(@DatabaseInfo dbName: String, context: Context) =
        Room.databaseBuilder(context, AppDatabase::class.java, dbName).fallbackToDestructiveMigration()
            .build()

}