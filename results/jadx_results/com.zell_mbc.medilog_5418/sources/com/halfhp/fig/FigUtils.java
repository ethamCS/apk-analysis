package com.halfhp.fig;

import android.content.Context;
import android.util.TypedValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
abstract class FigUtils {
    protected static final String DIMENSION_REGEX = "^\\-?\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$";
    protected static final Pattern DIMENSION_PATTERN = Pattern.compile(DIMENSION_REGEX);
    public static final Map<String, Integer> dimensionConstantLookup = initDimensionConstantLookup();

    FigUtils() {
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

    /* loaded from: classes2.dex */
    public static class InternalDimension {
        int unit;
        float value;

        public InternalDimension(float f, int i) {
            this.value = f;
            this.unit = i;
        }
    }

    public static float stringToDimension(Context context, String str) {
        InternalDimension stringToInternalDimension = stringToInternalDimension(str);
        return TypedValue.applyDimension(stringToInternalDimension.unit, stringToInternalDimension.value, context.getResources().getDisplayMetrics());
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
}
