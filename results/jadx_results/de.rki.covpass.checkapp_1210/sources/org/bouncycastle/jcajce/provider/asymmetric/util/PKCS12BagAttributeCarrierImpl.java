package org.bouncycastle.jcajce.provider.asymmetric.util;

import gg.g;
import gg.p;
import gg.v;
import gg.y;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import qi.n;
/* loaded from: classes3.dex */
public class PKCS12BagAttributeCarrierImpl implements n {
    private Hashtable pkcs12Attributes;
    private Vector pkcs12Ordering;

    public PKCS12BagAttributeCarrierImpl() {
        this(new Hashtable(), new Vector());
    }

    PKCS12BagAttributeCarrierImpl(Hashtable hashtable, Vector vector) {
        this.pkcs12Attributes = hashtable;
        this.pkcs12Ordering = vector;
    }

    Hashtable getAttributes() {
        return this.pkcs12Attributes;
    }

    @Override // qi.n
    public g getBagAttribute(v vVar) {
        return (g) this.pkcs12Attributes.get(vVar);
    }

    @Override // qi.n
    public Enumeration getBagAttributeKeys() {
        return this.pkcs12Ordering.elements();
    }

    Vector getOrdering() {
        return this.pkcs12Ordering;
    }

    public void readObject(ObjectInputStream objectInputStream) {
        Object readObject = objectInputStream.readObject();
        if (readObject instanceof Hashtable) {
            this.pkcs12Attributes = (Hashtable) readObject;
            this.pkcs12Ordering = (Vector) objectInputStream.readObject();
            return;
        }
        p pVar = new p((byte[]) readObject);
        while (true) {
            v vVar = (v) pVar.s();
            if (vVar == null) {
                return;
            }
            setBagAttribute(vVar, pVar.s());
        }
    }

    @Override // qi.n
    public void setBagAttribute(v vVar, g gVar) {
        if (this.pkcs12Attributes.containsKey(vVar)) {
            this.pkcs12Attributes.put(vVar, gVar);
            return;
        }
        this.pkcs12Attributes.put(vVar, gVar);
        this.pkcs12Ordering.addElement(vVar);
    }

    int size() {
        return this.pkcs12Ordering.size();
    }

    public void writeObject(ObjectOutputStream objectOutputStream) {
        if (this.pkcs12Ordering.size() == 0) {
            objectOutputStream.writeObject(new Hashtable());
            objectOutputStream.writeObject(new Vector());
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        y a10 = y.a(byteArrayOutputStream);
        Enumeration bagAttributeKeys = getBagAttributeKeys();
        while (bagAttributeKeys.hasMoreElements()) {
            v K = v.K(bagAttributeKeys.nextElement());
            a10.v(K);
            a10.u((g) this.pkcs12Attributes.get(K));
        }
        objectOutputStream.writeObject(byteArrayOutputStream.toByteArray());
    }
}
