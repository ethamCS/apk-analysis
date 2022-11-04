package org.javarosa.core.model.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class DecimalData implements IAnswerData {
    double d;

    public DecimalData() {
    }

    public DecimalData(double d) {
        this.d = d;
    }

    public DecimalData(Double d) {
        setValue(d);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public IAnswerData clone() {
        return new DecimalData(this.d);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public String getDisplayText() {
        return String.valueOf(this.d);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public Object getValue() {
        return new Double(this.d);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public void setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempt to set an IAnswerData class to null.");
        }
        this.d = ((Double) obj).doubleValue();
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.d = ExtUtil.readDecimal(dataInputStream);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeDecimal(dataOutputStream, this.d);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public UncastData uncast() {
        return new UncastData(((Double) getValue()).toString());
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public DecimalData cast(UncastData uncastData) throws IllegalArgumentException {
        try {
            return new DecimalData(Double.parseDouble(uncastData.value));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid cast of data [" + uncastData.value + "] to type Decimal");
        }
    }
}
