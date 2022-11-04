package com.zell_mbc.medilog.weight;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
/* compiled from: WeightChartFragment.kt */
@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001e\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"com/zell_mbc/medilog/weight/WeightChartFragment$onViewCreated$1", "Ljava/text/Format;", "format", "Ljava/lang/StringBuffer;", "obj", "", "toAppendTo", "pos", "Ljava/text/FieldPosition;", "parseObject", "source", "", "Ljava/text/ParsePosition;", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class WeightChartFragment$onViewCreated$1 extends Format {
    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        return null;
    }

    WeightChartFragment$onViewCreated$1() {
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition fieldPosition) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(toAppendTo, "toAppendTo");
        toAppendTo.append(String.valueOf(MathKt.roundToInt(((Number) obj).floatValue())));
        Intrinsics.checkNotNullExpressionValue(toAppendTo, "toAppendTo.append(\"$i\")");
        return toAppendTo;
    }
}
