package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import gg.a0;
import gg.g;
import gg.t1;
import gg.v;
import gg.w;
import hh.n0;
import ih.i;
import ih.k;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import lg.b;
import lg.f;
import oi.a;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import qi.c;
import ri.d;
import ri.e;
import zh.e0;
import zh.y;
import zh.z;
/* loaded from: classes3.dex */
public class BCECGOST3410PublicKey implements ECPublicKey, c {
    static final long serialVersionUID = 7026240464295649314L;
    private String algorithm;
    private transient e0 ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private transient g gostParams;
    private boolean withCompression;

    public BCECGOST3410PublicKey(n0 n0Var) {
        this.algorithm = "ECGOST3410";
        populateFromPubKeyInfo(n0Var);
    }

    public BCECGOST3410PublicKey(String str, e0 e0Var) {
        this.algorithm = str;
        this.ecPublicKey = e0Var;
        this.ecSpec = null;
    }

    public BCECGOST3410PublicKey(String str, e0 e0Var, ECParameterSpec eCParameterSpec) {
        this.algorithm = "ECGOST3410";
        y b10 = e0Var.b();
        if (b10 instanceof z) {
            z zVar = (z) b10;
            this.gostParams = new f(zVar.m(), zVar.k(), zVar.l());
        }
        this.algorithm = str;
        this.ecPublicKey = e0Var;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(b10.a(), b10.f()), b10);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public BCECGOST3410PublicKey(String str, e0 e0Var, e eVar) {
        this.algorithm = "ECGOST3410";
        y b10 = e0Var.b();
        this.algorithm = str;
        this.ecPublicKey = e0Var;
        this.ecSpec = eVar == null ? createSpec(EC5Util.convertCurve(b10.a(), b10.f()), b10) : EC5Util.convertSpec(EC5Util.convertCurve(eVar.a(), eVar.e()), eVar);
    }

    public BCECGOST3410PublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = "ECGOST3410";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new e0(EC5Util.convertPoint(params, eCPublicKey.getW()), EC5Util.getDomainParameters(null, eCPublicKey.getParams()));
    }

    public BCECGOST3410PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = "ECGOST3410";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new e0(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(null, eCPublicKeySpec.getParams()));
    }

    public BCECGOST3410PublicKey(BCECGOST3410PublicKey bCECGOST3410PublicKey) {
        this.algorithm = "ECGOST3410";
        this.ecPublicKey = bCECGOST3410PublicKey.ecPublicKey;
        this.ecSpec = bCECGOST3410PublicKey.ecSpec;
        this.withCompression = bCECGOST3410PublicKey.withCompression;
        this.gostParams = bCECGOST3410PublicKey.gostParams;
    }

    public BCECGOST3410PublicKey(ri.g gVar, ProviderConfiguration providerConfiguration) {
        this.algorithm = "ECGOST3410";
        if (gVar.a() == null) {
            this.ecPublicKey = new e0(providerConfiguration.getEcImplicitlyCa().a().g(gVar.b().f().t(), gVar.b().g().t()), EC5Util.getDomainParameters(providerConfiguration, null));
            this.ecSpec = null;
            return;
        }
        EllipticCurve convertCurve = EC5Util.convertCurve(gVar.a().a(), gVar.a().e());
        this.ecPublicKey = new e0(gVar.b(), ECUtil.getDomainParameters(providerConfiguration, gVar.a()));
        this.ecSpec = EC5Util.convertSpec(convertCurve, gVar.a());
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
        v vVar;
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
            boolean z10 = n0Var.l().o() instanceof v;
            g o11 = n0Var.l().o();
            if (z10) {
                vVar = v.K(o11);
                this.gostParams = vVar;
            } else {
                f n10 = f.n(o11);
                this.gostParams = n10;
                vVar = n10.o();
            }
            ri.c a10 = a.a(b.g(vVar));
            ti.e a11 = a10.a();
            EllipticCurve convertCurve = EC5Util.convertCurve(a11, a10.e());
            this.ecPublicKey = new e0(a11.j(bArr), ECUtil.getDomainParameters((ProviderConfiguration) null, a10));
            this.ecSpec = new d(b.g(vVar), convertCurve, EC5Util.convertPoint(a10.b()), a10.d(), a10.c());
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(n0.n(a0.u((byte[]) objectInputStream.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public e0 engineGetKeyParameters() {
        return this.ecPublicKey;
    }

    e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410PublicKey)) {
            return false;
        }
        BCECGOST3410PublicKey bCECGOST3410PublicKey = (BCECGOST3410PublicKey) obj;
        return this.ecPublicKey.c().e(bCECGOST3410PublicKey.ecPublicKey.c()) && engineGetSpec().equals(bCECGOST3410PublicKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        g gVar;
        g gostParams = getGostParams();
        if (gostParams == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof d) {
                gVar = new f(b.i(((d) eCParameterSpec).c()), lg.a.f16032p);
            } else {
                ti.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                gVar = new ih.g(new i(convertCurve, new k(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
            gostParams = gVar;
        }
        BigInteger t10 = this.ecPublicKey.c().f().t();
        BigInteger t11 = this.ecPublicKey.c().g().t();
        byte[] bArr = new byte[64];
        extractBytes(bArr, 0, t10);
        extractBytes(bArr, 32, t11);
        try {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new n0(new hh.b(lg.a.f16029m, gostParams), new t1(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public g getGostParams() {
        if (this.gostParams == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof d) {
                this.gostParams = new f(b.i(((d) eCParameterSpec).c()), lg.a.f16032p);
            }
        }
        return this.gostParams;
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
    public ti.i getQ() {
        return this.ecSpec == null ? this.ecPublicKey.c().k() : this.ecPublicKey.c();
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return EC5Util.convertPoint(this.ecPublicKey.c());
    }

    public int hashCode() {
        return this.ecPublicKey.c().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.publicKeyToString(this.algorithm, this.ecPublicKey.c(), engineGetSpec());
    }
}
