package org.bouncycastle.jce.provider;

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
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import qi.f;
import ri.i;
import ri.k;
import yg.a;
import zh.p0;
/* loaded from: classes3.dex */
public class JCEElGamalPublicKey implements f, DHPublicKey {
    static final long serialVersionUID = 8712728417091216948L;
    private i elSpec;

    /* renamed from: y */
    private BigInteger f18695y;

    JCEElGamalPublicKey(n0 n0Var) {
        a m10 = a.m(n0Var.l().o());
        try {
            this.f18695y = ((q) n0Var.q()).G();
            this.elSpec = new i(m10.n(), m10.l());
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    JCEElGamalPublicKey(BigInteger bigInteger, i iVar) {
        this.f18695y = bigInteger;
        this.elSpec = iVar;
    }

    JCEElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.f18695y = dHPublicKey.getY();
        this.elSpec = new i(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    JCEElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f18695y = dHPublicKeySpec.getY();
        this.elSpec = new i(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    JCEElGamalPublicKey(f fVar) {
        this.f18695y = fVar.getY();
        this.elSpec = fVar.getParameters();
    }

    JCEElGamalPublicKey(k kVar) {
        this.f18695y = kVar.b();
        this.elSpec = new i(kVar.a().b(), kVar.a().a());
    }

    JCEElGamalPublicKey(p0 p0Var) {
        this.f18695y = p0Var.c();
        this.elSpec = new i(p0Var.b().c(), p0Var.b().a());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f18695y = (BigInteger) objectInputStream.readObject();
        this.elSpec = new i((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new b(yg.b.f26297l, new a(this.elSpec.b(), this.elSpec.a())), new q(this.f18695y));
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
        return this.f18695y;
    }
}
