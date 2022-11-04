package org.bouncycastle.jcajce.provider.asymmetric.edec;

import hh.n0;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import ki.c;
import mg.a;
import zh.b;
import zh.t1;
import zh.w1;
/* loaded from: classes3.dex */
public class BCXDHPublicKey implements c {
    static final long serialVersionUID = 1;
    transient b xdhPublicKey;

    public BCXDHPublicKey(n0 n0Var) {
        populateFromPubKeyInfo(n0Var);
    }

    public BCXDHPublicKey(b bVar) {
        this.xdhPublicKey = bVar;
    }

    public BCXDHPublicKey(byte[] bArr, byte[] bArr2) {
        b t1Var;
        int length = bArr.length;
        if (Utils.isValidPrefix(bArr, bArr2)) {
            if (bArr2.length - length == 56) {
                t1Var = new w1(bArr2, length);
            } else if (bArr2.length - length != 32) {
                throw new InvalidKeySpecException("raw key data not recognised");
            } else {
                t1Var = new t1(bArr2, length);
            }
            this.xdhPublicKey = t1Var;
            return;
        }
        throw new InvalidKeySpecException("raw key data not recognised");
    }

    private void populateFromPubKeyInfo(n0 n0Var) {
        byte[] G = n0Var.o().G();
        this.xdhPublicKey = a.f16667c.s(n0Var.l().l()) ? new w1(G) : new t1(G);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(n0.n((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public b engineGetKeyParameters() {
        return this.xdhPublicKey;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PublicKey) {
            return ak.a.c(((PublicKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.xdhPublicKey instanceof w1 ? "X448" : "X25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.xdhPublicKey instanceof w1) {
            byte[] bArr = KeyFactorySpi.x448Prefix;
            byte[] bArr2 = new byte[bArr.length + 56];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            ((w1) this.xdhPublicKey).b(bArr2, bArr.length);
            return bArr2;
        }
        byte[] bArr3 = KeyFactorySpi.x25519Prefix;
        byte[] bArr4 = new byte[bArr3.length + 32];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        ((t1) this.xdhPublicKey).b(bArr4, bArr3.length);
        return bArr4;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public BigInteger getU() {
        byte[] uEncoding = getUEncoding();
        ak.a.R(uEncoding);
        return new BigInteger(1, uEncoding);
    }

    @Override // ki.c
    public byte[] getUEncoding() {
        b bVar = this.xdhPublicKey;
        return bVar instanceof w1 ? ((w1) bVar).getEncoded() : ((t1) bVar).getEncoded();
    }

    public int hashCode() {
        return ak.a.F(getEncoded());
    }

    public String toString() {
        return Utils.keyToString("Public Key", getAlgorithm(), this.xdhPublicKey);
    }
}
