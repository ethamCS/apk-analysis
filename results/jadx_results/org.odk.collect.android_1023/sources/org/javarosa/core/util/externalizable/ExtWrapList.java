package org.javarosa.core.util.externalizable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
/* loaded from: classes.dex */
public class ExtWrapList extends ExternalizableWrapper {
    public ExternalizableWrapper type;

    public ExtWrapList(Vector vector) {
        this(vector, null);
    }

    public ExtWrapList(Vector vector, ExternalizableWrapper externalizableWrapper) {
        if (vector == null) {
            throw new NullPointerException();
        }
        this.val = vector;
        this.type = externalizableWrapper;
    }

    public ExtWrapList() {
    }

    public ExtWrapList(Class cls) {
        this.type = new ExtWrapBase(cls);
    }

    public ExtWrapList(ExternalizableWrapper externalizableWrapper) {
        if (externalizableWrapper == null) {
            throw new NullPointerException();
        }
        this.type = externalizableWrapper;
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public ExternalizableWrapper clone(Object obj) {
        return new ExtWrapList((Vector) obj, this.type);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        Vector vector = new Vector(0);
        long readNumeric = ExtUtil.readNumeric(dataInputStream);
        for (int i = 0; i < readNumeric; i++) {
            vector.addElement(ExtUtil.read(dataInputStream, this.type, prototypeFactory));
        }
        this.val = vector;
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        Vector vector = (Vector) this.val;
        ExtUtil.writeNumeric(dataOutputStream, vector.size());
        for (int i = 0; i < vector.size(); i++) {
            ExtUtil.write(dataOutputStream, this.type == null ? vector.elementAt(i) : this.type.clone(vector.elementAt(i)));
        }
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaReadExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.type = ExtWrapTagged.readTag(dataInputStream, prototypeFactory);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaWriteExternal(DataOutputStream dataOutputStream) throws IOException {
        Object obj;
        Vector vector = (Vector) this.val;
        if (this.type == null) {
            if (vector.size() == 0) {
                obj = new Object();
            } else {
                obj = vector.elementAt(0);
            }
        } else {
            obj = this.type;
        }
        ExtWrapTagged.writeTag(dataOutputStream, obj);
    }
}
