package ak;
/* loaded from: classes3.dex */
public class p extends RuntimeException {

    /* renamed from: c */
    private Throwable f562c;

    public p(String str, Throwable th2) {
        super(str);
        this.f562c = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f562c;
    }
}
