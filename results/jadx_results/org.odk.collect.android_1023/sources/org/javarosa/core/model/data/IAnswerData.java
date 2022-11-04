package org.javarosa.core.model.data;

import org.javarosa.core.util.externalizable.Externalizable;
/* loaded from: classes.dex */
public interface IAnswerData extends Externalizable {
    IAnswerData cast(UncastData uncastData) throws IllegalArgumentException;

    IAnswerData clone();

    String getDisplayText();

    Object getValue();

    void setValue(Object obj);

    UncastData uncast();
}
