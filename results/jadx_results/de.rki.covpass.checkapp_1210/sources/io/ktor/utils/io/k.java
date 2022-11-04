package io.ktor.utils.io;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import ob.f0;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0011H¦@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&J\b\u0010\u0019\u001a\u00020\u0007H&R\u0014\u0010\u001c\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lio/ktor/utils/io/k;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "src", BuildConfig.FLAVOR, "offset", "length", "Ltb/e0;", "e", "([BIILxb/d;)Ljava/lang/Object;", "Lob/f0;", "b", "(Lob/f0;Lxb/d;)Ljava/lang/Object;", "Ljava/nio/ByteBuffer;", "c", "(Ljava/nio/ByteBuffer;Lxb/d;)Ljava/lang/Object;", "min", "Lkotlin/Function1;", "block", "f", "(ILgc/l;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "cause", BuildConfig.FLAVOR, "a", "flush", "n", "()Z", "autoFlush", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface k {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ Object a(k kVar, int i10, gc.l lVar, xb.d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    i10 = 1;
                }
                return kVar.f(i10, lVar, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
    }

    boolean a(Throwable th2);

    Object b(f0 f0Var, xb.d<? super e0> dVar);

    Object c(ByteBuffer byteBuffer, xb.d<? super e0> dVar);

    Object e(byte[] bArr, int i10, int i11, xb.d<? super e0> dVar);

    Object f(int i10, gc.l<? super ByteBuffer, e0> lVar, xb.d<? super e0> dVar);

    void flush();

    boolean n();
}
