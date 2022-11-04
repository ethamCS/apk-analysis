package j$.time;

import j$.time.temporal.ChronoField;
/* loaded from: classes2.dex */
abstract /* synthetic */ class p {

    /* renamed from: a */
    static final /* synthetic */ int[] f13147a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f13147a = iArr;
        try {
            iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f13147a[ChronoField.MONTH_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
