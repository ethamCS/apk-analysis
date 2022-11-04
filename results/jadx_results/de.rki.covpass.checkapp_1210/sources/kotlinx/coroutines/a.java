package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u00101\u001a\u00020%\u0012\u0006\u00102\u001a\u00020\f\u0012\u0006\u00103\u001a\u00020\f¢\u0006\u0004\b4\u00105J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0004J\u001e\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\tJ\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u001b\u0010\u001cJJ\u0010#\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00012\"\u0010\"\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00110!ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u001d\u0010&\u001a\u00020%8\u0006¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010)R\u0014\u00100\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lkotlinx/coroutines/a;", "T", "Lkotlinx/coroutines/i2;", "Lkotlinx/coroutines/a2;", "Lxb/d;", "Lkotlinx/coroutines/q0;", "value", "Ltb/e0;", "j1", "(Ljava/lang/Object;)V", BuildConfig.FLAVOR, "cause", BuildConfig.FLAVOR, "handled", "i1", BuildConfig.FLAVOR, "O", BuildConfig.FLAVOR, "state", "H0", "Ltb/s;", "result", "y", "h1", "exception", "m0", "(Ljava/lang/Throwable;)V", "A0", "()Ljava/lang/String;", "R", "Lkotlinx/coroutines/s0;", "start", "receiver", "Lkotlin/Function2;", "block", "k1", "(Lkotlinx/coroutines/s0;Ljava/lang/Object;Lgc/p;)V", "Lxb/g;", "context", "Lxb/g;", "b", "()Lxb/g;", "getContext$annotations", "()V", "h", "coroutineContext", "j", "()Z", "isActive", "parentContext", "initParentJob", "active", "<init>", "(Lxb/g;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class a<T> extends i2 implements xb.d<T>, q0 {

    /* renamed from: d */
    private final xb.g f15310d;

    public a(xb.g gVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            n0((a2) gVar.i(a2.W0));
        }
        this.f15310d = gVar.B(this);
    }

    @Override // kotlinx.coroutines.i2
    public String A0() {
        String b10 = k0.b(this.f15310d);
        if (b10 == null) {
            return super.A0();
        }
        return '\"' + b10 + "\":" + super.A0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.i2
    protected final void H0(Object obj) {
        if (!(obj instanceof d0)) {
            j1(obj);
            return;
        }
        d0 d0Var = (d0) obj;
        i1(d0Var.f15325a, d0Var.a());
    }

    @Override // kotlinx.coroutines.i2
    public String O() {
        return u0.a(this) + " was cancelled";
    }

    @Override // xb.d
    public final xb.g b() {
        return this.f15310d;
    }

    @Override // kotlinx.coroutines.q0
    public xb.g h() {
        return this.f15310d;
    }

    protected void h1(Object obj) {
        C(obj);
    }

    protected void i1(Throwable th2, boolean z10) {
    }

    @Override // kotlinx.coroutines.i2, kotlinx.coroutines.a2
    public boolean j() {
        return super.j();
    }

    protected void j1(T t10) {
    }

    public final <R> void k1(s0 s0Var, R r10, gc.p<? super R, ? super xb.d<? super T>, ? extends Object> pVar) {
        s0Var.g(pVar, r10, this);
    }

    @Override // kotlinx.coroutines.i2
    public final void m0(Throwable th2) {
        o0.a(this.f15310d, th2);
    }

    @Override // xb.d
    public final void y(Object obj) {
        Object x02 = x0(h0.d(obj, null, 1, null));
        if (x02 == j2.f15469b) {
            return;
        }
        h1(x02);
    }
}
