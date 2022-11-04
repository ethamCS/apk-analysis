package gg;
/* loaded from: classes3.dex */
public abstract class m0 extends a0 implements g0 {

    /* renamed from: d */
    static final o0 f10856d = new a(m0.class, 12);

    /* renamed from: c */
    final byte[] f10857c;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return m0.C(t1Var.F());
        }
    }

    public m0(String str) {
        this(ak.q.i(str), false);
    }

    public m0(byte[] bArr, boolean z10) {
        this.f10857c = z10 ? ak.a.h(bArr) : bArr;
    }

    public static m0 C(byte[] bArr) {
        return new b2(bArr, false);
    }

    public static m0 D(Object obj) {
        if (obj == null || (obj instanceof m0)) {
            return (m0) obj;
        }
        if (obj instanceof g) {
            a0 b10 = ((g) obj).b();
            if (b10 instanceof m0) {
                return (m0) b10;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (m0) f10856d.b((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e10.toString());
        }
    }

    @Override // gg.g0
    public final String c() {
        return ak.q.c(this.f10857c);
    }

    @Override // gg.a0, gg.t
    public final int hashCode() {
        return ak.a.F(this.f10857c);
    }

    @Override // gg.a0
    public final boolean l(a0 a0Var) {
        if (!(a0Var instanceof m0)) {
            return false;
        }
        return ak.a.c(this.f10857c, ((m0) a0Var).f10857c);
    }

    @Override // gg.a0
    public final void m(y yVar, boolean z10) {
        yVar.o(z10, 12, this.f10857c);
    }

    @Override // gg.a0
    public final boolean n() {
        return false;
    }

    @Override // gg.a0
    public final int q(boolean z10) {
        return y.g(z10, this.f10857c.length);
    }

    public String toString() {
        return c();
    }
}
