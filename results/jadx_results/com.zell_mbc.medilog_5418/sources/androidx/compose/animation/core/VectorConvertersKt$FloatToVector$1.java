package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: VectorConverters.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector1D;", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class VectorConvertersKt$FloatToVector$1 extends Lambda implements Function1<Float, AnimationVector1D> {
    public static final VectorConvertersKt$FloatToVector$1 INSTANCE = new VectorConvertersKt$FloatToVector$1();

    VectorConvertersKt$FloatToVector$1() {
        super(1);
    }

    public final AnimationVector1D invoke(float f) {
        return new AnimationVector1D(f);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AnimationVector1D invoke(Float f) {
        return invoke(f.floatValue());
    }
}
