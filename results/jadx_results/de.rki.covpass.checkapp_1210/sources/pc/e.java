package pc;

import hc.t;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import oc.n;
import oc.p;
import oc.q;
import oe.a1;
import oe.e0;
import oe.e1;
import oe.f0;
import oe.i1;
import oe.m0;
import oe.r1;
import oe.s0;
import org.conscrypt.BuildConfig;
import rc.b0;
import rc.i;
import rc.y;
import ub.u;
import ub.v;
import xc.f1;
import xc.h;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\t\u001a\u00020\b*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0007\u001a.\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u0010"}, d2 = {"Loc/e;", BuildConfig.FLAVOR, "Loc/p;", "arguments", BuildConfig.FLAVOR, "nullable", BuildConfig.FLAVOR, "annotations", "Loc/n;", "b", "Loe/a1;", "attributes", "Loe/e1;", "typeConstructor", "Loe/m0;", "a", "kotlin-reflection"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class e {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19030a;

        static {
            int[] iArr = new int[q.values().length];
            iArr[q.INVARIANT.ordinal()] = 1;
            iArr[q.IN.ordinal()] = 2;
            iArr[q.OUT.ordinal()] = 3;
            f19030a = iArr;
        }
    }

    private static final m0 a(a1 a1Var, e1 e1Var, List<p> list, boolean z10) {
        int s10;
        Object obj;
        List<f1> parameters = e1Var.getParameters();
        t.d(parameters, "typeConstructor.parameters");
        s10 = v.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        int i10 = 0;
        for (Object obj2 : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                u.r();
            }
            p pVar = (p) obj2;
            y yVar = (y) pVar.c();
            e0 l10 = yVar != null ? yVar.l() : null;
            q d10 = pVar.d();
            int i12 = d10 == null ? -1 : a.f19030a[d10.ordinal()];
            if (i12 == -1) {
                f1 f1Var = parameters.get(i10);
                t.d(f1Var, "parameters[index]");
                obj = new s0(f1Var);
            } else if (i12 == 1) {
                r1 r1Var = r1.INVARIANT;
                t.b(l10);
                obj = new i1(r1Var, l10);
            } else if (i12 == 2) {
                r1 r1Var2 = r1.IN_VARIANCE;
                t.b(l10);
                obj = new i1(r1Var2, l10);
            } else if (i12 != 3) {
                throw new tb.p();
            } else {
                r1 r1Var3 = r1.OUT_VARIANCE;
                t.b(l10);
                obj = new i1(r1Var3, l10);
            }
            arrayList.add(obj);
            i10 = i11;
        }
        return f0.i(a1Var, e1Var, arrayList, z10, null, 16, null);
    }

    public static final n b(oc.e eVar, List<p> list, boolean z10, List<? extends Annotation> list2) {
        h descriptor;
        t.e(eVar, "<this>");
        t.e(list, "arguments");
        t.e(list2, "annotations");
        i iVar = eVar instanceof i ? (i) eVar : null;
        if (iVar == null || (descriptor = iVar.getDescriptor()) == null) {
            throw new b0("Cannot create type for an unsupported classifier: " + eVar + " (" + eVar.getClass() + ')');
        }
        e1 r10 = descriptor.r();
        t.d(r10, "descriptor.typeConstructor");
        List<f1> parameters = r10.getParameters();
        t.d(parameters, "typeConstructor.parameters");
        if (parameters.size() == list.size()) {
            list2.isEmpty();
            return new y(a(a1.Companion.h(), r10, list, z10), null, 2, null);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + list.size() + " were provided.");
    }

    public static /* synthetic */ n c(oc.e eVar, List list, boolean z10, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = u.h();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            list2 = u.h();
        }
        return b(eVar, list, z10, list2);
    }
}
