package aj;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class d implements f {

    /* renamed from: a */
    protected final a f545a;

    /* renamed from: b */
    protected final e f546b;

    public d(a aVar, e eVar) {
        this.f545a = aVar;
        this.f546b = eVar;
    }

    @Override // aj.f
    public e a() {
        return this.f546b;
    }

    @Override // aj.a
    public int b() {
        return this.f545a.b() * this.f546b.b();
    }

    @Override // aj.a
    public BigInteger c() {
        return this.f545a.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f545a.equals(dVar.f545a) && this.f546b.equals(dVar.f546b);
    }

    public int hashCode() {
        return this.f545a.hashCode() ^ ak.g.c(this.f546b.hashCode(), 16);
    }
}
