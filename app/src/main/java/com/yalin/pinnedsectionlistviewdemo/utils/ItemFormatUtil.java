package com.yalin.pinnedsectionlistviewdemo.utils;

import com.yalin.pinnedsectionlistviewdemo.model.ItemModel;
import com.yalin.pinnedsectionlistviewdemo.model.TimelineModel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * 作者：YaLin
 * 日期：2016/10/11.
 */

public class ItemFormatUtil {
    /**
     * 将item列表按日期组装，即为itemModelList生成相应的TimelineModel，放入同一个List中
     *
     * @param itemModels 待面试列表
     * @return 组装后的包含日期tag的待面试列表
     */
    public static List<Object> assembleItemDatas(List<ItemModel> itemModels) {
        if (itemModels == null || itemModels.isEmpty()) {
            return null;
        }
        List<Object> objects = new ArrayList<>();
        appendItemWithTag(objects, itemModels);

        return objects;
    }

    /**
     * 组装的实现方法
     *
     * @param objects           组装进的列表
     * @param orderedItemModels 待面试列表
     */
    private static void appendItemWithTag(List<Object> objects, List<ItemModel> orderedItemModels) {
        Calendar calendar = Calendar.getInstance();
        boolean firstTag = objects.size() == 0;
        for (ItemModel itemModel : orderedItemModels) {
            Calendar tagCalendar = (Calendar) calendar.clone();
            tagCalendar.setTimeInMillis(itemModel.time);
            tagCalendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
            TimelineModel timelineModel = new TimelineModel(tagCalendar);
            if (!objects.contains(timelineModel)) {
                timelineModel.setType(firstTag ? TimelineModel.TYPE_TOP : TimelineModel.TYPE_DAY_JOINT);
                firstTag = false;
            } else {
                timelineModel.setType(TimelineModel.TYPE_ITEM_JOINT);
            }
            objects.add(timelineModel);
            objects.add(itemModel);
        }
    }

    /**
     * 将以有的组装好的（包含TimelineModel和ItemModel）的List，添加新的ItemModel
     *
     * @param origin        已有的List
     * @param newInterviews 新增加的
     * @return 新组装的List
     */
    public static List<Object> mergePendingInterviewDatas(List<Object> origin,
                                                          List<ItemModel> newInterviews) {
        if (origin == null || origin.size() == 0) {
            return assembleItemDatas(newInterviews);
        }
        appendItemWithTag(origin, newInterviews);
        return origin;
    }
}
