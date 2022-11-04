package ke;

import ce.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import oe.m0;
import rd.b;
import ub.p0;
import ub.q0;
import xc.a1;
import xc.h0;
import xc.j1;
import xc.k0;
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a */
    private final h0 f15044a;

    /* renamed from: b */
    private final k0 f15045b;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15046a;

        static {
            int[] iArr = new int[b.C0339b.c.EnumC0342c.values().length];
            iArr[b.C0339b.c.EnumC0342c.BYTE.ordinal()] = 1;
            iArr[b.C0339b.c.EnumC0342c.CHAR.ordinal()] = 2;
            iArr[b.C0339b.c.EnumC0342c.SHORT.ordinal()] = 3;
            iArr[b.C0339b.c.EnumC0342c.INT.ordinal()] = 4;
            iArr[b.C0339b.c.EnumC0342c.LONG.ordinal()] = 5;
            iArr[b.C0339b.c.EnumC0342c.FLOAT.ordinal()] = 6;
            iArr[b.C0339b.c.EnumC0342c.DOUBLE.ordinal()] = 7;
            iArr[b.C0339b.c.EnumC0342c.BOOLEAN.ordinal()] = 8;
            iArr[b.C0339b.c.EnumC0342c.STRING.ordinal()] = 9;
            iArr[b.C0339b.c.EnumC0342c.CLASS.ordinal()] = 10;
            iArr[b.C0339b.c.EnumC0342c.ENUM.ordinal()] = 11;
            iArr[b.C0339b.c.EnumC0342c.ANNOTATION.ordinal()] = 12;
            iArr[b.C0339b.c.EnumC0342c.ARRAY.ordinal()] = 13;
            f15046a = iArr;
        }
    }

    public e(h0 h0Var, k0 k0Var) {
        hc.t.e(h0Var, "module");
        hc.t.e(k0Var, "notFoundClasses");
        this.f15044a = h0Var;
        this.f15045b = k0Var;
    }

    private final boolean b(ce.g<?> gVar, oe.e0 e0Var, b.C0339b.c cVar) {
        nc.g i10;
        b.C0339b.c.EnumC0342c u02 = cVar.u0();
        int i11 = u02 == null ? -1 : a.f15046a[u02.ordinal()];
        if (i11 == 10) {
            xc.h z10 = e0Var.W0().z();
            xc.e eVar = z10 instanceof xc.e ? (xc.e) z10 : null;
            if (eVar != null && !uc.h.k0(eVar)) {
                return false;
            }
        } else if (i11 != 13) {
            return hc.t.a(gVar.a(this.f15044a), e0Var);
        } else {
            if (!((gVar instanceof ce.b) && ((ce.b) gVar).b().size() == cVar.l0().size())) {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
            }
            oe.e0 k10 = c().k(e0Var);
            hc.t.d(k10, "builtIns.getArrayElementType(expectedType)");
            ce.b bVar = (ce.b) gVar;
            i10 = ub.u.i(bVar.b());
            if (!(i10 instanceof Collection) || !((Collection) i10).isEmpty()) {
                Iterator<Integer> it = i10.iterator();
                while (it.hasNext()) {
                    int b10 = ((ub.k0) it).b();
                    b.C0339b.c j02 = cVar.j0(b10);
                    hc.t.d(j02, "value.getArrayElement(i)");
                    if (!b(bVar.b().get(b10), k10, j02)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private final uc.h c() {
        return this.f15044a.x();
    }

    private final tb.r<wd.f, ce.g<?>> d(b.C0339b c0339b, Map<wd.f, ? extends j1> map, td.c cVar) {
        j1 j1Var = map.get(x.b(cVar, c0339b.N()));
        if (j1Var == null) {
            return null;
        }
        wd.f b10 = x.b(cVar, c0339b.N());
        oe.e0 type = j1Var.getType();
        hc.t.d(type, "parameter.type");
        b.C0339b.c V = c0339b.V();
        hc.t.d(V, "proto.value");
        return new tb.r<>(b10, g(type, V, cVar));
    }

    private final xc.e e(wd.b bVar) {
        return xc.x.c(this.f15044a, bVar, this.f15045b);
    }

    private final ce.g<?> g(oe.e0 e0Var, b.C0339b.c cVar, td.c cVar2) {
        ce.g<?> f10 = f(e0Var, cVar, cVar2);
        if (!b(f10, e0Var, cVar)) {
            f10 = null;
        }
        if (f10 == null) {
            k.a aVar = ce.k.Companion;
            return aVar.a("Unexpected argument value: actual type " + cVar.u0() + " != expected type " + e0Var);
        }
        return f10;
    }

    public final yc.c a(rd.b bVar, td.c cVar) {
        Map h10;
        Object t02;
        int s10;
        int d10;
        int b10;
        hc.t.e(bVar, "proto");
        hc.t.e(cVar, "nameResolver");
        xc.e e10 = e(x.a(cVar, bVar.c0()));
        h10 = q0.h();
        if (bVar.V() != 0 && !qe.k.m(e10) && ae.d.t(e10)) {
            Collection<xc.d> k10 = e10.k();
            hc.t.d(k10, "annotationClass.constructors");
            t02 = ub.c0.t0(k10);
            xc.d dVar = (xc.d) t02;
            if (dVar != null) {
                List<j1> o10 = dVar.o();
                hc.t.d(o10, "constructor.valueParameters");
                s10 = ub.v.s(o10, 10);
                d10 = p0.d(s10);
                b10 = nc.m.b(d10, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
                for (Object obj : o10) {
                    linkedHashMap.put(((j1) obj).getName(), obj);
                }
                List<b.C0339b> W = bVar.W();
                hc.t.d(W, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (b.C0339b c0339b : W) {
                    hc.t.d(c0339b, "it");
                    tb.r<wd.f, ce.g<?>> d11 = d(c0339b, linkedHashMap, cVar);
                    if (d11 != null) {
                        arrayList.add(d11);
                    }
                }
                h10 = q0.q(arrayList);
            }
        }
        return new yc.d(e10.u(), h10, a1.f25519a);
    }

    public final ce.g<?> f(oe.e0 e0Var, b.C0339b.c cVar, td.c cVar2) {
        ce.g<?> gVar;
        int s10;
        hc.t.e(e0Var, "expectedType");
        hc.t.e(cVar, "value");
        hc.t.e(cVar2, "nameResolver");
        Boolean d10 = td.b.O.d(cVar.q0());
        hc.t.d(d10, "IS_UNSIGNED.get(value.flags)");
        boolean booleanValue = d10.booleanValue();
        b.C0339b.c.EnumC0342c u02 = cVar.u0();
        switch (u02 == null ? -1 : a.f15046a[u02.ordinal()]) {
            case 1:
                byte s02 = (byte) cVar.s0();
                return booleanValue ? new ce.w(s02) : new ce.d(s02);
            case 2:
                gVar = new ce.e((char) cVar.s0());
                break;
            case 3:
                short s03 = (short) cVar.s0();
                return booleanValue ? new ce.z(s03) : new ce.u(s03);
            case 4:
                int s04 = (int) cVar.s0();
                return booleanValue ? new ce.x(s04) : new ce.m(s04);
            case 5:
                long s05 = cVar.s0();
                return booleanValue ? new ce.y(s05) : new ce.r(s05);
            case 6:
                gVar = new ce.l(cVar.r0());
                break;
            case 7:
                gVar = new ce.i(cVar.o0());
                break;
            case 8:
                gVar = new ce.c(cVar.s0() != 0);
                break;
            case 9:
                gVar = new ce.v(cVar2.getString(cVar.t0()));
                break;
            case 10:
                gVar = new ce.q(x.a(cVar2, cVar.m0()), cVar.i0());
                break;
            case 11:
                gVar = new ce.j(x.a(cVar2, cVar.m0()), x.b(cVar2, cVar.p0()));
                break;
            case 12:
                rd.b h02 = cVar.h0();
                hc.t.d(h02, "value.annotation");
                gVar = new ce.a(a(h02, cVar2));
                break;
            case 13:
                List<b.C0339b.c> l02 = cVar.l0();
                hc.t.d(l02, "value.arrayElementList");
                s10 = ub.v.s(l02, 10);
                ArrayList arrayList = new ArrayList(s10);
                for (b.C0339b.c cVar3 : l02) {
                    m0 i10 = c().i();
                    hc.t.d(i10, "builtIns.anyType");
                    hc.t.d(cVar3, "it");
                    arrayList.add(f(i10, cVar3, cVar2));
                }
                return new n(arrayList, e0Var);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + cVar.u0() + " (expected " + e0Var + ')').toString());
        }
        return gVar;
    }
}
