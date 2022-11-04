package org.javarosa.core.reference;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class RootTranslator implements ReferenceFactory, Externalizable {
    public String prefix;
    public String translatedPrefix;

    public RootTranslator() {
    }

    public RootTranslator(String str, String str2) {
        this.prefix = str;
        this.translatedPrefix = str2;
    }

    @Override // org.javarosa.core.reference.ReferenceFactory
    public Reference derive(String str) throws InvalidReferenceException {
        return ReferenceManager._().DeriveReference(this.translatedPrefix + str.substring(this.prefix.length()));
    }

    @Override // org.javarosa.core.reference.ReferenceFactory
    public Reference derive(String str, String str2) throws InvalidReferenceException {
        return ReferenceManager._().DeriveReference(str, this.translatedPrefix + str2.substring(this.prefix.length()));
    }

    @Override // org.javarosa.core.reference.ReferenceFactory
    public boolean derives(String str) {
        return str.startsWith(this.prefix);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.prefix = ExtUtil.readString(dataInputStream);
        this.translatedPrefix = ExtUtil.readString(dataInputStream);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.writeString(dataOutputStream, this.prefix);
        ExtUtil.writeString(dataOutputStream, this.translatedPrefix);
    }
}
