package com.androidplot.xy;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.androidplot.ui.VerticalPosition;
import com.androidplot.ui.VerticalPositioning;
/* loaded from: classes2.dex */
public class XValueMarker extends ValueMarker<VerticalPosition> {
    public XValueMarker(Number number, String str) {
        super(number, str, new VerticalPosition(3.0f, VerticalPositioning.ABSOLUTE_FROM_TOP));
    }

    public XValueMarker(Number number, String str, VerticalPosition verticalPosition, Paint paint, Paint paint2) {
        super(number, str, verticalPosition, paint, paint2);
    }

    public XValueMarker(Number number, String str, VerticalPosition verticalPosition, int i, int i2) {
        super(number, str, verticalPosition, i, i2);
    }

    @Override // com.androidplot.xy.ValueMarker
    public void draw(Canvas canvas, XYPlot xYPlot, RectF rectF) {
        if (getValue() != null) {
            float transform = (float) xYPlot.getBounds().xRegion.transform(getValue().doubleValue(), rectF.left, rectF.right, false);
            canvas.drawLine(transform, rectF.top, transform, rectF.bottom, getLinePaint());
            float pixelValue = getTextPosition().getPixelValue(rectF.height()) + rectF.top;
            if (getText() == null) {
                return;
            }
            drawMarkerText(canvas, getText(), rectF, transform, pixelValue);
        }
    }
}
