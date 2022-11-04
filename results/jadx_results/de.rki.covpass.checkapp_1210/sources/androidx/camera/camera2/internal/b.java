package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.camera.camera2.internal.g0;
import java.util.Objects;
/* loaded from: classes.dex */
public final class b extends g0.h {

    /* renamed from: a */
    private final String f1615a;

    /* renamed from: b */
    private final Class<?> f1616b;

    /* renamed from: c */
    private final w.c2 f1617c;

    /* renamed from: d */
    private final Size f1618d;

    public b(String str, Class<?> cls, w.c2 c2Var, Size size) {
        Objects.requireNonNull(str, "Null useCaseId");
        this.f1615a = str;
        Objects.requireNonNull(cls, "Null useCaseType");
        this.f1616b = cls;
        Objects.requireNonNull(c2Var, "Null sessionConfig");
        this.f1617c = c2Var;
        this.f1618d = size;
    }

    @Override // androidx.camera.camera2.internal.g0.h
    public w.c2 c() {
        return this.f1617c;
    }

    @Override // androidx.camera.camera2.internal.g0.h
    public Size d() {
        return this.f1618d;
    }

    @Override // androidx.camera.camera2.internal.g0.h
    public String e() {
        return this.f1615a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.h)) {
            return false;
        }
        g0.h hVar = (g0.h) obj;
        if (this.f1615a.equals(hVar.e()) && this.f1616b.equals(hVar.f()) && this.f1617c.equals(hVar.c())) {
            Size size = this.f1618d;
            Size d10 = hVar.d();
            if (size == null) {
                if (d10 == null) {
                    return true;
                }
            } else if (size.equals(d10)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.g0.h
    public Class<?> f() {
        return this.f1616b;
    }

    public int hashCode() {
        int hashCode = (((((this.f1615a.hashCode() ^ 1000003) * 1000003) ^ this.f1616b.hashCode()) * 1000003) ^ this.f1617c.hashCode()) * 1000003;
        Size size = this.f1618d;
        return hashCode ^ (size == null ? 0 : size.hashCode());
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f1615a + ", useCaseType=" + this.f1616b + ", sessionConfig=" + this.f1617c + ", surfaceResolution=" + this.f1618d + "}";
    }
}
