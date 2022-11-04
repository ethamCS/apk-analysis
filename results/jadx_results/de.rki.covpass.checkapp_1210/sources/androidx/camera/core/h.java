package androidx.camera.core;

import android.graphics.Matrix;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h extends q1 {

    /* renamed from: a */
    private final w.j2 f2265a;

    /* renamed from: b */
    private final long f2266b;

    /* renamed from: c */
    private final int f2267c;

    /* renamed from: d */
    private final Matrix f2268d;

    public h(w.j2 j2Var, long j10, int i10, Matrix matrix) {
        Objects.requireNonNull(j2Var, "Null tagBundle");
        this.f2265a = j2Var;
        this.f2266b = j10;
        this.f2267c = i10;
        Objects.requireNonNull(matrix, "Null sensorToBufferTransformMatrix");
        this.f2268d = matrix;
    }

    @Override // androidx.camera.core.q1, androidx.camera.core.k1
    public w.j2 a() {
        return this.f2265a;
    }

    @Override // androidx.camera.core.q1, androidx.camera.core.k1
    public long c() {
        return this.f2266b;
    }

    @Override // androidx.camera.core.q1, androidx.camera.core.k1
    public int d() {
        return this.f2267c;
    }

    @Override // androidx.camera.core.q1, androidx.camera.core.k1
    public Matrix e() {
        return this.f2268d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return this.f2265a.equals(q1Var.a()) && this.f2266b == q1Var.c() && this.f2267c == q1Var.d() && this.f2268d.equals(q1Var.e());
    }

    public int hashCode() {
        long j10 = this.f2266b;
        return ((((((this.f2265a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f2267c) * 1000003) ^ this.f2268d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f2265a + ", timestamp=" + this.f2266b + ", rotationDegrees=" + this.f2267c + ", sensorToBufferTransformMatrix=" + this.f2268d + "}";
    }
}
