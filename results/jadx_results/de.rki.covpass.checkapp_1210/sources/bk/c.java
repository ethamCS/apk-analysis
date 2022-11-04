package bk;
/* loaded from: classes3.dex */
public class c extends IllegalStateException {

    /* renamed from: c */
    private Throwable f6112c;

    public c(String str, Throwable th2) {
        super(str);
        this.f6112c = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f6112c;
    }
}
