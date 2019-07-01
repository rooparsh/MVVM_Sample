package com.darklabs.darkbasemvvm.util.rx

import io.reactivex.Scheduler

/**
 *
 * Created by Rooparsh Kalia on 2019-06-29
 *
 **/
interface SchedulerProvider {

    fun computation(): Scheduler

    fun io(): Scheduler

    fun ui(): Scheduler
}