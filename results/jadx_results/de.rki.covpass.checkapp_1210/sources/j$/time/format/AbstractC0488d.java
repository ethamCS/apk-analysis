package j$.time.format;
/* renamed from: j$.time.format.d */
/* loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC0488d {

    /* renamed from: a */
    static final /* synthetic */ int[] f13067a;

    static {
        int[] iArr = new int[SignStyle.values().length];
        f13067a = iArr;
        try {
            iArr[SignStyle.EXCEEDS_PAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f13067a[SignStyle.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f13067a[SignStyle.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f13067a[SignStyle.NOT_NEGATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
