package w;

import java.util.Objects;
import w.h2;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends h2 {

    /* renamed from: a */
    private final h2.b f24440a;

    /* renamed from: b */
    private final h2.a f24441b;

    public e(h2.b bVar, h2.a aVar) {
        Objects.requireNonNull(bVar, "Null configType");
        this.f24440a = bVar;
        Objects.requireNonNull(aVar, "Null configSize");
        this.f24441b = aVar;
    }

    @Override // w.h2
    public h2.a b() {
        return this.f24441b;
    }

    @Override // w.h2
    public h2.b c() {
        return this.f24440a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return this.f24440a.equals(h2Var.c()) && this.f24441b.equals(h2Var.b());
    }

    public int hashCode() {
        return ((this.f24440a.hashCode() ^ 1000003) * 1000003) ^ this.f24441b.hashCode();
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f24440a + ", configSize=" + this.f24441b + "}";
    }
}
