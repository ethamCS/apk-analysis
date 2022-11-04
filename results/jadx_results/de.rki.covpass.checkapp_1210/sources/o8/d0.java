package o8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.l0;
import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import de.rki.covpass.commonapp.uielements.CenteredTitleToolbar;
import de.rki.covpass.commonapp.uielements.CheckContextCheckboxElement;
import de.rki.covpass.commonapp.uielements.ExpertModeToggleElement;
import hc.k0;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.r0;
import s4.v0;
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u00011B\u0007¢\u0006\u0004\b/\u00100J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001a\u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lo8/d0;", "Lj8/f;", "Lm8/b;", "Ltb/e0;", "M2", "I2", "F2", BuildConfig.FLAVOR, "allUpToDate", "O2", "isLoading", "P2", "R2", "Q2", "N2", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "o1", BuildConfig.FLAVOR, "tag", "Lm8/a;", "action", "h", "Lk8/f;", "binding$delegate", "Lkc/c;", "D2", "()Lk8/f;", "binding", "Lo8/e0;", "args$delegate", "Lkotlin/Lazy;", "C2", "()Lo8/e0;", "args", "Lo8/f0;", "settingsUpdateViewModel$delegate", "E2", "()Lo8/f0;", "settingsUpdateViewModel", BuildConfig.FLAVOR, "announcementAccessibilityRes", "I", "n2", "()Ljava/lang/Integer;", "<init>", "()V", "a", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d0 extends j8.f implements m8.b {
    private final Lazy V4;
    private final Lazy W4;
    static final /* synthetic */ oc.k<Object>[] Y4 = {k0.g(new hc.e0(d0.class, "binding", "getBinding()Lde/rki/covpass/commonapp/databinding/CheckSettingsBinding;", 0))};
    private static final a Companion = new a(null);
    private final kc.c U4 = k7.z.b(this, c.Y3, null, null, 6, null);
    private final int X4 = j8.n.g_res_0x7f10007f;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lo8/d0$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "DELETE_REVOCATION_LIST", "Ljava/lang/String;", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo8/e0;", "b", "()Lo8/e0;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class b extends hc.v implements gc.a<e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            d0.this = r1;
        }

        /* renamed from: b */
        public final e0 invoke() {
            return (e0) m7.k.a(d0.this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    /* synthetic */ class c extends hc.q implements gc.q<LayoutInflater, ViewGroup, Boolean, k8.f> {
        public static final c Y3 = new c();

        c() {
            super(3, k8.f.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/commonapp/databinding/CheckSettingsBinding;", 0);
        }

        public final k8.f i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            hc.t.e(layoutInflater, "p0");
            return k8.f.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ k8.f s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls4/r0;", "Ltb/e0;", "b", "(Ls4/r0;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends hc.v implements gc.l<r0, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ x f17660c;

        /* renamed from: d */
        final /* synthetic */ d0 f17661d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(x xVar, d0 d0Var) {
            super(1);
            this.f17660c = xVar;
            this.f17661d = d0Var;
        }

        public final void b(r0 r0Var) {
            hc.t.e(r0Var, "$this$autoRun");
            this.f17660c.z((List) s4.d.a(r0Var, this.f17661d.E2().x()));
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(r0 r0Var) {
            b(r0Var);
            return tb.e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls4/r0;", "Ltb/e0;", "b", "(Ls4/r0;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends hc.v implements gc.l<r0, tb.e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(1);
            d0.this = r1;
        }

        public final void b(r0 r0Var) {
            hc.t.e(r0Var, "$this$autoRun");
            d0 d0Var = d0.this;
            d0Var.P2(((Number) s4.d.a(r0Var, d0Var.b())).intValue() > 0);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(r0 r0Var) {
            b(r0Var);
            return tb.e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls4/r0;", "Ltb/e0;", "b", "(Ls4/r0;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f extends hc.v implements gc.l<r0, tb.e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f() {
            super(1);
            d0.this = r1;
        }

        public final void b(r0 r0Var) {
            hc.t.e(r0Var, "$this$autoRun");
            d0 d0Var = d0.this;
            d0Var.O2(((Boolean) s4.d.a(r0Var, d0Var.E2().w())).booleanValue());
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(r0 r0Var) {
            b(r0Var);
            return tb.e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/s0;", "T", "Landroidx/lifecycle/v0$b;", "b", "()Landroidx/lifecycle/v0$b;", "com/ensody/reactivestate/android/g"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class g extends hc.v implements gc.a<v0.b> {

        /* renamed from: c */
        final /* synthetic */ Fragment f17664c;

        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\r"}, d2 = {"com/ensody/reactivestate/android/ViewModelExtKt$stateFlowViewModel$2$1", "Landroidx/lifecycle/a;", "Landroidx/lifecycle/s0;", "T", BuildConfig.FLAVOR, "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/l0;", "handle", "e", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/l0;)Landroidx/lifecycle/s0;", "reactivestate_release", "com/ensody/reactivestate/android/g$a"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class a extends androidx.lifecycle.a {
            public a(Fragment fragment) {
                super(fragment, null);
            }

            @Override // androidx.lifecycle.a
            protected <T extends s0> T e(String str, Class<T> cls, l0 l0Var) {
                hc.t.e(str, "key");
                hc.t.e(cls, "modelClass");
                hc.t.e(l0Var, "handle");
                return new com.ensody.reactivestate.android.l(new com.ensody.reactivestate.android.h(l0Var));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f17664c = fragment;
        }

        /* renamed from: b */
        public final v0.b invoke() {
            return new a(this.f17664c);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/fragment/app/Fragment;", "com/ensody/reactivestate/android/j", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class h extends hc.v implements gc.a<Fragment> {

        /* renamed from: c */
        final /* synthetic */ Fragment f17665c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f17665c = fragment;
        }

        /* renamed from: b */
        public final Fragment invoke() {
            return this.f17665c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/lifecycle/y0;", "com/ensody/reactivestate/android/k", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class i extends hc.v implements gc.a<y0> {

        /* renamed from: c */
        final /* synthetic */ gc.a f17666c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(gc.a aVar) {
            super(0);
            this.f17666c = aVar;
        }

        /* renamed from: b */
        public final y0 invoke() {
            y0 I = ((z0) this.f17666c.invoke()).I();
            hc.t.d(I, "ownerProducer().viewModelStore");
            return I;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class j extends hc.v implements gc.l<Object, f0> {

        /* renamed from: c */
        public static final j f17667c = new j();

        public j() {
            super(1);
        }

        @Override // gc.l
        public final f0 invoke(Object obj) {
            if (!(obj instanceof f0)) {
                obj = null;
            }
            return (f0) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "Lcom/ensody/reactivestate/android/b;", "b", "(Lcom/ensody/reactivestate/android/b;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class k extends hc.v implements gc.l<com.ensody.reactivestate.android.b, f0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k() {
            super(1);
            d0.this = r1;
        }

        /* renamed from: b */
        public final f0 invoke(com.ensody.reactivestate.android.b bVar) {
            hc.t.e(bVar, "$this$buildOnViewModel");
            return new f0(bVar.a(), d0.this.C2().a(), null, null, null, null, null, null, null, null, null, 2044, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.commonapp.information.SettingsFragment$updateOfflineRevocationState$1", f = "SettingsFragment.kt", l = {151}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class l extends zb.l implements gc.p<q0, xb.d<? super tb.e0>, Object> {

        /* renamed from: y */
        int f17669y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(xb.d<? super l> dVar) {
            super(2, dVar);
            d0.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f17669y;
            if (i10 == 0) {
                tb.t.b(obj);
                s4.v0<Boolean> x10 = f9.d.b(d0.this).V0().x();
                Boolean a10 = zb.b.a(d0.this.D2().f14729h.b());
                this.f17669y = 1;
                if (v0.a.a(x10, a10, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            if (d0.this.D2().f14729h.b()) {
                d0.this.E2().A();
            } else {
                d0.this.E2().v();
            }
            return tb.e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super tb.e0> dVar) {
            return ((l) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new l(dVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.commonapp.information.SettingsFragment$updateRulesState$1", f = "SettingsFragment.kt", l = {143}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class m extends zb.l implements gc.p<q0, xb.d<? super tb.e0>, Object> {

        /* renamed from: y */
        int f17670y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(xb.d<? super m> dVar) {
            super(2, dVar);
            d0.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f17670y;
            if (i10 == 0) {
                tb.t.b(obj);
                s4.v0<Boolean> b10 = l8.b.b(d0.this).b().b();
                Boolean a10 = zb.b.a(d0.this.D2().f14725d.b());
                this.f17670y = 1;
                if (v0.a.a(b10, a10, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return tb.e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super tb.e0> dVar) {
            return ((m) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new m(dVar);
        }
    }

    public d0() {
        super(0, 1, null);
        Lazy a10;
        a10 = tb.m.a(new b());
        this.V4 = a10;
        Lazy b10 = com.ensody.reactivestate.android.f.b(androidx.fragment.app.k0.a(this, k0.b(com.ensody.reactivestate.android.l.class), new i(new h(this)), new g(this)), k0.b(f0.class), j.f17667c, new k());
        com.ensody.reactivestate.android.f.a(b10, this, this);
        this.W4 = b10;
    }

    public final e0 C2() {
        return (e0) this.V4.getValue();
    }

    public final k8.f D2() {
        return (k8.f) this.U4.a(this, Y4[0]);
    }

    public final f0 E2() {
        return (f0) this.W4.getValue();
    }

    private final void F2() {
        x xVar = new x(this);
        RecyclerView recyclerView = D2().f14732k;
        hc.t.d(recyclerView, "binding.settingsRecyclerview");
        xVar.w(recyclerView);
        com.ensody.reactivestate.android.a.b(this, null, null, new d(xVar, this), 3, null);
        com.ensody.reactivestate.android.a.b(this, null, null, new e(), 3, null);
        com.ensody.reactivestate.android.a.b(this, null, null, new f(), 3, null);
        D2().f14738q.setOnClickListener(new View.OnClickListener() { // from class: o8.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.G2(d0.this, view);
            }
        });
        D2().f14723b.setOnClickListener(new View.OnClickListener() { // from class: o8.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.H2(d0.this, view);
            }
        });
    }

    public static final void G2(d0 d0Var, View view) {
        hc.t.e(d0Var, "this$0");
        d0Var.E2().A();
    }

    public static final void H2(d0 d0Var, View view) {
        hc.t.e(d0Var, "this$0");
        d0Var.E2().u();
    }

    private final void I2() {
        boolean booleanValue = f9.d.b(this).V0().x().getValue().booleanValue();
        final ExpertModeToggleElement expertModeToggleElement = D2().f14729h;
        expertModeToggleElement.c(Integer.valueOf(j8.n.H_res_0x7f1000c0));
        expertModeToggleElement.d(booleanValue);
        expertModeToggleElement.setOnClickListener(new View.OnClickListener() { // from class: o8.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.J2(d0.this, expertModeToggleElement, view);
            }
        });
        boolean booleanValue2 = l8.b.b(this).b().b().getValue().booleanValue();
        final CheckContextCheckboxElement checkContextCheckboxElement = D2().f14724c;
        checkContextCheckboxElement.d(Integer.valueOf(j8.n.W), Integer.valueOf(j8.n.V));
        checkContextCheckboxElement.c(!booleanValue2);
        checkContextCheckboxElement.setOnClickListener(new View.OnClickListener() { // from class: o8.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.K2(CheckContextCheckboxElement.this, this, view);
            }
        });
        final CheckContextCheckboxElement checkContextCheckboxElement2 = D2().f14725d;
        checkContextCheckboxElement2.d(Integer.valueOf(j8.n.Y), Integer.valueOf(j8.n.X));
        checkContextCheckboxElement2.c(booleanValue2);
        checkContextCheckboxElement2.setOnClickListener(new View.OnClickListener() { // from class: o8.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d0.L2(CheckContextCheckboxElement.this, this, view);
            }
        });
    }

    public static final void J2(d0 d0Var, ExpertModeToggleElement expertModeToggleElement, View view) {
        hc.t.e(d0Var, "this$0");
        hc.t.e(expertModeToggleElement, "$this_apply");
        if (!d0Var.D2().f14729h.b()) {
            expertModeToggleElement.d(!d0Var.D2().f14729h.b());
            d0Var.Q2();
            return;
        }
        Integer valueOf = Integer.valueOf(j8.n.G_res_0x7f1000bf);
        String u02 = d0Var.u0(j8.n.F_res_0x7f1000be);
        hc.t.d(u02, "getString(R.string.app_i…ine_revocation_hint_copy)");
        m8.c cVar = new m8.c(0, valueOf, null, u02, Integer.valueOf(j8.n.D_res_0x7f1000bc), Integer.valueOf(j8.n.E_res_0x7f1000bd), null, 0, 0, 0, false, 0, "delete_revocation_list", 4037, null);
        androidx.fragment.app.w S = d0Var.S();
        hc.t.d(S, "childFragmentManager");
        m8.d.b(cVar, S);
    }

    public static final void K2(CheckContextCheckboxElement checkContextCheckboxElement, d0 d0Var, View view) {
        hc.t.e(checkContextCheckboxElement, "$this_apply");
        hc.t.e(d0Var, "this$0");
        checkContextCheckboxElement.c(true);
        d0Var.D2().f14725d.c(false);
        d0Var.R2();
    }

    public static final void L2(CheckContextCheckboxElement checkContextCheckboxElement, d0 d0Var, View view) {
        hc.t.e(checkContextCheckboxElement, "$this_apply");
        hc.t.e(d0Var, "this$0");
        checkContextCheckboxElement.c(true);
        d0Var.D2().f14724c.c(false);
        d0Var.R2();
    }

    private final void M2() {
        LinearLayout linearLayout = D2().f14733l;
        hc.t.d(linearLayout, "binding.settingsRulesPickerLayout");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = D2().f14726e;
        hc.t.d(linearLayout2, "binding.offlineRevocationLayout");
        linearLayout2.setVisibility(8);
    }

    private final void N2() {
        CenteredTitleToolbar centeredTitleToolbar = D2().f14736o;
        hc.t.d(centeredTitleToolbar, "binding.settingsToolbar");
        k7.j.b(this, centeredTitleToolbar);
        androidx.fragment.app.j F = F();
        androidx.appcompat.app.c cVar = F instanceof androidx.appcompat.app.c ? (androidx.appcompat.app.c) F : null;
        if (cVar != null) {
            androidx.appcompat.app.a x02 = cVar.x0();
            if (x02 != null) {
                x02.t(false);
                x02.s(true);
                x02.v(j8.j.a_res_0x7f07005e);
                x02.u(j8.n.a_res_0x7f100078);
            }
            D2().f14736o.setTitle(j8.n.Q_res_0x7f1000d3);
        }
    }

    public final void O2(boolean z10) {
        TextView textView = D2().f14735n;
        hc.t.d(textView, "binding.settingsSuccessBadge");
        int i10 = 0;
        textView.setVisibility(z10 ? 0 : 8);
        TextView textView2 = D2().f14737p;
        hc.t.d(textView2, "binding.settingsWarningBadge");
        if (z10) {
            i10 = 8;
        }
        textView2.setVisibility(i10);
    }

    public final void P2(boolean z10) {
        LinearLayout linearLayout = D2().f14731j;
        hc.t.d(linearLayout, "binding.settingsLoadingLayout");
        int i10 = 0;
        linearLayout.setVisibility(z10 ? 0 : 8);
        MaterialButton materialButton = D2().f14738q;
        hc.t.d(materialButton, "binding.updateButton");
        if (z10) {
            i10 = 8;
        }
        materialButton.setVisibility(i10);
    }

    private final void Q2() {
        o2(new l(null));
    }

    private final void R2() {
        o2(new m(null));
    }

    @Override // m8.b
    public void h(String str, m8.a aVar) {
        hc.t.e(str, "tag");
        hc.t.e(aVar, "action");
        if (!hc.t.a(str, "delete_revocation_list") || aVar != m8.a.POSITIVE) {
            return;
        }
        D2().f14729h.d(false);
        Q2();
    }

    @Override // k7.g
    public Integer n2() {
        return Integer.valueOf(this.X4);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        hc.t.e(view, "view");
        super.o1(view, bundle);
        N2();
        if (C2().a()) {
            I2();
        } else {
            M2();
        }
        F2();
    }
}
