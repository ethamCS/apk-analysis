package org.javarosa.core.services.transport.payload;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class ByteArrayPayload implements IDataPayload {
    String id;
    byte[] payload;
    int type;

    public ByteArrayPayload() {
    }

    public ByteArrayPayload(byte[] bArr, String str, int i) {
        this.payload = bArr;
        this.id = str;
        this.type = i;
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public InputStream getPayloadStream() {
        return new ByteArrayInputStream(this.payload);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        int readInt = dataInputStream.readInt();
        if (readInt > 0) {
            this.payload = new byte[readInt];
            dataInputStream.read(this.payload);
        }
        this.id = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.payload.length);
        if (this.payload.length > 0) {
            dataOutputStream.write(this.payload);
        }
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.id));
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public Object accept(IDataPayloadVisitor iDataPayloadVisitor) {
        return iDataPayloadVisitor.visit(this);
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public String getPayloadId() {
        return this.id;
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public int getPayloadType() {
        return this.type;
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public long getLength() {
        return this.payload.length;
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public int getTransportId() {
        return -1;
    }
}
