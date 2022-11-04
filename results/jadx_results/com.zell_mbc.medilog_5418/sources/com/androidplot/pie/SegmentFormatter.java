package com.androidplot.pie;

import android.content.Context;
import android.graphics.Paint;
import com.androidplot.ui.Formatter;
import com.androidplot.ui.SeriesRenderer;
/* loaded from: classes2.dex */
public class SegmentFormatter extends Formatter<PieChart> {
    private static final int DEFAULT_EDGE_COLOR = -16777216;
    private static final float DEFAULT_EDGE_THICKNESS = 3.0f;
    private static final int DEFAULT_FILL_COLOR = 0;
    private static final int DEFAULT_LABEL_COLOR = -1;
    private static final float DEFAULT_LABEL_FONT_SIZE = 18.0f;
    private static final float DEFAULT_LABEL_MARKER_THICKNESS = 3.0f;
    private Paint fillPaint;
    private Paint innerEdgePaint;
    private float innerInset;
    private Paint labelMarkerPaint;
    private Paint labelPaint;
    private float offset;
    private Paint outerEdgePaint;
    private float outerInset;
    private Paint radialEdgePaint;
    private float radialInset;

    public SegmentFormatter(Integer num) {
        setFillPaint(new Paint());
        setOuterEdgePaint(new Paint());
        getOuterEdgePaint().setStyle(Paint.Style.STROKE);
        getOuterEdgePaint().setStrokeWidth(3.0f);
        getOuterEdgePaint().setAntiAlias(true);
        setInnerEdgePaint(new Paint());
        getInnerEdgePaint().setStyle(Paint.Style.STROKE);
        getInnerEdgePaint().setStrokeWidth(3.0f);
        getInnerEdgePaint().setAntiAlias(true);
        setRadialEdgePaint(new Paint());
        getRadialEdgePaint().setStyle(Paint.Style.STROKE);
        getRadialEdgePaint().setStrokeWidth(3.0f);
        getRadialEdgePaint().setAntiAlias(true);
        setLabelPaint(new Paint());
        getLabelPaint().setColor(-1);
        getLabelPaint().setTextSize(DEFAULT_LABEL_FONT_SIZE);
        getLabelPaint().setAntiAlias(true);
        getLabelPaint().setTextAlign(Paint.Align.CENTER);
        setLabelMarkerPaint(new Paint());
        getLabelMarkerPaint().setColor(-1);
        getLabelMarkerPaint().setStrokeWidth(3.0f);
        if (num != null) {
            getFillPaint().setColor(num.intValue());
        } else {
            getFillPaint().setColor(0);
        }
    }

    public SegmentFormatter(Context context, int i) {
        setFillPaint(new Paint());
        setOuterEdgePaint(new Paint());
        getOuterEdgePaint().setStyle(Paint.Style.STROKE);
        getOuterEdgePaint().setStrokeWidth(3.0f);
        getOuterEdgePaint().setAntiAlias(true);
        setInnerEdgePaint(new Paint());
        getInnerEdgePaint().setStyle(Paint.Style.STROKE);
        getInnerEdgePaint().setStrokeWidth(3.0f);
        getInnerEdgePaint().setAntiAlias(true);
        setRadialEdgePaint(new Paint());
        getRadialEdgePaint().setStyle(Paint.Style.STROKE);
        getRadialEdgePaint().setStrokeWidth(3.0f);
        getRadialEdgePaint().setAntiAlias(true);
        setLabelPaint(new Paint());
        getLabelPaint().setColor(-1);
        getLabelPaint().setTextSize(DEFAULT_LABEL_FONT_SIZE);
        getLabelPaint().setAntiAlias(true);
        getLabelPaint().setTextAlign(Paint.Align.CENTER);
        setLabelMarkerPaint(new Paint());
        getLabelMarkerPaint().setColor(-1);
        getLabelMarkerPaint().setStrokeWidth(3.0f);
        configure(context, i);
    }

    public SegmentFormatter(Integer num, Integer num2) {
        this(num);
        getInnerEdgePaint().setColor(num2.intValue());
        getOuterEdgePaint().setColor(num2.intValue());
        getRadialEdgePaint().setColor(num2.intValue());
    }

    public SegmentFormatter(Integer num, Integer num2, Integer num3, Integer num4) {
        this(num);
        if (getOuterEdgePaint() != null) {
            getOuterEdgePaint().setColor(num2.intValue());
        } else {
            this.outerEdgePaint = new Paint();
            getOuterEdgePaint().setColor(-16777216);
        }
        if (getInnerEdgePaint() != null) {
            getInnerEdgePaint().setColor(num3.intValue());
        } else {
            this.outerEdgePaint = new Paint();
            getInnerEdgePaint().setColor(-16777216);
        }
        if (getRadialEdgePaint() != null) {
            getRadialEdgePaint().setColor(num4.intValue());
            return;
        }
        this.radialEdgePaint = new Paint();
        getRadialEdgePaint().setColor(-16777216);
    }

    @Override // com.androidplot.ui.Formatter
    public Class<? extends SeriesRenderer> getRendererClass() {
        return PieRenderer.class;
    }

    public SeriesRenderer doGetRendererInstance(PieChart pieChart) {
        return new PieRenderer(pieChart);
    }

    public Paint getInnerEdgePaint() {
        return this.innerEdgePaint;
    }

    public void setInnerEdgePaint(Paint paint) {
        this.innerEdgePaint = paint;
    }

    public Paint getOuterEdgePaint() {
        return this.outerEdgePaint;
    }

    public void setOuterEdgePaint(Paint paint) {
        this.outerEdgePaint = paint;
    }

    public Paint getRadialEdgePaint() {
        return this.radialEdgePaint;
    }

    public void setRadialEdgePaint(Paint paint) {
        this.radialEdgePaint = paint;
    }

    public Paint getFillPaint() {
        return this.fillPaint;
    }

    public void setFillPaint(Paint paint) {
        this.fillPaint = paint;
    }

    public Paint getLabelPaint() {
        return this.labelPaint;
    }

    public void setLabelPaint(Paint paint) {
        this.labelPaint = paint;
    }

    public Paint getLabelMarkerPaint() {
        return this.labelMarkerPaint;
    }

    public void setLabelMarkerPaint(Paint paint) {
        this.labelMarkerPaint = paint;
    }

    public float getOffset() {
        return this.offset;
    }

    public void setOffset(float f) {
        this.offset = f;
    }

    public float getRadialInset() {
        return this.radialInset;
    }

    public void setRadialInset(float f) {
        this.radialInset = f;
    }

    public float getInnerInset() {
        return this.innerInset;
    }

    public void setInnerInset(float f) {
        this.innerInset = f;
    }

    public float getOuterInset() {
        return this.outerInset;
    }

    public void setOuterInset(float f) {
        this.outerInset = f;
    }
}
