package com.androidplot.xy;

import com.androidplot.Region;
import com.androidplot.util.SeriesUtils;
/* loaded from: classes2.dex */
public class NormedXYSeries implements XYSeries {
    private Region minMaxX;
    private Region minMaxY;
    private XYSeries rawData;
    private Region transformX;
    private Region transformY;

    /* loaded from: classes2.dex */
    public static class Norm {
        final Region minMax;
        final double offset;
        final boolean useOffsetCompression;

        public Norm(Region region) {
            this(region, 0.0d, false);
        }

        public Norm(Region region, double d, boolean z) {
            this.minMax = region;
            this.offset = d;
            this.useOffsetCompression = z;
            if (z) {
                if (d > -1.0d && d < 1.0d) {
                    return;
                }
                throw new IllegalArgumentException("When useOffsetCompression is true, offset must be > -1 and < 1.");
            }
        }
    }

    public NormedXYSeries(XYSeries xYSeries) {
        this(xYSeries, null, new Norm(null, 0.0d, false));
    }

    public NormedXYSeries(XYSeries xYSeries, Norm norm, Norm norm2) {
        this.rawData = xYSeries;
        normalize(norm, norm2);
    }

    protected void normalize(Norm norm, Norm norm2) {
        if (norm != null) {
            this.minMaxX = norm.minMax != null ? norm.minMax : SeriesUtils.minMaxX(this.rawData);
            this.transformX = calculateTransform(norm);
        }
        if (norm2 != null) {
            this.minMaxY = norm2.minMax != null ? norm2.minMax : SeriesUtils.minMaxY(this.rawData);
            this.transformY = calculateTransform(norm2);
        }
    }

    protected Region calculateTransform(Norm norm) {
        double d = 1.0d;
        if (norm.useOffsetCompression) {
            Double valueOf = Double.valueOf(norm.offset > 0.0d ? norm.offset : 0.0d);
            if (norm.offset < 0.0d) {
                d = 1.0d + norm.offset;
            }
            return new Region(valueOf, Double.valueOf(d));
        }
        return new Region(Double.valueOf(norm.offset + 0.0d), Double.valueOf(norm.offset + 1.0d));
    }

    @Override // com.androidplot.Series
    public String getTitle() {
        return this.rawData.getTitle();
    }

    @Override // com.androidplot.xy.XYSeries
    public int size() {
        return this.rawData.size();
    }

    public Number denormalizeXVal(Number number) {
        if (number != null) {
            return this.transformX.transform(number.doubleValue(), this.minMaxX);
        }
        return null;
    }

    public Number denormalizeYVal(Number number) {
        if (number != null) {
            return this.transformY.transform(number.doubleValue(), this.minMaxY);
        }
        return null;
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getX(int i) {
        Number x = this.rawData.getX(i);
        return (x == null || this.transformX == null) ? x : this.minMaxX.transform(x.doubleValue(), this.transformX);
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getY(int i) {
        Number y = this.rawData.getY(i);
        return (y == null || this.transformY == null) ? y : this.minMaxY.transform(y.doubleValue(), this.transformY);
    }
}
