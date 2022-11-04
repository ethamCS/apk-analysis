package xi;

import java.math.BigInteger;
import ti.j;
import ti.r;
/* loaded from: classes3.dex */
public class e implements d {

    /* renamed from: a */
    protected final f f25661a;

    /* renamed from: b */
    protected final j f25662b;

    public e(ti.e eVar, f fVar) {
        this.f25661a = fVar;
        this.f25662b = new r(eVar.m(fVar.a()));
    }

    @Override // xi.a
    public j a() {
        return this.f25662b;
    }

    @Override // xi.a
    public boolean b() {
        return true;
    }

    @Override // xi.d
    public BigInteger[] c(BigInteger bigInteger) {
        return c.b(this.f25661a.b(), bigInteger);
    }
}
