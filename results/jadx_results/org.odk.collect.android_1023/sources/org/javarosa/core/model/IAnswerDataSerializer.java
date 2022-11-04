package org.javarosa.core.model;

import org.javarosa.core.data.IDataPointer;
import org.javarosa.core.model.data.IAnswerData;
/* loaded from: classes.dex */
public interface IAnswerDataSerializer {
    boolean canSerialize(IAnswerData iAnswerData);

    Boolean containsExternalData(IAnswerData iAnswerData);

    void registerAnswerSerializer(IAnswerDataSerializer iAnswerDataSerializer);

    IDataPointer[] retrieveExternalDataPointer(IAnswerData iAnswerData);

    Object serializeAnswerData(IAnswerData iAnswerData);

    Object serializeAnswerData(IAnswerData iAnswerData, int i);
}
