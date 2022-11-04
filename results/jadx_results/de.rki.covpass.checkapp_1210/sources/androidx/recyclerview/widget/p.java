package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class p {

    /* renamed from: a */
    final i0.g<RecyclerView.d0, a> f4814a = new i0.g<>();

    /* renamed from: b */
    final i0.d<RecyclerView.d0> f4815b = new i0.d<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d */
        static androidx.core.util.e<a> f4816d = new androidx.core.util.f(20);

        /* renamed from: a */
        int f4817a;

        /* renamed from: b */
        RecyclerView.l.c f4818b;

        /* renamed from: c */
        RecyclerView.l.c f4819c;

        private a() {
        }

        static void a() {
            do {
            } while (f4816d.b() != null);
        }

        static a b() {
            a b10 = f4816d.b();
            return b10 == null ? new a() : b10;
        }

        static void c(a aVar) {
            aVar.f4817a = 0;
            aVar.f4818b = null;
            aVar.f4819c = null;
            f4816d.a(aVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.d0 d0Var);

        void b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    private RecyclerView.l.c l(RecyclerView.d0 d0Var, int i10) {
        a n10;
        RecyclerView.l.c cVar;
        int g10 = this.f4814a.g(d0Var);
        if (g10 >= 0 && (n10 = this.f4814a.n(g10)) != null) {
            int i11 = n10.f4817a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                n10.f4817a = i12;
                if (i10 == 4) {
                    cVar = n10.f4818b;
                } else if (i10 != 8) {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                } else {
                    cVar = n10.f4819c;
                }
                if ((i12 & 12) == 0) {
                    this.f4814a.l(g10);
                    a.c(n10);
                }
                return cVar;
            }
        }
        return null;
    }

    public void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f4814a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f4814a.put(d0Var, aVar);
        }
        aVar.f4817a |= 2;
        aVar.f4818b = cVar;
    }

    public void b(RecyclerView.d0 d0Var) {
        a aVar = this.f4814a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f4814a.put(d0Var, aVar);
        }
        aVar.f4817a |= 1;
    }

    public void c(long j10, RecyclerView.d0 d0Var) {
        this.f4815b.l(j10, d0Var);
    }

    public void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f4814a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f4814a.put(d0Var, aVar);
        }
        aVar.f4819c = cVar;
        aVar.f4817a |= 8;
    }

    public void e(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f4814a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f4814a.put(d0Var, aVar);
        }
        aVar.f4818b = cVar;
        aVar.f4817a |= 4;
    }

    public void f() {
        this.f4814a.clear();
        this.f4815b.c();
    }

    public RecyclerView.d0 g(long j10) {
        return this.f4815b.g(j10);
    }

    public boolean h(RecyclerView.d0 d0Var) {
        a aVar = this.f4814a.get(d0Var);
        return (aVar == null || (aVar.f4817a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.d0 d0Var) {
        a aVar = this.f4814a.get(d0Var);
        return (aVar == null || (aVar.f4817a & 4) == 0) ? false : true;
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
        for (int size = this.f4814a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 j10 = this.f4814a.j(size);
            a l10 = this.f4814a.l(size);
            int i10 = l10.f4817a;
            if ((i10 & 3) != 3) {
                if ((i10 & 1) != 0) {
                    cVar = l10.f4818b;
                    if (cVar != null) {
                        cVar2 = l10.f4819c;
                    }
                } else {
                    if ((i10 & 14) != 14) {
                        if ((i10 & 12) == 12) {
                            bVar.d(j10, l10.f4818b, l10.f4819c);
                        } else if ((i10 & 4) != 0) {
                            cVar = l10.f4818b;
                            cVar2 = null;
                        } else if ((i10 & 8) == 0) {
                        }
                        a.c(l10);
                    }
                    bVar.b(j10, l10.f4818b, l10.f4819c);
                    a.c(l10);
                }
                bVar.c(j10, cVar, cVar2);
                a.c(l10);
            }
            bVar.a(j10);
            a.c(l10);
        }
    }

    public void p(RecyclerView.d0 d0Var) {
        a aVar = this.f4814a.get(d0Var);
        if (aVar == null) {
            return;
        }
        aVar.f4817a &= -2;
    }

    public void q(RecyclerView.d0 d0Var) {
        int p10 = this.f4815b.p() - 1;
        while (true) {
            if (p10 < 0) {
                break;
            } else if (d0Var == this.f4815b.q(p10)) {
                this.f4815b.o(p10);
                break;
            } else {
                p10--;
            }
        }
        a remove = this.f4814a.remove(d0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
