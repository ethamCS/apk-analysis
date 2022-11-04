package h6;
/* loaded from: classes.dex */
public final class h extends p {

    /* renamed from: q */
    private static final h f11344q;

    static {
        h hVar = new h();
        f11344q = hVar;
        hVar.setStackTrace(p.f11359d);
    }

    private h() {
    }

    private h(Throwable th2) {
        super(th2);
    }

    public static h b() {
        return p.f11358c ? new h() : f11344q;
    }

    public static h c(Throwable th2) {
        return p.f11358c ? new h(th2) : f11344q;
    }
}
