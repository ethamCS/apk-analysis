package m7;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m7.p;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lm7/e;", "Lm7/p;", "Landroidx/fragment/app/f0;", "transaction", "Landroidx/fragment/app/Fragment;", "fragment", "Ltb/e0;", "a", "c", "d", BuildConfig.FLAVOR, "animationDuration", "<init>", "(J)V", "navigation_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class e implements p {

    /* renamed from: a */
    private final long f16402a;

    public e(long j10) {
        this.f16402a = j10;
    }

    public /* synthetic */ e(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 400L : j10);
    }

    @Override // m7.p
    public void a(androidx.fragment.app.f0 f0Var, Fragment fragment) {
        hc.t.e(f0Var, "transaction");
        hc.t.e(fragment, "fragment");
        q.b(f0Var);
    }

    @Override // m7.p
    public void b(androidx.fragment.app.f0 f0Var, Fragment fragment) {
        p.a.a(this, f0Var, fragment);
    }

    @Override // m7.p
    public void c(Fragment fragment) {
        hc.t.e(fragment, "fragment");
        q1.n b02 = new q1.m().b0(this.f16402a);
        fragment.Z1(b02);
        fragment.h2(b02);
    }

    @Override // m7.p
    public void d(Fragment fragment) {
        hc.t.e(fragment, "fragment");
        q1.n b02 = new q1.d(1).b0(this.f16402a);
        fragment.Z1(b02);
        fragment.h2(b02);
        q1.n b03 = new q1.d(2).b0(this.f16402a);
        fragment.a2(b03);
        fragment.i2(b03);
    }
}
