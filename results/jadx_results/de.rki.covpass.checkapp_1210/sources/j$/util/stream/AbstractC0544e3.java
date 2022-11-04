package j$.util.stream;
/* renamed from: j$.util.stream.e3 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0544e3 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f13683a = {1, 2, 3, 4};

    public static /* synthetic */ int a(int i10) {
        if (i10 != 0) {
            return i10 - 1;
        }
        throw null;
    }

    public static /* synthetic */ String b(int i10) {
        return i10 == 1 ? "REFERENCE" : i10 == 2 ? "INT_VALUE" : i10 == 3 ? "LONG_VALUE" : i10 == 4 ? "DOUBLE_VALUE" : "null";
    }

    public static /* synthetic */ int[] c(int i10) {
        int[] iArr = new int[i10];
        System.arraycopy(f13683a, 0, iArr, 0, i10);
        return iArr;
    }
}
