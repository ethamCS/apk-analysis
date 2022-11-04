package org.javarosa.core.model.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.data.IDataPointer;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapTagged;
import org.javarosa.core.util.externalizable.PrototypeFactory;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
/* loaded from: classes.dex */
public class MultiPointerAnswerData implements IAnswerData {
    private IDataPointer[] data;

    public MultiPointerAnswerData() {
    }

    public MultiPointerAnswerData(IDataPointer[] iDataPointerArr) {
        this.data = iDataPointerArr;
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public String getDisplayText() {
        String str = "";
        int i = 0;
        while (i < this.data.length) {
            if (i != 0) {
                str = str + ", ";
            }
            String str2 = str + this.data[i].getDisplayText();
            i++;
            str = str2;
        }
        return str;
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
        this.data = (IDataPointer[]) obj;
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public IAnswerData clone() {
        return null;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.data = new IDataPointer[dataInputStream.readInt()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.data.length) {
                this.data[i2] = (IDataPointer) ExtUtil.read(dataInputStream, new ExtWrapTagged());
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.data.length);
        for (int i = 0; i < this.data.length; i++) {
            ExtUtil.write(dataOutputStream, new ExtWrapTagged(this.data[i]));
        }
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public UncastData uncast() {
        IDataPointer[] iDataPointerArr;
        String str = "";
        int i = 0;
        while (i < this.data.length) {
            i++;
            str = str + iDataPointerArr[i].getDisplayText() + XFormAnswerDataSerializer.DELIMITER;
        }
        if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
        return new UncastData(str);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public MultiPointerAnswerData cast(UncastData uncastData) throws IllegalArgumentException {
        return null;
    }
}
