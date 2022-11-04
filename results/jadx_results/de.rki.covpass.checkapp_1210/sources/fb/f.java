package fb;

import java.util.Iterator;
import kotlin.Metadata;
import ob.i0;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ub.k0;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0005H\u0000¨\u0006\u000b"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "c", "Lob/u;", "b", BuildConfig.FLAVOR, "from", "Ltb/e0;", "a", BuildConfig.FLAVOR, "d", "ktor-utils"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private static final int[] f10117a;

    static {
        int Z;
        int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i10 = 0; i10 < 256; i10++) {
            Z = bf.y.Z("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (char) i10, 0, false, 6, null);
            iArr[i10] = Z;
        }
        f10117a = iArr;
    }

    public static final void a(byte[] bArr, int i10) {
        nc.g i11;
        hc.t.e(bArr, "<this>");
        i11 = nc.m.i(i10, bArr.length);
        Iterator<Integer> it = i11.iterator();
        while (it.hasNext()) {
            bArr[((k0) it).b()] = 0;
        }
    }

    public static final String b(ob.u uVar) {
        hc.t.e(uVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        byte[] bArr = new byte[3];
        while (uVar.D0() > 0) {
            int b10 = ob.a0.b(uVar, bArr, 0, 0, 6, null);
            a(bArr, b10);
            int i10 = ((3 - b10) * 8) / 6;
            int i11 = 0;
            int i12 = ((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255);
            if (i10 <= 3) {
                int i13 = 3;
                while (true) {
                    int i14 = i13 - 1;
                    sb2.append(d((i12 >> (i13 * 6)) & 63));
                    if (i13 == i10) {
                        break;
                    }
                    i13 = i14;
                }
            }
            while (i11 < i10) {
                i11++;
                sb2.append('=');
            }
        }
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final String c(byte[] bArr) {
        hc.t.e(bArr, "<this>");
        ob.r a10 = ob.k0.a(0);
        try {
            i0.d(a10, bArr, 0, 0, 6, null);
            return b(a10.q1());
        } catch (Throwable th2) {
            a10.z0();
            throw th2;
        }
    }

    public static final char d(int i10) {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(i10);
    }
}
