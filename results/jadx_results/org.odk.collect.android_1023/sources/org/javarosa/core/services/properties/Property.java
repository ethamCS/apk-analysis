package org.javarosa.core.services.properties;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.javarosa.core.services.storage.IMetaData;
import org.javarosa.core.services.storage.Persistable;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class Property implements Persistable, IMetaData {
    public String name;
    public int recordId = -1;
    public Vector value;

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException {
        byte[] bArr = new byte[dataInputStream.available()];
        dataInputStream.readFully(bArr);
        String str = "";
        for (int i = 0; i < bArr.length; i++) {
            str = str + ((char) bArr[i]);
        }
        int indexOf = str.indexOf(",");
        this.value = new Vector();
        if (indexOf == -1) {
            System.out.println("WARNING: Property in RMS with no value:" + str);
            this.name = str.substring(0, str.length());
        } else {
            this.name = str.substring(0, indexOf);
            String substring = str.substring(str.indexOf(",") + 1, str.length());
            while (substring.length() != 0) {
                int indexOf2 = substring.indexOf(",");
                if (indexOf2 == -1) {
                    this.value.addElement(substring);
                    substring = "";
                } else {
                    this.value.addElement(substring.substring(0, indexOf2));
                    substring = substring.substring(indexOf2 + 1, substring.length());
                }
            }
        }
        dataInputStream.close();
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        Enumeration elements;
        String str = this.name;
        while (this.value.elements().hasMoreElements()) {
            str = str + "," + ((String) elements.nextElement());
        }
        for (int i = 0; i < str.length(); i++) {
            dataOutputStream.writeByte((byte) str.charAt(i));
        }
        dataOutputStream.close();
    }

    @Override // org.javarosa.core.services.storage.Persistable
    public void setID(int i) {
        this.recordId = i;
    }

    @Override // org.javarosa.core.services.storage.Persistable
    public int getID() {
        return this.recordId;
    }

    @Override // org.javarosa.core.services.storage.IMetaData
    public Hashtable getMetaData() {
        Hashtable hashtable = new Hashtable();
        String[] metaDataFields = getMetaDataFields();
        for (int i = 0; i < metaDataFields.length; i++) {
            hashtable.put(metaDataFields[i], getMetaData(metaDataFields[i]));
        }
        return hashtable;
    }

    @Override // org.javarosa.core.services.storage.IMetaData
    public Object getMetaData(String str) {
        if (str.equals("NAME")) {
            return this.name;
        }
        throw new IllegalArgumentException();
    }

    @Override // org.javarosa.core.services.storage.IMetaData
    public String[] getMetaDataFields() {
        return new String[]{"NAME"};
    }
}
