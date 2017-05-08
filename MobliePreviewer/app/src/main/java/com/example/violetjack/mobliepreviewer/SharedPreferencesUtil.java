package com.example.violetjack.mobliepreviewer;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * SharedPreferences工具
 *
 * @author Violetjack
 */
public class SharedPreferencesUtil {

    private static final String SP_NAME = "Mobile_Previewer_SP";

    /**
     * 设置SharedPreferences
     *
     * @param context：Context
     * @param key：键
     * @param value：值
     */
    public static void setSP(Context context, String key, int value) {
        Editor et = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE).edit();
        et.putInt(key, value);
        et.apply();
    }

    /**
     * 设置SharedPreferences
     *
     * @param context：Context
     * @param key：键
     * @param value：值
     */
    public static void setSP(Context context, String key, String value) {
        Editor et = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE).edit();
        et.putString(key, value);
        et.apply();
    }

    /**
     * 设置SharedPreferences
     *
     * @param context：Context
     * @param key：键
     * @param value：值
     */
    public static void setSP(Context context, String key, Boolean value) {
        Editor et = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE).edit();
        et.putBoolean(key, value);
        et.apply();
    }

    /**
     * 获取SharedPreferences
     *
     * @param context：Context
     * @param key：键
     * @param defaultValue：值
     * @return 值
     */
    public static int getSP(Context context, String key, int defaultValue) {
        SharedPreferences sp = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        return sp.getInt(key, defaultValue);
    }


    /**
     * 获取SharedPreferences
     *
     * @param context：Context
     * @param key：键
     * @param defaultValue：值
     * @return 值
     */
    public static String getSP(Context context, String key, String defaultValue) {
        SharedPreferences sp = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        return sp.getString(key, defaultValue);
    }

    /**
     * 获取SharedPreferences
     *
     * @param context：Context
     * @param key：键
     * @param defaultValue：值
     * @return 值
     */
    public static boolean getSP(Context context, String key, Boolean defaultValue) {
        SharedPreferences sp = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        return sp.getBoolean(key, defaultValue);
    }

    /**
     * 移除SharedPreferences
     *
     * @param context：Context
     * @param key：键
     */
    public static void removeSP(Context context, String key) {
        Editor et = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE).edit();
        et.remove(key);
        et.apply();
    }

    /**
     * 清除SharedPreferences
     *
     * @param context：Context
     */
    public static void clearSP(Context context) {
        Editor et = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE).edit();
        et.clear();
        et.apply();
    }

}