package sc;

import hc.t;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import oe.e0;
import oe.n1;
import org.conscrypt.BuildConfig;
import rc.b0;
import rc.j0;
import xc.j1;
import xc.k1;
import xc.l;
import xc.m;
import xc.u0;
import xc.x0;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a6\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\b\u001a\u00020\u0005*\u00020\u0003H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\f\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0012\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t*\u00020\rH\u0000\u001a\u0014\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t*\u0004\u0018\u00010\u000fH\u0000\u001a\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\"\u001a\u0010\u0015\u001a\u0004\u0018\u00010\r*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Ljava/lang/reflect/Member;", "M", "Lsc/d;", "Lxc/b;", "descriptor", BuildConfig.FLAVOR, "isDefault", "b", "g", "Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "f", "d", "Loe/e0;", "h", "Lxc/m;", "i", BuildConfig.FLAVOR, "a", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class h {
    public static final Object a(Object obj, xc.b bVar) {
        e0 e10;
        Class<?> h10;
        Method f10;
        t.e(bVar, "descriptor");
        return (((bVar instanceof u0) && ae.f.d((k1) bVar)) || (e10 = e(bVar)) == null || (h10 = h(e10)) == null || (f10 = f(h10, bVar)) == null) ? obj : f10.invoke(obj, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends Member> d<M> b(d<? extends M> dVar, xc.b bVar, boolean z10) {
        boolean z11;
        t.e(dVar, "<this>");
        t.e(bVar, "descriptor");
        boolean z12 = true;
        if (!ae.f.a(bVar)) {
            List<j1> o10 = bVar.o();
            t.d(o10, "descriptor.valueParameters");
            if (!(o10 instanceof Collection) || !o10.isEmpty()) {
                for (j1 j1Var : o10) {
                    e0 type = j1Var.getType();
                    t.d(type, "it.type");
                    if (ae.f.c(type)) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            if (!z11) {
                e0 e10 = bVar.e();
                if (!(e10 != null && ae.f.c(e10)) && ((dVar instanceof c) || !g(bVar))) {
                    z12 = false;
                }
            }
        }
        return z12 ? new g(bVar, dVar, z10) : dVar;
    }

    public static /* synthetic */ d c(d dVar, xc.b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return b(dVar, bVar, z10);
    }

    public static final Method d(Class<?> cls, xc.b bVar) {
        t.e(cls, "<this>");
        t.e(bVar, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", f(cls, bVar).getReturnType());
            t.d(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new b0("No box method found in inline class: " + cls + " (calling " + bVar + ')');
        }
    }

    private static final e0 e(xc.b bVar) {
        x0 U = bVar.U();
        x0 J = bVar.J();
        if (U != null) {
            return U.getType();
        }
        if (J == null) {
            return null;
        }
        if (bVar instanceof l) {
            return J.getType();
        }
        m b10 = bVar.b();
        xc.e eVar = b10 instanceof xc.e ? (xc.e) b10 : null;
        if (eVar == null) {
            return null;
        }
        return eVar.u();
    }

    public static final Method f(Class<?> cls, xc.b bVar) {
        t.e(cls, "<this>");
        t.e(bVar, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            t.d(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new b0("No unbox method found in inline class: " + cls + " (calling " + bVar + ')');
        }
    }

    private static final boolean g(xc.b bVar) {
        e0 e10 = e(bVar);
        return e10 != null && ae.f.c(e10);
    }

    public static final Class<?> h(e0 e0Var) {
        t.e(e0Var, "<this>");
        Class<?> i10 = i(e0Var.W0().z());
        if (i10 == null) {
            return null;
        }
        if (!n1.l(e0Var)) {
            return i10;
        }
        e0 e10 = ae.f.e(e0Var);
        if (e10 == null || n1.l(e10) || uc.h.r0(e10)) {
            return null;
        }
        return i10;
    }

    public static final Class<?> i(m mVar) {
        if (!(mVar instanceof xc.e) || !ae.f.b(mVar)) {
            return null;
        }
        xc.e eVar = (xc.e) mVar;
        Class<?> p10 = j0.p(eVar);
        if (p10 != null) {
            return p10;
        }
        throw new b0("Class object for the class " + eVar.getName() + " cannot be found (classId=" + ee.a.g((xc.h) mVar) + ')');
    }
}
