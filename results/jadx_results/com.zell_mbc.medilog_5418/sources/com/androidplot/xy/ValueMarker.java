package com.androidplot.xy;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.core.internal.view.SupportMenu;
import com.androidplot.ui.PositionMetric;
import com.androidplot.ui.TextOrientation;
import com.androidplot.util.FontUtils;
/* loaded from: classes2.dex */
public abstract class ValueMarker<PositionMetricType extends PositionMetric> {
    private static final int MARKER_LABEL_SPACING = 2;
    private Paint linePaint;
    private String text;
    private int textMargin;
    private TextOrientation textOrientation;
    private Paint textPaint;
    private PositionMetricType textPosition;
    private Number value;

    public abstract void draw(Canvas canvas, XYPlot xYPlot, RectF rectF);

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }

    public ValueMarker(Number number, String str, PositionMetricType positionmetrictype) {
        this.textMargin = 2;
        Paint paint = new Paint();
        this.linePaint = paint;
        paint.setColor(SupportMenu.CATEGORY_MASK);
        this.linePaint.setAntiAlias(true);
        this.linePaint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.textPaint = paint2;
        paint2.setAntiAlias(true);
        this.textPaint.setColor(SupportMenu.CATEGORY_MASK);
        this.value = number;
        this.textPosition = positionmetrictype;
        this.text = str;
    }

    public ValueMarker(Number number, String str, PositionMetricType positionmetrictype, Paint paint, Paint paint2) {
        this(number, str, positionmetrictype);
        this.linePaint = paint;
        this.textPaint = paint2;
    }

    public ValueMarker(Number number, String str, PositionMetricType positionmetrictype, int i, int i2) {
        this(number, str, positionmetrictype);
        this.linePaint.setColor(i);
        this.textPaint.setColor(i2);
    }

    public Number getValue() {
        return this.value;
    }

    public void setValue(Number number) {
        this.value = number;
    }

    public Paint getLinePaint() {
        return this.linePaint;
    }

    public void setLinePaint(Paint paint) {
        this.linePaint = paint;
    }

    public Paint getTextPaint() {
        return this.textPaint;
    }

    public void setTextPaint(Paint paint) {
        this.textPaint = paint;
    }

    public TextOrientation getTextOrientation() {
        return this.textOrientation;
    }

    public void setTextOrientation(TextOrientation textOrientation) {
        this.textOrientation = textOrientation;
    }

    public int getTextMargin() {
        return this.textMargin;
    }

    public void setTextMargin(int i) {
        this.textMargin = i;
    }

    public PositionMetricType getTextPosition() {
        return this.textPosition;
    }

    public void setTextPosition(PositionMetricType positionmetrictype) {
        this.textPosition = positionmetrictype;
    }

    public void drawMarkerText(Canvas canvas, String str, RectF rectF, float f, float f2) {
        if (getText() != null) {
            RectF rectF2 = new RectF(FontUtils.getStringDimensions(str, getTextPaint()));
            rectF2.offsetTo(f + 2.0f, (f2 - 2.0f) - rectF2.height());
            if (rectF2.right > rectF.right) {
                rectF2.offset(-(rectF2.right - rectF.right), 0.0f);
            }
            if (rectF2.top < rectF.top) {
                rectF2.offset(0.0f, rectF.top - rectF2.top);
            }
            canvas.drawText(str, rectF2.left, rectF2.bottom, getTextPaint());
        }
    }
}
