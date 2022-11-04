package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import gg.g;
import gg.q;
import gg.v;
import hh.b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import qi.e;
import qi.n;
import ri.i;
import ri.j;
import yg.a;
import zg.s;
import zh.o0;
/* loaded from: classes3.dex */
public class BCElGamalPrivateKey implements e, DHPrivateKey, n {
    static final long serialVersionUID = 4819350091141529678L;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient i elSpec;

    /* renamed from: x */
    private BigInteger f18682x;

    protected BCElGamalPrivateKey() {
    }

    public BCElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        this.f18682x = dHPrivateKey.getX();
        this.elSpec = new i(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    public BCElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.f18682x = dHPrivateKeySpec.getX();
        this.elSpec = new i(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public BCElGamalPrivateKey(e eVar) {
        this.f18682x = eVar.getX();
        this.elSpec = eVar.getParameters();
    }

    public BCElGamalPrivateKey(j jVar) {
        this.f18682x = jVar.b();
        this.elSpec = new i(jVar.a().b(), jVar.a().a());
    }

    public BCElGamalPrivateKey(s sVar) {
        a m10 = a.m(sVar.o().o());
        this.f18682x = q.E(sVar.u()).G();
        this.elSpec = new i(m10.n(), m10.l());
    }

    public BCElGamalPrivateKey(o0 o0Var) {
        this.f18682x = o0Var.c();
        this.elSpec = new i(o0Var.b().c(), o0Var.b().a());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.elSpec = new i((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
    }

    @Override // qi.n
    public g getBagAttribute(v vVar) {
        return this.attrCarrier.getBagAttribute(vVar);
    }

    @Override // qi.n
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new s(new b(yg.b.f26297l, new a(this.elSpec.b(), this.elSpec.a())), new q(getX())).k("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // qi.d
    public i getParameters() {
        return this.elSpec;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.elSpec.b(), this.elSpec.a());
    }

    @Override // qi.e, javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return this.f18682x;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    @Override // qi.n
    public void setBagAttribute(v vVar, g gVar) {
        this.attrCarrier.setBagAttribute(vVar, gVar);
    }
}
