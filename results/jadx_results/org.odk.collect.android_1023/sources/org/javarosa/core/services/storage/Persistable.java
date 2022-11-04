package org.javarosa.core.services.storage;

import org.javarosa.core.util.externalizable.Externalizable;
/* loaded from: classes.dex */
public interface Persistable extends Externalizable {
    int getID();

    void setID(int i);
}
