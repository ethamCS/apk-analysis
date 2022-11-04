package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: LazyGridItemPlacementAnimator.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006Jc\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%J;\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0014ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-JD\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00052\f\u00103\u001a\b\u0012\u0004\u0012\u00020!042\u0006\u00105\u001a\u0002062\u0006\u0010\"\u001a\u00020#J\u0006\u00107\u001a\u00020/J\u0018\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020!2\u0006\u0010:\u001a\u00020\fH\u0002J\u001c\u0010;\u001a\u00020\u0014*\u00020\tH\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\t*\u00020\u00148BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "isVertical", "", "(Lkotlinx/coroutines/CoroutineScope;Z)V", "keyToIndexMap", "", "", "keyToItemInfoMap", "", "Landroidx/compose/foundation/lazy/grid/ItemInfo;", "positionedKeys", "", "viewportEndItemIndex", "viewportEndItemNotVisiblePartSize", "viewportStartItemIndex", "viewportStartItemNotVisiblePartSize", "mainAxis", "Landroidx/compose/ui/unit/IntOffset;", "getMainAxis--gyyYBs", "(J)I", "calculateExpectedOffset", "index", "mainAxisSizeWithSpacings", "averageLineMainAxisSize", "scrolledBy", "reverseLayout", "mainAxisLayoutSize", "fallback", "visibleItems", "", "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "calculateExpectedOffset-xfIKQeg", "(IIIJZIILjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;)I", "getAnimatedOffset", "key", "placeableIndex", "minOffset", "maxOffset", "rawOffset", "getAnimatedOffset-YT5a7pE", "(Ljava/lang/Object;IIIJ)J", "onMeasured", "", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "reset", "startAnimationsIfNeeded", "item", "itemInfo", "toOffset", "toOffset-Bjo55l4", "(I)J", "foundation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridItemPlacementAnimator {
    private final boolean isVertical;
    private final CoroutineScope scope;
    private int viewportEndItemNotVisiblePartSize;
    private int viewportStartItemNotVisiblePartSize;
    private final Map<Object, ItemInfo> keyToItemInfoMap = new LinkedHashMap();
    private Map<Object, Integer> keyToIndexMap = MapsKt.emptyMap();
    private int viewportStartItemIndex = -1;
    private int viewportEndItemIndex = -1;
    private final Set<Object> positionedKeys = new LinkedHashSet();

    public LazyGridItemPlacementAnimator(CoroutineScope scope, boolean z) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        this.isVertical = z;
    }

    /* renamed from: getAnimatedOffset-YT5a7pE */
    public final long m610getAnimatedOffsetYT5a7pE(Object key, int i, int i2, int i3, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        ItemInfo itemInfo = this.keyToItemInfoMap.get(key);
        if (itemInfo == null) {
            return j;
        }
        PlaceableInfo placeableInfo = itemInfo.getPlaceables().get(i);
        long m4233unboximpl = placeableInfo.getAnimatedOffset().getValue().m4233unboximpl();
        long m597getNotAnimatableDeltanOccac = itemInfo.m597getNotAnimatableDeltanOccac();
        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m4224getXimpl(m4233unboximpl) + IntOffset.m4224getXimpl(m597getNotAnimatableDeltanOccac), IntOffset.m4225getYimpl(m4233unboximpl) + IntOffset.m4225getYimpl(m597getNotAnimatableDeltanOccac));
        long m647getTargetOffsetnOccac = placeableInfo.m647getTargetOffsetnOccac();
        long m597getNotAnimatableDeltanOccac2 = itemInfo.m597getNotAnimatableDeltanOccac();
        long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m4224getXimpl(m647getTargetOffsetnOccac) + IntOffset.m4224getXimpl(m597getNotAnimatableDeltanOccac2), IntOffset.m4225getYimpl(m647getTargetOffsetnOccac) + IntOffset.m4225getYimpl(m597getNotAnimatableDeltanOccac2));
        if (placeableInfo.getInProgress() && ((m608getMainAxisgyyYBs(IntOffset2) < i2 && m608getMainAxisgyyYBs(IntOffset) < i2) || (m608getMainAxisgyyYBs(IntOffset2) > i3 && m608getMainAxisgyyYBs(IntOffset) > i3))) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new LazyGridItemPlacementAnimator$getAnimatedOffset$1(placeableInfo, null), 3, null);
        }
        return IntOffset;
    }

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyToIndexMap = MapsKt.emptyMap();
        this.viewportStartItemIndex = -1;
        this.viewportStartItemNotVisiblePartSize = 0;
        this.viewportEndItemIndex = -1;
        this.viewportEndItemNotVisiblePartSize = 0;
    }

    /* renamed from: calculateExpectedOffset-xfIKQeg */
    private final int m607calculateExpectedOffsetxfIKQeg(int i, int i2, int i3, long j, boolean z, int i4, int i5, List<LazyGridPositionedItem> list, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        int firstIndexInNextLineAfter;
        int i6;
        int linesMainAxisSizesSum;
        int i7;
        int lastIndexInPreviousLineBefore;
        int linesMainAxisSizesSum2;
        boolean z2 = false;
        int i8 = this.viewportEndItemIndex;
        boolean z3 = z ? i8 > i : i8 < i;
        int i9 = this.viewportStartItemIndex;
        if (z ? i9 < i : i9 > i) {
            z2 = true;
        }
        if (z3) {
            if (z) {
                i7 = LazyGridItemPlacementAnimatorKt.firstIndexInNextLineAfter(lazyGridSpanLayoutProvider, i);
            } else {
                i7 = this.viewportEndItemIndex + 1;
            }
            if (z) {
                i = this.viewportEndItemIndex;
            }
            lastIndexInPreviousLineBefore = LazyGridItemPlacementAnimatorKt.lastIndexInPreviousLineBefore(lazyGridSpanLayoutProvider, i);
            linesMainAxisSizesSum2 = LazyGridItemPlacementAnimatorKt.getLinesMainAxisSizesSum(lazyGridSpanLayoutProvider, i7, lastIndexInPreviousLineBefore, i3, list);
            return i4 + this.viewportEndItemNotVisiblePartSize + m608getMainAxisgyyYBs(j) + linesMainAxisSizesSum2;
        } else if (!z2) {
            return i5;
        } else {
            firstIndexInNextLineAfter = LazyGridItemPlacementAnimatorKt.firstIndexInNextLineAfter(lazyGridSpanLayoutProvider, !z ? i : this.viewportStartItemIndex);
            if (z) {
                i6 = LazyGridItemPlacementAnimatorKt.lastIndexInPreviousLineBefore(lazyGridSpanLayoutProvider, i);
            } else {
                i6 = this.viewportStartItemIndex - 1;
            }
            linesMainAxisSizesSum = LazyGridItemPlacementAnimatorKt.getLinesMainAxisSizesSum(lazyGridSpanLayoutProvider, firstIndexInNextLineAfter, i6, i3, list);
            return this.viewportStartItemNotVisiblePartSize + m608getMainAxisgyyYBs(j) + (-i2) + (-linesMainAxisSizesSum);
        }
    }

    private final void startAnimationsIfNeeded(LazyGridPositionedItem lazyGridPositionedItem, ItemInfo itemInfo) {
        while (itemInfo.getPlaceables().size() > lazyGridPositionedItem.getPlaceablesCount()) {
            CollectionsKt.removeLast(itemInfo.getPlaceables());
        }
        while (itemInfo.getPlaceables().size() < lazyGridPositionedItem.getPlaceablesCount()) {
            int size = itemInfo.getPlaceables().size();
            long mo605getOffsetnOccac = lazyGridPositionedItem.mo605getOffsetnOccac();
            List<PlaceableInfo> placeables = itemInfo.getPlaceables();
            long m597getNotAnimatableDeltanOccac = itemInfo.m597getNotAnimatableDeltanOccac();
            placeables.add(new PlaceableInfo(IntOffsetKt.IntOffset(IntOffset.m4224getXimpl(mo605getOffsetnOccac) - IntOffset.m4224getXimpl(m597getNotAnimatableDeltanOccac), IntOffset.m4225getYimpl(mo605getOffsetnOccac) - IntOffset.m4225getYimpl(m597getNotAnimatableDeltanOccac)), lazyGridPositionedItem.getMainAxisSize(size), null));
        }
        List<PlaceableInfo> placeables2 = itemInfo.getPlaceables();
        int size2 = placeables2.size();
        for (int i = 0; i < size2; i++) {
            PlaceableInfo placeableInfo = placeables2.get(i);
            long m647getTargetOffsetnOccac = placeableInfo.m647getTargetOffsetnOccac();
            long m597getNotAnimatableDeltanOccac2 = itemInfo.m597getNotAnimatableDeltanOccac();
            long IntOffset = IntOffsetKt.IntOffset(IntOffset.m4224getXimpl(m647getTargetOffsetnOccac) + IntOffset.m4224getXimpl(m597getNotAnimatableDeltanOccac2), IntOffset.m4225getYimpl(m647getTargetOffsetnOccac) + IntOffset.m4225getYimpl(m597getNotAnimatableDeltanOccac2));
            long m619getPlaceableOffsetnOccac = lazyGridPositionedItem.m619getPlaceableOffsetnOccac();
            placeableInfo.setMainAxisSize(lazyGridPositionedItem.getMainAxisSize(i));
            FiniteAnimationSpec<IntOffset> animationSpec = lazyGridPositionedItem.getAnimationSpec(i);
            if (!IntOffset.m4223equalsimpl0(IntOffset, m619getPlaceableOffsetnOccac)) {
                long m597getNotAnimatableDeltanOccac3 = itemInfo.m597getNotAnimatableDeltanOccac();
                placeableInfo.m648setTargetOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m4224getXimpl(m619getPlaceableOffsetnOccac) - IntOffset.m4224getXimpl(m597getNotAnimatableDeltanOccac3), IntOffset.m4225getYimpl(m619getPlaceableOffsetnOccac) - IntOffset.m4225getYimpl(m597getNotAnimatableDeltanOccac3)));
                if (animationSpec != null) {
                    placeableInfo.setInProgress(true);
                    BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(placeableInfo, animationSpec, null), 3, null);
                }
            }
        }
    }

    /* renamed from: toOffset-Bjo55l4 */
    private final long m609toOffsetBjo55l4(int i) {
        boolean z = this.isVertical;
        int i2 = z ? 0 : i;
        if (!z) {
            i = 0;
        }
        return IntOffsetKt.IntOffset(i2, i);
    }

    /* renamed from: getMainAxis--gyyYBs */
    private final int m608getMainAxisgyyYBs(long j) {
        return this.isVertical ? IntOffset.m4225getYimpl(j) : IntOffset.m4224getXimpl(j);
    }

    public final void onMeasured(int i, int i2, int i3, boolean z, List<LazyGridPositionedItem> positionedItems, LazyMeasuredItemProvider measuredItemProvider, LazyGridSpanLayoutProvider spanLayoutProvider) {
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        int i4;
        int i5;
        int i6;
        ItemInfo itemInfo;
        LazyGridPositionedItem lazyGridPositionedItem;
        long j2;
        int i7;
        long j3;
        int i8;
        Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
        Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
        int size = positionedItems.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                z2 = false;
                break;
            } else if (positionedItems.get(i9).getHasAnimations()) {
                z2 = true;
                break;
            } else {
                i9++;
            }
        }
        if (!z2) {
            reset();
            return;
        }
        int i10 = this.isVertical ? i3 : i2;
        int i11 = i;
        if (z) {
            i11 = -i11;
        }
        long m609toOffsetBjo55l4 = m609toOffsetBjo55l4(i11);
        LazyGridPositionedItem lazyGridPositionedItem2 = (LazyGridPositionedItem) CollectionsKt.first((List<? extends Object>) positionedItems);
        LazyGridPositionedItem lazyGridPositionedItem3 = (LazyGridPositionedItem) CollectionsKt.last((List<? extends Object>) positionedItems);
        int size2 = positionedItems.size();
        for (int i12 = 0; i12 < size2; i12++) {
            LazyGridPositionedItem lazyGridPositionedItem4 = positionedItems.get(i12);
            ItemInfo itemInfo2 = this.keyToItemInfoMap.get(lazyGridPositionedItem4.getKey());
            if (itemInfo2 != null) {
                itemInfo2.setIndex(lazyGridPositionedItem4.getIndex());
                itemInfo2.setCrossAxisSize(lazyGridPositionedItem4.getCrossAxisSize());
                itemInfo2.setCrossAxisOffset(lazyGridPositionedItem4.getCrossAxisOffset());
            }
        }
        LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1 lazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1 = new LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1(this, positionedItems);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < positionedItems.size()) {
            int intValue = lazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1.invoke((LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1) Integer.valueOf(i13)).intValue();
            if (intValue == -1) {
                i13++;
            } else {
                int i16 = 0;
                while (i13 < positionedItems.size() && lazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1.invoke((LazyGridItemPlacementAnimator$onMeasured$averageLineMainAxisSize$1$lineOf$1) Integer.valueOf(i13)).intValue() == intValue) {
                    i16 = Math.max(i16, positionedItems.get(i13).getMainAxisSizeWithSpacings());
                    i13++;
                }
                i14 += i16;
                i15++;
            }
        }
        int i17 = i14 / i15;
        this.positionedKeys.clear();
        int i18 = 0;
        for (int size3 = positionedItems.size(); i18 < size3; size3 = i4) {
            LazyGridPositionedItem lazyGridPositionedItem5 = positionedItems.get(i18);
            this.positionedKeys.add(lazyGridPositionedItem5.getKey());
            ItemInfo itemInfo3 = this.keyToItemInfoMap.get(lazyGridPositionedItem5.getKey());
            if (itemInfo3 == null) {
                if (lazyGridPositionedItem5.getHasAnimations()) {
                    ItemInfo itemInfo4 = new ItemInfo(lazyGridPositionedItem5.getIndex(), lazyGridPositionedItem5.getCrossAxisSize(), lazyGridPositionedItem5.getCrossAxisOffset());
                    Integer num = this.keyToIndexMap.get(lazyGridPositionedItem5.getKey());
                    long m619getPlaceableOffsetnOccac = lazyGridPositionedItem5.m619getPlaceableOffsetnOccac();
                    if (num == null) {
                        i7 = m608getMainAxisgyyYBs(m619getPlaceableOffsetnOccac);
                        j2 = m619getPlaceableOffsetnOccac;
                        itemInfo = itemInfo4;
                        lazyGridPositionedItem = lazyGridPositionedItem5;
                        i5 = i18;
                        i4 = size3;
                        i6 = i10;
                    } else {
                        if (!z) {
                            i8 = m608getMainAxisgyyYBs(m619getPlaceableOffsetnOccac);
                        } else {
                            i8 = m608getMainAxisgyyYBs(m619getPlaceableOffsetnOccac) - lazyGridPositionedItem5.getMainAxisSizeWithSpacings();
                        }
                        j2 = m619getPlaceableOffsetnOccac;
                        itemInfo = itemInfo4;
                        lazyGridPositionedItem = lazyGridPositionedItem5;
                        i5 = i18;
                        i4 = size3;
                        i6 = i10;
                        i7 = m607calculateExpectedOffsetxfIKQeg(num.intValue(), lazyGridPositionedItem5.getMainAxisSizeWithSpacings(), i17, m609toOffsetBjo55l4, z, i10, i8, positionedItems, spanLayoutProvider);
                    }
                    if (this.isVertical) {
                        j3 = IntOffset.m4220copyiSbpLlY$default(j2, 0, i7, 1, null);
                    } else {
                        j3 = IntOffset.m4220copyiSbpLlY$default(j2, i7, 0, 2, null);
                    }
                    int placeablesCount = lazyGridPositionedItem.getPlaceablesCount();
                    for (int i19 = 0; i19 < placeablesCount; i19++) {
                        itemInfo.getPlaceables().add(new PlaceableInfo(j3, lazyGridPositionedItem.getMainAxisSize(i19), null));
                        Unit unit = Unit.INSTANCE;
                    }
                    LazyGridPositionedItem lazyGridPositionedItem6 = lazyGridPositionedItem;
                    ItemInfo itemInfo5 = itemInfo;
                    this.keyToItemInfoMap.put(lazyGridPositionedItem6.getKey(), itemInfo5);
                    startAnimationsIfNeeded(lazyGridPositionedItem6, itemInfo5);
                } else {
                    i5 = i18;
                    i4 = size3;
                    i6 = i10;
                }
            } else {
                i5 = i18;
                i4 = size3;
                i6 = i10;
                if (lazyGridPositionedItem5.getHasAnimations()) {
                    long m597getNotAnimatableDeltanOccac = itemInfo3.m597getNotAnimatableDeltanOccac();
                    itemInfo3.m598setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m4224getXimpl(m597getNotAnimatableDeltanOccac) + IntOffset.m4224getXimpl(m609toOffsetBjo55l4), IntOffset.m4225getYimpl(m597getNotAnimatableDeltanOccac) + IntOffset.m4225getYimpl(m609toOffsetBjo55l4)));
                    startAnimationsIfNeeded(lazyGridPositionedItem5, itemInfo3);
                } else {
                    this.keyToItemInfoMap.remove(lazyGridPositionedItem5.getKey());
                }
            }
            i18 = i5 + 1;
            i10 = i6;
        }
        int i20 = i10;
        if (!z) {
            this.viewportStartItemIndex = lazyGridPositionedItem2.getIndex();
            this.viewportStartItemNotVisiblePartSize = m608getMainAxisgyyYBs(lazyGridPositionedItem2.mo605getOffsetnOccac());
            this.viewportEndItemIndex = lazyGridPositionedItem3.getIndex();
            this.viewportEndItemNotVisiblePartSize = (m608getMainAxisgyyYBs(lazyGridPositionedItem3.mo605getOffsetnOccac()) + lazyGridPositionedItem3.getLineMainAxisSizeWithSpacings()) - i20;
        } else {
            this.viewportStartItemIndex = lazyGridPositionedItem3.getIndex();
            this.viewportStartItemNotVisiblePartSize = (i20 - m608getMainAxisgyyYBs(lazyGridPositionedItem3.mo605getOffsetnOccac())) - lazyGridPositionedItem3.getLineMainAxisSize();
            this.viewportEndItemIndex = lazyGridPositionedItem2.getIndex();
            this.viewportEndItemNotVisiblePartSize = (-m608getMainAxisgyyYBs(lazyGridPositionedItem2.mo605getOffsetnOccac())) + (lazyGridPositionedItem2.getLineMainAxisSizeWithSpacings() - (this.isVertical ? IntSize.m4265getHeightimpl(lazyGridPositionedItem2.mo606getSizeYbymL2g()) : IntSize.m4266getWidthimpl(lazyGridPositionedItem2.mo606getSizeYbymL2g())));
        }
        Iterator<Map.Entry<Object, ItemInfo>> it = this.keyToItemInfoMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, ItemInfo> next = it.next();
            if (!this.positionedKeys.contains(next.getKey())) {
                ItemInfo value = next.getValue();
                long m597getNotAnimatableDeltanOccac2 = value.m597getNotAnimatableDeltanOccac();
                value.m598setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m4224getXimpl(m597getNotAnimatableDeltanOccac2) + IntOffset.m4224getXimpl(m609toOffsetBjo55l4), IntOffset.m4225getYimpl(m597getNotAnimatableDeltanOccac2) + IntOffset.m4225getYimpl(m609toOffsetBjo55l4)));
                Integer num2 = measuredItemProvider.getKeyToIndexMap().get(next.getKey());
                List<PlaceableInfo> placeables = value.getPlaceables();
                int size4 = placeables.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size4) {
                        z3 = false;
                        break;
                    }
                    PlaceableInfo placeableInfo = placeables.get(i21);
                    long m647getTargetOffsetnOccac = placeableInfo.m647getTargetOffsetnOccac();
                    long m597getNotAnimatableDeltanOccac3 = value.m597getNotAnimatableDeltanOccac();
                    long IntOffset = IntOffsetKt.IntOffset(IntOffset.m4224getXimpl(m647getTargetOffsetnOccac) + IntOffset.m4224getXimpl(m597getNotAnimatableDeltanOccac3), IntOffset.m4225getYimpl(m647getTargetOffsetnOccac) + IntOffset.m4225getYimpl(m597getNotAnimatableDeltanOccac3));
                    if (m608getMainAxisgyyYBs(IntOffset) + placeableInfo.getMainAxisSize() > 0 && m608getMainAxisgyyYBs(IntOffset) < i20) {
                        z3 = true;
                        break;
                    }
                    i21++;
                }
                List<PlaceableInfo> placeables2 = value.getPlaceables();
                int size5 = placeables2.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size5) {
                        z4 = false;
                        break;
                    } else if (placeables2.get(i22).getInProgress()) {
                        z4 = true;
                        break;
                    } else {
                        i22++;
                    }
                }
                boolean z5 = !z4;
                if ((!z3 && z5) || num2 == null || value.getPlaceables().isEmpty()) {
                    it.remove();
                } else {
                    int m586constructorimpl = ItemIndex.m586constructorimpl(num2.intValue());
                    if (this.isVertical) {
                        j = Constraints.Companion.m4060fixedWidthOenEA2s(value.getCrossAxisSize());
                    } else {
                        j = Constraints.Companion.m4059fixedHeightOenEA2s(value.getCrossAxisSize());
                    }
                    LazyMeasuredItem m629getAndMeasureednRnyU$default = LazyMeasuredItemProvider.m629getAndMeasureednRnyU$default(measuredItemProvider, m586constructorimpl, 0, j, 2, null);
                    int m607calculateExpectedOffsetxfIKQeg = m607calculateExpectedOffsetxfIKQeg(num2.intValue(), m629getAndMeasureednRnyU$default.getMainAxisSizeWithSpacings(), i17, m609toOffsetBjo55l4, z, i20, i20, positionedItems, spanLayoutProvider);
                    LazyGridPositionedItem position = m629getAndMeasureednRnyU$default.position(z ? (i20 - m607calculateExpectedOffsetxfIKQeg) - m629getAndMeasureednRnyU$default.getMainAxisSize() : m607calculateExpectedOffsetxfIKQeg, value.getCrossAxisOffset(), i2, i3, -1, -1, m629getAndMeasureednRnyU$default.getMainAxisSize());
                    positionedItems.add(position);
                    startAnimationsIfNeeded(position, value);
                }
            }
        }
        this.keyToIndexMap = measuredItemProvider.getKeyToIndexMap();
    }
}
