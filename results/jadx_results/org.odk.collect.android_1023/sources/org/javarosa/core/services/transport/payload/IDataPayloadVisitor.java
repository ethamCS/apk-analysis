package org.javarosa.core.services.transport.payload;
/* loaded from: classes.dex */
public interface IDataPayloadVisitor {
    Object visit(ByteArrayPayload byteArrayPayload);

    Object visit(DataPointerPayload dataPointerPayload);

    Object visit(MultiMessagePayload multiMessagePayload);
}
