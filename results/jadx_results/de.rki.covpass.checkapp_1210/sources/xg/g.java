package xg;

import gg.a0;
import gg.t;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public class g extends t {

    /* renamed from: c */
    private gg.i f25631c;

    private g(gg.i iVar) {
        this.f25631c = iVar;
    }

    public static g l(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj == null) {
            return null;
        }
        return new g(gg.i.E(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        return this.f25631c;
    }

    public int m() {
        return this.f25631c.G();
    }

    public BigInteger n() {
        return this.f25631c.F();
    }
}
