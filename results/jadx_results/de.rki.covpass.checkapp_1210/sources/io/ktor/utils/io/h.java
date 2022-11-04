package io.ktor.utils.io;

import hc.v;
import kotlin.Lazy;
import kotlin.Metadata;
import ob.f0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\bf\u0018\u0000 \u001f2\u00020\u0001:\u0001 J+\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&R\u0014\u0010\u0018\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lio/ktor/utils/io/h;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "dst", BuildConfig.FLAVOR, "offset", "length", "i", "([BIILxb/d;)Ljava/lang/Object;", "Lob/f0;", "h", "(Lob/f0;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "limit", "headerSizeHint", "Lob/u;", "l", "(JILxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "cause", BuildConfig.FLAVOR, "g", "k", "()I", "availableForRead", "m", "()Z", "isClosedForRead", "j", "()Ljava/lang/Throwable;", "closedCause", "Companion", "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface h {
    public static final a Companion = a.f12860a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lio/ktor/utils/io/h$a;", BuildConfig.FLAVOR, "Lio/ktor/utils/io/h;", "b", "Lkotlin/Lazy;", "a", "()Lio/ktor/utils/io/h;", "Empty", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f12860a = new a();

        /* renamed from: b */
        private static final Lazy<c> f12861b = tb.l.a(C0194a.f12862c);

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/utils/io/c;", "b", "()Lio/ktor/utils/io/c;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: io.ktor.utils.io.h$a$a */
        /* loaded from: classes.dex */
        static final class C0194a extends v implements gc.a<c> {

            /* renamed from: c */
            public static final C0194a f12862c = new C0194a();

            C0194a() {
                super(0);
            }

            /* renamed from: b */
            public final c invoke() {
                c c10 = e.c(false, 1, null);
                l.a(c10);
                return c10;
            }
        }

        private a() {
        }

        public final h a() {
            return f12861b.getValue();
        }
    }

    boolean g(Throwable th2);

    Object h(f0 f0Var, xb.d<? super Integer> dVar);

    Object i(byte[] bArr, int i10, int i11, xb.d<? super Integer> dVar);

    Throwable j();

    int k();

    Object l(long j10, int i10, xb.d<? super ob.u> dVar);

    boolean m();
}
