package androidx.compose.material;

import androidx.compose.ui.unit.IntSize;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SwipeableV2.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "layoutSize", "Landroidx/compose/ui/unit/IntSize;", "invoke-ozmzZPI", "(J)V"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeableV2Kt$swipeAnchors$1 extends Lambda implements Function1<IntSize, Unit> {
    final /* synthetic */ Function2<Map<T, Float>, Map<T, Float>, Unit> $anchorsChanged;
    final /* synthetic */ Function2<T, IntSize, Float> $calculateAnchor;
    final /* synthetic */ Set<T> $possibleStates;
    final /* synthetic */ SwipeableV2State<T> $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableV2Kt$swipeAnchors$1(SwipeableV2State<T> swipeableV2State, Set<? extends T> set, Function2<? super Map<T, Float>, ? super Map<T, Float>, Unit> function2, Function2<? super T, ? super IntSize, Float> function22) {
        super(1);
        this.$state = swipeableV2State;
        this.$possibleStates = set;
        this.$anchorsChanged = function2;
        this.$calculateAnchor = function22;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
        m1221invokeozmzZPI(intSize.m4270unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI */
    public final void m1221invokeozmzZPI(long j) {
        Function2<Map<T, Float>, Map<T, Float>, Unit> function2;
        Map anchors$material_release = this.$state.getAnchors$material_release();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Function2<T, IntSize, Float> function22 = this.$calculateAnchor;
        for (Object obj : this.$possibleStates) {
            Float invoke = function22.invoke(obj, IntSize.m4258boximpl(j));
            if (invoke != null) {
                linkedHashMap.put(obj, invoke);
            }
        }
        if (Intrinsics.areEqual(anchors$material_release, linkedHashMap)) {
            return;
        }
        this.$state.updateAnchors$material_release(linkedHashMap);
        if (!(!anchors$material_release.isEmpty()) || (function2 = this.$anchorsChanged) == 0) {
            return;
        }
        function2.invoke(anchors$material_release, linkedHashMap);
    }
}
