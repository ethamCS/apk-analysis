package kf;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\nB)\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002¨\u0006\u0013"}, d2 = {"Lkf/r;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "elementsCount", BuildConfig.FLAVOR, "e", "index", "Ltb/e0;", "b", "c", "a", "d", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/Function2;", BuildConfig.FLAVOR, "readIfAbsent", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lgc/p;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class r {
    private static final a Companion = new a(null);
    @Deprecated

    /* renamed from: e */
    private static final long[] f15227e = new long[0];

    /* renamed from: a */
    private final SerialDescriptor f15228a;

    /* renamed from: b */
    private final gc.p<SerialDescriptor, Integer, Boolean> f15229b;

    /* renamed from: c */
    private long f15230c;

    /* renamed from: d */
    private final long[] f15231d;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkf/r$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "EMPTY_HIGH_MARKS", "[J", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(SerialDescriptor serialDescriptor, gc.p<? super SerialDescriptor, ? super Integer, Boolean> pVar) {
        hc.t.e(serialDescriptor, "descriptor");
        hc.t.e(pVar, "readIfAbsent");
        this.f15228a = serialDescriptor;
        this.f15229b = pVar;
        int m10 = serialDescriptor.m();
        long j10 = 0;
        if (m10 <= 64) {
            this.f15230c = m10 != 64 ? (-1) << m10 : j10;
            this.f15231d = f15227e;
            return;
        }
        this.f15230c = 0L;
        this.f15231d = e(m10);
    }

    private final void b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.f15231d;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    private final int c() {
        int length = this.f15231d.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.f15231d[i10];
            while (j10 != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << numberOfTrailingZeros;
                int i13 = numberOfTrailingZeros + i12;
                if (this.f15229b.u(this.f15228a, Integer.valueOf(i13)).booleanValue()) {
                    this.f15231d[i10] = j10;
                    return i13;
                }
            }
            this.f15231d[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    private final long[] e(int i10) {
        int D;
        long[] jArr = new long[(i10 - 1) >>> 6];
        if ((i10 & 63) != 0) {
            D = ub.m.D(jArr);
            jArr[D] = (-1) << i10;
        }
        return jArr;
    }

    public final void a(int i10) {
        if (i10 < 64) {
            this.f15230c |= 1 << i10;
        } else {
            b(i10);
        }
    }

    public final int d() {
        int numberOfTrailingZeros;
        int m10 = this.f15228a.m();
        do {
            long j10 = this.f15230c;
            if (j10 == -1) {
                if (m10 <= 64) {
                    return -1;
                }
                return c();
            }
            numberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
            this.f15230c |= 1 << numberOfTrailingZeros;
        } while (!this.f15229b.u(this.f15228a, Integer.valueOf(numberOfTrailingZeros)).booleanValue());
        return numberOfTrailingZeros;
    }
}
