package fg;

import eg.c;
import eg.e0;
import eg.f0;
import eg.q;
import eg.v;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a0\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\bH\u0000\u001a\u0014\u0010\u0015\u001a\u00020\u0013*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\" \u0010\u0016\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Leg/v;", "segment", BuildConfig.FLAVOR, "segmentPos", BuildConfig.FLAVOR, "bytes", "bytesOffset", "bytesLimit", BuildConfig.FLAVOR, "c", "Leg/c;", BuildConfig.FLAVOR, "newline", BuildConfig.FLAVOR, "d", "Leg/q;", "options", "selectTruncated", "e", "Leg/c$a;", "unsafeCursor", "a", "HEX_DIGIT_BYTES", "[B", "b", "()[B", "getHEX_DIGIT_BYTES$annotations", "()V", "okio"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a */
    private static final byte[] f10198a = e0.a("0123456789abcdef");

    public static final c.a a(eg.c cVar, c.a aVar) {
        t.e(cVar, "<this>");
        t.e(aVar, "unsafeCursor");
        c.a e10 = f0.e(aVar);
        if (e10.f9602c == null) {
            e10.f9602c = cVar;
            e10.f9603d = true;
            return e10;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    public static final byte[] b() {
        return f10198a;
    }

    public static final boolean c(v vVar, int i10, byte[] bArr, int i11, int i12) {
        t.e(vVar, "segment");
        t.e(bArr, "bytes");
        int i13 = vVar.f9652c;
        byte[] bArr2 = vVar.f9650a;
        while (i11 < i12) {
            if (i10 == i13) {
                vVar = vVar.f9655f;
                t.b(vVar);
                byte[] bArr3 = vVar.f9650a;
                bArr2 = bArr3;
                i10 = vVar.f9651b;
                i13 = vVar.f9652c;
            }
            if (bArr2[i10] != bArr[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String d(eg.c cVar, long j10) {
        t.e(cVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (cVar.M(j11) == ((byte) 13)) {
                String R0 = cVar.R0(j11);
                cVar.skip(2L);
                return R0;
            }
        }
        String R02 = cVar.R0(j10);
        cVar.skip(1L);
        return R02;
    }

    public static final int e(eg.c cVar, q qVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        v vVar;
        int i13;
        t.e(cVar, "<this>");
        t.e(qVar, "options");
        v vVar2 = cVar.f9600c;
        if (vVar2 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = vVar2.f9650a;
        int i14 = vVar2.f9651b;
        int i15 = vVar2.f9652c;
        int[] f10 = qVar.f();
        v vVar3 = vVar2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = f10[i17];
            int i20 = i18 + 1;
            int i21 = f10[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (vVar3 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & 255;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == f10[i20]) {
                        i11 = f10[i20 + i19];
                        if (i10 == i15) {
                            vVar3 = vVar3.f9655f;
                            t.b(vVar3);
                            i10 = vVar3.f9651b;
                            bArr = vVar3.f9650a;
                            i15 = vVar3.f9652c;
                            if (vVar3 == vVar2) {
                                vVar3 = null;
                            }
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i24 = i20 + (i19 * (-1));
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & 255) != f10[i20]) {
                    return i16;
                }
                boolean z11 = i26 == i24;
                if (i25 == i15) {
                    t.b(vVar3);
                    v vVar4 = vVar3.f9655f;
                    t.b(vVar4);
                    i13 = vVar4.f9651b;
                    byte[] bArr2 = vVar4.f9650a;
                    i12 = vVar4.f9652c;
                    if (vVar4 != vVar2) {
                        vVar = vVar4;
                        bArr = bArr2;
                    } else if (!z11) {
                        break loop0;
                    } else {
                        bArr = bArr2;
                        vVar = null;
                    }
                } else {
                    v vVar5 = vVar3;
                    i12 = i15;
                    i13 = i25;
                    vVar = vVar5;
                }
                if (z11) {
                    i11 = f10[i26];
                    i10 = i13;
                    i15 = i12;
                    vVar3 = vVar;
                    break;
                }
                i14 = i13;
                i15 = i12;
                i20 = i26;
                vVar3 = vVar;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (!z10) {
            return i16;
        }
        return -2;
    }

    public static /* synthetic */ int f(eg.c cVar, q qVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e(cVar, qVar, z10);
    }
}
