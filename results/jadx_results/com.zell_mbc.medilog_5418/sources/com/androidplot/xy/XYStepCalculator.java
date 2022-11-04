package com.androidplot.xy;

import android.graphics.RectF;
import com.androidplot.Region;
/* loaded from: classes2.dex */
public class XYStepCalculator {
    public static Step getStep(XYPlot xYPlot, Axis axis, RectF rectF) {
        int i = AnonymousClass1.$SwitchMap$com$androidplot$xy$Axis[axis.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return getStep(xYPlot.getRangeStepMode(), xYPlot.getRangeStepValue(), xYPlot.getBounds().getyRegion(), new Region(Float.valueOf(rectF.top), Float.valueOf(rectF.bottom)));
            }
            return null;
        }
        return getStep(xYPlot.getDomainStepMode(), xYPlot.getDomainStepValue(), xYPlot.getBounds().getxRegion(), new Region(Float.valueOf(rectF.left), Float.valueOf(rectF.right)));
    }

    /* renamed from: com.androidplot.xy.XYStepCalculator$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$Axis;
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$StepMode;

        static {
            int[] iArr = new int[StepMode.values().length];
            $SwitchMap$com$androidplot$xy$StepMode = iArr;
            try {
                iArr[StepMode.INCREMENT_BY_VAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$xy$StepMode[StepMode.INCREMENT_BY_FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$xy$StepMode[StepMode.INCREMENT_BY_PIXELS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$androidplot$xy$StepMode[StepMode.SUBDIVIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Axis.values().length];
            $SwitchMap$com$androidplot$xy$Axis = iArr2;
            try {
                iArr2[Axis.DOMAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$androidplot$xy$Axis[Axis.RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static Step getStep(StepMode stepMode, double d, Region region, Region region2) {
        double d2;
        double d3;
        double d4;
        double d5;
        int i = AnonymousClass1.$SwitchMap$com$androidplot$xy$StepMode[stepMode.ordinal()];
        if (i == 1 || i == 2) {
            d5 = d / region.ratio(region2).doubleValue();
            d2 = d;
            d4 = region2.length().doubleValue() / d5;
        } else {
            if (i == 3) {
                d3 = d;
                d4 = region2.length().doubleValue() / d;
                d2 = region.ratio(region2).doubleValue() * d;
            } else if (i != 4) {
                d4 = 0.0d;
                d3 = 0.0d;
                d2 = 0.0d;
            } else {
                d5 = region2.length().doubleValue() / (d - 1.0d);
                d4 = d;
                d2 = region.ratio(region2).doubleValue() * d5;
            }
            return new Step(d4, d3, d2);
        }
        d3 = d5;
        return new Step(d4, d3, d2);
    }
}
