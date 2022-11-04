package ak;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Vector;
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a */
    private static String f563a;

    /* loaded from: classes3.dex */
    static class a implements PrivilegedAction<String> {
        a() {
        }

        /* renamed from: a */
        public String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            try {
                f563a = (String) AccessController.doPrivileged(new a());
            } catch (Exception unused) {
                f563a = String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
            f563a = "\n";
        }
    }

    public static char[] a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 != length; i10++) {
            cArr[i10] = (char) (bArr[i10] & 255);
        }
        return cArr;
    }

    public static String b(byte[] bArr) {
        return new String(a(bArr));
    }

    public static String c(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int b10 = bk.h.b(bArr, cArr);
        if (b10 >= 0) {
            return new String(cArr, 0, b10);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    public static String d() {
        return f563a;
    }

    public static String[] e(String str, char c10) {
        int i10;
        Vector vector = new Vector();
        boolean z10 = true;
        while (true) {
            if (!z10) {
                break;
            }
            int indexOf = str.indexOf(c10);
            if (indexOf > 0) {
                vector.addElement(str.substring(0, indexOf));
                str = str.substring(indexOf + 1);
            } else {
                vector.addElement(str);
                z10 = false;
            }
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (i10 = 0; i10 != size; i10++) {
            strArr[i10] = (String) vector.elementAt(i10);
        }
        return strArr;
    }

    public static byte[] f(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 != length; i10++) {
            bArr[i10] = (byte) str.charAt(i10);
        }
        return bArr;
    }

    public static String g(String str) {
        char[] charArray = str.toCharArray();
        boolean z10 = false;
        for (int i10 = 0; i10 != charArray.length; i10++) {
            char c10 = charArray[i10];
            if ('A' <= c10 && 'Z' >= c10) {
                charArray[i10] = (char) ((c10 - 'A') + 97);
                z10 = true;
            }
        }
        return z10 ? new String(charArray) : str;
    }

    public static void h(char[] cArr, OutputStream outputStream) {
        char c10;
        int i10;
        int i11 = 0;
        while (i11 < cArr.length) {
            char c11 = cArr[i11];
            char c12 = c11;
            if (c11 >= 128) {
                if (c11 < 2048) {
                    i10 = (c11 >> 6) | 192;
                } else if (c11 < 55296 || c11 > 57343) {
                    outputStream.write((c11 >> '\f') | 224);
                    i10 = ((c11 >> 6) & 63) | 128;
                } else {
                    i11++;
                    if (i11 >= cArr.length) {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                    char c13 = cArr[i11];
                    if (c11 > 56319) {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                    int i12 = (((c11 & 1023) << 10) | (c13 & 1023)) + 65536;
                    outputStream.write((i12 >> 18) | 240);
                    outputStream.write(((i12 >> 12) & 63) | 128);
                    outputStream.write(((i12 >> 6) & 63) | 128);
                    c10 = i12;
                    c12 = (c10 & 63) | 128;
                }
                outputStream.write(i10);
                c10 = c11;
                c12 = (c10 & 63) | 128;
            }
            outputStream.write(c12);
            i11++;
        }
    }

    public static byte[] i(String str) {
        return j(str.toCharArray());
    }

    public static byte[] j(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            h(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    public static String k(String str) {
        char[] charArray = str.toCharArray();
        boolean z10 = false;
        for (int i10 = 0; i10 != charArray.length; i10++) {
            char c10 = charArray[i10];
            if ('a' <= c10 && 'z' >= c10) {
                charArray[i10] = (char) ((c10 - 'a') + 65);
                z10 = true;
            }
        }
        return z10 ? new String(charArray) : str;
    }
}
