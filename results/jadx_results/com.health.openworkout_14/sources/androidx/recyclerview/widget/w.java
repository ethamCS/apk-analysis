package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class w {

    /* renamed from: a */
    final b.d.g<RecyclerView.d0, a> f1823a = new b.d.g<>();

    /* renamed from: b */
    final b.d.d<RecyclerView.d0> f1824b = new b.d.d<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d */
        static b.g.k.e<a> f1825d = new b.g.k.f(20);

        /* renamed from: a */
        int f1826a;

        /* renamed from: b */
        RecyclerView.l.c f1827b;

        /* renamed from: c */
        RecyclerView.l.c f1828c;

        private a() {
        }

        static void a() {
            do {
            } while (f1825d.b() != null);
        }

        static a b() {
            a b2 = f1825d.b();
            return b2 == null ? new a() : b2;
        }

        static void c(a aVar) {
            aVar.f1826a = 0;
            aVar.f1827b = null;
            aVar.f1828c = null;
            f1825d.a(aVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.d0 d0Var);

        void b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    private RecyclerView.l.c l(RecyclerView.d0 d0Var, int i) {
        a m;
        RecyclerView.l.c cVar;
        int f2 = this.f1823a.f(d0Var);
        if (f2 >= 0 && (m = this.f1823a.m(f2)) != null) {
            int i2 = m.f1826a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                m.f1826a = i3;
                if (i == 4) {
                    cVar = m.f1827b;
                } else if (i != 8) {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                } else {
                    cVar = m.f1828c;
                }
                if ((i3 & 12) == 0) {
                    this.f1823a.k(f2);
                    a.c(m);
                }
                return cVar;
            }
        }
        return null;
    }

    public void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f1823a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f1823a.put(d0Var, aVar);
        }
        aVar.f1826a |= 2;
        aVar.f1827b = cVar;
    }

    public void b(RecyclerView.d0 d0Var) {
        a aVar = this.f1823a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f1823a.put(d0Var, aVar);
        }
        aVar.f1826a |= 1;
    }

    public void c(long j, RecyclerView.d0 d0Var) {
        this.f1824b.l(j, d0Var);
    }

    public void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f1823a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f1823a.put(d0Var, aVar);
        }
        aVar.f1828c = cVar;
        aVar.f1826a |= 8;
    }

    public void e(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f1823a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f1823a.put(d0Var, aVar);
        }
        aVar.f1827b = cVar;
        aVar.f1826a |= 4;
    }

    public void f() {
        this.f1823a.clear();
        this.f1824b.d();
    }

    public RecyclerView.d0 g(long j) {
        return this.f1824b.g(j);
    }

    public boolean h(RecyclerView.d0 d0Var) {
        a aVar = this.f1823a.get(d0Var);
        return (aVar == null || (aVar.f1826a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.d0 d0Var) {
        a aVar = this.f1823a.get(d0Var);
        return (aVar == null || (aVar.f1826a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.d0 d0Var) {
        p(d0Var);
    }

    public RecyclerView.l.c m(RecyclerView.d0 d0Var) {
        return l(d0Var, 8);
    }

    public RecyclerView.l.c n(RecyclerView.d0 d0Var) {
        return l(d0Var, 4);
    }

    public void o(b bVar) {
        RecyclerView.l.c cVar;
        RecyclerView.l.c cVar2;
        for (int size = this.f1823a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 i = this.f1823a.i(size);
            a k = this.f1823a.k(size);
            int i2 = k.f1826a;
            if ((i2 & 3) != 3) {
                if ((i2 & 1) != 0) {
                    cVar = k.f1827b;
                    if (cVar != null) {
                        cVar2 = k.f1828c;
                    }
                } else {
                    if ((i2 & 14) != 14) {
                        if ((i2 & 12) == 12) {
                            bVar.d(i, k.f1827b, k.f1828c);
                        } else if ((i2 & 4) != 0) {
                            cVar = k.f1827b;
                            cVar2 = null;
                        } else if ((i2 & 8) == 0) {
                        }
                        a.c(k);
                    }
                    bVar.b(i, k.f1827b, k.f1828c);
                    a.c(k);
                }
                bVar.c(i, cVar, cVar2);
                a.c(k);
            }
            bVar.a(i);
            a.c(k);
        }
    }

    public void p(RecyclerView.d0 d0Var) {
        a aVar = this.f1823a.get(d0Var);
        if (aVar == null) {
            return;
        }
        aVar.f1826a &= -2;
    }

    public void q(RecyclerView.d0 d0Var) {
        int o = this.f1824b.o() - 1;
        while (true) {
            if (o < 0) {
                break;
            } else if (d0Var == this.f1824b.p(o)) {
                this.f1824b.n(o);
                break;
            } else {
                o--;
            }
        }
        a remove = this.f1823a.remove(d0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
