package ad;

import he.h;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import oe.e1;
import xc.a1;
import xc.f1;
import xc.h1;
import xc.u0;
import xc.z0;
/* loaded from: classes.dex */
public class n extends g {
    private final e1 W3;
    private final he.h X3;
    private final ne.i<Set<wd.f>> Y3;
    private final yc.g Z3;

    /* loaded from: classes.dex */
    public class a extends he.i {

        /* renamed from: a */
        private final ne.g<wd.f, Collection<? extends z0>> f331a;

        /* renamed from: b */
        private final ne.g<wd.f, Collection<? extends u0>> f332b;

        /* renamed from: c */
        private final ne.i<Collection<xc.m>> f333c;

        /* renamed from: d */
        final /* synthetic */ n f334d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ad.n$a$a */
        /* loaded from: classes.dex */
        public class C0006a implements gc.l<wd.f, Collection<? extends z0>> {

            /* renamed from: c */
            final /* synthetic */ n f335c;

            C0006a(n nVar) {
                a.this = r1;
                this.f335c = nVar;
            }

            /* renamed from: a */
            public Collection<? extends z0> invoke(wd.f fVar) {
                return a.this.m(fVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements gc.l<wd.f, Collection<? extends u0>> {

            /* renamed from: c */
            final /* synthetic */ n f337c;

            b(n nVar) {
                a.this = r1;
                this.f337c = nVar;
            }

            /* renamed from: a */
            public Collection<? extends u0> invoke(wd.f fVar) {
                return a.this.n(fVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class c implements gc.a<Collection<xc.m>> {

            /* renamed from: c */
            final /* synthetic */ n f339c;

            c(n nVar) {
                a.this = r1;
                this.f339c = nVar;
            }

            /* renamed from: a */
            public Collection<xc.m> invoke() {
                return a.this.l();
            }
        }

        /* loaded from: classes.dex */
        public class d extends ae.h {

            /* renamed from: a */
            final /* synthetic */ Set f341a;

            d(Set set) {
                a.this = r1;
                this.f341a = set;
            }

            private static /* synthetic */ void f(int i10) {
                Object[] objArr = new Object[3];
                if (i10 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i10 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i10 == 1 || i10 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // ae.i
            public void a(xc.b bVar) {
                if (bVar == null) {
                    f(0);
                }
                ae.j.K(bVar, null);
                this.f341a.add(bVar);
            }

            @Override // ae.h
            protected void e(xc.b bVar, xc.b bVar2) {
                if (bVar == null) {
                    f(1);
                }
                if (bVar2 == null) {
                    f(2);
                }
            }
        }

        public a(n nVar, ne.n nVar2) {
            if (nVar2 == null) {
                h(0);
            }
            this.f334d = nVar;
            this.f331a = nVar2.b(new C0006a(nVar));
            this.f332b = nVar2.b(new b(nVar));
            this.f333c = nVar2.d(new c(nVar));
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00b5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ void h(int r13) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ad.n.a.h(int):void");
        }

        public Collection<xc.m> l() {
            HashSet hashSet = new HashSet();
            for (wd.f fVar : (Set) this.f334d.Y3.invoke()) {
                fd.d dVar = fd.d.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(b(fVar, dVar));
                hashSet.addAll(a(fVar, dVar));
            }
            return hashSet;
        }

        public Collection<? extends z0> m(wd.f fVar) {
            if (fVar == null) {
                h(8);
            }
            return p(fVar, o().b(fVar, fd.d.FOR_NON_TRACKED_SCOPE));
        }

        public Collection<? extends u0> n(wd.f fVar) {
            if (fVar == null) {
                h(4);
            }
            return p(fVar, o().a(fVar, fd.d.FOR_NON_TRACKED_SCOPE));
        }

        private he.h o() {
            he.h z10 = this.f334d.r().l().iterator().next().z();
            if (z10 == null) {
                h(9);
            }
            return z10;
        }

        private <D extends xc.b> Collection<? extends D> p(wd.f fVar, Collection<? extends D> collection) {
            if (fVar == null) {
                h(10);
            }
            if (collection == null) {
                h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ae.j.f444f.v(fVar, collection, Collections.emptySet(), this.f334d, new d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // he.i, he.h
        public Collection<? extends u0> a(wd.f fVar, fd.b bVar) {
            if (fVar == null) {
                h(1);
            }
            if (bVar == null) {
                h(2);
            }
            Collection<? extends u0> invoke = this.f332b.invoke(fVar);
            if (invoke == null) {
                h(3);
            }
            return invoke;
        }

        @Override // he.i, he.h
        public Collection<? extends z0> b(wd.f fVar, fd.b bVar) {
            if (fVar == null) {
                h(5);
            }
            if (bVar == null) {
                h(6);
            }
            Collection<? extends z0> invoke = this.f331a.invoke(fVar);
            if (invoke == null) {
                h(7);
            }
            return invoke;
        }

        @Override // he.i, he.h
        public Set<wd.f> c() {
            Set<wd.f> set = (Set) this.f334d.Y3.invoke();
            if (set == null) {
                h(17);
            }
            return set;
        }

        @Override // he.i, he.h
        public Set<wd.f> d() {
            Set<wd.f> set = (Set) this.f334d.Y3.invoke();
            if (set == null) {
                h(19);
            }
            return set;
        }

        @Override // he.i, he.k
        public Collection<xc.m> e(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
            if (dVar == null) {
                h(13);
            }
            if (lVar == null) {
                h(14);
            }
            Collection<xc.m> invoke = this.f333c.invoke();
            if (invoke == null) {
                h(15);
            }
            return invoke;
        }

        @Override // he.i, he.h
        public Set<wd.f> g() {
            Set<wd.f> emptySet = Collections.emptySet();
            if (emptySet == null) {
                h(18);
            }
            return emptySet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private n(ne.n nVar, xc.e eVar, oe.e0 e0Var, wd.f fVar, ne.i<Set<wd.f>> iVar, yc.g gVar, a1 a1Var) {
        super(nVar, eVar, fVar, a1Var, false);
        if (nVar == null) {
            z0(6);
        }
        if (eVar == null) {
            z0(7);
        }
        if (e0Var == null) {
            z0(8);
        }
        if (fVar == null) {
            z0(9);
        }
        if (iVar == null) {
            z0(10);
        }
        if (gVar == null) {
            z0(11);
        }
        if (a1Var == null) {
            z0(12);
        }
        this.Z3 = gVar;
        this.W3 = new oe.l(this, Collections.emptyList(), Collections.singleton(e0Var), nVar);
        this.X3 = new a(this, nVar);
        this.Y3 = iVar;
    }

    public static n U0(ne.n nVar, xc.e eVar, wd.f fVar, ne.i<Set<wd.f>> iVar, yc.g gVar, a1 a1Var) {
        if (nVar == null) {
            z0(0);
        }
        if (eVar == null) {
            z0(1);
        }
        if (fVar == null) {
            z0(2);
        }
        if (iVar == null) {
            z0(3);
        }
        if (gVar == null) {
            z0(4);
        }
        if (a1Var == null) {
            z0(5);
        }
        return new n(nVar, eVar, eVar.u(), fVar, iVar, gVar, a1Var);
    }

    private static /* synthetic */ void z0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // xc.e, xc.i
    public List<f1> A() {
        List<f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            z0(22);
        }
        return emptyList;
    }

    @Override // xc.e
    public xc.d A0() {
        return null;
    }

    @Override // xc.e
    public he.h B0() {
        h.b bVar = h.b.f11873a;
        if (bVar == null) {
            z0(15);
        }
        return bVar;
    }

    @Override // xc.e
    public xc.e E0() {
        return null;
    }

    @Override // xc.d0
    public boolean L0() {
        return false;
    }

    @Override // xc.e
    public boolean N() {
        return false;
    }

    @Override // xc.e
    public boolean R0() {
        return false;
    }

    @Override // xc.e
    public boolean V() {
        return false;
    }

    @Override // xc.e, xc.q, xc.d0
    public xc.u g() {
        xc.u uVar = xc.t.f25581e;
        if (uVar == null) {
            z0(20);
        }
        return uVar;
    }

    @Override // xc.e
    public xc.f h() {
        xc.f fVar = xc.f.ENUM_ENTRY;
        if (fVar == null) {
            z0(18);
        }
        return fVar;
    }

    @Override // xc.e
    public boolean isInline() {
        return false;
    }

    @Override // yc.a
    public yc.g j() {
        yc.g gVar = this.Z3;
        if (gVar == null) {
            z0(21);
        }
        return gVar;
    }

    @Override // xc.e
    public boolean j0() {
        return false;
    }

    @Override // xc.e
    public Collection<xc.d> k() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            z0(16);
        }
        return emptyList;
    }

    @Override // xc.d0
    public boolean l0() {
        return false;
    }

    @Override // xc.i
    public boolean m0() {
        return false;
    }

    @Override // xc.h
    public e1 r() {
        e1 e1Var = this.W3;
        if (e1Var == null) {
            z0(17);
        }
        return e1Var;
    }

    @Override // xc.e, xc.d0
    public xc.e0 s() {
        xc.e0 e0Var = xc.e0.FINAL;
        if (e0Var == null) {
            z0(19);
        }
        return e0Var;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    @Override // xc.e
    public Collection<xc.e> v() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            z0(23);
        }
        return emptyList;
    }

    @Override // xc.e
    public h1<oe.m0> x0() {
        return null;
    }

    @Override // ad.t
    public he.h y0(pe.g gVar) {
        if (gVar == null) {
            z0(13);
        }
        he.h hVar = this.X3;
        if (hVar == null) {
            z0(14);
        }
        return hVar;
    }
}
