package ke;

import oe.m0;
/* loaded from: classes3.dex */
public interface s {

    /* loaded from: classes3.dex */
    public static final class a implements s {

        /* renamed from: a */
        public static final a f15099a = new a();

        private a() {
        }

        @Override // ke.s
        public oe.e0 a(rd.q qVar, String str, m0 m0Var, m0 m0Var2) {
            hc.t.e(qVar, "proto");
            hc.t.e(str, "flexibleId");
            hc.t.e(m0Var, "lowerBound");
            hc.t.e(m0Var2, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    oe.e0 a(rd.q qVar, String str, m0 m0Var, m0 m0Var2);
}
