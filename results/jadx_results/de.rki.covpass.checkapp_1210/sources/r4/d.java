package r4;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    private float f20468a;

    /* renamed from: b */
    private float f20469b;

    public d() {
        this(1.0f, 1.0f);
    }

    public d(float f10, float f11) {
        this.f20468a = f10;
        this.f20469b = f11;
    }

    public boolean a(float f10, float f11) {
        return this.f20468a == f10 && this.f20469b == f11;
    }

    public float b() {
        return this.f20468a;
    }

    public float c() {
        return this.f20469b;
    }

    public void d(float f10, float f11) {
        this.f20468a = f10;
        this.f20469b = f11;
    }

    public String toString() {
        return b() + "x" + c();
    }
}
