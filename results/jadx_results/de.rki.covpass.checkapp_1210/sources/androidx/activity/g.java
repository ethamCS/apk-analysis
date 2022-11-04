package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a */
    private boolean f604a;

    /* renamed from: b */
    private CopyOnWriteArrayList<a> f605b = new CopyOnWriteArrayList<>();

    public g(boolean z10) {
        this.f604a = z10;
    }

    public void a(a aVar) {
        this.f605b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f604a;
    }

    public final void d() {
        Iterator<a> it = this.f605b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public void e(a aVar) {
        this.f605b.remove(aVar);
    }

    public final void f(boolean z10) {
        this.f604a = z10;
    }
}
