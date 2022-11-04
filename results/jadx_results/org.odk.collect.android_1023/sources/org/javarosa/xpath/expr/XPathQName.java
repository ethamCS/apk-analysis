package org.javarosa.xpath.expr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapNullable;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class XPathQName implements Externalizable {
    public String name;
    public String namespace;

    public XPathQName() {
    }

    public XPathQName(String str) {
        int indexOf = str == null ? -1 : str.indexOf(":");
        if (indexOf == -1) {
            init(null, str);
        } else {
            init(str.substring(0, indexOf), str.substring(indexOf + 1));
        }
    }

    public XPathQName(String str, String str2) {
        init(str, str2);
    }

    private void init(String str, String str2) {
        if (str2 == null || ((str2 != null && str2.length() == 0) || (str != null && str.length() == 0))) {
            throw new IllegalArgumentException("Invalid QName");
        }
        this.namespace = str;
        this.name = str2;
    }

    public String toString() {
        return this.namespace == null ? this.name : this.namespace + ":" + this.name;
    }

    public boolean equals(Object obj) {
        if (obj instanceof XPathQName) {
            XPathQName xPathQName = (XPathQName) obj;
            return ExtUtil.equals(this.namespace, xPathQName.namespace) && this.name.equals(xPathQName.name);
        }
        return false;
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.namespace = (String) ExtUtil.read(dataInputStream, new ExtWrapNullable(String.class));
        this.name = ExtUtil.readString(dataInputStream);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, new ExtWrapNullable(this.namespace));
        ExtUtil.writeString(dataOutputStream, this.name);
    }
}
