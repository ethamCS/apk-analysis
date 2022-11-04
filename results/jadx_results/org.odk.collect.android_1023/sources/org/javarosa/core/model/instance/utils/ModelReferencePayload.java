package org.javarosa.core.model.instance.utils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.utils.IInstanceSerializingVisitor;
import org.javarosa.core.services.storage.IStorageUtility;
import org.javarosa.core.services.storage.StorageManager;
import org.javarosa.core.services.transport.payload.IDataPayload;
import org.javarosa.core.services.transport.payload.IDataPayloadVisitor;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class ModelReferencePayload implements IDataPayload {
    String destination = null;
    IDataPayload payload;
    int recordId;
    IInstanceSerializingVisitor serializer;

    public ModelReferencePayload() {
    }

    public ModelReferencePayload(int i) {
        this.recordId = i;
    }

    public void setSerializer(IInstanceSerializingVisitor iInstanceSerializingVisitor) {
        this.serializer = iInstanceSerializingVisitor;
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public Object accept(IDataPayloadVisitor iDataPayloadVisitor) {
        memoize();
        return this.payload.accept(iDataPayloadVisitor);
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public long getLength() {
        memoize();
        return this.payload.getLength();
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public String getPayloadId() {
        memoize();
        return this.payload.getPayloadId();
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public InputStream getPayloadStream() {
        memoize();
        return this.payload.getPayloadStream();
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public int getPayloadType() {
        memoize();
        return this.payload.getPayloadType();
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.recordId = dataInputStream.readInt();
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.recordId);
    }

    private void memoize() {
        if (this.payload == null) {
            IStorageUtility storage = StorageManager.getStorage(FormInstance.STORAGE_KEY);
            try {
                this.payload = this.serializer.createSerializedPayload((FormInstance) storage.read(this.recordId));
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("ModelReferencePayload failed to retrieve its model from rms [" + e.getMessage() + "]");
            }
        }
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public int getTransportId() {
        return this.recordId;
    }

    public void setDestination(String str) {
        this.destination = str;
    }

    public String getDestination() {
        return this.destination;
    }
}
