package y5;

import f6.c0;
import f6.i0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final byte[] f25805a = new byte[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25806a;

        static {
            int[] iArr = new int[i0.values().length];
            f25806a = iArr;
            try {
                iArr[i0.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25806a[i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25806a[i0.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25806a[i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(c0.c cVar) {
        ByteBuffer put;
        int i10 = a.f25806a[cVar.U().ordinal()];
        if (i10 == 1 || i10 == 2) {
            put = ByteBuffer.allocate(5).put((byte) 0);
        } else if (i10 != 3) {
            if (i10 != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            return f25805a;
        } else {
            put = ByteBuffer.allocate(5).put((byte) 1);
        }
        return put.putInt(cVar.T()).array();
    }
}
