package org.javarosa.core.services.transport.payload;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.javarosa.core.data.IDataPointer;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapTagged;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class DataPointerPayload implements IDataPayload {
    IDataPointer pointer;

    public DataPointerPayload() {
    }

    public DataPointerPayload(IDataPointer iDataPointer) {
        this.pointer = iDataPointer;
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public Object accept(IDataPayloadVisitor iDataPayloadVisitor) {
        return iDataPayloadVisitor.visit(this);
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public long getLength() {
        return this.pointer.getLength();
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public String getPayloadId() {
        return this.pointer.getDisplayText();
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public InputStream getPayloadStream() {
        return this.pointer.getDataStream();
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public int getPayloadType() {
        return 2;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.pointer = (IDataPointer) ExtUtil.read(dataInputStream, new ExtWrapTagged());
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, new ExtWrapTagged(this.pointer));
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public int getTransportId() {
        return -1;
    }
}
