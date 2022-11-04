package org.javarosa.core.services.storage;

import org.javarosa.core.util.externalizable.Externalizable;
/* loaded from: classes.dex */
public interface IStorageIterator {
    boolean hasMore();

    int nextID();

    Externalizable nextRecord();

    int numRecords();

    int peekID();
}
