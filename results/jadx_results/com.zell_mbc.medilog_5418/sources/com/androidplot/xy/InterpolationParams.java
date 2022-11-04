package com.androidplot.xy;

import com.androidplot.xy.Interpolator;
/* loaded from: classes2.dex */
public interface InterpolationParams<InterpolatorType extends Interpolator> {
    Class<InterpolatorType> getInterpolatorClass();
}
