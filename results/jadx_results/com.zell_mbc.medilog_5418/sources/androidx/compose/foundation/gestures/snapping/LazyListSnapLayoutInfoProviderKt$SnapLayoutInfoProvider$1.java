package androidx.compose.foundation.gestures.snapping;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyListSnapLayoutInfoProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/unit/Density;", "layoutSize", "itemSize", "invoke", "(Landroidx/compose/ui/unit/Density;FF)Ljava/lang/Float;"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 extends Lambda implements Function3<Density, Float, Float, Float> {
    public static final LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 INSTANCE = new LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1();

    LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1() {
        super(3);
    }

    public final Float invoke(Density density, float f, float f2) {
        Intrinsics.checkNotNullParameter(density, "$this$null");
        return Float.valueOf((f / 2.0f) - (f2 / 2.0f));
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Float invoke(Density density, Float f, Float f2) {
        return invoke(density, f.floatValue(), f2.floatValue());
    }
}
