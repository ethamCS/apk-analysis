package bb;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lbb/c0;", "Lfb/w;", "Lbb/b0;", "q", "Lbb/q0;", "urlEncodingOption", "Lbb/q0;", "r", "()Lbb/q0;", "s", "(Lbb/q0;)V", BuildConfig.FLAVOR, "size", "<init>", "(ILbb/q0;)V", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c0 extends fb.w {

    /* renamed from: d */
    private q0 f5822d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i10, q0 q0Var) {
        super(true, i10);
        hc.t.e(q0Var, "urlEncodingOption");
        this.f5822d = q0Var;
    }

    public /* synthetic */ c0(int i10, q0 q0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10, (i11 & 2) != 0 ? q0.DEFAULT : q0Var);
    }

    public b0 q() {
        if (!i()) {
            n(true);
            return new d0(j(), this.f5822d);
        }
        throw new IllegalArgumentException("ParametersBuilder can only build a single Parameters instance".toString());
    }

    public final q0 r() {
        return this.f5822d;
    }

    public final void s(q0 q0Var) {
        hc.t.e(q0Var, "<set-?>");
        this.f5822d = q0Var;
    }
}
