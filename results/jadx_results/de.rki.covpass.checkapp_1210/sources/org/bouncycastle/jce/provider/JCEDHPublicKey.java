package org.bouncycastle.jce.provider;

import gg.d0;
import gg.q;
import gg.v;
import hh.b;
import hh.n0;
import ih.a;
import ih.o;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import zg.g;
import zh.k;
/* loaded from: classes3.dex */
public class JCEDHPublicKey implements DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    private DHParameterSpec dhSpec;
    private n0 info;

    /* renamed from: y */
    private BigInteger f18691y;

    JCEDHPublicKey(n0 n0Var) {
        DHParameterSpec dHParameterSpec;
        this.info = n0Var;
        try {
            this.f18691y = ((q) n0Var.q()).G();
            d0 F = d0.F(n0Var.m().o());
            v l10 = n0Var.m().l();
            if (l10.s(zg.q.f26836q1) || isPKCSParam(F)) {
                g m10 = g.m(F);
                dHParameterSpec = m10.n() != null ? new DHParameterSpec(m10.o(), m10.l(), m10.n().intValue()) : new DHParameterSpec(m10.o(), m10.l());
            } else if (!l10.s(o.H0)) {
                throw new IllegalArgumentException("unknown algorithm type: " + l10);
            } else {
                a m11 = a.m(F);
                dHParameterSpec = new DHParameterSpec(m11.o().G(), m11.l().G());
            }
            this.dhSpec = dHParameterSpec;
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DH public key");
        }
    }

    JCEDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.f18691y = bigInteger;
        this.dhSpec = dHParameterSpec;
    }

    JCEDHPublicKey(DHPublicKey dHPublicKey) {
        this.f18691y = dHPublicKey.getY();
        this.dhSpec = dHPublicKey.getParams();
    }

    JCEDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f18691y = dHPublicKeySpec.getY();
        this.dhSpec = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    JCEDHPublicKey(k kVar) {
        this.f18691y = kVar.c();
        this.dhSpec = new DHParameterSpec(kVar.b().f(), kVar.b().b(), kVar.b().d());
    }

    private boolean isPKCSParam(d0 d0Var) {
        if (d0Var.size() == 2) {
            return true;
        }
        if (d0Var.size() > 3) {
            return false;
        }
        return q.E(d0Var.G(2)).G().compareTo(BigInteger.valueOf((long) q.E(d0Var.G(0)).G().bitLength())) <= 0;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f18691y = (BigInteger) objectInputStream.readObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        n0 n0Var = this.info;
        return n0Var != null ? KeyUtil.getEncodedSubjectPublicKeyInfo(n0Var) : KeyUtil.getEncodedSubjectPublicKeyInfo(new b(zg.q.f26836q1, new g(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL())), new q(this.f18691y));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.dhSpec;
    }

    @Override // javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.f18691y;
    }
}
