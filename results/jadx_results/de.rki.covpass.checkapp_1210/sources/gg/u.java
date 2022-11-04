package gg;

import java.util.Objects;
/* loaded from: classes3.dex */
public final class u extends a0 {

    /* renamed from: d */
    static final o0 f10892d = new a(u.class, 7);

    /* renamed from: c */
    private final n f10893c;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 c(d0 d0Var) {
            return new u((n) n.f10860d.c(d0Var));
        }

        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return new u((n) n.f10860d.d(t1Var));
        }
    }

    public u(n nVar) {
        Objects.requireNonNull(nVar, "'baseGraphicString' cannot be null");
        this.f10893c = nVar;
    }

    public static u C(byte[] bArr) {
        return new u(n.C(bArr));
    }

    public n D() {
        return this.f10893c;
    }

    @Override // gg.a0, gg.t
    public int hashCode() {
        return ~this.f10893c.hashCode();
    }

    @Override // gg.a0
    public boolean l(a0 a0Var) {
        if (!(a0Var instanceof u)) {
            return false;
        }
        return this.f10893c.l(((u) a0Var).f10893c);
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        yVar.s(z10, 7);
        this.f10893c.m(yVar, false);
    }

    @Override // gg.a0
    public boolean n() {
        return false;
    }

    @Override // gg.a0
    public int q(boolean z10) {
        return this.f10893c.q(z10);
    }

    @Override // gg.a0
    public a0 w() {
        n nVar = (n) this.f10893c.w();
        return nVar == this.f10893c ? this : new u(nVar);
    }

    @Override // gg.a0
    public a0 z() {
        n nVar = (n) this.f10893c.z();
        return nVar == this.f10893c ? this : new u(nVar);
    }
}
