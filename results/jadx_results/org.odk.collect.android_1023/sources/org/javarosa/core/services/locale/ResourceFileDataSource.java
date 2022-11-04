package org.javarosa.core.services.locale;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.javarosa.core.util.OrderedHashtable;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.PrototypeFactory;
/* loaded from: classes.dex */
public class ResourceFileDataSource implements LocaleDataSource {
    String resourceURI;

    public ResourceFileDataSource() {
    }

    public ResourceFileDataSource(String str) {
        if (str == null) {
            throw new NullPointerException("Resource URI cannot be null when creating a Resource File Data Source");
        }
        this.resourceURI = str;
    }

    @Override // org.javarosa.core.services.locale.LocaleDataSource
    public OrderedHashtable getLocalizedText() {
        return loadLocaleResource(this.resourceURI);
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void readExternal(DataInputStream dataInputStream, PrototypeFactory prototypeFactory) throws IOException, DeserializationException {
        this.resourceURI = dataInputStream.readUTF();
    }

    @Override // org.javarosa.core.util.externalizable.Externalizable
    public void writeExternal(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.resourceURI);
    }

    private OrderedHashtable loadLocaleResource(String str) {
        InputStream resourceAsStream = System.class.getResourceAsStream(str);
        OrderedHashtable orderedHashtable = new OrderedHashtable();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(resourceAsStream, "UTF-8");
            char[] cArr = new char[100];
            try {
                String str2 = "";
                int i = 0;
                while (true) {
                    try {
                        int read = inputStreamReader.read(cArr, 0, 100);
                        if (read == -1) {
                            break;
                        }
                        String valueOf = String.valueOf(cArr, 0, read);
                        int i2 = 0;
                        int i3 = i;
                        while (true) {
                            if (i2 == -1) {
                                break;
                            }
                            int indexOf = valueOf.indexOf(10, i2);
                            if (indexOf == -1) {
                                indexOf = valueOf.indexOf(13, i2);
                            }
                            if (indexOf == -1) {
                                str2 = str2 + valueOf.substring(i2);
                                break;
                            }
                            i3++;
                            parseAndAdd(orderedHashtable, str2 + valueOf.substring(i2, indexOf), i3);
                            str2 = "";
                            i2 = indexOf + 1;
                        }
                        i = i3;
                    } catch (IOException e) {
                        e.printStackTrace();
                        try {
                            resourceAsStream.close();
                        } catch (IOException e2) {
                            System.out.println("Input Stream for resource file " + this.resourceURI + " failed to close. This will eat up your memory! Fix Problem! [" + e2.getMessage() + "]");
                            e2.printStackTrace();
                        }
                    }
                }
                if (str2 != "") {
                    parseAndAdd(orderedHashtable, str2, i);
                }
                return orderedHashtable;
            } finally {
                try {
                    resourceAsStream.close();
                } catch (IOException e3) {
                    System.out.println("Input Stream for resource file " + this.resourceURI + " failed to close. This will eat up your memory! Fix Problem! [" + e3.getMessage() + "]");
                    e3.printStackTrace();
                }
            }
        } catch (Exception e4) {
            throw new RuntimeException("Failed to load locale resource " + str + ". Is it in the jar?");
        }
    }

    private void parseAndAdd(OrderedHashtable orderedHashtable, String str, int i) {
        String trim = str.trim();
        while (trim.indexOf("#") != -1) {
            trim = trim.substring(0, trim.indexOf("#"));
        }
        if (trim.indexOf(61) == -1) {
            if (!trim.trim().equals("")) {
                System.out.println("Invalid line (#" + i + ") read: " + trim);
            }
        } else if (trim.indexOf(61) != trim.length() - 1) {
            orderedHashtable.put(trim.substring(0, trim.indexOf(61)), trim.substring(trim.indexOf(61) + 1, trim.length()));
        } else {
            System.out.println("Invalid line (#" + i + ") read: '" + trim + "'. No value follows the '='.");
        }
    }
}
