package org.javarosa.core.model.data.helper;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.javarosa.core.data.IDataPointer;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class BasicDataPointer implements IDataPointer {
    private byte[] data;
    private String name;

    public BasicDataPointer() {
    }

    public BasicDataPointer(String str, byte[] bArr) {
        this.name = str;
        this.data = bArr;
    }

    @Override // org.javarosa.core.data.IDataPointer
    public boolean deleteData() {
        this.data = null;
        return true;
    }

    @Override // org.javarosa.core.data.IDataPointer
    public byte[] getData() {
        return this.data;
    }

    @Override // org.javarosa.core.data.IDataPointer
    public String getDisplayText() {
        return this.name;
    }

    @Override // org.javarosa.core.data.IDataPointer
    public InputStream getDataStream() {
        return new ByteArrayInputStream(this.data);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        int readInt = dataInputStream.readInt();
        if (readInt != -1) {
            this.data = new byte[readInt];
            dataInputStream.read(this.data);
        }
        this.name = ExtUtil.readString(dataInputStream);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        if (this.data == null || this.data.length < 0) {
            dataOutputStream.writeInt(-1);
        } else {
            dataOutputStream.writeInt(this.data.length);
            dataOutputStream.write(this.data);
        }
        ExtUtil.writeString(dataOutputStream, this.name);
    }

    @Override // org.javarosa.core.data.IDataPointer
    public long getLength() {
        return this.data.length;
    }
}
