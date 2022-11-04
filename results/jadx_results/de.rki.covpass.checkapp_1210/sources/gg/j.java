package gg;

import java.io.IOException;
/* loaded from: classes3.dex */
public class j extends IOException {

    /* renamed from: c */
    private Throwable f10836c;

    public j(String str) {
        super(str);
    }

    public j(String str, Throwable th2) {
        super(str);
        this.f10836c = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f10836c;
    }
}
