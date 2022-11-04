package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: VectorCompose.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$13 extends Lambda implements Function2<PathComponent, Float, Unit> {
    public static final VectorComposeKt$Path$2$13 INSTANCE = new VectorComposeKt$Path$2$13();

    VectorComposeKt$Path$2$13() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f) {
        invoke(pathComponent, f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PathComponent set, float f) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        set.setTrimPathEnd(f);
    }
}
