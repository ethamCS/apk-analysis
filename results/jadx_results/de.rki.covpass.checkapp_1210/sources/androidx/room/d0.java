package androidx.room;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class d0 implements m1.i {

    /* renamed from: c */
    private List<Object> f4853c = new ArrayList();

    private void e(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 >= this.f4853c.size()) {
            for (int size = this.f4853c.size(); size <= i11; size++) {
                this.f4853c.add(null);
            }
        }
        this.f4853c.set(i11, obj);
    }

    @Override // m1.i
    public void A0(int i10, long j10) {
        e(i10, Long.valueOf(j10));
    }

    @Override // m1.i
    public void K(int i10, String str) {
        e(i10, str);
    }

    @Override // m1.i
    public void L0(int i10, byte[] bArr) {
        e(i10, bArr);
    }

    @Override // m1.i
    public void a0(int i10) {
        e(i10, null);
    }

    public List<Object> b() {
        return this.f4853c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // m1.i
    public void d0(int i10, double d10) {
        e(i10, Double.valueOf(d10));
    }
}
