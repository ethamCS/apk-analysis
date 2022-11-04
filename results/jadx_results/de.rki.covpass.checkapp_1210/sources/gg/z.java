package gg;
/* loaded from: classes3.dex */
public class z extends IllegalStateException {

    /* renamed from: c */
    private Throwable f10925c;

    public z(String str) {
        super(str);
    }

    public z(String str, Throwable th2) {
        super(str);
        this.f10925c = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f10925c;
    }
}
