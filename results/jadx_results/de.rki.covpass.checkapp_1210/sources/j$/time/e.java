package j$.time;

import j$.time.temporal.ChronoUnit;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a */
    static final /* synthetic */ int[] f13020a;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f13020a = iArr;
        try {
            iArr[ChronoUnit.NANOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f13020a[ChronoUnit.MICROS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f13020a[ChronoUnit.MILLIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f13020a[ChronoUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
