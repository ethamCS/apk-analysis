package org.javarosa.core.model.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Date;
import org.javarosa.core.model.utils.DateUtils;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class DateData implements IAnswerData {
    Date d;

    public DateData() {
    }

    public DateData(Date date) {
        setValue(date);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public IAnswerData clone() {
        return new DateData(new Date(this.d.getTime()));
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public void setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempt to set an IAnswerData class to null.");
        }
        this.d = DateUtils.roundDate((Date) obj);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public Object getValue() {
        return new Date(this.d.getTime());
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public String getDisplayText() {
        return DateUtils.formatDate(this.d, 2);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        setValue(ExtUtil.readDate(dataInputStream));
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeDate(dataOutputStream, this.d);
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public UncastData uncast() {
        return new UncastData(DateUtils.formatDate(this.d, 1));
    }

    @Override // org.javarosa.core.model.data.IAnswerData
    public DateData cast(UncastData uncastData) throws IllegalArgumentException {
        Date parseDate = DateUtils.parseDate(uncastData.value);
        if (parseDate != null) {
            return new DateData(parseDate);
        }
        throw new IllegalArgumentException("Invalid cast of data [" + uncastData.value + "] to type Date");
    }
}
