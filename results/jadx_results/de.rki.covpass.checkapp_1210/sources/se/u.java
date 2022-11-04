package se;

import org.conscrypt.BuildConfig;
/* loaded from: classes3.dex */
public enum u {
    IN("in"),
    OUT("out"),
    INV(BuildConfig.FLAVOR);
    

    /* renamed from: c */
    private final String f21679c;

    u(String str) {
        this.f21679c = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f21679c;
    }
}
