package ob;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ob.f0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, d2 = {"Lob/x;", "Lrb/c;", "Lob/f0;", "B", "instance", "Ltb/e0;", "z", "G", "u", BuildConfig.FLAVOR, "bufferSize", "capacity", "Llb/a;", "allocator", "<init>", "(IILlb/a;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class x extends rb.c<f0> {
    private final int V3;
    private final lb.a W3;

    public x() {
        this(0, 0, null, 7, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i10, int i11, lb.a aVar) {
        super(i11);
        hc.t.e(aVar, "allocator");
        this.V3 = i10;
        this.W3 = aVar;
    }

    public /* synthetic */ x(int i10, int i11, lb.a aVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 4096 : i10, (i12 & 2) != 0 ? 1000 : i11, (i12 & 4) != 0 ? lb.b.f15916a : aVar);
    }

    /* renamed from: B */
    public f0 j() {
        return new f0(this.W3.b(this.V3), null, this, null);
    }

    /* renamed from: G */
    public void s(f0 f0Var) {
        hc.t.e(f0Var, "instance");
        super.s(f0Var);
        f0.c cVar = f0.Companion;
        if (f0Var != cVar.a()) {
            boolean z10 = true;
            if (!(f0Var != cVar.a())) {
                throw new IllegalStateException("Empty instance couldn't be recycled".toString());
            }
            if (!(f0Var != e.Companion.a())) {
                throw new IllegalStateException("Empty instance couldn't be recycled".toString());
            }
            if (!(f0Var != pb.a.Companion.a())) {
                throw new IllegalStateException("Empty instance couldn't be recycled".toString());
            }
            if (!(f0Var.V0() == 0)) {
                throw new IllegalStateException("Unable to clear buffer: it is still in use.".toString());
            }
            if (!(f0Var.M0() == null)) {
                throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.".toString());
            }
            if (f0Var.O0() != null) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.".toString());
            }
            return;
        }
        throw new IllegalStateException("IoBuffer.Empty couldn't be recycled".toString());
    }

    /* renamed from: u */
    public f0 e(f0 f0Var) {
        hc.t.e(f0Var, "instance");
        f0 f0Var2 = (f0) super.e(f0Var);
        f0Var2.j1();
        f0Var2.V();
        return f0Var2;
    }

    /* renamed from: z */
    public void f(f0 f0Var) {
        hc.t.e(f0Var, "instance");
        this.W3.a(f0Var.n());
        super.f(f0Var);
        f0Var.i1();
    }
}
