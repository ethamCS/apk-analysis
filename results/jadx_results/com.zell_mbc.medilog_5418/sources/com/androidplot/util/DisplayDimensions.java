package com.androidplot.util;

import android.graphics.RectF;
/* loaded from: classes2.dex */
public class DisplayDimensions {
    private static final int ONE = 1;
    private static final RectF initRect = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
    public final RectF canvasRect;
    public final RectF marginatedRect;
    public final RectF paddedRect;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DisplayDimensions() {
        /*
            r1 = this;
            android.graphics.RectF r0 = com.androidplot.util.DisplayDimensions.initRect
            r1.<init>(r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidplot.util.DisplayDimensions.<init>():void");
    }

    public DisplayDimensions(RectF rectF, RectF rectF2, RectF rectF3) {
        this.canvasRect = rectF;
        this.marginatedRect = rectF2;
        this.paddedRect = rectF3;
    }
}
