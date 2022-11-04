package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.b3;
import java.util.Objects;
/* loaded from: classes.dex */
public final class i extends b3.f {

    /* renamed from: a */
    private final int f2301a;

    /* renamed from: b */
    private final Surface f2302b;

    public i(int i10, Surface surface) {
        this.f2301a = i10;
        Objects.requireNonNull(surface, "Null surface");
        this.f2302b = surface;
    }

    @Override // androidx.camera.core.b3.f
    public int a() {
        return this.f2301a;
    }

    @Override // androidx.camera.core.b3.f
    public Surface b() {
        return this.f2302b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b3.f)) {
            return false;
        }
        b3.f fVar = (b3.f) obj;
        return this.f2301a == fVar.a() && this.f2302b.equals(fVar.b());
    }

    public int hashCode() {
        return ((this.f2301a ^ 1000003) * 1000003) ^ this.f2302b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f2301a + ", surface=" + this.f2302b + "}";
    }
}
