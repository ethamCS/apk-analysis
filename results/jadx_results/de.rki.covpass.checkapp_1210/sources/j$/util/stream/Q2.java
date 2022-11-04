package j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes2.dex */
final class Q2 extends E2 {

    /* renamed from: d */
    private Object[] f13532d;

    /* renamed from: e */
    private int f13533e;

    public Q2(AbstractC0603q2 abstractC0603q2, Comparator comparator) {
        super(abstractC0603q2, comparator);
    }

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        Object[] objArr = this.f13532d;
        int i10 = this.f13533e;
        this.f13533e = i10 + 1;
        objArr[i10] = obj;
    }

    @Override // j$.util.stream.AbstractC0583m2, j$.util.stream.AbstractC0603q2
    public final void t() {
        int i10 = 0;
        Arrays.sort(this.f13532d, 0, this.f13533e, this.f13444b);
        this.f13746a.u(this.f13533e);
        if (!this.f13445c) {
            while (i10 < this.f13533e) {
                this.f13746a.h(this.f13532d[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f13533e && !this.f13746a.x()) {
                this.f13746a.h(this.f13532d[i10]);
                i10++;
            }
        }
        this.f13746a.t();
        this.f13532d = null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        if (j10 < 2147483639) {
            this.f13532d = new Object[(int) j10];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
