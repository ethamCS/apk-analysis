package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a */
    private boolean f95a;

    /* renamed from: b */
    private CopyOnWriteArrayList<a> f96b = new CopyOnWriteArrayList<>();

    public b(boolean z) {
        this.f95a = z;
    }

    public void a(a aVar) {
        this.f96b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f95a;
    }

    public final void d() {
        Iterator<a> it = this.f96b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public void e(a aVar) {
        this.f96b.remove(aVar);
    }

    public final void f(boolean z) {
        this.f95a = z;
    }
}
