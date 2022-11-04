package org.javarosa.core.model.utils;

import java.io.IOException;
import org.javarosa.core.model.FormDef;
import org.javarosa.core.model.IAnswerDataSerializer;
import org.javarosa.core.model.IDataReference;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.services.transport.payload.IDataPayload;
/* loaded from: classes.dex */
public interface IInstanceSerializingVisitor extends IInstanceVisitor {
    IDataPayload createSerializedPayload(FormInstance formInstance) throws IOException;

    IDataPayload createSerializedPayload(FormInstance formInstance, IDataReference iDataReference) throws IOException;

    IInstanceSerializingVisitor newInstance();

    byte[] serializeInstance(FormInstance formInstance) throws IOException;

    byte[] serializeInstance(FormInstance formInstance, FormDef formDef) throws IOException;

    byte[] serializeInstance(FormInstance formInstance, IDataReference iDataReference) throws IOException;

    void setAnswerDataSerializer(IAnswerDataSerializer iAnswerDataSerializer);
}
