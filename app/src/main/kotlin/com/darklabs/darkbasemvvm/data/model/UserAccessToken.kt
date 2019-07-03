package com.darklabs.darkbasemvvm.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *
 * Created by Rooparsh Kalia on 2019-07-02
 *
 **/

@Entity
data class UserAccessToken(
    @field:PrimaryKey
    val accessToken: String
)