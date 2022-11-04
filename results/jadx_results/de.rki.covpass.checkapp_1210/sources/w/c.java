package w;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends y0 {

    /* renamed from: a */
    private final Object f24409a;

    public c(Object obj) {
        Objects.requireNonNull(obj, "Null value");
        this.f24409a = obj;
    }

    @Override // w.y0
    public Object b() {
        return this.f24409a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        return this.f24409a.equals(((y0) obj).b());
    }

    public int hashCode() {
        return this.f24409a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f24409a + "}";
    }
}
