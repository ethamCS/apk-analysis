package ej;

import java.io.IOException;
/* loaded from: classes3.dex */
public class c extends IOException {

    /* renamed from: c */
    private Throwable f9691c;

    public c(String str) {
        super(str);
    }

    public c(String str, Throwable th2) {
        super(str);
        this.f9691c = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f9691c;
    }
}
