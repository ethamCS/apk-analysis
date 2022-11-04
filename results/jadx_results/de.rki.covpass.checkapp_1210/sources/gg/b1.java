package gg;

import java.io.IOException;
/* loaded from: classes3.dex */
public class b1 implements g, t2 {

    /* renamed from: c */
    private f0 f10787c;

    public b1(f0 f0Var) {
        this.f10787c = f0Var;
    }

    public static a1 c(f0 f0Var) {
        return new a1(f0Var.h());
    }

    @Override // gg.g
    public a0 b() {
        try {
            return e();
        } catch (IOException e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }

    @Override // gg.t2
    public a0 e() {
        return c(this.f10787c);
    }
}
