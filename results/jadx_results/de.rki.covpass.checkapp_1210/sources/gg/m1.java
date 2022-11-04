package gg;

import java.io.IOException;
/* loaded from: classes3.dex */
public class m1 implements g, t2 {

    /* renamed from: c */
    private f0 f10858c;

    public m1(f0 f0Var) {
        this.f10858c = f0Var;
    }

    public static i2 c(f0 f0Var) {
        try {
            return new i2(f0Var.h());
        } catch (IllegalArgumentException e10) {
            throw new j(e10.getMessage(), e10);
        }
    }

    @Override // gg.g
    public a0 b() {
        try {
            return e();
        } catch (IOException e10) {
            throw new z("unable to get DER object", e10);
        } catch (IllegalArgumentException e11) {
            throw new z("unable to get DER object", e11);
        }
    }

    @Override // gg.t2
    public a0 e() {
        return c(this.f10858c);
    }
}
