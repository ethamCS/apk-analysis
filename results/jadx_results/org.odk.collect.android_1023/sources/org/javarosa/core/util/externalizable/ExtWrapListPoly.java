package org.javarosa.core.util.externalizable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
/* loaded from: classes.dex */
public class ExtWrapListPoly extends ExternalizableWrapper {
    public ExtWrapListPoly(Vector vector) {
        if (vector == null) {
            throw new NullPointerException();
        }
        this.val = vector;
    }

    public ExtWrapListPoly() {
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public ExternalizableWrapper clone(Object obj) {
        return new ExtWrapListPoly((Vector) obj);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        Vector vector = new Vector(0);
        long readNumeric = ExtUtil.readNumeric(dataInputStream);
        for (int i = 0; i < readNumeric; i++) {
            vector.addElement(ExtUtil.read(dataInputStream, new ExtWrapTagged(), prototypeFactory));
        }
        this.val = vector;
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        Vector vector = (Vector) this.val;
        ExtUtil.writeNumeric(dataOutputStream, vector.size());
        for (int i = 0; i < vector.size(); i++) {
            ExtUtil.write(dataOutputStream, new ExtWrapTagged(vector.elementAt(i)));
        }
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaReadExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) {
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaWriteExternal(DataOutputStream dataOutputStream) {
    }
}
