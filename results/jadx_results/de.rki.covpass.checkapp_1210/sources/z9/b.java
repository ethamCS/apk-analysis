package z9;

import bf.y;
import hc.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import tb.x;
import ub.q0;
import ub.v;
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¨\u0006\u0002"}, d2 = {"Lt7/o;", "a", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26538a;

        static {
            int[] iArr = new int[t7.q.values().length];
            iArr[t7.q.Map.ordinal()] = 1;
            iArr[t7.q.Array.ordinal()] = 2;
            iArr[t7.q.TextString.ordinal()] = 3;
            f26538a = iArr;
        }
    }

    public static final t7.o a(t7.o oVar) {
        t7.o oVar2;
        int s10;
        Map q10;
        int s11;
        CharSequence S0;
        t.e(oVar, "<this>");
        t7.q s12 = oVar.s1();
        int i10 = s12 == null ? -1 : a.f26538a[s12.ordinal()];
        if (i10 == 1) {
            Collection<Map.Entry<t7.o, t7.o>> l12 = oVar.l1();
            t.d(l12, "entries");
            s10 = v.s(l12, 10);
            ArrayList arrayList = new ArrayList(s10);
            Iterator<T> it = l12.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                t.d(entry, "(key, value)");
                t7.o oVar3 = (t7.o) entry.getKey();
                t7.o oVar4 = (t7.o) entry.getValue();
                t.d(oVar3, "key");
                t7.o a10 = a(oVar3);
                t.d(oVar4, "value");
                arrayList.add(x.a(a10, a(oVar4)));
            }
            q10 = q0.q(arrayList);
            oVar2 = t7.o.Q(q10);
        } else if (i10 != 2) {
            if (i10 != 3) {
                return oVar;
            }
            String s13 = oVar.s();
            t.d(s13, "AsString()");
            S0 = y.S0(s13);
            t7.o T = t7.o.T(S0.toString());
            t.d(T, "{\n            CBORObject…tring().trim())\n        }");
            return T;
        } else {
            Collection<t7.o> t12 = oVar.t1();
            t.d(t12, "values");
            s11 = v.s(t12, 10);
            ArrayList arrayList2 = new ArrayList(s11);
            for (t7.o oVar5 : t12) {
                t.d(oVar5, "it");
                arrayList2.add(a(oVar5));
            }
            oVar2 = t7.o.Q(arrayList2);
        }
        t.d(oVar2, "{\n            CBORObject…,\n            )\n        }");
        return oVar2;
    }
}
