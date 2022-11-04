package org.javarosa.core.model.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.data.IDataPointer;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapTagged;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class PointerAnswerData implements IAnswerData {
    private IDataPointer data;

    public PointerAnswerData() {
    }

    public PointerAnswerData(IDataPointer iDataPointer) {
        this.data = iDataPointer;
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public IAnswerData clone() {
        return null;
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public String getDisplayText() {
        return this.data.getDisplayText();
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public Object getValue() {
        return this.data;
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public void setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempt to set an IAnswerData class to null.");
        }
        this.data = (IDataPointer) obj;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.data = (IDataPointer) ExtUtil.read(dataInputStream, new ExtWrapTagged());
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, new ExtWrapTagged(this.data));
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public UncastData uncast() {
        return new UncastData(this.data.getDisplayText());
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public MultiPointerAnswerData cast(UncastData uncastData) throws IllegalArgumentException {
        return null;
    }
}
