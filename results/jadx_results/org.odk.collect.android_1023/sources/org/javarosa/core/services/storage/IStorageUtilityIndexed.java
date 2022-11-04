package org.javarosa.core.services.storage;

import java.util.NoSuchElementException;
import java.util.Vector;
import org.javarosa.core.util.InvalidIndexException;
import org.javarosa.core.util.externalizable.Externalizable;
/* loaded from: classes.dex */
public interface IStorageUtilityIndexed extends IStorageUtility {
    Vector getIDsForValue(String str, Object obj);

    Externalizable getRecordForValue(String str, Object obj) throws NoSuchElementException, InvalidIndexException;
}
