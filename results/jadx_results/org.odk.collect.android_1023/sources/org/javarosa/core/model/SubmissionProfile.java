package org.javarosa.core.model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.core.util.externalizable.ExtWrapMap;
import org.javarosa.core.util.externalizable.ExtWrapTagged;
import org.javarosa.core.util.externalizable.Externalizable;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class SubmissionProfile implements Externalizable {
    String action;
    Hashtable<String, String> attributeMap;
    String mediaType;
    String method;
    IDataReference ref;

    public SubmissionProfile() {
    }

    public SubmissionProfile(IDataReference iDataReference, String str, String str2, String str3, Hashtable<String, String> hashtable) {
        this.method = str;
        this.ref = iDataReference;
        this.action = str2;
        this.mediaType = str3;
        this.attributeMap = hashtable;
    }

    public IDataReference getRef() {
        return this.ref;
    }

    public String getMethod() {
        return this.method;
    }

    public String getAction() {
        return this.action;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public String getAttribute(String str) {
        return this.attributeMap.get(str);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.ref = (IDataReference) ExtUtil.read(dataInputStream, new ExtWrapTagged(IDataReference.class));
        this.method = ExtUtil.readString(dataInputStream);
        this.action = ExtUtil.readString(dataInputStream);
        this.mediaType = ExtUtil.nullIfEmpty(ExtUtil.readString(dataInputStream));
        this.attributeMap = (Hashtable) ExtUtil.read(dataInputStream, new ExtWrapMap(String.class, String.class));
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        ExtUtil.write(dataOutputStream, new ExtWrapTagged(this.ref));
        ExtUtil.writeString(dataOutputStream, this.method);
        ExtUtil.writeString(dataOutputStream, this.action);
        ExtUtil.writeString(dataOutputStream, ExtUtil.emptyIfNull(this.mediaType));
        ExtUtil.write(dataOutputStream, new ExtWrapMap(this.attributeMap));
    }
}
