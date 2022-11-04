package j$.time.chrono;

import j$.time.temporal.ChronoField;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a */
    static final /* synthetic */ int[] f13016a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f13016a = iArr;
        try {
            iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f13016a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
