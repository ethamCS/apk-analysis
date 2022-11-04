package e.m0.k;

import java.io.IOException;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    static final f.f f4226a = f.f.j("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    private static final String[] f4227b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    static final String[] f4228c = new String[64];

    /* renamed from: d */
    static final String[] f4229d = new String[256];

    static {
        String[] strArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr2 = f4229d;
            if (i2 >= strArr2.length) {
                break;
            }
            strArr2[i2] = e.m0.e.o("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr3 = f4228c;
        strArr3[0] = "";
        strArr3[1] = "END_STREAM";
        int[] iArr = {1};
        strArr3[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            f4228c[i4 | 8] = strArr[i4] + "|PADDED";
        }
        String[] strArr4 = f4228c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = f4228c;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                strArr5[i9 | 8] = strArr5[i8] + '|' + strArr5[i6] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr6 = f4228c;
            if (i < strArr6.length) {
                if (strArr6[i] == null) {
                    strArr6[i] = f4229d[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private e() {
    }

    static String a(byte b2, byte b3) {
        if (b3 == 0) {
            return "";
        }
        if (b2 != 2 && b2 != 3) {
            if (b2 == 4 || b2 == 6) {
                return b3 == 1 ? "ACK" : f4229d[b3];
            } else if (b2 != 7 && b2 != 8) {
                String[] strArr = f4228c;
                String str = b3 < strArr.length ? strArr[b3] : f4229d[b3];
                return (b2 != 5 || (b3 & 4) == 0) ? (b2 != 0 || (b3 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f4229d[b3];
    }

    public static String b(boolean z, int i, int i2, byte b2, byte b3) {
        String[] strArr = f4227b;
        String o = b2 < strArr.length ? strArr[b2] : e.m0.e.o("0x%02x", Byte.valueOf(b2));
        String a2 = a(b2, b3);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = o;
        objArr[4] = a2;
        return e.m0.e.o("%s 0x%08x %5d %-13s %s", objArr);
    }

    public static IllegalArgumentException c(String str, Object... objArr) {
        throw new IllegalArgumentException(e.m0.e.o(str, objArr));
    }

    public static IOException d(String str, Object... objArr) {
        throw new IOException(e.m0.e.o(str, objArr));
    }
}
