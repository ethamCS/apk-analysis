package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.text.TextPaint;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
/* compiled from: AndroidTextPaint.android.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0019\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\n\u001a\u00020\u000b*\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"setAlpha", "", "Landroid/text/TextPaint;", "alpha", "", "toAndroidCap", "Landroid/graphics/Paint$Cap;", "Landroidx/compose/ui/graphics/StrokeCap;", "toAndroidCap-BeK7IIE", "(I)Landroid/graphics/Paint$Cap;", "toAndroidJoin", "Landroid/graphics/Paint$Join;", "Landroidx/compose/ui/graphics/StrokeJoin;", "toAndroidJoin-Ww9F2mQ", "(I)Landroid/graphics/Paint$Join;", "ui-text_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTextPaint_androidKt {
    /* renamed from: toAndroidJoin-Ww9F2mQ */
    public static final Paint.Join m3875toAndroidJoinWw9F2mQ(int i) {
        return StrokeJoin.m2010equalsimpl0(i, StrokeJoin.Companion.m2015getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m2010equalsimpl0(i, StrokeJoin.Companion.m2016getRoundLxFBmk8()) ? Paint.Join.ROUND : StrokeJoin.m2010equalsimpl0(i, StrokeJoin.Companion.m2014getBevelLxFBmk8()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    /* renamed from: toAndroidCap-BeK7IIE */
    public static final Paint.Cap m3874toAndroidCapBeK7IIE(int i) {
        return StrokeCap.m2000equalsimpl0(i, StrokeCap.Companion.m2004getButtKaPHkGw()) ? Paint.Cap.BUTT : StrokeCap.m2000equalsimpl0(i, StrokeCap.Companion.m2005getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m2000equalsimpl0(i, StrokeCap.Companion.m2006getSquareKaPHkGw()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    public static final void setAlpha(TextPaint textPaint, float f) {
        Intrinsics.checkNotNullParameter(textPaint, "<this>");
        if (!Float.isNaN(f)) {
            textPaint.setAlpha(MathKt.roundToInt(RangesKt.coerceIn(f, 0.0f, 1.0f) * 255));
        }
    }
}
