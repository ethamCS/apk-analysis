package org.bouncycastle.jcajce.provider.asymmetric.edec;

import ak.m;
import ei.f;
import gg.e0;
import gg.w;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import mg.a;
import zg.s;
import zh.b;
import zh.g0;
import zh.j0;
/* loaded from: classes3.dex */
public class BCEdDSAPrivateKey implements Key, PrivateKey {
    static final long serialVersionUID = 1;
    private final byte[] attributes;
    transient b eddsaPrivateKey;
    private final boolean hasPublicKey;

    public BCEdDSAPrivateKey(s sVar) {
        this.hasPublicKey = sVar.s();
        this.attributes = sVar.l() != null ? sVar.l().getEncoded() : null;
        populateFromPrivateKeyInfo(sVar);
    }

    public BCEdDSAPrivateKey(b bVar) {
        this.hasPublicKey = true;
        this.attributes = null;
        this.eddsaPrivateKey = bVar;
    }

    private void populateFromPrivateKeyInfo(s sVar) {
        byte[] F = w.E(sVar.u()).F();
        this.eddsaPrivateKey = a.f16669e.s(sVar.o().l()) ? new j0(F) : new g0(F);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        populateFromPrivateKeyInfo(s.m((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public b engineGetKeyParameters() {
        return this.eddsaPrivateKey;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PrivateKey) {
            return ak.a.c(((PrivateKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.eddsaPrivateKey instanceof j0 ? "Ed448" : "Ed25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            e0 E = e0.E(this.attributes);
            s b10 = f.b(this.eddsaPrivateKey, E);
            return (!this.hasPublicKey || m.c("org.bouncycastle.pkcs8.v1_info_only")) ? new s(b10.o(), b10.u(), E).getEncoded() : b10.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public ki.b getPublicKey() {
        b bVar = this.eddsaPrivateKey;
        return bVar instanceof j0 ? new BCEdDSAPublicKey(((j0) bVar).b()) : new BCEdDSAPublicKey(((g0) bVar).b());
    }

    public int hashCode() {
        return ak.a.F(getEncoded());
    }

    public String toString() {
        b bVar = this.eddsaPrivateKey;
        return Utils.keyToString("Private Key", getAlgorithm(), bVar instanceof j0 ? ((j0) bVar).b() : ((g0) bVar).b());
    }
}
