package com.androidplot.xy;
/* loaded from: classes2.dex */
public class ScalingXYSeries implements XYSeries {
    private Mode mode;
    private double scale;
    private XYSeries series;

    /* loaded from: classes2.dex */
    public enum Mode {
        X_ONLY,
        Y_ONLY,
        X_AND_Y
    }

    public ScalingXYSeries(XYSeries xYSeries, double d, Mode mode) {
        this.series = xYSeries;
        this.scale = d;
        this.mode = mode;
    }

    @Override // com.androidplot.Series
    public String getTitle() {
        return this.series.getTitle();
    }

    @Override // com.androidplot.xy.XYSeries
    public int size() {
        return this.series.size();
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getX(int i) {
        Number x = this.series.getX(i);
        if (this.mode == Mode.X_ONLY || this.mode == Mode.X_AND_Y) {
            if (x != null) {
                return Double.valueOf(x.doubleValue() * this.scale);
            }
            return null;
        }
        return x;
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getY(int i) {
        Number y = this.series.getY(i);
        if (this.mode == Mode.Y_ONLY || this.mode == Mode.X_AND_Y) {
            if (y != null) {
                return Double.valueOf(y.doubleValue() * this.scale);
            }
            return null;
        }
        return y;
    }

    public double getScale() {
        return this.scale;
    }

    public void setScale(double d) {
        this.scale = d;
    }
}
