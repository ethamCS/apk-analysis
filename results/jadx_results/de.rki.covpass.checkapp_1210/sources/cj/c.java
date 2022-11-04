package cj;

import java.io.IOException;
/* loaded from: classes3.dex */
public class c extends IOException {

    /* renamed from: c */
    Exception f6621c;

    public c(String str) {
        super(str);
    }

    public c(String str, Exception exc) {
        super(str);
        this.f6621c = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f6621c;
    }
}
