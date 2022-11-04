package com.androidplot.xy;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class CatmullRomInterpolator implements Interpolator<Params> {

    /* loaded from: classes2.dex */
    public enum Type {
        Uniform,
        Centripetal
    }

    /* loaded from: classes2.dex */
    public static class Params implements InterpolationParams {
        private int pointPerSegment;
        private Type type;

        public Params(int i, Type type) {
            this.pointPerSegment = i;
            this.type = type;
        }

        @Override // com.androidplot.xy.InterpolationParams
        public Class<CatmullRomInterpolator> getInterpolatorClass() {
            return CatmullRomInterpolator.class;
        }

        public int getPointPerSegment() {
            return this.pointPerSegment;
        }

        public void setPointPerSegment(int i) {
            this.pointPerSegment = i;
        }

        public Type getType() {
            return this.type;
        }

        public void setType(Type type) {
            this.type = type;
        }
    }

    /* loaded from: classes2.dex */
    public static class ExtrapolatedXYSeries implements XYSeries {
        private final XYCoords first;
        private final XYCoords last;
        private final XYSeries series;

        public ExtrapolatedXYSeries(XYSeries xYSeries, XYCoords xYCoords, XYCoords xYCoords2) {
            this.series = xYSeries;
            this.first = xYCoords;
            this.last = xYCoords2;
        }

        @Override // com.androidplot.xy.XYSeries
        public Number getX(int i) {
            if (i == 0) {
                return this.first.x;
            }
            if (i == this.series.size() + 1) {
                return this.last.x;
            }
            return this.series.getX(i - 1);
        }

        @Override // com.androidplot.xy.XYSeries
        public Number getY(int i) {
            if (i == 0) {
                return this.first.y;
            }
            if (i == this.series.size() + 1) {
                return this.last.y;
            }
            return this.series.getY(i - 1);
        }

        @Override // com.androidplot.xy.XYSeries
        public int size() {
            return this.series.size() + 2;
        }

        @Override // com.androidplot.Series
        public String getTitle() {
            return this.series.getTitle();
        }
    }

    public List<XYCoords> interpolate(XYSeries xYSeries, Params params) {
        if (params.getPointPerSegment() < 2) {
            throw new IllegalArgumentException("pointsPerSegment must be greater than 2, since 2 points is just the linear segment.");
        }
        if (xYSeries.size() < 3) {
            throw new IllegalArgumentException("Cannot interpolate a series with fewer than 3 vertices.");
        }
        XYCoords xYCoords = new XYCoords(Double.valueOf(xYSeries.getX(0).doubleValue() - (xYSeries.getX(1).doubleValue() - xYSeries.getX(0).doubleValue())), Double.valueOf(xYSeries.getY(0).doubleValue() - (xYSeries.getY(1).doubleValue() - xYSeries.getY(0).doubleValue())));
        int size = xYSeries.size() - 1;
        int i = size - 1;
        ExtrapolatedXYSeries extrapolatedXYSeries = new ExtrapolatedXYSeries(xYSeries, xYCoords, new XYCoords(Double.valueOf(xYSeries.getX(size).doubleValue() + (xYSeries.getX(size).doubleValue() - xYSeries.getX(i).doubleValue())), Double.valueOf(xYSeries.getY(size).doubleValue() + (xYSeries.getY(size).doubleValue() - xYSeries.getY(i).doubleValue()))));
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < extrapolatedXYSeries.size() - 3; i2++) {
            List<XYCoords> interpolate = interpolate(extrapolatedXYSeries, i2, params);
            if (arrayList.size() > 0) {
                interpolate.remove(0);
            }
            arrayList.addAll(interpolate);
        }
        return arrayList;
    }

    protected List<XYCoords> interpolate(XYSeries xYSeries, int i, Params params) {
        double d;
        ArrayList arrayList = new ArrayList();
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        double[] dArr3 = new double[4];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + i2;
            dArr[i2] = xYSeries.getX(i3).doubleValue();
            dArr2[i2] = xYSeries.getY(i3).doubleValue();
            dArr3[i2] = i2;
        }
        double d2 = 1.0d;
        double d3 = 2.0d;
        if (params.getType() != Type.Uniform) {
            double d4 = 0.0d;
            int i4 = 1;
            for (int i5 = 4; i4 < i5; i5 = 4) {
                int i6 = i4 - 1;
                double d5 = dArr[i4] - dArr[i6];
                double d6 = dArr2[i4] - dArr2[i6];
                if (params.getType() == Type.Centripetal) {
                    d = Math.pow((d5 * d5) + (d6 * d6), 0.25d);
                } else {
                    d = Math.pow((d5 * d5) + (d6 * d6), 0.5d);
                }
                d4 += d;
                dArr3[i4] = d4;
                i4++;
            }
            d2 = dArr3[1];
            d3 = dArr3[2];
        }
        int pointPerSegment = params.getPointPerSegment() - 1;
        int i7 = i + 1;
        arrayList.add(new XYCoords(xYSeries.getX(i7), xYSeries.getY(i7)));
        for (int i8 = 1; i8 < pointPerSegment; i8++) {
            double d7 = ((i8 * (d3 - d2)) / pointPerSegment) + d2;
            arrayList.add(new XYCoords(Double.valueOf(interpolate(dArr, dArr3, d7)), Double.valueOf(interpolate(dArr2, dArr3, d7))));
        }
        int i9 = i + 2;
        arrayList.add(new XYCoords(xYSeries.getX(i9), xYSeries.getY(i9)));
        return arrayList;
    }

    protected static double interpolate(double[] dArr, double[] dArr2, double d) {
        double d2 = ((dArr[0] * (dArr2[1] - d)) / (dArr2[1] - dArr2[0])) + ((dArr[1] * (d - dArr2[0])) / (dArr2[1] - dArr2[0]));
        double d3 = ((dArr[1] * (dArr2[2] - d)) / (dArr2[2] - dArr2[1])) + ((dArr[2] * (d - dArr2[1])) / (dArr2[2] - dArr2[1]));
        double d4 = ((dArr[2] * (dArr2[3] - d)) / (dArr2[3] - dArr2[2])) + ((dArr[3] * (d - dArr2[2])) / (dArr2[3] - dArr2[2]));
        return (((((d2 * (dArr2[2] - d)) / (dArr2[2] - dArr2[0])) + (((d - dArr2[0]) * d3) / (dArr2[2] - dArr2[0]))) * (dArr2[2] - d)) / (dArr2[2] - dArr2[1])) + (((((d3 * (dArr2[3] - d)) / (dArr2[3] - dArr2[1])) + ((d4 * (d - dArr2[1])) / (dArr2[3] - dArr2[1]))) * (d - dArr2[1])) / (dArr2[2] - dArr2[1]));
    }
}
