package ob;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0016B\u0011\b\u0016\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%B.\b\u0000\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0019ø\u0001\u0000¢\u0006\u0004\b$\u0010)B\u001e\b\u0016\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000¢\u0006\u0004\b$\u0010*J8\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0007J\u0016\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\u0014\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0017J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0014\u0010\u001b\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lob/f0;", "Lob/z;", "Lob/h0;", "Lpb/a;", "Llb/c;", "destination", BuildConfig.FLAVOR, "destinationOffset", "offset", "min", "max", "Z", "(Ljava/nio/ByteBuffer;JJJJ)J", BuildConfig.FLAVOR, "csq", BuildConfig.FLAVOR, "start", "end", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "append", BuildConfig.FLAVOR, "c", "Ltb/e0;", "close", "Lrb/f;", "pool", "c1", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "a1", "()Z", "endOfInput", "Ljava/nio/ByteBuffer;", "external", "<init>", "(Ljava/nio/ByteBuffer;)V", "memory", "origin", "parentPool", "(Ljava/nio/ByteBuffer;Lpb/a;Lrb/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/nio/ByteBuffer;Lpb/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f0 extends pb.a implements z, h0 {

    /* renamed from: c4 */
    private static final int f17767c4;

    /* renamed from: e4 */
    private static final f0 f17769e4;

    /* renamed from: f4 */
    private static final rb.f<f0> f17770f4;

    /* renamed from: h4 */
    private static final rb.f<f0> f17772h4;
    public static final c Companion = new c(null);

    /* renamed from: b4 */
    private static final int f17766b4 = sb.a.a("buffer.size", 4096);

    /* renamed from: d4 */
    private static final int f17768d4 = sb.a.a("buffer.pool.direct", 0);

    /* renamed from: g4 */
    private static final rb.f<f0> f17771g4 = new a();

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ob/f0$a", "Lrb/e;", "Lob/f0;", "b", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends rb.e<f0> {
        a() {
        }

        /* renamed from: b */
        public f0 c0() {
            ByteBuffer allocate = f0.f17768d4 == 0 ? ByteBuffer.allocate(f0.f17766b4) : ByteBuffer.allocateDirect(f0.f17766b4);
            hc.t.d(allocate, "buffer");
            return new f0(allocate);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\t"}, d2 = {"ob/f0$b", "Lrb/c;", "Lob/f0;", "B", "instance", "Ltb/e0;", "z", "u", "G", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends rb.c<f0> {

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ob/f0$b$a", "Lpb/f;", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class a extends pb.f {
            public Void a() {
                throw new IllegalArgumentException("Buffer is not yet released but tried to recycle");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ob/f0$b$b", "Lpb/f;", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
        /* renamed from: ob.f0$b$b */
        /* loaded from: classes.dex */
        public static final class C0275b extends pb.f {
            public Void a() {
                throw new IllegalArgumentException("Unable to recycle buffer view, only origin buffers are applicable");
            }
        }

        b(int i10) {
            super(i10);
        }

        /* renamed from: B */
        public f0 j() {
            ByteBuffer allocate = f0.f17768d4 == 0 ? ByteBuffer.allocate(f0.f17766b4) : ByteBuffer.allocateDirect(f0.f17766b4);
            hc.t.d(allocate, "buffer");
            return new f0(allocate);
        }

        /* renamed from: G */
        public void s(f0 f0Var) {
            hc.t.e(f0Var, "instance");
            boolean z10 = true;
            if (!(f0Var.V0() == 0)) {
                new a().a();
                throw new tb.i();
            }
            if (f0Var.O0() != null) {
                z10 = false;
            }
            if (z10) {
                return;
            }
            new C0275b().a();
            throw new tb.i();
        }

        /* renamed from: u */
        public f0 e(f0 f0Var) {
            hc.t.e(f0Var, "instance");
            f0Var.j1();
            f0Var.V();
            return f0Var;
        }

        /* renamed from: z */
        public void f(f0 f0Var) {
            hc.t.e(f0Var, "instance");
            f0Var.i1();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0013"}, d2 = {"Lob/f0$c;", BuildConfig.FLAVOR, "Lob/f0;", "Empty", "Lob/f0;", "a", "()Lob/f0;", "Lrb/f;", "Pool", "Lrb/f;", "b", "()Lrb/f;", BuildConfig.FLAVOR, "DEFAULT_BUFFER_POOL_DIRECT", "I", "DEFAULT_BUFFER_POOL_SIZE", "DEFAULT_BUFFER_SIZE", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f0 a() {
            return f0.f17769e4;
        }

        public final rb.f<f0> b() {
            return f0.f17770f4;
        }
    }

    static {
        int a10 = sb.a.a("buffer.pool.size", 100);
        f17767c4 = a10;
        ByteBuffer a11 = lb.c.Companion.a();
        y yVar = y.f17795c;
        f17769e4 = new f0(a11, null, yVar, null);
        f17770f4 = new b(a10);
        f17772h4 = yVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f0(java.nio.ByteBuffer r2) {
        /*
            r1 = this;
            java.lang.String r0 = "external"
            hc.t.e(r2, r0)
            lb.c$a r0 = lb.c.Companion
            java.nio.ByteBuffer r2 = r2.slice()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r0)
            java.lang.String r0 = "buffer.slice().order(ByteOrder.BIG_ENDIAN)"
            hc.t.d(r2, r0)
            java.nio.ByteBuffer r2 = lb.c.b(r2)
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.f0.<init>(java.nio.ByteBuffer):void");
    }

    private f0(ByteBuffer byteBuffer, pb.a aVar) {
        this(byteBuffer, aVar, null, null);
    }

    public /* synthetic */ f0(ByteBuffer byteBuffer, pb.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, aVar);
    }

    private f0(ByteBuffer byteBuffer, pb.a aVar, rb.f<f0> fVar) {
        super(byteBuffer, aVar, fVar == null ? null : fVar, null);
    }

    public /* synthetic */ f0(ByteBuffer byteBuffer, pb.a aVar, rb.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, aVar, fVar);
    }

    @Override // ob.z
    public final long Z(ByteBuffer byteBuffer, long j10, long j11, long j12, long j13) {
        hc.t.e(byteBuffer, "destination");
        return o.b(this, byteBuffer, j10, j11, j12, j13);
    }

    @Override // ob.z
    public boolean a1() {
        return !(s() > p());
    }

    @Override // java.lang.Appendable
    public /* synthetic */ Appendable append(char c10) {
        g.a(this, c10);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* synthetic */ Appendable append(CharSequence charSequence) {
        g.b(this, charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* synthetic */ Appendable append(CharSequence charSequence, int i10, int i11) {
        g.c(this, charSequence, i10, i11);
        return this;
    }

    @Override // pb.a
    public final void c1(rb.f<f0> fVar) {
        hc.t.e(fVar, "pool");
        o.d(this, fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("close for buffer view is not supported");
    }

    @Override // ob.e
    public String toString() {
        return "Buffer[readable = " + (s() - p()) + ", writable = " + (j() - s()) + ", startGap = " + r() + ", endGap = " + (i() - j()) + ']';
    }
}
