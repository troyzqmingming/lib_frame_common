package com.cya.lib.frame.commom.view.recycler

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

class AgentRecyclerView {

    private lateinit var context: Context
    private lateinit var parentView: ViewGroup

    private constructor(context: Context) {
        this@AgentRecyclerView.context = context
    }

    companion object {
        fun with(context: Context): AgentRecyclerView {
            return AgentRecyclerView(context)
        }
    }

    fun setParentRootView(parentView: ViewGroup): AgentRecyclerView {
        this@AgentRecyclerView.parentView = parentView
        return this
    }

    fun <V : RecyclerView, VH : RecyclerView.ViewHolder, A : RecyclerView.Adapter<VH>> build(iRecyclerView: IRecyclerView<V, VH, A>) {
        val recyclerView = iRecyclerView.getRecyclerView()
        recyclerView.layoutManager = iRecyclerView.getLayoutManager()
        this@AgentRecyclerView.parentView.addView(iRecyclerView.getRecyclerRootView())
        recyclerView.adapter = iRecyclerView.getAdapter()
    }
}
