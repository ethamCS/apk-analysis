package cg;

import eg.a0;
import eg.l;
import hc.t;
import java.io.Closeable;
import java.util.zip.Inflater;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcg/c;", "Ljava/io/Closeable;", "Leg/c;", "buffer", "Ltb/e0;", "b", "close", BuildConfig.FLAVOR, "noContextTakeover", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class c implements Closeable {

    /* renamed from: c */
    private final boolean f6485c;

    /* renamed from: d */
    private final eg.c f6486d;

    /* renamed from: q */
    private final Inflater f6487q;

    /* renamed from: x */
    private final l f6488x;

    public c(boolean z10) {
        this.f6485c = z10;
        eg.c cVar = new eg.c();
        this.f6486d = cVar;
        Inflater inflater = new Inflater(true);
        this.f6487q = inflater;
        this.f6488x = new l((a0) cVar, inflater);
    }

    public final void b(eg.c cVar) {
        t.e(cVar, "buffer");
        if (this.f6486d.e1() == 0) {
            if (this.f6485c) {
                this.f6487q.reset();
            }
            this.f6486d.G0(cVar);
            this.f6486d.U(65535);
            long bytesRead = this.f6487q.getBytesRead() + this.f6486d.e1();
            do {
                this.f6488x.b(cVar, Long.MAX_VALUE);
            } while (this.f6487q.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6488x.close();
    }
}
