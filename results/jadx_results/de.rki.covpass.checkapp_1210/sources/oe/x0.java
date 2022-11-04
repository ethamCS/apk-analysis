package oe;
/* loaded from: classes3.dex */
public interface x0 {

    /* loaded from: classes3.dex */
    public static final class a implements x0 {

        /* renamed from: a */
        public static final a f18058a = new a();

        private a() {
        }

        @Override // oe.x0
        public void a(yc.c cVar) {
            hc.t.e(cVar, "annotation");
        }

        @Override // oe.x0
        public void b(l1 l1Var, e0 e0Var, e0 e0Var2, xc.f1 f1Var) {
            hc.t.e(l1Var, "substitutor");
            hc.t.e(e0Var, "unsubstitutedArgument");
            hc.t.e(e0Var2, "argument");
            hc.t.e(f1Var, "typeParameter");
        }

        @Override // oe.x0
        public void c(xc.e1 e1Var) {
            hc.t.e(e1Var, "typeAlias");
        }

        @Override // oe.x0
        public void d(xc.e1 e1Var, xc.f1 f1Var, e0 e0Var) {
            hc.t.e(e1Var, "typeAlias");
            hc.t.e(e0Var, "substitutedArgument");
        }
    }

    void a(yc.c cVar);

    void b(l1 l1Var, e0 e0Var, e0 e0Var2, xc.f1 f1Var);

    void c(xc.e1 e1Var);

    void d(xc.e1 e1Var, xc.f1 f1Var, e0 e0Var);
}
