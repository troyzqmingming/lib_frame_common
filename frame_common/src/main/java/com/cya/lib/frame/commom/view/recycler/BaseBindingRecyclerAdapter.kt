package com.cya.lib.frame.commom.view.recycler

import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

abstract class BaseBindingRecyclerAdapter<T> : RecyclerView.Adapter<BaseBindingRecyclerAdapter.BaseViewHolder> {

    abstract fun getLayoutId(): Int

    private var context: Context
    private var list: MutableList<T>

    constructor(context: Context) {
        this.context = context
        list = mutableListOf()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return BaseViewHolder(DataBindingUtil.inflate(LayoutInflater.from(context), getLayoutId(), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setList(newList: MutableList<T>, isLoadMore: Boolean) {
        if (isLoadMore) {
            list.addAll(newList)
        } else {
            list = newList
        }
        notifyDataSetChanged()
    }

    fun cleanList() {
        list.clear()
        notifyDataSetChanged()
    }

    class BaseViewHolder : RecyclerView.ViewHolder {

        var viewDataBinding: ViewDataBinding

        constructor(viewDataBinding: ViewDataBinding) : super(viewDataBinding.root) {
            this.viewDataBinding = viewDataBinding
        }

    }
}