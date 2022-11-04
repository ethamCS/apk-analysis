package com.androidplot.xy;

import android.util.Log;
/* loaded from: classes2.dex */
public class LTTBSampler implements Sampler {
    @Override // com.androidplot.xy.Sampler
    public RectRegion run(XYSeries xYSeries, EditableXYSeries editableXYSeries) {
        RectRegion rectRegion = new RectRegion();
        int size = editableXYSeries.size();
        int size2 = xYSeries.size();
        if (size >= size2 || size == 0) {
            throw new RuntimeException("Shouldnt be here!");
        }
        int i = size - 2;
        double d = (size2 - 2) / i;
        setSample(xYSeries, editableXYSeries, 0, 0, rectRegion);
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i3 < i) {
            int i7 = i3 + 1;
            double d2 = i7 * d;
            int i8 = i6;
            int floor = ((int) Math.floor(d2)) + i2;
            int floor2 = ((int) Math.floor((i3 + 2) * d)) + i2;
            if (floor2 >= size2) {
                floor2 = size2;
            }
            int i9 = floor2 - floor;
            double d3 = 0.0d;
            double d4 = 0.0d;
            while (floor < floor2) {
                int i10 = floor + 0;
                if (xYSeries.getX(i10) != null) {
                    d3 += xYSeries.getX(i10).doubleValue();
                }
                if (xYSeries.getY(i10) != null) {
                    d4 += xYSeries.getY(i10).doubleValue();
                }
                floor++;
            }
            double d5 = i9;
            double d6 = d3 / d5;
            double d7 = d4 / d5;
            int i11 = i4 + 0;
            double doubleValue = xYSeries.getX(i11).doubleValue();
            double doubleValue2 = xYSeries.getY(i11).doubleValue();
            int floor3 = ((int) Math.floor(d2)) + 1;
            double d8 = -1.0d;
            XYCoords xYCoords = null;
            int i12 = i5;
            for (int floor4 = ((int) Math.floor((i3 + 0) * d)) + 1; floor4 < floor3; floor4++) {
                int i13 = floor4 + 0;
                double abs = Math.abs(((doubleValue - d6) * (xYSeries.getY(i13).doubleValue() - doubleValue2)) - ((doubleValue - xYSeries.getX(i13).doubleValue()) * (d7 - doubleValue2))) * 0.5d;
                if (abs > d8) {
                    if (xYSeries.getY(i13) == null) {
                        Log.i("LTTB", "Null value encountered in raw data at index: " + floor4);
                    }
                    xYCoords = new XYCoords(xYSeries.getX(i13), xYSeries.getY(i13));
                    i12 = floor4;
                    d8 = abs;
                }
            }
            setSample(editableXYSeries, xYCoords.x, xYCoords.y, i8, rectRegion);
            i6 = i8 + 1;
            i4 = i12;
            i5 = i4;
            i3 = i7;
            i2 = 1;
        }
        setSample(xYSeries, editableXYSeries, (size2 + 0) - 1, i6, rectRegion);
        return rectRegion;
    }

    protected void setSample(XYSeries xYSeries, EditableXYSeries editableXYSeries, int i, int i2, RectRegion rectRegion) {
        setSample(editableXYSeries, xYSeries.getX(i), xYSeries.getY(i), i2, rectRegion);
    }

    protected void setSample(EditableXYSeries editableXYSeries, Number number, Number number2, int i, RectRegion rectRegion) {
        rectRegion.union(number, number2);
        editableXYSeries.setX(number, i);
        editableXYSeries.setY(number2, i);
    }
}
