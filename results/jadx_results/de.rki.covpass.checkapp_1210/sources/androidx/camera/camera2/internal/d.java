package androidx.camera.camera2.internal;
/* loaded from: classes.dex */
public class d implements w.g {

    /* renamed from: a */
    private final boolean f1636a;

    /* renamed from: b */
    private final int f1637b;

    /* renamed from: c */
    private final u.c f1638c;

    public d(String str, r.z zVar) {
        boolean z10;
        int i10;
        try {
            i10 = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            androidx.camera.core.s1.k("Camera2CamcorderProfileProvider", "Camera id is not an integer: " + str + ", unable to create CamcorderProfileProvider");
            z10 = false;
            i10 = -1;
        }
        this.f1636a = z10;
        this.f1637b = i10;
        this.f1638c = new u.c((t.e) t.g.a(str, zVar).b(t.e.class));
    }
}
