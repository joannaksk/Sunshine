package com.example.joanna.sunshine.app;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by joanna on 30/06/16.
 */
public class MyView extends View {
    public MyView (Context context) {
        super(context);
    }
    public MyView (Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
    public MyView (Context context, AttributeSet attributeSet, int defaultStyle) {
        super(context, attributeSet, defaultStyle);
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int hSpecMode = MeasureSpec.getMode(heightMeasureSpec);
        int hSpecSize = MeasureSpec.getSize(heightMeasureSpec);
        int myHeight = hSpecSize;

        if (hSpecMode == MeasureSpec.EXACTLY)
            myHeight = hSpecSize/2;
        else if (hSpecMode == MeasureSpec.AT_MOST)
            myHeight = hSpecSize/4;

        int wSpecMode = MeasureSpec.getMode(widthMeasureSpec);
        int wSpecSize = MeasureSpec.getSize(widthMeasureSpec);
        int myWidth = wSpecSize;

        if (hSpecMode == MeasureSpec.EXACTLY)
            myWidth = wSpecSize/2;
        else if (hSpecMode == MeasureSpec.AT_MOST)
            myWidth = wSpecSize/4;
    }

    @Override
    protected void onDraw(Canvas canvas) {

    }
}
