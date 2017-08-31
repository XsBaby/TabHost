package com.xushuai.tabhost.utils;

import com.xushuai.tabhost.R;
import com.xushuai.tabhost.fragment.HomePageFragment;
import com.xushuai.tabhost.fragment.MineFragment;
import com.xushuai.tabhost.fragment.ShopCarFragment;
import com.xushuai.tabhost.fragment.TypeFragment;

public class TabDb {
    /***
     * 获得底部所有项
     */
    public static String[] getTabsTxt() {
        String[] tabs = {"首页", "分类", "购物车", "个人"};
        return tabs;
    }

    /***
     * 获得所有Fragment
     */
    public static Class[] getFramgent() {
        Class[] cls = {HomePageFragment.class, TypeFragment.class, ShopCarFragment.class, MineFragment.class};
        return cls;
    }

    /***
     * 获得所有点击前的图片
     */
    public static int[] getTabsImg() {
        int[] img = {R.drawable.ic_nav_home, R.drawable.ic_nav_class, R.drawable.ic_nav_cart, R.drawable.ic_nav_user};
        return img;
    }

    /***
     * 获得所有点击后的图片
     */
    public static int[] getTabsImgLight() {
        int[] img = {R.drawable.ic_nav_home_press, R.drawable.ic_nav_class_press, R.drawable.ic_nav_cart_press, R.drawable.ic_nav_user_press};
        return img;
    }
}