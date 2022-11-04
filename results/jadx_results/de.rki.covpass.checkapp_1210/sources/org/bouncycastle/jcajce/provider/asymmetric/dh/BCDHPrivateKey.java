package org.bouncycastle.jcajce.provider.asymmetric.dh;

import gg.d0;
import gg.q;
import gg.v;
import ih.e;
import ih.o;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import mi.b;
import mi.c;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import qi.n;
import zg.g;
import zg.s;
import zh.i;
import zh.j;
/* loaded from: classes3.dex */
public class BCDHPrivateKey implements DHPrivateKey, n {
    static final long serialVersionUID = 311058815616901812L;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient j dhPrivateKey;
    private transient DHParameterSpec dhSpec;
    private transient s info;

    /* renamed from: x */
    private BigInteger f18670x;

    protected BCDHPrivateKey() {
    }

    public BCDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.f18670x = dHPrivateKey.getX();
        this.dhSpec = dHPrivateKey.getParams();
    }

    public BCDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.f18670x = dHPrivateKeySpec.getX();
        if (dHPrivateKeySpec instanceof c) {
            this.dhSpec = ((c) dHPrivateKeySpec).a();
        } else {
            this.dhSpec = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
        }
    }

    public BCDHPrivateKey(s sVar) {
        j jVar;
        d0 F = d0.F(sVar.o().o());
        v l10 = sVar.o().l();
        this.info = sVar;
        this.f18670x = ((q) sVar.u()).G();
        if (l10.s(zg.q.f26836q1)) {
            g m10 = g.m(F);
            if (m10.n() != null) {
                this.dhSpec = new DHParameterSpec(m10.o(), m10.l(), m10.n().intValue());
                jVar = new j(this.f18670x, new i(m10.o(), m10.l(), null, m10.n().intValue()));
            } else {
                this.dhSpec = new DHParameterSpec(m10.o(), m10.l());
                jVar = new j(this.f18670x, new i(m10.o(), m10.l()));
            }
        } else if (!l10.s(o.H0)) {
            throw new IllegalArgumentException("unknown algorithm type: " + l10);
        } else {
            ih.c m11 = ih.c.m(F);
            this.dhSpec = new b(m11.q(), m11.r(), m11.l(), m11.n(), 0);
            jVar = new j(this.f18670x, new i(m11.q(), m11.l(), m11.r(), m11.n(), null));
        }
        this.dhPrivateKey = jVar;
    }

    public BCDHPrivateKey(j jVar) {
        this.f18670x = jVar.c();
        this.dhSpec = new b(jVar.b());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.info = null;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    public j engineGetKeyParameters() {
        j jVar = this.dhPrivateKey;
        if (jVar != null) {
            return jVar;
        }
        DHParameterSpec dHParameterSpec = this.dhSpec;
        return dHParameterSpec instanceof b ? new j(this.f18670x, ((b) dHParameterSpec).a()) : new j(this.f18670x, new i(dHParameterSpec.getP(), this.dhSpec.getG(), null, this.dhSpec.getL()));
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
        s sVar;
        try {
            s sVar2 = this.info;
            if (sVar2 != null) {
                return sVar2.k("DER");
            }
            DHParameterSpec dHParameterSpec = this.dhSpec;
            if (!(dHParameterSpec instanceof b) || ((b) dHParameterSpec).b() == null) {
                sVar = new s(new hh.b(zg.q.f26836q1, new g(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL()).b()), new q(getX()));
            } else {
                i a10 = ((b) this.dhSpec).a();
                zh.n h10 = a10.h();
                sVar = new s(new hh.b(o.H0, new ih.c(a10.f(), a10.b(), a10.g(), a10.c(), h10 != null ? new e(h10.b(), h10.a()) : null).b()), new q(getX()));
            }
            return sVar.k("DER");
        } catch (Exception unused) {
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
        return this.f18670x;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    @Override // qi.n
    public void setBagAttribute(v vVar, gg.g gVar) {
        this.attrCarrier.setBagAttribute(vVar, gVar);
    }

    public String toString() {
        return DHUtil.privateKeyToString("DH", this.f18670x, new i(this.dhSpec.getP(), this.dhSpec.getG()));
    }
}
