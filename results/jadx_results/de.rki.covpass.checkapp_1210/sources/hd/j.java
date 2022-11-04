package hd;

import java.util.Collections;
import java.util.List;
import nd.r;
import oe.e0;
import xc.f1;
import xc.j1;
/* loaded from: classes.dex */
public interface j {

    /* renamed from: a */
    public static final j f11819a = new a();

    /* loaded from: classes.dex */
    static class a implements j {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i10 == 5 || i10 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // hd.j
        public b a(r rVar, xc.e eVar, e0 e0Var, e0 e0Var2, List<j1> list, List<f1> list2) {
            if (rVar == null) {
                c(0);
            }
            if (eVar == null) {
                c(1);
            }
            if (e0Var == null) {
                c(2);
            }
            if (list == null) {
                c(3);
            }
            if (list2 == null) {
                c(4);
            }
            return new b(e0Var, e0Var2, list, list2, Collections.emptyList(), false);
        }

        @Override // hd.j
        public void b(xc.b bVar, List<String> list) {
            if (bVar == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final e0 f11820a;

        /* renamed from: b */
        private final e0 f11821b;

        /* renamed from: c */
        private final List<j1> f11822c;

        /* renamed from: d */
        private final List<f1> f11823d;

        /* renamed from: e */
        private final List<String> f11824e;

        /* renamed from: f */
        private final boolean f11825f;

        public b(e0 e0Var, e0 e0Var2, List<j1> list, List<f1> list2, List<String> list3, boolean z10) {
            if (e0Var == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
            if (list2 == null) {
                a(2);
            }
            if (list3 == null) {
                a(3);
            }
            this.f11820a = e0Var;
            this.f11821b = e0Var2;
            this.f11822c = list;
            this.f11823d = list2;
            this.f11824e = list3;
            this.f11825f = z10;
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
            switch (i10) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i10 == 4) {
                objArr[1] = "getReturnType";
            } else if (i10 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i10 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i10 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) {
                throw new IllegalStateException(format);
            }
        }

        public List<String> b() {
            List<String> list = this.f11824e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        public e0 c() {
            return this.f11821b;
        }

        public e0 d() {
            e0 e0Var = this.f11820a;
            if (e0Var == null) {
                a(4);
            }
            return e0Var;
        }

        public List<f1> e() {
            List<f1> list = this.f11823d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        public List<j1> f() {
            List<j1> list = this.f11822c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean g() {
            return this.f11825f;
        }
    }

    b a(r rVar, xc.e eVar, e0 e0Var, e0 e0Var2, List<j1> list, List<f1> list2);

    void b(xc.b bVar, List<String> list);
}
