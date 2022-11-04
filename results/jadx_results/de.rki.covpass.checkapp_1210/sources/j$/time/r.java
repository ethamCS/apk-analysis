package j$.time;

import j$.time.temporal.ChronoField;
/* loaded from: classes2.dex */
abstract /* synthetic */ class r {

    /* renamed from: a */
    static final /* synthetic */ int[] f13149a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f13149a = iArr;
        try {
            iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f13149a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
