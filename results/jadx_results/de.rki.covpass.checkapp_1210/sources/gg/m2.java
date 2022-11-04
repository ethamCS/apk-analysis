package gg;

import java.io.IOException;
/* loaded from: classes3.dex */
public class m2 implements g, t2 {

    /* renamed from: c */
    private f0 f10859c;

    public m2(f0 f0Var) {
        this.f10859c = f0Var;
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
        return j2.a(this.f10859c.h());
    }
}
