package org.javarosa.core.model.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class StringData implements IAnswerData {
    private String s;

    public StringData() {
    }

    public StringData(String str) {
        setValue(str);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public IAnswerData clone() {
        return new StringData(this.s);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public void setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempt to set an IAnswerData class to null.");
        }
        this.s = (String) obj;
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public Object getValue() {
        return this.s;
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public String getDisplayText() {
        return this.s;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.s = ExtUtil.readString(dataInputStream);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeString(dataOutputStream, this.s);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public UncastData uncast() {
        return new UncastData(this.s);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public StringData cast(UncastData uncastData) throws IllegalArgumentException {
        return new StringData(uncastData.value);
    }
}
