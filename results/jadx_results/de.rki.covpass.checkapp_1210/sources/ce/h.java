package ce;

import java.util.ArrayList;
import java.util.List;
import oe.e0;
import oe.m0;
import ub.c0;
import xc.h0;
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a */
    public static final h f6450a = new h();

    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.l<h0, e0> {

        /* renamed from: c */
        final /* synthetic */ e0 f6451c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e0 e0Var) {
            super(1);
            this.f6451c = e0Var;
        }

        /* renamed from: b */
        public final e0 invoke(h0 h0Var) {
            hc.t.e(h0Var, "it");
            return this.f6451c;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends hc.v implements gc.l<h0, e0> {

        /* renamed from: c */
        final /* synthetic */ uc.i f6452c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(uc.i iVar) {
            super(1);
            this.f6452c = iVar;
        }

        /* renamed from: b */
        public final e0 invoke(h0 h0Var) {
            hc.t.e(h0Var, "module");
            m0 O = h0Var.x().O(this.f6452c);
            hc.t.d(O, "module.builtIns.getPrimi…KotlinType(componentType)");
            return O;
        }
    }

    private h() {
    }

    private final ce.b b(List<?> list, uc.i iVar) {
        List<Object> F0;
        F0 = c0.F0(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : F0) {
            g<?> c10 = c(obj);
            if (c10 != null) {
                arrayList.add(c10);
            }
        }
        return new ce.b(arrayList, new b(iVar));
    }

    public final ce.b a(List<? extends g<?>> list, e0 e0Var) {
        hc.t.e(list, "value");
        hc.t.e(e0Var, "type");
        return new ce.b(list, new a(e0Var));
    }

    public final g<?> c(Object obj) {
        List<?> k02;
        uc.i iVar;
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new u(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new m(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new r(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new l(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new i(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new v((String) obj);
        }
        if (obj instanceof byte[]) {
            k02 = ub.m.c0((byte[]) obj);
            iVar = uc.i.BYTE;
        } else if (obj instanceof short[]) {
            k02 = ub.m.j0((short[]) obj);
            iVar = uc.i.SHORT;
        } else if (obj instanceof int[]) {
            k02 = ub.m.g0((int[]) obj);
            iVar = uc.i.INT;
        } else if (obj instanceof long[]) {
            k02 = ub.m.h0((long[]) obj);
            iVar = uc.i.LONG;
        } else if (obj instanceof char[]) {
            k02 = ub.m.d0((char[]) obj);
            iVar = uc.i.CHAR;
        } else if (obj instanceof float[]) {
            k02 = ub.m.f0((float[]) obj);
            iVar = uc.i.FLOAT;
        } else if (obj instanceof double[]) {
            k02 = ub.m.e0((double[]) obj);
            iVar = uc.i.DOUBLE;
        } else if (!(obj instanceof boolean[])) {
            if (obj != null) {
                return null;
            }
            return new s();
        } else {
            k02 = ub.m.k0((boolean[]) obj);
            iVar = uc.i.BOOLEAN;
        }
        return b(k02, iVar);
    }
}
