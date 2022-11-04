package io.ktor.utils.io.jvm.javaio;

import hc.t;
import java.io.InputStream;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.e2;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0013\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\"\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/d;", "Ljava/io/InputStream;", BuildConfig.FLAVOR, "available", "read", BuildConfig.FLAVOR, "b", "off", "len", "Ltb/e0;", "close", "Lio/ktor/utils/io/h;", "c", "Lio/ktor/utils/io/h;", "channel", "Lkotlinx/coroutines/b0;", "d", "Lkotlinx/coroutines/b0;", "context", "io/ktor/utils/io/jvm/javaio/d$a", "q", "Lio/ktor/utils/io/jvm/javaio/d$a;", "loop", "x", "[B", "single", "Lkotlinx/coroutines/a2;", "parent", "<init>", "(Lkotlinx/coroutines/a2;Lio/ktor/utils/io/h;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d extends InputStream {

    /* renamed from: c */
    private final io.ktor.utils.io.h f12932c;

    /* renamed from: d */
    private final b0 f12933d;

    /* renamed from: q */
    private final a f12934q;

    /* renamed from: x */
    private byte[] f12935x;

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"io/ktor/utils/io/jvm/javaio/d$a", "Lio/ktor/utils/io/jvm/javaio/a;", "Ltb/e0;", "h", "(Lxb/d;)Ljava/lang/Object;", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends io.ktor.utils.io.jvm.javaio.a {

        /* renamed from: g */
        final /* synthetic */ a2 f12936g;

        /* renamed from: h */
        final /* synthetic */ d f12937h;

        @zb.f(c = "io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1", f = "Blocking.kt", l = {316, 40}, m = "loop")
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: io.ktor.utils.io.jvm.javaio.d$a$a */
        /* loaded from: classes.dex */
        public static final class C0198a extends zb.d {
            /* synthetic */ Object U3;
            int W3;

            /* renamed from: x */
            Object f12938x;

            /* renamed from: y */
            Object f12939y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0198a(xb.d<? super C0198a> dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                this.U3 = obj;
                this.W3 |= Integer.MIN_VALUE;
                return a.this.h(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a2 a2Var, d dVar) {
            super(a2Var);
            this.f12936g = a2Var;
            this.f12937h = dVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007c -> B:25:0x007f). Please submit an issue!!! */
        @Override // io.ktor.utils.io.jvm.javaio.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected java.lang.Object h(xb.d<? super tb.e0> r10) {
            /*
                r9 = this;
                boolean r0 = r10 instanceof io.ktor.utils.io.jvm.javaio.d.a.C0198a
                if (r0 == 0) goto L13
                r0 = r10
                io.ktor.utils.io.jvm.javaio.d$a$a r0 = (io.ktor.utils.io.jvm.javaio.d.a.C0198a) r0
                int r1 = r0.W3
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.W3 = r1
                goto L18
            L13:
                io.ktor.utils.io.jvm.javaio.d$a$a r0 = new io.ktor.utils.io.jvm.javaio.d$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.U3
                java.lang.Object r1 = yb.b.c()
                int r2 = r0.W3
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L44
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r2 = r0.f12938x
                io.ktor.utils.io.jvm.javaio.d$a r2 = (io.ktor.utils.io.jvm.javaio.d.a) r2
                tb.t.b(r10)
                goto L7f
            L30:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L38:
                java.lang.Object r2 = r0.f12939y
                io.ktor.utils.io.jvm.javaio.a r2 = (io.ktor.utils.io.jvm.javaio.a) r2
                java.lang.Object r2 = r0.f12938x
                io.ktor.utils.io.jvm.javaio.d$a r2 = (io.ktor.utils.io.jvm.javaio.d.a) r2
                tb.t.b(r10)
                goto L61
            L44:
                tb.t.b(r10)
                r10 = 0
                r2 = r9
            L49:
                r2.result = r10
                r0.f12938x = r2
                r0.f12939y = r2
                r0.W3 = r4
                java.lang.Object r10 = io.ktor.utils.io.jvm.javaio.a.c(r2, r0)
                java.lang.Object r5 = yb.b.c()
                if (r10 != r5) goto L5e
                zb.h.c(r0)
            L5e:
                if (r10 != r1) goto L61
                return r1
            L61:
                byte[] r10 = (byte[]) r10
                io.ktor.utils.io.jvm.javaio.d r5 = r2.f12937h
                io.ktor.utils.io.h r5 = io.ktor.utils.io.jvm.javaio.d.b(r5)
                int r6 = r2.f()
                int r7 = r2.e()
                r0.f12938x = r2
                r8 = 0
                r0.f12939y = r8
                r0.W3 = r3
                java.lang.Object r10 = r5.i(r10, r6, r7, r0)
                if (r10 != r1) goto L7f
                return r1
            L7f:
                java.lang.Number r10 = (java.lang.Number) r10
                int r10 = r10.intValue()
                r5 = -1
                if (r10 != r5) goto L49
                io.ktor.utils.io.jvm.javaio.d r0 = r2.f12937h
                kotlinx.coroutines.b0 r0 = io.ktor.utils.io.jvm.javaio.d.e(r0)
                r0.V()
                r2.d(r10)
                tb.e0 r10 = tb.e0.f22152a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.d.a.h(xb.d):java.lang.Object");
        }
    }

    public d(a2 a2Var, io.ktor.utils.io.h hVar) {
        t.e(hVar, "channel");
        this.f12932c = hVar;
        b.b();
        this.f12933d = e2.a(a2Var);
        this.f12934q = new a(a2Var, this);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f12932c.k();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        super.close();
        io.ktor.utils.io.j.a(this.f12932c);
        if (!this.f12933d.p()) {
            a2.a.a(this.f12933d, null, 1, null);
        }
        this.f12934q.k();
    }

    @Override // java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f12935x;
        if (bArr == null) {
            bArr = new byte[1];
            this.f12935x = bArr;
        }
        int m10 = this.f12934q.m(bArr, 0, 1);
        if (m10 == -1) {
            return -1;
        }
        if (m10 != 1) {
            throw new IllegalStateException(t.l("rc should be 1 or -1 but got ", Integer.valueOf(m10)).toString());
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        a aVar;
        aVar = this.f12934q;
        t.b(bArr);
        return aVar.m(bArr, i10, i11);
    }
}
