package gg;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes3.dex */
public class w2 extends d0 {

    /* renamed from: q */
    private byte[] f10913q;

    public w2(byte[] bArr) {
        Objects.requireNonNull(bArr, "'encoded' cannot be null");
        this.f10913q = bArr;
    }

    private synchronized void O() {
        if (this.f10913q != null) {
            p pVar = new p(this.f10913q, true);
            try {
                h B = pVar.B();
                pVar.close();
                this.f10795c = B.g();
                this.f10913q = null;
            } catch (IOException e10) {
                throw new z("malformed ASN.1: " + e10, e10);
            }
        }
    }

    private synchronized byte[] P() {
        return this.f10913q;
    }

    @Override // gg.d0
    public g G(int i10) {
        O();
        return super.G(i10);
    }

    @Override // gg.d0
    public Enumeration H() {
        byte[] P = P();
        return P != null ? new v2(P) : super.H();
    }

    @Override // gg.d0
    public c J() {
        return ((d0) z()).J();
    }

    @Override // gg.d0
    public k K() {
        return ((d0) z()).K();
    }

    @Override // gg.d0
    public w L() {
        return ((d0) z()).L();
    }

    @Override // gg.d0
    public e0 M() {
        return ((d0) z()).M();
    }

    @Override // gg.d0, gg.a0, gg.t
    public int hashCode() {
        O();
        return super.hashCode();
    }

    @Override // gg.d0, java.lang.Iterable
    public Iterator<g> iterator() {
        O();
        return super.iterator();
    }

    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        byte[] P = P();
        if (P != null) {
            yVar.o(z10, 48, P);
        } else {
            super.z().m(yVar, z10);
        }
    }

    @Override // gg.a0
    public int q(boolean z10) {
        byte[] P = P();
        return P != null ? y.g(z10, P.length) : super.z().q(z10);
    }

    @Override // gg.d0
    public int size() {
        O();
        return super.size();
    }

    @Override // gg.d0, gg.a0
    public a0 w() {
        O();
        return super.w();
    }

    @Override // gg.d0, gg.a0
    public a0 z() {
        O();
        return super.z();
    }
}
