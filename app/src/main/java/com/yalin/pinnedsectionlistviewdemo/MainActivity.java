package com.yalin.pinnedsectionlistviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yalin.pinnedsectionlistview.PinnedSectionListView;
import com.yalin.pinnedsectionlistviewdemo.model.ItemModel;
import com.yalin.pinnedsectionlistviewdemo.utils.ItemFormatUtil;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final long ONE_DAY_TIME_MILLIS = 24 * 60 * 60 * 1000;

    private TimelineAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PinnedSectionListView pinnedSectionListView = (PinnedSectionListView) findViewById(R.id.pinned_list_view);
        pinnedSectionListView.setShadowVisible(true);

        mAdapter = new TimelineAdapter(this, null);
        pinnedSectionListView.setAdapter(mAdapter);

        addData();
    }

    private void addData() {
        long currentTime = System.currentTimeMillis();
        ItemModel[] itemModelArray = new ItemModel[]{
                new ItemModel(currentTime, R.drawable.icon1, "name0"),
                new ItemModel(currentTime, R.drawable.icon2, "name0"),
                new ItemModel(currentTime, R.drawable.icon3, "name0"),
                new ItemModel(currentTime, R.drawable.icon4, "name0"),
                new ItemModel(currentTime, R.drawable.icon5, "name0"),

                new ItemModel(currentTime - ONE_DAY_TIME_MILLIS, R.drawable.icon6, "name1"),
                new ItemModel(currentTime - ONE_DAY_TIME_MILLIS, R.drawable.icon7, "name2"),
                new ItemModel(currentTime - ONE_DAY_TIME_MILLIS, R.drawable.icon1, "name3"),
                new ItemModel(currentTime - ONE_DAY_TIME_MILLIS, R.drawable.icon2, "name4"),
                new ItemModel(currentTime - ONE_DAY_TIME_MILLIS, R.drawable.icon3, "name5"),

                new ItemModel(currentTime - 2 * ONE_DAY_TIME_MILLIS, R.drawable.icon4, "name6"),
                new ItemModel(currentTime - 2 * ONE_DAY_TIME_MILLIS, R.drawable.icon5, "name7"),
                new ItemModel(currentTime - 2 * ONE_DAY_TIME_MILLIS, R.drawable.icon6, "name8"),
                new ItemModel(currentTime - 2 * ONE_DAY_TIME_MILLIS, R.drawable.icon7, "name9"),
                new ItemModel(currentTime - 2 * ONE_DAY_TIME_MILLIS, R.drawable.icon1, "name10"),

                new ItemModel(currentTime - 3 * ONE_DAY_TIME_MILLIS, R.drawable.icon2, "name14"),
                new ItemModel(currentTime - 3 * ONE_DAY_TIME_MILLIS, R.drawable.icon3, "name15"),

                new ItemModel(currentTime - 5 * ONE_DAY_TIME_MILLIS, R.drawable.icon4, "name11"),

                new ItemModel(currentTime - 6 * ONE_DAY_TIME_MILLIS, R.drawable.icon5, "name12"),
                new ItemModel(currentTime - 6 * ONE_DAY_TIME_MILLIS, R.drawable.icon6, "name13"),

                new ItemModel(currentTime - 100 * ONE_DAY_TIME_MILLIS, R.drawable.icon7, "name16"),
                new ItemModel(currentTime - 100 * ONE_DAY_TIME_MILLIS, R.drawable.icon1, "name17"),
                new ItemModel(currentTime - 100 * ONE_DAY_TIME_MILLIS, R.drawable.icon2, "name18"),
                new ItemModel(currentTime - 100 * ONE_DAY_TIME_MILLIS, R.drawable.icon3, "name19"),
                new ItemModel(currentTime - 100 * ONE_DAY_TIME_MILLIS, R.drawable.icon4, "name20"),
        };
        List<ItemModel> itemModels = Arrays.asList(itemModelArray);
        mAdapter.getDelegate().setData(ItemFormatUtil.assembleItemDatas(itemModels));
    }
}
