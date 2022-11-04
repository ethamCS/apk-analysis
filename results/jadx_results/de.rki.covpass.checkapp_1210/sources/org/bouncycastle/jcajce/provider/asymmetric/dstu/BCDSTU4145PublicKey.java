package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import dh.a;
import dh.b;
import dh.d;
import dh.f;
import gg.a0;
import gg.d0;
import gg.q;
import gg.t;
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
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import qi.c;
import ri.e;
import ri.g;
import ti.e;
import zh.e0;
import zh.y;
/* loaded from: classes3.dex */
public class BCDSTU4145PublicKey implements ECPublicKey, c {
    static final long serialVersionUID = 7026240464295649314L;
    private String algorithm;
    private transient d dstuParams;
    private transient e0 ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private boolean withCompression;

    public BCDSTU4145PublicKey(n0 n0Var) {
        this.algorithm = "DSTU4145";
        populateFromPubKeyInfo(n0Var);
    }

    public BCDSTU4145PublicKey(String str, e0 e0Var) {
        this.algorithm = str;
        this.ecPublicKey = e0Var;
        this.ecSpec = null;
    }

    public BCDSTU4145PublicKey(String str, e0 e0Var, ECParameterSpec eCParameterSpec) {
        this.algorithm = "DSTU4145";
        y b10 = e0Var.b();
        this.algorithm = str;
        this.ecPublicKey = e0Var;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(b10.a(), b10.f()), b10);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public BCDSTU4145PublicKey(String str, e0 e0Var, e eVar) {
        this.algorithm = "DSTU4145";
        y b10 = e0Var.b();
        this.algorithm = str;
        this.ecSpec = eVar == null ? createSpec(EC5Util.convertCurve(b10.a(), b10.f()), b10) : EC5Util.convertSpec(EC5Util.convertCurve(eVar.a(), eVar.e()), eVar);
        this.ecPublicKey = e0Var;
    }

    public BCDSTU4145PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = "DSTU4145";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new e0(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(null, this.ecSpec));
    }

    public BCDSTU4145PublicKey(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        this.algorithm = "DSTU4145";
        this.ecPublicKey = bCDSTU4145PublicKey.ecPublicKey;
        this.ecSpec = bCDSTU4145PublicKey.ecSpec;
        this.withCompression = bCDSTU4145PublicKey.withCompression;
        this.dstuParams = bCDSTU4145PublicKey.dstuParams;
    }

    public BCDSTU4145PublicKey(g gVar, ProviderConfiguration providerConfiguration) {
        this.algorithm = "DSTU4145";
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

    private void populateFromPubKeyInfo(n0 n0Var) {
        i iVar;
        e eVar;
        ECParameterSpec eCParameterSpec;
        gg.c o10 = n0Var.o();
        this.algorithm = "DSTU4145";
        try {
            byte[] F = ((w) a0.u(o10.D())).F();
            v l10 = n0Var.l().l();
            v vVar = f.f9059b;
            if (l10.s(vVar)) {
                reverseBytes(F);
            }
            d0 F2 = d0.F(n0Var.l().o());
            if (F2.G(0) instanceof q) {
                iVar = i.o(F2);
                eVar = new e(iVar.l(), iVar.m(), iVar.q(), iVar.n(), iVar.r());
            } else {
                d o11 = d.o(F2);
                this.dstuParams = o11;
                if (o11.r()) {
                    v q10 = this.dstuParams.q();
                    y a10 = dh.c.a(q10);
                    eVar = new ri.c(q10.H(), a10.a(), a10.b(), a10.e(), a10.c(), a10.f());
                } else {
                    b n10 = this.dstuParams.n();
                    byte[] m10 = n10.m();
                    if (n0Var.l().l().s(vVar)) {
                        reverseBytes(m10);
                    }
                    a n11 = n10.n();
                    e.C0394e c0394e = new e.C0394e(n11.q(), n11.m(), n11.n(), n11.o(), n10.l(), new BigInteger(1, m10));
                    byte[] o12 = n10.o();
                    if (n0Var.l().l().s(vVar)) {
                        reverseBytes(o12);
                    }
                    eVar = new ri.e(c0394e, dh.e.a(c0394e, o12), n10.r());
                }
                iVar = null;
            }
            ti.e a11 = eVar.a();
            EllipticCurve convertCurve = EC5Util.convertCurve(a11, eVar.e());
            if (this.dstuParams != null) {
                ECPoint convertPoint = EC5Util.convertPoint(eVar.b());
                eCParameterSpec = this.dstuParams.r() ? new ri.d(this.dstuParams.q().H(), convertCurve, convertPoint, eVar.d(), eVar.c()) : new ECParameterSpec(convertCurve, convertPoint, eVar.d(), eVar.c().intValue());
            } else {
                eCParameterSpec = EC5Util.convertToSpec(iVar);
            }
            this.ecSpec = eCParameterSpec;
            this.ecPublicKey = new e0(dh.e.a(a11, F), EC5Util.getDomainParameters(null, this.ecSpec));
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(n0.n(a0.u((byte[]) objectInputStream.readObject())));
    }

    private void reverseBytes(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[(bArr.length - 1) - i10];
            bArr[(bArr.length - 1) - i10] = b10;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public e0 engineGetKeyParameters() {
        return this.ecPublicKey;
    }

    ri.e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCDSTU4145PublicKey)) {
            return false;
        }
        BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) obj;
        return this.ecPublicKey.c().e(bCDSTU4145PublicKey.ecPublicKey.c()) && engineGetSpec().equals(bCDSTU4145PublicKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        t tVar = this.dstuParams;
        if (tVar == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof ri.d) {
                tVar = new d(new v(((ri.d) this.ecSpec).c()));
            } else {
                ti.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                tVar = new ih.g(new i(convertCurve, new k(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
        }
        try {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new n0(new hh.b(f.f9060c, tVar), new t1(dh.e.b(this.ecPublicKey.c()))));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // qi.a
    public ri.e getParameters() {
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
        ti.i c10 = this.ecPublicKey.c();
        return this.ecSpec == null ? c10.k() : c10;
    }

    public byte[] getSbox() {
        d dVar = this.dstuParams;
        return dVar != null ? dVar.l() : d.m();
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
