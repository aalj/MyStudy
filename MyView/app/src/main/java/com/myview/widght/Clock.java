package com.myview.widght;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

import com.myview.R;

/**
 * 画一个真实的钟
 */
public class Clock extends View {


    public Clock(Context context) {
        super(context);
        init(null, 0);
    }

    public Clock(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public Clock(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
        // Load attributes
        final TypedArray a = getContext().obtainStyledAttributes(
                attrs, R.styleable.Clock, defStyle, 0);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


    }


}
