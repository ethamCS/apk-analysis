package wf;

import bf.x;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¨\u0006\u0010"}, d2 = {"Lwf/e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "inbound", BuildConfig.FLAVOR, "streamId", "length", "type", "flags", BuildConfig.FLAVOR, "c", "b", "(I)Ljava/lang/String;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a */
    public static final e f24922a = new e();

    /* renamed from: b */
    public static final eg.f f24923b = eg.f.Companion.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c */
    private static final String[] f24924c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d */
    private static final String[] f24925d = new String[64];

    /* renamed from: e */
    private static final String[] f24926e;

    static {
        String D;
        String[] strArr = new String[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            String binaryString = Integer.toBinaryString(i11);
            t.d(binaryString, "toBinaryString(it)");
            D = x.D(pf.d.t("%8s", binaryString), ' ', '0', false, 4, null);
            strArr[i11] = D;
        }
        f24926e = strArr;
        String[] strArr2 = f24925d;
        strArr2[0] = BuildConfig.FLAVOR;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i12 = 0;
        while (i12 < 1) {
            int i13 = iArr[i12];
            i12++;
            String[] strArr3 = f24925d;
            strArr3[i13 | 8] = t.l(strArr3[i13], "|PADDED");
        }
        String[] strArr4 = f24925d;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i14 = 0;
        while (i14 < 3) {
            int i15 = iArr2[i14];
            i14++;
            int i16 = 0;
            while (i16 < 1) {
                int i17 = iArr[i16];
                i16++;
                String[] strArr5 = f24925d;
                int i18 = i17 | i15;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) strArr5[i17]);
                sb2.append('|');
                sb2.append((Object) strArr5[i15]);
                strArr5[i18] = sb2.toString();
                strArr5[i18 | 8] = ((Object) strArr5[i17]) + '|' + ((Object) strArr5[i15]) + "|PADDED";
            }
        }
        int length = f24925d.length;
        while (i10 < length) {
            int i19 = i10 + 1;
            String[] strArr6 = f24925d;
            if (strArr6[i10] == null) {
                strArr6[i10] = f24926e[i10];
            }
            i10 = i19;
        }
    }

    private e() {
    }

    public final String a(int i10, int i11) {
        String str;
        boolean z10;
        int i12;
        Object obj;
        String str2;
        String str3;
        String E;
        if (i11 == 0) {
            return BuildConfig.FLAVOR;
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f24926e[i11];
            } else if (i10 != 7 && i10 != 8) {
                String[] strArr = f24925d;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    t.b(str);
                } else {
                    str = f24926e[i11];
                }
                String str4 = str;
                if (i10 == 5 && (i11 & 4) != 0) {
                    z10 = false;
                    i12 = 4;
                    obj = null;
                    str2 = "HEADERS";
                    str3 = "PUSH_PROMISE";
                } else if (i10 != 0 || (i11 & 32) == 0) {
                    return str4;
                } else {
                    z10 = false;
                    i12 = 4;
                    obj = null;
                    str2 = "PRIORITY";
                    str3 = "COMPRESSED";
                }
                E = x.E(str4, str2, str3, z10, i12, obj);
                return E;
            }
        }
        return f24926e[i11];
    }

    public final String b(int i10) {
        String[] strArr = f24924c;
        return i10 < strArr.length ? strArr[i10] : pf.d.t("0x%02x", Integer.valueOf(i10));
    }

    public final String c(boolean z10, int i10, int i11, int i12, int i13) {
        return pf.d.t("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(i12), a(i12, i13));
    }
}
