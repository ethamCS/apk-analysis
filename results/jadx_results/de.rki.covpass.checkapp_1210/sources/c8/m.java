package c8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.l0;
import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.google.android.material.tabs.TabLayout;
import de.rki.covpass.commonapp.uielements.InfoElement;
import hc.e0;
import hc.k0;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import o8.f0;
import org.conscrypt.BuildConfig;
import p8.b;
import s4.r0;
import s4.v0;
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0003J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u001a\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lc8/m;", "Lj8/f;", "Lc8/f;", "Ltb/e0;", "L2", BuildConfig.FLAVOR, "isDomesticRulesOn", "K2", "isTwoG", "N2", "isAllUpToDate", "M2", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "o1", "k1", "e", "Ly7/b;", "binding$delegate", "Lkc/c;", "C2", "()Ly7/b;", "binding", "Lt8/a;", "revocationListUpdateViewModel$delegate", "Lkotlin/Lazy;", "E2", "()Lt8/a;", "revocationListUpdateViewModel", "Lc8/e;", "covpassCheckBackgroundViewModel$delegate", "D2", "()Lc8/e;", "covpassCheckBackgroundViewModel", "Lo8/f0;", "settingsUpdateViewModel$delegate", "F2", "()Lo8/f0;", "settingsUpdateViewModel", "<init>", "()V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class m extends j8.f implements c8.f {
    static final /* synthetic */ oc.k<Object>[] Y4 = {k0.g(new e0(m.class, "binding", "getBinding()Lde/rki/covpass/checkapp/databinding/CovpassCheckMainBinding;", 0))};
    private final kc.c U4 = k7.z.b(this, a.Y3, null, null, 6, null);
    private final Lazy V4;
    private final Lazy W4;
    private final Lazy X4;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    /* synthetic */ class a extends hc.q implements gc.q<LayoutInflater, ViewGroup, Boolean, y7.b> {
        public static final a Y3 = new a();

        a() {
            super(3, y7.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/checkapp/databinding/CovpassCheckMainBinding;", 0);
        }

        public final y7.b i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            hc.t.e(layoutInflater, "p0");
            return y7.b.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ y7.b s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a0 extends hc.v implements gc.l<Object, c8.e> {

        /* renamed from: c */
        public static final a0 f6376c = new a0();

        public a0() {
            super(1);
        }

        @Override // gc.l
        public final c8.e invoke(Object obj) {
            if (!(obj instanceof c8.e)) {
                obj = null;
            }
            return (c8.e) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.main.MainFragment$onResume$1", f = "MainFragment.kt", l = {221}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends zb.l implements gc.p<q0, xb.d<? super tb.e0>, Object> {

        /* renamed from: y */
        int f6377y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(2, dVar);
            m.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f6377y;
            if (i10 == 0) {
                tb.t.b(obj);
                t8.a E2 = m.this.E2();
                this.f6377y = 1;
                if (E2.h(this) == c10) {
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
            return ((b) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new b(dVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls4/r0;", "Ltb/e0;", "b", "(Ls4/r0;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class c extends hc.v implements gc.l<r0, tb.e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(1);
            m.this = r1;
        }

        public final void b(r0 r0Var) {
            hc.t.e(r0Var, "$this$autoRun");
            p8.b bVar = (p8.b) s4.d.a(r0Var, l8.b.b(m.this).h().a());
            if (bVar instanceof b.a) {
                InfoElement infoElement = m.this.C2().f25892t;
                hc.t.d(infoElement, "binding.mainClockOutOfSync");
                infoElement.setVisibility(0);
                InfoElement infoElement2 = m.this.C2().f25892t;
                hc.t.d(infoElement2, "binding.mainClockOutOfSync");
                String u02 = m.this.u0(x7.e.f25484d1);
                hc.t.d(u02, "getString(R.string.valid…_scan_sync_message_title)");
                m mVar = m.this;
                int i10 = x7.e.f25482c1;
                LocalDateTime ofInstant = LocalDateTime.ofInstant(((b.a) bVar).a(), ZoneId.systemDefault());
                hc.t.d(ofInstant, "ofInstant(state.realTime, ZoneId.systemDefault())");
                w8.a.e(infoElement2, u02, mVar.v0(i10, z9.l.a(ofInstant)), null, Integer.valueOf(x7.a.b_res_0x7f0700a5), null, null, null, null, null, null, 1012, null);
            } else if (!hc.t.a(bVar, b.C0296b.f19000a)) {
                throw new tb.p();
            } else {
                InfoElement infoElement3 = m.this.C2().f25892t;
                hc.t.d(infoElement3, "binding.mainClockOutOfSync");
                infoElement3.setVisibility(8);
            }
            tb.e0 e0Var = tb.e0.f22152a;
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(r0 r0Var) {
            b(r0Var);
            return tb.e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls4/r0;", "Ltb/e0;", "b", "(Ls4/r0;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class d extends hc.v implements gc.l<r0, tb.e0> {

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f6380a;

            static {
                int[] iArr = new int[g8.b.values().length];
                iArr[g8.b.Mode3G.ordinal()] = 1;
                iArr[g8.b.Mode2GPlus.ordinal()] = 2;
                iArr[g8.b.Mode2GPlusB.ordinal()] = 3;
                f6380a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(1);
            m.this = r1;
        }

        public final void b(r0 r0Var) {
            hc.t.e(r0Var, "$this$autoRun");
            int i10 = a.f6380a[((g8.b) s4.d.a(r0Var, z7.b.b(m.this).c().a())).ordinal()];
            if (i10 == 1) {
                TabLayout.f x10 = m.this.C2().f25891s.x(0);
                if (x10 != null) {
                    x10.l();
                }
                m.this.N2(false);
                ConstraintLayout constraintLayout = m.this.C2().f25883k;
                hc.t.d(constraintLayout, "binding.mainCheckCert2gBLayout");
                constraintLayout.setVisibility(8);
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                TabLayout.f x11 = m.this.C2().f25891s.x(1);
                if (x11 != null) {
                    x11.l();
                }
                m.this.N2(true);
                ConstraintLayout constraintLayout2 = m.this.C2().f25883k;
                hc.t.d(constraintLayout2, "binding.mainCheckCert2gBLayout");
                constraintLayout2.setVisibility(0);
                m.this.C2().f25884l.setChecked(true);
                return;
            } else {
                TabLayout.f x12 = m.this.C2().f25891s.x(1);
                if (x12 != null) {
                    x12.l();
                }
                m.this.N2(true);
                ConstraintLayout constraintLayout3 = m.this.C2().f25883k;
                hc.t.d(constraintLayout3, "binding.mainCheckCert2gBLayout");
                constraintLayout3.setVisibility(0);
            }
            m.this.C2().f25884l.setChecked(false);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(r0 r0Var) {
            b(r0Var);
            return tb.e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls4/r0;", "Ltb/e0;", "b", "(Ls4/r0;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class e extends hc.v implements gc.l<r0, tb.e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(1);
            m.this = r1;
        }

        public final void b(r0 r0Var) {
            hc.t.e(r0Var, "$this$autoRun");
            m mVar = m.this;
            mVar.K2(((Boolean) s4.d.a(r0Var, l8.b.b(mVar).b().b())).booleanValue());
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(r0 r0Var) {
            b(r0Var);
            return tb.e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"c8/m$f", "Lcom/google/android/material/tabs/TabLayout$d;", "Lcom/google/android/material/tabs/TabLayout$f;", "tab", "Ltb/e0;", "c", "b", "a", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f implements TabLayout.d {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @zb.f(c = "de.rki.covpass.checkapp.main.MainFragment$onViewCreated$4$onTabSelected$1", f = "MainFragment.kt", l = {89}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        static final class a extends zb.l implements gc.p<q0, xb.d<? super tb.e0>, Object> {
            final /* synthetic */ m U3;

            /* renamed from: y */
            int f6383y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, xb.d<? super a> dVar) {
                super(2, dVar);
                this.U3 = mVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                c10 = yb.d.c();
                int i10 = this.f6383y;
                if (i10 == 0) {
                    tb.t.b(obj);
                    v0<g8.b> a10 = z7.b.b(this.U3).c().a();
                    g8.b bVar = g8.b.Mode2GPlus;
                    this.f6383y = 1;
                    if (v0.a.a(a10, bVar, false, this, 2, null) == c10) {
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
                return ((a) j(q0Var, dVar)).B(tb.e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
                return new a(this.U3, dVar);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @zb.f(c = "de.rki.covpass.checkapp.main.MainFragment$onViewCreated$4$onTabSelected$2", f = "MainFragment.kt", l = {96}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        static final class b extends zb.l implements gc.p<q0, xb.d<? super tb.e0>, Object> {
            final /* synthetic */ m U3;

            /* renamed from: y */
            int f6384y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(m mVar, xb.d<? super b> dVar) {
                super(2, dVar);
                this.U3 = mVar;
            }

            @Override // zb.a
            public final Object B(Object obj) {
                Object c10;
                c10 = yb.d.c();
                int i10 = this.f6384y;
                if (i10 == 0) {
                    tb.t.b(obj);
                    v0<g8.b> a10 = z7.b.b(this.U3).c().a();
                    g8.b bVar = g8.b.Mode3G;
                    this.f6384y = 1;
                    if (v0.a.a(a10, bVar, false, this, 2, null) == c10) {
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
                return ((b) j(q0Var, dVar)).B(tb.e0.f22152a);
            }

            @Override // zb.a
            public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
                return new b(this.U3, dVar);
            }
        }

        f() {
            m.this = r1;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.f fVar) {
            m mVar;
            gc.p<? super q0, ? super xb.d<? super tb.e0>, ? extends Object> bVar;
            boolean z10 = true;
            if (!(fVar != null && fVar.g() == 1) || !z7.b.b(m.this).c().d()) {
                if (fVar == null || fVar.g() != 0) {
                    z10 = false;
                }
                if (!z10 || z7.b.b(m.this).c().d()) {
                    return;
                }
                mVar = m.this;
                bVar = new b(mVar, null);
            } else {
                mVar = m.this;
                bVar = new a(mVar, null);
            }
            mVar.o2(bVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.main.MainFragment$onViewCreated$5$1", f = "MainFragment.kt", l = {112}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends zb.l implements gc.p<q0, xb.d<? super tb.e0>, Object> {

        /* renamed from: y */
        int f6385y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(xb.d<? super g> dVar) {
            super(2, dVar);
            m.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f6385y;
            if (i10 == 0) {
                tb.t.b(obj);
                v0<g8.b> a10 = z7.b.b(m.this).c().a();
                g8.b bVar = g8.b.Mode2GPlusB;
                this.f6385y = 1;
                if (v0.a.a(a10, bVar, false, this, 2, null) == c10) {
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
            return ((g) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new g(dVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.main.MainFragment$onViewCreated$5$2", f = "MainFragment.kt", l = {119}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends zb.l implements gc.p<q0, xb.d<? super tb.e0>, Object> {

        /* renamed from: y */
        int f6386y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(xb.d<? super h> dVar) {
            super(2, dVar);
            m.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f6386y;
            if (i10 == 0) {
                tb.t.b(obj);
                v0<g8.b> a10 = z7.b.b(m.this).c().a();
                g8.b bVar = g8.b.Mode2GPlus;
                this.f6386y = 1;
                if (v0.a.a(a10, bVar, false, this, 2, null) == c10) {
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
            return ((h) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new h(dVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"c8/m$i", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/d;", "info", "Ltb/e0;", "g", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class i extends androidx.core.view.a {
        i() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            hc.t.e(view, "host");
            hc.t.e(dVar, "info");
            super.g(view, dVar);
            dVar.g0(true);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"c8/m$j", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/d;", "info", "Ltb/e0;", "g", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class j extends androidx.core.view.a {
        j() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            hc.t.e(view, "host");
            hc.t.e(dVar, "info");
            super.g(view, dVar);
            dVar.g0(true);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"c8/m$k", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/d;", "info", "Ltb/e0;", "g", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class k extends androidx.core.view.a {
        k() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            hc.t.e(view, "host");
            hc.t.e(dVar, "info");
            super.g(view, dVar);
            dVar.g0(true);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls4/r0;", "Ltb/e0;", "b", "(Ls4/r0;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class l extends hc.v implements gc.l<r0, tb.e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l() {
            super(1);
            m.this = r1;
        }

        public final void b(r0 r0Var) {
            hc.t.e(r0Var, "$this$autoRun");
            m mVar = m.this;
            mVar.M2(((Boolean) s4.d.a(r0Var, mVar.F2().w())).booleanValue());
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(r0 r0Var) {
            b(r0Var);
            return tb.e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/s0;", "T", "Landroidx/lifecycle/v0$b;", "b", "()Landroidx/lifecycle/v0$b;", "com/ensody/reactivestate/android/g"}, k = 3, mv = {1, 7, 1})
    /* renamed from: c8.m$m */
    /* loaded from: classes.dex */
    public static final class C0085m extends hc.v implements gc.a<v0.b> {

        /* renamed from: c */
        final /* synthetic */ Fragment f6388c;

        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\r"}, d2 = {"com/ensody/reactivestate/android/ViewModelExtKt$stateFlowViewModel$2$1", "Landroidx/lifecycle/a;", "Landroidx/lifecycle/s0;", "T", BuildConfig.FLAVOR, "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/l0;", "handle", "e", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/l0;)Landroidx/lifecycle/s0;", "reactivestate_release", "com/ensody/reactivestate/android/g$a"}, k = 1, mv = {1, 7, 1})
        /* renamed from: c8.m$m$a */
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
        public C0085m(Fragment fragment) {
            super(0);
            this.f6388c = fragment;
        }

        /* renamed from: b */
        public final v0.b invoke() {
            return new a(this.f6388c);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "Lcom/ensody/reactivestate/android/b;", "b", "(Lcom/ensody/reactivestate/android/b;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class n extends hc.v implements gc.l<com.ensody.reactivestate.android.b, c8.e> {
        public n() {
            super(1);
        }

        /* renamed from: b */
        public final c8.e invoke(com.ensody.reactivestate.android.b bVar) {
            hc.t.e(bVar, "$this$buildOnViewModel");
            return new c8.e(bVar.a(), null, 2, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/s0;", "T", "Landroidx/lifecycle/v0$b;", "b", "()Landroidx/lifecycle/v0$b;", "com/ensody/reactivestate/android/g"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class o extends hc.v implements gc.a<v0.b> {

        /* renamed from: c */
        final /* synthetic */ Fragment f6389c;

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
        public o(Fragment fragment) {
            super(0);
            this.f6389c = fragment;
        }

        /* renamed from: b */
        public final v0.b invoke() {
            return new a(this.f6389c);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/fragment/app/Fragment;", "com/ensody/reactivestate/android/j", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class p extends hc.v implements gc.a<Fragment> {

        /* renamed from: c */
        final /* synthetic */ Fragment f6390c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Fragment fragment) {
            super(0);
            this.f6390c = fragment;
        }

        /* renamed from: b */
        public final Fragment invoke() {
            return this.f6390c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/lifecycle/y0;", "com/ensody/reactivestate/android/k", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class q extends hc.v implements gc.a<y0> {

        /* renamed from: c */
        final /* synthetic */ gc.a f6391c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(gc.a aVar) {
            super(0);
            this.f6391c = aVar;
        }

        /* renamed from: b */
        public final y0 invoke() {
            y0 I = ((z0) this.f6391c.invoke()).I();
            hc.t.d(I, "ownerProducer().viewModelStore");
            return I;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class r extends hc.v implements gc.l<Object, f0> {

        /* renamed from: c */
        public static final r f6392c = new r();

        public r() {
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
    public static final class s extends hc.v implements gc.l<com.ensody.reactivestate.android.b, f0> {
        public s() {
            super(1);
        }

        /* renamed from: b */
        public final f0 invoke(com.ensody.reactivestate.android.b bVar) {
            hc.t.e(bVar, "$this$buildOnViewModel");
            return new f0(bVar.a(), true, null, null, null, null, null, null, null, null, null, 2044, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/fragment/app/Fragment;", "com/ensody/reactivestate/android/j", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class t extends hc.v implements gc.a<Fragment> {

        /* renamed from: c */
        final /* synthetic */ Fragment f6393c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Fragment fragment) {
            super(0);
            this.f6393c = fragment;
        }

        /* renamed from: b */
        public final Fragment invoke() {
            return this.f6393c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/lifecycle/y0;", "com/ensody/reactivestate/android/k", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class u extends hc.v implements gc.a<y0> {

        /* renamed from: c */
        final /* synthetic */ gc.a f6394c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(gc.a aVar) {
            super(0);
            this.f6394c = aVar;
        }

        /* renamed from: b */
        public final y0 invoke() {
            y0 I = ((z0) this.f6394c.invoke()).I();
            hc.t.d(I, "ownerProducer().viewModelStore");
            return I;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class v extends hc.v implements gc.l<Object, t8.a> {

        /* renamed from: c */
        public static final v f6395c = new v();

        public v() {
            super(1);
        }

        @Override // gc.l
        public final t8.a invoke(Object obj) {
            if (!(obj instanceof t8.a)) {
                obj = null;
            }
            return (t8.a) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "Lcom/ensody/reactivestate/android/b;", "b", "(Lcom/ensody/reactivestate/android/b;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class w extends hc.v implements gc.l<com.ensody.reactivestate.android.b, t8.a> {
        public w() {
            super(1);
        }

        /* renamed from: b */
        public final t8.a invoke(com.ensody.reactivestate.android.b bVar) {
            hc.t.e(bVar, "$this$buildOnViewModel");
            return new t8.a(bVar.a(), null, 2, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/s0;", "T", "Landroidx/lifecycle/v0$b;", "b", "()Landroidx/lifecycle/v0$b;", "com/ensody/reactivestate/android/g"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class x extends hc.v implements gc.a<v0.b> {

        /* renamed from: c */
        final /* synthetic */ Fragment f6396c;

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
        public x(Fragment fragment) {
            super(0);
            this.f6396c = fragment;
        }

        /* renamed from: b */
        public final v0.b invoke() {
            return new a(this.f6396c);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/fragment/app/Fragment;", "com/ensody/reactivestate/android/j", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class y extends hc.v implements gc.a<Fragment> {

        /* renamed from: c */
        final /* synthetic */ Fragment f6397c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Fragment fragment) {
            super(0);
            this.f6397c = fragment;
        }

        /* renamed from: b */
        public final Fragment invoke() {
            return this.f6397c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/lifecycle/y0;", "com/ensody/reactivestate/android/k", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class z extends hc.v implements gc.a<y0> {

        /* renamed from: c */
        final /* synthetic */ gc.a f6398c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(gc.a aVar) {
            super(0);
            this.f6398c = aVar;
        }

        /* renamed from: b */
        public final y0 invoke() {
            y0 I = ((z0) this.f6398c.invoke()).I();
            hc.t.d(I, "ownerProducer().viewModelStore");
            return I;
        }
    }

    public m() {
        super(0, 1, null);
        Lazy b10 = com.ensody.reactivestate.android.f.b(androidx.fragment.app.k0.a(this, k0.b(com.ensody.reactivestate.android.l.class), new u(new t(this)), new C0085m(this)), k0.b(t8.a.class), v.f6395c, new w());
        com.ensody.reactivestate.android.f.a(b10, this, this);
        this.V4 = b10;
        Lazy b11 = com.ensody.reactivestate.android.f.b(androidx.fragment.app.k0.a(this, k0.b(com.ensody.reactivestate.android.l.class), new z(new y(this)), new x(this)), k0.b(c8.e.class), a0.f6376c, new n());
        com.ensody.reactivestate.android.f.a(b11, this, this);
        this.W4 = b11;
        Lazy b12 = com.ensody.reactivestate.android.f.b(androidx.fragment.app.k0.a(this, k0.b(com.ensody.reactivestate.android.l.class), new q(new p(this)), new o(this)), k0.b(f0.class), r.f6392c, new s());
        com.ensody.reactivestate.android.f.a(b12, this, this);
        this.X4 = b12;
    }

    public final y7.b C2() {
        return (y7.b) this.U4.a(this, Y4[0]);
    }

    private final c8.e D2() {
        return (c8.e) this.W4.getValue();
    }

    public final t8.a E2() {
        return (t8.a) this.V4.getValue();
    }

    public final f0 F2() {
        return (f0) this.X4.getValue();
    }

    public static final void G2(m mVar, View view) {
        hc.t.e(mVar, "this$0");
        m7.v.w(m7.g.b(mVar, 0, 1, null), new b8.b(), false, 2, null);
    }

    public static final void H2(m mVar, View view) {
        hc.t.e(mVar, "this$0");
        Context S1 = mVar.S1();
        hc.t.d(S1, "requireContext()");
        m7.v.w(m7.g.b(mVar, 0, 1, null), y8.b.a(S1) ? new f8.g() : new f8.b(), false, 2, null);
    }

    public static final void I2(m mVar, View view) {
        hc.t.e(mVar, "this$0");
        m7.v.w(m7.g.b(mVar, 0, 1, null), new o8.e0(true), false, 2, null);
    }

    public static final void J2(m mVar, CompoundButton compoundButton, boolean z10) {
        gc.p<? super q0, ? super xb.d<? super tb.e0>, ? extends Object> hVar;
        hc.t.e(mVar, "this$0");
        if (z10 && !z7.b.b(mVar).c().b()) {
            hVar = new g(null);
        } else if (z10 || !z7.b.b(mVar).c().b()) {
            return;
        } else {
            hVar = new h(null);
        }
        mVar.o2(hVar);
    }

    @SuppressLint({"SetTextI18n"})
    public final void K2(boolean z10) {
        TextView textView;
        StringBuilder sb2;
        String str;
        String str2;
        char[] o10;
        char[] o11;
        if (z10) {
            textView = C2().f25874b;
            char[] chars = Character.toChars(127465);
            hc.t.d(chars, "toChars(0x1F1E9)");
            char[] chars2 = Character.toChars(127466);
            hc.t.d(chars2, "toChars(0x1F1EA)");
            o11 = ub.l.o(chars, chars2);
            str = new String(o11);
            str2 = u0(x7.e.r0_res_0x7f1001cf);
            sb2 = new StringBuilder();
        } else {
            textView = C2().f25874b;
            char[] chars3 = Character.toChars(127466);
            hc.t.d(chars3, "toChars(0x1F1EA)");
            char[] chars4 = Character.toChars(127482);
            hc.t.d(chars4, "toChars(0x1F1FA)");
            o10 = ub.l.o(chars3, chars4);
            str = new String(o10);
            str2 = u0(x7.e.q0_res_0x7f1001ce);
            sb2 = new StringBuilder();
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(str2);
        textView.setText(sb2.toString());
    }

    private final void L2() {
        m7.v b10;
        m7.i dVar;
        if (l8.b.b(this).f().a().getValue().intValue() != 18) {
            b10 = m7.g.b(this, 0, 1, null);
            dVar = new c8.h();
        } else if (l8.b.b(this).b().a().getValue().intValue() == 1) {
            return;
        } else {
            b10 = m7.g.b(this, 0, 1, null);
            dVar = new c8.d();
        }
        m7.v.w(b10, dVar, false, 2, null);
    }

    public final void M2(boolean z10) {
        TextView textView = C2().f25895w;
        hc.t.d(textView, "binding.settingsSuccessBadge");
        int i10 = 0;
        textView.setVisibility(z10 ? 0 : 8);
        TextView textView2 = C2().f25896x;
        hc.t.d(textView2, "binding.settingsWarningBadge");
        if (z10) {
            i10 = 8;
        }
        textView2.setVisibility(i10);
        C2().f25880h.setText(z10 ? x7.e.k0_res_0x7f1001c2 : x7.e.l0_res_0x7f1001c6);
    }

    public final void N2(boolean z10) {
        TextView textView;
        int i10;
        if (z10) {
            C2().f25888p.setText(x7.e.f25486f1);
            textView = C2().f25889q;
            i10 = x7.e.f25480b1;
        } else {
            C2().f25888p.setText(x7.e.f25485e1);
            textView = C2().f25889q;
            i10 = x7.e.f25479a1;
        }
        textView.setText(i10);
        C2().f25886n.setText(x7.e.Z0);
    }

    @Override // c8.f
    public void e() {
        L2();
    }

    @Override // k7.g, androidx.fragment.app.Fragment
    public void k1() {
        super.k1();
        l8.b.b(this).h().b();
        D2().j();
        o2(new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        hc.t.e(view, "view");
        super.o1(view, bundle);
        C2().f25894v.setOnClickListener(new View.OnClickListener() { // from class: c8.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                m.G2(m.this, view2);
            }
        });
        C2().f25886n.setOnClickListener(new View.OnClickListener() { // from class: c8.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                m.H2(m.this, view2);
            }
        });
        C2().f25881i.setOnClickListener(new View.OnClickListener() { // from class: c8.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                m.I2(m.this, view2);
            }
        });
        C2().f25891s.d(new f());
        C2().f25884l.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: c8.l
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                m.J2(m.this, compoundButton, z10);
            }
        });
        androidx.core.view.y.o0(C2().f25893u, new i());
        androidx.core.view.y.o0(C2().f25888p, new j());
        androidx.core.view.y.o0(C2().f25878f, new k());
        com.ensody.reactivestate.android.a.b(this, null, null, new l(), 3, null);
        com.ensody.reactivestate.android.a.b(this, null, null, new c(), 3, null);
        com.ensody.reactivestate.android.a.b(this, null, null, new d(), 3, null);
        com.ensody.reactivestate.android.a.b(this, null, null, new e(), 3, null);
        L2();
    }
}
