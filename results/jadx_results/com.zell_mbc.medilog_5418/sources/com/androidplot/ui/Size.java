package com.androidplot.ui;

import android.graphics.RectF;
/* loaded from: classes2.dex */
public class Size {
    public static Size FILL = new Size(0.0f, SizeMode.FILL, 0.0f, SizeMode.FILL);
    private SizeMetric height;
    private SizeMetric width;

    public Size(float f, SizeMode sizeMode, float f2, SizeMode sizeMode2) {
        this.height = new SizeMetric(f, sizeMode);
        this.width = new SizeMetric(f2, sizeMode2);
    }

    public Size(SizeMetric sizeMetric, SizeMetric sizeMetric2) {
        this.height = sizeMetric;
        this.width = sizeMetric2;
    }

    public SizeMetric getHeight() {
        return this.height;
    }

    public void setHeight(SizeMetric sizeMetric) {
        this.height = sizeMetric;
    }

    public SizeMetric getWidth() {
        return this.width;
    }

    public RectF getRectF(RectF rectF) {
        return new RectF(0.0f, 0.0f, this.width.getPixelValue(rectF.width()), this.height.getPixelValue(rectF.height()));
    }

    public void setWidth(SizeMetric sizeMetric) {
        this.width = sizeMetric;
    }
}
