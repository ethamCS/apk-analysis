package j$.time.format;

import j$.time.AbstractC0484a;
import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalField;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
public final class r extends l {

    /* renamed from: i */
    static final LocalDate f13104i = LocalDate.of(2000, 1, 1);

    /* renamed from: g */
    private final int f13105g;

    /* renamed from: h */
    private final ChronoLocalDate f13106h;

    private r(TemporalField temporalField, int i10, int i11, int i12, ChronoLocalDate chronoLocalDate, int i13) {
        super(temporalField, i10, i11, SignStyle.NOT_NEGATIVE, i13);
        this.f13105g = i12;
        this.f13106h = chronoLocalDate;
    }

    public /* synthetic */ r(TemporalField temporalField, int i10, int i11, int i12, ChronoLocalDate chronoLocalDate, int i13, C0486b c0486b) {
        this(temporalField, 2, 2, 0, chronoLocalDate, 0);
    }

    public r(TemporalField temporalField, ChronoLocalDate chronoLocalDate) {
        this(temporalField, 2, 2, 0, chronoLocalDate, 0);
    }

    @Override // j$.time.format.l
    final long c(z zVar, long j10) {
        long j11;
        long abs = Math.abs(j10);
        int i10 = this.f13105g;
        if (this.f13106h != null) {
            j$.time.chrono.c.b(zVar.d());
            i10 = LocalDate.s(this.f13106h).get(this.f13081a);
        }
        long j12 = i10;
        if (j10 >= j12) {
            long[] jArr = l.f13080f;
            int i11 = this.f13082b;
            if (j10 < j12 + jArr[i11]) {
                j11 = jArr[i11];
                return abs % j11;
            }
        }
        j11 = l.f13080f[this.f13083c];
        return abs % j11;
    }

    @Override // j$.time.format.l
    public final boolean e(x xVar) {
        if (!xVar.l()) {
            return false;
        }
        return super.e(xVar);
    }

    @Override // j$.time.format.l
    public final int f(final x xVar, final long j10, final int i10, final int i11) {
        int i12 = this.f13105g;
        if (this.f13106h != null) {
            xVar.h();
            i12 = LocalDate.s(this.f13106h).get(this.f13081a);
            xVar.a(new Consumer() { // from class: j$.time.format.q
                @Override // j$.util.function.Consumer
                public final void h(Object obj) {
                    j$.time.chrono.e eVar = (j$.time.chrono.e) obj;
                    r.this.f(xVar, j10, i10, i11);
                }
            });
        }
        int i13 = i11 - i10;
        int i14 = this.f13082b;
        if (i13 == i14 && j10 >= 0) {
            long j11 = l.f13080f[i14];
            long j12 = i12;
            long j13 = j12 - (j12 % j11);
            j10 = i12 > 0 ? j13 + j10 : j13 - j10;
            if (j10 < j12) {
                j10 += j11;
            }
        }
        return xVar.o(this.f13081a, j10, i10, i11);
    }

    @Override // j$.time.format.l
    public final l g() {
        return this.f13085e == -1 ? this : new r(this.f13081a, this.f13082b, this.f13083c, this.f13105g, this.f13106h, -1);
    }

    @Override // j$.time.format.l
    public final l h(int i10) {
        return new r(this.f13081a, this.f13082b, this.f13083c, this.f13105g, this.f13106h, this.f13085e + i10);
    }

    @Override // j$.time.format.l
    public final String toString() {
        StringBuilder b10 = AbstractC0484a.b("ReducedValue(");
        b10.append(this.f13081a);
        b10.append(",");
        b10.append(this.f13082b);
        b10.append(",");
        b10.append(this.f13083c);
        b10.append(",");
        Object obj = this.f13106h;
        if (obj == null) {
            obj = Integer.valueOf(this.f13105g);
        }
        b10.append(obj);
        b10.append(")");
        return b10.toString();
    }
}
