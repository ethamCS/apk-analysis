package org.javarosa.core.services.storage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.javarosa.core.services.storage.WrappingStorageUtility;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class FauxIndexedPersistable implements Persistable, IMetaData {
    IMetaData m;
    Persistable p;
    WrappingStorageUtility.SerializationWrapper w;

    public FauxIndexedPersistable(Persistable persistable, WrappingStorageUtility.SerializationWrapper serializationWrapper) {
        this.p = persistable;
        this.w = serializationWrapper;
        this.m = null;
    }

    public FauxIndexedPersistable(Persistable persistable, WrappingStorageUtility.SerializationWrapper serializationWrapper, IMetaData iMetaData) {
        this.p = persistable;
        this.w = serializationWrapper;
        this.m = iMetaData;
    }

    @Override // org.javarosa.core.services.storage.Persistable
    public int getID() {
        return this.p.getID();
    }

    @Override // org.javarosa.core.services.storage.Persistable
    public void setID(int i) {
        this.p.setID(i);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.w.readExternal(dataInputStream, prototypeFactory);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        this.w.writeExternal(dataOutputStream);
    }

    @Override // org.javarosa.core.services.storage.IMetaData
    public Hashtable getMetaData() {
        if (this.m != null) {
            return this.m.getMetaData();
        }
        throw new RuntimeException("Attempt to index unindexible " + this.p.getClass().getName());
    }

    @Override // org.javarosa.core.services.storage.IMetaData
    public Object getMetaData(String str) {
        if (this.m != null) {
            return this.m.getMetaData(str);
        }
        throw new RuntimeException("Attempt to index unindexible " + this.p.getClass().getName());
    }

    @Override // org.javarosa.core.services.storage.IMetaData
    public String[] getMetaDataFields() {
        if (this.m != null) {
            return this.m.getMetaDataFields();
        }
        throw new RuntimeException("Attempt to index unindexible " + this.p.getClass().getName());
    }
}
