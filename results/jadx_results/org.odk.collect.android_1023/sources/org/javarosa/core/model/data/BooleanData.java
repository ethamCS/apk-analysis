package org.javarosa.core.model.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class BooleanData implements IAnswerData {
    boolean data;

    public BooleanData() {
    }

    public BooleanData(boolean z) {
        this.data = z;
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public IAnswerData clone() {
        return new BooleanData(this.data);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public String getDisplayText() {
        return this.data ? "True" : "False";
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public Object getValue() {
        return new Boolean(this.data);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public void setValue(Object obj) {
        this.data = ((Boolean) obj).booleanValue();
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.data = dataInputStream.readBoolean();
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeBoolean(this.data);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public UncastData uncast() {
        return new UncastData(this.data ? "1" : "0");
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public BooleanData cast(UncastData uncastData) throws IllegalArgumentException {
        if ("1".equals(uncastData)) {
            return new BooleanData(true);
        }
        if ("0".equals(uncastData)) {
            return new BooleanData(false);
        }
        throw new IllegalArgumentException("Invalid cast of data [" + uncastData.value + "] to type Boolean");
    }
}
