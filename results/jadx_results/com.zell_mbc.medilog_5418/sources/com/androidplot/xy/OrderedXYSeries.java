package com.androidplot.xy;
/* loaded from: classes2.dex */
public interface OrderedXYSeries extends XYSeries {

    /* loaded from: classes2.dex */
    public enum XOrder {
        ASCENDING,
        DESCENDING,
        NONE
    }

    XOrder getXOrder();
}
