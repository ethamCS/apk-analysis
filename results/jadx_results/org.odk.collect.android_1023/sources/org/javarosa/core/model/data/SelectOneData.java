package org.javarosa.core.model.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class SelectOneData implements IAnswerData {
    Selection s;

    public SelectOneData() {
    }

    public SelectOneData(Selection selection) {
        setValue(selection);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public IAnswerData clone() {
        return new SelectOneData(this.s.clone());
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public void setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempt to set an IAnswerData class to null.");
        }
        this.s = (Selection) obj;
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public Object getValue() {
        return this.s;
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public String getDisplayText() {
        return this.s.getValue();
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.s = (Selection) ExtUtil.read(dataInputStream, Selection.class, prototypeFactory);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, this.s);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public UncastData uncast() {
        return new UncastData(this.s.getValue());
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public SelectOneData cast(UncastData uncastData) throws IllegalArgumentException {
        return new SelectOneData(new Selection(uncastData.value));
    }
}
