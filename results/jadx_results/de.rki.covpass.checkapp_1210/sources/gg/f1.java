package gg;

import java.io.IOException;
/* loaded from: classes3.dex */
public class f1 implements g, t2 {

    /* renamed from: c */
    final int f10811c;

    /* renamed from: d */
    final int f10812d;

    /* renamed from: q */
    final f0 f10813q;

    public f1(int i10, int i11, f0 f0Var) {
        this.f10811c = i10;
        this.f10812d = i11;
        this.f10813q = f0Var;
    }

    @Override // gg.g
    public a0 b() {
        try {
            return e();
        } catch (IOException e10) {
            throw new z(e10.getMessage());
        }
    }

    @Override // gg.t2
    public a0 e() {
        return this.f10813q.c(this.f10811c, this.f10812d);
    }
}
