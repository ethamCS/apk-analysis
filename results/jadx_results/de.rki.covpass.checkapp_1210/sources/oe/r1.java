package oe;

import org.conscrypt.BuildConfig;
/* loaded from: classes3.dex */
public enum r1 {
    INVARIANT(BuildConfig.FLAVOR, true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);
    

    /* renamed from: c */
    private final String f18038c;

    /* renamed from: d */
    private final boolean f18039d;

    /* renamed from: q */
    private final boolean f18040q;

    /* renamed from: x */
    private final int f18041x;

    r1(String str, boolean z10, boolean z11, int i10) {
        this.f18038c = str;
        this.f18039d = z10;
        this.f18040q = z11;
        this.f18041x = i10;
    }

    public final boolean g() {
        return this.f18040q;
    }

    public final String h() {
        return this.f18038c;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f18038c;
    }
}
