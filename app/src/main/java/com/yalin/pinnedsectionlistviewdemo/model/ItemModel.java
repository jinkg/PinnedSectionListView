package com.yalin.pinnedsectionlistviewdemo.model;

/**
 * 作者：YaLin
 * 日期：2016/10/11.
 */

public class ItemModel {
    public long time;

    public int avatarRes;

    public String name;

    public ItemModel(long time, int avatarRes, String name) {
        this.time = time;
        this.avatarRes = avatarRes;
        this.name = name;
    }
}
