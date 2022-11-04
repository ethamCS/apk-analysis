package ob;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0004J*\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0004ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\"\u0010\u0013\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u0011\u0010\u001a\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lob/r;", "Lob/t;", "Ltb/e0;", "u", "Llb/c;", "source", BuildConfig.FLAVOR, "offset", "length", "z", "(Ljava/nio/ByteBuffer;II)V", BuildConfig.FLAVOR, "c", "n1", BuildConfig.FLAVOR, "csq", "o1", "start", "end", "p1", "Lob/u;", "q1", BuildConfig.FLAVOR, "toString", "r1", "()I", "size", BuildConfig.FLAVOR, "s1", "()Z", "isEmpty", "headerSizeHint", "Lrb/f;", "Lpb/a;", "pool", "<init>", "(ILrb/f;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class r extends t {

    /* renamed from: y */
    private int f17792y;

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ob/r$a", "Lpb/f;", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends pb.f {
        public a() {
            r.this = r1;
        }

        public Void a() {
            throw new IllegalArgumentException(hc.t.l("shouldn't be negative: headerSizeHint = ", Integer.valueOf(r.this.f17792y)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i10, rb.f<pb.a> fVar) {
        super(fVar);
        hc.t.e(fVar, "pool");
        this.f17792y = i10;
        if (i10 >= 0) {
            return;
        }
        new a().a();
        throw new tb.i();
    }

    /* renamed from: n1 */
    public r f(char c10) {
        return (r) super.append(c10);
    }

    /* renamed from: o1 */
    public r h(CharSequence charSequence) {
        return (r) super.append(charSequence);
    }

    /* renamed from: p1 */
    public r i(CharSequence charSequence, int i10, int i11) {
        return (r) super.append(charSequence, i10, i11);
    }

    public final u q1() {
        int r12 = r1();
        pb.a e12 = e1();
        return e12 == null ? u.Companion.a() : new u(e12, r12, V());
    }

    public final int r1() {
        return s0();
    }

    public final boolean s1() {
        return s0() == 0;
    }

    public String toString() {
        return "BytePacketBuilder(" + r1() + " bytes written)";
    }

    @Override // ob.c
    protected final void u() {
    }

    @Override // ob.c
    protected final void z(ByteBuffer byteBuffer, int i10, int i11) {
        hc.t.e(byteBuffer, "source");
    }
}
