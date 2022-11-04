package j4;
/* loaded from: classes.dex */
public class g {

    /* renamed from: b */
    private static final g f14005b = new g();

    /* renamed from: a */
    private final i0.e<String, e4.h> f14006a = new i0.e<>(20);

    g() {
    }

    public static g b() {
        return f14005b;
    }

    public e4.h a(String str) {
        if (str == null) {
            return null;
        }
        return this.f14006a.c(str);
    }

    public void c(String str, e4.h hVar) {
        if (str == null) {
            return;
        }
        this.f14006a.d(str, hVar);
    }
}
