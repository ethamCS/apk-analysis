package gg;
/* loaded from: classes3.dex */
public abstract class b0 extends a0 implements g0 {

    /* renamed from: d */
    static final o0 f10785d = new a(b0.class, 19);

    /* renamed from: c */
    final byte[] f10786c;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return b0.C(t1Var.F());
        }
    }

    public b0(String str, boolean z10) {
        if (!z10 || D(str)) {
            this.f10786c = ak.q.f(str);
            return;
        }
        throw new IllegalArgumentException("string contains illegal characters");
    }

    public b0(byte[] bArr, boolean z10) {
        this.f10786c = z10 ? ak.a.h(bArr) : bArr;
    }

    public static b0 C(byte[] bArr) {
        return new w1(bArr, false);
    }

    public static boolean D(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            char charAt = str.charAt(length);
            if (charAt > 127) {
                return false;
            }
            if (('a' > charAt || charAt > 'z') && (('A' > charAt || charAt > 'Z') && (('0' > charAt || charAt > '9') && charAt != ' ' && charAt != ':' && charAt != '=' && charAt != '?'))) {
                switch (charAt) {
                    case '\'':
                    case '(':
                    case ')':
                        continue;
                    default:
                        switch (charAt) {
                            case '+':
                            case ',':
                            case '-':
                            case '.':
                            case '/':
                                continue;
                            default:
                                return false;
                        }
                }
            }
        }
        return true;
    }

    @Override // gg.g0
    public final String c() {
        return ak.q.b(this.f10786c);
    }

    @Override // gg.a0, gg.t
    public final int hashCode() {
        return ak.a.F(this.f10786c);
    }

    @Override // gg.a0
    public final boolean l(a0 a0Var) {
        if (!(a0Var instanceof b0)) {
            return false;
        }
        return ak.a.c(this.f10786c, ((b0) a0Var).f10786c);
    }

    @Override // gg.a0
    public final void m(y yVar, boolean z10) {
        yVar.o(z10, 19, this.f10786c);
    }

    @Override // gg.a0
    public final boolean n() {
        return false;
    }

    @Override // gg.a0
    public final int q(boolean z10) {
        return y.g(z10, this.f10786c.length);
    }

    public String toString() {
        return c();
    }
}
