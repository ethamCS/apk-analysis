package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import gg.q;
import hh.b;
import hh.n0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import qi.f;
import ri.i;
import ri.k;
import yg.a;
import zh.p0;
/* loaded from: classes3.dex */
public class BCElGamalPublicKey implements f, DHPublicKey {
    static final long serialVersionUID = 8712728417091216948L;
    private transient i elSpec;

    /* renamed from: y */
    private BigInteger f18683y;

    public BCElGamalPublicKey(n0 n0Var) {
        a m10 = a.m(n0Var.l().o());
        try {
            this.f18683y = ((q) n0Var.q()).G();
            this.elSpec = new i(m10.n(), m10.l());
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    BCElGamalPublicKey(BigInteger bigInteger, i iVar) {
        this.f18683y = bigInteger;
        this.elSpec = iVar;
    }

    public BCElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.f18683y = dHPublicKey.getY();
        this.elSpec = new i(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    public BCElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f18683y = dHPublicKeySpec.getY();
        this.elSpec = new i(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    public BCElGamalPublicKey(f fVar) {
        this.f18683y = fVar.getY();
        this.elSpec = fVar.getParameters();
    }

    public BCElGamalPublicKey(k kVar) {
        this.f18683y = kVar.b();
        this.elSpec = new i(kVar.a().b(), kVar.a().a());
    }

    public BCElGamalPublicKey(p0 p0Var) {
        this.f18683y = p0Var.c();
        this.elSpec = new i(p0Var.b().c(), p0Var.b().a());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.elSpec = new i((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new n0(new b(yg.b.f26297l, new a(this.elSpec.b(), this.elSpec.a())), new q(this.f18683y)).k("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // qi.d
    public i getParameters() {
        return this.elSpec;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.elSpec.b(), this.elSpec.a());
    }

    @Override // qi.f, javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.f18683y;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }
}
