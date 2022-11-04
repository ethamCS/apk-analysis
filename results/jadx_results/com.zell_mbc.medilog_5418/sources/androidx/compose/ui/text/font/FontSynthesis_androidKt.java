package androidx.compose.ui.text.font;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FontSynthesis.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"synthesizeTypeface", "", "Landroidx/compose/ui/text/font/FontSynthesis;", "typeface", "font", "Landroidx/compose/ui/text/font/Font;", "requestedWeight", "Landroidx/compose/ui/text/font/FontWeight;", "requestedStyle", "Landroidx/compose/ui/text/font/FontStyle;", "synthesizeTypeface-FxwP2eA", "(ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FontSynthesis_androidKt {
    /* renamed from: synthesizeTypeface-FxwP2eA */
    public static final Object m3773synthesizeTypefaceFxwP2eA(int i, Object typeface, Font font, FontWeight requestedWeight, int i2) {
        android.graphics.Typeface typeface2;
        int i3;
        boolean z;
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(requestedWeight, "requestedWeight");
        if (!(typeface instanceof android.graphics.Typeface)) {
            return typeface;
        }
        boolean z2 = true;
        boolean z3 = FontSynthesis.m3766isWeightOnimpl$ui_text_release(i) && !Intrinsics.areEqual(font.getWeight(), requestedWeight) && requestedWeight.compareTo(AndroidFontUtils_androidKt.getAndroidBold(FontWeight.Companion)) >= 0 && font.getWeight().compareTo(AndroidFontUtils_androidKt.getAndroidBold(FontWeight.Companion)) < 0;
        boolean z4 = FontSynthesis.m3765isStyleOnimpl$ui_text_release(i) && !FontStyle.m3754equalsimpl0(i2, font.mo3710getStyle_LCdwA());
        if (!z4 && !z3) {
            return typeface;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (!z4 || !FontStyle.m3754equalsimpl0(i2, FontStyle.Companion.m3758getItalic_LCdwA())) {
                z2 = false;
            }
            typeface2 = android.graphics.Typeface.create((android.graphics.Typeface) typeface, AndroidFontUtils_androidKt.getAndroidTypefaceStyle(z3, z2));
        } else {
            if (z3) {
                i3 = requestedWeight.getWeight();
            } else {
                i3 = font.getWeight().getWeight();
            }
            if (z4) {
                z = FontStyle.m3754equalsimpl0(i2, FontStyle.Companion.m3758getItalic_LCdwA());
            } else {
                z = FontStyle.m3754equalsimpl0(font.mo3710getStyle_LCdwA(), FontStyle.Companion.m3758getItalic_LCdwA());
            }
            typeface2 = TypefaceHelperMethodsApi28.INSTANCE.create((android.graphics.Typeface) typeface, i3, z);
        }
        Intrinsics.checkNotNullExpressionValue(typeface2, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
        return typeface2;
    }
}
