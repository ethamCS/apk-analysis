package e.m0.h;

import java.io.IOException;
/* loaded from: classes.dex */
public final class i extends RuntimeException {

    /* renamed from: b */
    private IOException f4129b;

    /* renamed from: c */
    private IOException f4130c;

    public i(IOException iOException) {
        super(iOException);
        this.f4129b = iOException;
        this.f4130c = iOException;
    }

    public void a(IOException iOException) {
        e.m0.e.a(this.f4129b, iOException);
        this.f4130c = iOException;
    }

    public IOException e() {
        return this.f4129b;
    }

    public IOException f() {
        return this.f4130c;
    }
}
