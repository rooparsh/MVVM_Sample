package com.darklabs.darkbasemvvm.ui.post

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.darklabs.darkbasemvvm.R
import com.darklabs.darkbasemvvm.data.model.Post
import com.darklabs.darkbasemvvm.databinding.ItemPostBinding
import com.darklabs.darkbasemvvm.ui.base.BaseViewHolder

/**
 *
 * Created by Rooparsh Kalia on 2019-08-05
 *
 **/
class PostListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var mDataList: List<Post>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_post,
            parent,
            false
        ) as ItemPostBinding

        return PostViewHolder(binding)
    }

    override fun getItemCount(): Int = if (::mDataList.isInitialized) mDataList.size else 0


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PostViewHolder).bindView(holder.adapterPosition)
    }

    fun updatePostList(list: List<Post>) {
        this.mDataList = ArrayList(list)
        notifyDataSetChanged()
    }

    inner class PostViewHolder(private val binding: ItemPostBinding) : BaseViewHolder(binding.root) {

        private val viewModel = PostViewModel()
        override fun bindView(position: Int) {
            viewModel.bind(mDataList[position])
            binding.viewModel = viewModel
        }

    }
}