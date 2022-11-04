package org.bouncycastle.jcajce.provider.asymmetric.dh;

import gg.d0;
import gg.q;
import gg.v;
import hh.n0;
import ih.c;
import ih.e;
import ih.o;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import mi.b;
import mi.d;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import zg.g;
import zh.i;
import zh.k;
import zh.n;
/* loaded from: classes3.dex */
public class BCDHPublicKey implements DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    private transient k dhPublicKey;
    private transient DHParameterSpec dhSpec;
    private transient n0 info;

    /* renamed from: y */
    private BigInteger f18671y;

    public BCDHPublicKey(n0 n0Var) {
        k kVar;
        this.info = n0Var;
        try {
            this.f18671y = ((q) n0Var.q()).G();
            d0 F = d0.F(n0Var.l().o());
            v l10 = n0Var.l().l();
            if (l10.s(zg.q.f26836q1) || isPKCSParam(F)) {
                g m10 = g.m(F);
                if (m10.n() != null) {
                    this.dhSpec = new DHParameterSpec(m10.o(), m10.l(), m10.n().intValue());
                    kVar = new k(this.f18671y, new i(this.dhSpec.getP(), this.dhSpec.getG(), null, this.dhSpec.getL()));
                } else {
                    this.dhSpec = new DHParameterSpec(m10.o(), m10.l());
                    kVar = new k(this.f18671y, new i(this.dhSpec.getP(), this.dhSpec.getG()));
                }
                this.dhPublicKey = kVar;
            } else if (!l10.s(o.H0)) {
                throw new IllegalArgumentException("unknown algorithm type: " + l10);
            } else {
                c m11 = c.m(F);
                e s10 = m11.s();
                if (s10 != null) {
                    this.dhPublicKey = new k(this.f18671y, new i(m11.q(), m11.l(), m11.r(), m11.n(), new n(s10.n(), s10.m().intValue())));
                } else {
                    this.dhPublicKey = new k(this.f18671y, new i(m11.q(), m11.l(), m11.r(), m11.n(), null));
                }
                this.dhSpec = new b(this.dhPublicKey.b());
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DH public key");
        }
    }

    public BCDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.f18671y = bigInteger;
        this.dhSpec = dHParameterSpec;
        this.dhPublicKey = dHParameterSpec instanceof b ? new k(bigInteger, ((b) dHParameterSpec).a()) : new k(bigInteger, new i(dHParameterSpec.getP(), dHParameterSpec.getG()));
    }

    public BCDHPublicKey(DHPublicKey dHPublicKey) {
        this.f18671y = dHPublicKey.getY();
        DHParameterSpec params = dHPublicKey.getParams();
        this.dhSpec = params;
        if (params instanceof b) {
            this.dhPublicKey = new k(this.f18671y, ((b) params).a());
        } else {
            this.dhPublicKey = new k(this.f18671y, new i(this.dhSpec.getP(), this.dhSpec.getG()));
        }
    }

    public BCDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f18671y = dHPublicKeySpec.getY();
        this.dhSpec = dHPublicKeySpec instanceof d ? ((d) dHPublicKeySpec).a() : new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
        DHParameterSpec dHParameterSpec = this.dhSpec;
        if (dHParameterSpec instanceof b) {
            this.dhPublicKey = new k(this.f18671y, ((b) dHParameterSpec).a());
        } else {
            this.dhPublicKey = new k(this.f18671y, new i(dHPublicKeySpec.getP(), dHPublicKeySpec.getG()));
        }
    }

    public BCDHPublicKey(k kVar) {
        this.f18671y = kVar.c();
        this.dhSpec = new b(kVar.b());
        this.dhPublicKey = kVar;
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
        objectInputStream.defaultReadObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.info = null;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    public k engineGetKeyParameters() {
        return this.dhPublicKey;
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
        return "DH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        n0 n0Var = this.info;
        if (n0Var != null) {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(n0Var);
        }
        DHParameterSpec dHParameterSpec = this.dhSpec;
        if (!(dHParameterSpec instanceof b) || ((b) dHParameterSpec).b() == null) {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new hh.b(zg.q.f26836q1, new g(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL()).b()), new q(this.f18671y));
        }
        i a10 = ((b) this.dhSpec).a();
        n h10 = a10.h();
        e eVar = null;
        if (h10 != null) {
            eVar = new e(h10.b(), h10.a());
        }
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new hh.b(o.H0, new c(a10.f(), a10.b(), a10.g(), a10.c(), eVar).b()), new q(this.f18671y));
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
        return this.f18671y;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public String toString() {
        return DHUtil.publicKeyToString("DH", this.f18671y, new i(this.dhSpec.getP(), this.dhSpec.getG()));
    }
}
