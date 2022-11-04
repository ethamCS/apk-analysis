package gg;

import java.io.IOException;
/* loaded from: classes3.dex */
public class o2 implements g, t2 {

    /* renamed from: c */
    private f0 f10869c;

    public o2(f0 f0Var) {
        this.f10869c = f0Var;
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
        return j2.b(this.f10869c.h());
    }
}
