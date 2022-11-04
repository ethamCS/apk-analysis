package z;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a */
    private final float f26337a;

    /* renamed from: b */
    private final float f26338b;

    /* renamed from: c */
    private final float f26339c;

    /* renamed from: d */
    private final float f26340d;

    public a(float f10, float f11, float f12, float f13) {
        this.f26337a = f10;
        this.f26338b = f11;
        this.f26339c = f12;
        this.f26340d = f13;
    }

    @Override // z.f, androidx.camera.core.j3
    public float a() {
        return this.f26338b;
    }

    @Override // z.f, androidx.camera.core.j3
    public float b() {
        return this.f26337a;
    }

    @Override // z.f, androidx.camera.core.j3
    public float c() {
        return this.f26340d;
    }

    @Override // z.f, androidx.camera.core.j3
    public float d() {
        return this.f26339c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.floatToIntBits(this.f26337a) == Float.floatToIntBits(fVar.b()) && Float.floatToIntBits(this.f26338b) == Float.floatToIntBits(fVar.a()) && Float.floatToIntBits(this.f26339c) == Float.floatToIntBits(fVar.d()) && Float.floatToIntBits(this.f26340d) == Float.floatToIntBits(fVar.c());
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f26337a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f26338b)) * 1000003) ^ Float.floatToIntBits(this.f26339c)) * 1000003) ^ Float.floatToIntBits(this.f26340d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f26337a + ", maxZoomRatio=" + this.f26338b + ", minZoomRatio=" + this.f26339c + ", linearZoom=" + this.f26340d + "}";
    }
}
