package ze;
/* loaded from: classes3.dex */
final class c<V> {

    /* renamed from: f */
    static final c<Object> f26717f = new c<>();

    /* renamed from: a */
    private final long f26718a;

    /* renamed from: b */
    private final V f26719b;

    /* renamed from: c */
    private final c<V> f26720c;

    /* renamed from: d */
    private final c<V> f26721d;

    /* renamed from: e */
    private final int f26722e;

    private c() {
        this.f26722e = 0;
        this.f26718a = 0L;
        this.f26719b = null;
        this.f26720c = null;
        this.f26721d = null;
    }

    private c(long j10, V v10, c<V> cVar, c<V> cVar2) {
        this.f26718a = j10;
        this.f26719b = v10;
        this.f26720c = cVar;
        this.f26721d = cVar2;
        this.f26722e = cVar.f26722e + 1 + cVar2.f26722e;
    }

    private static <V> c<V> c(long j10, V v10, c<V> cVar, c<V> cVar2) {
        int i10 = ((c) cVar).f26722e;
        int i11 = ((c) cVar2).f26722e;
        if (i10 + i11 > 1) {
            if (i10 >= i11 * 5) {
                c<V> cVar3 = ((c) cVar).f26720c;
                c<V> cVar4 = ((c) cVar).f26721d;
                if (((c) cVar4).f26722e < ((c) cVar3).f26722e * 2) {
                    long j11 = ((c) cVar).f26718a;
                    return new c<>(j11 + j10, ((c) cVar).f26719b, cVar3, new c(-j11, v10, cVar4.e(((c) cVar4).f26718a + j11), cVar2));
                }
                c<V> cVar5 = ((c) cVar4).f26720c;
                c<V> cVar6 = ((c) cVar4).f26721d;
                long j12 = ((c) cVar4).f26718a;
                long j13 = ((c) cVar).f26718a + j12 + j10;
                V v11 = ((c) cVar4).f26719b;
                c cVar7 = new c(-j12, ((c) cVar).f26719b, cVar3, cVar5.e(((c) cVar5).f26718a + j12));
                long j14 = ((c) cVar).f26718a;
                long j15 = ((c) cVar4).f26718a;
                return new c<>(j13, v11, cVar7, new c((-j14) - j15, v10, cVar6.e(((c) cVar6).f26718a + j15 + j14), cVar2));
            } else if (i11 >= i10 * 5) {
                c<V> cVar8 = ((c) cVar2).f26720c;
                c<V> cVar9 = ((c) cVar2).f26721d;
                if (((c) cVar8).f26722e < ((c) cVar9).f26722e * 2) {
                    long j16 = ((c) cVar2).f26718a;
                    return new c<>(j16 + j10, ((c) cVar2).f26719b, new c(-j16, v10, cVar, cVar8.e(((c) cVar8).f26718a + j16)), cVar9);
                }
                c<V> cVar10 = ((c) cVar8).f26720c;
                c<V> cVar11 = ((c) cVar8).f26721d;
                long j17 = ((c) cVar8).f26718a;
                long j18 = ((c) cVar2).f26718a;
                long j19 = j17 + j18 + j10;
                V v12 = ((c) cVar8).f26719b;
                c cVar12 = new c((-j18) - j17, v10, cVar, cVar10.e(((c) cVar10).f26718a + j17 + j18));
                long j20 = ((c) cVar8).f26718a;
                return new c<>(j19, v12, cVar12, new c(-j20, ((c) cVar2).f26719b, cVar11.e(((c) cVar11).f26718a + j20), cVar9));
            }
        }
        return new c<>(j10, v10, cVar, cVar2);
    }

    private c<V> d(c<V> cVar, c<V> cVar2) {
        return (cVar == this.f26720c && cVar2 == this.f26721d) ? this : c(this.f26718a, this.f26719b, cVar, cVar2);
    }

    private c<V> e(long j10) {
        return (this.f26722e == 0 || j10 == this.f26718a) ? this : new c<>(j10, this.f26719b, this.f26720c, this.f26721d);
    }

    public V a(long j10) {
        c<V> cVar;
        if (this.f26722e == 0) {
            return null;
        }
        long j11 = this.f26718a;
        if (j10 < j11) {
            cVar = this.f26720c;
        } else if (j10 <= j11) {
            return this.f26719b;
        } else {
            cVar = this.f26721d;
        }
        return cVar.a(j10 - j11);
    }

    public c<V> b(long j10, V v10) {
        if (this.f26722e == 0) {
            return new c<>(j10, v10, this, this);
        }
        long j11 = this.f26718a;
        return j10 < j11 ? d(this.f26720c.b(j10 - j11, v10), this.f26721d) : j10 > j11 ? d(this.f26720c, this.f26721d.b(j10 - j11, v10)) : v10 == this.f26719b ? this : new c<>(j10, v10, this.f26720c, this.f26721d);
    }
}
