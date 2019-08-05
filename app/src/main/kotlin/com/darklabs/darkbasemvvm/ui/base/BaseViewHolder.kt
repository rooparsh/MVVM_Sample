package com.darklabs.darkbasemvvm.ui.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 *
 * Created by Rooparsh Kalia on 2019-08-05
 *
 **/
abstract class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    abstract fun bindView(position: Int)
}