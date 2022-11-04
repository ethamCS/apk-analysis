package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.StrokeCap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: VectorCompose.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$10 extends Lambda implements Function2<PathComponent, StrokeCap, Unit> {
    public static final VectorComposeKt$Path$2$10 INSTANCE = new VectorComposeKt$Path$2$10();

    VectorComposeKt$Path$2$10() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
        m2302invokeCSYIeUk(pathComponent, strokeCap.m2003unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-CSYIeUk */
    public final void m2302invokeCSYIeUk(PathComponent set, int i) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        set.m2287setStrokeLineCapBeK7IIE(i);
    }
}
