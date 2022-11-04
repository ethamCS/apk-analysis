package j$.util;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
/* renamed from: j$.util.j */
/* loaded from: classes2.dex */
public abstract class AbstractC0511j {
    public static Optional a(C0510i c0510i) {
        if (c0510i == null) {
            return null;
        }
        return c0510i.c() ? Optional.of(c0510i.b()) : Optional.empty();
    }

    public static OptionalDouble b(C0512k c0512k) {
        if (c0512k == null) {
            return null;
        }
        return c0512k.c() ? OptionalDouble.of(c0512k.b()) : OptionalDouble.empty();
    }

    public static OptionalInt c(C0513l c0513l) {
        if (c0513l == null) {
            return null;
        }
        return c0513l.c() ? OptionalInt.of(c0513l.b()) : OptionalInt.empty();
    }

    public static OptionalLong d(C0514m c0514m) {
        if (c0514m == null) {
            return null;
        }
        return c0514m.c() ? OptionalLong.of(c0514m.b()) : OptionalLong.empty();
    }
}
