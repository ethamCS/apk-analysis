package org.bouncycastle.crypto;
/* loaded from: classes3.dex */
public class j extends Exception {

    /* renamed from: c */
    private Throwable f18651c;

    public j(String str) {
        super(str);
    }

    public j(String str, Throwable th2) {
        super(str);
        this.f18651c = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f18651c;
    }
}
