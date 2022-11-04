package yd;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public class j {

    /* renamed from: a */
    public static final byte[] f26151a;

    /* renamed from: b */
    public static final ByteBuffer f26152b;

    /* loaded from: classes3.dex */
    public interface a {
        int c();
    }

    /* loaded from: classes3.dex */
    public interface b<T extends a> {
        T a(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f26151a = bArr;
        f26152b = ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return y.e(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }
}
