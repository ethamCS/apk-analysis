package org.javarosa.core.model.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class UncastData implements IAnswerData {
    String value;

    public UncastData() {
    }

    public UncastData(String str) {
        this.value = str;
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public IAnswerData clone() {
        return new UncastData(this.value);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public String getDisplayText() {
        return this.value;
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public Object getValue() {
        return this.value;
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public void setValue(Object obj) {
        this.value = (String) obj;
    }

    public String getString() {
        return this.value;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.value = ExtUtil.readString(dataInputStream);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeString(dataOutputStream, this.value);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public UncastData uncast() {
        return this;
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public UncastData cast(UncastData uncastData) {
        return new UncastData(uncastData.value);
    }
}
