package org.javarosa.core.services.storage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.services.storage.WrappingStorageUtility;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapTagged;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class TaggedSerializationWrapper implements WrappingStorageUtility.SerializationWrapper {
    Externalizable e;

    @Override // org.javarosa.core.services.storage.WrappingStorageUtility.SerializationWrapper
    public Class baseType() {
        return Externalizable.class;
    }

    @Override // org.javarosa.core.services.storage.WrappingStorageUtility.SerializationWrapper
    public Externalizable getData() {
        return this.e;
    }

    @Override // org.javarosa.core.services.storage.WrappingStorageUtility.SerializationWrapper
    public void setData(Externalizable externalizable) {
        this.e = externalizable;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.e = (Externalizable) ExtUtil.read(dataInputStream, new ExtWrapTagged());
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, new ExtWrapTagged(this.e));
    }
}
