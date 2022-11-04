package org.javarosa.core.util.externalizable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class ExternalizableWrapper implements Externalizable {
    public Object val;

    public abstract ExternalizableWrapper clone(Object obj);

    public abstract void metaReadExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException;

    public abstract void metaWriteExternal(DataOutputStream dataOutputStream) throws IOException;

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public abstract void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException;

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public abstract void writeExternal(DataOutputStream dataOutputStream) throws IOException;

    public Object baseValue() {
        Object obj = this.val;
        while (obj instanceof ExternalizableWrapper) {
            obj = ((ExternalizableWrapper) obj).val;
        }
        return obj;
    }

    public boolean isEmpty() {
        return baseValue() == null;
    }
}
