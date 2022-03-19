package com.demo.test4.view.region

import android.content.Context
import android.util.DisplayMetrics
import android.view.WindowManager
import androidx.annotation.NonNull

object PhoneU {

    /**
     * 获取手机大小（分辨率）
     *
     * @param context
     * @return
     */
    @NonNull
    fun getScreenPix(@NonNull context: Context): DisplayMetrics? {
        val windowManager =
            context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        //DisplayMetrics 一个描述普通显示信息的结构，例如显示大小、密度、字体尺寸
        val displaysMetrics = DisplayMetrics()
        //获取手机窗口的Display 来初始化DisplayMetrics 对象
        //getManager()获取显示定制窗口的管理器。
        //获取默认显示Display对象
        //通过Display 对象的数据来初始化一个DisplayMetrics 对象
        windowManager.defaultDisplay.getMetrics(displaysMetrics)
        return displaysMetrics
    }


}