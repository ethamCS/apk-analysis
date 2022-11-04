package androidx.room;

import androidx.room.i0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class g0 implements m1.k {

    /* renamed from: c */
    private final m1.k f4868c;

    /* renamed from: d */
    private final i0.f f4869d;

    /* renamed from: q */
    private final String f4870q;

    /* renamed from: x */
    private final List<Object> f4871x = new ArrayList();

    /* renamed from: y */
    private final Executor f4872y;

    public g0(m1.k kVar, i0.f fVar, String str, Executor executor) {
        this.f4868c = kVar;
        this.f4869d = fVar;
        this.f4870q = str;
        this.f4872y = executor;
    }

    public /* synthetic */ void f() {
        this.f4869d.a(this.f4870q, this.f4871x);
    }

    public /* synthetic */ void h() {
        this.f4869d.a(this.f4870q, this.f4871x);
    }

    private void i(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 >= this.f4871x.size()) {
            for (int size = this.f4871x.size(); size <= i11; size++) {
                this.f4871x.add(null);
            }
        }
        this.f4871x.set(i11, obj);
    }

    @Override // m1.i
    public void A0(int i10, long j10) {
        i(i10, Long.valueOf(j10));
        this.f4868c.A0(i10, j10);
    }

    @Override // m1.i
    public void K(int i10, String str) {
        i(i10, str);
        this.f4868c.K(i10, str);
    }

    @Override // m1.i
    public void L0(int i10, byte[] bArr) {
        i(i10, bArr);
        this.f4868c.L0(i10, bArr);
    }

    @Override // m1.k
    public int S() {
        this.f4872y.execute(new Runnable() { // from class: androidx.room.f0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.h();
            }
        });
        return this.f4868c.S();
    }

    @Override // m1.k
    public long X0() {
        this.f4872y.execute(new Runnable() { // from class: androidx.room.e0
            @Override // java.lang.Runnable
            public final void run() {
                g0.this.f();
            }
        });
        return this.f4868c.X0();
    }

    @Override // m1.i
    public void a0(int i10) {
        i(i10, this.f4871x.toArray());
        this.f4868c.a0(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4868c.close();
    }

    @Override // m1.i
    public void d0(int i10, double d10) {
        i(i10, Double.valueOf(d10));
        this.f4868c.d0(i10, d10);
    }
}
