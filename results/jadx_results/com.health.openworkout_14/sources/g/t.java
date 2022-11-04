package g;

import e.i0;
import e.j0;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class t<T> {

    /* renamed from: a */
    private final i0 f4624a;
    @Nullable

    /* renamed from: b */
    private final T f4625b;

    private t(i0 i0Var, @Nullable T t, @Nullable j0 j0Var) {
        this.f4624a = i0Var;
        this.f4625b = t;
    }

    public static <T> t<T> c(j0 j0Var, i0 i0Var) {
        Objects.requireNonNull(j0Var, "body == null");
        Objects.requireNonNull(i0Var, "rawResponse == null");
        if (!i0Var.h0()) {
            return new t<>(i0Var, null, j0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> t<T> f(@Nullable T t, i0 i0Var) {
        Objects.requireNonNull(i0Var, "rawResponse == null");
        if (i0Var.h0()) {
            return new t<>(i0Var, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    public T a() {
        return this.f4625b;
    }

    public int b() {
        return this.f4624a.k();
    }

    public boolean d() {
        return this.f4624a.h0();
    }

    public String e() {
        return this.f4624a.i0();
    }

    public String toString() {
        return this.f4624a.toString();
    }
}
