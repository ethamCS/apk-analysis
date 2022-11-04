package lh;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class h implements org.bouncycastle.crypto.d {

    /* renamed from: b */
    private static final BigInteger f16072b = BigInteger.valueOf(1);

    /* renamed from: a */
    zh.g f16073a;

    private BigInteger c(zh.i iVar, zh.j jVar, zh.k kVar, zh.j jVar2, zh.k kVar2, zh.k kVar3) {
        BigInteger g10 = iVar.g();
        BigInteger pow = BigInteger.valueOf(2L).pow((g10.bitLength() + 1) / 2);
        return kVar3.c().multiply(kVar.c().modPow(kVar3.c().mod(pow).add(pow), iVar.f())).modPow(jVar2.c().add(kVar2.c().mod(pow).add(pow).multiply(jVar.c())).mod(g10), iVar.f());
    }

    @Override // org.bouncycastle.crypto.d
    public int a() {
        return (this.f16073a.c().b().f().bitLength() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.d
    public BigInteger b(org.bouncycastle.crypto.i iVar) {
        zh.h hVar = (zh.h) iVar;
        zh.j c10 = this.f16073a.c();
        if (this.f16073a.c().b().equals(hVar.b().b())) {
            if (this.f16073a.c().b().g() == null) {
                throw new IllegalStateException("MQV key domain parameters do not have Q set");
            }
            BigInteger c11 = c(c10.b(), c10, hVar.b(), this.f16073a.a(), this.f16073a.b(), hVar.a());
            if (c11.equals(f16072b)) {
                throw new IllegalStateException("1 is not a valid agreement value for MQV");
            }
            return c11;
        }
        throw new IllegalStateException("MQV public key components have wrong domain parameters");
    }

    @Override // org.bouncycastle.crypto.d
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f16073a = (zh.g) iVar;
    }
}
