package com.yalin.pinnedsectionlistviewdemo.utils;

import android.content.Context;

import com.yalin.pinnedsectionlistviewdemo.R;

import java.util.Calendar;

/**
 * 作者：YaLin
 * 日期：2016/10/11.
 */

public class DateUtil {
    /**
     * 判断两个Calendar对象是否是同一天
     *
     * @param left  left
     * @param right right
     * @return 如果是同一天 返回 true 否则false
     */
    public static boolean isSampleDay(Calendar left, Calendar right) {
        return left != null && right != null
                && left.get(Calendar.YEAR) == right.get(Calendar.YEAR)
                && left.get(Calendar.DAY_OF_YEAR) == right.get(Calendar.DAY_OF_YEAR);

    }

    /**
     * 将 DAY_OF_WEEK格式化为中文星期
     *
     * @param context   context
     * @param dayOfWeek dayOfWeek
     * @return 星期
     */
    public static String formatDayOfWeek(Context context, int dayOfWeek) {
        switch (dayOfWeek) {
            case Calendar.MONDAY:
                return context.getString(R.string.monday);
            case Calendar.TUESDAY:
                return context.getString(R.string.tuesday);
            case Calendar.WEDNESDAY:
                return context.getString(R.string.wednesday);
            case Calendar.THURSDAY:
                return context.getString(R.string.thursday);
            case Calendar.FRIDAY:
                return context.getString(R.string.friday);
            case Calendar.SATURDAY:
                return context.getString(R.string.saturday);
            case Calendar.SUNDAY:
                return context.getString(R.string.sunday);
            default:
                return null;
        }
    }
}
