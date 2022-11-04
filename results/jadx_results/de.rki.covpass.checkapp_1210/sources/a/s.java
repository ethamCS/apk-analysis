package a;

import a.c;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public class s {

    /* renamed from: a */
    protected t7.o f130a = t7.o.G0();

    /* renamed from: b */
    private PrivateKey f131b;

    /* renamed from: c */
    private PublicKey f132c;

    public s(PublicKey publicKey, PrivateKey privateKey) {
        t7.o oVar;
        t7.o b10;
        t7.o oVar2;
        t7.o oVar3;
        t7.o b11;
        t7.o oVar4;
        if (publicKey != null) {
            ArrayList<c.a> h10 = c.h(publicKey.getEncoded());
            ArrayList<c.a> arrayList = h10.get(0).f16c;
            if (Arrays.equals(arrayList.get(0).f15b, c.f5d)) {
                byte[] bArr = arrayList.get(1).f15b;
                if (bArr == null) {
                    throw new f("Invalid SPKI structure");
                }
                this.f130a.b(m.KeyType.b(), m.f101q4);
                if (Arrays.equals(bArr, c.f2a)) {
                    oVar3 = this.f130a;
                    b11 = m.EC2_Curve.b();
                    oVar4 = m.f104t4;
                } else if (Arrays.equals(bArr, c.f3b)) {
                    oVar3 = this.f130a;
                    b11 = m.EC2_Curve.b();
                    oVar4 = m.f105u4;
                } else if (!Arrays.equals(bArr, c.f4c)) {
                    throw new f("Unsupported curve");
                } else {
                    oVar3 = this.f130a;
                    b11 = m.EC2_Curve.b();
                    oVar4 = m.f106v4;
                }
                oVar3.b(b11, oVar4);
                byte[] bArr2 = h10.get(1).f15b;
                if (bArr2[1] == 2 || bArr2[1] == 3) {
                    this.f130a.b(m.EC2_X.b(), Arrays.copyOfRange(bArr2, 2, bArr2.length));
                    this.f130a.b(m.EC2_Y.b(), Boolean.valueOf(bArr2[1] != 2));
                } else if (bArr2[1] != 4) {
                    throw new f("Invalid key data");
                } else {
                    int length = ((bArr2.length - 2) / 2) + 2;
                    this.f130a.b(m.EC2_X.b(), Arrays.copyOfRange(bArr2, 2, length));
                    this.f130a.b(m.EC2_Y.b(), Arrays.copyOfRange(bArr2, length, bArr2.length));
                }
            } else if (!Arrays.equals(arrayList.get(0).f15b, c.f10i)) {
                throw new f("Unsupported Algorithm");
            } else {
                c.a c10 = c.c(1, h10.get(1).f15b);
                ArrayList<c.a> arrayList2 = c10.f16c;
                if (arrayList2 == null || arrayList2.size() != 2) {
                    throw new f("Invalid SPKI structure");
                }
                c.a aVar = c10.f16c.get(0);
                c.a aVar2 = c10.f16c.get(1);
                if (aVar.f14a != 2 || aVar2.f14a != 2) {
                    throw new f("Invalid SPKI structure");
                }
                this.f130a.b(m.RSA_N.b(), aVar.f15b);
                this.f130a.b(m.RSA_E.b(), aVar2.f15b);
            }
            this.f132c = publicKey;
        }
        if (privateKey != null) {
            ArrayList<c.a> g10 = c.g(privateKey.getEncoded());
            if (g10.get(0).f14a != 2) {
                throw new f("Invalid PKCS8 structure");
            }
            ArrayList<c.a> arrayList3 = g10.get(1).f16c;
            if (Arrays.equals(arrayList3.get(0).f15b, c.f5d)) {
                byte[] bArr3 = arrayList3.get(1).f15b;
                if (bArr3 == null) {
                    throw new f("Invalid PKCS8 structure");
                }
                t7.o oVar5 = this.f130a;
                m mVar = m.KeyType;
                if (!oVar5.E(mVar.b())) {
                    this.f130a.b(mVar.b(), m.f101q4);
                    if (Arrays.equals(bArr3, c.f2a)) {
                        oVar = this.f130a;
                        b10 = m.EC2_Curve.b();
                        oVar2 = m.f104t4;
                    } else if (Arrays.equals(bArr3, c.f3b)) {
                        oVar = this.f130a;
                        b10 = m.EC2_Curve.b();
                        oVar2 = m.f105u4;
                    } else if (!Arrays.equals(bArr3, c.f4c)) {
                        throw new f("Unsupported curve");
                    } else {
                        oVar = this.f130a;
                        b10 = m.EC2_Curve.b();
                        oVar2 = m.f106v4;
                    }
                    oVar.b(b10, oVar2);
                } else if (!c(mVar).i1(m.f101q4)) {
                    throw new f("Public/Private key don't match");
                }
                ArrayList<c.a> e10 = c.e(g10);
                if (e10.get(1).f14a != 4) {
                    throw new f("Invalid PKCS8 structure");
                }
                this.f130a.b(m.EC2_D.b(), e10.get(1).f15b);
            } else if (!Arrays.equals(arrayList3.get(0).f15b, c.f10i)) {
                throw new f("Unsupported Algorithm");
            } else {
                ArrayList<c.a> f10 = c.f(g10);
                t7.o oVar6 = this.f130a;
                m mVar2 = m.RSA_N;
                if (!oVar6.E(mVar2.b())) {
                    this.f130a.b(mVar2.b(), f10.get(1).f15b);
                }
                t7.o oVar7 = this.f130a;
                m mVar3 = m.RSA_E;
                if (!oVar7.E(mVar3.b())) {
                    this.f130a.b(mVar3.b(), f10.get(2).f15b);
                }
                this.f130a.b(m.RSA_D.b(), f10.get(3).f15b);
                this.f130a.b(m.RSA_P.b(), f10.get(4).f15b);
                this.f130a.b(m.RSA_Q.b(), f10.get(5).f15b);
                this.f130a.b(m.RSA_DP.b(), f10.get(6).f15b);
                this.f130a.b(m.RSA_DQ.b(), f10.get(7).f15b);
                this.f130a.b(m.RSA_QI.b(), f10.get(8).f15b);
            }
            this.f131b = privateKey;
        }
    }

    public PrivateKey a() {
        return this.f131b;
    }

    public PublicKey b() {
        return this.f132c;
    }

    public t7.o c(m mVar) {
        return this.f130a.k1(mVar.b());
    }
}
