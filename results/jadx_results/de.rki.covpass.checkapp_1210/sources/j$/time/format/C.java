package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class C {

    /* renamed from: a */
    public static final C f13028a = new C();

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private C() {
    }

    public final int a(char c10) {
        int i10 = c10 - '0';
        if (i10 < 0 || i10 > 9) {
            return -1;
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        Objects.requireNonNull((C) obj);
        return true;
    }

    public final int hashCode() {
        return 182;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
