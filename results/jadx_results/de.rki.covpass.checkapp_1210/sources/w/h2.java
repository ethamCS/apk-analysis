package w;
/* loaded from: classes.dex */
public abstract class h2 {

    /* loaded from: classes.dex */
    public enum a {
        ANALYSIS(0),
        PREVIEW(1),
        RECORD(2),
        MAXIMUM(3),
        NOT_SUPPORT(4);
        

        /* renamed from: c */
        final int f24472c;

        a(int i10) {
            this.f24472c = i10;
        }

        int b() {
            return this.f24472c;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    public static h2 a(b bVar, a aVar) {
        return new e(bVar, aVar);
    }

    public abstract a b();

    public abstract b c();

    public final boolean d(h2 h2Var) {
        return h2Var.b().b() <= b().b() && h2Var.c() == c();
    }
}
