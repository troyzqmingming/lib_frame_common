package com.cya.lib.frame.commom.view.toolbar

import android.support.v7.widget.Toolbar
import android.view.ViewGroup

interface ToolbarView {

    fun getToolBarView(): Toolbar

    fun getToolBarRoot() : ViewGroup
}