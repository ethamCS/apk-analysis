package e4;
/* loaded from: classes.dex */
public enum a0 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9376a;

        static {
            int[] iArr = new int[a0.values().length];
            f9376a = iArr;
            try {
                iArr[a0.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9376a[a0.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9376a[a0.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean b(int i10, boolean z10, int i11) {
        int i12 = a.f9376a[ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                return true;
            }
            return (z10 && i10 < 28) || i11 > 4 || i10 <= 25;
        }
        return false;
    }
}
