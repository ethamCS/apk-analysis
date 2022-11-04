package gg;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class z0 implements x {

    /* renamed from: c */
    private f0 f10926c;

    public z0(f0 f0Var) {
        this.f10926c = f0Var;
    }

    public static y0 c(f0 f0Var) {
        return new y0(ck.b.d(new h1(f0Var)));
    }

    @Override // gg.x
    public InputStream a() {
        return new h1(this.f10926c);
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
        return c(this.f10926c);
    }
}
