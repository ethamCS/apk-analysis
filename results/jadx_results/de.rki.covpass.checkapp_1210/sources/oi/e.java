package oi;

import gg.d0;
import gg.p;
import hh.y0;
import java.io.IOException;
import java.security.Principal;
/* loaded from: classes3.dex */
public class e extends y0 implements Principal {
    public e(fh.c cVar) {
        super((d0) cVar.b());
    }

    public e(y0 y0Var) {
        super((d0) y0Var.b());
    }

    public e(byte[] bArr) {
        super(w(new p(bArr)));
    }

    private static d0 w(p pVar) {
        try {
            return d0.F(pVar.s());
        } catch (IllegalArgumentException e10) {
            throw new IOException("not an ASN.1 Sequence: " + e10);
        }
    }

    @Override // gg.t, ak.d
    public byte[] getEncoded() {
        try {
            return k("DER");
        } catch (IOException e10) {
            throw new RuntimeException(e10.toString());
        }
    }

    @Override // java.security.Principal
    public String getName() {
        return toString();
    }
}
