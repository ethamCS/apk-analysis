package org.javarosa.core.services.locale;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.javarosa.core.util.OrderedHashtable;
/* loaded from: classes.dex */
public class LocalizationUtils {
    public static OrderedHashtable parseLocaleInput(InputStream inputStream) throws IOException {
        OrderedHashtable orderedHashtable = new OrderedHashtable();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        char[] cArr = new char[100];
        String str = "";
        int i = 0;
        while (true) {
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
                    str = str + valueOf.substring(i2);
                    break;
                }
                i3++;
                parseAndAdd(orderedHashtable, str + valueOf.substring(i2, indexOf), i3);
                str = "";
                i2 = indexOf + 1;
            }
            i = i3;
        }
        if (str != "") {
            parseAndAdd(orderedHashtable, str, i);
        }
        inputStream.close();
        return orderedHashtable;
    }

    private static void parseAndAdd(OrderedHashtable orderedHashtable, String str, int i) {
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
