package pd;

import oe.d0;
import oe.e0;
import oe.e1;
import oe.g1;
import oe.n1;
import oe.r1;
import xc.f1;
import xc.l0;
import xc.v0;
/* loaded from: classes.dex */
public final class d {
    public static final String a(xc.e eVar, y<?> yVar) {
        String D;
        hc.t.e(eVar, "klass");
        hc.t.e(yVar, "typeMappingConfiguration");
        String a10 = yVar.a(eVar);
        if (a10 != null) {
            return a10;
        }
        xc.m b10 = eVar.b();
        hc.t.d(b10, "klass.containingDeclaration");
        String g10 = wd.h.b(eVar.getName()).g();
        hc.t.d(g10, "safeIdentifier(klass.name).identifier");
        if (b10 instanceof l0) {
            wd.c d10 = ((l0) b10).d();
            if (d10.d()) {
                return g10;
            }
            StringBuilder sb2 = new StringBuilder();
            String b11 = d10.b();
            hc.t.d(b11, "fqName.asString()");
            D = bf.x.D(b11, '.', '/', false, 4, null);
            sb2.append(D);
            sb2.append('/');
            sb2.append(g10);
            return sb2.toString();
        }
        xc.e eVar2 = b10 instanceof xc.e ? (xc.e) b10 : null;
        if (eVar2 == null) {
            throw new IllegalArgumentException("Unexpected container: " + b10 + " for " + eVar);
        }
        String f10 = yVar.f(eVar2);
        if (f10 == null) {
            f10 = a(eVar2, yVar);
        }
        return f10 + '$' + g10;
    }

    public static /* synthetic */ String b(xc.e eVar, y yVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            yVar = z.f19143a;
        }
        return a(eVar, yVar);
    }

    public static final boolean c(xc.a aVar) {
        hc.t.e(aVar, "descriptor");
        if (aVar instanceof xc.l) {
            return true;
        }
        e0 e10 = aVar.e();
        hc.t.b(e10);
        if (uc.h.B0(e10)) {
            e0 e11 = aVar.e();
            hc.t.b(e11);
            if (!n1.l(e11) && !(aVar instanceof v0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v9, types: [T, java.lang.Object] */
    public static final <T> T d(e0 e0Var, m<T> mVar, a0 a0Var, y<? extends T> yVar, j<T> jVar, gc.q<? super e0, ? super T, ? super a0, tb.e0> qVar) {
        Object obj;
        e0 e0Var2;
        Object obj2;
        hc.t.e(e0Var, "kotlinType");
        hc.t.e(mVar, "factory");
        hc.t.e(a0Var, "mode");
        hc.t.e(yVar, "typeMappingConfiguration");
        hc.t.e(qVar, "writeGenericType");
        e0 c10 = yVar.c(e0Var);
        if (c10 != null) {
            return (T) d(c10, mVar, a0Var, yVar, jVar, qVar);
        }
        if (uc.g.q(e0Var)) {
            return (T) d(uc.l.a(e0Var), mVar, a0Var, yVar, jVar, qVar);
        }
        pe.q qVar2 = pe.q.f19172a;
        Object b10 = b0.b(qVar2, e0Var, mVar, a0Var);
        if (b10 != null) {
            ?? r92 = (Object) b0.a(mVar, b10, a0Var.d());
            qVar.s(e0Var, r92, a0Var);
            return r92;
        }
        e1 W0 = e0Var.W0();
        if (W0 instanceof d0) {
            d0 d0Var = (d0) W0;
            e0 f10 = d0Var.f();
            if (f10 == null) {
                f10 = yVar.d(d0Var.l());
            }
            return (T) d(te.a.w(f10), mVar, a0Var, yVar, jVar, qVar);
        }
        xc.h z10 = W0.z();
        if (z10 == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + e0Var);
        } else if (qe.k.m(z10)) {
            T t10 = (T) mVar.b("error/NonExistentClass");
            yVar.b(e0Var, (xc.e) z10);
            return t10;
        } else {
            boolean z11 = z10 instanceof xc.e;
            if (z11 && uc.h.c0(e0Var)) {
                if (e0Var.U0().size() != 1) {
                    throw new UnsupportedOperationException("arrays must have one type argument");
                }
                g1 g1Var = e0Var.U0().get(0);
                e0 type = g1Var.getType();
                hc.t.d(type, "memberProjection.type");
                if (g1Var.b() == r1.IN_VARIANCE) {
                    obj2 = mVar.b("java/lang/Object");
                } else {
                    r1 b11 = g1Var.b();
                    hc.t.d(b11, "memberProjection.projectionKind");
                    obj2 = d(type, mVar, a0Var.f(b11, true), yVar, jVar, qVar);
                }
                return (T) mVar.a('[' + mVar.c(obj2));
            } else if (!z11) {
                if (z10 instanceof f1) {
                    e0 i10 = te.a.i((f1) z10);
                    if (e0Var.X0()) {
                        i10 = te.a.t(i10);
                    }
                    return (T) d(i10, mVar, a0Var, yVar, null, ye.d.b());
                } else if ((z10 instanceof xc.e1) && a0Var.b()) {
                    return (T) d(((xc.e1) z10).H0(), mVar, a0Var, yVar, jVar, qVar);
                } else {
                    throw new UnsupportedOperationException("Unknown type " + e0Var);
                }
            } else if (ae.f.b(z10) && !a0Var.c() && (e0Var2 = (e0) oe.x.a(qVar2, e0Var)) != null) {
                return (T) d(e0Var2, mVar, a0Var.g(), yVar, jVar, qVar);
            } else {
                if (!a0Var.e() || !uc.h.k0((xc.e) z10)) {
                    xc.e eVar = (xc.e) z10;
                    xc.e a10 = eVar.a();
                    hc.t.d(a10, "descriptor.original");
                    T e10 = yVar.e(a10);
                    if (e10 == null) {
                        if (eVar.h() == xc.f.ENUM_ENTRY) {
                            xc.m b12 = eVar.b();
                            hc.t.c(b12, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            eVar = (xc.e) b12;
                        }
                        xc.e a11 = eVar.a();
                        hc.t.d(a11, "enumClassIfEnumEntry.original");
                        obj = (Object) mVar.b(a(a11, yVar));
                    } else {
                        obj = (Object) e10;
                    }
                } else {
                    obj = (Object) mVar.e();
                }
                qVar.s(e0Var, obj, a0Var);
                return (T) obj;
            }
        }
    }

    public static /* synthetic */ Object e(e0 e0Var, m mVar, a0 a0Var, y yVar, j jVar, gc.q qVar, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            qVar = ye.d.b();
        }
        return d(e0Var, mVar, a0Var, yVar, jVar, qVar);
    }
}
