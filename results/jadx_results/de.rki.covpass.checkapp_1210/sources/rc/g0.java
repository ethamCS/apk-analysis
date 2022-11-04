package rc;

import java.lang.reflect.Method;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import rc.d;
import rc.e;
import uc.k;
import ud.a;
import vd.d;
import xc.a1;
import xc.u0;
import xc.v0;
import xc.w0;
import yd.i;
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u0012\u0010\u0015\u001a\u00020\u00142\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0016*\u0006\u0012\u0002\b\u00030\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lrc/g0;", BuildConfig.FLAVOR, "Lxc/y;", "descriptor", BuildConfig.FLAVOR, "b", "Lrc/d$e;", "d", "Lxc/b;", BuildConfig.FLAVOR, "e", "possiblySubstitutedFunction", "Lrc/d;", "g", "Lxc/u0;", "possiblyOverriddenProperty", "Lrc/e;", "f", "Ljava/lang/Class;", "klass", "Lwd/b;", "c", "Luc/i;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a */
    public static final g0 f20633a = new g0();

    /* renamed from: b */
    private static final wd.b f20634b;

    static {
        wd.b m10 = wd.b.m(new wd.c("java.lang.Void"));
        hc.t.d(m10, "topLevel(FqName(\"java.lang.Void\"))");
        f20634b = m10;
    }

    private g0() {
    }

    private final uc.i a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return fe.e.g(cls.getSimpleName()).r();
        }
        return null;
    }

    private final boolean b(xc.y yVar) {
        if (ae.c.o(yVar) || ae.c.p(yVar)) {
            return true;
        }
        return hc.t.a(yVar.getName(), wc.a.Companion.a()) && yVar.o().isEmpty();
    }

    private final d.e d(xc.y yVar) {
        return new d.e(new d.b(e(yVar), pd.v.c(yVar, false, false, 1, null)));
    }

    private final String e(xc.b bVar) {
        String b10 = gd.g0.b(bVar);
        if (b10 == null) {
            if (bVar instanceof v0) {
                String b11 = ee.a.o(bVar).getName().b();
                hc.t.d(b11, "descriptor.propertyIfAccessor.name.asString()");
                return gd.z.b(b11);
            } else if (bVar instanceof w0) {
                String b12 = ee.a.o(bVar).getName().b();
                hc.t.d(b12, "descriptor.propertyIfAccessor.name.asString()");
                return gd.z.e(b12);
            } else {
                String b13 = bVar.getName().b();
                hc.t.d(b13, "descriptor.name.asString()");
                return b13;
            }
        }
        return b10;
    }

    public final wd.b c(Class<?> cls) {
        hc.t.e(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            hc.t.d(componentType, "klass.componentType");
            uc.i a10 = a(componentType);
            if (a10 != null) {
                return new wd.b(uc.k.f23458r, a10.h());
            }
            wd.b m10 = wd.b.m(k.a.f23481i.l());
            hc.t.d(m10, "topLevel(StandardNames.FqNames.array.toSafe())");
            return m10;
        } else if (hc.t.a(cls, Void.TYPE)) {
            return f20634b;
        } else {
            uc.i a11 = a(cls);
            if (a11 != null) {
                return new wd.b(uc.k.f23458r, a11.p());
            }
            wd.b a12 = dd.d.a(cls);
            if (!a12.k()) {
                wc.c cVar = wc.c.f24707a;
                wd.c b10 = a12.b();
                hc.t.d(b10, "classId.asSingleFqName()");
                wd.b m11 = cVar.m(b10);
                if (m11 != null) {
                    return m11;
                }
            }
            return a12;
        }
    }

    public final e f(u0 u0Var) {
        hc.t.e(u0Var, "possiblyOverriddenProperty");
        u0 a10 = ((u0) ae.d.L(u0Var)).a();
        hc.t.d(a10, "unwrapFakeOverride(possi…rriddenProperty).original");
        d.e eVar = null;
        Method method = null;
        if (a10 instanceof me.j) {
            me.j jVar = (me.j) a10;
            rd.n X = jVar.X();
            i.f<rd.n, a.d> fVar = ud.a.f23538d;
            hc.t.d(fVar, "propertySignature");
            a.d dVar = (a.d) td.e.a(X, fVar);
            if (dVar != null) {
                return new e.c(a10, X, dVar, jVar.Q0(), jVar.D0());
            }
        } else if (a10 instanceof id.f) {
            a1 m10 = ((id.f) a10).m();
            md.a aVar = m10 instanceof md.a ? (md.a) m10 : null;
            nd.l b10 = aVar != null ? aVar.b() : null;
            if (b10 instanceof dd.r) {
                return new e.a(((dd.r) b10).a0());
            }
            if (!(b10 instanceof dd.u)) {
                throw new b0("Incorrect resolution sequence for Java field " + a10 + " (source = " + b10 + ')');
            }
            Method a02 = ((dd.u) b10).a0();
            w0 n10 = a10.n();
            a1 m11 = n10 != null ? n10.m() : null;
            md.a aVar2 = m11 instanceof md.a ? (md.a) m11 : null;
            nd.l b11 = aVar2 != null ? aVar2.b() : null;
            dd.u uVar = b11 instanceof dd.u ? (dd.u) b11 : null;
            if (uVar != null) {
                method = uVar.a0();
            }
            return new e.b(a02, method);
        }
        v0 i10 = a10.i();
        hc.t.b(i10);
        d.e d10 = d(i10);
        w0 n11 = a10.n();
        if (n11 != null) {
            eVar = d(n11);
        }
        return new e.d(d10, eVar);
    }

    public final d g(xc.y yVar) {
        Method a02;
        d.b b10;
        d.b e10;
        hc.t.e(yVar, "possiblySubstitutedFunction");
        xc.y a10 = ((xc.y) ae.d.L(yVar)).a();
        hc.t.d(a10, "unwrapFakeOverride(possi…titutedFunction).original");
        if (a10 instanceof me.b) {
            me.b bVar = (me.b) a10;
            yd.q X = bVar.X();
            if ((X instanceof rd.i) && (e10 = vd.i.f24018a.e((rd.i) X, bVar.Q0(), bVar.D0())) != null) {
                return new d.e(e10);
            }
            if (!(X instanceof rd.d) || (b10 = vd.i.f24018a.b((rd.d) X, bVar.Q0(), bVar.D0())) == null) {
                return d(a10);
            }
            xc.m b11 = yVar.b();
            hc.t.d(b11, "possiblySubstitutedFunction.containingDeclaration");
            return ae.f.b(b11) ? new d.e(b10) : new d.C0332d(b10);
        }
        nd.l lVar = null;
        dd.u uVar = null;
        if (a10 instanceof id.e) {
            a1 m10 = ((id.e) a10).m();
            md.a aVar = m10 instanceof md.a ? (md.a) m10 : null;
            nd.l b12 = aVar != null ? aVar.b() : null;
            if (b12 instanceof dd.u) {
                uVar = (dd.u) b12;
            }
            if (uVar != null && (a02 = uVar.a0()) != null) {
                return new d.c(a02);
            }
            throw new b0("Incorrect resolution sequence for Java method " + a10);
        } else if (!(a10 instanceof id.b)) {
            if (b(a10)) {
                return d(a10);
            }
            throw new b0("Unknown origin of " + a10 + " (" + a10.getClass() + ')');
        } else {
            a1 m11 = ((id.b) a10).m();
            md.a aVar2 = m11 instanceof md.a ? (md.a) m11 : null;
            if (aVar2 != null) {
                lVar = aVar2.b();
            }
            if (lVar instanceof dd.o) {
                return new d.b(((dd.o) lVar).a0());
            }
            if (lVar instanceof dd.l) {
                dd.l lVar2 = (dd.l) lVar;
                if (lVar2.E()) {
                    return new d.a(lVar2.U());
                }
            }
            throw new b0("Incorrect resolution sequence for Java constructor " + a10 + " (" + lVar + ')');
        }
    }
}
