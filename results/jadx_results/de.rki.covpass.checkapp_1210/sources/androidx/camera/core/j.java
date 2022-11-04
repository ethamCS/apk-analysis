package androidx.camera.core;

import android.graphics.Rect;
import androidx.camera.core.b3;
import java.util.Objects;
/* loaded from: classes.dex */
public final class j extends b3.g {

    /* renamed from: a */
    private final Rect f2381a;

    /* renamed from: b */
    private final int f2382b;

    /* renamed from: c */
    private final int f2383c;

    public j(Rect rect, int i10, int i11) {
        Objects.requireNonNull(rect, "Null cropRect");
        this.f2381a = rect;
        this.f2382b = i10;
        this.f2383c = i11;
    }

    @Override // androidx.camera.core.b3.g
    public Rect a() {
        return this.f2381a;
    }

    @Override // androidx.camera.core.b3.g
    public int b() {
        return this.f2382b;
    }

    @Override // androidx.camera.core.b3.g
    public int c() {
        return this.f2383c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b3.g)) {
            return false;
        }
        b3.g gVar = (b3.g) obj;
        return this.f2381a.equals(gVar.a()) && this.f2382b == gVar.b() && this.f2383c == gVar.c();
    }

    public int hashCode() {
        return ((((this.f2381a.hashCode() ^ 1000003) * 1000003) ^ this.f2382b) * 1000003) ^ this.f2383c;
    }

    public String toString() {
        return "TransformationInfo{cropRect=" + this.f2381a + ", rotationDegrees=" + this.f2382b + ", targetRotation=" + this.f2383c + "}";
    }
}
