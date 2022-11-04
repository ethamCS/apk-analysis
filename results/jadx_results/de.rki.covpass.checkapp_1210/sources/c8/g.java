package c8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import gc.p;
import hc.e0;
import hc.k0;
import hc.q;
import hc.t;
import hc.v;
import k7.z;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.v0;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0014J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001f"}, d2 = {"Lc8/g;", "Lj8/e;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Ltb/e0;", "o1", "y2", "k", "z2", "Lk8/h;", "binding$delegate", "Lkc/c;", "F2", "()Lk8/h;", "binding", BuildConfig.FLAVOR, "heightLayoutParams$delegate", "Lkotlin/Lazy;", "x2", "()I", "heightLayoutParams", "announcementAccessibilityRes", "I", "n2", "()Ljava/lang/Integer;", "buttonTextRes", "w2", "<init>", "()V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class g extends j8.e {

    /* renamed from: d5 */
    static final /* synthetic */ oc.k<Object>[] f6365d5 = {k0.g(new e0(g.class, "binding", "getBinding()Lde/rki/covpass/commonapp/databinding/DataProtectionBinding;", 0))};
    private final Lazy Z4;

    /* renamed from: a5 */
    private final kc.c f6366a5 = z.b(this, a.Y3, null, null, 6, null);

    /* renamed from: b5 */
    private final int f6367b5 = x7.e.f25478a;

    /* renamed from: c5 */
    private final int f6368c5 = x7.e.p_res_0x7f1000ee;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    /* synthetic */ class a extends q implements gc.q<LayoutInflater, ViewGroup, Boolean, k8.h> {
        public static final a Y3 = new a();

        a() {
            super(3, k8.h.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/commonapp/databinding/DataProtectionBinding;", 0);
        }

        public final k8.h i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            t.e(layoutInflater, "p0");
            return k8.h.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ k8.h s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class b extends v implements gc.a<Integer> {

        /* renamed from: c */
        public static final b f6369c = new b();

        b() {
            super(0);
        }

        /* renamed from: b */
        public final Integer invoke() {
            return -1;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.main.DataProtectionFragment$onActionButtonClicked$1", f = "DataProtectionFragment.kt", l = {47}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends zb.l implements p<q0, xb.d<? super tb.e0>, Object> {

        /* renamed from: y */
        int f6370y;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", BuildConfig.FLAVOR, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class a extends v implements gc.l<Object, f> {

            /* renamed from: c */
            public static final a f6371c = new a();

            public a() {
                super(1);
            }

            @Override // gc.l
            public final f invoke(Object obj) {
                t.e(obj, "it");
                if (!(obj instanceof f)) {
                    obj = null;
                }
                return (f) obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(xb.d<? super c> dVar) {
            super(2, dVar);
            g.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f6370y;
            if (i10 == 0) {
                tb.t.b(obj);
                v0<Integer> a10 = l8.b.b(g.this).f().a();
                Integer c11 = zb.b.c(18);
                this.f6370y = 1;
                if (v0.a.a(a10, c11, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            f fVar = (f) m7.g.b(g.this, 0, 1, null).t(false, a.f6371c);
            if (fVar != null) {
                fVar.e();
            }
            return tb.e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super tb.e0> dVar) {
            return ((c) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new c(dVar);
        }
    }

    public g() {
        Lazy a10;
        a10 = tb.m.a(b.f6369c);
        this.Z4 = a10;
    }

    private final k8.h F2() {
        return (k8.h) this.f6366a5.a(this, f6365d5[0]);
    }

    @Override // j8.e, m7.b0
    public void k() {
        y2();
    }

    @Override // k7.g
    public Integer n2() {
        return Integer.valueOf(this.f6367b5);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        t.e(view, "view");
        super.o1(view, bundle);
        v2().f14711p.setText(u0(x7.e.f25489h));
        F2().f14747b.loadUrl(u0(x7.e.f25495q));
    }

    @Override // j8.e
    public Integer w2() {
        return Integer.valueOf(this.f6368c5);
    }

    @Override // j8.e
    public int x2() {
        return ((Number) this.Z4.getValue()).intValue();
    }

    @Override // j8.e
    protected void y2() {
        o2(new c(null));
    }

    @Override // j8.e
    public void z2() {
        y2();
    }
}
