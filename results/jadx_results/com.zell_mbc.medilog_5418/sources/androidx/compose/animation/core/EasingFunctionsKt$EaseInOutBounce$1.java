package androidx.compose.animation.core;

import kotlin.Metadata;
/* compiled from: EasingFunctions.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "fraction"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class EasingFunctionsKt$EaseInOutBounce$1 implements Easing {
    public static final EasingFunctionsKt$EaseInOutBounce$1 INSTANCE = new EasingFunctionsKt$EaseInOutBounce$1();

    EasingFunctionsKt$EaseInOutBounce$1() {
    }

    @Override // androidx.compose.animation.core.Easing
    public final float transform(float f) {
        float f2;
        if (f < 0.5d) {
            f2 = 1 - EasingFunctionsKt.getEaseOutBounce().transform(1.0f - (f * 2.0f));
        } else {
            f2 = 1 + EasingFunctionsKt.getEaseOutBounce().transform((f * 2.0f) - 1.0f);
        }
        return f2 / 2.0f;
    }
}
