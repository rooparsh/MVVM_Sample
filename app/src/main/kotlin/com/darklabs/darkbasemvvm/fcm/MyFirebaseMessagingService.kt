package com.darklabs.darkbasemvvm.fcm

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

/**
 *
 * Created by Rooparsh Kalia on 2019-08-05
 *
 **/
object MyFirebaseMessagingService : FirebaseMessagingService() {


    private lateinit var mCallback: FCMCallback
    private val TAG = MyFirebaseMessagingService::class.java.name


    fun setCallback(callback: FCMCallback) {
        this.mCallback = callback
    }

    override fun onNewToken(token: String?) {
        super.onNewToken(token)
    }


    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)


    }

    interface FCMCallback {
        fun onTokenReceived(token: String)
    }
}