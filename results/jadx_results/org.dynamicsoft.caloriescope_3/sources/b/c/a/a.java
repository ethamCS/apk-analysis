package b.c.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import b.c.a.s;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a<T> {

    /* renamed from: a */
    final s f1267a;

    /* renamed from: b */
    final v f1268b;

    /* renamed from: c */
    final WeakReference<T> f1269c;
    final boolean d;
    final int e;
    final int f;
    final int g;
    final Drawable h;
    final String i;
    final Object j;
    boolean k;
    boolean l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.c.a.a$a */
    /* loaded from: classes.dex */
    public static class C0056a<M> extends WeakReference<M> {

        /* renamed from: a */
        final a f1270a;

        public C0056a(a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f1270a = aVar;
        }
    }

    public a(s sVar, T t, v vVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        this.f1267a = sVar;
        this.f1268b = vVar;
        this.f1269c = t == null ? null : new C0056a(this, t, sVar.k);
        this.e = i;
        this.f = i2;
        this.d = z;
        this.g = i3;
        this.h = drawable;
        this.i = str;
        this.j = obj == null ? this : obj;
    }

    public void a() {
        this.l = true;
    }

    public abstract void a(Bitmap bitmap, s.e eVar);

    public abstract void b();

    public String c() {
        return this.i;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public s f() {
        return this.f1267a;
    }

    public s.f g() {
        return this.f1268b.r;
    }

    public v h() {
        return this.f1268b;
    }

    public Object i() {
        return this.j;
    }

    public T j() {
        WeakReference<T> weakReference = this.f1269c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public boolean k() {
        return this.l;
    }

    public boolean l() {
        return this.k;
    }
}
