package jh;

import java.io.IOException;
/* loaded from: classes3.dex */
public class a extends IOException {

    /* renamed from: c */
    private Throwable f14352c;

    public a(String str, Throwable th2) {
        super(str);
        this.f14352c = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f14352c;
    }
}
