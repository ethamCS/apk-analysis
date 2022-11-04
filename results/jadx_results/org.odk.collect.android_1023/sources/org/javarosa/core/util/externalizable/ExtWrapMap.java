package org.javarosa.core.util.externalizable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import org.javarosa.core.util.OrderedHashtable;
/* loaded from: classes.dex */
public class ExtWrapMap extends ExternalizableWrapper {
    public ExternalizableWrapper dataType;
    public ExternalizableWrapper keyType;
    public boolean ordered;

    public ExtWrapMap(Hashtable hashtable) {
        this(hashtable, (ExternalizableWrapper) null, (ExternalizableWrapper) null);
    }

    public ExtWrapMap(Hashtable hashtable, ExternalizableWrapper externalizableWrapper) {
        this(hashtable, (ExternalizableWrapper) null, externalizableWrapper);
    }

    public ExtWrapMap(Hashtable hashtable, ExternalizableWrapper externalizableWrapper, ExternalizableWrapper externalizableWrapper2) {
        if (hashtable == null) {
            throw new NullPointerException();
        }
        this.val = hashtable;
        this.keyType = externalizableWrapper;
        this.dataType = externalizableWrapper2;
        this.ordered = hashtable instanceof OrderedHashtable;
    }

    public ExtWrapMap() {
    }

    public ExtWrapMap(Class cls, Class cls2) {
        this(cls, cls2, false);
    }

    public ExtWrapMap(Class cls, ExternalizableWrapper externalizableWrapper) {
        this(cls, externalizableWrapper, false);
    }

    public ExtWrapMap(ExternalizableWrapper externalizableWrapper, ExternalizableWrapper externalizableWrapper2) {
        this(externalizableWrapper, externalizableWrapper2, false);
    }

    public ExtWrapMap(Class cls, Class cls2, boolean z) {
        this(new ExtWrapBase(cls), new ExtWrapBase(cls2), z);
    }

    public ExtWrapMap(Class cls, ExternalizableWrapper externalizableWrapper, boolean z) {
        this(new ExtWrapBase(cls), externalizableWrapper, z);
    }

    public ExtWrapMap(ExternalizableWrapper externalizableWrapper, ExternalizableWrapper externalizableWrapper2, boolean z) {
        if (externalizableWrapper == null || externalizableWrapper2 == null) {
            throw new NullPointerException();
        }
        this.keyType = externalizableWrapper;
        this.dataType = externalizableWrapper2;
        this.ordered = z;
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public ExternalizableWrapper clone(Object obj) {
        return new ExtWrapMap((Hashtable) obj, this.keyType, this.dataType);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        Hashtable orderedHashtable = this.ordered ? new OrderedHashtable() : new Hashtable();
        long readNumeric = ExtUtil.readNumeric(dataInputStream);
        for (int i = 0; i < readNumeric; i++) {
            orderedHashtable.put(ExtUtil.read(dataInputStream, this.keyType, prototypeFactory), ExtUtil.read(dataInputStream, this.dataType, prototypeFactory));
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
            ExtUtil.write(dataOutputStream, this.dataType == null ? obj : this.dataType.clone(obj));
        }
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaReadExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.ordered = ExtUtil.readBool(dataInputStream);
        this.keyType = ExtWrapTagged.readTag(dataInputStream, prototypeFactory);
        this.dataType = ExtWrapTagged.readTag(dataInputStream, prototypeFactory);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaWriteExternal(DataOutputStream dataOutputStream) throws IOException {
        Object obj;
        Object obj2;
        Hashtable hashtable = (Hashtable) this.val;
        if (this.keyType == null) {
            obj = hashtable.size() == 0 ? new Object() : hashtable.keys().nextElement();
        } else {
            obj = this.keyType;
        }
        if (this.dataType == null) {
            obj2 = hashtable.size() == 0 ? new Object() : hashtable.elements().nextElement();
        } else {
            obj2 = this.dataType;
        }
        ExtUtil.writeBool(dataOutputStream, this.ordered);
        ExtWrapTagged.writeTag(dataOutputStream, obj);
        ExtWrapTagged.writeTag(dataOutputStream, obj2);
    }
}
