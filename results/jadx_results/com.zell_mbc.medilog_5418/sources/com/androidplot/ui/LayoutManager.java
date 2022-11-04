package com.androidplot.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.androidplot.ui.widget.Widget;
import com.androidplot.util.DisplayDimensions;
import com.androidplot.util.LinkedLayerList;
/* loaded from: classes2.dex */
public class LayoutManager extends LinkedLayerList<Widget> implements View.OnTouchListener, Resizable {
    private Paint anchorPaint;
    private Paint marginPaint;
    private Paint outlinePaint;
    private Paint outlineShadowPaint;
    private Paint paddingPaint;
    private boolean drawAnchorsEnabled = false;
    private boolean drawOutlinesEnabled = false;
    private boolean drawOutlineShadowsEnabled = false;
    private boolean drawMarginsEnabled = false;
    private boolean drawPaddingEnabled = false;
    private DisplayDimensions displayDims = new DisplayDimensions();

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    public synchronized void onPostInit() {
        for (Widget widget : elements()) {
            widget.onPostInit();
        }
    }

    public LayoutManager() {
        Paint paint = new Paint();
        this.anchorPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.anchorPaint.setColor(-16711936);
        Paint paint2 = new Paint();
        this.outlinePaint = paint2;
        paint2.setColor(-16711936);
        this.outlinePaint.setStyle(Paint.Style.STROKE);
        this.outlinePaint.setAntiAlias(true);
        this.outlinePaint.setStrokeWidth(2.0f);
        Paint paint3 = new Paint();
        this.marginPaint = paint3;
        paint3.setColor(InputDeviceCompat.SOURCE_ANY);
        this.marginPaint.setStyle(Paint.Style.FILL);
        this.marginPaint.setAlpha(200);
        Paint paint4 = new Paint();
        this.paddingPaint = paint4;
        paint4.setColor(-16776961);
        this.paddingPaint.setStyle(Paint.Style.FILL);
        this.paddingPaint.setAlpha(200);
    }

    public void setMarkupEnabled(boolean z) {
        setDrawOutlinesEnabled(z);
        setDrawAnchorsEnabled(z);
        setDrawMarginsEnabled(z);
        setDrawPaddingEnabled(z);
        setDrawOutlineShadowsEnabled(z);
    }

    public void draw(Canvas canvas) {
        if (isDrawMarginsEnabled()) {
            drawSpacing(canvas, this.displayDims.canvasRect, this.displayDims.marginatedRect, this.marginPaint);
        }
        if (isDrawPaddingEnabled()) {
            drawSpacing(canvas, this.displayDims.marginatedRect, this.displayDims.paddedRect, this.paddingPaint);
        }
        for (Widget widget : elements()) {
            try {
                canvas.save();
                PositionMetrics positionMetrics = widget.getPositionMetrics();
                float widthPix = widget.getWidthPix(this.displayDims.paddedRect.width());
                float heightPix = widget.getHeightPix(this.displayDims.paddedRect.height());
                PointF calculateCoordinates = Widget.calculateCoordinates(heightPix, widthPix, this.displayDims.paddedRect, positionMetrics);
                DisplayDimensions widgetDimensions = widget.getWidgetDimensions();
                if (this.drawOutlineShadowsEnabled) {
                    canvas.drawRect(widgetDimensions.canvasRect, this.outlineShadowPaint);
                }
                if (widget.isClippingEnabled()) {
                    canvas.clipRect(widgetDimensions.canvasRect, Region.Op.INTERSECT);
                }
                widget.draw(canvas);
                if (this.drawMarginsEnabled) {
                    drawSpacing(canvas, widgetDimensions.canvasRect, widgetDimensions.marginatedRect, getMarginPaint());
                }
                if (this.drawPaddingEnabled) {
                    drawSpacing(canvas, widgetDimensions.marginatedRect, widgetDimensions.paddedRect, getPaddingPaint());
                }
                if (this.drawAnchorsEnabled) {
                    drawAnchor(canvas, Widget.getAnchorCoordinates(calculateCoordinates.x, calculateCoordinates.y, widthPix, heightPix, positionMetrics.getAnchor()));
                }
                if (this.drawOutlinesEnabled) {
                    canvas.drawRect(widgetDimensions.canvasRect, this.outlinePaint);
                }
            } finally {
                canvas.restore();
            }
        }
    }

    private static void drawSpacing(Canvas canvas, RectF rectF, RectF rectF2, Paint paint) {
        try {
            canvas.save();
            canvas.clipRect(rectF2, Region.Op.DIFFERENCE);
            canvas.drawRect(rectF, paint);
        } finally {
            canvas.restore();
        }
    }

    protected void drawAnchor(Canvas canvas, PointF pointF) {
        canvas.drawRect(pointF.x - 4.0f, pointF.y - 4.0f, pointF.x + 4.0f, pointF.y + 4.0f, this.anchorPaint);
    }

    public boolean isDrawOutlinesEnabled() {
        return this.drawOutlinesEnabled;
    }

    public void setDrawOutlinesEnabled(boolean z) {
        this.drawOutlinesEnabled = z;
    }

    public Paint getOutlinePaint() {
        return this.outlinePaint;
    }

    public void setOutlinePaint(Paint paint) {
        this.outlinePaint = paint;
    }

    public boolean isDrawAnchorsEnabled() {
        return this.drawAnchorsEnabled;
    }

    public void setDrawAnchorsEnabled(boolean z) {
        this.drawAnchorsEnabled = z;
    }

    public boolean isDrawMarginsEnabled() {
        return this.drawMarginsEnabled;
    }

    public void setDrawMarginsEnabled(boolean z) {
        this.drawMarginsEnabled = z;
    }

    public Paint getMarginPaint() {
        return this.marginPaint;
    }

    public void setMarginPaint(Paint paint) {
        this.marginPaint = paint;
    }

    public boolean isDrawPaddingEnabled() {
        return this.drawPaddingEnabled;
    }

    public void setDrawPaddingEnabled(boolean z) {
        this.drawPaddingEnabled = z;
    }

    public Paint getPaddingPaint() {
        return this.paddingPaint;
    }

    public void setPaddingPaint(Paint paint) {
        this.paddingPaint = paint;
    }

    public boolean isDrawOutlineShadowsEnabled() {
        return this.drawOutlineShadowsEnabled;
    }

    public void setDrawOutlineShadowsEnabled(boolean z) {
        this.drawOutlineShadowsEnabled = z;
        if (!z || this.outlineShadowPaint != null) {
            return;
        }
        Paint paint = new Paint();
        this.outlineShadowPaint = paint;
        paint.setColor(-12303292);
        this.outlineShadowPaint.setStyle(Paint.Style.FILL);
        this.outlineShadowPaint.setShadowLayer(3.0f, 5.0f, 5.0f, ViewCompat.MEASURED_STATE_MASK);
    }

    public Paint getOutlineShadowPaint() {
        return this.outlineShadowPaint;
    }

    public void setOutlineShadowPaint(Paint paint) {
        this.outlineShadowPaint = paint;
    }

    public void refreshLayout() {
        for (Widget widget : elements()) {
            widget.layout(this.displayDims);
        }
    }

    @Override // com.androidplot.ui.Resizable
    public void layout(DisplayDimensions displayDimensions) {
        this.displayDims = displayDimensions;
        refreshLayout();
    }
}
