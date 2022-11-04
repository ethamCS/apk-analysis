package androidx.compose.material;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
/* compiled from: BackdropScaffold.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 extends Lambda implements Function1<Constraints, Constraints> {
    final /* synthetic */ float $headerHeightPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1(float f) {
        super(1);
        this.$headerHeightPx = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
        return Constraints.m4038boximpl(m939invokeZezNO4M(constraints.m4056unboximpl()));
    }

    /* renamed from: invoke-ZezNO4M */
    public final long m939invokeZezNO4M(long j) {
        return ConstraintsKt.m4067offsetNN6EwU$default(Constraints.m4041copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(this.$headerHeightPx), 1, null);
    }
}
