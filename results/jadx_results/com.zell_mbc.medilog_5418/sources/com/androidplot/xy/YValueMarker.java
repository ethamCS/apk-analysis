package com.androidplot.xy;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.androidplot.ui.HorizontalPosition;
import com.androidplot.ui.HorizontalPositioning;
/* loaded from: classes2.dex */
public class YValueMarker extends ValueMarker<HorizontalPosition> {
    public YValueMarker(Number number, String str) {
        super(number, str, new HorizontalPosition(3.0f, HorizontalPositioning.ABSOLUTE_FROM_LEFT));
    }

    public YValueMarker(Number number, String str, HorizontalPosition horizontalPosition, Paint paint, Paint paint2) {
        super(number, str, horizontalPosition, paint, paint2);
    }

    public YValueMarker(Number number, String str, HorizontalPosition horizontalPosition, int i, int i2) {
        super(number, str, horizontalPosition, i, i2);
    }

    @Override // com.androidplot.xy.ValueMarker
    public void draw(Canvas canvas, XYPlot xYPlot, RectF rectF) {
        if (getValue() != null) {
            float transform = (float) xYPlot.getBounds().yRegion.transform(getValue().doubleValue(), rectF.top, rectF.bottom, true);
            canvas.drawLine(rectF.left, transform, rectF.right, transform, getLinePaint());
            drawMarkerText(canvas, getText(), rectF, getTextPosition().getPixelValue(rectF.width()) + rectF.left, transform);
        }
    }
}
