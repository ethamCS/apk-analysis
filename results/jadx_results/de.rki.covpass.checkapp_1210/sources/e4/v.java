package e4;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class v<V> {

    /* renamed from: a */
    private final V f9460a;

    /* renamed from: b */
    private final Throwable f9461b;

    public v(V v10) {
        this.f9460a = v10;
        this.f9461b = null;
    }

    public v(Throwable th2) {
        this.f9461b = th2;
        this.f9460a = null;
    }

    public Throwable a() {
        return this.f9461b;
    }

    public V b() {
        return this.f9460a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (b() != null && b().equals(vVar.b())) {
            return true;
        }
        if (a() != null && vVar.a() != null) {
            return a().toString().equals(a().toString());
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }
}
