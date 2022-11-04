package w;

import android.util.Size;
import android.view.Surface;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends v1 {

    /* renamed from: a */
    private final Surface f24431a;

    /* renamed from: b */
    private final Size f24432b;

    /* renamed from: c */
    private final int f24433c;

    public d(Surface surface, Size size, int i10) {
        Objects.requireNonNull(surface, "Null surface");
        this.f24431a = surface;
        Objects.requireNonNull(size, "Null size");
        this.f24432b = size;
        this.f24433c = i10;
    }

    @Override // w.v1
    public int b() {
        return this.f24433c;
    }

    @Override // w.v1
    public Size c() {
        return this.f24432b;
    }

    @Override // w.v1
    public Surface d() {
        return this.f24431a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return this.f24431a.equals(v1Var.d()) && this.f24432b.equals(v1Var.c()) && this.f24433c == v1Var.b();
    }

    public int hashCode() {
        return ((((this.f24431a.hashCode() ^ 1000003) * 1000003) ^ this.f24432b.hashCode()) * 1000003) ^ this.f24433c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f24431a + ", size=" + this.f24432b + ", imageFormat=" + this.f24433c + "}";
    }
}
