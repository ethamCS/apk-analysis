package com.androidplot.ui.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.androidplot.ui.Anchor;
import com.androidplot.ui.BoxModel;
import com.androidplot.ui.BoxModelable;
import com.androidplot.ui.HorizontalPositioning;
import com.androidplot.ui.LayoutManager;
import com.androidplot.ui.PositionMetrics;
import com.androidplot.ui.Resizable;
import com.androidplot.ui.Size;
import com.androidplot.ui.SizeMetric;
import com.androidplot.ui.SizeMode;
import com.androidplot.ui.VerticalPositioning;
import com.androidplot.util.DisplayDimensions;
import com.androidplot.util.PixelUtils;
/* loaded from: classes2.dex */
public abstract class Widget implements BoxModelable, Resizable {
    private Paint backgroundPaint;
    private Paint borderPaint;
    private BoxModel boxModel;
    private boolean clippingEnabled;
    private boolean isVisible;
    private RectF lastWidgetRect;
    private LayoutManager layoutManager;
    private DisplayDimensions plotDimensions;
    private PositionMetrics positionMetrics;
    private Rotation rotation;
    private Size size;
    private DisplayDimensions widgetDimensions;

    /* loaded from: classes2.dex */
    public enum Rotation {
        NINETY_DEGREES,
        NEGATIVE_NINETY_DEGREES,
        ONE_HUNDRED_EIGHTY_DEGREES,
        NONE
    }

    protected abstract void doOnDraw(Canvas canvas, RectF rectF);

    protected void onMetricsChanged(Size size, Size size2) {
    }

    public void onPostInit() {
    }

    protected void onResize(RectF rectF, RectF rectF2) {
    }

    public Widget(LayoutManager layoutManager, SizeMetric sizeMetric, SizeMetric sizeMetric2) {
        this(layoutManager, new Size(sizeMetric, sizeMetric2));
    }

    public Widget(LayoutManager layoutManager, Size size) {
        this.clippingEnabled = false;
        this.boxModel = new BoxModel();
        this.plotDimensions = new DisplayDimensions();
        this.widgetDimensions = new DisplayDimensions();
        this.isVisible = true;
        this.rotation = Rotation.NONE;
        this.lastWidgetRect = null;
        this.layoutManager = layoutManager;
        Size size2 = this.size;
        setSize(size);
        onMetricsChanged(size2, size);
    }

    public DisplayDimensions getWidgetDimensions() {
        return this.widgetDimensions;
    }

    public Anchor getAnchor() {
        return getPositionMetrics().getAnchor();
    }

    public void setAnchor(Anchor anchor) {
        getPositionMetrics().setAnchor(anchor);
    }

    public void position(float f, HorizontalPositioning horizontalPositioning, float f2, VerticalPositioning verticalPositioning) {
        position(f, horizontalPositioning, f2, verticalPositioning, Anchor.LEFT_TOP);
    }

    public void position(float f, HorizontalPositioning horizontalPositioning, float f2, VerticalPositioning verticalPositioning, Anchor anchor) {
        setPositionMetrics(new PositionMetrics(f, horizontalPositioning, f2, verticalPositioning, anchor));
        this.layoutManager.addToTop(this);
    }

    public boolean containsPoint(PointF pointF) {
        return this.widgetDimensions.canvasRect.contains(pointF.x, pointF.y);
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public void setWidth(float f) {
        this.size.getWidth().setValue(f);
    }

    public void setWidth(float f, SizeMode sizeMode) {
        this.size.getWidth().set(f, sizeMode);
    }

    public void setHeight(float f) {
        this.size.getHeight().setValue(f);
    }

    public void setHeight(float f, SizeMode sizeMode) {
        this.size.getHeight().set(f, sizeMode);
    }

    public SizeMetric getWidthMetric() {
        return this.size.getWidth();
    }

    public SizeMetric getHeightMetric() {
        return this.size.getHeight();
    }

    public float getWidthPix(float f) {
        return this.size.getWidth().getPixelValue(f);
    }

    public float getHeightPix(float f) {
        return this.size.getHeight().getPixelValue(f);
    }

    @Override // com.androidplot.ui.BoxModelable
    public RectF getMarginatedRect(RectF rectF) {
        return this.boxModel.getMarginatedRect(rectF);
    }

    @Override // com.androidplot.ui.BoxModelable
    public RectF getPaddedRect(RectF rectF) {
        return this.boxModel.getPaddedRect(rectF);
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setMarginRight(float f) {
        this.boxModel.setMarginRight(f);
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setMargins(float f, float f2, float f3, float f4) {
        this.boxModel.setMargins(f, f2, f3, f4);
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setPadding(float f, float f2, float f3, float f4) {
        this.boxModel.setPadding(f, f2, f3, f4);
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getMarginTop() {
        return this.boxModel.getMarginTop();
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setMarginTop(float f) {
        this.boxModel.setMarginTop(f);
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getMarginBottom() {
        return this.boxModel.getMarginBottom();
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getPaddingLeft() {
        return this.boxModel.getPaddingLeft();
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setPaddingLeft(float f) {
        this.boxModel.setPaddingLeft(f);
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getPaddingTop() {
        return this.boxModel.getPaddingTop();
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setPaddingTop(float f) {
        this.boxModel.setPaddingTop(f);
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getPaddingRight() {
        return this.boxModel.getPaddingRight();
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setPaddingRight(float f) {
        this.boxModel.setPaddingRight(f);
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getPaddingBottom() {
        return this.boxModel.getPaddingBottom();
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setPaddingBottom(float f) {
        this.boxModel.setPaddingBottom(f);
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setMarginBottom(float f) {
        this.boxModel.setMarginBottom(f);
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getMarginLeft() {
        return this.boxModel.getMarginLeft();
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setMarginLeft(float f) {
        this.boxModel.setMarginLeft(f);
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getMarginRight() {
        return this.boxModel.getMarginRight();
    }

    public synchronized void refreshLayout() {
        if (this.positionMetrics == null) {
            return;
        }
        float widthPix = getWidthPix(this.plotDimensions.paddedRect.width());
        float heightPix = getHeightPix(this.plotDimensions.paddedRect.height());
        PointF calculateCoordinates = calculateCoordinates(heightPix, widthPix, this.plotDimensions.paddedRect, this.positionMetrics);
        RectF rectF = new RectF(calculateCoordinates.x, calculateCoordinates.y, calculateCoordinates.x + widthPix, calculateCoordinates.y + heightPix);
        RectF marginatedRect = getMarginatedRect(rectF);
        this.widgetDimensions = new DisplayDimensions(rectF, marginatedRect, getPaddedRect(marginatedRect));
    }

    @Override // com.androidplot.ui.Resizable
    public synchronized void layout(DisplayDimensions displayDimensions) {
        this.plotDimensions = displayDimensions;
        refreshLayout();
    }

    public static PointF calculateCoordinates(float f, float f2, RectF rectF, PositionMetrics positionMetrics) {
        return PixelUtils.sub(new PointF(positionMetrics.getXPositionMetric().getPixelValue(rectF.width()) + rectF.left, positionMetrics.getYPositionMetric().getPixelValue(rectF.height()) + rectF.top), getAnchorOffset(f2, f, positionMetrics.getAnchor()));
    }

    public static PointF getAnchorOffset(float f, float f2, Anchor anchor) {
        PointF pointF = new PointF();
        switch (AnonymousClass1.$SwitchMap$com$androidplot$ui$Anchor[anchor.ordinal()]) {
            case 1:
                break;
            case 2:
                pointF.set(0.0f, f2 / 2.0f);
                break;
            case 3:
                pointF.set(0.0f, f2);
                break;
            case 4:
                pointF.set(f, 0.0f);
                break;
            case 5:
                pointF.set(f, f2);
                break;
            case 6:
                pointF.set(f, f2 / 2.0f);
                break;
            case 7:
                pointF.set(f / 2.0f, 0.0f);
                break;
            case 8:
                pointF.set(f / 2.0f, f2);
                break;
            case 9:
                pointF.set(f / 2.0f, f2 / 2.0f);
                break;
            default:
                throw new IllegalArgumentException("Unsupported anchor location: " + anchor);
        }
        return pointF;
    }

    public static PointF getAnchorCoordinates(RectF rectF, Anchor anchor) {
        return PixelUtils.add(new PointF(rectF.left, rectF.top), getAnchorOffset(rectF.width(), rectF.height(), anchor));
    }

    public static PointF getAnchorCoordinates(float f, float f2, float f3, float f4, Anchor anchor) {
        return getAnchorCoordinates(new RectF(f, f2, f3 + f, f4 + f2), anchor);
    }

    private void checkSize(RectF rectF) {
        RectF rectF2 = this.lastWidgetRect;
        if (rectF2 == null || !rectF2.equals(rectF)) {
            onResize(this.lastWidgetRect, rectF);
        }
        this.lastWidgetRect = rectF;
    }

    public void draw(Canvas canvas) {
        if (isVisible()) {
            if (this.backgroundPaint != null) {
                drawBackground(canvas, this.widgetDimensions.canvasRect);
            }
            canvas.save();
            RectF applyRotation = applyRotation(canvas, this.widgetDimensions.paddedRect);
            checkSize(applyRotation);
            doOnDraw(canvas, applyRotation);
            canvas.restore();
            if (this.borderPaint == null) {
                return;
            }
            drawBorder(canvas, applyRotation);
        }
    }

    protected RectF applyRotation(Canvas canvas, RectF rectF) {
        float f;
        float centerX = this.widgetDimensions.paddedRect.centerX();
        float centerY = this.widgetDimensions.paddedRect.centerY();
        float height = this.widgetDimensions.paddedRect.height() / 2.0f;
        float width = this.widgetDimensions.paddedRect.width() / 2.0f;
        int i = AnonymousClass1.$SwitchMap$com$androidplot$ui$widget$Widget$Rotation[this.rotation.ordinal()];
        if (i == 1) {
            rectF = new RectF(centerX - height, centerY - width, height + centerX, width + centerY);
            f = 90.0f;
        } else if (i == 2) {
            rectF = new RectF(centerX - height, centerY - width, height + centerX, width + centerY);
            f = -90.0f;
        } else if (i == 3) {
            f = 180.0f;
        } else if (i != 4) {
            throw new UnsupportedOperationException("Not yet implemented.");
        } else {
            f = 0.0f;
        }
        if (this.rotation != Rotation.NONE) {
            canvas.rotate(f, centerX, centerY);
        }
        return rectF;
    }

    /* renamed from: com.androidplot.ui.widget.Widget$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$Anchor;
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$widget$Widget$Rotation;

        static {
            int[] iArr = new int[Rotation.values().length];
            $SwitchMap$com$androidplot$ui$widget$Widget$Rotation = iArr;
            try {
                iArr[Rotation.NINETY_DEGREES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$ui$widget$Widget$Rotation[Rotation.NEGATIVE_NINETY_DEGREES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$ui$widget$Widget$Rotation[Rotation.ONE_HUNDRED_EIGHTY_DEGREES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$androidplot$ui$widget$Widget$Rotation[Rotation.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Anchor.values().length];
            $SwitchMap$com$androidplot$ui$Anchor = iArr2;
            try {
                iArr2[Anchor.LEFT_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$androidplot$ui$Anchor[Anchor.LEFT_MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$androidplot$ui$Anchor[Anchor.LEFT_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$androidplot$ui$Anchor[Anchor.RIGHT_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$androidplot$ui$Anchor[Anchor.RIGHT_BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$androidplot$ui$Anchor[Anchor.RIGHT_MIDDLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$androidplot$ui$Anchor[Anchor.TOP_MIDDLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$androidplot$ui$Anchor[Anchor.BOTTOM_MIDDLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$androidplot$ui$Anchor[Anchor.CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    protected void drawBorder(Canvas canvas, RectF rectF) {
        canvas.drawRect(rectF, this.borderPaint);
    }

    protected void drawBackground(Canvas canvas, RectF rectF) {
        canvas.drawRect(rectF, this.backgroundPaint);
    }

    public Paint getBorderPaint() {
        return this.borderPaint;
    }

    public void setBorderPaint(Paint paint) {
        this.borderPaint = paint;
    }

    public Paint getBackgroundPaint() {
        return this.backgroundPaint;
    }

    public void setBackgroundPaint(Paint paint) {
        this.backgroundPaint = paint;
    }

    public boolean isClippingEnabled() {
        return this.clippingEnabled;
    }

    public void setClippingEnabled(boolean z) {
        this.clippingEnabled = z;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void setVisible(boolean z) {
        this.isVisible = z;
    }

    public PositionMetrics getPositionMetrics() {
        return this.positionMetrics;
    }

    public void setPositionMetrics(PositionMetrics positionMetrics) {
        this.positionMetrics = positionMetrics;
    }

    public Rotation getRotation() {
        return this.rotation;
    }

    public void setRotation(Rotation rotation) {
        this.rotation = rotation;
    }
}
