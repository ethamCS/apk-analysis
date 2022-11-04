package com.androidplot.xy;

import android.graphics.Paint;
import com.androidplot.util.PixelUtils;
/* loaded from: classes2.dex */
public class PointLabelFormatter {
    private static final float DEFAULT_H_OFFSET_DP = 0.0f;
    private static final float DEFAULT_TEXT_SIZE_SP = 12.0f;
    private static final float DEFAULT_V_OFFSET_DP = -4.0f;
    public float hOffset;
    private Paint textPaint;
    public float vOffset;

    public PointLabelFormatter() {
        this(-1);
    }

    public PointLabelFormatter(int i) {
        this(i, PixelUtils.dpToPix(0.0f), PixelUtils.dpToPix(DEFAULT_V_OFFSET_DP));
    }

    public PointLabelFormatter(int i, float f, float f2) {
        initTextPaint(Integer.valueOf(i));
        this.hOffset = f;
        this.vOffset = f2;
    }

    public boolean hasTextPaint() {
        return this.textPaint != null;
    }

    public Paint getTextPaint() {
        if (this.textPaint == null) {
            initTextPaint(0);
        }
        return this.textPaint;
    }

    public void setTextPaint(Paint paint) {
        this.textPaint = paint;
    }

    protected void initTextPaint(Integer num) {
        if (num == null) {
            setTextPaint(null);
            return;
        }
        setTextPaint(new Paint());
        getTextPaint().setAntiAlias(true);
        getTextPaint().setColor(num.intValue());
        getTextPaint().setTextAlign(Paint.Align.CENTER);
        getTextPaint().setTextSize(PixelUtils.spToPix(DEFAULT_TEXT_SIZE_SP));
    }
}
