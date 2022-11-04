package org.javarosa.core.model.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import org.javarosa.core.model.utils.DateUtils;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.PrototypeFactory;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
/* loaded from: classes.dex */
public class GeoPointData implements IAnswerData {
    private double[] gp;
    private int len;

    public GeoPointData() {
        this.gp = new double[4];
        this.len = 2;
    }

    public GeoPointData(double[] dArr) {
        this.gp = new double[4];
        this.len = 2;
        fillArray(dArr);
    }

    private void fillArray(double[] dArr) {
        this.len = dArr.length;
        for (int i = 0; i < this.len; i++) {
            this.gp[i] = dArr[i];
        }
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public IAnswerData clone() {
        return new GeoPointData(this.gp);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public String getDisplayText() {
        String str = "";
        for (int i = 0; i < this.len; i++) {
            str = str + this.gp[i] + XFormAnswerDataSerializer.DELIMITER;
        }
        return str.trim();
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public Object getValue() {
        return this.gp;
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public void setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempt to set an IAnswerData class to null.");
        }
        fillArray((double[]) obj);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.len = (int) ExtUtil.readNumeric(dataInputStream);
        for (int i = 0; i < this.len; i++) {
            this.gp[i] = ExtUtil.readDecimal(dataInputStream);
        }
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeNumeric(dataOutputStream, this.len);
        for (int i = 0; i < this.len; i++) {
            ExtUtil.writeDecimal(dataOutputStream, this.gp[i]);
        }
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public UncastData uncast() {
        return new UncastData(getDisplayText());
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public GeoPointData cast(UncastData uncastData) throws IllegalArgumentException {
        double[] dArr = new double[4];
        int i = 0;
        Iterator it = DateUtils.split(uncastData.value, XFormAnswerDataSerializer.DELIMITER, true).iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                dArr[i2] = Double.parseDouble((String) it.next());
                i = i2 + 1;
            } else {
                return new GeoPointData(dArr);
            }
        }
    }
}
