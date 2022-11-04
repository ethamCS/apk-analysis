package bk;

import java.io.ByteArrayOutputStream;
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a */
    private static final d f6108a = new b();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            f6108a.a(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new c("unable to decode base64 string: " + e10.getMessage(), e10);
        }
    }

    public static byte[] b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    public static byte[] c(byte[] bArr, int i10, int i11) {
        d dVar = f6108a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(dVar.b(i11));
        try {
            dVar.c(bArr, i10, i11, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new e("exception encoding base64 string: " + e10.getMessage(), e10);
        }
    }
}
