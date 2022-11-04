package androidx.camera.core.impl.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
final class f {

    /* renamed from: e */
    static final Charset f2335e = StandardCharsets.US_ASCII;

    /* renamed from: f */
    static final String[] f2336f = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: g */
    static final int[] f2337g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: h */
    static final byte[] f2338h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: a */
    public final int f2339a;

    /* renamed from: b */
    public final int f2340b;

    /* renamed from: c */
    public final long f2341c;

    /* renamed from: d */
    public final byte[] f2342d;

    f(int i10, int i11, long j10, byte[] bArr) {
        this.f2339a = i10;
        this.f2340b = i11;
        this.f2341c = j10;
        this.f2342d = bArr;
    }

    f(int i10, int i11, byte[] bArr) {
        this(i10, i11, -1L, bArr);
    }

    public static f a(String str) {
        if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
            byte[] bytes = str.getBytes(f2335e);
            return new f(1, bytes.length, bytes);
        }
        return new f(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
    }

    public static f b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2337g[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d10 : dArr) {
            wrap.putDouble(d10);
        }
        return new f(12, dArr.length, wrap.array());
    }

    public static f c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2337g[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i10 : iArr) {
            wrap.putInt(i10);
        }
        return new f(9, iArr.length, wrap.array());
    }

    public static f d(j[] jVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2337g[10] * jVarArr.length]);
        wrap.order(byteOrder);
        for (j jVar : jVarArr) {
            wrap.putInt((int) jVar.b());
            wrap.putInt((int) jVar.a());
        }
        return new f(10, jVarArr.length, wrap.array());
    }

    public static f e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f2335e);
        return new f(2, bytes.length, bytes);
    }

    public static f f(long j10, ByteOrder byteOrder) {
        return g(new long[]{j10}, byteOrder);
    }

    public static f g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2337g[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j10 : jArr) {
            wrap.putInt((int) j10);
        }
        return new f(4, jArr.length, wrap.array());
    }

    public static f h(j[] jVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2337g[5] * jVarArr.length]);
        wrap.order(byteOrder);
        for (j jVar : jVarArr) {
            wrap.putInt((int) jVar.b());
            wrap.putInt((int) jVar.a());
        }
        return new f(5, jVarArr.length, wrap.array());
    }

    public static f i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f2337g[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i10 : iArr) {
            wrap.putShort((short) i10);
        }
        return new f(3, iArr.length, wrap.array());
    }

    public int j() {
        return f2337g[this.f2339a] * this.f2340b;
    }

    public String toString() {
        return "(" + f2336f[this.f2339a] + ", data length:" + this.f2342d.length + ")";
    }
}
