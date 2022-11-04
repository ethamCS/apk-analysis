package org.bouncycastle.jce.provider;

import gg.d0;
import gg.q;
import gg.v;
import hh.b;
import ih.a;
import ih.o;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import qi.n;
import zg.g;
import zg.s;
import zh.j;
/* loaded from: classes3.dex */
public class JCEDHPrivateKey implements DHPrivateKey, n {
    static final long serialVersionUID = 311058815616901812L;
    private n attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private DHParameterSpec dhSpec;
    private s info;

    /* renamed from: x */
    BigInteger f18690x;

    protected JCEDHPrivateKey() {
    }

    JCEDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.f18690x = dHPrivateKey.getX();
        this.dhSpec = dHPrivateKey.getParams();
    }

    JCEDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.f18690x = dHPrivateKeySpec.getX();
        this.dhSpec = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    JCEDHPrivateKey(s sVar) {
        DHParameterSpec dHParameterSpec;
        d0 F = d0.F(sVar.o().o());
        q E = q.E(sVar.u());
        v l10 = sVar.o().l();
        this.info = sVar;
        this.f18690x = E.G();
        if (l10.s(zg.q.f26836q1)) {
            g m10 = g.m(F);
            dHParameterSpec = m10.n() != null ? new DHParameterSpec(m10.o(), m10.l(), m10.n().intValue()) : new DHParameterSpec(m10.o(), m10.l());
        } else if (!l10.s(o.H0)) {
            throw new IllegalArgumentException("unknown algorithm type: " + l10);
        } else {
            a m11 = a.m(F);
            dHParameterSpec = new DHParameterSpec(m11.o().G(), m11.l().G());
        }
        this.dhSpec = dHParameterSpec;
    }

    JCEDHPrivateKey(j jVar) {
        this.f18690x = jVar.c();
        this.dhSpec = new DHParameterSpec(jVar.b().f(), jVar.b().b(), jVar.b().d());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f18690x = (BigInteger) objectInputStream.readObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    @Override // qi.n
    public gg.g getBagAttribute(v vVar) {
        return this.attrCarrier.getBagAttribute(vVar);
    }

    @Override // qi.n
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            s sVar = this.info;
            return sVar != null ? sVar.k("DER") : new s(new b(zg.q.f26836q1, new g(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL())), new q(getX())).k("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.dhSpec;
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return this.f18690x;
    }

    @Override // qi.n
    public void setBagAttribute(v vVar, gg.g gVar) {
        this.attrCarrier.setBagAttribute(vVar, gVar);
    }
}
