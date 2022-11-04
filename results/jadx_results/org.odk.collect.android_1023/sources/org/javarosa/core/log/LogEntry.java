package org.javarosa.core.log;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Date;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class LogEntry implements Externalizable {
    public static final String STORAGE_KEY = "LOG";
    String message;
    Date time;
    String type;
    public static String LOG_TYPE_APPLICATION = "APP";
    public static String LOG_TYPE_ACTIVITY = "ACTIVITY";

    public LogEntry() {
    }

    public LogEntry(String str, String str2, Date date) {
        this.time = date;
        this.type = str;
        this.message = str2;
    }

    public Date getTime() {
        return this.time;
    }

    public String getType() {
        return this.type;
    }

    public String getMessage() {
        return this.message;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.time = ExtUtil.readDate(dataInputStream);
        this.type = ExtUtil.readString(dataInputStream);
        this.message = ExtUtil.readString(dataInputStream);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeDate(dataOutputStream, this.time);
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.type));
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.message));
    }
}
