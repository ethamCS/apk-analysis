package org.javarosa.core.services.locale;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.util.OrderedHashtable;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapMap;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class TableLocaleSource implements LocaleDataSource {
    private OrderedHashtable localeData;

    public TableLocaleSource() {
        this.localeData = new OrderedHashtable();
    }

    public TableLocaleSource(OrderedHashtable orderedHashtable) {
        this.localeData = orderedHashtable;
    }

    public void setLocaleMapping(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null textID when attempting to register " + str2 + " in locale table");
        }
        if (str2 == null) {
            this.localeData.remove(str);
        } else {
            this.localeData.put(str, str2);
        }
    }

    public boolean hasMapping(String str) {
        return (str == null || this.localeData.get(str) == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TableLocaleSource)) {
            return false;
        }
        return ExtUtil.equals(this.localeData, ((TableLocaleSource) obj).localeData);
    }

    @Override // org.javarosa.core.services.locale.LocaleDataSource
    public OrderedHashtable getLocalizedText() {
        return this.localeData;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.localeData = (OrderedHashtable) ExtUtil.read(dataInputStream, new ExtWrapMap(String.class, String.class, true), prototypeFactory);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, new ExtWrapMap(this.localeData));
    }
}
