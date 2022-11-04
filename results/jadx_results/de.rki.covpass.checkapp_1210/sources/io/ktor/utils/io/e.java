package io.ktor.utils.io;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006\u001a*\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0016\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0007¨\u0006\u000f"}, d2 = {BuildConfig.FLAVOR, "autoFlush", "Lio/ktor/utils/io/c;", "a", BuildConfig.FLAVOR, "content", BuildConfig.FLAVOR, "offset", "length", "Lio/ktor/utils/io/h;", "e", "Lkotlin/Function1;", BuildConfig.FLAVOR, "exceptionMapper", "b", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class e {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"io/ktor/utils/io/e$a", "Lio/ktor/utils/io/a;", BuildConfig.FLAVOR, "cause", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends io.ktor.utils.io.a {

        /* renamed from: q */
        final /* synthetic */ boolean f12835q;

        /* renamed from: r */
        final /* synthetic */ gc.l<Throwable, Throwable> f12836r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, gc.l<? super Throwable, ? extends Throwable> lVar) {
            super(z10, null, 0, 6, null);
            this.f12835q = z10;
            this.f12836r = lVar;
        }

        @Override // io.ktor.utils.io.a, io.ktor.utils.io.k
        public boolean a(Throwable th2) {
            return super.a(this.f12836r.invoke(th2));
        }
    }

    public static final c a(boolean z10) {
        return new io.ktor.utils.io.a(z10, null, 0, 6, null);
    }

    public static final c b(boolean z10, gc.l<? super Throwable, ? extends Throwable> lVar) {
        hc.t.e(lVar, "exceptionMapper");
        return new a(z10, lVar);
    }

    public static /* synthetic */ c c(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }

    public static /* synthetic */ c d(boolean z10, gc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return b(z10, lVar);
    }

    public static final h e(byte[] bArr, int i10, int i11) {
        hc.t.e(bArr, "content");
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i10, i11);
        hc.t.d(wrap, "wrap(content, offset, length)");
        return new io.ktor.utils.io.a(wrap);
    }
}
