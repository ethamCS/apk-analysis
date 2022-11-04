package w;

import android.util.Size;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends i2 {

    /* renamed from: a */
    private final Size f24446a;

    /* renamed from: b */
    private final Size f24447b;

    /* renamed from: c */
    private final Size f24448c;

    public f(Size size, Size size2, Size size3) {
        Objects.requireNonNull(size, "Null analysisSize");
        this.f24446a = size;
        Objects.requireNonNull(size2, "Null previewSize");
        this.f24447b = size2;
        Objects.requireNonNull(size3, "Null recordSize");
        this.f24448c = size3;
    }

    @Override // w.i2
    public Size b() {
        return this.f24446a;
    }

    @Override // w.i2
    public Size c() {
        return this.f24447b;
    }

    @Override // w.i2
    public Size d() {
        return this.f24448c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return this.f24446a.equals(i2Var.b()) && this.f24447b.equals(i2Var.c()) && this.f24448c.equals(i2Var.d());
    }

    public int hashCode() {
        return ((((this.f24446a.hashCode() ^ 1000003) * 1000003) ^ this.f24447b.hashCode()) * 1000003) ^ this.f24448c.hashCode();
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f24446a + ", previewSize=" + this.f24447b + ", recordSize=" + this.f24448c + "}";
    }
}
