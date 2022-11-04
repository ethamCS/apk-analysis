package j8;

import androidx.fragment.app.w;
import hc.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m7.v;
import m7.x;
import m7.z;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0003\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0010"}, d2 = {"Lj8/f;", "Lk7/g;", "Lm7/z;", "Ll7/b;", "m", BuildConfig.FLAVOR, "error", "Ltb/e0;", "a", BuildConfig.FLAVOR, "isLoading", "G", BuildConfig.FLAVOR, "contentLayoutId", "<init>", "(I)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class f extends k7.g implements z {
    public f() {
        this(0, 1, null);
    }

    public f(int i10) {
        super(i10);
    }

    public /* synthetic */ f(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    @Override // k7.o
    public void G(boolean z10) {
    }

    @Override // s4.v
    public void a(Throwable th2) {
        t.e(th2, "error");
        n8.a c10 = l8.b.b(this).c();
        w S = S();
        t.d(S, "childFragmentManager");
        c10.e(th2, S);
    }

    public l7.b m() {
        v N;
        l7.b o10;
        x xVar = this instanceof x ? (x) this : null;
        return (xVar == null || (N = xVar.N()) == null || (o10 = N.o()) == null) ? l7.c.f15853a : o10;
    }
}
