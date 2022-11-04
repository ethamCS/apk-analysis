package org.javarosa.core.model.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.javarosa.core.model.data.helper.Selection;
import org.javarosa.core.model.utils.DateUtils;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapList;
import org.javarosa.core.util.externalizable.PrototypeFactory;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
/* loaded from: classes.dex */
public class SelectMultiData implements IAnswerData {
    Vector vs;

    public SelectMultiData() {
    }

    public SelectMultiData(Vector vector) {
        setValue(vector);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public IAnswerData clone() {
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.vs.size()) {
                vector.addElement(((Selection) this.vs.elementAt(i2)).clone());
                i = i2 + 1;
            } else {
                return new SelectMultiData(vector);
            }
        }
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public void setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempt to set an IAnswerData class to null.");
        }
        this.vs = vectorCopy((Vector) obj);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public Object getValue() {
        return vectorCopy(this.vs);
    }

    private Vector vectorCopy(Vector vector) {
        Vector vector2 = new Vector();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < vector.size()) {
                vector2.addElement((Selection) vector.elementAt(i2));
                i = i2 + 1;
            } else {
                return vector2;
            }
        }
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public String getDisplayText() {
        String str = "";
        int i = 0;
        while (i < this.vs.size()) {
            String str2 = str + ((Selection) this.vs.elementAt(i)).getValue();
            if (i < this.vs.size() - 1) {
                str2 = str2 + ", ";
            }
            i++;
            str = str2;
        }
        return str;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.vs = (Vector) ExtUtil.read(dataInputStream, new ExtWrapList(Selection.class), prototypeFactory);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, new ExtWrapList(this.vs));
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public UncastData uncast() {
        Enumeration elements = this.vs.elements();
        StringBuffer stringBuffer = new StringBuffer();
        while (elements.hasMoreElements()) {
            Selection selection = (Selection) elements.nextElement();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(XFormAnswerDataSerializer.DELIMITER);
            }
            stringBuffer.append(selection.getValue());
        }
        return new UncastData(stringBuffer.toString());
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public SelectMultiData cast(UncastData uncastData) throws IllegalArgumentException {
        Vector vector = new Vector();
        Iterator it = DateUtils.split(uncastData.value, XFormAnswerDataSerializer.DELIMITER, true).iterator();
        while (it.hasNext()) {
            vector.addElement(new Selection((String) it.next()));
        }
        return new SelectMultiData(vector);
    }
}
