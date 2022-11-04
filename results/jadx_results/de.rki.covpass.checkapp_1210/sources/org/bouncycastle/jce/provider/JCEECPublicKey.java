package org.bouncycastle.jce.provider;

import ak.q;
import gg.a0;
import gg.r;
import gg.r1;
import gg.t;
import gg.t1;
import gg.v;
import gg.w;
import hh.b;
import hh.n0;
import ih.k;
import ih.n;
import ih.o;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import lg.a;
import lg.f;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import qi.c;
import ri.d;
import ri.e;
import ri.g;
import ti.i;
import zh.e0;
import zh.y;
/* loaded from: classes3.dex */
public class JCEECPublicKey implements ECPublicKey, c {
    private String algorithm;
    private ECParameterSpec ecSpec;
    private f gostParams;

    /* renamed from: q */
    private i f18693q;
    private boolean withCompression;

    JCEECPublicKey(n0 n0Var) {
        this.algorithm = "EC";
        populateFromPubKeyInfo(n0Var);
    }

    public JCEECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.f18693q = EC5Util.convertPoint(params, eCPublicKeySpec.getW());
    }

    public JCEECPublicKey(String str, JCEECPublicKey jCEECPublicKey) {
        this.algorithm = str;
        this.f18693q = jCEECPublicKey.f18693q;
        this.ecSpec = jCEECPublicKey.ecSpec;
        this.withCompression = jCEECPublicKey.withCompression;
        this.gostParams = jCEECPublicKey.gostParams;
    }

    public JCEECPublicKey(String str, g gVar) {
        ECParameterSpec eCParameterSpec;
        this.algorithm = str;
        this.f18693q = gVar.b();
        if (gVar.a() != null) {
            eCParameterSpec = EC5Util.convertSpec(EC5Util.convertCurve(gVar.a().a(), gVar.a().e()), gVar.a());
        } else {
            if (this.f18693q.i() == null) {
                this.f18693q = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().a().g(this.f18693q.f().t(), this.f18693q.g().t());
            }
            eCParameterSpec = null;
        }
        this.ecSpec = eCParameterSpec;
    }

    public JCEECPublicKey(String str, e0 e0Var) {
        this.algorithm = str;
        this.f18693q = e0Var.c();
        this.ecSpec = null;
    }

    public JCEECPublicKey(String str, e0 e0Var, ECParameterSpec eCParameterSpec) {
        this.algorithm = "EC";
        y b10 = e0Var.b();
        this.algorithm = str;
        this.f18693q = e0Var.c();
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(b10.a(), b10.f()), b10);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public JCEECPublicKey(String str, e0 e0Var, e eVar) {
        this.algorithm = "EC";
        y b10 = e0Var.b();
        this.algorithm = str;
        this.f18693q = e0Var.c();
        this.ecSpec = eVar == null ? createSpec(EC5Util.convertCurve(b10.a(), b10.f()), b10) : EC5Util.convertSpec(EC5Util.convertCurve(eVar.a(), eVar.e()), eVar);
    }

    public JCEECPublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = "EC";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.f18693q = EC5Util.convertPoint(params, eCPublicKey.getW());
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, y yVar) {
        return new ECParameterSpec(ellipticCurve, EC5Util.convertPoint(yVar.b()), yVar.e(), yVar.c().intValue());
    }

    private void extractBytes(byte[] bArr, int i10, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i11 = 0; i11 != 32; i11++) {
            bArr[i10 + i11] = byteArray[(byteArray.length - 1) - i11];
        }
    }

    private void populateFromPubKeyInfo(n0 n0Var) {
        ti.e eVar;
        byte[] D;
        w t1Var;
        ECParameterSpec eCParameterSpec;
        b l10 = n0Var.l();
        if (l10.l().s(a.f16029m)) {
            gg.c o10 = n0Var.o();
            this.algorithm = "ECGOST3410";
            try {
                byte[] F = ((w) a0.u(o10.D())).F();
                byte[] bArr = new byte[65];
                bArr[0] = 4;
                for (int i10 = 1; i10 <= 32; i10++) {
                    bArr[i10] = F[32 - i10];
                    bArr[i10 + 32] = F[64 - i10];
                }
                f n10 = f.n(l10.o());
                this.gostParams = n10;
                ri.c a10 = oi.a.a(lg.b.g(n10.o()));
                ti.e a11 = a10.a();
                EllipticCurve convertCurve = EC5Util.convertCurve(a11, a10.e());
                this.f18693q = a11.j(bArr);
                this.ecSpec = new d(lg.b.g(this.gostParams.o()), convertCurve, EC5Util.convertPoint(a10.b()), a10.d(), a10.c());
                return;
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
        ih.g l11 = ih.g.l(l10.o());
        if (l11.o()) {
            v vVar = (v) l11.m();
            ih.i namedCurveByOid = ECUtil.getNamedCurveByOid(vVar);
            eVar = namedCurveByOid.l();
            eCParameterSpec = new d(ECUtil.getCurveName(vVar), EC5Util.convertCurve(eVar, namedCurveByOid.r()), EC5Util.convertPoint(namedCurveByOid.m()), namedCurveByOid.q(), namedCurveByOid.n());
        } else if (l11.n()) {
            this.ecSpec = null;
            eVar = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().a();
            D = n0Var.o().D();
            t1Var = new t1(D);
            if (D[0] == 4 && D[1] == D.length - 2 && ((D[2] == 2 || D[2] == 3) && new n().a(eVar) >= D.length - 3)) {
                try {
                    t1Var = (w) a0.u(D);
                } catch (IOException unused2) {
                    throw new IllegalArgumentException("error recovering public key");
                }
            }
            this.f18693q = new k(eVar, t1Var).l();
        } else {
            ih.i o11 = ih.i.o(l11.m());
            eVar = o11.l();
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(eVar, o11.r()), EC5Util.convertPoint(o11.m()), o11.q(), o11.n().intValue());
        }
        this.ecSpec = eCParameterSpec;
        D = n0Var.o().D();
        t1Var = new t1(D);
        if (D[0] == 4) {
            t1Var = (w) a0.u(D);
        }
        this.f18693q = new k(eVar, t1Var).l();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        populateFromPubKeyInfo(n0.n(a0.u((byte[]) objectInputStream.readObject())));
        this.algorithm = (String) objectInputStream.readObject();
        this.withCompression = objectInputStream.readBoolean();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
    }

    public i engineGetQ() {
        return this.f18693q;
    }

    e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JCEECPublicKey)) {
            return false;
        }
        JCEECPublicKey jCEECPublicKey = (JCEECPublicKey) obj;
        return engineGetQ().e(jCEECPublicKey.engineGetQ()) && engineGetSpec().equals(jCEECPublicKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        n0 n0Var;
        ih.g gVar;
        t tVar;
        if (this.algorithm.equals("ECGOST3410")) {
            t tVar2 = this.gostParams;
            if (tVar2 == null) {
                ECParameterSpec eCParameterSpec = this.ecSpec;
                if (eCParameterSpec instanceof d) {
                    tVar = new f(lg.b.i(((d) eCParameterSpec).c()), a.f16032p);
                } else {
                    ti.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                    tVar = new ih.g(new ih.i(convertCurve, new k(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
                }
                tVar2 = tVar;
            }
            BigInteger t10 = this.f18693q.f().t();
            BigInteger t11 = this.f18693q.g().t();
            byte[] bArr = new byte[64];
            extractBytes(bArr, 0, t10);
            extractBytes(bArr, 32, t11);
            try {
                n0Var = new n0(new b(a.f16029m, tVar2), new t1(bArr));
            } catch (IOException unused) {
                return null;
            }
        } else {
            ECParameterSpec eCParameterSpec2 = this.ecSpec;
            if (eCParameterSpec2 instanceof d) {
                v namedCurveOid = ECUtil.getNamedCurveOid(((d) eCParameterSpec2).c());
                if (namedCurveOid == null) {
                    namedCurveOid = new v(((d) this.ecSpec).c());
                }
                gVar = new ih.g(namedCurveOid);
            } else if (eCParameterSpec2 == null) {
                gVar = new ih.g((r) r1.f10880d);
            } else {
                ti.e convertCurve2 = EC5Util.convertCurve(eCParameterSpec2.getCurve());
                gVar = new ih.g(new ih.i(convertCurve2, new k(EC5Util.convertPoint(convertCurve2, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
            n0Var = new n0(new b(o.Q, gVar), getQ().l(this.withCompression));
        }
        return KeyUtil.getEncodedSubjectPublicKeyInfo(n0Var);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // qi.a
    public e getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    @Override // qi.c
    public i getQ() {
        return this.ecSpec == null ? this.f18693q.k() : this.f18693q;
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return EC5Util.convertPoint(this.f18693q);
    }

    public int hashCode() {
        return engineGetQ().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = q.d();
        stringBuffer.append("EC Public Key");
        stringBuffer.append(d10);
        stringBuffer.append("            X: ");
        stringBuffer.append(this.f18693q.f().t().toString(16));
        stringBuffer.append(d10);
        stringBuffer.append("            Y: ");
        stringBuffer.append(this.f18693q.g().t().toString(16));
        stringBuffer.append(d10);
        return stringBuffer.toString();
    }
}
