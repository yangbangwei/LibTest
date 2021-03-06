package com.android.aachulk.utils

import android.graphics.drawable.Drawable
import android.widget.TextView

/**
 * TextView设置图片
 *
 * @author yangbw
 * @date 2020/9/1
 */
@Suppress("unused")
class DrawableUtils {
    companion object {
        fun setDrawableTop(
            tv: TextView,
            drawable: Drawable
        ) {
            drawable.setBounds(0, 0, drawable.minimumWidth, drawable.minimumHeight)
            tv.setCompoundDrawables(null, drawable, null, null)
        }

        fun setDrawableLeft(
            tv: TextView,
            drawable: Drawable
        ) {
            drawable.setBounds(0, 0, drawable.minimumWidth, drawable.minimumHeight)
            tv.setCompoundDrawables(drawable, null, null, null)
        }

        fun setDrawableRight(
            tv: TextView,
            drawable: Drawable
        ) {
            drawable.setBounds(0, 0, drawable.minimumWidth, drawable.minimumHeight)
            tv.setCompoundDrawables(null, null, drawable, null)
        }

        fun setDrawableNull(tv: TextView) {
            tv.setCompoundDrawables(null, null, null, null)
        }
    }
}