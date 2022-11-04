package com.androidplot.ui;
/* loaded from: classes2.dex */
public class PositionMetrics implements Comparable<PositionMetrics> {
    private Anchor anchor;
    private HorizontalPosition horizontalPosition;
    private float layerDepth;
    private VerticalPosition verticalPosition;

    public PositionMetrics(float f, HorizontalPositioning horizontalPositioning, float f2, VerticalPositioning verticalPositioning, Anchor anchor) {
        setXPositionMetric(new HorizontalPosition(f, horizontalPositioning));
        setYPositionMetric(new VerticalPosition(f2, verticalPositioning));
        setAnchor(anchor);
    }

    public VerticalPosition getYPositionMetric() {
        return this.verticalPosition;
    }

    public void setYPositionMetric(VerticalPosition verticalPosition) {
        this.verticalPosition = verticalPosition;
    }

    public Anchor getAnchor() {
        return this.anchor;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public int compareTo(PositionMetrics positionMetrics) {
        float f = this.layerDepth;
        float f2 = positionMetrics.layerDepth;
        if (f < f2) {
            return -1;
        }
        return f == f2 ? 0 : 1;
    }

    public HorizontalPosition getXPositionMetric() {
        return this.horizontalPosition;
    }

    public void setXPositionMetric(HorizontalPosition horizontalPosition) {
        this.horizontalPosition = horizontalPosition;
    }
}
