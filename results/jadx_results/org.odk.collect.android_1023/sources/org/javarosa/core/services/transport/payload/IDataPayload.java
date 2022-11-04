package org.javarosa.core.services.transport.payload;

import java.io.InputStream;
import org.javarosa.core.util.externalizable.Externalizable;
/* loaded from: classes.dex */
public interface IDataPayload extends Externalizable {
    public static final int PAYLOAD_TYPE_HEADER = 3;
    public static final int PAYLOAD_TYPE_JPG = 2;
    public static final int PAYLOAD_TYPE_MULTI = 4;
    public static final int PAYLOAD_TYPE_SMS = 5;
    public static final int PAYLOAD_TYPE_TEXT = 0;
    public static final int PAYLOAD_TYPE_XML = 1;

    Object accept(IDataPayloadVisitor iDataPayloadVisitor);

    long getLength();

    String getPayloadId();

    InputStream getPayloadStream();

    int getPayloadType();

    int getTransportId();
}
