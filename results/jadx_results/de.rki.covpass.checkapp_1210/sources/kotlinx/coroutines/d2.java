package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/i2;", "Lkotlinx/coroutines/b0;", BuildConfig.FLAVOR, "h1", "V", BuildConfig.FLAVOR, "exception", "n", "d", "Z", "a0", "()Z", "handlesException", "d0", "onCancelComplete", "Lkotlinx/coroutines/a2;", "parent", "<init>", "(Lkotlinx/coroutines/a2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class d2 extends i2 implements b0 {

    /* renamed from: d */
    private final boolean f15327d = h1();

    public d2(a2 a2Var) {
        super(true);
        n0(a2Var);
    }

    private final boolean h1() {
        i2 H;
        v i02 = i0();
        w wVar = i02 instanceof w ? (w) i02 : null;
        if (wVar != null && (H = wVar.H()) != null) {
            while (!H.a0()) {
                v i03 = H.i0();
                w wVar2 = i03 instanceof w ? (w) i03 : null;
                if (wVar2 != null) {
                    H = wVar2.H();
                    if (H == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.b0
    public boolean V() {
        return v0(tb.e0.f22152a);
    }

    @Override // kotlinx.coroutines.i2
    public boolean a0() {
        return this.f15327d;
    }

    @Override // kotlinx.coroutines.i2
    public boolean d0() {
        return true;
    }

    @Override // kotlinx.coroutines.b0
    public boolean n(Throwable th2) {
        return v0(new d0(th2, false, 2, null));
    }
}
