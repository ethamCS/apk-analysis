package cg;

import eg.c;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000f"}, d2 = {"Lcg/f;", BuildConfig.FLAVOR, "Leg/c$a;", "cursor", BuildConfig.FLAVOR, "key", "Ltb/e0;", "b", BuildConfig.FLAVOR, "code", BuildConfig.FLAVOR, "a", "c", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a */
    public static final f f6538a = new f();

    private f() {
    }

    public final String a(int i10) {
        if (i10 < 1000 || i10 >= 5000) {
            return t.l("Code must be in range [1000,5000): ", Integer.valueOf(i10));
        }
        boolean z10 = true;
        if (!(1004 <= i10 && i10 < 1007)) {
            if (1015 > i10 || i10 >= 3000) {
                z10 = false;
            }
            if (!z10) {
                return null;
            }
        }
        return "Code " + i10 + " is reserved and may not be used.";
    }

    public final void b(c.a aVar, byte[] bArr) {
        t.e(aVar, "cursor");
        t.e(bArr, "key");
        int length = bArr.length;
        int i10 = 0;
        do {
            byte[] bArr2 = aVar.f9606y;
            int i11 = aVar.U3;
            int i12 = aVar.V3;
            if (bArr2 != null) {
                while (i11 < i12) {
                    int i13 = i10 % length;
                    bArr2[i11] = (byte) (bArr2[i11] ^ bArr[i13]);
                    i11++;
                    i10 = i13 + 1;
                }
            }
        } while (aVar.e() != -1);
    }

    public final void c(int i10) {
        String a10 = a(i10);
        if (a10 == null) {
            return;
        }
        t.b(a10);
        throw new IllegalArgumentException(a10.toString());
    }
}
