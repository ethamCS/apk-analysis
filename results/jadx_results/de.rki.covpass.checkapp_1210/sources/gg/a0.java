package gg;

import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes3.dex */
public abstract class a0 extends t {
    public static a0 u(byte[] bArr) {
        p pVar = new p(bArr);
        try {
            a0 s10 = pVar.s();
            if (pVar.available() == 0) {
                return s10;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // gg.t, gg.g
    public final a0 b() {
        return this;
    }

    @Override // gg.t
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && l(((g) obj).b());
    }

    @Override // gg.t
    public abstract int hashCode();

    @Override // gg.t
    public void i(OutputStream outputStream, String str) {
        y b10 = y.b(outputStream, str);
        b10.w(this, true);
        b10.c();
    }

    public abstract boolean l(a0 a0Var);

    public abstract void m(y yVar, boolean z10);

    public abstract boolean n();

    public void o(OutputStream outputStream) {
        y a10 = y.a(outputStream);
        a10.w(this, true);
        a10.c();
    }

    public abstract int q(boolean z10);

    public final boolean r(g gVar) {
        return this == gVar || (gVar != null && l(gVar.b()));
    }

    public final boolean s(a0 a0Var) {
        return this == a0Var || l(a0Var);
    }

    public a0 w() {
        return this;
    }

    public a0 z() {
        return this;
    }
}
