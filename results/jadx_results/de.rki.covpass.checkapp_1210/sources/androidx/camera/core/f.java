package androidx.camera.core;

import androidx.camera.core.t;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends t {

    /* renamed from: a */
    private final t.b f2168a;

    /* renamed from: b */
    private final t.a f2169b;

    public f(t.b bVar, t.a aVar) {
        Objects.requireNonNull(bVar, "Null type");
        this.f2168a = bVar;
        this.f2169b = aVar;
    }

    @Override // androidx.camera.core.t
    public t.a c() {
        return this.f2169b;
    }

    @Override // androidx.camera.core.t
    public t.b d() {
        return this.f2168a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f2168a.equals(tVar.d())) {
            t.a aVar = this.f2169b;
            t.a c10 = tVar.c();
            if (aVar == null) {
                if (c10 == null) {
                    return true;
                }
            } else if (aVar.equals(c10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f2168a.hashCode() ^ 1000003) * 1000003;
        t.a aVar = this.f2169b;
        return hashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f2168a + ", error=" + this.f2169b + "}";
    }
}
