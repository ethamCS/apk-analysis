package pd;

import ce.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import oe.e0;
import pd.q;
import ub.c0;
import xc.a1;
import xc.h0;
import xc.j1;
import xc.k0;
/* loaded from: classes.dex */
public final class c extends pd.a<yc.c, ce.g<?>> {

    /* renamed from: c */
    private final h0 f19075c;

    /* renamed from: d */
    private final k0 f19076d;

    /* renamed from: e */
    private final ke.e f19077e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class a implements q.a {

        /* renamed from: pd.c$a$a */
        /* loaded from: classes.dex */
        public static final class C0305a implements q.a {

            /* renamed from: a */
            private final /* synthetic */ q.a f19079a;

            /* renamed from: b */
            final /* synthetic */ q.a f19080b;

            /* renamed from: c */
            final /* synthetic */ a f19081c;

            /* renamed from: d */
            final /* synthetic */ wd.f f19082d;

            /* renamed from: e */
            final /* synthetic */ ArrayList<yc.c> f19083e;

            C0305a(q.a aVar, a aVar2, wd.f fVar, ArrayList<yc.c> arrayList) {
                this.f19080b = aVar;
                this.f19081c = aVar2;
                this.f19082d = fVar;
                this.f19083e = arrayList;
                this.f19079a = aVar;
            }

            @Override // pd.q.a
            public void a() {
                Object s02;
                this.f19080b.a();
                a aVar = this.f19081c;
                wd.f fVar = this.f19082d;
                s02 = c0.s0(this.f19083e);
                aVar.h(fVar, new ce.a((yc.c) s02));
            }

            @Override // pd.q.a
            public void b(wd.f fVar, ce.f fVar2) {
                hc.t.e(fVar2, "value");
                this.f19079a.b(fVar, fVar2);
            }

            @Override // pd.q.a
            public void c(wd.f fVar, Object obj) {
                this.f19079a.c(fVar, obj);
            }

            @Override // pd.q.a
            public void d(wd.f fVar, wd.b bVar, wd.f fVar2) {
                hc.t.e(bVar, "enumClassId");
                hc.t.e(fVar2, "enumEntryName");
                this.f19079a.d(fVar, bVar, fVar2);
            }

            @Override // pd.q.a
            public q.a e(wd.f fVar, wd.b bVar) {
                hc.t.e(bVar, "classId");
                return this.f19079a.e(fVar, bVar);
            }

            @Override // pd.q.a
            public q.b f(wd.f fVar) {
                return this.f19079a.f(fVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements q.b {

            /* renamed from: a */
            private final ArrayList<ce.g<?>> f19084a = new ArrayList<>();

            /* renamed from: b */
            final /* synthetic */ c f19085b;

            /* renamed from: c */
            final /* synthetic */ wd.f f19086c;

            /* renamed from: d */
            final /* synthetic */ a f19087d;

            /* renamed from: pd.c$a$b$a */
            /* loaded from: classes.dex */
            public static final class C0306a implements q.a {

                /* renamed from: a */
                private final /* synthetic */ q.a f19088a;

                /* renamed from: b */
                final /* synthetic */ q.a f19089b;

                /* renamed from: c */
                final /* synthetic */ b f19090c;

                /* renamed from: d */
                final /* synthetic */ ArrayList<yc.c> f19091d;

                C0306a(q.a aVar, b bVar, ArrayList<yc.c> arrayList) {
                    this.f19089b = aVar;
                    this.f19090c = bVar;
                    this.f19091d = arrayList;
                    this.f19088a = aVar;
                }

                @Override // pd.q.a
                public void a() {
                    Object s02;
                    this.f19089b.a();
                    ArrayList arrayList = this.f19090c.f19084a;
                    s02 = c0.s0(this.f19091d);
                    arrayList.add(new ce.a((yc.c) s02));
                }

                @Override // pd.q.a
                public void b(wd.f fVar, ce.f fVar2) {
                    hc.t.e(fVar2, "value");
                    this.f19088a.b(fVar, fVar2);
                }

                @Override // pd.q.a
                public void c(wd.f fVar, Object obj) {
                    this.f19088a.c(fVar, obj);
                }

                @Override // pd.q.a
                public void d(wd.f fVar, wd.b bVar, wd.f fVar2) {
                    hc.t.e(bVar, "enumClassId");
                    hc.t.e(fVar2, "enumEntryName");
                    this.f19088a.d(fVar, bVar, fVar2);
                }

                @Override // pd.q.a
                public q.a e(wd.f fVar, wd.b bVar) {
                    hc.t.e(bVar, "classId");
                    return this.f19088a.e(fVar, bVar);
                }

                @Override // pd.q.a
                public q.b f(wd.f fVar) {
                    return this.f19088a.f(fVar);
                }
            }

            b(c cVar, wd.f fVar, a aVar) {
                this.f19085b = cVar;
                this.f19086c = fVar;
                this.f19087d = aVar;
            }

            @Override // pd.q.b
            public void a() {
                this.f19087d.g(this.f19086c, this.f19084a);
            }

            @Override // pd.q.b
            public void b(wd.b bVar, wd.f fVar) {
                hc.t.e(bVar, "enumClassId");
                hc.t.e(fVar, "enumEntryName");
                this.f19084a.add(new ce.j(bVar, fVar));
            }

            @Override // pd.q.b
            public void c(ce.f fVar) {
                hc.t.e(fVar, "value");
                this.f19084a.add(new ce.q(fVar));
            }

            @Override // pd.q.b
            public void d(Object obj) {
                this.f19084a.add(this.f19085b.K(this.f19086c, obj));
            }

            @Override // pd.q.b
            public q.a e(wd.b bVar) {
                hc.t.e(bVar, "classId");
                ArrayList arrayList = new ArrayList();
                c cVar = this.f19085b;
                a1 a1Var = a1.f25519a;
                hc.t.d(a1Var, "NO_SOURCE");
                q.a x10 = cVar.x(bVar, a1Var, arrayList);
                hc.t.b(x10);
                return new C0306a(x10, this, arrayList);
            }
        }

        public a() {
            c.this = r1;
        }

        @Override // pd.q.a
        public void b(wd.f fVar, ce.f fVar2) {
            hc.t.e(fVar2, "value");
            h(fVar, new ce.q(fVar2));
        }

        @Override // pd.q.a
        public void c(wd.f fVar, Object obj) {
            h(fVar, c.this.K(fVar, obj));
        }

        @Override // pd.q.a
        public void d(wd.f fVar, wd.b bVar, wd.f fVar2) {
            hc.t.e(bVar, "enumClassId");
            hc.t.e(fVar2, "enumEntryName");
            h(fVar, new ce.j(bVar, fVar2));
        }

        @Override // pd.q.a
        public q.a e(wd.f fVar, wd.b bVar) {
            hc.t.e(bVar, "classId");
            ArrayList arrayList = new ArrayList();
            c cVar = c.this;
            a1 a1Var = a1.f25519a;
            hc.t.d(a1Var, "NO_SOURCE");
            q.a x10 = cVar.x(bVar, a1Var, arrayList);
            hc.t.b(x10);
            return new C0305a(x10, this, fVar, arrayList);
        }

        @Override // pd.q.a
        public q.b f(wd.f fVar) {
            return new b(c.this, fVar, this);
        }

        public abstract void g(wd.f fVar, ArrayList<ce.g<?>> arrayList);

        public abstract void h(wd.f fVar, ce.g<?> gVar);
    }

    /* loaded from: classes.dex */
    public static final class b extends a {

        /* renamed from: b */
        private final HashMap<wd.f, ce.g<?>> f19092b = new HashMap<>();

        /* renamed from: d */
        final /* synthetic */ xc.e f19094d;

        /* renamed from: e */
        final /* synthetic */ wd.b f19095e;

        /* renamed from: f */
        final /* synthetic */ List<yc.c> f19096f;

        /* renamed from: g */
        final /* synthetic */ a1 f19097g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xc.e eVar, wd.b bVar, List<yc.c> list, a1 a1Var) {
            super();
            c.this = r1;
            this.f19094d = eVar;
            this.f19095e = bVar;
            this.f19096f = list;
            this.f19097g = a1Var;
        }

        @Override // pd.q.a
        public void a() {
            if (!c.this.E(this.f19095e, this.f19092b) && !c.this.w(this.f19095e)) {
                this.f19096f.add(new yc.d(this.f19094d.u(), this.f19092b, this.f19097g));
            }
        }

        @Override // pd.c.a
        public void g(wd.f fVar, ArrayList<ce.g<?>> arrayList) {
            hc.t.e(arrayList, "elements");
            if (fVar == null) {
                return;
            }
            j1 b10 = hd.a.b(fVar, this.f19094d);
            if (b10 != null) {
                HashMap<wd.f, ce.g<?>> hashMap = this.f19092b;
                ce.h hVar = ce.h.f6450a;
                List<? extends ce.g<?>> c10 = ye.a.c(arrayList);
                e0 type = b10.getType();
                hc.t.d(type, "parameter.type");
                hashMap.put(fVar, hVar.a(c10, type));
            } else if (c.this.w(this.f19095e) && hc.t.a(fVar.b(), "value")) {
                ArrayList<ce.a> arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof ce.a) {
                        arrayList2.add(obj);
                    }
                }
                List<yc.c> list = this.f19096f;
                for (ce.a aVar : arrayList2) {
                    list.add(aVar.b());
                }
            }
        }

        @Override // pd.c.a
        public void h(wd.f fVar, ce.g<?> gVar) {
            hc.t.e(gVar, "value");
            if (fVar != null) {
                this.f19092b.put(fVar, gVar);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h0 h0Var, k0 k0Var, ne.n nVar, o oVar) {
        super(nVar, oVar);
        hc.t.e(h0Var, "module");
        hc.t.e(k0Var, "notFoundClasses");
        hc.t.e(nVar, "storageManager");
        hc.t.e(oVar, "kotlinClassFinder");
        this.f19075c = h0Var;
        this.f19076d = k0Var;
        this.f19077e = new ke.e(h0Var, k0Var);
    }

    public final ce.g<?> K(wd.f fVar, Object obj) {
        ce.g<?> c10 = ce.h.f6450a.c(obj);
        if (c10 == null) {
            k.a aVar = ce.k.Companion;
            return aVar.a("Unsupported annotation argument: " + fVar);
        }
        return c10;
    }

    private final xc.e N(wd.b bVar) {
        return xc.x.c(this.f19075c, bVar, this.f19076d);
    }

    /* renamed from: L */
    public ce.g<?> G(String str, Object obj) {
        boolean N;
        hc.t.e(str, "desc");
        hc.t.e(obj, "initializer");
        boolean z10 = false;
        N = bf.y.N("ZBCS", str, false, 2, null);
        if (N) {
            int intValue = ((Integer) obj).intValue();
            int hashCode = str.hashCode();
            if (hashCode == 66) {
                if (str.equals("B")) {
                    obj = Byte.valueOf((byte) intValue);
                }
                throw new AssertionError(str);
            } else if (hashCode == 67) {
                if (str.equals("C")) {
                    obj = Character.valueOf((char) intValue);
                }
                throw new AssertionError(str);
            } else if (hashCode == 83) {
                if (str.equals("S")) {
                    obj = Short.valueOf((short) intValue);
                }
                throw new AssertionError(str);
            } else {
                if (hashCode == 90 && str.equals("Z")) {
                    if (intValue != 0) {
                        z10 = true;
                    }
                    obj = Boolean.valueOf(z10);
                }
                throw new AssertionError(str);
            }
        }
        return ce.h.f6450a.c(obj);
    }

    /* renamed from: M */
    public yc.c A(rd.b bVar, td.c cVar) {
        hc.t.e(bVar, "proto");
        hc.t.e(cVar, "nameResolver");
        return this.f19077e.a(bVar, cVar);
    }

    /* renamed from: O */
    public ce.g<?> I(ce.g<?> gVar) {
        ce.g<?> yVar;
        hc.t.e(gVar, "constant");
        if (gVar instanceof ce.d) {
            yVar = new ce.w(((ce.d) gVar).b().byteValue());
        } else if (gVar instanceof ce.u) {
            yVar = new ce.z(((ce.u) gVar).b().shortValue());
        } else if (gVar instanceof ce.m) {
            yVar = new ce.x(((ce.m) gVar).b().intValue());
        } else if (!(gVar instanceof ce.r)) {
            return gVar;
        } else {
            yVar = new ce.y(((ce.r) gVar).b().longValue());
        }
        return yVar;
    }

    @Override // pd.b
    protected q.a x(wd.b bVar, a1 a1Var, List<yc.c> list) {
        hc.t.e(bVar, "annotationClassId");
        hc.t.e(a1Var, "source");
        hc.t.e(list, "result");
        return new b(N(bVar), bVar, list, a1Var);
    }
}
