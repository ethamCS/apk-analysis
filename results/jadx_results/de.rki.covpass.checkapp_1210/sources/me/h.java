package me;

import hc.e0;
import hc.k0;
import hc.t;
import hc.v;
import he.d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ke.x;
import rd.r;
import ub.c0;
import ub.p0;
import ub.q0;
import ub.u;
import ub.y;
import ub.z;
import xc.e1;
import xc.u0;
import xc.z0;
import yd.q;
import yd.s;
/* loaded from: classes3.dex */
public abstract class h extends he.i {

    /* renamed from: e */
    static final /* synthetic */ oc.k<Object>[] f16510e = {k0.g(new e0(k0.b(h.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), k0.g(new e0(k0.b(h.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: a */
    private final ke.m f16511a;

    /* renamed from: b */
    private final a f16512b;

    /* renamed from: c */
    private final ne.i f16513c;

    /* renamed from: d */
    private final ne.j f16514d;

    /* loaded from: classes3.dex */
    public interface a {
        Collection<u0> a(wd.f fVar, fd.b bVar);

        Collection<z0> b(wd.f fVar, fd.b bVar);

        Set<wd.f> c();

        Set<wd.f> d();

        Set<wd.f> e();

        e1 f(wd.f fVar);

        void g(Collection<xc.m> collection, he.d dVar, gc.l<? super wd.f, Boolean> lVar, fd.b bVar);
    }

    /* loaded from: classes3.dex */
    public final class b implements a {

        /* renamed from: o */
        static final /* synthetic */ oc.k<Object>[] f16515o = {k0.g(new e0(k0.b(b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), k0.g(new e0(k0.b(b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), k0.g(new e0(k0.b(b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), k0.g(new e0(k0.b(b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), k0.g(new e0(k0.b(b.class), "allProperties", "getAllProperties()Ljava/util/List;")), k0.g(new e0(k0.b(b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), k0.g(new e0(k0.b(b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), k0.g(new e0(k0.b(b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), k0.g(new e0(k0.b(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), k0.g(new e0(k0.b(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a */
        private final List<rd.i> f16516a;

        /* renamed from: b */
        private final List<rd.n> f16517b;

        /* renamed from: c */
        private final List<r> f16518c;

        /* renamed from: d */
        private final ne.i f16519d;

        /* renamed from: e */
        private final ne.i f16520e;

        /* renamed from: f */
        private final ne.i f16521f;

        /* renamed from: g */
        private final ne.i f16522g;

        /* renamed from: h */
        private final ne.i f16523h;

        /* renamed from: i */
        private final ne.i f16524i;

        /* renamed from: j */
        private final ne.i f16525j;

        /* renamed from: k */
        private final ne.i f16526k;

        /* renamed from: l */
        private final ne.i f16527l;

        /* renamed from: m */
        private final ne.i f16528m;

        /* renamed from: n */
        final /* synthetic */ h f16529n;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class a extends v implements gc.a<List<? extends z0>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a() {
                super(0);
                b.this = r1;
            }

            @Override // gc.a
            public final List<? extends z0> invoke() {
                List<? extends z0> o02;
                o02 = c0.o0(b.this.D(), b.this.t());
                return o02;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: me.h$b$b */
        /* loaded from: classes3.dex */
        public static final class C0250b extends v implements gc.a<List<? extends u0>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0250b() {
                super(0);
                b.this = r1;
            }

            @Override // gc.a
            public final List<? extends u0> invoke() {
                List<? extends u0> o02;
                o02 = c0.o0(b.this.E(), b.this.u());
                return o02;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class c extends v implements gc.a<List<? extends e1>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c() {
                super(0);
                b.this = r1;
            }

            @Override // gc.a
            public final List<? extends e1> invoke() {
                return b.this.z();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class d extends v implements gc.a<List<? extends z0>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d() {
                super(0);
                b.this = r1;
            }

            @Override // gc.a
            public final List<? extends z0> invoke() {
                return b.this.v();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class e extends v implements gc.a<List<? extends u0>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e() {
                super(0);
                b.this = r1;
            }

            @Override // gc.a
            public final List<? extends u0> invoke() {
                return b.this.y();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class f extends v implements gc.a<Set<? extends wd.f>> {

            /* renamed from: d */
            final /* synthetic */ h f16536d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(h hVar) {
                super(0);
                b.this = r1;
                this.f16536d = hVar;
            }

            /* renamed from: b */
            public final Set<wd.f> invoke() {
                Set<wd.f> h10;
                b bVar = b.this;
                List<q> list = bVar.f16516a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                h hVar = bVar.f16529n;
                for (q qVar : list) {
                    linkedHashSet.add(x.b(hVar.p().g(), ((rd.i) qVar).F0()));
                }
                h10 = ub.z0.h(linkedHashSet, this.f16536d.t());
                return h10;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class g extends v implements gc.a<Map<wd.f, ? extends List<? extends z0>>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g() {
                super(0);
                b.this = r1;
            }

            /* renamed from: b */
            public final Map<wd.f, List<z0>> invoke() {
                List A = b.this.A();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : A) {
                    wd.f name = ((z0) obj).getName();
                    t.d(name, "it.name");
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: me.h$b$h */
        /* loaded from: classes3.dex */
        public static final class C0251h extends v implements gc.a<Map<wd.f, ? extends List<? extends u0>>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0251h() {
                super(0);
                b.this = r1;
            }

            /* renamed from: b */
            public final Map<wd.f, List<u0>> invoke() {
                List B = b.this.B();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : B) {
                    wd.f name = ((u0) obj).getName();
                    t.d(name, "it.name");
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class i extends v implements gc.a<Map<wd.f, ? extends e1>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i() {
                super(0);
                b.this = r1;
            }

            /* renamed from: b */
            public final Map<wd.f, e1> invoke() {
                int s10;
                int d10;
                int b10;
                List C = b.this.C();
                s10 = ub.v.s(C, 10);
                d10 = p0.d(s10);
                b10 = nc.m.b(d10, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
                for (Object obj : C) {
                    wd.f name = ((e1) obj).getName();
                    t.d(name, "it.name");
                    linkedHashMap.put(name, obj);
                }
                return linkedHashMap;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class j extends v implements gc.a<Set<? extends wd.f>> {

            /* renamed from: d */
            final /* synthetic */ h f16541d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(h hVar) {
                super(0);
                b.this = r1;
                this.f16541d = hVar;
            }

            /* renamed from: b */
            public final Set<wd.f> invoke() {
                Set<wd.f> h10;
                b bVar = b.this;
                List<q> list = bVar.f16517b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                h hVar = bVar.f16529n;
                for (q qVar : list) {
                    linkedHashSet.add(x.b(hVar.p().g(), ((rd.n) qVar).E0()));
                }
                h10 = ub.z0.h(linkedHashSet, this.f16541d.u());
                return h10;
            }
        }

        public b(h hVar, List<rd.i> list, List<rd.n> list2, List<r> list3) {
            t.e(list, "functionList");
            t.e(list2, "propertyList");
            t.e(list3, "typeAliasList");
            this.f16529n = hVar;
            this.f16516a = list;
            this.f16517b = list2;
            this.f16518c = !hVar.p().c().g().d() ? u.h() : list3;
            this.f16519d = hVar.p().h().d(new d());
            this.f16520e = hVar.p().h().d(new e());
            this.f16521f = hVar.p().h().d(new c());
            this.f16522g = hVar.p().h().d(new a());
            this.f16523h = hVar.p().h().d(new C0250b());
            this.f16524i = hVar.p().h().d(new i());
            this.f16525j = hVar.p().h().d(new g());
            this.f16526k = hVar.p().h().d(new C0251h());
            this.f16527l = hVar.p().h().d(new f(hVar));
            this.f16528m = hVar.p().h().d(new j(hVar));
        }

        public final List<z0> A() {
            return (List) ne.m.a(this.f16522g, this, f16515o[3]);
        }

        public final List<u0> B() {
            return (List) ne.m.a(this.f16523h, this, f16515o[4]);
        }

        public final List<e1> C() {
            return (List) ne.m.a(this.f16521f, this, f16515o[2]);
        }

        public final List<z0> D() {
            return (List) ne.m.a(this.f16519d, this, f16515o[0]);
        }

        public final List<u0> E() {
            return (List) ne.m.a(this.f16520e, this, f16515o[1]);
        }

        private final Map<wd.f, Collection<z0>> F() {
            return (Map) ne.m.a(this.f16525j, this, f16515o[6]);
        }

        private final Map<wd.f, Collection<u0>> G() {
            return (Map) ne.m.a(this.f16526k, this, f16515o[7]);
        }

        private final Map<wd.f, e1> H() {
            return (Map) ne.m.a(this.f16524i, this, f16515o[5]);
        }

        public final List<z0> t() {
            Set<wd.f> t10 = this.f16529n.t();
            ArrayList arrayList = new ArrayList();
            for (wd.f fVar : t10) {
                z.x(arrayList, w(fVar));
            }
            return arrayList;
        }

        public final List<u0> u() {
            Set<wd.f> u10 = this.f16529n.u();
            ArrayList arrayList = new ArrayList();
            for (wd.f fVar : u10) {
                z.x(arrayList, x(fVar));
            }
            return arrayList;
        }

        public final List<z0> v() {
            List<rd.i> list = this.f16516a;
            h hVar = this.f16529n;
            ArrayList arrayList = new ArrayList();
            for (q qVar : list) {
                z0 j10 = hVar.p().f().j((rd.i) qVar);
                if (!hVar.x(j10)) {
                    j10 = null;
                }
                if (j10 != null) {
                    arrayList.add(j10);
                }
            }
            return arrayList;
        }

        private final List<z0> w(wd.f fVar) {
            List<z0> D = D();
            h hVar = this.f16529n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : D) {
                if (t.a(((xc.m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            hVar.k(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List<u0> x(wd.f fVar) {
            List<u0> E = E();
            h hVar = this.f16529n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : E) {
                if (t.a(((xc.m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            hVar.l(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        public final List<u0> y() {
            List<rd.n> list = this.f16517b;
            h hVar = this.f16529n;
            ArrayList arrayList = new ArrayList();
            for (q qVar : list) {
                u0 l10 = hVar.p().f().l((rd.n) qVar);
                if (l10 != null) {
                    arrayList.add(l10);
                }
            }
            return arrayList;
        }

        public final List<e1> z() {
            List<r> list = this.f16518c;
            h hVar = this.f16529n;
            ArrayList arrayList = new ArrayList();
            for (q qVar : list) {
                e1 m10 = hVar.p().f().m((r) qVar);
                if (m10 != null) {
                    arrayList.add(m10);
                }
            }
            return arrayList;
        }

        @Override // me.h.a
        public Collection<u0> a(wd.f fVar, fd.b bVar) {
            List h10;
            List h11;
            t.e(fVar, "name");
            t.e(bVar, "location");
            if (!d().contains(fVar)) {
                h11 = u.h();
                return h11;
            }
            Collection<u0> collection = G().get(fVar);
            if (collection != null) {
                return collection;
            }
            h10 = u.h();
            return h10;
        }

        @Override // me.h.a
        public Collection<z0> b(wd.f fVar, fd.b bVar) {
            List h10;
            List h11;
            t.e(fVar, "name");
            t.e(bVar, "location");
            if (!c().contains(fVar)) {
                h11 = u.h();
                return h11;
            }
            Collection<z0> collection = F().get(fVar);
            if (collection != null) {
                return collection;
            }
            h10 = u.h();
            return h10;
        }

        @Override // me.h.a
        public Set<wd.f> c() {
            return (Set) ne.m.a(this.f16527l, this, f16515o[8]);
        }

        @Override // me.h.a
        public Set<wd.f> d() {
            return (Set) ne.m.a(this.f16528m, this, f16515o[9]);
        }

        @Override // me.h.a
        public Set<wd.f> e() {
            List<r> list = this.f16518c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            h hVar = this.f16529n;
            for (q qVar : list) {
                linkedHashSet.add(x.b(hVar.p().g(), ((r) qVar).y0()));
            }
            return linkedHashSet;
        }

        @Override // me.h.a
        public e1 f(wd.f fVar) {
            t.e(fVar, "name");
            return H().get(fVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.h.a
        public void g(Collection<xc.m> collection, he.d dVar, gc.l<? super wd.f, Boolean> lVar, fd.b bVar) {
            t.e(collection, "result");
            t.e(dVar, "kindFilter");
            t.e(lVar, "nameFilter");
            t.e(bVar, "location");
            if (dVar.a(he.d.Companion.i())) {
                for (Object obj : B()) {
                    wd.f name = ((u0) obj).getName();
                    t.d(name, "it.name");
                    if (lVar.invoke(name).booleanValue()) {
                        collection.add(obj);
                    }
                }
            }
            if (dVar.a(he.d.Companion.d())) {
                for (Object obj2 : A()) {
                    wd.f name2 = ((z0) obj2).getName();
                    t.d(name2, "it.name");
                    if (lVar.invoke(name2).booleanValue()) {
                        collection.add(obj2);
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class c implements a {

        /* renamed from: j */
        static final /* synthetic */ oc.k<Object>[] f16542j = {k0.g(new e0(k0.b(c.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), k0.g(new e0(k0.b(c.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a */
        private final Map<wd.f, byte[]> f16543a;

        /* renamed from: b */
        private final Map<wd.f, byte[]> f16544b;

        /* renamed from: c */
        private final Map<wd.f, byte[]> f16545c;

        /* renamed from: d */
        private final ne.g<wd.f, Collection<z0>> f16546d;

        /* renamed from: e */
        private final ne.g<wd.f, Collection<u0>> f16547e;

        /* renamed from: f */
        private final ne.h<wd.f, e1> f16548f;

        /* renamed from: g */
        private final ne.i f16549g;

        /* renamed from: h */
        private final ne.i f16550h;

        /* renamed from: i */
        final /* synthetic */ h f16551i;

        /* loaded from: classes3.dex */
        public static final class a extends v implements gc.a {

            /* renamed from: c */
            final /* synthetic */ s f16552c;

            /* renamed from: d */
            final /* synthetic */ ByteArrayInputStream f16553d;

            /* renamed from: q */
            final /* synthetic */ h f16554q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s sVar, ByteArrayInputStream byteArrayInputStream, h hVar) {
                super(0);
                this.f16552c = sVar;
                this.f16553d = byteArrayInputStream;
                this.f16554q = hVar;
            }

            /* renamed from: b */
            public final q invoke() {
                return (q) this.f16552c.a(this.f16553d, this.f16554q.p().c().j());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class b extends v implements gc.a<Set<? extends wd.f>> {

            /* renamed from: d */
            final /* synthetic */ h f16556d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar) {
                super(0);
                c.this = r1;
                this.f16556d = hVar;
            }

            /* renamed from: b */
            public final Set<wd.f> invoke() {
                Set<wd.f> h10;
                h10 = ub.z0.h(c.this.f16543a.keySet(), this.f16556d.t());
                return h10;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: me.h$c$c */
        /* loaded from: classes3.dex */
        public static final class C0252c extends v implements gc.l<wd.f, Collection<? extends z0>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0252c() {
                super(1);
                c.this = r1;
            }

            /* renamed from: b */
            public final Collection<z0> invoke(wd.f fVar) {
                t.e(fVar, "it");
                return c.this.m(fVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class d extends v implements gc.l<wd.f, Collection<? extends u0>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d() {
                super(1);
                c.this = r1;
            }

            /* renamed from: b */
            public final Collection<u0> invoke(wd.f fVar) {
                t.e(fVar, "it");
                return c.this.n(fVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class e extends v implements gc.l<wd.f, e1> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e() {
                super(1);
                c.this = r1;
            }

            /* renamed from: b */
            public final e1 invoke(wd.f fVar) {
                t.e(fVar, "it");
                return c.this.o(fVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class f extends v implements gc.a<Set<? extends wd.f>> {

            /* renamed from: d */
            final /* synthetic */ h f16561d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(h hVar) {
                super(0);
                c.this = r1;
                this.f16561d = hVar;
            }

            /* renamed from: b */
            public final Set<wd.f> invoke() {
                Set<wd.f> h10;
                h10 = ub.z0.h(c.this.f16544b.keySet(), this.f16561d.u());
                return h10;
            }
        }

        public c(h hVar, List<rd.i> list, List<rd.n> list2, List<r> list3) {
            Map<wd.f, byte[]> map;
            t.e(list, "functionList");
            t.e(list2, "propertyList");
            t.e(list3, "typeAliasList");
            this.f16551i = hVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                wd.f b10 = x.b(hVar.p().g(), ((rd.i) ((q) obj)).F0());
                Object obj2 = linkedHashMap.get(b10);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(b10, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.f16543a = p(linkedHashMap);
            h hVar2 = this.f16551i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                wd.f b11 = x.b(hVar2.p().g(), ((rd.n) ((q) obj3)).E0());
                Object obj4 = linkedHashMap2.get(b11);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(b11, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.f16544b = p(linkedHashMap2);
            if (this.f16551i.p().c().g().d()) {
                h hVar3 = this.f16551i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj5 : list3) {
                    wd.f b12 = x.b(hVar3.p().g(), ((r) ((q) obj5)).y0());
                    Object obj6 = linkedHashMap3.get(b12);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap3.put(b12, obj6);
                    }
                    ((List) obj6).add(obj5);
                }
                map = p(linkedHashMap3);
            } else {
                map = q0.h();
            }
            this.f16545c = map;
            this.f16546d = this.f16551i.p().h().b(new C0252c());
            this.f16547e = this.f16551i.p().h().b(new d());
            this.f16548f = this.f16551i.p().h().i(new e());
            this.f16549g = this.f16551i.p().h().d(new b(this.f16551i));
            this.f16550h = this.f16551i.p().h().d(new f(this.f16551i));
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
            if (r0 != null) goto L7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Collection<xc.z0> m(wd.f r7) {
            /*
                r6 = this;
                java.util.Map<wd.f, byte[]> r0 = r6.f16543a
                yd.s<rd.i> r1 = rd.i.f20924l4
                java.lang.String r2 = "PARSER"
                hc.t.d(r1, r2)
                me.h r2 = r6.f16551i
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2a
                me.h r3 = r6.f16551i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                me.h$c$a r0 = new me.h$c$a
                r0.<init>(r1, r4, r3)
                af.h r0 = af.k.i(r0)
                java.util.List r0 = af.k.F(r0)
                if (r0 == 0) goto L2a
                goto L2e
            L2a:
                java.util.List r0 = ub.s.h()
            L2e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L3b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L66
                java.lang.Object r3 = r0.next()
                rd.i r3 = (rd.i) r3
                ke.m r4 = r2.p()
                ke.w r4 = r4.f()
                java.lang.String r5 = "it"
                hc.t.d(r3, r5)
                xc.z0 r3 = r4.j(r3)
                boolean r4 = r2.x(r3)
                if (r4 == 0) goto L5f
                goto L60
            L5f:
                r3 = 0
            L60:
                if (r3 == 0) goto L3b
                r1.add(r3)
                goto L3b
            L66:
                r2.k(r7, r1)
                java.util.List r7 = ye.a.c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: me.h.c.m(wd.f):java.util.Collection");
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
            if (r0 != null) goto L7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Collection<xc.u0> n(wd.f r7) {
            /*
                r6 = this;
                java.util.Map<wd.f, byte[]> r0 = r6.f16544b
                yd.s<rd.n> r1 = rd.n.f20971l4
                java.lang.String r2 = "PARSER"
                hc.t.d(r1, r2)
                me.h r2 = r6.f16551i
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2a
                me.h r3 = r6.f16551i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                me.h$c$a r0 = new me.h$c$a
                r0.<init>(r1, r4, r3)
                af.h r0 = af.k.i(r0)
                java.util.List r0 = af.k.F(r0)
                if (r0 == 0) goto L2a
                goto L2e
            L2a:
                java.util.List r0 = ub.s.h()
            L2e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L3b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L5e
                java.lang.Object r3 = r0.next()
                rd.n r3 = (rd.n) r3
                ke.m r4 = r2.p()
                ke.w r4 = r4.f()
                java.lang.String r5 = "it"
                hc.t.d(r3, r5)
                xc.u0 r3 = r4.l(r3)
                if (r3 == 0) goto L3b
                r1.add(r3)
                goto L3b
            L5e:
                r2.l(r7, r1)
                java.util.List r7 = ye.a.c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: me.h.c.n(wd.f):java.util.Collection");
        }

        public final e1 o(wd.f fVar) {
            r P0;
            byte[] bArr = this.f16545c.get(fVar);
            if (bArr == null || (P0 = r.P0(new ByteArrayInputStream(bArr), this.f16551i.p().c().j())) == null) {
                return null;
            }
            return this.f16551i.p().f().m(P0);
        }

        private final Map<wd.f, byte[]> p(Map<wd.f, ? extends Collection<? extends yd.a>> map) {
            int d10;
            int s10;
            d10 = p0.d(map.size());
            LinkedHashMap linkedHashMap = new LinkedHashMap(d10);
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<yd.a> iterable = (Iterable) entry.getValue();
                s10 = ub.v.s(iterable, 10);
                ArrayList arrayList = new ArrayList(s10);
                for (yd.a aVar : iterable) {
                    aVar.n(byteArrayOutputStream);
                    arrayList.add(tb.e0.f22152a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        @Override // me.h.a
        public Collection<u0> a(wd.f fVar, fd.b bVar) {
            List h10;
            t.e(fVar, "name");
            t.e(bVar, "location");
            if (!d().contains(fVar)) {
                h10 = u.h();
                return h10;
            }
            return this.f16547e.invoke(fVar);
        }

        @Override // me.h.a
        public Collection<z0> b(wd.f fVar, fd.b bVar) {
            List h10;
            t.e(fVar, "name");
            t.e(bVar, "location");
            if (!c().contains(fVar)) {
                h10 = u.h();
                return h10;
            }
            return this.f16546d.invoke(fVar);
        }

        @Override // me.h.a
        public Set<wd.f> c() {
            return (Set) ne.m.a(this.f16549g, this, f16542j[0]);
        }

        @Override // me.h.a
        public Set<wd.f> d() {
            return (Set) ne.m.a(this.f16550h, this, f16542j[1]);
        }

        @Override // me.h.a
        public Set<wd.f> e() {
            return this.f16545c.keySet();
        }

        @Override // me.h.a
        public e1 f(wd.f fVar) {
            t.e(fVar, "name");
            return this.f16548f.invoke(fVar);
        }

        @Override // me.h.a
        public void g(Collection<xc.m> collection, he.d dVar, gc.l<? super wd.f, Boolean> lVar, fd.b bVar) {
            t.e(collection, "result");
            t.e(dVar, "kindFilter");
            t.e(lVar, "nameFilter");
            t.e(bVar, "location");
            if (dVar.a(he.d.Companion.i())) {
                Set<wd.f> d10 = d();
                ArrayList arrayList = new ArrayList();
                for (wd.f fVar : d10) {
                    if (lVar.invoke(fVar).booleanValue()) {
                        arrayList.addAll(a(fVar, bVar));
                    }
                }
                ae.g gVar = ae.g.f442c;
                t.d(gVar, "INSTANCE");
                y.w(arrayList, gVar);
                collection.addAll(arrayList);
            }
            if (dVar.a(he.d.Companion.d())) {
                Set<wd.f> c10 = c();
                ArrayList arrayList2 = new ArrayList();
                for (wd.f fVar2 : c10) {
                    if (lVar.invoke(fVar2).booleanValue()) {
                        arrayList2.addAll(b(fVar2, bVar));
                    }
                }
                ae.g gVar2 = ae.g.f442c;
                t.d(gVar2, "INSTANCE");
                y.w(arrayList2, gVar2);
                collection.addAll(arrayList2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d extends v implements gc.a<Set<? extends wd.f>> {

        /* renamed from: c */
        final /* synthetic */ gc.a<Collection<wd.f>> f16562c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(gc.a<? extends Collection<wd.f>> aVar) {
            super(0);
            this.f16562c = aVar;
        }

        /* renamed from: b */
        public final Set<wd.f> invoke() {
            Set<wd.f> J0;
            J0 = c0.J0(this.f16562c.invoke());
            return J0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class e extends v implements gc.a<Set<? extends wd.f>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(0);
            h.this = r1;
        }

        /* renamed from: b */
        public final Set<wd.f> invoke() {
            Set h10;
            Set<wd.f> h11;
            Set<wd.f> s10 = h.this.s();
            if (s10 == null) {
                return null;
            }
            h10 = ub.z0.h(h.this.q(), h.this.f16512b.e());
            h11 = ub.z0.h(h10, s10);
            return h11;
        }
    }

    public h(ke.m mVar, List<rd.i> list, List<rd.n> list2, List<r> list3, gc.a<? extends Collection<wd.f>> aVar) {
        t.e(mVar, "c");
        t.e(list, "functionList");
        t.e(list2, "propertyList");
        t.e(list3, "typeAliasList");
        t.e(aVar, "classNames");
        this.f16511a = mVar;
        this.f16512b = n(list, list2, list3);
        this.f16513c = mVar.h().d(new d(aVar));
        this.f16514d = mVar.h().f(new e());
    }

    private final a n(List<rd.i> list, List<rd.n> list2, List<r> list3) {
        return this.f16511a.c().g().a() ? new b(this, list, list2, list3) : new c(this, list, list2, list3);
    }

    private final xc.e o(wd.f fVar) {
        return this.f16511a.c().b(m(fVar));
    }

    private final Set<wd.f> r() {
        return (Set) ne.m.b(this.f16514d, this, f16510e[1]);
    }

    private final e1 v(wd.f fVar) {
        return this.f16512b.f(fVar);
    }

    @Override // he.i, he.h
    public Collection<u0> a(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        return this.f16512b.a(fVar, bVar);
    }

    @Override // he.i, he.h
    public Collection<z0> b(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        return this.f16512b.b(fVar, bVar);
    }

    @Override // he.i, he.h
    public Set<wd.f> c() {
        return this.f16512b.c();
    }

    @Override // he.i, he.h
    public Set<wd.f> d() {
        return this.f16512b.d();
    }

    @Override // he.i, he.k
    public xc.h f(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        if (w(fVar)) {
            return o(fVar);
        }
        if (!this.f16512b.e().contains(fVar)) {
            return null;
        }
        return v(fVar);
    }

    @Override // he.i, he.h
    public Set<wd.f> g() {
        return r();
    }

    protected abstract void i(Collection<xc.m> collection, gc.l<? super wd.f, Boolean> lVar);

    public final Collection<xc.m> j(he.d dVar, gc.l<? super wd.f, Boolean> lVar, fd.b bVar) {
        t.e(dVar, "kindFilter");
        t.e(lVar, "nameFilter");
        t.e(bVar, "location");
        ArrayList arrayList = new ArrayList(0);
        d.a aVar = he.d.Companion;
        if (dVar.a(aVar.g())) {
            i(arrayList, lVar);
        }
        this.f16512b.g(arrayList, dVar, lVar, bVar);
        if (dVar.a(aVar.c())) {
            for (wd.f fVar : q()) {
                if (lVar.invoke(fVar).booleanValue()) {
                    ye.a.a(arrayList, o(fVar));
                }
            }
        }
        if (dVar.a(he.d.Companion.h())) {
            for (wd.f fVar2 : this.f16512b.e()) {
                if (lVar.invoke(fVar2).booleanValue()) {
                    ye.a.a(arrayList, this.f16512b.f(fVar2));
                }
            }
        }
        return ye.a.c(arrayList);
    }

    protected void k(wd.f fVar, List<z0> list) {
        t.e(fVar, "name");
        t.e(list, "functions");
    }

    protected void l(wd.f fVar, List<u0> list) {
        t.e(fVar, "name");
        t.e(list, "descriptors");
    }

    protected abstract wd.b m(wd.f fVar);

    public final ke.m p() {
        return this.f16511a;
    }

    public final Set<wd.f> q() {
        return (Set) ne.m.a(this.f16513c, this, f16510e[0]);
    }

    protected abstract Set<wd.f> s();

    protected abstract Set<wd.f> t();

    protected abstract Set<wd.f> u();

    public boolean w(wd.f fVar) {
        t.e(fVar, "name");
        return q().contains(fVar);
    }

    protected boolean x(z0 z0Var) {
        t.e(z0Var, "function");
        return true;
    }
}
