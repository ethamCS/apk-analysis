package pb;

import hc.k0;
import hc.t;
import hc.y;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ob.f0;
import oc.k;
import org.conscrypt.BuildConfig;
import rb.f;
import tb.i;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001)B,\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0000\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\rR/\u0010\u0018\u001a\u0004\u0018\u00010\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\u0005R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010 \u001a\u0004\u0018\u00010\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\u0005R\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lpb/a;", "Lob/e;", "chunk", "Ltb/e0;", "D0", "(Lpb/a;)V", "K0", "()Lpb/a;", "Lrb/f;", "pool", "c1", "(Lrb/f;)V", "i1", "()V", "j1", BuildConfig.FLAVOR, "e1", "()Z", "V", "<set-?>", "origin$delegate", "Lkc/d;", "O0", "h1", "origin", "parentPool", "Lrb/f;", "R0", "()Lrb/f;", "newValue", "M0", "f1", "next", BuildConfig.FLAVOR, "V0", "()I", "referenceCount", "Llb/c;", "memory", "<init>", "(Ljava/nio/ByteBuffer;Lpb/a;Lrb/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "e", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class a extends ob.e {
    private volatile /* synthetic */ Object nextRef;
    private volatile /* synthetic */ int refCount;

    /* renamed from: x */
    private final rb.f<a> f19027x;

    /* renamed from: y */
    private final kc.d f19028y;
    static final /* synthetic */ k<Object>[] U3 = {k0.e(new y(a.class, "origin", "getOrigin()Lio/ktor/utils/io/core/internal/ChunkBuffer;", 0))};
    public static final e Companion = new e(null);
    private static final rb.f<a> X3 = new d();
    private static final rb.f<a> Y3 = new C0300a();
    private static final rb.f<a> Z3 = new b();

    /* renamed from: a4 */
    private static final rb.f<a> f19026a4 = new c();
    private static final /* synthetic */ AtomicReferenceFieldUpdater V3 = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "nextRef");
    private static final /* synthetic */ AtomicIntegerFieldUpdater W3 = AtomicIntegerFieldUpdater.newUpdater(a.class, "refCount");

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"pb/a$a", "Lrb/f;", "Lpb/a;", "b", "instance", "Ltb/e0;", "e", "g", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* renamed from: pb.a$a */
    /* loaded from: classes.dex */
    public static final class C0300a implements rb.f<a> {

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"pb/a$a$a", "Lpb/f;", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
        /* renamed from: pb.a$a$a */
        /* loaded from: classes.dex */
        public static final class C0301a extends pb.f {
            public Void a() {
                throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.");
            }
        }

        C0300a() {
        }

        /* renamed from: b */
        public a c0() {
            return a.Companion.a();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            f.a.a(this);
        }

        /* renamed from: e */
        public void B0(a aVar) {
            t.e(aVar, "instance");
            if (aVar == a.Companion.a()) {
                return;
            }
            new C0301a().a();
            throw new i();
        }

        @Override // rb.f
        public void g() {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"pb/a$b", "Lrb/e;", "Lpb/a;", "b", "instance", "Ltb/e0;", "e", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends rb.e<a> {
        b() {
        }

        /* renamed from: b */
        public a c0() {
            return new f0(lb.b.f15916a.b(4096), null, this, null);
        }

        /* renamed from: e */
        public void B0(a aVar) {
            t.e(aVar, "instance");
            if (aVar instanceof f0) {
                lb.b.f15916a.a(aVar.n());
                return;
            }
            throw new IllegalArgumentException("Only IoBuffer instances can be recycled.");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"pb/a$c", "Lrb/e;", "Lpb/a;", "b", "instance", "Ltb/e0;", "e", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c extends rb.e<a> {
        c() {
        }

        /* renamed from: b */
        public a c0() {
            throw new UnsupportedOperationException("This pool doesn't support borrow");
        }

        /* renamed from: e */
        public void B0(a aVar) {
            t.e(aVar, "instance");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"pb/a$d", "Lrb/f;", "Lpb/a;", "b", "instance", "Ltb/e0;", "e", "g", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class d implements rb.f<a> {
        d() {
        }

        /* renamed from: b */
        public a c0() {
            return ob.h.a().c0();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            f.a.a(this);
        }

        /* renamed from: e */
        public void B0(a aVar) {
            t.e(aVar, "instance");
            if (aVar instanceof f0) {
                ob.h.a().B0(aVar);
                return;
            }
            throw new IllegalArgumentException("Only IoBuffer instances can be recycled.");
        }

        @Override // rb.f
        public void g() {
            ob.h.a().g();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\f\u001a\u00020\u00038F¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u0010"}, d2 = {"Lpb/a$e;", BuildConfig.FLAVOR, "Lrb/f;", "Lpb/a;", "Pool", "Lrb/f;", "c", "()Lrb/f;", "a", "()Lpb/a;", "getEmpty$annotations", "()V", "Empty", "EmptyPool", "b", "<init>", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return f0.Companion.a();
        }

        public final rb.f<a> b() {
            return a.Y3;
        }

        public final rb.f<a> c() {
            return a.X3;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"pb/a$f", "Lpb/f;", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class f extends pb.f {
        public Void a() {
            throw new IllegalArgumentException("Unable to reset buffer with origin");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"pb/a$g", "Lpb/f;", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class g extends pb.f {
        public Void a() {
            throw new IllegalArgumentException("A chunk couldn't be a view of itself.");
        }
    }

    private a(ByteBuffer byteBuffer, a aVar, rb.f<a> fVar) {
        super(byteBuffer, null);
        this.f19027x = fVar;
        if (!(aVar != this)) {
            new g().a();
            throw new i();
        }
        this.nextRef = null;
        this.refCount = 1;
        this.f19028y = new nb.b(aVar);
    }

    public /* synthetic */ a(ByteBuffer byteBuffer, a aVar, rb.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, aVar, fVar);
    }

    private final void D0(a aVar) {
        if (androidx.concurrent.futures.b.a(V3, this, null, aVar)) {
            return;
        }
        throw new IllegalStateException("This chunk has already a next chunk.");
    }

    private final void h1(a aVar) {
        this.f19028y.b(this, U3[0], aVar);
    }

    public final a K0() {
        return (a) V3.getAndSet(this, null);
    }

    public final a M0() {
        return (a) this.nextRef;
    }

    public final a O0() {
        return (a) this.f19028y.a(this, U3[0]);
    }

    public final rb.f<a> R0() {
        return this.f19027x;
    }

    @Override // ob.e
    public final void V() {
        if (!(O0() == null)) {
            new f().a();
            throw new i();
        }
        super.V();
        f0(null);
        this.nextRef = null;
    }

    public final int V0() {
        return this.refCount;
    }

    public void c1(rb.f<a> fVar) {
        t.e(fVar, "pool");
        if (e1()) {
            a O0 = O0();
            if (O0 != null) {
                i1();
                O0.c1(fVar);
                return;
            }
            rb.f<a> fVar2 = this.f19027x;
            if (fVar2 != null) {
                fVar = fVar2;
            }
            fVar.B0(this);
        }
    }

    public final boolean e1() {
        int i10;
        int i11;
        do {
            i10 = this.refCount;
            if (i10 <= 0) {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
            i11 = i10 - 1;
        } while (!W3.compareAndSet(this, i10, i11));
        return i11 == 0;
    }

    public final void f1(a aVar) {
        if (aVar == null) {
            K0();
        } else {
            D0(aVar);
        }
    }

    public final void i1() {
        if (W3.compareAndSet(this, 0, -1)) {
            K0();
            h1(null);
            return;
        }
        throw new IllegalStateException("Unable to unlink: buffer is in use.");
    }

    public final void j1() {
        int i10;
        do {
            i10 = this.refCount;
            if (i10 < 0) {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
            if (i10 > 0) {
                throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
            }
        } while (!W3.compareAndSet(this, i10, 1));
    }
}
