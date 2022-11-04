package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: VectorCompose.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$9 extends Lambda implements Function2<PathComponent, StrokeJoin, Unit> {
    public static final VectorComposeKt$Path$2$9 INSTANCE = new VectorComposeKt$Path$2$9();

    VectorComposeKt$Path$2$9() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
        m2304invokekLtJ_vA(pathComponent, strokeJoin.m2013unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-kLtJ_vA */
    public final void m2304invokekLtJ_vA(PathComponent set, int i) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        set.m2288setStrokeLineJoinWw9F2mQ(i);
    }
}
