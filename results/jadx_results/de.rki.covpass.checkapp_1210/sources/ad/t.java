package ad;

import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.j1;
/* loaded from: classes.dex */
public abstract class t implements xc.e {
    public static final a Companion = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final he.h a(xc.e eVar, j1 j1Var, pe.g gVar) {
            he.h e02;
            hc.t.e(eVar, "<this>");
            hc.t.e(j1Var, "typeSubstitution");
            hc.t.e(gVar, "kotlinTypeRefiner");
            t tVar = eVar instanceof t ? (t) eVar : null;
            if (tVar == null || (e02 = tVar.e0(j1Var, gVar)) == null) {
                he.h K = eVar.K(j1Var);
                hc.t.d(K, "this.getMemberScope(\n   …ubstitution\n            )");
                return K;
            }
            return e02;
        }

        public final he.h b(xc.e eVar, pe.g gVar) {
            he.h y02;
            hc.t.e(eVar, "<this>");
            hc.t.e(gVar, "kotlinTypeRefiner");
            t tVar = eVar instanceof t ? (t) eVar : null;
            if (tVar == null || (y02 = tVar.y0(gVar)) == null) {
                he.h I0 = eVar.I0();
                hc.t.d(I0, "this.unsubstitutedMemberScope");
                return I0;
            }
            return y02;
        }
    }

    public abstract he.h e0(j1 j1Var, pe.g gVar);

    public abstract he.h y0(pe.g gVar);
}
