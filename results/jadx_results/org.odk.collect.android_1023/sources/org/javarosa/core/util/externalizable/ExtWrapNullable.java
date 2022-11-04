package org.javarosa.core.util.externalizable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public class ExtWrapNullable extends ExternalizableWrapper {
    public ExternalizableWrapper type;

    public ExtWrapNullable(Object obj) {
        this.val = obj;
    }

    public ExtWrapNullable() {
    }

    public ExtWrapNullable(Class cls) {
        this.type = new ExtWrapBase(cls);
    }

    public ExtWrapNullable(ExternalizableWrapper externalizableWrapper) {
        if (externalizableWrapper instanceof ExtWrapNullable) {
            throw new IllegalArgumentException("Wrapping nullable with nullable is redundant");
        }
        if (externalizableWrapper != null && externalizableWrapper.isEmpty()) {
            this.type = externalizableWrapper;
        } else {
            this.val = externalizableWrapper;
        }
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public ExternalizableWrapper clone(Object obj) {
        return new ExtWrapNullable(obj);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        if (dataInputStream.readBoolean()) {
            this.val = ExtUtil.read(dataInputStream, this.type, prototypeFactory);
        } else {
            this.val = null;
        }
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        if (this.val != null) {
            dataOutputStream.writeBoolean(true);
            ExtUtil.write(dataOutputStream, this.val);
            return;
        }
        dataOutputStream.writeBoolean(false);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaReadExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.type = ExtWrapTagged.readTag(dataInputStream, prototypeFactory);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaWriteExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtWrapTagged.writeTag(dataOutputStream, this.val == null ? new Object() : this.val);
    }
}
