package org.javarosa.core.util.externalizable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public class ExtWrapIntEncodingUniform extends ExtWrapIntEncoding {
    public ExtWrapIntEncodingUniform(long j) {
        this.val = new Long(j);
    }

    public ExtWrapIntEncodingUniform() {
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public ExternalizableWrapper clone(Object obj) {
        return new ExtWrapIntEncodingUniform(ExtUtil.toLong(obj));
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException {
        byte readByte;
        long j = 0;
        boolean z = true;
        do {
            readByte = dataInputStream.readByte();
            if (z) {
                j = ((readByte >> 6) & 1) == 0 ? 0 : -1;
                z = false;
            }
            j = (j << 7) | (readByte & Byte.MAX_VALUE);
        } while (((readByte >> 7) & 1) == 1);
        this.val = new Long(j);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        long longValue = ((Long) this.val).longValue();
        int i = -1;
        while (true) {
            i++;
            long j = longValue >> (i * 7);
            if (j >= -64 && j <= 63) {
                break;
            }
        }
        int i2 = i;
        while (i2 >= 0) {
            dataOutputStream.writeByte((i2 > 0 ? (byte) 128 : (byte) 0) | ((byte) ((longValue >> (i2 * 7)) & 127)));
            i2--;
        }
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaReadExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) {
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaWriteExternal(DataOutputStream dataOutputStream) {
    }
}
