package oj;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import oj.j;
/* loaded from: classes3.dex */
public class b implements Serializable {

    /* renamed from: c */
    private final Map<Integer, a> f18484c = new TreeMap();

    /* renamed from: d */
    private transient long f18485d;

    public b(long j10) {
        this.f18485d = j10;
    }

    public b(b bVar, long j10) {
        for (Integer num : bVar.f18484c.keySet()) {
            this.f18484c.put(num, new a(bVar.f18484c.get(num)));
        }
        this.f18485d = j10;
    }

    public b(r rVar, long j10, byte[] bArr, byte[] bArr2) {
        this.f18485d = (1 << rVar.a()) - 1;
        for (long j11 = 0; j11 < j10; j11++) {
            g(rVar, j11, bArr, bArr2);
        }
    }

    a b(int i10) {
        return this.f18484c.get(ak.g.e(i10));
    }

    public long c() {
        return this.f18485d;
    }

    void e(int i10, a aVar) {
        this.f18484c.put(ak.g.e(i10), aVar);
    }

    a f(int i10, byte[] bArr, byte[] bArr2, j jVar) {
        return this.f18484c.put(ak.g.e(i10), this.f18484c.get(ak.g.e(i10)).f(bArr, bArr2, jVar));
    }

    void g(r rVar, long j10, byte[] bArr, byte[] bArr2) {
        x h10 = rVar.h();
        int b10 = h10.b();
        long j11 = a0.j(j10, b10);
        int i10 = a0.i(j10, b10);
        j jVar = (j) new j.b().h(j11).p(i10).l();
        int i11 = (1 << b10) - 1;
        if (i10 < i11) {
            if (b(0) == null || i10 == 0) {
                e(0, new a(h10, bArr, bArr2, jVar));
            }
            f(0, bArr, bArr2, jVar);
        }
        for (int i12 = 1; i12 < rVar.b(); i12++) {
            int i13 = a0.i(j11, b10);
            j11 = a0.j(j11, b10);
            j jVar2 = (j) new j.b().g(i12).h(j11).p(i13).l();
            if (this.f18484c.get(Integer.valueOf(i12)) == null || a0.n(j10, b10, i12)) {
                this.f18484c.put(Integer.valueOf(i12), new a(h10, bArr, bArr2, jVar2));
            }
            if (i13 < i11 && a0.m(j10, b10, i12)) {
                f(i12, bArr, bArr2, jVar2);
            }
        }
    }

    public b h(gg.v vVar) {
        b bVar = new b(this.f18485d);
        for (Integer num : this.f18484c.keySet()) {
            bVar.f18484c.put(num, this.f18484c.get(num).j(vVar));
        }
        return bVar;
    }
}
