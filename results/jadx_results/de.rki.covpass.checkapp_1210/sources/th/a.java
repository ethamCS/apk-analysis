package th;

import java.io.IOException;
/* loaded from: classes3.dex */
public class a extends IOException {

    /* renamed from: c */
    private final Throwable f22352c;

    public a(String str, Throwable th2) {
        super(str);
        this.f22352c = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f22352c;
    }
}
