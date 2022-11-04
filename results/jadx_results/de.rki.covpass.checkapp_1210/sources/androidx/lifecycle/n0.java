package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import k1.c;
import kotlin.Lazy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\f\u0010\u0011¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/n0;", "Lk1/c$c;", "Landroid/os/Bundle;", "a", "Ltb/e0;", "d", BuildConfig.FLAVOR, "key", "b", BuildConfig.FLAVOR, "Z", "restored", "c", "Landroid/os/Bundle;", "restoredState", "Landroidx/lifecycle/o0;", "Lkotlin/Lazy;", "()Landroidx/lifecycle/o0;", "viewModel", "Lk1/c;", "savedStateRegistry", "Landroidx/lifecycle/z0;", "viewModelStoreOwner", "<init>", "(Lk1/c;Landroidx/lifecycle/z0;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class n0 implements c.AbstractC0210c {

    /* renamed from: a */
    private final k1.c f4351a;

    /* renamed from: b */
    private boolean f4352b;

    /* renamed from: c */
    private Bundle f4353c;

    /* renamed from: d */
    private final Lazy f4354d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/o0;", "b", "()Landroidx/lifecycle/o0;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<o0> {

        /* renamed from: c */
        final /* synthetic */ z0 f4355c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z0 z0Var) {
            super(0);
            this.f4355c = z0Var;
        }

        /* renamed from: b */
        public final o0 invoke() {
            return m0.e(this.f4355c);
        }
    }

    public n0(k1.c cVar, z0 z0Var) {
        Lazy a10;
        hc.t.e(cVar, "savedStateRegistry");
        hc.t.e(z0Var, "viewModelStoreOwner");
        this.f4351a = cVar;
        a10 = tb.m.a(new a(z0Var));
        this.f4354d = a10;
    }

    private final o0 c() {
        return (o0) this.f4354d.getValue();
    }

    @Override // k1.c.AbstractC0210c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4353c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, l0> entry : c().f().entrySet()) {
            String key = entry.getKey();
            Bundle a10 = entry.getValue().h().a();
            if (!hc.t.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(key, a10);
            }
        }
        this.f4352b = false;
        return bundle;
    }

    public final Bundle b(String str) {
        hc.t.e(str, "key");
        d();
        Bundle bundle = this.f4353c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f4353c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f4353c;
        boolean z10 = true;
        if (bundle4 == null || !bundle4.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            this.f4353c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (!this.f4352b) {
            this.f4353c = this.f4351a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f4352b = true;
            c();
        }
    }
}
