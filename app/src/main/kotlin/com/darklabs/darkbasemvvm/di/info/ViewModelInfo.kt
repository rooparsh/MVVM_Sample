package com.darklabs.darkbasemvvm.di.info

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

/**
 *
 * Created by Rooparsh Kalia on 2019-07-02
 *
 **/

@Target(
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.FUNCTION
)
@MapKey
annotation class ViewModelInfo(val value: KClass<out ViewModel>)