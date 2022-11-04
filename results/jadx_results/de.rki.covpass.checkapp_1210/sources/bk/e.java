package bk;
/* loaded from: classes3.dex */
public class e extends IllegalStateException {

    /* renamed from: c */
    private Throwable f6113c;

    public e(String str, Throwable th2) {
        super(str);
        this.f6113c = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f6113c;
    }
}
