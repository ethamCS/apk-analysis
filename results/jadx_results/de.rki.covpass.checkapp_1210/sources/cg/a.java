package cg;

import eg.y;
import hc.t;
import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcg/a;", "Ljava/io/Closeable;", "Leg/c;", "Leg/f;", "suffix", BuildConfig.FLAVOR, "e", "buffer", "Ltb/e0;", "b", "close", "noContextTakeover", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class a implements Closeable {

    /* renamed from: c */
    private final boolean f6480c;

    /* renamed from: d */
    private final eg.c f6481d;

    /* renamed from: q */
    private final Deflater f6482q;

    /* renamed from: x */
    private final eg.g f6483x;

    public a(boolean z10) {
        this.f6480c = z10;
        eg.c cVar = new eg.c();
        this.f6481d = cVar;
        Deflater deflater = new Deflater(-1, true);
        this.f6482q = deflater;
        this.f6483x = new eg.g((y) cVar, deflater);
    }

    private final boolean e(eg.c cVar, eg.f fVar) {
        return cVar.f0(cVar.e1() - fVar.W(), fVar);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable, java.lang.Object, eg.c$a] */
    public final void b(eg.c cVar) {
        eg.f fVar;
        t.e(cVar, "buffer");
        if (this.f6481d.e1() == 0) {
            if (this.f6480c) {
                this.f6482q.reset();
            }
            this.f6483x.O(cVar, cVar.e1());
            this.f6483x.flush();
            eg.c cVar2 = this.f6481d;
            fVar = b.f6484a;
            if (e(cVar2, fVar)) {
                th = 0;
                try {
                    eg.c.s0(this.f6481d, th, 1, th).f(this.f6481d.e1() - 4);
                } finally {
                }
            } else {
                this.f6481d.i0(0);
            }
            eg.c cVar3 = this.f6481d;
            cVar.O(cVar3, cVar3.e1());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6483x.close();
    }
}
