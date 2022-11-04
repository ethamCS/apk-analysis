package androidx.camera.camera2.internal;
/* loaded from: classes.dex */
class x1 {

    /* renamed from: a */
    private final Object f2055a = new Object();

    /* renamed from: b */
    private final r.z f2056b;

    /* renamed from: c */
    private int f2057c;

    public x1(r.z zVar, int i10) {
        this.f2056b = zVar;
        this.f2057c = i10;
    }

    public int a() {
        int i10;
        synchronized (this.f2055a) {
            i10 = this.f2057c;
        }
        return i10;
    }

    public void b(int i10) {
        synchronized (this.f2055a) {
            this.f2057c = i10;
        }
    }
}
