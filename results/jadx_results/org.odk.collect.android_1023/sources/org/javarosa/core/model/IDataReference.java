package org.javarosa.core.model;

import org.javarosa.core.util.externalizable.Externalizable;
/* loaded from: classes.dex */
public interface IDataReference extends Externalizable {
    Object getReference();

    void setReference(Object obj);
}
