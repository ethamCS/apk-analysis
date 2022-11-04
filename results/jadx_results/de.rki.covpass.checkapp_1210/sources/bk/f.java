package bk;

import ak.q;
import java.io.ByteArrayOutputStream;
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a */
    private static final g f6114a = new g();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f6114a.a(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new c("exception decoding Hex string: " + e10.getMessage(), e10);
        }
    }

    public static byte[] b(String str) {
        try {
            return f6114a.d(str, 0, str.length());
        } catch (Exception e10) {
            throw new c("exception decoding Hex string: " + e10.getMessage(), e10);
        }
    }

    public static byte[] c(String str, int i10, int i11) {
        try {
            return f6114a.d(str, i10, i11);
        } catch (Exception e10) {
            throw new c("exception decoding Hex string: " + e10.getMessage(), e10);
        }
    }

    public static byte[] d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static byte[] e(byte[] bArr, int i10, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f6114a.c(bArr, i10, i11, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new e("exception encoding Hex string: " + e10.getMessage(), e10);
        }
    }

    public static String f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static String g(byte[] bArr, int i10, int i11) {
        return q.b(e(bArr, i10, i11));
    }
}
