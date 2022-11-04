package hd;

import gc.l;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import ke.r;
import tb.e0;
import xc.b;
import xc.j1;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: hd.a$a */
    /* loaded from: classes.dex */
    public static class C0177a extends ae.h {

        /* renamed from: a */
        final /* synthetic */ r f11787a;

        /* renamed from: b */
        final /* synthetic */ Set f11788b;

        /* renamed from: c */
        final /* synthetic */ boolean f11789c;

        /* renamed from: hd.a$a$a */
        /* loaded from: classes.dex */
        class C0178a implements l<xc.b, e0> {
            C0178a() {
                C0177a.this = r1;
            }

            private static /* synthetic */ void a(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            /* renamed from: b */
            public e0 invoke(xc.b bVar) {
                if (bVar == null) {
                    a(0);
                }
                C0177a.this.f11787a.a(bVar);
                return e0.f22152a;
            }
        }

        C0177a(r rVar, Set set, boolean z10) {
            this.f11787a = rVar;
            this.f11788b = set;
            this.f11789c = z10;
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "fromSuper";
            } else if (i10 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i10 == 3) {
                objArr[0] = "member";
            } else if (i10 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "conflict";
            } else if (i10 == 3 || i10 == 4) {
                objArr[2] = "setOverriddenDescriptors";
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
            ae.j.K(bVar, new C0178a());
            this.f11788b.add(bVar);
        }

        @Override // ae.i
        public void d(xc.b bVar, Collection<? extends xc.b> collection) {
            if (bVar == null) {
                f(3);
            }
            if (collection == null) {
                f(4);
            }
            if (!this.f11789c || bVar.h() == b.a.FAKE_OVERRIDE) {
                super.d(bVar, collection);
            }
        }

        @Override // ae.h
        public void e(xc.b bVar, xc.b bVar2) {
            if (bVar == null) {
                f(1);
            }
            if (bVar2 == null) {
                f(2);
            }
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = i10 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 18 ? 3 : 2];
        switch (i10) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static j1 b(wd.f fVar, xc.e eVar) {
        if (fVar == null) {
            a(19);
        }
        if (eVar == null) {
            a(20);
        }
        Collection<xc.d> k10 = eVar.k();
        if (k10.size() != 1) {
            return null;
        }
        for (j1 j1Var : k10.iterator().next().o()) {
            if (j1Var.getName().equals(fVar)) {
                return j1Var;
            }
        }
        return null;
    }

    private static <D extends xc.b> Collection<D> c(wd.f fVar, Collection<D> collection, Collection<D> collection2, xc.e eVar, r rVar, ae.j jVar, boolean z10) {
        if (fVar == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (eVar == null) {
            a(15);
        }
        if (rVar == null) {
            a(16);
        }
        if (jVar == null) {
            a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        jVar.v(fVar, collection, collection2, eVar, new C0177a(rVar, linkedHashSet, z10));
        return linkedHashSet;
    }

    public static <D extends xc.b> Collection<D> d(wd.f fVar, Collection<D> collection, Collection<D> collection2, xc.e eVar, r rVar, ae.j jVar) {
        if (fVar == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (eVar == null) {
            a(3);
        }
        if (rVar == null) {
            a(4);
        }
        if (jVar == null) {
            a(5);
        }
        return c(fVar, collection, collection2, eVar, rVar, jVar, false);
    }

    public static <D extends xc.b> Collection<D> e(wd.f fVar, Collection<D> collection, Collection<D> collection2, xc.e eVar, r rVar, ae.j jVar) {
        if (fVar == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (eVar == null) {
            a(9);
        }
        if (rVar == null) {
            a(10);
        }
        if (jVar == null) {
            a(11);
        }
        return c(fVar, collection, collection2, eVar, rVar, jVar, true);
    }
}
