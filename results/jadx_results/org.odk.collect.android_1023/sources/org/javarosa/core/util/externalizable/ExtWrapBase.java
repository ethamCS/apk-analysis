package org.javarosa.core.util.externalizable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public class ExtWrapBase extends ExternalizableWrapper {
    public Class type;

    public ExtWrapBase(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        if (obj instanceof ExternalizableWrapper) {
            throw new IllegalArgumentException("ExtWrapBase can only contain base types");
        }
        this.val = obj;
    }

    public ExtWrapBase(Class cls) {
        if (cls == null) {
            throw new NullPointerException();
        }
        if (ExternalizableWrapper.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("ExtWrapBase can only contain base types");
        }
        this.type = cls;
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public ExternalizableWrapper clone(Object obj) {
        return new ExtWrapBase(obj);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.val = ExtUtil.read(dataInputStream, this.type, prototypeFactory);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, this.val);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaReadExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) {
        throw new RuntimeException("Identity wrapper should never be tagged");
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaWriteExternal(DataOutputStream dataOutputStream) {
        throw new RuntimeException("Identity wrapper should never be tagged");
    }
}
