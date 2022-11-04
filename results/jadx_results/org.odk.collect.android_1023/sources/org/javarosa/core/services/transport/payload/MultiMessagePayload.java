package org.javarosa.core.services.transport.payload;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Vector;
import org.javarosa.core.util.MultiInputStream;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapListPoly;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class MultiMessagePayload implements IDataPayload {
    Vector payloads = new Vector();

    public void addPayload(IDataPayload iDataPayload) {
        this.payloads.addElement(iDataPayload);
    }

    public Vector getPayloads() {
        return this.payloads;
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public InputStream getPayloadStream() {
        MultiInputStream multiInputStream = new MultiInputStream();
        Enumeration elements = this.payloads.elements();
        while (elements.hasMoreElements()) {
            multiInputStream.addStream(((IDataPayload) elements.nextElement()).getPayloadStream());
        }
        multiInputStream.prepare();
        return multiInputStream;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.payloads = (Vector) ExtUtil.read(dataInputStream, new ExtWrapListPoly(), prototypeFactory);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, new ExtWrapListPoly(this.payloads));
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public Object accept(IDataPayloadVisitor iDataPayloadVisitor) {
        return iDataPayloadVisitor.visit(this);
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public String getPayloadId() {
        return null;
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public int getPayloadType() {
        return 4;
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public int getTransportId() {
        return -1;
    }

    @Override // org.javarosa.core.services.transport.payload.IDataPayload
    public long getLength() {
        int i = 0;
        Enumeration elements = this.payloads.elements();
        while (true) {
            int i2 = i;
            if (elements.hasMoreElements()) {
                i = (int) (((IDataPayload) elements.nextElement()).getLength() + i2);
            } else {
                return i2;
            }
        }
    }
}
