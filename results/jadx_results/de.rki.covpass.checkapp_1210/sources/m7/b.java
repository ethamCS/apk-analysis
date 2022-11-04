package m7;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import de.rki.covpass.logging.Lumber;
import hc.k0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\"!\u0010\u0007\u001a\u00020\u00008BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\"%\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ltb/e0;", "initActivityNavigator$delegate", "Lkotlin/Lazy;", "h", "()Ltb/e0;", "getInitActivityNavigator$annotations", "()V", "initActivityNavigator", "Landroid/app/Activity;", "value", "g", "()Landroid/app/Activity;", "j", "(Landroid/app/Activity;)V", "currentActivity", BuildConfig.FLAVOR, "Loc/d;", BuildConfig.FLAVOR, "blockListFragmentsLifecycleLogging", "Ljava/util/List;", "f", "()Ljava/util/List;", BuildConfig.FLAVOR, "shouldLogFragmentLifecycleRecursive", "Z", "i", "()Z", "setShouldLogFragmentLifecycleRecursive", "(Z)V", "navigation_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private static final Lazy f16396a;

    /* renamed from: b */
    private static kotlinx.coroutines.flow.p<Activity> f16397b;

    /* renamed from: d */
    private static final List<oc.d<? extends Object>> f16399d;

    /* renamed from: c */
    private static final a f16398c = new a();

    /* renamed from: e */
    private static boolean f16400e = true;

    @Metadata(bv = {}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\"\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J*\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016J \u0010\u0018\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u001c"}, d2 = {"m7/b$a", "Landroidx/fragment/app/w$l;", BuildConfig.FLAVOR, "callback", "Landroidx/fragment/app/Fragment;", "fragment", "Ltb/e0;", "o", "Landroidx/fragment/app/w;", "fm", "f", "Landroid/content/Context;", "context", "b", "Landroid/os/Bundle;", "savedInstanceState", "c", "Landroid/view/View;", "v", "m", "k", "i", "l", "outState", "j", "n", "d", "e", "navigation_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends w.l {
        a() {
        }

        private final void o(String str, Fragment fragment) {
            boolean z10;
            List<oc.d<? extends Object>> f10 = b.f();
            if (!(f10 instanceof Collection) || !f10.isEmpty()) {
                Iterator<T> it = f10.iterator();
                while (it.hasNext()) {
                    if (((oc.d) it.next()).B(fragment)) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (z10 || !Lumber.Companion.getEnabled()) {
                return;
            }
            timber.log.a.f22457a.d(null, str + ", " + fragment.getClass().getSimpleName(), new Object[0]);
        }

        @Override // androidx.fragment.app.w.l
        public void b(androidx.fragment.app.w wVar, Fragment fragment, Context context) {
            hc.t.e(wVar, "fm");
            hc.t.e(fragment, "f");
            hc.t.e(context, "context");
            super.b(wVar, fragment, context);
            o("onFragmentAttached", fragment);
        }

        @Override // androidx.fragment.app.w.l
        public void c(androidx.fragment.app.w wVar, Fragment fragment, Bundle bundle) {
            hc.t.e(wVar, "fm");
            hc.t.e(fragment, "f");
            super.c(wVar, fragment, bundle);
            o("onFragmentCreated", fragment);
        }

        @Override // androidx.fragment.app.w.l
        public void d(androidx.fragment.app.w wVar, Fragment fragment) {
            hc.t.e(wVar, "fm");
            hc.t.e(fragment, "f");
            super.d(wVar, fragment);
            o("onFragmentDestroyed", fragment);
        }

        @Override // androidx.fragment.app.w.l
        public void e(androidx.fragment.app.w wVar, Fragment fragment) {
            hc.t.e(wVar, "fm");
            hc.t.e(fragment, "f");
            super.e(wVar, fragment);
            o("onFragmentDetached", fragment);
        }

        @Override // androidx.fragment.app.w.l
        public void f(androidx.fragment.app.w wVar, Fragment fragment) {
            hc.t.e(wVar, "fm");
            hc.t.e(fragment, "f");
            super.f(wVar, fragment);
            o("onFragmentPaused", fragment);
        }

        @Override // androidx.fragment.app.w.l
        public void i(androidx.fragment.app.w wVar, Fragment fragment) {
            hc.t.e(wVar, "fm");
            hc.t.e(fragment, "f");
            super.i(wVar, fragment);
            o("onFragmentResumed", fragment);
        }

        @Override // androidx.fragment.app.w.l
        public void j(androidx.fragment.app.w wVar, Fragment fragment, Bundle bundle) {
            hc.t.e(wVar, "fm");
            hc.t.e(fragment, "f");
            hc.t.e(bundle, "outState");
            super.j(wVar, fragment, bundle);
            o("onFragmentSaveInstanceState", fragment);
        }

        @Override // androidx.fragment.app.w.l
        public void k(androidx.fragment.app.w wVar, Fragment fragment) {
            hc.t.e(wVar, "fm");
            hc.t.e(fragment, "f");
            super.k(wVar, fragment);
            o("onFragmentStarted", fragment);
        }

        @Override // androidx.fragment.app.w.l
        public void l(androidx.fragment.app.w wVar, Fragment fragment) {
            hc.t.e(wVar, "fm");
            hc.t.e(fragment, "f");
            super.l(wVar, fragment);
            o("onFragmentStopped", fragment);
        }

        @Override // androidx.fragment.app.w.l
        public void m(androidx.fragment.app.w wVar, Fragment fragment, View view, Bundle bundle) {
            hc.t.e(wVar, "fm");
            hc.t.e(fragment, "f");
            hc.t.e(view, "v");
            super.m(wVar, fragment, view, bundle);
            o("onFragmentViewCreated", fragment);
        }

        @Override // androidx.fragment.app.w.l
        public void n(androidx.fragment.app.w wVar, Fragment fragment) {
            hc.t.e(wVar, "fm");
            hc.t.e(fragment, "f");
            super.n(wVar, fragment);
            o("onFragmentViewDestroyed", fragment);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 7, 1})
    /* renamed from: m7.b$b */
    /* loaded from: classes.dex */
    static final class C0245b extends hc.v implements gc.a<tb.e0> {

        /* renamed from: c */
        public static final C0245b f16401c = new C0245b();

        C0245b() {
            super(0);
        }

        public final void b() {
            l lVar = l.f16405a;
            if (!lVar.a()) {
                s.a().b().registerActivityLifecycleCallbacks(lVar);
                lVar.b(true);
            }
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ tb.e0 invoke() {
            b();
            return tb.e0.f22152a;
        }
    }

    static {
        Lazy a10;
        List<oc.d<? extends Object>> n10;
        a10 = tb.m.a(C0245b.f16401c);
        f16396a = a10;
        n10 = ub.u.n(k0.b(androidx.fragment.app.e.class));
        f16399d = n10;
    }

    public static final List<oc.d<? extends Object>> f() {
        return f16399d;
    }

    public static final Activity g() {
        kotlinx.coroutines.flow.p<Activity> pVar = f16397b;
        if (pVar == null) {
            hc.t.s("currentActivityFlow");
            pVar = null;
        }
        return pVar.getValue();
    }

    public static final tb.e0 h() {
        f16396a.getValue();
        return tb.e0.f22152a;
    }

    public static final boolean i() {
        return f16400e;
    }

    public static final void j(Activity activity) {
        kotlinx.coroutines.flow.p<Activity> pVar = f16397b;
        if (pVar == null) {
            f16397b = kotlinx.coroutines.flow.y.a(activity);
            return;
        }
        if (pVar == null) {
            hc.t.s("currentActivityFlow");
            pVar = null;
        }
        pVar.setValue(activity);
    }
}
