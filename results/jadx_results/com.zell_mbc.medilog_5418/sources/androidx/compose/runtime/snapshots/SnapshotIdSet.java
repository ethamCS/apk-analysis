package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt;
/* compiled from: SnapshotIdSet.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002J \u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u0012H\u0086\bø\u0001\u0000J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0002J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0096\u0002J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "upperSet", "", "lowerSet", "lowerBound", "belowBound", "", "(JJI[I)V", "and", "bits", "andNot", "clear", "bit", "fastForEach", "", "block", "Lkotlin/Function1;", "get", "", "iterator", "", "lowest", "default", "or", "set", "toString", "", "Companion", "runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable<Integer>, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    private final int[] belowBound;
    private final int lowerBound;
    private final long lowerSet;
    private final long upperSet;

    private SnapshotIdSet(long j, long j2, int i, int[] iArr) {
        this.upperSet = j;
        this.lowerSet = j2;
        this.lowerBound = i;
        this.belowBound = iArr;
    }

    public final boolean get(int i) {
        int[] iArr;
        int i2 = i - this.lowerBound;
        boolean z = true;
        if (i2 >= 0 && i2 < 64) {
            return ((1 << i2) & this.lowerSet) != 0;
        } else if (i2 >= 64 && i2 < 128) {
            return ((1 << (i2 - 64)) & this.upperSet) != 0;
        } else if (i2 > 0 || (iArr = this.belowBound) == null) {
            return false;
        } else {
            if (SnapshotIdSetKt.binarySearch(iArr, i) < 0) {
                z = false;
            }
            return z;
        }
    }

    public final SnapshotIdSet set(int i) {
        int i2;
        long j;
        int[] iArr;
        int i3 = i - this.lowerBound;
        if (i3 >= 0 && i3 < 64) {
            long j2 = 1 << i3;
            if ((this.lowerSet & j2) == 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet | j2, this.lowerBound, this.belowBound);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            if ((this.upperSet & j3) == 0) {
                return new SnapshotIdSet(this.upperSet | j3, this.lowerSet, this.lowerBound, this.belowBound);
            }
        } else if (i3 >= 128) {
            if (!get(i)) {
                long j4 = this.upperSet;
                long j5 = this.lowerSet;
                int i4 = this.lowerBound;
                ArrayList arrayList = null;
                int i5 = ((i + 1) / 64) * 64;
                long j6 = j4;
                while (true) {
                    if (i4 >= i5) {
                        i2 = i4;
                        j = j5;
                        break;
                    }
                    if (j5 != 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            int[] iArr2 = this.belowBound;
                            if (iArr2 != null) {
                                for (int i6 : iArr2) {
                                    arrayList.add(Integer.valueOf(i6));
                                }
                            }
                        }
                        for (int i7 = 0; i7 < 64; i7++) {
                            if (((1 << i7) & j5) != 0) {
                                arrayList.add(Integer.valueOf(i7 + i4));
                            }
                        }
                    }
                    if (j6 == 0) {
                        j = 0;
                        i2 = i5;
                        break;
                    }
                    i4 += 64;
                    j5 = j6;
                    j6 = 0;
                }
                if (arrayList == null || (iArr = CollectionsKt.toIntArray(arrayList)) == null) {
                    iArr = this.belowBound;
                }
                return new SnapshotIdSet(j6, j, i2, iArr).set(i);
            }
        } else {
            int[] iArr3 = this.belowBound;
            if (iArr3 == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, new int[]{i});
            }
            int binarySearch = SnapshotIdSetKt.binarySearch(iArr3, i);
            if (binarySearch < 0) {
                int i8 = -(binarySearch + 1);
                int length = iArr3.length + 1;
                int[] iArr4 = new int[length];
                ArraysKt.copyInto(iArr3, iArr4, 0, 0, i8);
                ArraysKt.copyInto(iArr3, iArr4, i8 + 1, i8, length - 1);
                iArr4[i8] = i;
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr4);
            }
        }
        return this;
    }

    public final SnapshotIdSet clear(int i) {
        int[] iArr;
        int binarySearch;
        int i2 = i - this.lowerBound;
        if (i2 >= 0 && i2 < 64) {
            long j = 1 << i2;
            if ((this.lowerSet & j) != 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet & (~j), this.lowerBound, this.belowBound);
            }
        } else if (i2 >= 64 && i2 < 128) {
            long j2 = 1 << (i2 - 64);
            if ((this.upperSet & j2) != 0) {
                return new SnapshotIdSet(this.upperSet & (~j2), this.lowerSet, this.lowerBound, this.belowBound);
            }
        } else if (i2 < 0 && (iArr = this.belowBound) != null && (binarySearch = SnapshotIdSetKt.binarySearch(iArr, i)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, null);
            }
            int[] iArr2 = new int[length];
            if (binarySearch > 0) {
                ArraysKt.copyInto(iArr, iArr2, 0, 0, binarySearch);
            }
            if (binarySearch < length) {
                ArraysKt.copyInto(iArr, iArr2, binarySearch, binarySearch + 1, length + 1);
            }
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
        }
        return this;
    }

    public final SnapshotIdSet andNot(SnapshotIdSet bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (bits == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return snapshotIdSet;
        }
        if (bits.lowerBound == this.lowerBound && bits.belowBound == this.belowBound) {
            return new SnapshotIdSet((~bits.upperSet) & this.upperSet, (~bits.lowerSet) & this.lowerSet, this.lowerBound, this.belowBound);
        }
        Iterator<Integer> it = bits.iterator();
        SnapshotIdSet snapshotIdSet2 = this;
        while (it.hasNext()) {
            snapshotIdSet2 = snapshotIdSet2.clear(it.next().intValue());
        }
        return snapshotIdSet2;
    }

    public final SnapshotIdSet and(SnapshotIdSet bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (!Intrinsics.areEqual(bits, snapshotIdSet) && !Intrinsics.areEqual(this, snapshotIdSet)) {
            if (bits.lowerBound == this.lowerBound) {
                int[] iArr = bits.belowBound;
                int[] iArr2 = this.belowBound;
                if (iArr == iArr2) {
                    long j = this.upperSet & bits.upperSet;
                    long j2 = this.lowerSet & bits.lowerSet;
                    if (j == 0 && j2 == 0 && iArr2 == null) {
                        return snapshotIdSet;
                    }
                    return new SnapshotIdSet(this.upperSet & bits.upperSet, bits.lowerSet & this.lowerSet, this.lowerBound, this.belowBound);
                }
            }
            if (this.belowBound == null) {
                Iterator<Integer> it = iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (bits.get(intValue)) {
                        snapshotIdSet = snapshotIdSet.set(intValue);
                    }
                }
                return snapshotIdSet;
            }
            Iterator<Integer> it2 = bits.iterator();
            while (it2.hasNext()) {
                int intValue2 = it2.next().intValue();
                if (get(intValue2)) {
                    snapshotIdSet = snapshotIdSet.set(intValue2);
                }
            }
            return snapshotIdSet;
        }
        return snapshotIdSet;
    }

    public final SnapshotIdSet or(SnapshotIdSet bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        SnapshotIdSet snapshotIdSet = EMPTY;
        if (bits == snapshotIdSet) {
            return this;
        }
        if (this == snapshotIdSet) {
            return bits;
        }
        if (bits.lowerBound == this.lowerBound && bits.belowBound == this.belowBound) {
            return new SnapshotIdSet(bits.upperSet | this.upperSet, bits.lowerSet | this.lowerSet, this.lowerBound, this.belowBound);
        } else if (this.belowBound == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                bits = bits.set(it.next().intValue());
            }
            return bits;
        } else {
            Iterator<Integer> it2 = bits.iterator();
            SnapshotIdSet snapshotIdSet2 = this;
            while (it2.hasNext()) {
                snapshotIdSet2 = snapshotIdSet2.set(it2.next().intValue());
            }
            return snapshotIdSet2;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return SequencesKt.sequence(new SnapshotIdSet$iterator$1(this, null)).iterator();
    }

    public final void fastForEach(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.belowBound;
        if (iArr != null) {
            for (int i : iArr) {
                block.invoke(Integer.valueOf(i));
            }
        }
        if (this.lowerSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((this.lowerSet & (1 << i2)) != 0) {
                    block.invoke(Integer.valueOf(this.lowerBound + i2));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((this.upperSet & (1 << i3)) != 0) {
                    block.invoke(Integer.valueOf(i3 + 64 + this.lowerBound));
                }
            }
        }
    }

    public final int lowest(int i) {
        int lowestBitOf;
        int lowestBitOf2;
        int[] iArr = this.belowBound;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.lowerSet;
        if (j != 0) {
            int i2 = this.lowerBound;
            lowestBitOf2 = SnapshotIdSetKt.lowestBitOf(j);
            return i2 + lowestBitOf2;
        }
        long j2 = this.upperSet;
        if (j2 == 0) {
            return i;
        }
        lowestBitOf = SnapshotIdSetKt.lowestBitOf(j2);
        return this.lowerBound + 64 + lowestBitOf;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        SnapshotIdSet<Integer> snapshotIdSet = this;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(snapshotIdSet, 10));
        for (Integer num : snapshotIdSet) {
            arrayList.add(String.valueOf(num.intValue()));
        }
        sb.append(ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }

    /* compiled from: SnapshotIdSet.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }
    }
}
