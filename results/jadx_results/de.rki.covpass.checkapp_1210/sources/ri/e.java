package ri;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
/* loaded from: classes3.dex */
public class e implements AlgorithmParameterSpec {

    /* renamed from: a */
    private ti.e f21220a;

    /* renamed from: b */
    private byte[] f21221b;

    /* renamed from: c */
    private ti.i f21222c;

    /* renamed from: d */
    private BigInteger f21223d;

    /* renamed from: e */
    private BigInteger f21224e;

    public e(ti.e eVar, ti.i iVar, BigInteger bigInteger) {
        this.f21220a = eVar;
        this.f21222c = iVar.A();
        this.f21223d = bigInteger;
        this.f21224e = BigInteger.valueOf(1L);
        this.f21221b = null;
    }

    public e(ti.e eVar, ti.i iVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f21220a = eVar;
        this.f21222c = iVar.A();
        this.f21223d = bigInteger;
        this.f21224e = bigInteger2;
        this.f21221b = bArr;
    }

    public ti.e a() {
        return this.f21220a;
    }

    public ti.i b() {
        return this.f21222c;
    }

    public BigInteger c() {
        return this.f21224e;
    }

    public BigInteger d() {
        return this.f21223d;
    }

    public byte[] e() {
        return this.f21221b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return a().l(eVar.a()) && b().e(eVar.b());
    }

    public int hashCode() {
        return a().hashCode() ^ b().hashCode();
    }
}
