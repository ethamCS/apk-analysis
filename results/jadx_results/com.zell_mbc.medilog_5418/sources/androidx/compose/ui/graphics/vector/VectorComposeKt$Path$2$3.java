package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.PathFillType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: VectorCompose.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$3 extends Lambda implements Function2<PathComponent, PathFillType, Unit> {
    public static final VectorComposeKt$Path$2$3 INSTANCE = new VectorComposeKt$Path$2$3();

    VectorComposeKt$Path$2$3() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
        m2303invokepweu1eQ(pathComponent, pathFillType.m1942unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-pweu1eQ */
    public final void m2303invokepweu1eQ(PathComponent set, int i) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        set.m2286setPathFillTypeoQ8Xj4U(i);
    }
}
