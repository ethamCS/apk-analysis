package j$.time;

import j$.time.temporal.ChronoField;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class A {

    /* renamed from: a */
    static final /* synthetic */ int[] f12961a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f12961a = iArr;
        try {
            iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12961a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
