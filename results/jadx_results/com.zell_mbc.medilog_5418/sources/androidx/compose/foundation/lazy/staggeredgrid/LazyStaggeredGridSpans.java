package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LazyStaggeredGridSpans.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\bJ\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpans;", "", "()V", "anchor", "", "spans", "", "ensureCapacity", "", "capacity", "newOffset", "ensureValidIndex", "requestedIndex", "findNextItemIndex", "item", TypedValues.AttributesType.S_TARGET, "findPreviousItemIndex", "getSpan", "lowerBound", "reset", "setSpan", "span", "upperBound", "Companion", "foundation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridSpans {
    public static final Companion Companion = new Companion(null);
    private static final int MaxCapacity = 131072;
    public static final int Unset = -1;
    private int anchor;
    private int[] spans = new int[16];

    public final void setSpan(int i, int i2) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Negative spans are not supported".toString());
        }
        ensureValidIndex(i);
        this.spans[i - this.anchor] = i2 + 1;
    }

    public final int getSpan(int i) {
        if (i < lowerBound() || i >= upperBound()) {
            return -1;
        }
        return this.spans[i - this.anchor] - 1;
    }

    public final int upperBound() {
        return this.anchor + this.spans.length;
    }

    public final int lowerBound() {
        return this.anchor;
    }

    public final void reset() {
        ArraysKt.fill$default(this.spans, 0, 0, 0, 6, (Object) null);
    }

    public final int findPreviousItemIndex(int i, int i2) {
        while (true) {
            i--;
            if (-1 >= i) {
                return -1;
            }
            int span = getSpan(i);
            if (span == i2 || span == -1) {
                break;
            }
        }
        return i;
    }

    public final int findNextItemIndex(int i, int i2) {
        int upperBound = upperBound();
        for (int i3 = i + 1; i3 < upperBound; i3++) {
            int span = getSpan(i3);
            if (span == i2 || span == -1) {
                return i3;
            }
        }
        return upperBound();
    }

    public final void ensureValidIndex(int i) {
        int i2 = this.anchor;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 131072) {
            ensureCapacity$default(this, i3 + 1, 0, 2, null);
            return;
        }
        int max = Math.max(i - (this.spans.length / 2), 0);
        this.anchor = max;
        int i4 = max - i2;
        if (i4 >= 0) {
            int[] iArr = this.spans;
            if (i4 < iArr.length) {
                ArraysKt.copyInto(iArr, iArr, 0, i4, iArr.length);
            }
            int[] iArr2 = this.spans;
            ArraysKt.fill(iArr2, 0, Math.max(0, iArr2.length - i4), this.spans.length);
            return;
        }
        int i5 = -i4;
        int[] iArr3 = this.spans;
        if (iArr3.length + i5 < 131072) {
            ensureCapacity(iArr3.length + i5 + 1, i5);
            return;
        }
        if (i5 < iArr3.length) {
            ArraysKt.copyInto(iArr3, iArr3, i5, 0, iArr3.length - i5);
        }
        int[] iArr4 = this.spans;
        ArraysKt.fill(iArr4, 0, 0, Math.min(iArr4.length, i5));
    }

    static /* synthetic */ void ensureCapacity$default(LazyStaggeredGridSpans lazyStaggeredGridSpans, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        lazyStaggeredGridSpans.ensureCapacity(i, i2);
    }

    private final void ensureCapacity(int i, int i2) {
        if (!(i <= 131072)) {
            throw new IllegalArgumentException(("Requested span capacity " + i + " is larger than max supported: 131072!").toString());
        }
        int[] iArr = this.spans;
        if (iArr.length >= i) {
            return;
        }
        int length = iArr.length;
        while (length < i) {
            length *= 2;
        }
        this.spans = ArraysKt.copyInto$default(this.spans, new int[length], i2, 0, 0, 12, (Object) null);
    }

    /* compiled from: LazyStaggeredGridSpans.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpans$Companion;", "", "()V", "MaxCapacity", "", "Unset", "foundation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
