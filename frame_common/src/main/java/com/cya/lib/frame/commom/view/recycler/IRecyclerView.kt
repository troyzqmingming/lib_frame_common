package com.cya.lib.frame.commom.view.recycler

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

interface IRecyclerView<out V : RecyclerView, VH : RecyclerView.ViewHolder, out A : RecyclerView.Adapter<VH>> {

    fun getRecyclerView(): V

    fun getRecyclerRootView(): ViewGroup

    fun getLayoutManager(): RecyclerView.LayoutManager

    fun getAdapter(): A

}