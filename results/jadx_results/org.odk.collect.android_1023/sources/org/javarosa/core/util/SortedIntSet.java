package org.javarosa.core.util;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapList;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class SortedIntSet implements Externalizable {
    Vector v = new Vector();

    public int add(int i) {
        int indexOf = indexOf(i, false);
        if (indexOf == -1 || get(indexOf) != i) {
            this.v.insertElementAt(new Integer(i), indexOf + 1);
            return indexOf + 1;
        }
        return -1;
    }

    public int remove(int i) {
        int indexOf = indexOf(i, true);
        if (indexOf != -1) {
            this.v.removeElementAt(indexOf);
        }
        return indexOf;
    }

    public int get(int i) {
        return ((Integer) this.v.elementAt(i)).intValue();
    }

    public boolean contains(int i) {
        return indexOf(i, true) != -1;
    }

    public int indexOf(int i, boolean z) {
        int i2 = 0;
        int size = this.v.size() - 1;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int i4 = get(i3);
            if (i4 < i) {
                i2 = i3 + 1;
            } else if (i4 <= i) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        if (z) {
            return -1;
        }
        return i2 - 1;
    }

    public int size() {
        return this.v.size();
    }

    public Vector getVector() {
        return this.v;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.v = (Vector) ExtUtil.read(dataInputStream, new ExtWrapList(Integer.class));
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, new ExtWrapList(this.v));
    }
}
