package oc;

import bf.x;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.c0;
import ub.v;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003\u001a\"\u0010\n\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0003\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002\"\u001e\u0010\u0012\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0012\u001a\u00020\u0003*\u00020\b8BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Loc/n;", BuildConfig.FLAVOR, "forceWrapper", "Ljava/lang/reflect/Type;", "c", "Ljava/lang/Class;", "jClass", BuildConfig.FLAVOR, "Loc/p;", "arguments", "e", "type", BuildConfig.FLAVOR, "h", "f", "(Loc/n;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(Loc/n;)V", "javaType", "g", "(Loc/p;)Ljava/lang/reflect/Type;", "(Loc/p;)V", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class t {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17813a;

        static {
            int[] iArr = new int[q.values().length];
            iArr[q.IN.ordinal()] = 1;
            iArr[q.INVARIANT.ordinal()] = 2;
            iArr[q.OUT.ordinal()] = 3;
            f17813a = iArr;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class b extends hc.q implements gc.l<Class<?>, Class<?>> {
        public static final b Y3 = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        /* renamed from: i0 */
        public final Class<?> invoke(Class<?> cls) {
            hc.t.e(cls, "p0");
            return cls.getComponentType();
        }
    }

    public static final Type c(n nVar, boolean z10) {
        Object u02;
        e f10 = nVar.f();
        if (f10 instanceof o) {
            return new s((o) f10);
        }
        if (!(f10 instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + nVar);
        }
        d dVar = (d) f10;
        Class c10 = z10 ? fc.a.c(dVar) : fc.a.b(dVar);
        List<p> c11 = nVar.c();
        if (c11.isEmpty()) {
            return c10;
        }
        if (!c10.isArray()) {
            return e(c10, c11);
        }
        if (c10.getComponentType().isPrimitive()) {
            return c10;
        }
        u02 = c0.u0(c11);
        p pVar = (p) u02;
        if (pVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + nVar);
        }
        q a10 = pVar.a();
        n b10 = pVar.b();
        int i10 = a10 == null ? -1 : a.f17813a[a10.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return c10;
        }
        if (i10 != 2 && i10 != 3) {
            throw new tb.p();
        }
        hc.t.b(b10);
        Type d10 = d(b10, false, 1, null);
        return d10 instanceof Class ? c10 : new oc.a(d10);
    }

    static /* synthetic */ Type d(n nVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(nVar, z10);
    }

    private static final Type e(Class<?> cls, List<p> list) {
        int s10;
        int s11;
        int s12;
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            s12 = v.s(list, 10);
            ArrayList arrayList = new ArrayList(s12);
            for (p pVar : list) {
                arrayList.add(g(pVar));
            }
            return new r(cls, null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            s11 = v.s(list, 10);
            ArrayList arrayList2 = new ArrayList(s11);
            for (p pVar2 : list) {
                arrayList2.add(g(pVar2));
            }
            return new r(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type e10 = e(declaringClass, list.subList(length, list.size()));
            List<p> subList = list.subList(0, length);
            s10 = v.s(subList, 10);
            ArrayList arrayList3 = new ArrayList(s10);
            for (p pVar3 : subList) {
                arrayList3.add(g(pVar3));
            }
            return new r(cls, e10, arrayList3);
        }
    }

    public static final Type f(n nVar) {
        Type W;
        hc.t.e(nVar, "<this>");
        return (!(nVar instanceof hc.u) || (W = ((hc.u) nVar).W()) == null) ? d(nVar, false, 1, null) : W;
    }

    private static final Type g(p pVar) {
        q d10 = pVar.d();
        if (d10 == null) {
            return u.Companion.a();
        }
        n c10 = pVar.c();
        hc.t.b(c10);
        int i10 = a.f17813a[d10.ordinal()];
        if (i10 == 1) {
            return new u(null, c(c10, true));
        }
        if (i10 == 2) {
            return c(c10, true);
        }
        if (i10 != 3) {
            throw new tb.p();
        }
        return new u(c(c10, true), null);
    }

    public static final String h(Type type) {
        String str;
        af.h k10;
        Object y10;
        int o10;
        String A;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                k10 = af.n.k(type, b.Y3);
                StringBuilder sb2 = new StringBuilder();
                y10 = af.p.y(k10);
                sb2.append(((Class) y10).getName());
                o10 = af.p.o(k10);
                A = x.A("[]", o10);
                sb2.append(A);
                str = sb2.toString();
            } else {
                str = cls.getName();
            }
            hc.t.d(str, "{\n        if (type.isArr…   } else type.name\n    }");
            return str;
        }
        return type.toString();
    }
}
