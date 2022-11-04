package eg;

import eg.c;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0000\u001a\f\u0010\t\u001a\u00020\b*\u00020\bH\u0000\u001a0\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0000\u001a\f\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0000\u001a\f\u0010\u0012\u001a\u00020\u0010*\u00020\bH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\u001a\u0014\u0010\u0018\u001a\u00020\b*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0000\" \u0010\u0019\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {BuildConfig.FLAVOR, "size", "offset", "byteCount", "Ltb/e0;", "b", BuildConfig.FLAVOR, "g", BuildConfig.FLAVOR, "f", BuildConfig.FLAVOR, "a", "aOffset", "bOffset", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "h", "i", "Leg/c$a;", "unsafeCursor", "e", "Leg/f;", "position", "d", "DEFAULT__new_UnsafeCursor", "Leg/c$a;", "c", "()Leg/c$a;", "getDEFAULT__new_UnsafeCursor$annotations", "()V", "okio"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a */
    private static final c.a f9614a = new c.a();

    /* renamed from: b */
    private static final int f9615b = -1234567890;

    public static final boolean a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        hc.t.e(bArr, "a");
        hc.t.e(bArr2, "b");
        if (i12 > 0) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                    return false;
                }
                if (i14 >= i12) {
                    return true;
                }
                i13 = i14;
            }
        } else {
            return true;
        }
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final c.a c() {
        return f9614a;
    }

    public static final int d(f fVar, int i10) {
        hc.t.e(fVar, "<this>");
        return i10 == f9615b ? fVar.W() : i10;
    }

    public static final c.a e(c.a aVar) {
        hc.t.e(aVar, "unsafeCursor");
        return aVar == f9614a ? new c.a() : aVar;
    }

    public static final int f(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final short g(short s10) {
        int i10 = s10 & 65535;
        return (short) (((i10 & 255) << 8) | ((65280 & i10) >>> 8));
    }

    public static final String h(byte b10) {
        String p10;
        p10 = bf.x.p(new char[]{fg.b.f()[(b10 >> 4) & 15], fg.b.f()[b10 & 15]});
        return p10;
    }

    public static final String i(int i10) {
        String q10;
        if (i10 == 0) {
            return "0";
        }
        int i11 = 0;
        char[] cArr = {fg.b.f()[(i10 >> 28) & 15], fg.b.f()[(i10 >> 24) & 15], fg.b.f()[(i10 >> 20) & 15], fg.b.f()[(i10 >> 16) & 15], fg.b.f()[(i10 >> 12) & 15], fg.b.f()[(i10 >> 8) & 15], fg.b.f()[(i10 >> 4) & 15], fg.b.f()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        q10 = bf.x.q(cArr, i11, 8);
        return q10;
    }
}
