package lh;

import java.math.BigInteger;
import zh.g1;
/* loaded from: classes3.dex */
public class a implements org.bouncycastle.crypto.d {

    /* renamed from: c */
    private static final BigInteger f16061c = BigInteger.valueOf(1);

    /* renamed from: a */
    private zh.j f16062a;

    /* renamed from: b */
    private zh.i f16063b;

    @Override // org.bouncycastle.crypto.d
    public int a() {
        return (this.f16062a.b().f().bitLength() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.d
    public BigInteger b(org.bouncycastle.crypto.i iVar) {
        zh.k kVar = (zh.k) iVar;
        if (kVar.b().equals(this.f16063b)) {
            BigInteger f10 = this.f16063b.f();
            BigInteger c10 = kVar.c();
            if (c10 != null) {
                BigInteger bigInteger = f16061c;
                if (c10.compareTo(bigInteger) > 0 && c10.compareTo(f10.subtract(bigInteger)) < 0) {
                    BigInteger modPow = c10.modPow(this.f16062a.c(), f10);
                    if (modPow.equals(bigInteger)) {
                        throw new IllegalStateException("Shared key can't be 1");
                    }
                    return modPow;
                }
            }
            throw new IllegalArgumentException("Diffie-Hellman public key is weak");
        }
        throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
    }

    @Override // org.bouncycastle.crypto.d
    public void init(org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof g1) {
            iVar = ((g1) iVar).a();
        }
        zh.b bVar = (zh.b) iVar;
        if (bVar instanceof zh.j) {
            zh.j jVar = (zh.j) bVar;
            this.f16062a = jVar;
            this.f16063b = jVar.b();
            return;
        }
        throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
    }
}
