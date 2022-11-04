package gg;

import java.io.IOException;
/* loaded from: classes3.dex */
public class d1 implements g, t2 {

    /* renamed from: c */
    private f0 f10798c;

    public d1(f0 f0Var) {
        this.f10798c = f0Var;
    }

    public static c1 c(f0 f0Var) {
        return new c1(f0Var.h());
    }

    @Override // gg.g
    public a0 b() {
        try {
            return e();
        } catch (IOException e10) {
            throw new z(e10.getMessage(), e10);
        }
    }

    @Override // gg.t2
    public a0 e() {
        return c(this.f10798c);
    }
}
