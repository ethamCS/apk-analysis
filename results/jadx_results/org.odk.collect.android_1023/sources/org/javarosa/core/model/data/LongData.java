package org.javarosa.core.model.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class LongData implements IAnswerData {
    long n;

    public LongData() {
    }

    public LongData(long j) {
        this.n = j;
    }

    public LongData(Long l) {
        setValue(l);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public IAnswerData clone() {
        return new LongData(this.n);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public String getDisplayText() {
        return String.valueOf(this.n);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public Object getValue() {
        return new Long(this.n);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public void setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempt to set an IAnswerData class to null.");
        }
        this.n = ((Long) obj).longValue();
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.n = ExtUtil.readNumeric(dataInputStream);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeNumeric(dataOutputStream, this.n);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public UncastData uncast() {
        return new UncastData(new Long(this.n).toString());
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public LongData cast(UncastData uncastData) throws IllegalArgumentException {
        try {
            return new LongData(Long.parseLong(uncastData.value));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid cast of data [" + uncastData.value + "] to type Long");
        }
    }
}
