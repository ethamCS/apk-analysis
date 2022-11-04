package org.javarosa.core.util;

import java.util.Random;
import java.util.Vector;
import org.javarosa.core.services.PropertyManager;
/* loaded from: classes.dex */
public class PropertyUtils {
    public static String initializeProperty(String str, String str2) {
        Vector property = PropertyManager._().getProperty(str);
        if (property == null || property.size() == 0) {
            Vector vector = new Vector();
            vector.addElement(str2);
            PropertyManager._().setProperty(str, vector);
            System.out.println("No default value for [" + str + "]; setting to [" + str2 + "]");
            return str2;
        }
        return (String) property.elementAt(0);
    }

    public static String genUUID() {
        return randHex(8) + "-" + randHex(4) + "-4" + randHex(3) + "-" + Integer.toString(MathUtils.getRand().nextInt(4) + 8, 16) + randHex(3) + "-" + randHex(12);
    }

    public static String genGUID(int i) {
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            str = str + Integer.toString(MathUtils.getRand().nextInt(36), 36);
        }
        return str.toUpperCase();
    }

    public static String randHex(int i) {
        String str = "";
        Random rand = MathUtils.getRand();
        for (int i2 = 0; i2 < i; i2++) {
            str = str + Integer.toString(rand.nextInt(16), 16);
        }
        return str;
    }

    public static String trim(String str, int i) {
        return str.substring(0, Math.min(i, str.length()));
    }
}
