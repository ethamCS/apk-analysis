package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
/* compiled from: LazyStaggeredGridMeasure.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B>\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u001e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003R\u001c\u0010\n\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "", "index", "", "key", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "isVertical", "", "contentOffset", "Landroidx/compose/ui/unit/IntOffset;", "spacing", "(ILjava/lang/Object;Ljava/util/List;ZJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContentOffset-nOcc-ac", "()J", "J", "crossAxisSize", "getCrossAxisSize", "()I", "getIndex", "()Z", "getKey", "()Ljava/lang/Object;", "mainAxisSize", "getMainAxisSize", "getPlaceables", "()Ljava/util/List;", "sizeWithSpacings", "getSizeWithSpacings", "getSpacing", "position", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;", "lane", "mainAxis", "crossAxis", "foundation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
final class LazyStaggeredGridMeasuredItem {
    private final long contentOffset;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int mainAxisSize;
    private final List<Placeable> placeables;
    private final int sizeWithSpacings;
    private final int spacing;

    public /* synthetic */ LazyStaggeredGridMeasuredItem(int i, Object obj, List list, boolean z, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, list, z, j, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyStaggeredGridMeasuredItem(int i, Object obj, List<? extends Placeable> list, boolean z, long j, int i2) {
        Integer num;
        this.index = i;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z;
        this.contentOffset = j;
        this.spacing = i2;
        int i3 = 0;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = (Placeable) list.get(i4);
            i3 = Integer.valueOf(i3.intValue() + (this.isVertical ? placeable.getHeight() : placeable.getWidth()));
        }
        int intValue = i3.intValue();
        this.mainAxisSize = intValue;
        this.sizeWithSpacings = RangesKt.coerceAtLeast(intValue + this.spacing, 0);
        List<Placeable> list2 = this.placeables;
        if (list2.isEmpty()) {
            num = null;
        } else {
            Placeable placeable2 = list2.get(0);
            num = Integer.valueOf(this.isVertical ? placeable2.getWidth() : placeable2.getHeight());
            int lastIndex = CollectionsKt.getLastIndex(list2);
            int i5 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Placeable placeable3 = list2.get(i5);
                    Integer valueOf = Integer.valueOf(this.isVertical ? placeable3.getWidth() : placeable3.getHeight());
                    num = valueOf.compareTo(num) > 0 ? valueOf : num;
                    if (i5 == lastIndex) {
                        break;
                    }
                    i5++;
                }
            }
        }
        Intrinsics.checkNotNull(num);
        this.crossAxisSize = num.intValue();
    }

    public final int getIndex() {
        return this.index;
    }

    public final Object getKey() {
        return this.key;
    }

    public final List<Placeable> getPlaceables() {
        return this.placeables;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    /* renamed from: getContentOffset-nOcc-ac */
    public final long m675getContentOffsetnOccac() {
        return this.contentOffset;
    }

    public final int getSpacing() {
        return this.spacing;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final LazyStaggeredGridPositionedItem position(int i, int i2, int i3) {
        long j;
        if (this.isVertical) {
            j = IntOffsetKt.IntOffset(i3, i2);
        } else {
            j = IntOffsetKt.IntOffset(i2, i3);
        }
        return new LazyStaggeredGridPositionedItem(j, this.index, i, this.key, IntSizeKt.IntSize(this.sizeWithSpacings, this.crossAxisSize), this.placeables, this.contentOffset, this.isVertical, null);
    }
}
