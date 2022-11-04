package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Magnifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/unit/Density;", "invoke-tuRUvjQ", "(Landroidx/compose/ui/unit/Density;)J"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MagnifierKt$magnifier$1 extends Lambda implements Function1<Density, Offset> {
    public static final MagnifierKt$magnifier$1 INSTANCE = new MagnifierKt$magnifier$1();

    MagnifierKt$magnifier$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Offset invoke(Density density) {
        return Offset.m1448boximpl(m227invoketuRUvjQ(density));
    }

    /* renamed from: invoke-tuRUvjQ */
    public final long m227invoketuRUvjQ(Density density) {
        Intrinsics.checkNotNullParameter(density, "$this$null");
        return Offset.Companion.m1474getUnspecifiedF1C5BW0();
    }
}
