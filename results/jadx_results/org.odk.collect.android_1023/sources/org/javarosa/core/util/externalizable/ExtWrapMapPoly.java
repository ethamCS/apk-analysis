package org.javarosa.core.util.externalizable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import org.javarosa.core.util.OrderedHashtable;
/* loaded from: classes.dex */
public class ExtWrapMapPoly extends ExternalizableWrapper {
    public ExternalizableWrapper keyType;
    public boolean ordered;

    public ExtWrapMapPoly(Hashtable hashtable) {
        this(hashtable, (ExternalizableWrapper) null);
    }

    public ExtWrapMapPoly(Hashtable hashtable, ExternalizableWrapper externalizableWrapper) {
        if (hashtable == null) {
            throw new NullPointerException();
        }
        this.val = hashtable;
        this.keyType = externalizableWrapper;
        this.ordered = hashtable instanceof OrderedHashtable;
    }

    public ExtWrapMapPoly() {
    }

    public ExtWrapMapPoly(Class cls) {
        this(cls, false);
    }

    public ExtWrapMapPoly(ExternalizableWrapper externalizableWrapper) {
        this(externalizableWrapper, false);
    }

    public ExtWrapMapPoly(Class cls, boolean z) {
        this(new ExtWrapBase(cls), z);
    }

    public ExtWrapMapPoly(ExternalizableWrapper externalizableWrapper, boolean z) {
        if (externalizableWrapper == null) {
            throw new NullPointerException();
        }
        this.keyType = externalizableWrapper;
        this.ordered = z;
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public ExternalizableWrapper clone(Object obj) {
        return new ExtWrapMapPoly((Hashtable) obj, this.keyType);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        Hashtable orderedHashtable = this.ordered ? new OrderedHashtable() : new Hashtable();
        long readNumeric = ExtUtil.readNumeric(dataInputStream);
        for (int i = 0; i < readNumeric; i++) {
            orderedHashtable.put(ExtUtil.read(dataInputStream, this.keyType, prototypeFactory), ExtUtil.read(dataInputStream, new ExtWrapTagged(), prototypeFactory));
        }
        this.val = orderedHashtable;
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        Hashtable hashtable = (Hashtable) this.val;
        ExtUtil.writeNumeric(dataOutputStream, hashtable.size());
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            Object obj = hashtable.get(nextElement);
            if (this.keyType != null) {
                nextElement = this.keyType.clone(nextElement);
            }
            ExtUtil.write(dataOutputStream, nextElement);
            ExtUtil.write(dataOutputStream, new ExtWrapTagged(obj));
        }
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaReadExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.ordered = ExtUtil.readBool(dataInputStream);
        this.keyType = ExtWrapTagged.readTag(dataInputStream, prototypeFactory);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaWriteExternal(DataOutputStream dataOutputStream) throws IOException {
        Object obj;
        Hashtable hashtable = (Hashtable) this.val;
        ExtUtil.writeBool(dataOutputStream, this.ordered);
        if (this.keyType == null) {
            obj = hashtable.size() == 0 ? new Object() : hashtable.keys().nextElement();
        } else {
            obj = this.keyType;
        }
        ExtWrapTagged.writeTag(dataOutputStream, obj);
    }
}
