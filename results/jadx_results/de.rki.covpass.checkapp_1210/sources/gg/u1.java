package gg;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class u1 implements x {

    /* renamed from: c */
    private s2 f10894c;

    public u1(s2 s2Var) {
        this.f10894c = s2Var;
    }

    @Override // gg.x
    public InputStream a() {
        return this.f10894c;
    }

    @Override // gg.g
    public a0 b() {
        try {
            return e();
        } catch (IOException e10) {
            throw new z("IOException converting stream to byte array: " + e10.getMessage(), e10);
        }
    }

    @Override // gg.t2
    public a0 e() {
        return new t1(this.f10894c.i());
    }
}
