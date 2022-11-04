package k7;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import k7.o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.b1;
import s4.l0;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\u0012\b\b\u0003\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lk7/e;", "Landroidx/appcompat/app/c;", "Lk7/o;", BuildConfig.FLAVOR, "Landroid/os/Bundle;", "savedInstanceState", "Ltb/e0;", "onCreate", "Landroid/content/Intent;", "intent", "onNewIntent", "onUserInteraction", "Landroid/view/MenuItem;", "item", BuildConfig.FLAVOR, "onOptionsItemSelected", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "Ls1/a;", "binding", "Ls1/a;", "I0", "()Ls1/a;", "Ls4/l0;", BuildConfig.FLAVOR, "loading", "Ls4/l0;", "b", "()Ls4/l0;", "contentLayoutId", "<init>", "(I)V", "android-utils_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class e extends androidx.appcompat.app.c implements o, s4.v {

    /* renamed from: m4 */
    private final s1.a f14647m4;

    /* renamed from: n4 */
    private final l0<Integer> f14648n4;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/fragment/app/Fragment;", "it", "Lk7/n;", "b", "(Landroidx/fragment/app/Fragment;)Lk7/n;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class a extends hc.v implements gc.l<Fragment, n> {

        /* renamed from: c */
        public static final a f14649c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final n invoke(Fragment fragment) {
            hc.t.e(fragment, "it");
            if (fragment instanceof n) {
                return (n) fragment;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "com.ibm.health.common.android.utils.BaseHookedActivity$onCreate$1", f = "BaseHookedActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends zb.l implements gc.p<q0, xb.d<? super e0>, Object> {

        /* renamed from: y */
        int f14650y;

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes.dex */
        public /* synthetic */ class a extends hc.q implements gc.l<Boolean, e0> {
            a(Object obj) {
                super(1, obj, e.class, "setLoading", "setLoading(Z)V", 0);
            }

            public final void i0(boolean z10) {
                ((e) this.f11756d).G(z10);
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ e0 invoke(Boolean bool) {
                i0(bool.booleanValue());
                return e0.f22152a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(2, dVar);
            e.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f14650y == 0) {
                tb.t.b(obj);
                e eVar = e.this;
                p.a(eVar, eVar.b(), new a(e.this));
                return e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((b) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new b(dVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/fragment/app/Fragment;", "it", "Lk7/r;", "b", "(Landroidx/fragment/app/Fragment;)Lk7/r;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class c extends hc.v implements gc.l<Fragment, r> {

        /* renamed from: c */
        public static final c f14651c = new c();

        c() {
            super(1);
        }

        /* renamed from: b */
        public final r invoke(Fragment fragment) {
            hc.t.e(fragment, "it");
            if (fragment instanceof r) {
                return (r) fragment;
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/fragment/app/Fragment;", "it", "Lk7/s;", "b", "(Landroidx/fragment/app/Fragment;)Lk7/s;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class d extends hc.v implements gc.l<Fragment, s> {

        /* renamed from: c */
        public static final d f14652c = new d();

        d() {
            super(1);
        }

        /* renamed from: b */
        public final s invoke(Fragment fragment) {
            hc.t.e(fragment, "it");
            if (fragment instanceof s) {
                return (s) fragment;
            }
            return null;
        }
    }

    public e() {
        this(0, 1, null);
    }

    public e(int i10) {
        super(i10);
        this.f14648n4 = b1.b(0, null, 2, null);
    }

    public /* synthetic */ e(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public s1.a I0() {
        return this.f14647m4;
    }

    @Override // s4.o0
    public void L(s4.q0<? extends s4.v> q0Var) {
        o.a.a(this, q0Var);
    }

    @Override // k7.o
    public l0<Integer> b() {
        return this.f14648n4;
    }

    @Override // androidx.appcompat.app.c, androidx.core.app.f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        hc.t.e(keyEvent, "event");
        androidx.fragment.app.w m02 = m0();
        hc.t.d(m02, "supportFragmentManager");
        for (n nVar : m.b(m02, false, a.f14649c, 1, null)) {
            if (hc.t.a(nVar.dispatchKeyEvent(keyEvent), l7.a.f15852a)) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.fragment.app.j, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.w.a(this).g(new b(null));
        s1.a I0 = I0();
        if (I0 != null) {
            setContentView(I0.a());
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        hc.t.e(intent, "intent");
        super.onNewIntent(intent);
        f.a().e(intent);
        androidx.fragment.app.w m02 = m0();
        hc.t.d(m02, "supportFragmentManager");
        for (r rVar : m.b(m02, false, c.f14651c, 1, null)) {
            rVar.a(intent);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        hc.t.e(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        super.onUserInteraction();
        androidx.fragment.app.w m02 = m0();
        hc.t.d(m02, "supportFragmentManager");
        for (s sVar : m.b(m02, false, d.f14652c, 1, null)) {
            sVar.j();
        }
    }
}
