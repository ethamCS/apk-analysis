package k7;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.Fragment;
import k7.o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.a0;
import s4.b1;
import s4.l0;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\u0012\b\b\u0003\u0010*\u001a\u00020\u0019¢\u0006\u0004\b+\u0010,J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J6\u0010\u0015\u001a\u00020\u00072\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R8\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0016R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lk7/g;", "Landroidx/fragment/app/Fragment;", "Lk7/o;", "Lk7/s;", BuildConfig.FLAVOR, "Landroid/os/Bundle;", "savedInstanceState", "Ltb/e0;", "P0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "T0", "k1", "j", "Lkotlin/Function2;", "Lkotlinx/coroutines/q0;", "Lxb/d;", "block", "o2", "(Lgc/p;)V", "Lkotlin/Function0;", "r2", BuildConfig.FLAVOR, "accessibilityResId", "p2", "inflaterHook", "Lgc/p;", "getInflaterHook$android_utils_release", "()Lgc/p;", "q2", "Ls4/l0;", "loading", "Ls4/l0;", "b", "()Ls4/l0;", "announcementAccessibilityRes", "Ljava/lang/Integer;", "n2", "()Ljava/lang/Integer;", "contentLayoutId", "<init>", "(I)V", "android-utils_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class g extends Fragment implements o, s, s4.v {
    private gc.p<? super LayoutInflater, ? super ViewGroup, ? extends View> R4;
    private final l0<Integer> S4;
    private final Integer T4;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "com.ibm.health.common.android.utils.BaseHookedFragment$launchWhenStarted$1", f = "BaseHookedFragment.kt", l = {63}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements gc.p<q0, xb.d<? super e0>, Object> {
        private /* synthetic */ Object U3;
        final /* synthetic */ gc.p<q0, xb.d<? super e0>, Object> W3;

        /* renamed from: y */
        int f14654y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(gc.p<? super q0, ? super xb.d<? super e0>, ? extends Object> pVar, xb.d<? super a> dVar) {
            super(2, dVar);
            g.this = r1;
            this.W3 = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
        @Override // zb.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object B(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = yb.b.c()
                int r1 = r4.f14654y
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r4.U3
                k7.g r0 = (k7.g) r0
                tb.t.b(r5)     // Catch: java.lang.Throwable -> L13
                goto L3e
            L13:
                r5 = move-exception
                goto L35
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1d:
                tb.t.b(r5)
                java.lang.Object r5 = r4.U3
                kotlinx.coroutines.q0 r5 = (kotlinx.coroutines.q0) r5
                k7.g r1 = k7.g.this
                gc.p<kotlinx.coroutines.q0, xb.d<? super tb.e0>, java.lang.Object> r3 = r4.W3
                r4.U3 = r1     // Catch: java.lang.Throwable -> L33
                r4.f14654y = r2     // Catch: java.lang.Throwable -> L33
                java.lang.Object r5 = r3.u(r5, r4)     // Catch: java.lang.Throwable -> L33
                if (r5 != r0) goto L3e
                return r0
            L33:
                r5 = move-exception
                r0 = r1
            L35:
                boolean r1 = s4.a0.a(r5)
                if (r1 != 0) goto L41
                r0.a(r5)
            L3e:
                tb.e0 r5 = tb.e0.f22152a
                return r5
            L41:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: k7.g.a.B(java.lang.Object):java.lang.Object");
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((a) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            a aVar = new a(this.W3, dVar);
            aVar.U3 = obj;
            return aVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "com.ibm.health.common.android.utils.BaseHookedFragment$onCreate$1", f = "BaseHookedFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends zb.l implements gc.p<q0, xb.d<? super e0>, Object> {

        /* renamed from: y */
        int f14655y;

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes.dex */
        public /* synthetic */ class a extends hc.q implements gc.l<Boolean, e0> {
            a(Object obj) {
                super(1, obj, g.class, "setLoading", "setLoading(Z)V", 0);
            }

            public final void i0(boolean z10) {
                ((g) this.f11756d).G(z10);
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
            g.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f14655y == 0) {
                tb.t.b(obj);
                g gVar = g.this;
                p.a(gVar, gVar.b(), new a(g.this));
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

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/fragment/app/Fragment;", "it", "Lk7/s;", "b", "(Landroidx/fragment/app/Fragment;)Lk7/s;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class c extends hc.v implements gc.l<Fragment, s> {

        /* renamed from: c */
        public static final c f14656c = new c();

        c() {
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

    public g() {
        this(0, 1, null);
    }

    public g(int i10) {
        super(i10);
        this.S4 = b1.b(0, null, 2, null);
    }

    public /* synthetic */ g(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    @Override // s4.o0
    public void L(s4.q0<? extends s4.v> q0Var) {
        o.a.a(this, q0Var);
    }

    @Override // androidx.fragment.app.Fragment
    public void P0(Bundle bundle) {
        super.P0(bundle);
        androidx.lifecycle.w.a(this).g(new b(null));
        androidx.fragment.app.w S = S();
        hc.t.d(S, "childFragmentManager");
        l.b(S);
    }

    @Override // androidx.fragment.app.Fragment
    public View T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View u10;
        hc.t.e(layoutInflater, "inflater");
        gc.p<? super LayoutInflater, ? super ViewGroup, ? extends View> pVar = this.R4;
        return (pVar == null || (u10 = pVar.u(layoutInflater, viewGroup)) == null) ? super.T0(layoutInflater, viewGroup, bundle) : u10;
    }

    @Override // k7.o
    public final l0<Integer> b() {
        return this.S4;
    }

    @Override // k7.s
    public void j() {
        androidx.fragment.app.w S = S();
        hc.t.d(S, "childFragmentManager");
        for (s sVar : m.b(S, false, c.f14656c, 1, null)) {
            sVar.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void k1() {
        super.k1();
        Integer n22 = n2();
        if (n22 != null) {
            p2(n22.intValue());
        }
    }

    public Integer n2() {
        return this.T4;
    }

    public void o2(gc.p<? super q0, ? super xb.d<? super e0>, ? extends Object> pVar) {
        hc.t.e(pVar, "block");
        androidx.lifecycle.w.a(this).g(new a(pVar, null));
    }

    public void p2(int i10) {
        Context T = T();
        Object systemService = T != null ? T.getSystemService("accessibility") : null;
        hc.t.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.setClassName(getClass().getName());
            obtain.setPackageName(S1().getPackageName());
            obtain.getText().add(u0(i10));
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    public final void q2(gc.p<? super LayoutInflater, ? super ViewGroup, ? extends View> pVar) {
        this.R4 = pVar;
    }

    public void r2(gc.a<e0> aVar) {
        hc.t.e(aVar, "block");
        try {
            aVar.invoke();
        } catch (Throwable th2) {
            if (a0.a(th2)) {
                throw th2;
            }
            a(th2);
        }
    }
}
