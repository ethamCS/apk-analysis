package ob;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001:\u0001<B\u0012\u0012\u0006\u0010-\u001a\u00020,ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0001J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0002J\u000f\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0019\u0010\rJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001aJ\b\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010 \u001a\u00020\u001fH\u0016R$\u0010$\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\rR$\u0010'\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010\rR$\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\"\"\u0004\b)\u0010\rR$\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010\rR\u001d\u0010-\u001a\u00020,8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\"R.\u00109\u001a\u0004\u0018\u00010\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u00018F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b8\u0010\u0016\u001a\u0004\b4\u00105\"\u0004\b6\u00107\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006="}, d2 = {"Lob/e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "count", "Ltb/e0;", "f", BuildConfig.FLAVOR, "y", "b", "position", BuildConfig.FLAVOR, "e", "h", "(I)V", "startGap", "M", "endGap", "G", "W", "limit", "e0", "z", "()V", "u", "newReadPosition", "B", BuildConfig.FLAVOR, "readByte", "value", "q0", "V", BuildConfig.FLAVOR, "toString", "p", "()I", "j0", "readPosition", "s", "u0", "writePosition", "r", "s0", "j", "h0", "Llb/c;", "memory", "Ljava/nio/ByteBuffer;", "n", "()Ljava/nio/ByteBuffer;", "capacity", "I", "i", "getAttachment", "()Ljava/lang/Object;", "f0", "(Ljava/lang/Object;)V", "getAttachment$annotations", "attachment", "<init>", "(Ljava/nio/ByteBuffer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class e {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private final ByteBuffer f17758c;

    /* renamed from: d */
    private final n f17759d;

    /* renamed from: q */
    private final int f17760q;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028F¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087T¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\u0006¨\u0006\r"}, d2 = {"Lob/e$a;", BuildConfig.FLAVOR, "Lob/e;", "a", "()Lob/e;", "getEmpty$annotations", "()V", "Empty", BuildConfig.FLAVOR, "ReservedSize", "I", "getReservedSize$annotations", "<init>", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return f0.Companion.a();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ob/e$b", "Lpb/f;", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends pb.f {

        /* renamed from: a */
        final /* synthetic */ int f17761a;

        public b(int i10) {
            this.f17761a = i10;
        }

        public Void a() {
            throw new IllegalArgumentException(hc.t.l("newReadPosition shouldn't be negative: ", Integer.valueOf(this.f17761a)));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ob/e$c", "Lpb/f;", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c extends pb.f {

        /* renamed from: a */
        final /* synthetic */ int f17762a;

        /* renamed from: b */
        final /* synthetic */ e f17763b;

        public c(int i10, e eVar) {
            this.f17762a = i10;
            this.f17763b = eVar;
        }

        public Void a() {
            throw new IllegalArgumentException("newReadPosition shouldn't be ahead of the read position: " + this.f17762a + " > " + this.f17763b.p());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ob/e$d", "Lpb/f;", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class d extends pb.f {

        /* renamed from: a */
        final /* synthetic */ int f17764a;

        public d(int i10) {
            this.f17764a = i10;
        }

        public Void a() {
            throw new IllegalArgumentException(hc.t.l("endGap shouldn't be negative: ", Integer.valueOf(this.f17764a)));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ob/e$e", "Lpb/f;", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* renamed from: ob.e$e */
    /* loaded from: classes.dex */
    public static final class C0274e extends pb.f {

        /* renamed from: a */
        final /* synthetic */ int f17765a;

        public C0274e(int i10) {
            this.f17765a = i10;
        }

        public Void a() {
            throw new IllegalArgumentException(hc.t.l("startGap shouldn't be negative: ", Integer.valueOf(this.f17765a)));
        }
    }

    private e(ByteBuffer byteBuffer) {
        this.f17758c = byteBuffer;
        this.f17759d = new n(n().limit());
        this.f17760q = n().limit();
    }

    public /* synthetic */ e(ByteBuffer byteBuffer, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer);
    }

    private final void h0(int i10) {
        this.f17759d.f(i10);
    }

    private final void j0(int i10) {
        this.f17759d.g(i10);
    }

    private final void s0(int i10) {
        this.f17759d.h(i10);
    }

    private final void u0(int i10) {
        this.f17759d.i(i10);
    }

    public final void B(int i10) {
        boolean z10 = true;
        if (!(i10 >= 0)) {
            new b(i10).a();
            throw new tb.i();
        }
        if (i10 > p()) {
            z10 = false;
        }
        if (!z10) {
            new c(i10, this).a();
            throw new tb.i();
        }
        j0(i10);
        if (r() <= i10) {
            return;
        }
        s0(i10);
    }

    public final void G(int i10) {
        if (!(i10 >= 0)) {
            new d(i10).a();
            throw new tb.i();
        }
        int i11 = this.f17760q - i10;
        if (i11 >= s()) {
            h0(i11);
            return;
        }
        if (i11 < 0) {
            i.c(this, i10);
        }
        if (i11 < r()) {
            i.e(this, i10);
        }
        if (p() != s()) {
            i.d(this, i10);
            return;
        }
        h0(i11);
        j0(i11);
        u0(i11);
    }

    public final void M(int i10) {
        if (!(i10 >= 0)) {
            new C0274e(i10).a();
            throw new tb.i();
        } else if (p() >= i10) {
            s0(i10);
        } else if (p() != s()) {
            i.g(this, i10);
            throw new tb.i();
        } else if (i10 > j()) {
            i.h(this, i10);
            throw new tb.i();
        } else {
            u0(i10);
            j0(i10);
            s0(i10);
        }
    }

    public void V() {
        z();
        W();
    }

    public final void W() {
        e0(this.f17760q - r());
    }

    public final void b(int i10) {
        int s10 = s() + i10;
        if (i10 < 0 || s10 > j()) {
            i.a(i10, j() - s());
            throw new tb.i();
        } else {
            u0(s10);
        }
    }

    public final boolean e(int i10) {
        int j10 = j();
        if (i10 < s()) {
            i.a(i10 - s(), j() - s());
            throw new tb.i();
        } else if (i10 < j10) {
            u0(i10);
            return true;
        } else if (i10 == j10) {
            u0(i10);
            return false;
        } else {
            i.a(i10 - s(), j() - s());
            throw new tb.i();
        }
    }

    public final void e0(int i10) {
        int r10 = r();
        j0(r10);
        u0(r10);
        h0(i10);
    }

    public final void f(int i10) {
        if (i10 == 0) {
            return;
        }
        int p10 = p() + i10;
        if (i10 < 0 || p10 > s()) {
            i.b(i10, s() - p());
            throw new tb.i();
        } else {
            j0(p10);
        }
    }

    public final void f0(Object obj) {
        this.f17759d.e(obj);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 > s()) {
            i.b(i10 - p(), s() - p());
            throw new tb.i();
        } else if (p() == i10) {
        } else {
            j0(i10);
        }
    }

    public final int i() {
        return this.f17760q;
    }

    public final int j() {
        return this.f17759d.a();
    }

    public final ByteBuffer n() {
        return this.f17758c;
    }

    public final int p() {
        return this.f17759d.b();
    }

    public final void q0(byte b10) {
        int s10 = s();
        if (s10 != j()) {
            n().put(s10, b10);
            u0(s10 + 1);
            return;
        }
        throw new e0("No free space in the buffer to write a byte");
    }

    public final int r() {
        return this.f17759d.c();
    }

    public final byte readByte() {
        int p10 = p();
        if (p10 != s()) {
            j0(p10 + 1);
            return n().get(p10);
        }
        throw new EOFException("No readable bytes available.");
    }

    public final int s() {
        return this.f17759d.d();
    }

    public String toString() {
        return "Buffer(" + (s() - p()) + " used, " + (j() - s()) + " free, " + (r() + (i() - j())) + " reserved of " + this.f17760q + ')';
    }

    public final void u() {
        h0(this.f17760q);
    }

    public final long y(long j10) {
        int min = (int) Math.min(j10, s() - p());
        f(min);
        return min;
    }

    public final void z() {
        B(0);
        u();
    }
}
