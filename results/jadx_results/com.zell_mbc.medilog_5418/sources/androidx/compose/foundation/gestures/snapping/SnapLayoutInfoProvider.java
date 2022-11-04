package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.ranges.ClosedFloatingPointRange;
/* compiled from: SnapLayoutInfoProvider.kt */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H&J\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u0004H&J\f\u0010\b\u001a\u00020\u0003*\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "", "calculateApproachOffset", "", "Landroidx/compose/ui/unit/Density;", "initialVelocity", "calculateSnappingOffsetBounds", "Lkotlin/ranges/ClosedFloatingPointRange;", "snapStepSize", "foundation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public interface SnapLayoutInfoProvider {
    float calculateApproachOffset(Density density, float f);

    ClosedFloatingPointRange<Float> calculateSnappingOffsetBounds(Density density);

    float snapStepSize(Density density);
}
