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
import ki.c;
import mg.a;
import zg.s;
import zh.b;
import zh.s1;
import zh.v1;
/* loaded from: classes3.dex */
public class BCXDHPrivateKey implements Key, PrivateKey {
    static final long serialVersionUID = 1;
    private final byte[] attributes;
    private final boolean hasPublicKey;
    transient b xdhPrivateKey;

    public BCXDHPrivateKey(s sVar) {
        this.hasPublicKey = sVar.s();
        this.attributes = sVar.l() != null ? sVar.l().getEncoded() : null;
        populateFromPrivateKeyInfo(sVar);
    }

    public BCXDHPrivateKey(b bVar) {
        this.hasPublicKey = true;
        this.attributes = null;
        this.xdhPrivateKey = bVar;
    }

    private void populateFromPrivateKeyInfo(s sVar) {
        byte[] F = sVar.n().F();
        if (F.length != 32 && F.length != 56) {
            F = w.E(sVar.u()).F();
        }
        this.xdhPrivateKey = a.f16667c.s(sVar.o().l()) ? new v1(F) : new s1(F);
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
        return this.xdhPrivateKey;
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
        return this.xdhPrivateKey instanceof v1 ? "X448" : "X25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            e0 E = e0.E(this.attributes);
            s b10 = f.b(this.xdhPrivateKey, E);
            return (!this.hasPublicKey || m.c("org.bouncycastle.pkcs8.v1_info_only")) ? new s(b10.o(), b10.u(), E).getEncoded() : b10.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public c getPublicKey() {
        b bVar = this.xdhPrivateKey;
        return bVar instanceof v1 ? new BCXDHPublicKey(((v1) bVar).b()) : new BCXDHPublicKey(((s1) bVar).b());
    }

    public int hashCode() {
        return ak.a.F(getEncoded());
    }

    public String toString() {
        b bVar = this.xdhPrivateKey;
        return Utils.keyToString("Private Key", getAlgorithm(), bVar instanceof v1 ? ((v1) bVar).b() : ((s1) bVar).b());
    }
}
