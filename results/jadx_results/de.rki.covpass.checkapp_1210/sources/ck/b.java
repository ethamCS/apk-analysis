package ck;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a */
    private static int f6643a = 4096;

    public static void a(InputStream inputStream, OutputStream outputStream) {
        b(inputStream, outputStream, f6643a);
    }

    public static void b(InputStream inputStream, OutputStream outputStream, int i10) {
        byte[] bArr = new byte[i10];
        while (true) {
            int read = inputStream.read(bArr, 0, i10);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static long c(InputStream inputStream, long j10, OutputStream outputStream) {
        int i10 = f6643a;
        byte[] bArr = new byte[i10];
        long j11 = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, i10);
            if (read >= 0) {
                long j12 = read;
                if (j10 - j11 < j12) {
                    throw new a("Data Overflow");
                }
                j11 += j12;
                outputStream.write(bArr, 0, read);
            } else {
                return j11;
            }
        }
    }

    public static byte[] d(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] e(InputStream inputStream, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c(inputStream, i10, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int f(InputStream inputStream, byte[] bArr) {
        return g(inputStream, bArr, 0, bArr.length);
    }

    public static int g(InputStream inputStream, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int read = inputStream.read(bArr, i10 + i12, i11 - i12);
            if (read < 0) {
                break;
            }
            i12 += read;
        }
        return i12;
    }
}
