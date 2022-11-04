package org.javarosa.core.services.storage;

import java.util.NoSuchElementException;
import java.util.Vector;
import org.javarosa.core.util.InvalidIndexException;
import org.javarosa.core.util.externalizable.Externalizable;
/* loaded from: classes.dex */
public class WrappingStorageUtility implements IStorageUtilityIndexed {
    IStorageUtility storage;
    SerializationWrapper wrapper;

    /* loaded from: classes.dex */
    public interface SerializationWrapper extends Externalizable {
        Class baseType();

        Externalizable getData();

        void setData(Externalizable externalizable);
    }

    public WrappingStorageUtility(String str, SerializationWrapper serializationWrapper, IStorageFactory iStorageFactory) {
        this.storage = iStorageFactory.newStorage(str, serializationWrapper.getClass());
        this.wrapper = serializationWrapper;
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public Externalizable read(int i) {
        return ((SerializationWrapper) this.storage.read(i)).getData();
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public void write(Persistable persistable) throws StorageFullException {
        synchronized (this.wrapper) {
            this.wrapper.setData(persistable);
            if (this.wrapper instanceof IMetaData) {
                this.storage.write(new FauxIndexedPersistable(persistable, this.wrapper, (IMetaData) this.wrapper));
            } else {
                this.storage.write(new FauxIndexedPersistable(persistable, this.wrapper));
            }
        }
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public int add(Externalizable externalizable) throws StorageFullException {
        int add;
        synchronized (this.wrapper) {
            this.wrapper.setData(externalizable);
            add = this.storage.add(this.wrapper);
        }
        return add;
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public void update(int i, Externalizable externalizable) throws StorageFullException {
        synchronized (this.wrapper) {
            this.wrapper.setData(externalizable);
            this.storage.update(i, this.wrapper);
        }
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public IStorageIterator iterate() {
        final IStorageIterator iterate = this.storage.iterate();
        return new IStorageIterator() { // from class: org.javarosa.core.services.storage.WrappingStorageUtility.1
            @Override // org.javarosa.core.services.storage.IStorageIterator
            public boolean hasMore() {
                return iterate.hasMore();
            }

            @Override // org.javarosa.core.services.storage.IStorageIterator
            public int nextID() {
                return iterate.nextID();
            }

            @Override // org.javarosa.core.services.storage.IStorageIterator
            public Externalizable nextRecord() {
                return ((SerializationWrapper) iterate.nextRecord()).getData();
            }

            @Override // org.javarosa.core.services.storage.IStorageIterator
            public int numRecords() {
                return iterate.numRecords();
            }

            @Override // org.javarosa.core.services.storage.IStorageIterator
            public int peekID() {
                return iterate.peekID();
            }
        };
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public byte[] readBytes(int i) {
        return this.storage.readBytes(i);
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public void remove(int i) {
        this.storage.remove(i);
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public void remove(Persistable persistable) {
        this.storage.remove(persistable);
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public void removeAll() {
        this.storage.removeAll();
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public Vector<Integer> removeAll(EntityFilter entityFilter) {
        return this.storage.removeAll(entityFilter);
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public boolean exists(int i) {
        return this.storage.exists(i);
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public boolean isEmpty() {
        return this.storage.isEmpty();
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public int getNumRecords() {
        return this.storage.getNumRecords();
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public int getRecordSize(int i) {
        return this.storage.getRecordSize(i);
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public int getTotalSize() {
        return this.storage.getTotalSize();
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public void close() {
        this.storage.close();
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public void destroy() {
        this.storage.destroy();
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public void repack() {
        this.storage.repack();
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public void repair() {
        this.storage.repair();
    }

    @Override // org.javarosa.core.services.storage.IStorageUtility
    public Object getAccessLock() {
        return this.storage.getAccessLock();
    }

    @Override // org.javarosa.core.services.storage.IStorageUtilityIndexed
    public Vector getIDsForValue(String str, Object obj) {
        return indexedStorage().getIDsForValue(str, obj);
    }

    @Override // org.javarosa.core.services.storage.IStorageUtilityIndexed
    public Externalizable getRecordForValue(String str, Object obj) throws NoSuchElementException, InvalidIndexException {
        return ((SerializationWrapper) indexedStorage().getRecordForValue(str, obj)).getData();
    }

    private IStorageUtilityIndexed indexedStorage() {
        if (!(this.storage instanceof IStorageUtilityIndexed)) {
            throw new RuntimeException("WrappingStorageUtility's factory is not of an indexed type, but had indexed operations requested. Please implement storage " + this.storage.getClass().getName() + " as indexed storage");
        }
        return (IStorageUtilityIndexed) this.storage;
    }
}
