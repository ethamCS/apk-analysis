package org.javarosa.xform.util;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Vector;
import org.javarosa.core.model.FormDef;
import org.javarosa.core.util.externalizable.DeserializationException;
import org.javarosa.core.util.externalizable.ExtUtil;
import org.javarosa.xform.parse.IXFormParserFactory;
import org.javarosa.xform.parse.XFormParser;
import org.javarosa.xform.parse.XFormParserFactory;
import org.kxml2.kdom.Element;
import org.odk.collect.android.activities.DrawActivity;
/* loaded from: classes.dex */
public class XFormUtils {
    private static IXFormParserFactory _factory = new XFormParserFactory();

    public static IXFormParserFactory setXFormParserFactory(IXFormParserFactory iXFormParserFactory) {
        IXFormParserFactory iXFormParserFactory2 = _factory;
        _factory = iXFormParserFactory;
        return iXFormParserFactory2;
    }

    public static FormDef getFormFromResource(String str) {
        InputStream resourceAsStream = System.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            System.err.println("Can't find form resource \"" + str + "\". Is it in the JAR?");
            return null;
        }
        return getFormFromInputStream(resourceAsStream);
    }

    public static FormDef getFormFromInputStream(InputStream inputStream) {
        InputStreamReader inputStreamReader;
        try {
            inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            System.out.println("UTF 8 encoding unavailable, trying default encoding");
            inputStreamReader = new InputStreamReader(inputStream);
        }
        try {
            return _factory.getXFormParser(inputStreamReader).parse();
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException e2) {
                System.err.println("IO Exception while closing stream.");
                e2.printStackTrace();
            }
        }
    }

    public static FormDef getFormFromSerializedResource(String str) {
        DeserializationException e;
        FormDef formDef;
        IOException e2;
        InputStream resourceAsStream = System.class.getResourceAsStream(str);
        try {
            if (resourceAsStream != null) {
                DataInputStream dataInputStream = new DataInputStream(resourceAsStream);
                formDef = (FormDef) ExtUtil.read(dataInputStream, FormDef.class);
                try {
                    dataInputStream.close();
                    resourceAsStream.close();
                } catch (IOException e3) {
                    e2 = e3;
                    e2.printStackTrace();
                    return formDef;
                } catch (DeserializationException e4) {
                    e = e4;
                    e.printStackTrace();
                    return formDef;
                }
            } else {
                System.out.println("ResourceStream NULL");
                formDef = null;
            }
        } catch (IOException e5) {
            formDef = null;
            e2 = e5;
        } catch (DeserializationException e6) {
            formDef = null;
            e = e6;
        }
        return formDef;
    }

    public static Vector getAttributeList(Element element) {
        Vector vector = new Vector();
        for (int i = 0; i < element.getAttributeCount(); i++) {
            vector.addElement(element.getAttributeName(i));
        }
        return vector;
    }

    public static Vector getUnusedAttributes(Element element, Vector vector) {
        Vector attributeList = getAttributeList(element);
        for (int i = 0; i < vector.size(); i++) {
            if (attributeList.contains(vector.elementAt(i))) {
                attributeList.removeElement(vector.elementAt(i));
            }
        }
        return attributeList;
    }

    public static String unusedAttWarning(Element element, Vector vector) {
        Vector unusedAttributes = getUnusedAttributes(element, vector);
        String str = ("Warning: " + unusedAttributes.size() + " Unrecognized attributes found in Element [" + element.getName() + "] and will be ignored: ") + "[";
        for (int i = 0; i < unusedAttributes.size(); i++) {
            str = str + unusedAttributes.elementAt(i);
            if (i != unusedAttributes.size() - 1) {
                str = str + ",";
            }
        }
        return (str + "] ") + "Location:\n" + XFormParser.getVagueLocation(element);
    }

    public static boolean showUnusedAttributeWarning(Element element, Vector vector) {
        return getUnusedAttributes(element, vector).size() > 0;
    }

    public static boolean isOutput(Element element) {
        return element.getName().toLowerCase().equals(DrawActivity.EXTRA_OUTPUT);
    }
}
