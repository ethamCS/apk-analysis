package m7;

import android.content.Context;
import android.provider.Settings;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import de.rki.covpass.logging.Lumber;
import hc.k0;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.r0;
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\b\u0000\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u00103\u001a\u000202\u0012\b\b\u0001\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\u0014\u0010\f\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0006\u0010\u0011\u001a\u00020\u000fJ\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000fJ\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u000fJ\u0006\u0010\u0018\u001a\u00020\u0017J\u0010\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u000fJ5\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u000fJ+\u0010$\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001b2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001d¢\u0006\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R#\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00068"}, d2 = {"Lm7/v;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Landroidx/fragment/app/w$j;", "j", "Ltb/e0;", "x", "Landroidx/fragment/app/Fragment;", "fragment", "z", "y", "Landroidx/fragment/app/f0;", "f", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "n", "m", "Lm7/i;", "nav", "suppressAddToBackstack", "v", "u", "Ll7/b;", "o", "executePendingTransactions", "p", "T", "includeMatch", "Lkotlin/Function1;", "predicate", "t", "(ZLgc/l;)Ljava/lang/Object;", "immediate", "r", "block", "h", "(Lgc/l;)Ljava/lang/Object;", "Landroidx/fragment/app/w;", "fragmentManager", "Landroidx/fragment/app/w;", "l", "()Landroidx/fragment/app/w;", "Lkotlinx/coroutines/flow/w;", "backStack", "Lkotlinx/coroutines/flow/w;", "k", "()Lkotlinx/coroutines/flow/w;", "Landroidx/fragment/app/j;", "activity", "Landroidx/lifecycle/v;", "lifecycleOwner", BuildConfig.FLAVOR, "containerId", "<init>", "(Landroidx/fragment/app/j;Landroidx/fragment/app/w;Landroidx/lifecycle/v;I)V", "navigation_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a */
    private final androidx.fragment.app.j f16416a;

    /* renamed from: b */
    private final androidx.fragment.app.w f16417b;

    /* renamed from: c */
    private final androidx.lifecycle.v f16418c;

    /* renamed from: d */
    private final int f16419d;

    /* renamed from: e */
    private final kotlinx.coroutines.flow.w<List<w.j>> f16420e;

    /* renamed from: f */
    private final kotlinx.coroutines.flow.w<Integer> f16421f = s4.o.b(new c());

    /* renamed from: g */
    private final kotlinx.coroutines.flow.w<List<Fragment>> f16422g;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "com.ibm.health.common.navigation.android.Navigator$1", f = "Navigator.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zb.l implements gc.p<q0, xb.d<? super tb.e0>, Object> {

        /* renamed from: y */
        int f16423y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(2, dVar);
            v.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f16423y == 0) {
                tb.t.b(obj);
                v.this.x();
                return tb.e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super tb.e0> dVar) {
            return ((a) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new a(dVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"m7/v$b", "Landroidx/fragment/app/w$l;", "Landroidx/fragment/app/w;", "fm", "Landroidx/fragment/app/Fragment;", "f", "Landroid/content/Context;", "context", "Ltb/e0;", "b", "e", "navigation_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends w.l {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.p<List<w.j>> f16424a;

        /* renamed from: b */
        final /* synthetic */ v f16425b;

        b(kotlinx.coroutines.flow.p<List<w.j>> pVar, v vVar) {
            this.f16424a = pVar;
            this.f16425b = vVar;
        }

        @Override // androidx.fragment.app.w.l
        public void b(androidx.fragment.app.w wVar, Fragment fragment, Context context) {
            hc.t.e(wVar, "fm");
            hc.t.e(fragment, "f");
            hc.t.e(context, "context");
            super.b(wVar, fragment, context);
            this.f16424a.setValue(this.f16425b.j());
        }

        @Override // androidx.fragment.app.w.l
        public void e(androidx.fragment.app.w wVar, Fragment fragment) {
            hc.t.e(wVar, "fm");
            hc.t.e(fragment, "f");
            super.e(wVar, fragment);
            this.f16424a.setValue(this.f16425b.j());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls4/r0;", BuildConfig.FLAVOR, "b", "(Ls4/r0;)Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.l<r0, Integer> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(1);
            v.this = r1;
        }

        /* renamed from: b */
        public final Integer invoke(r0 r0Var) {
            hc.t.e(r0Var, "$this$derived");
            return Integer.valueOf(((List) s4.d.a(r0Var, v.this.k())).size());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"m7/v$d", "Landroidx/fragment/app/w$l;", "Landroidx/fragment/app/w;", "fm", "Landroidx/fragment/app/Fragment;", "f", "Landroid/content/Context;", "context", "Ltb/e0;", "b", "e", "navigation_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends w.l {

        /* renamed from: a */
        final /* synthetic */ kotlinx.coroutines.flow.p<List<Fragment>> f16427a;

        /* renamed from: b */
        final /* synthetic */ v f16428b;

        d(kotlinx.coroutines.flow.p<List<Fragment>> pVar, v vVar) {
            this.f16427a = pVar;
            this.f16428b = vVar;
        }

        @Override // androidx.fragment.app.w.l
        public void b(androidx.fragment.app.w wVar, Fragment fragment, Context context) {
            List<Fragment> F0;
            hc.t.e(wVar, "fm");
            hc.t.e(fragment, "f");
            hc.t.e(context, "context");
            super.b(wVar, fragment, context);
            kotlinx.coroutines.flow.p<List<Fragment>> pVar = this.f16427a;
            List<Fragment> x02 = this.f16428b.l().x0();
            hc.t.d(x02, "fragmentManager.fragments");
            F0 = ub.c0.F0(x02);
            pVar.setValue(F0);
            androidx.fragment.app.j jVar = this.f16428b.f16416a;
            hc.t.c(jVar, "null cannot be cast to non-null type com.ibm.health.common.navigation.android.NavigatorOwner");
            ((x) jVar).e(fragment);
        }

        @Override // androidx.fragment.app.w.l
        public void e(androidx.fragment.app.w wVar, Fragment fragment) {
            List<Fragment> F0;
            hc.t.e(wVar, "fm");
            hc.t.e(fragment, "f");
            super.e(wVar, fragment);
            kotlinx.coroutines.flow.p<List<Fragment>> pVar = this.f16427a;
            List<Fragment> x02 = this.f16428b.l().x0();
            hc.t.d(x02, "fragmentManager.fragments");
            F0 = ub.c0.F0(x02);
            pVar.setValue(F0);
            androidx.fragment.app.j jVar = this.f16428b.f16416a;
            hc.t.c(jVar, "null cannot be cast to non-null type com.ibm.health.common.navigation.android.NavigatorOwner");
            ((x) jVar).p(fragment);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/fragment/app/Fragment;", "it", "b", "(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/Fragment;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends hc.v implements gc.l<Fragment, Fragment> {

        /* renamed from: c */
        final /* synthetic */ Fragment f16429c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Fragment fragment) {
            super(1);
            this.f16429c = fragment;
        }

        /* renamed from: b */
        public final Fragment invoke(Fragment fragment) {
            hc.t.e(fragment, "it");
            if (hc.t.a(k0.b(fragment.getClass()), k0.b(this.f16429c.getClass()))) {
                return fragment;
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/fragment/app/Fragment;", "it", "b", "(Landroidx/fragment/app/Fragment;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f extends hc.v implements gc.l<Fragment, h> {

        /* renamed from: c */
        public static final f f16430c = new f();

        public f() {
            super(1);
        }

        /* renamed from: b */
        public final h invoke(Fragment fragment) {
            hc.t.e(fragment, "it");
            if (!(fragment instanceof h)) {
                fragment = null;
            }
            return (h) fragment;
        }
    }

    public v(androidx.fragment.app.j jVar, androidx.fragment.app.w wVar, androidx.lifecycle.v vVar, int i10) {
        List h10;
        hc.t.e(jVar, "activity");
        hc.t.e(wVar, "fragmentManager");
        hc.t.e(vVar, "lifecycleOwner");
        this.f16416a = jVar;
        this.f16417b = wVar;
        this.f16418c = vVar;
        this.f16419d = i10;
        final kotlinx.coroutines.flow.p a10 = kotlinx.coroutines.flow.y.a(j());
        wVar.k1(new b(a10, this), false);
        wVar.l(new w.n() { // from class: m7.t
            @Override // androidx.fragment.app.w.n
            public final void a() {
                v.g(kotlinx.coroutines.flow.p.this, this);
            }
        });
        this.f16420e = a10;
        h10 = ub.u.h();
        final kotlinx.coroutines.flow.p a11 = kotlinx.coroutines.flow.y.a(h10);
        wVar.k1(new d(a11, this), false);
        wVar.l(new w.n() { // from class: m7.u
            @Override // androidx.fragment.app.w.n
            public final void a() {
                v.i(kotlinx.coroutines.flow.p.this, this);
            }
        });
        this.f16422g = a11;
        androidx.lifecycle.w.a(vVar).d(new a(null));
    }

    static /* synthetic */ void A(v vVar, Fragment fragment, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fragment = null;
        }
        vVar.z(fragment);
    }

    private final void f(androidx.fragment.app.f0 f0Var, Fragment fragment) {
        s.a().a().b(f0Var, fragment);
    }

    public static final void g(kotlinx.coroutines.flow.p pVar, v vVar) {
        hc.t.e(pVar, "$this_apply");
        hc.t.e(vVar, "this$0");
        pVar.setValue(vVar.j());
    }

    public static final void i(kotlinx.coroutines.flow.p pVar, v vVar) {
        List F0;
        hc.t.e(pVar, "$this_apply");
        hc.t.e(vVar, "this$0");
        List<Fragment> x02 = vVar.f16417b.x0();
        hc.t.d(x02, "fragmentManager.fragments");
        F0 = ub.c0.F0(x02);
        pVar.setValue(F0);
    }

    public final List<w.j> j() {
        List c10;
        List<w.j> a10;
        c10 = ub.t.c();
        int r02 = this.f16417b.r0();
        for (int i10 = 0; i10 < r02; i10++) {
            w.j q02 = this.f16417b.q0(i10);
            hc.t.d(q02, "fragmentManager.getBackStackEntryAt(i)");
            c10.add(i10, q02);
        }
        a10 = ub.t.a(c10);
        return a10;
    }

    private final boolean n(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation") == 1;
        } catch (Settings.SettingNotFoundException e10) {
            if (!Lumber.Companion.getEnabled()) {
                return false;
            }
            timber.log.a.f22457a.e(e10, null, new Object[0]);
            return false;
        }
    }

    public static /* synthetic */ boolean q(v vVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return vVar.p(z10);
    }

    public static /* synthetic */ void s(v vVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        vVar.r(z10);
    }

    public static /* synthetic */ void w(v vVar, i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        vVar.v(iVar, z10);
    }

    public final void x() {
        A(this, null, 1, null);
        y();
    }

    private final void y() {
        List<Fragment> x02 = this.f16417b.x0();
        hc.t.d(x02, "fragmentManager.fragments");
        for (Fragment fragment : x02) {
            m7.c cVar = fragment instanceof m7.c ? (m7.c) fragment : null;
            if (cVar != null) {
                hc.t.d(fragment, "it");
                cVar.r(null, fragment);
            }
        }
    }

    private final void z(Fragment fragment) {
        a0 a0Var;
        int d10;
        Object obj = fragment;
        if (n(this.f16416a)) {
            if (fragment == null) {
                Object obj2 = (h) h(f.f16430c);
                obj = obj2;
                if (obj2 == null) {
                    obj = this.f16418c;
                }
            }
            h hVar = null;
            h hVar2 = obj instanceof h ? (h) obj : null;
            if (hVar2 == null) {
                try {
                    androidx.lifecycle.v vVar = this.f16418c;
                    Fragment fragment2 = vVar instanceof Fragment ? (Fragment) vVar : null;
                    v a10 = fragment2 != null ? g.a(fragment2, 1) : null;
                    if (a10 != null) {
                        A(a10, null, 1, null);
                        return;
                    }
                } catch (y unused) {
                }
            } else {
                hVar = hVar2;
            }
            if (hVar == null || (a0Var = hVar.a()) == null) {
                a0Var = s.a().c();
            }
            androidx.fragment.app.j jVar = this.f16416a;
            d10 = w.d(a0Var);
            jVar.setRequestedOrientation(d10);
        }
    }

    public final <T> T h(gc.l<? super Fragment, ? extends T> lVar) {
        List<Fragment> q02;
        hc.t.e(lVar, "block");
        List<Fragment> x02 = this.f16417b.x0();
        hc.t.d(x02, "fragmentManager.fragments");
        q02 = ub.c0.q0(x02);
        for (Fragment fragment : q02) {
            hc.t.d(fragment, "fragment");
            T invoke = lVar.invoke(fragment);
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    public final kotlinx.coroutines.flow.w<List<w.j>> k() {
        return this.f16420e;
    }

    public final androidx.fragment.app.w l() {
        return this.f16417b;
    }

    public final boolean m() {
        this.f16417b.g0();
        return this.f16417b.x0().isEmpty();
    }

    public final l7.b o() {
        Object i02;
        l7.b bVar;
        l7.a aVar;
        v N;
        this.f16417b.g0();
        List<Fragment> x02 = this.f16417b.x0();
        hc.t.d(x02, "fragmentManager.fragments");
        i02 = ub.c0.i0(x02);
        Fragment fragment = (Fragment) i02;
        if (fragment != null) {
            z zVar = fragment instanceof z ? (z) fragment : null;
            if (zVar == null || (bVar = zVar.m()) == null) {
                x xVar = fragment instanceof x ? (x) fragment : null;
                if (xVar != null && (N = xVar.N()) != null) {
                    bVar = N.o();
                }
            }
            aVar = l7.a.f15852a;
            return (hc.t.a(bVar, aVar) || q(this, false, 1, null)) ? aVar : l7.c.f15853a;
        }
        bVar = null;
        aVar = l7.a.f15852a;
        if (hc.t.a(bVar, aVar)) {
            return aVar;
        }
    }

    public final boolean p(boolean z10) {
        if (z10) {
            this.f16417b.g0();
        }
        if (this.f16417b.r0() > 0) {
            this.f16417b.b1();
            return true;
        }
        return false;
    }

    public final void r(boolean z10) {
        if (z10) {
            this.f16417b.g1(null, 1);
        } else {
            this.f16417b.d1(null, 1);
        }
    }

    public final <T> T t(boolean z10, gc.l<Object, ? extends T> lVar) {
        Object i02;
        hc.t.e(lVar, "predicate");
        this.f16417b.g0();
        T t10 = null;
        do {
            List<Fragment> x02 = this.f16417b.x0();
            hc.t.d(x02, "fragmentManager.fragments");
            i02 = ub.c0.i0(x02);
            Fragment fragment = (Fragment) i02;
            if (fragment != null && (t10 = lVar.invoke(fragment)) == null) {
            }
        } while (this.f16417b.e1());
        if (z10) {
            q(this, false, 1, null);
        }
        return t10;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(androidx.fragment.app.Fragment r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "fragment"
            hc.t.e(r8, r0)
            androidx.fragment.app.w r0 = r7.f16417b
            androidx.fragment.app.f0 r0 = r0.p()
            boolean r1 = r8 instanceof m7.b0
            r2 = 0
            if (r1 == 0) goto L14
            r3 = r8
            m7.b0 r3 = (m7.b0) r3
            goto L15
        L14:
            r3 = r2
        L15:
            if (r3 == 0) goto L1c
            androidx.fragment.app.Fragment r3 = r3.p()
            goto L1d
        L1c:
            r3 = r2
        L1d:
            java.lang.String r4 = ""
            if (r3 == 0) goto L37
            m7.v$e r5 = new m7.v$e
            r5.<init>(r3)
            java.lang.Object r5 = r7.h(r5)
            if (r5 != 0) goto L37
            hc.t.d(r0, r4)
            r7.f(r0, r3)
            int r5 = r7.f16419d
            r0.b(r5, r3)
        L37:
            androidx.fragment.app.w r3 = r7.f16417b
            java.util.List r3 = r3.x0()
            java.lang.String r5 = "fragmentManager.fragments"
            hc.t.d(r3, r5)
            java.lang.Object r3 = ub.s.i0(r3)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            boolean r6 = r3 instanceof m7.b0
            if (r6 == 0) goto L57
            if (r1 == 0) goto L57
            hc.t.d(r0, r4)
            r7.f(r0, r3)
            r0.n(r3)
        L57:
            if (r9 != 0) goto La2
            androidx.fragment.app.w r9 = r7.f16417b
            java.util.List r9 = r9.x0()
            hc.t.d(r9, r5)
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ 1
            if (r9 != 0) goto L6c
            if (r1 == 0) goto La2
        L6c:
            androidx.fragment.app.w r9 = r7.f16417b
            java.util.List r9 = r9.x0()
            hc.t.d(r9, r5)
            java.lang.Object r9 = ub.s.i0(r9)
            androidx.fragment.app.Fragment r9 = (androidx.fragment.app.Fragment) r9
            if (r9 == 0) goto L81
            java.lang.String r2 = m7.w.e(r9)
        L81:
            java.lang.String r9 = m7.w.e(r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "N:"
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = "|"
            r3.append(r2)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            r0.g(r9)
            goto Lb1
        La2:
            androidx.fragment.app.w r9 = r7.f16417b
            java.util.List r9 = r9.x0()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto Lb1
            r7.z(r8)
        Lb1:
            hc.t.d(r0, r4)
            r7.f(r0, r8)
            boolean r9 = r8 instanceof androidx.fragment.app.e
            if (r9 == 0) goto Lc6
            r9 = r8
            androidx.fragment.app.e r9 = (androidx.fragment.app.e) r9
            java.lang.String r8 = m7.w.e(r8)
            r9.A2(r0, r8)
            return
        Lc6:
            int r9 = r7.f16419d
            if (r1 == 0) goto Ld2
            java.lang.String r1 = m7.w.e(r8)
            r0.c(r9, r8, r1)
            goto Ld9
        Ld2:
            java.lang.String r1 = m7.w.e(r8)
            r0.r(r9, r8, r1)
        Ld9:
            r0.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.v.u(androidx.fragment.app.Fragment, boolean):void");
    }

    public final void v(i iVar, boolean z10) {
        hc.t.e(iVar, "nav");
        u(iVar.b(), z10);
    }
}
