package org.javarosa.core.model.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class IntegerData implements IAnswerData {
    int n;

    public IntegerData() {
    }

    public IntegerData(int i) {
        this.n = i;
    }

    public IntegerData(Integer num) {
        setValue(num);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public IAnswerData clone() {
        return new IntegerData(this.n);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public String getDisplayText() {
        return String.valueOf(this.n);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public Object getValue() {
        return new Integer(this.n);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public void setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempt to set an IAnswerData class to null.");
        }
        this.n = ((Integer) obj).intValue();
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.n = ExtUtil.readInt(dataInputStream);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeNumeric(dataOutputStream, this.n);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public UncastData uncast() {
        return new UncastData(new Integer(this.n).toString());
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public IntegerData cast(UncastData uncastData) throws IllegalArgumentException {
        try {
            return new IntegerData(Integer.parseInt(uncastData.value));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid cast of data [" + uncastData.value + "] to type Decimal");
        }
    }
}
