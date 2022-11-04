package gk;
/* loaded from: classes3.dex */
public class b extends Exception {

    /* renamed from: c */
    Throwable f11066c;

    public b(String str, Throwable th2) {
        super(str);
        this.f11066c = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f11066c;
    }
}
