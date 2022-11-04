package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a */
    private boolean f447a;

    /* renamed from: b */
    private CopyOnWriteArrayList<a> f448b = new CopyOnWriteArrayList<>();

    public b(boolean z) {
        this.f447a = z;
    }

    public abstract void a();

    public void a(a aVar) {
        this.f448b.add(aVar);
    }

    public final void a(boolean z) {
        this.f447a = z;
    }

    public void b(a aVar) {
        this.f448b.remove(aVar);
    }

    public final boolean b() {
        return this.f447a;
    }

    public final void c() {
        Iterator<a> it = this.f448b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
