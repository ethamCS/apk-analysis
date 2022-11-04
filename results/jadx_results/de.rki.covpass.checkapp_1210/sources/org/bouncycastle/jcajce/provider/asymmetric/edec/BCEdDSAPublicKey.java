package org.bouncycastle.jcajce.provider.asymmetric.edec;

import hh.n0;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import ki.b;
import mg.a;
import zh.h0;
import zh.k0;
/* loaded from: classes3.dex */
public class BCEdDSAPublicKey implements b {
    static final long serialVersionUID = 1;
    transient zh.b eddsaPublicKey;

    public BCEdDSAPublicKey(n0 n0Var) {
        populateFromPubKeyInfo(n0Var);
    }

    public BCEdDSAPublicKey(zh.b bVar) {
        this.eddsaPublicKey = bVar;
    }

    public BCEdDSAPublicKey(byte[] bArr, byte[] bArr2) {
        zh.b h0Var;
        int length = bArr.length;
        if (Utils.isValidPrefix(bArr, bArr2)) {
            if (bArr2.length - length == 57) {
                h0Var = new k0(bArr2, length);
            } else if (bArr2.length - length != 32) {
                throw new InvalidKeySpecException("raw key data not recognised");
            } else {
                h0Var = new h0(bArr2, length);
            }
            this.eddsaPublicKey = h0Var;
            return;
        }
        throw new InvalidKeySpecException("raw key data not recognised");
    }

    private void populateFromPubKeyInfo(n0 n0Var) {
        byte[] G = n0Var.o().G();
        this.eddsaPublicKey = a.f16669e.s(n0Var.l().l()) ? new k0(G) : new h0(G);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(n0.n((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public zh.b engineGetKeyParameters() {
        return this.eddsaPublicKey;
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
        return this.eddsaPublicKey instanceof k0 ? "Ed448" : "Ed25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.eddsaPublicKey instanceof k0) {
            byte[] bArr = KeyFactorySpi.Ed448Prefix;
            byte[] bArr2 = new byte[bArr.length + 57];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            ((k0) this.eddsaPublicKey).b(bArr2, bArr.length);
            return bArr2;
        }
        byte[] bArr3 = KeyFactorySpi.Ed25519Prefix;
        byte[] bArr4 = new byte[bArr3.length + 32];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        ((h0) this.eddsaPublicKey).b(bArr4, bArr3.length);
        return bArr4;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // ki.b
    public byte[] getPointEncoding() {
        zh.b bVar = this.eddsaPublicKey;
        return bVar instanceof k0 ? ((k0) bVar).getEncoded() : ((h0) bVar).getEncoded();
    }

    public int hashCode() {
        return ak.a.F(getEncoded());
    }

    public String toString() {
        return Utils.keyToString("Public Key", getAlgorithm(), this.eddsaPublicKey);
    }
}
