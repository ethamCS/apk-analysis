package com.zell_mbc.medilog.glucose;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GlucoseHelper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"getGKI", "", "glucose", "ketone", "usStyle", "", "app_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GlucoseHelperKt {
    public static /* synthetic */ String getGKI$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return getGKI(str, str2, z);
    }

    public static final String getGKI(String glucose, String ketone, boolean z) {
        Intrinsics.checkNotNullParameter(glucose, "glucose");
        Intrinsics.checkNotNullParameter(ketone, "ketone");
        boolean z2 = true;
        if (glucose.length() > 0) {
            if (ketone.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                try {
                    float parseFloat = Float.parseFloat(glucose);
                    float parseFloat2 = Float.parseFloat(ketone);
                    if (parseFloat2 > 0.0f && parseFloat > 0.0f) {
                        float f = parseFloat / parseFloat2;
                        if (z) {
                            f /= 18;
                        }
                        String substring = String.valueOf(f).substring(0, 4);
                        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        return substring;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return "";
    }
}
