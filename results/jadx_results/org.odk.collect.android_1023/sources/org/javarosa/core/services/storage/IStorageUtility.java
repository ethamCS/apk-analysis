package org.javarosa.core.services.storage;

import java.util.Vector;
import org.javarosa.core.util.externalizable.Externalizable;
/* loaded from: classes.dex */
public interface IStorageUtility {
    int add(Externalizable externalizable) throws StorageFullException;

    void close();

    void destroy();

    boolean exists(int i);

    Object getAccessLock();

    int getNumRecords();

    int getRecordSize(int i);

    int getTotalSize();

    boolean isEmpty();

    IStorageIterator iterate();

    Externalizable read(int i);

    byte[] readBytes(int i);

    void remove(int i);

    void remove(Persistable persistable);

    Vector<Integer> removeAll(EntityFilter entityFilter);

    void removeAll();

    void repack();

    void repair();

    void update(int i, Externalizable externalizable) throws StorageFullException;

    void write(Persistable persistable) throws StorageFullException;
}
