package com.androidplot.xy;

import com.androidplot.Series;
/* loaded from: classes2.dex */
public interface XYSeries extends Series {
    Number getX(int i);

    Number getY(int i);

    int size();
}
