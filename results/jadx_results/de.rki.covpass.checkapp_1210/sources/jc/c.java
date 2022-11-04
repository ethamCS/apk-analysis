package jc;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¨\u0006\u0003"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/math/MathKt")
/* loaded from: classes.dex */
public class c extends b {
    public static int a(float f10) {
        if (!Float.isNaN(f10)) {
            return Math.round(f10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
