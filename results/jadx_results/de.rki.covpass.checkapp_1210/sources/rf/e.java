package rf;

import eg.h;
import eg.y;
import gc.l;
import hc.t;
import java.io.IOException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, d2 = {"Lrf/e;", "Leg/h;", "Leg/c;", "source", BuildConfig.FLAVOR, "byteCount", "Ltb/e0;", "O", "flush", "close", "Leg/y;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "onException", "<init>", "(Leg/y;Lgc/l;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class e extends h {

    /* renamed from: d */
    private final l<IOException, e0> f21201d;

    /* renamed from: q */
    private boolean f21202q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(y yVar, l<? super IOException, e0> lVar) {
        super(yVar);
        t.e(yVar, "delegate");
        t.e(lVar, "onException");
        this.f21201d = lVar;
    }

    @Override // eg.h, eg.y
    public void O(eg.c cVar, long j10) {
        t.e(cVar, "source");
        if (this.f21202q) {
            cVar.skip(j10);
            return;
        }
        try {
            super.O(cVar, j10);
        } catch (IOException e10) {
            this.f21202q = true;
            this.f21201d.invoke(e10);
        }
    }

    @Override // eg.h, eg.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f21202q) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f21202q = true;
            this.f21201d.invoke(e10);
        }
    }

    @Override // eg.h, eg.y, java.io.Flushable
    public void flush() {
        if (this.f21202q) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f21202q = true;
            this.f21201d.invoke(e10);
        }
    }
}
