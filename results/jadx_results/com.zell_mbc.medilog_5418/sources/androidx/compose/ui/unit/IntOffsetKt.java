package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.math.MathKt;
import net.lingala.zip4j.util.InternalZipConstants;
/* compiled from: IntOffset.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a-\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\"\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\"\u0010\u0013\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u001a\"\u0010\u0013\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0011\u001a\u001a\u0010\u0016\u001a\u00020\u0001*\u00020\u000eH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001a\u0010\u0019\u001a\u00020\u000e*\u00020\u0001H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"IntOffset", "Landroidx/compose/ui/unit/IntOffset;", "x", "", "y", "(II)J", "lerp", "start", "stop", "fraction", "", "lerp-81ZRxRo", "(JJF)J", "minus", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "minus-Nv-tHpc", "(JJ)J", "minus-oCl6YwE", "plus", "plus-Nv-tHpc", "plus-oCl6YwE", "round", "round-k-4lQ0M", "(J)J", "toOffset", "toOffset--gyyYBs", "ui-unit_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IntOffsetKt {
    public static final long IntOffset(int i, int i2) {
        return IntOffset.m4218constructorimpl((i2 & InternalZipConstants.ZIP_64_SIZE_LIMIT) | (i << 32));
    }

    /* renamed from: lerp-81ZRxRo */
    public static final long m4235lerp81ZRxRo(long j, long j2, float f) {
        return IntOffset(MathHelpersKt.lerp(IntOffset.m4224getXimpl(j), IntOffset.m4224getXimpl(j2), f), MathHelpersKt.lerp(IntOffset.m4225getYimpl(j), IntOffset.m4225getYimpl(j2), f));
    }

    /* renamed from: toOffset--gyyYBs */
    public static final long m4241toOffsetgyyYBs(long j) {
        return OffsetKt.Offset(IntOffset.m4224getXimpl(j), IntOffset.m4225getYimpl(j));
    }

    /* renamed from: plus-Nv-tHpc */
    public static final long m4238plusNvtHpc(long j, long j2) {
        return OffsetKt.Offset(Offset.m1459getXimpl(j) + IntOffset.m4224getXimpl(j2), Offset.m1460getYimpl(j) + IntOffset.m4225getYimpl(j2));
    }

    /* renamed from: minus-Nv-tHpc */
    public static final long m4236minusNvtHpc(long j, long j2) {
        return OffsetKt.Offset(Offset.m1459getXimpl(j) - IntOffset.m4224getXimpl(j2), Offset.m1460getYimpl(j) - IntOffset.m4225getYimpl(j2));
    }

    /* renamed from: plus-oCl6YwE */
    public static final long m4239plusoCl6YwE(long j, long j2) {
        return OffsetKt.Offset(IntOffset.m4224getXimpl(j) + Offset.m1459getXimpl(j2), IntOffset.m4225getYimpl(j) + Offset.m1460getYimpl(j2));
    }

    /* renamed from: minus-oCl6YwE */
    public static final long m4237minusoCl6YwE(long j, long j2) {
        return OffsetKt.Offset(IntOffset.m4224getXimpl(j) - Offset.m1459getXimpl(j2), IntOffset.m4225getYimpl(j) - Offset.m1460getYimpl(j2));
    }

    /* renamed from: round-k-4lQ0M */
    public static final long m4240roundk4lQ0M(long j) {
        return IntOffset(MathKt.roundToInt(Offset.m1459getXimpl(j)), MathKt.roundToInt(Offset.m1460getYimpl(j)));
    }
}
