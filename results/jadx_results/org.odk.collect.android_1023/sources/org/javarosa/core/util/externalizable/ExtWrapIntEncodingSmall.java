package org.javarosa.core.util.externalizable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.odk.collect.android.utilities.EncryptionUtils;
/* loaded from: classes.dex */
public class ExtWrapIntEncodingSmall extends ExtWrapIntEncoding {
    public static final int DEFAULT_BIAS = 1;
    public int bias;

    public ExtWrapIntEncodingSmall(long j) {
        this(j, 1);
    }

    public ExtWrapIntEncodingSmall(long j, int i) {
        this.val = new Long(j);
        this.bias = i;
    }

    public ExtWrapIntEncodingSmall() {
        this((Object) null, 1);
    }

    public ExtWrapIntEncodingSmall(Object obj, int i) {
        this.bias = i;
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public ExternalizableWrapper clone(Object obj) {
        return new ExtWrapIntEncodingSmall(ExtUtil.toLong(obj), this.bias);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException {
        long j;
        int readByte = dataInputStream.readByte();
        if (readByte == -1) {
            j = dataInputStream.readInt();
        } else {
            if (readByte < 0) {
                readByte += EncryptionUtils.SYMMETRIC_KEY_LENGTH;
            }
            j = readByte - this.bias;
        }
        this.val = new Long(j);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper, org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        int i = ExtUtil.toInt(((Long) this.val).longValue());
        if (i >= (-this.bias) && i < 255 - this.bias) {
            int i2 = i + this.bias;
            if (i2 >= 128) {
                i2 -= 256;
            }
            dataOutputStream.writeByte((byte) i2);
            return;
        }
        dataOutputStream.writeByte(255);
        dataOutputStream.writeInt(i);
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaReadExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException {
        this.bias = dataInputStream.readUnsignedByte();
    }

    @Override // org.javarosa.core.util.externalizable.ExternalizableWrapper
    public void metaWriteExternal(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte((byte) this.bias);
    }
}
