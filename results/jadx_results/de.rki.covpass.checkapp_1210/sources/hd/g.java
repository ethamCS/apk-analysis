package hd;

import nd.l;
import nd.n;
import nd.q;
import xc.u0;
import xc.z0;
/* loaded from: classes.dex */
public interface g {

    /* renamed from: a */
    public static final g f11812a = new a();

    /* loaded from: classes.dex */
    static class a implements g {
        a() {
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // hd.g
        public void a(n nVar, u0 u0Var) {
            if (nVar == null) {
                f(5);
            }
            if (u0Var == null) {
                f(6);
            }
        }

        @Override // hd.g
        public void b(q qVar, z0 z0Var) {
            if (qVar == null) {
                f(1);
            }
            if (z0Var == null) {
                f(2);
            }
        }

        @Override // hd.g
        public void c(nd.g gVar, xc.e eVar) {
            if (gVar == null) {
                f(7);
            }
            if (eVar == null) {
                f(8);
            }
        }

        @Override // hd.g
        public void d(l lVar, xc.l lVar2) {
            if (lVar == null) {
                f(3);
            }
            if (lVar2 == null) {
                f(4);
            }
        }

        @Override // hd.g
        public xc.e e(wd.c cVar) {
            if (cVar == null) {
                f(0);
                return null;
            }
            return null;
        }
    }

    void a(n nVar, u0 u0Var);

    void b(q qVar, z0 z0Var);

    void c(nd.g gVar, xc.e eVar);

    void d(l lVar, xc.l lVar2);

    xc.e e(wd.c cVar);
}
