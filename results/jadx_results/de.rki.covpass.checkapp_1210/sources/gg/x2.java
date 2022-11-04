package gg;

import java.io.InputStream;
/* loaded from: classes3.dex */
public abstract class x2 extends InputStream {

    /* renamed from: c */
    protected final InputStream f10917c;

    /* renamed from: d */
    private int f10918d;

    public x2(InputStream inputStream, int i10) {
        this.f10917c = inputStream;
        this.f10918d = i10;
    }

    public int b() {
        return this.f10918d;
    }

    public void e(boolean z10) {
        InputStream inputStream = this.f10917c;
        if (inputStream instanceof u2) {
            ((u2) inputStream).h(z10);
        }
    }
}
