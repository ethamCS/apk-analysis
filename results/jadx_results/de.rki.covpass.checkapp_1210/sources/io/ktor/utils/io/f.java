package io.ktor.utils.io;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import ob.f0;
import ob.k0;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00042\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0004J\u001b\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010!J+\u0010%\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0004J#\u0010)\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b,\u0010\u001eJ\u001b\u0010-\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u001fH\u0080@ø\u0001\u0000¢\u0006\u0004\b-\u0010!J+\u0010.\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u0010&J\u0013\u0010/\u001a\u00020\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u001b\u00102\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0014H\u0084@ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0017J\u0012\u00105\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u000103H\u0016J\u0012\u00106\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u000103H\u0016J\u001f\u00107\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0004R\u001a\u0010=\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010?R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010BR\u0018\u0010G\u001a\u00060\u0004j\u0002`D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR$\u0010P\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u000f8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010S\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u000f8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR(\u0010X\u001a\u0004\u0018\u0001032\b\u0010K\u001a\u0004\u0018\u0001038F@BX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010\\\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u00058D@DX\u0084\u000e¢\u0006\f\u001a\u0004\bY\u0010<\"\u0004\bZ\u0010[R\u001a\u0010]\u001a\u00020\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010a\u001a\u00020\u00118\u0004X\u0084\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010IR\u0014\u0010h\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010IR\u0014\u0010j\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010<\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006k"}, d2 = {"Lio/ktor/utils/io/f;", "Lio/ktor/utils/io/c;", "Lio/ktor/utils/io/h;", "Lio/ktor/utils/io/k;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "y", "Ltb/e0;", "z", "v", "w", "Lob/r;", "closeable", "x", "builder", BuildConfig.FLAVOR, "limit", "Lob/u;", "M", "(Lob/r;JLxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "count", "s", "(ILxb/d;)Ljava/lang/Object;", "r", "flush", "H", "Lob/f0;", "src", "b", "(Lob/f0;Lxb/d;)Ljava/lang/Object;", "Lob/e;", "S", "(Lob/e;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "offset", "length", "e", "([BIILxb/d;)Ljava/lang/Object;", "p", "headerSizeHint", "l", "(JILxb/d;)Ljava/lang/Object;", "dst", "h", "I", "i", "t", "(Lxb/d;)Ljava/lang/Object;", "atLeast", "u", BuildConfig.FLAVOR, "cause", "g", "a", "R", "(Lio/ktor/utils/io/f;J)J", "q", "Z", "n", "()Z", "autoFlush", "Lio/ktor/utils/io/g;", "Lio/ktor/utils/io/g;", "state", "Lio/ktor/utils/io/internal/a;", "Lio/ktor/utils/io/internal/a;", "slot", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "f", "Ljava/lang/Object;", "flushMutex", "C", "()I", "flushSize", "value", "F", "()J", "P", "(J)V", "_totalBytesRead", "G", "Q", "_totalBytesWritten", "j", "()Ljava/lang/Throwable;", "O", "(Ljava/lang/Throwable;)V", "closedCause", "B", "N", "(Z)V", "closed", "writable", "Lob/r;", "E", "()Lob/r;", "readable", "Lob/u;", "D", "()Lob/u;", "k", "availableForRead", "A", "availableForWrite", "m", "isClosedForRead", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class f implements io.ktor.utils.io.c, io.ktor.utils.io.h, k {

    /* renamed from: a */
    private final boolean f12837a;

    /* renamed from: b */
    private final io.ktor.utils.io.g f12838b;

    /* renamed from: c */
    private final ob.r f12839c;

    /* renamed from: d */
    private final ob.u f12840d;

    /* renamed from: e */
    private final io.ktor.utils.io.internal.a f12841e;

    /* renamed from: f */
    private final Object f12842f;

    /* renamed from: g */
    private final ob.r f12843g;

    @zb.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {e.j.M0}, m = "awaitAtLeastNBytesAvailableForRead$ktor_io")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f12844x;

        /* renamed from: y */
        int f12845y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(dVar);
            f.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return f.this.r(0, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {119}, m = "awaitAtLeastNBytesAvailableForWrite$ktor_io")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f12846x;

        /* renamed from: y */
        int f12847y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(dVar);
            f.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return f.this.s(0, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {692}, m = "awaitSuspend")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class c extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f12848x;

        /* renamed from: y */
        int f12849y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(xb.d<? super c> dVar) {
            super(dVar);
            f.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return f.this.u(0, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {559}, m = "readAvailable$ktor_io")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class d extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f12850x;

        /* renamed from: y */
        Object f12851y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(xb.d<? super d> dVar) {
            super(dVar);
            f.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return f.this.I(null, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {602}, m = "readAvailable$suspendImpl")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class e extends zb.d {
        int U3;
        int V3;
        /* synthetic */ Object W3;
        int Y3;

        /* renamed from: x */
        Object f12852x;

        /* renamed from: y */
        Object f12853y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(xb.d<? super e> dVar) {
            super(dVar);
            f.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.W3 = obj;
            this.Y3 |= Integer.MIN_VALUE;
            return f.K(f.this, null, 0, 0, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {499}, m = "readRemainingSuspend")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.f$f */
    /* loaded from: classes.dex */
    public static final class C0193f extends zb.d {
        long U3;
        /* synthetic */ Object V3;
        int X3;

        /* renamed from: x */
        Object f12854x;

        /* renamed from: y */
        Object f12855y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0193f(xb.d<? super C0193f> dVar) {
            super(dVar);
            f.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.V3 = obj;
            this.X3 |= Integer.MIN_VALUE;
            return f.this.M(null, 0L, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {241}, m = "writeFully$suspendImpl")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class g extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f12856x;

        /* renamed from: y */
        Object f12857y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(xb.d<? super g> dVar) {
            super(dVar);
            f.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return f.T(f.this, null, this);
        }
    }

    @zb.f(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {252}, m = "writeFully$suspendImpl")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class h extends zb.d {
        int U3;
        int V3;
        /* synthetic */ Object W3;
        int Y3;

        /* renamed from: x */
        Object f12858x;

        /* renamed from: y */
        Object f12859y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(xb.d<? super h> dVar) {
            super(dVar);
            f.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.W3 = obj;
            this.Y3 |= Integer.MIN_VALUE;
            return f.V(f.this, null, 0, 0, this);
        }
    }

    private final int C() {
        return this.f12843g.r1();
    }

    private final long F() {
        return this.f12838b.c();
    }

    private final long G() {
        return this.f12838b.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object K(io.ktor.utils.io.f r6, byte[] r7, int r8, int r9, xb.d r10) {
        /*
            boolean r0 = r10 instanceof io.ktor.utils.io.f.e
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.f$e r0 = (io.ktor.utils.io.f.e) r0
            int r1 = r0.Y3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y3 = r1
            goto L18
        L13:
            io.ktor.utils.io.f$e r0 = new io.ktor.utils.io.f$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.W3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.Y3
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            int r6 = r0.V3
            int r7 = r0.U3
            java.lang.Object r8 = r0.f12853y
            byte[] r8 = (byte[]) r8
            java.lang.Object r9 = r0.f12852x
            io.ktor.utils.io.f r9 = (io.ktor.utils.io.f) r9
            tb.t.b(r10)
            r4 = r9
            r9 = r6
            r6 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L7d
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            tb.t.b(r10)
            java.lang.Throwable r10 = r6.j()
            if (r10 != 0) goto La7
            boolean r10 = r6.B()
            if (r10 == 0) goto L5e
            int r10 = r6.k()
            if (r10 != 0) goto L5e
            r6 = -1
            java.lang.Integer r6 = zb.b.c(r6)
            return r6
        L5e:
            if (r9 != 0) goto L66
            r6 = 0
            java.lang.Integer r6 = zb.b.c(r6)
            return r6
        L66:
            int r10 = r6.k()
            if (r10 != 0) goto L7d
            r0.f12852x = r6
            r0.f12853y = r7
            r0.U3 = r8
            r0.V3 = r9
            r0.Y3 = r3
            java.lang.Object r10 = r6.u(r3, r0)
            if (r10 != r1) goto L7d
            return r1
        L7d:
            ob.u r10 = r6.D()
            boolean r10 = r10.i()
            if (r10 != 0) goto L8a
            r6.H()
        L8a:
            long r9 = (long) r9
            ob.u r0 = r6.D()
            long r0 = r0.D0()
            long r9 = java.lang.Math.min(r9, r0)
            int r9 = (int) r9
            ob.u r10 = r6.D()
            ob.a0.d(r10, r7, r8, r9)
            r6.p(r9)
            java.lang.Integer r6 = zb.b.c(r9)
            return r6
        La7:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.K(io.ktor.utils.io.f, byte[], int, int, xb.d):java.lang.Object");
    }

    static /* synthetic */ Object L(f fVar, long j10, int i10, xb.d dVar) {
        fVar.w();
        ob.r a10 = k0.a(i10);
        a10.j1(fVar.D(), Math.min(j10, fVar.D().D0()));
        long r12 = j10 - a10.r1();
        if (r12 == 0 || fVar.m()) {
            fVar.p((int) r12);
            fVar.x(a10);
            return a10.q1();
        }
        return fVar.M(a10, j10, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(ob.r r11, long r12, xb.d<? super ob.u> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof io.ktor.utils.io.f.C0193f
            if (r0 == 0) goto L13
            r0 = r14
            io.ktor.utils.io.f$f r0 = (io.ktor.utils.io.f.C0193f) r0
            int r1 = r0.X3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X3 = r1
            goto L18
        L13:
            io.ktor.utils.io.f$f r0 = new io.ktor.utils.io.f$f
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.V3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.X3
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            long r11 = r0.U3
            java.lang.Object r13 = r0.f12855y
            ob.r r13 = (ob.r) r13
            java.lang.Object r2 = r0.f12854x
            io.ktor.utils.io.f r2 = (io.ktor.utils.io.f) r2
            tb.t.b(r14)
            r8 = r11
            r11 = r13
            r12 = r8
            goto L42
        L36:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3e:
            tb.t.b(r14)
            r2 = r10
        L42:
            int r14 = r11.r1()
            long r4 = (long) r14
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 >= 0) goto L89
            int r14 = r11.r1()
            long r4 = (long) r14
            long r4 = r12 - r4
            ob.u r14 = r2.D()
            long r6 = r14.D0()
            long r4 = java.lang.Math.min(r4, r6)
            ob.u r14 = r2.D()
            r11.j1(r14, r4)
            int r14 = (int) r4
            r2.p(r14)
            r2.x(r11)
            boolean r14 = r2.m()
            if (r14 != 0) goto L89
            int r14 = r11.r1()
            int r4 = (int) r12
            if (r14 != r4) goto L7a
            goto L89
        L7a:
            r0.f12854x = r2
            r0.f12855y = r11
            r0.U3 = r12
            r0.X3 = r3
            java.lang.Object r14 = r2.u(r3, r0)
            if (r14 != r1) goto L42
            return r1
        L89:
            r2.x(r11)
            ob.u r11 = r11.q1()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.M(ob.r, long, xb.d):java.lang.Object");
    }

    private final void O(Throwable th2) {
        this.f12838b.f(th2);
    }

    private final void P(long j10) {
        this.f12838b.g(j10);
    }

    private final void Q(long j10) {
        this.f12838b.h(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object T(io.ktor.utils.io.f r4, ob.e r5, xb.d r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.f.g
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.f$g r0 = (io.ktor.utils.io.f.g) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            io.ktor.utils.io.f$g r0 = new io.ktor.utils.io.f$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f12857y
            r5 = r4
            ob.e r5 = (ob.e) r5
            java.lang.Object r4 = r0.f12856x
            io.ktor.utils.io.f r4 = (io.ktor.utils.io.f) r4
            tb.t.b(r6)
            goto L4a
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            tb.t.b(r6)
            r0.f12856x = r4
            r0.f12857y = r5
            r0.W3 = r3
            java.lang.Object r6 = r4.s(r3, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            int r6 = r5.s()
            int r0 = r5.p()
            int r6 = r6 - r0
            ob.r r0 = r4.E()
            r1 = 0
            r2 = 2
            r3 = 0
            ob.i0.c(r0, r5, r1, r2, r3)
            r4.q(r6)
            tb.e0 r4 = tb.e0.f22152a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.T(io.ktor.utils.io.f, ob.e, xb.d):java.lang.Object");
    }

    static /* synthetic */ Object U(f fVar, f0 f0Var, xb.d dVar) {
        Object c10;
        Object S = fVar.S(f0Var, dVar);
        c10 = yb.d.c();
        return S == c10 ? S : e0.f22152a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0059 -> B:19:0x005c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object V(io.ktor.utils.io.f r5, byte[] r6, int r7, int r8, xb.d r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.f.h
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.f$h r0 = (io.ktor.utils.io.f.h) r0
            int r1 = r0.Y3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y3 = r1
            goto L18
        L13:
            io.ktor.utils.io.f$h r0 = new io.ktor.utils.io.f$h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.W3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.Y3
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            int r5 = r0.V3
            int r6 = r0.U3
            java.lang.Object r7 = r0.f12859y
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.f12858x
            io.ktor.utils.io.f r8 = (io.ktor.utils.io.f) r8
            tb.t.b(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L5c
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L40:
            tb.t.b(r9)
            int r8 = r8 + r7
            r4 = r6
            r6 = r5
            r5 = r8
            r8 = r7
            r7 = r4
        L49:
            if (r8 >= r5) goto L72
            r0.f12858x = r6
            r0.f12859y = r7
            r0.U3 = r8
            r0.V3 = r5
            r0.Y3 = r3
            java.lang.Object r9 = r6.s(r3, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            int r9 = r6.A()
            int r2 = r5 - r8
            int r9 = java.lang.Math.min(r9, r2)
            ob.r r2 = r6.E()
            ob.i0.b(r2, r7, r8, r9)
            int r8 = r8 + r9
            r6.q(r9)
            goto L49
        L72:
            tb.e0 r5 = tb.e0.f22152a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.V(io.ktor.utils.io.f, byte[], int, int, xb.d):java.lang.Object");
    }

    private final void v() {
        if (B()) {
            Throwable j10 = j();
            if (j10 != null) {
                throw j10;
            }
            throw new o("Channel is already closed");
        }
    }

    private final void w() {
        Throwable j10 = j();
        if (j10 == null) {
            return;
        }
        throw j10;
    }

    private final void x(ob.r rVar) {
        Throwable j10 = j();
        if (j10 == null) {
            return;
        }
        rVar.z0();
        throw j10;
    }

    private final boolean y() {
        if (this.f12839c.s1()) {
            return false;
        }
        z();
        this.f12841e.c();
        return true;
    }

    private final void z() {
        synchronized (this.f12842f) {
            pb.a e12 = E().e1();
            hc.t.b(e12);
            this.f12843g.h1(e12);
            e0 e0Var = e0.f22152a;
        }
    }

    public int A() {
        return Math.max(0, 4088 - (k() + E().r1()));
    }

    protected final boolean B() {
        return this.f12838b.a();
    }

    protected final ob.u D() {
        return this.f12840d;
    }

    protected final ob.r E() {
        return this.f12839c;
    }

    protected final void H() {
        synchronized (this.f12842f) {
            pb.h.k(D(), this.f12843g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(ob.e r6, xb.d<? super java.lang.Integer> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.f.d
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.f$d r0 = (io.ktor.utils.io.f.d) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            io.ktor.utils.io.f$d r0 = new io.ktor.utils.io.f$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f12851y
            ob.e r6 = (ob.e) r6
            java.lang.Object r0 = r0.f12850x
            io.ktor.utils.io.f r0 = (io.ktor.utils.io.f) r0
            tb.t.b(r7)
            goto L79
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            tb.t.b(r7)
            java.lang.Throwable r7 = r5.j()
            if (r7 != 0) goto Lac
            boolean r7 = r5.B()
            if (r7 == 0) goto L54
            int r7 = r5.k()
            if (r7 != 0) goto L54
            r6 = -1
            java.lang.Integer r6 = zb.b.c(r6)
            return r6
        L54:
            int r7 = r6.j()
            int r2 = r6.s()
            int r7 = r7 - r2
            if (r7 != 0) goto L65
            r6 = 0
            java.lang.Integer r6 = zb.b.c(r6)
            return r6
        L65:
            int r7 = r5.k()
            if (r7 != 0) goto L78
            r0.f12850x = r5
            r0.f12851y = r6
            r0.W3 = r3
            java.lang.Object r7 = r5.u(r3, r0)
            if (r7 != r1) goto L78
            return r1
        L78:
            r0 = r5
        L79:
            ob.u r7 = r0.D()
            boolean r7 = r7.i()
            if (r7 != 0) goto L86
            r0.H()
        L86:
            int r7 = r6.j()
            int r1 = r6.s()
            int r7 = r7 - r1
            long r1 = (long) r7
            ob.u r7 = r0.D()
            long r3 = r7.D0()
            long r1 = java.lang.Math.min(r1, r3)
            int r7 = (int) r1
            ob.u r1 = r0.D()
            ob.a0.c(r1, r6, r7)
            r0.p(r7)
            java.lang.Integer r6 = zb.b.c(r7)
            return r6
        Lac:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.I(ob.e, xb.d):java.lang.Object");
    }

    protected final void N(boolean z10) {
        this.f12838b.e(z10);
    }

    public final long R(f fVar, long j10) {
        hc.t.e(fVar, "dst");
        long D0 = this.f12840d.D0();
        if (D0 <= j10) {
            fVar.f12839c.i1(this.f12840d);
            int i10 = (int) D0;
            fVar.q(i10);
            p(i10);
            return D0;
        }
        return 0L;
    }

    public Object S(ob.e eVar, xb.d<? super e0> dVar) {
        return T(this, eVar, dVar);
    }

    @Override // io.ktor.utils.io.k
    public boolean a(Throwable th2) {
        if (B() || j() != null) {
            return false;
        }
        O(th2);
        N(true);
        if (th2 != null) {
            this.f12840d.n1();
            this.f12839c.z0();
            this.f12843g.z0();
        } else {
            flush();
        }
        this.f12841e.b(th2);
        return true;
    }

    @Override // io.ktor.utils.io.k
    public Object b(f0 f0Var, xb.d<? super e0> dVar) {
        return U(this, f0Var, dVar);
    }

    @Override // io.ktor.utils.io.k
    public Object e(byte[] bArr, int i10, int i11, xb.d<? super e0> dVar) {
        return V(this, bArr, i10, i11, dVar);
    }

    @Override // io.ktor.utils.io.k
    public void flush() {
        y();
    }

    @Override // io.ktor.utils.io.h
    public boolean g(Throwable th2) {
        if (j() != null || B()) {
            return false;
        }
        if (th2 == null) {
            th2 = new CancellationException("Channel cancelled");
        }
        return a(th2);
    }

    @Override // io.ktor.utils.io.h
    public Object h(f0 f0Var, xb.d<? super Integer> dVar) {
        return I(f0Var, dVar);
    }

    @Override // io.ktor.utils.io.h
    public Object i(byte[] bArr, int i10, int i11, xb.d<? super Integer> dVar) {
        return K(this, bArr, i10, i11, dVar);
    }

    @Override // io.ktor.utils.io.h
    public final Throwable j() {
        return this.f12838b.b();
    }

    @Override // io.ktor.utils.io.h
    public int k() {
        return C() + ((int) this.f12840d.D0());
    }

    @Override // io.ktor.utils.io.h
    public Object l(long j10, int i10, xb.d<? super ob.u> dVar) {
        return L(this, j10, i10, dVar);
    }

    @Override // io.ktor.utils.io.h
    public boolean m() {
        return B() && this.f12840d.a1() && C() == 0 && this.f12839c.s1();
    }

    @Override // io.ktor.utils.io.k
    public boolean n() {
        return this.f12837a;
    }

    protected final void p(int i10) {
        P(F() + i10);
        this.f12841e.c();
    }

    protected final void q(int i10) {
        Q(G() + i10);
        if (B()) {
            this.f12839c.z0();
            v();
        }
        if (n() || A() == 0) {
            flush();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(int r5, xb.d<? super tb.e0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.f.a
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.f$a r0 = (io.ktor.utils.io.f.a) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            io.ktor.utils.io.f$a r0 = new io.ktor.utils.io.f$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r5 = r0.f12845y
            java.lang.Object r2 = r0.f12844x
            io.ktor.utils.io.f r2 = (io.ktor.utils.io.f) r2
            tb.t.b(r6)
            goto L3b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            tb.t.b(r6)
            r2 = r4
        L3b:
            int r6 = r2.k()
            if (r6 >= r5) goto L56
            boolean r6 = r2.B()
            if (r6 != 0) goto L56
            io.ktor.utils.io.internal.a r6 = r2.f12841e
            r0.f12844x = r2
            r0.f12845y = r5
            r0.W3 = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L3b
            return r1
        L56:
            tb.e0 r5 = tb.e0.f22152a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.r(int, xb.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(int r5, xb.d<? super tb.e0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.f.b
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.f$b r0 = (io.ktor.utils.io.f.b) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            io.ktor.utils.io.f$b r0 = new io.ktor.utils.io.f$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r5 = r0.f12847y
            java.lang.Object r2 = r0.f12846x
            io.ktor.utils.io.f r2 = (io.ktor.utils.io.f) r2
            tb.t.b(r6)
            goto L3b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            tb.t.b(r6)
            r2 = r4
        L3b:
            int r6 = r2.A()
            if (r6 >= r5) goto L5c
            boolean r6 = r2.B()
            if (r6 != 0) goto L5c
            boolean r6 = r2.y()
            if (r6 != 0) goto L3b
            io.ktor.utils.io.internal.a r6 = r2.f12841e
            r0.f12846x = r2
            r0.f12847y = r5
            r0.W3 = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L3b
            return r1
        L5c:
            tb.e0 r5 = tb.e0.f22152a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.s(int, xb.d):java.lang.Object");
    }

    public final Object t(xb.d<? super Boolean> dVar) {
        return D().a1() ^ true ? zb.b.a(true) : u(1, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.Object u(int r6, xb.d<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.f.c
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.f$c r0 = (io.ktor.utils.io.f.c) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            io.ktor.utils.io.f$c r0 = new io.ktor.utils.io.f$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            int r6 = r0.f12849y
            java.lang.Object r0 = r0.f12848x
            io.ktor.utils.io.f r0 = (io.ktor.utils.io.f) r0
            tb.t.b(r7)
            goto L50
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            tb.t.b(r7)
            if (r6 < 0) goto L3f
            r7 = r4
            goto L40
        L3f:
            r7 = r3
        L40:
            if (r7 == 0) goto L6c
            r0.f12848x = r5
            r0.f12849y = r6
            r0.W3 = r4
            java.lang.Object r7 = r5.r(r6, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r0 = r5
        L50:
            r0.H()
            java.lang.Throwable r7 = r0.j()
            if (r7 != 0) goto L6b
            boolean r7 = r0.m()
            if (r7 != 0) goto L66
            int r7 = r0.k()
            if (r7 < r6) goto L66
            r3 = r4
        L66:
            java.lang.Boolean r6 = zb.b.a(r3)
            return r6
        L6b:
            throw r7
        L6c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Failed requirement."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.f.u(int, xb.d):java.lang.Object");
    }
}
