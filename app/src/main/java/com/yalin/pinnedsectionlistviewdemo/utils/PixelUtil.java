package com.yalin.pinnedsectionlistviewdemo.utils;

import android.content.Context;

/**
 * 作者：YaLin
 * 日期：2016/10/11.
 */

public class PixelUtil {
    public static int dp2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
