package org.bouncycastle.jcajce.provider.asymmetric.gost;

import gg.g;
import gg.q;
import gg.t1;
import gg.v;
import gg.w;
import hh.b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.util.Enumeration;
import lg.a;
import lg.f;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import qi.h;
import qi.i;
import qi.n;
import ri.l;
import ri.m;
import zg.s;
import zh.u0;
/* loaded from: classes3.dex */
public class BCGOST3410PrivateKey implements i, n {
    static final long serialVersionUID = 8581661527592305464L;
    private transient n attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient h gost3410Spec;

    /* renamed from: x */
    private BigInteger f18684x;

    protected BCGOST3410PrivateKey() {
    }

    public BCGOST3410PrivateKey(i iVar) {
        this.f18684x = iVar.getX();
        this.gost3410Spec = iVar.getParameters();
    }

    public BCGOST3410PrivateKey(m mVar) {
        this.f18684x = mVar.d();
        this.gost3410Spec = new l(new ri.n(mVar.b(), mVar.c(), mVar.a()));
    }

    public BCGOST3410PrivateKey(s sVar) {
        BigInteger bigInteger;
        f n10 = f.n(sVar.o().o());
        g u10 = sVar.u();
        if (u10 instanceof q) {
            bigInteger = q.E(u10).F();
        } else {
            byte[] F = w.E(sVar.u()).F();
            byte[] bArr = new byte[F.length];
            for (int i10 = 0; i10 != F.length; i10++) {
                bArr[i10] = F[(F.length - 1) - i10];
            }
            bigInteger = new BigInteger(1, bArr);
        }
        this.f18684x = bigInteger;
        this.gost3410Spec = l.e(n10);
    }

    public BCGOST3410PrivateKey(u0 u0Var, l lVar) {
        this.f18684x = u0Var.c();
        this.gost3410Spec = lVar;
        if (lVar != null) {
            return;
        }
        throw new IllegalArgumentException("spec is null");
    }

    private boolean compareObj(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.gost3410Spec = new l(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        } else {
            this.gost3410Spec = new l(new ri.n((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
            objectInputStream.readObject();
            objectInputStream.readObject();
        }
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        Object obj;
        objectOutputStream.defaultWriteObject();
        if (this.gost3410Spec.b() != null) {
            obj = this.gost3410Spec.b();
        } else {
            objectOutputStream.writeObject(null);
            objectOutputStream.writeObject(this.gost3410Spec.a().b());
            objectOutputStream.writeObject(this.gost3410Spec.a().c());
            obj = this.gost3410Spec.a().a();
        }
        objectOutputStream.writeObject(obj);
        objectOutputStream.writeObject(this.gost3410Spec.c());
        objectOutputStream.writeObject(this.gost3410Spec.d());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return getX().equals(iVar.getX()) && getParameters().a().equals(iVar.getParameters().a()) && getParameters().c().equals(iVar.getParameters().c()) && compareObj(getParameters().d(), iVar.getParameters().d());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GOST3410";
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
        byte[] byteArray = getX().toByteArray();
        byte[] bArr = new byte[byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length];
        for (int i10 = 0; i10 != bArr.length; i10++) {
            bArr[i10] = byteArray[(byteArray.length - 1) - i10];
        }
        try {
            return (this.gost3410Spec instanceof l ? new s(new b(a.f16028l, new f(new v(this.gost3410Spec.b()), new v(this.gost3410Spec.c()))), new t1(bArr)) : new s(new b(a.f16028l), new t1(bArr))).k("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // qi.g
    public h getParameters() {
        return this.gost3410Spec;
    }

    @Override // qi.i
    public BigInteger getX() {
        return this.f18684x;
    }

    public int hashCode() {
        return getX().hashCode() ^ this.gost3410Spec.hashCode();
    }

    @Override // qi.n
    public void setBagAttribute(v vVar, g gVar) {
        this.attrCarrier.setBagAttribute(vVar, gVar);
    }

    public String toString() {
        try {
            return GOSTUtil.privateKeyToString("GOST3410", this.f18684x, ((u0) GOST3410Util.generatePrivateKeyParameter(this)).b());
        } catch (InvalidKeyException e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }
}
