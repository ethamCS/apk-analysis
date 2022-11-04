package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class x extends m {

    /* renamed from: b */
    private n.a<u, a> f4397b;

    /* renamed from: c */
    private m.c f4398c;

    /* renamed from: d */
    private final WeakReference<v> f4399d;

    /* renamed from: e */
    private int f4400e;

    /* renamed from: f */
    private boolean f4401f;

    /* renamed from: g */
    private boolean f4402g;

    /* renamed from: h */
    private ArrayList<m.c> f4403h;

    /* renamed from: i */
    private final boolean f4404i;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        m.c f4405a;

        /* renamed from: b */
        s f4406b;

        a(u uVar, m.c cVar) {
            this.f4406b = a0.f(uVar);
            this.f4405a = cVar;
        }

        void a(v vVar, m.b bVar) {
            m.c g10 = bVar.g();
            this.f4405a = x.k(this.f4405a, g10);
            this.f4406b.f(vVar, bVar);
            this.f4405a = g10;
        }
    }

    public x(v vVar) {
        this(vVar, true);
    }

    private x(v vVar, boolean z10) {
        this.f4397b = new n.a<>();
        this.f4400e = 0;
        this.f4401f = false;
        this.f4402g = false;
        this.f4403h = new ArrayList<>();
        this.f4399d = new WeakReference<>(vVar);
        this.f4398c = m.c.INITIALIZED;
        this.f4404i = z10;
    }

    private void d(v vVar) {
        Iterator<Map.Entry<u, a>> a10 = this.f4397b.a();
        while (a10.hasNext() && !this.f4402g) {
            Map.Entry<u, a> next = a10.next();
            a value = next.getValue();
            while (value.f4405a.compareTo(this.f4398c) > 0 && !this.f4402g && this.f4397b.contains(next.getKey())) {
                m.b b10 = m.b.b(value.f4405a);
                if (b10 == null) {
                    throw new IllegalStateException("no event down from " + value.f4405a);
                }
                n(b10.g());
                value.a(vVar, b10);
                m();
            }
        }
    }

    private m.c e(u uVar) {
        Map.Entry<u, a> l10 = this.f4397b.l(uVar);
        m.c cVar = null;
        m.c cVar2 = l10 != null ? l10.getValue().f4405a : null;
        if (!this.f4403h.isEmpty()) {
            ArrayList<m.c> arrayList = this.f4403h;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return k(k(this.f4398c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    private void f(String str) {
        if (!this.f4404i || m.a.e().b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    private void g(v vVar) {
        n.b<u, a>.d d10 = this.f4397b.d();
        while (d10.hasNext() && !this.f4402g) {
            Map.Entry next = d10.next();
            a aVar = (a) next.getValue();
            while (aVar.f4405a.compareTo(this.f4398c) < 0 && !this.f4402g && this.f4397b.contains((u) next.getKey())) {
                n(aVar.f4405a);
                m.b h10 = m.b.h(aVar.f4405a);
                if (h10 == null) {
                    throw new IllegalStateException("no event up from " + aVar.f4405a);
                }
                aVar.a(vVar, h10);
                m();
            }
        }
    }

    private boolean i() {
        if (this.f4397b.size() == 0) {
            return true;
        }
        m.c cVar = this.f4397b.b().getValue().f4405a;
        m.c cVar2 = this.f4397b.e().getValue().f4405a;
        return cVar == cVar2 && this.f4398c == cVar2;
    }

    static m.c k(m.c cVar, m.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    private void l(m.c cVar) {
        m.c cVar2 = this.f4398c;
        if (cVar2 == cVar) {
            return;
        }
        if (cVar2 == m.c.INITIALIZED && cVar == m.c.DESTROYED) {
            throw new IllegalStateException("no event down from " + this.f4398c);
        }
        this.f4398c = cVar;
        if (this.f4401f || this.f4400e != 0) {
            this.f4402g = true;
            return;
        }
        this.f4401f = true;
        p();
        this.f4401f = false;
        if (this.f4398c != m.c.DESTROYED) {
            return;
        }
        this.f4397b = new n.a<>();
    }

    private void m() {
        ArrayList<m.c> arrayList = this.f4403h;
        arrayList.remove(arrayList.size() - 1);
    }

    private void n(m.c cVar) {
        this.f4403h.add(cVar);
    }

    private void p() {
        v vVar = this.f4399d.get();
        if (vVar != null) {
            while (true) {
                boolean i10 = i();
                this.f4402g = false;
                if (i10) {
                    return;
                }
                if (this.f4398c.compareTo(this.f4397b.b().getValue().f4405a) < 0) {
                    d(vVar);
                }
                Map.Entry<u, a> e10 = this.f4397b.e();
                if (!this.f4402g && e10 != null && this.f4398c.compareTo(e10.getValue().f4405a) > 0) {
                    g(vVar);
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    @Override // androidx.lifecycle.m
    public void a(u uVar) {
        v vVar;
        f("addObserver");
        m.c cVar = this.f4398c;
        m.c cVar2 = m.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = m.c.INITIALIZED;
        }
        a aVar = new a(uVar, cVar2);
        if (this.f4397b.i(uVar, aVar) == null && (vVar = this.f4399d.get()) != null) {
            boolean z10 = this.f4400e != 0 || this.f4401f;
            m.c e10 = e(uVar);
            this.f4400e++;
            while (aVar.f4405a.compareTo(e10) < 0 && this.f4397b.contains(uVar)) {
                n(aVar.f4405a);
                m.b h10 = m.b.h(aVar.f4405a);
                if (h10 == null) {
                    throw new IllegalStateException("no event up from " + aVar.f4405a);
                }
                aVar.a(vVar, h10);
                m();
                e10 = e(uVar);
            }
            if (!z10) {
                p();
            }
            this.f4400e--;
        }
    }

    @Override // androidx.lifecycle.m
    public m.c b() {
        return this.f4398c;
    }

    @Override // androidx.lifecycle.m
    public void c(u uVar) {
        f("removeObserver");
        this.f4397b.k(uVar);
    }

    public void h(m.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.g());
    }

    @Deprecated
    public void j(m.c cVar) {
        f("markState");
        o(cVar);
    }

    public void o(m.c cVar) {
        f("setCurrentState");
        l(cVar);
    }
}
