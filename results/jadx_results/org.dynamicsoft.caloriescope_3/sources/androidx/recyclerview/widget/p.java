package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class p {

    /* renamed from: a */
    final a.d.g<RecyclerView.d0, a> f1145a = new a.d.g<>();

    /* renamed from: b */
    final a.d.d<RecyclerView.d0> f1146b = new a.d.d<>();

    /* loaded from: classes.dex */
    public static class a {
        static a.g.k.e<a> d = new a.g.k.f(20);

        /* renamed from: a */
        int f1147a;

        /* renamed from: b */
        RecyclerView.l.c f1148b;

        /* renamed from: c */
        RecyclerView.l.c f1149c;

        private a() {
        }

        static void a() {
            do {
            } while (d.a() != null);
        }

        static void a(a aVar) {
            aVar.f1147a = 0;
            aVar.f1148b = null;
            aVar.f1149c = null;
            d.a(aVar);
        }

        static a b() {
            a a2 = d.a();
            return a2 == null ? new a() : a2;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.d0 d0Var);

        void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    private RecyclerView.l.c a(RecyclerView.d0 d0Var, int i) {
        a d;
        RecyclerView.l.c cVar;
        int a2 = this.f1145a.a(d0Var);
        if (a2 >= 0 && (d = this.f1145a.d(a2)) != null) {
            int i2 = d.f1147a;
            if ((i2 & i) != 0) {
                d.f1147a = (i ^ (-1)) & i2;
                if (i == 4) {
                    cVar = d.f1148b;
                } else if (i != 8) {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                } else {
                    cVar = d.f1149c;
                }
                if ((d.f1147a & 12) == 0) {
                    this.f1145a.c(a2);
                    a.a(d);
                }
                return cVar;
            }
        }
        return null;
    }

    public RecyclerView.d0 a(long j) {
        return this.f1146b.b(j);
    }

    public void a() {
        this.f1145a.clear();
        this.f1146b.a();
    }

    public void a(long j, RecyclerView.d0 d0Var) {
        this.f1146b.c(j, d0Var);
    }

    public void a(RecyclerView.d0 d0Var) {
        a aVar = this.f1145a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f1145a.put(d0Var, aVar);
        }
        aVar.f1147a |= 1;
    }

    public void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f1145a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f1145a.put(d0Var, aVar);
        }
        aVar.f1147a |= 2;
        aVar.f1148b = cVar;
    }

    public void a(b bVar) {
        RecyclerView.l.c cVar;
        RecyclerView.l.c cVar2;
        for (int size = this.f1145a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 b2 = this.f1145a.b(size);
            a c2 = this.f1145a.c(size);
            int i = c2.f1147a;
            if ((i & 3) != 3) {
                if ((i & 1) != 0) {
                    cVar = c2.f1148b;
                    if (cVar != null) {
                        cVar2 = c2.f1149c;
                    }
                } else {
                    if ((i & 14) != 14) {
                        if ((i & 12) == 12) {
                            bVar.b(b2, c2.f1148b, c2.f1149c);
                        } else if ((i & 4) != 0) {
                            cVar = c2.f1148b;
                            cVar2 = null;
                        } else if ((i & 8) == 0) {
                        }
                        a.a(c2);
                    }
                    bVar.c(b2, c2.f1148b, c2.f1149c);
                    a.a(c2);
                }
                bVar.a(b2, cVar, cVar2);
                a.a(c2);
            }
            bVar.a(b2);
            a.a(c2);
        }
    }

    public void b() {
        a.a();
    }

    public void b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f1145a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f1145a.put(d0Var, aVar);
        }
        aVar.f1149c = cVar;
        aVar.f1147a |= 8;
    }

    public boolean b(RecyclerView.d0 d0Var) {
        a aVar = this.f1145a.get(d0Var);
        return (aVar == null || (aVar.f1147a & 1) == 0) ? false : true;
    }

    public void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f1145a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f1145a.put(d0Var, aVar);
        }
        aVar.f1148b = cVar;
        aVar.f1147a |= 4;
    }

    public boolean c(RecyclerView.d0 d0Var) {
        a aVar = this.f1145a.get(d0Var);
        return (aVar == null || (aVar.f1147a & 4) == 0) ? false : true;
    }

    public void d(RecyclerView.d0 d0Var) {
        g(d0Var);
    }

    public RecyclerView.l.c e(RecyclerView.d0 d0Var) {
        return a(d0Var, 8);
    }

    public RecyclerView.l.c f(RecyclerView.d0 d0Var) {
        return a(d0Var, 4);
    }

    public void g(RecyclerView.d0 d0Var) {
        a aVar = this.f1145a.get(d0Var);
        if (aVar == null) {
            return;
        }
        aVar.f1147a &= -2;
    }

    public void h(RecyclerView.d0 d0Var) {
        int b2 = this.f1146b.b() - 1;
        while (true) {
            if (b2 < 0) {
                break;
            } else if (d0Var == this.f1146b.c(b2)) {
                this.f1146b.b(b2);
                break;
            } else {
                b2--;
            }
        }
        a remove = this.f1145a.remove(d0Var);
        if (remove != null) {
            a.a(remove);
        }
    }
}
