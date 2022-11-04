package gg;
/* loaded from: classes3.dex */
public abstract class r extends a0 {

    /* renamed from: c */
    static final o0 f10877c = new a(r.class, 5);

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return r.C(t1Var.F());
        }
    }

    public static r C(byte[] bArr) {
        if (bArr.length == 0) {
            return r1.f10880d;
        }
        throw new IllegalStateException("malformed NULL encoding encountered");
    }

    public static r D(j0 j0Var, boolean z10) {
        return (r) f10877c.e(j0Var, z10);
    }

    @Override // gg.a0, gg.t
    public int hashCode() {
        return -1;
    }

    @Override // gg.a0
    public boolean l(a0 a0Var) {
        return a0Var instanceof r;
    }

    public String toString() {
        return "NULL";
    }
}
