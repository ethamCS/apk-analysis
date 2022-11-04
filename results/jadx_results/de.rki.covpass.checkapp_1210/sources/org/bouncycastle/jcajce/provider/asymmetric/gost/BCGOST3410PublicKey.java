package org.bouncycastle.jcajce.provider.asymmetric.gost;

import gg.t1;
import gg.v;
import hh.b;
import hh.n0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import lg.a;
import lg.f;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import qi.h;
import qi.j;
import ri.l;
import ri.n;
import ri.o;
import zh.v0;
/* loaded from: classes3.dex */
public class BCGOST3410PublicKey implements j {
    static final long serialVersionUID = -6251023343619275990L;
    private transient h gost3410Spec;

    /* renamed from: y */
    private BigInteger f18685y;

    public BCGOST3410PublicKey(n0 n0Var) {
        f n10 = f.n(n0Var.l().o());
        try {
            byte[] F = ((t1) n0Var.q()).F();
            byte[] bArr = new byte[F.length];
            for (int i10 = 0; i10 != F.length; i10++) {
                bArr[i10] = F[(F.length - 1) - i10];
            }
            this.f18685y = new BigInteger(1, bArr);
            this.gost3410Spec = l.e(n10);
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in GOST3410 public key");
        }
    }

    BCGOST3410PublicKey(BigInteger bigInteger, l lVar) {
        this.f18685y = bigInteger;
        this.gost3410Spec = lVar;
    }

    public BCGOST3410PublicKey(j jVar) {
        this.f18685y = jVar.getY();
        this.gost3410Spec = jVar.getParameters();
    }

    public BCGOST3410PublicKey(o oVar) {
        this.f18685y = oVar.d();
        this.gost3410Spec = new l(new n(oVar.b(), oVar.c(), oVar.a()));
    }

    public BCGOST3410PublicKey(v0 v0Var, l lVar) {
        this.f18685y = v0Var.c();
        this.gost3410Spec = lVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.gost3410Spec = new l(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
            return;
        }
        this.gost3410Spec = new l(new n((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
        objectInputStream.readObject();
        objectInputStream.readObject();
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
        if (obj instanceof BCGOST3410PublicKey) {
            BCGOST3410PublicKey bCGOST3410PublicKey = (BCGOST3410PublicKey) obj;
            return this.f18685y.equals(bCGOST3410PublicKey.f18685y) && this.gost3410Spec.equals(bCGOST3410PublicKey.gost3410Spec);
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GOST3410";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] byteArray = getY().toByteArray();
        byte[] bArr = new byte[byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length];
        for (int i10 = 0; i10 != bArr.length; i10++) {
            bArr[i10] = byteArray[(byteArray.length - 1) - i10];
        }
        try {
            h hVar = this.gost3410Spec;
            return KeyUtil.getEncodedSubjectPublicKeyInfo(hVar instanceof l ? hVar.d() != null ? new n0(new b(a.f16028l, new f(new v(this.gost3410Spec.b()), new v(this.gost3410Spec.c()), new v(this.gost3410Spec.d()))), new t1(bArr)) : new n0(new b(a.f16028l, new f(new v(this.gost3410Spec.b()), new v(this.gost3410Spec.c()))), new t1(bArr)) : new n0(new b(a.f16028l), new t1(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // qi.g
    public h getParameters() {
        return this.gost3410Spec;
    }

    @Override // qi.j
    public BigInteger getY() {
        return this.f18685y;
    }

    public int hashCode() {
        return this.f18685y.hashCode() ^ this.gost3410Spec.hashCode();
    }

    public String toString() {
        try {
            return GOSTUtil.publicKeyToString("GOST3410", this.f18685y, ((v0) GOST3410Util.generatePublicKeyParameter(this)).b());
        } catch (InvalidKeyException e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }
}
