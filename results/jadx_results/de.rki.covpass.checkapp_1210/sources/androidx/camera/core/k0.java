package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.n1;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
abstract class k0 implements n1 {

    /* renamed from: c */
    protected final n1 f2387c;

    /* renamed from: d */
    private final Set<a> f2388d = new HashSet();

    /* loaded from: classes.dex */
    public interface a {
        void c(n1 n1Var);
    }

    public k0(n1 n1Var) {
        this.f2387c = n1Var;
    }

    @Override // androidx.camera.core.n1
    public synchronized void D(Rect rect) {
        this.f2387c.D(rect);
    }

    @Override // androidx.camera.core.n1
    public synchronized k1 I() {
        return this.f2387c.I();
    }

    @Override // androidx.camera.core.n1
    public synchronized int a() {
        return this.f2387c.a();
    }

    public synchronized void b(a aVar) {
        this.f2388d.add(aVar);
    }

    @Override // androidx.camera.core.n1, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.f2387c.close();
        }
        e();
    }

    @Override // androidx.camera.core.n1
    public synchronized int d() {
        return this.f2387c.d();
    }

    protected void e() {
        HashSet<a> hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f2388d);
        }
        for (a aVar : hashSet) {
            aVar.c(this);
        }
    }

    @Override // androidx.camera.core.n1
    public synchronized int getFormat() {
        return this.f2387c.getFormat();
    }

    @Override // androidx.camera.core.n1
    public synchronized Image o0() {
        return this.f2387c.o0();
    }

    @Override // androidx.camera.core.n1
    public synchronized n1.a[] w() {
        return this.f2387c.w();
    }
}
