package gg;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class w0 implements d {

    /* renamed from: c */
    private f0 f10911c;

    /* renamed from: d */
    private g1 f10912d;

    public w0(f0 f0Var) {
        this.f10911c = f0Var;
    }

    public static v0 c(f0 f0Var) {
        g1 g1Var = new g1(f0Var, false);
        return new v0(ck.b.d(g1Var), g1Var.e());
    }

    @Override // gg.g
    public a0 b() {
        try {
            return e();
        } catch (IOException e10) {
            throw new z("IOException converting stream to byte array: " + e10.getMessage(), e10);
        }
    }

    @Override // gg.d
    public int d() {
        return this.f10912d.e();
    }

    @Override // gg.t2
    public a0 e() {
        return c(this.f10911c);
    }

    @Override // gg.d
    public InputStream f() {
        g1 g1Var = new g1(this.f10911c, false);
        this.f10912d = g1Var;
        return g1Var;
    }
}
