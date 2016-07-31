package com.francis.customviewdemo;

import android.app.Activity;
import android.util.DisplayMetrics;

/**
 * 测绘工具类
 * @author dream @ Zhihu Inc.
 * @since 07-31-2016
 */
public class MeasureUtil {

	public static int[] getScreenSize(Activity activity){
		DisplayMetrics metrics = new DisplayMetrics();
		activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
		return new int[] {metrics.widthPixels, metrics.heightPixels};
	}
}
