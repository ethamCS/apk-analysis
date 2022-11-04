package org.javarosa.xform.util;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.UnsupportedEncodingException;
import org.kxml2.io.KXmlSerializer;
import org.kxml2.kdom.Document;
import org.kxml2.kdom.Element;
/* loaded from: classes.dex */
public class XFormSerializer {
    public static ByteArrayOutputStream getStream(Document document) {
        KXmlSerializer kXmlSerializer = new KXmlSerializer();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            kXmlSerializer.setOutput(new DataOutputStream(byteArrayOutputStream), null);
            document.write(kXmlSerializer);
            kXmlSerializer.flush();
            return byteArrayOutputStream;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String elementToString(Element element) {
        KXmlSerializer kXmlSerializer = new KXmlSerializer();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            kXmlSerializer.setOutput(new DataOutputStream(byteArrayOutputStream), null);
            element.write(kXmlSerializer);
            kXmlSerializer.flush();
            return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String getString(Document document) {
        byte[] byteArray = getStream(document).toByteArray();
        char[] cArr = new char[byteArray.length];
        for (int i = 0; i < byteArray.length; i++) {
            cArr[i] = (char) byteArray[i];
        }
        return String.valueOf(cArr);
    }
}
