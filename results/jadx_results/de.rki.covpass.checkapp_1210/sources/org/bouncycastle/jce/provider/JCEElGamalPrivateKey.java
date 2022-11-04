package org.bouncycastle.jce.provider;

import gg.g;
import gg.q;
import gg.v;
import hh.b;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import qi.e;
import qi.n;
import ri.i;
import ri.j;
import yg.a;
import zg.s;
import zh.o0;
/* loaded from: classes3.dex */
public class JCEElGamalPrivateKey implements e, DHPrivateKey, n {
    static final long serialVersionUID = 4819350091141529678L;
    private PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    i elSpec;

    /* renamed from: x */
    BigInteger f18694x;

    protected JCEElGamalPrivateKey() {
    }

    JCEElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        this.f18694x = dHPrivateKey.getX();
        this.elSpec = new i(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    JCEElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.f18694x = dHPrivateKeySpec.getX();
        this.elSpec = new i(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    JCEElGamalPrivateKey(e eVar) {
        this.f18694x = eVar.getX();
        this.elSpec = eVar.getParameters();
    }

    JCEElGamalPrivateKey(j jVar) {
        this.f18694x = jVar.b();
        this.elSpec = new i(jVar.a().b(), jVar.a().a());
    }

    JCEElGamalPrivateKey(s sVar) {
        a m10 = a.m(sVar.o().o());
        this.f18694x = q.E(sVar.u()).G();
        this.elSpec = new i(m10.n(), m10.l());
    }

    JCEElGamalPrivateKey(o0 o0Var) {
        this.f18694x = o0Var.c();
        this.elSpec = new i(o0Var.b().c(), o0Var.b().a());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f18694x = (BigInteger) objectInputStream.readObject();
        this.elSpec = new i((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
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
        return KeyUtil.getEncodedPrivateKeyInfo(new b(yg.b.f26297l, new a(this.elSpec.b(), this.elSpec.a())), new q(getX()));
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
        return this.f18694x;
    }

    @Override // qi.n
    public void setBagAttribute(v vVar, g gVar) {
        this.attrCarrier.setBagAttribute(vVar, gVar);
    }
}
