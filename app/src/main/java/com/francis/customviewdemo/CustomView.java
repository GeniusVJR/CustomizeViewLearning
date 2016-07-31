package com.francis.customviewdemo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author dream @ Zhihu Inc.
 * @since 07-31-2016
 */
public class CustomView extends View{

	private Paint mPaint;
	private Context mContext;   //上下文环境引用

	private int radius = 200;   //圆环半径

	public CustomView(Context context) {
		super(context);
	}

	public CustomView(Context context, AttributeSet attrs) {
		super(context, attrs);
		mContext = context;
		//初始化画笔
		initPaint();
	}

	/**
	 * 初始化画笔
	 */
	private void initPaint() {

		//实例化画笔并打开抗锯齿
		mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		//设置画笔样式为描边
		mPaint.setStyle(Paint.Style.STROKE);
		//设置画笔颜色为浅灰色
		mPaint.setColor(Color.BLACK);
		/**
		 * 设置描边的粗细，单位，像素px
		 */
		mPaint.setStrokeWidth(10);

		//绘制圆环

	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		//绘制圆环
		canvas.drawCircle(MeasureUtil.getScreenSize((Activity) mContext)[0] / 2, MeasureUtil.getScreenSize((Activity) mContext)[1] / 2, radius, mPaint);
	}
}
