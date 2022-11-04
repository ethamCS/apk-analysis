package com.androidplot.util;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public class PixelUtils {
    private static DisplayMetrics metrics;
    public static final Map<String, Integer> dimensionConstantLookup = initDimensionConstantLookup();
    protected static final String DIMENSION_REGEX = "^\\-?\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$";
    protected static final Pattern DIMENSION_PATTERN = Pattern.compile(DIMENSION_REGEX);

    public static void init(Context context) {
        metrics = context.getResources().getDisplayMetrics();
    }

    public static PointF add(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static PointF sub(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x - pointF2.x, pointF.y - pointF2.y);
    }

    public static float dpToPix(float f) {
        checkMetrics();
        return TypedValue.applyDimension(1, f, metrics);
    }

    public static float spToPix(float f) {
        checkMetrics();
        return TypedValue.applyDimension(2, f, metrics);
    }

    private static Map<String, Integer> initDimensionConstantLookup() {
        HashMap hashMap = new HashMap();
        hashMap.put("px", 0);
        hashMap.put("dip", 1);
        hashMap.put("dp", 1);
        hashMap.put("sp", 2);
        hashMap.put("pt", 3);
        hashMap.put("in", 4);
        hashMap.put("mm", 5);
        return Collections.unmodifiableMap(hashMap);
    }

    public static float stringToDimension(String str) {
        InternalDimension stringToInternalDimension = stringToInternalDimension(str);
        return TypedValue.applyDimension(stringToInternalDimension.unit, stringToInternalDimension.value, metrics);
    }

    private static InternalDimension stringToInternalDimension(String str) {
        Matcher matcher = DIMENSION_PATTERN.matcher(str);
        if (matcher.matches()) {
            float floatValue = Float.valueOf(matcher.group(1)).floatValue();
            Integer num = dimensionConstantLookup.get(matcher.group(3).toLowerCase());
            if (num == null) {
                throw new NumberFormatException();
            }
            return new InternalDimension(floatValue, num.intValue());
        }
        throw new NumberFormatException();
    }

    /* loaded from: classes2.dex */
    public static class InternalDimension {
        int unit;
        float value;

        public InternalDimension(float f, int i) {
            this.value = f;
            this.unit = i;
        }
    }

    private static void checkMetrics() {
        if (metrics != null) {
            return;
        }
        throw new RuntimeException("PixelUtils not initialized; call PixelUtils.init(Context) before using.");
    }
}
