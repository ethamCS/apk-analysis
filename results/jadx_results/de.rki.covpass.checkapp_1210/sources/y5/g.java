package y5;

import com.google.errorprone.annotations.Immutable;
import f6.a0;
import f6.i0;
@Immutable
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private final a0 f25810a;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25811a;

        /* renamed from: b */
        static final /* synthetic */ int[] f25812b;

        static {
            int[] iArr = new int[b.values().length];
            f25812b = iArr;
            try {
                iArr[b.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25812b[b.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25812b[b.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25812b[b.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i0.values().length];
            f25811a = iArr2;
            try {
                iArr2[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25811a[i0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25811a[i0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25811a[i0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    private g(a0 a0Var) {
        this.f25810a = a0Var;
    }

    public static g a(String str, byte[] bArr, b bVar) {
        return new g(a0.V().C(str).D(com.google.crypto.tink.shaded.protobuf.i.i(bArr)).B(c(bVar)).b());
    }

    private static i0 c(b bVar) {
        int i10 = a.f25812b[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return i0.LEGACY;
            }
            if (i10 == 3) {
                return i0.RAW;
            }
            if (i10 != 4) {
                throw new IllegalArgumentException("Unknown output prefix type");
            }
            return i0.CRUNCHY;
        }
        return i0.TINK;
    }

    public a0 b() {
        return this.f25810a;
    }
}
