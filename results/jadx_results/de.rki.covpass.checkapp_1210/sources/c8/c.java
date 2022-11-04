package c8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import de.rki.covpass.commonapp.uielements.CheckContextCheckboxElement;
import gc.p;
import hc.e0;
import hc.k0;
import hc.q;
import hc.t;
import k7.z;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import m7.v;
import org.conscrypt.BuildConfig;
import s4.v0;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0014R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lc8/c;", "Lj8/e;", "Ltb/e0;", "J2", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "o1", "y2", "Ly7/a;", "binding$delegate", "Lkc/c;", "I2", "()Ly7/a;", "binding", BuildConfig.FLAVOR, "buttonTextRes", "I", "w2", "()Ljava/lang/Integer;", "<init>", "()V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c extends j8.e {

    /* renamed from: b5 */
    static final /* synthetic */ oc.k<Object>[] f6355b5 = {k0.g(new e0(c.class, "binding", "getBinding()Lde/rki/covpass/checkapp/databinding/CheckContextNotificationBinding;", 0))};
    private final kc.c Z4 = z.b(this, a.Y3, null, null, 6, null);

    /* renamed from: a5 */
    private final int f6356a5 = x7.e.i_res_0x7f1000e2;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    /* synthetic */ class a extends q implements gc.q<LayoutInflater, ViewGroup, Boolean, y7.a> {
        public static final a Y3 = new a();

        a() {
            super(3, y7.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/checkapp/databinding/CheckContextNotificationBinding;", 0);
        }

        public final y7.a i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            t.e(layoutInflater, "p0");
            return y7.a.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ y7.a s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.main.CheckContextNotificationFragment$onActionButtonClicked$1", f = "CheckContextNotificationFragment.kt", l = {66, 69}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends zb.l implements p<q0, xb.d<? super tb.e0>, Object> {

        /* renamed from: y */
        int f6357y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(2, dVar);
            c.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f6357y;
            if (i10 == 0) {
                tb.t.b(obj);
                v0<Boolean> b10 = l8.b.b(c.this).b().b();
                Boolean a10 = zb.b.a(c.this.I2().f25870e.b());
                this.f6357y = 1;
                if (v0.a.a(b10, a10, false, this, 2, null) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tb.t.b(obj);
                v.q(m7.g.b(c.this, 0, 1, null), false, 1, null);
                return tb.e0.f22152a;
            } else {
                tb.t.b(obj);
            }
            v0<Integer> a11 = l8.b.b(c.this).b().a();
            Integer c11 = zb.b.c(1);
            this.f6357y = 2;
            if (v0.a.a(a11, c11, false, this, 2, null) == c10) {
                return c10;
            }
            v.q(m7.g.b(c.this, 0, 1, null), false, 1, null);
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

    public final y7.a I2() {
        return (y7.a) this.Z4.a(this, f6355b5[0]);
    }

    private final void J2() {
        LinearLayout linearLayout = v2().f14707l;
        t.d(linearLayout, "bottomSheetBinding.bottomSheetHeader");
        linearLayout.setVisibility(8);
        ImageView imageView = v2().f14702g;
        t.d(imageView, "bottomSheetBinding.bottomSheetClose");
        imageView.setVisibility(8);
        I2().f25872g.setText(x7.e.o_res_0x7f1000ea);
        final CheckContextCheckboxElement checkContextCheckboxElement = I2().f25867b;
        checkContextCheckboxElement.d(Integer.valueOf(x7.e.f25491l), Integer.valueOf(x7.e.f25490k));
        checkContextCheckboxElement.c(false);
        checkContextCheckboxElement.setOnClickListener(new View.OnClickListener() { // from class: c8.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.K2(CheckContextCheckboxElement.this, this, view);
            }
        });
        final CheckContextCheckboxElement checkContextCheckboxElement2 = I2().f25870e;
        checkContextCheckboxElement2.d(Integer.valueOf(x7.e.f25493n), Integer.valueOf(x7.e.f25492m));
        checkContextCheckboxElement2.c(true);
        checkContextCheckboxElement2.setOnClickListener(new View.OnClickListener() { // from class: c8.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.L2(CheckContextCheckboxElement.this, this, view);
            }
        });
        I2().f25871f.setText(x7.e.j_res_0x7f1000e3);
    }

    public static final void K2(CheckContextCheckboxElement checkContextCheckboxElement, c cVar, View view) {
        t.e(checkContextCheckboxElement, "$this_apply");
        t.e(cVar, "this$0");
        checkContextCheckboxElement.c(true);
        cVar.I2().f25870e.c(false);
    }

    public static final void L2(CheckContextCheckboxElement checkContextCheckboxElement, c cVar, View view) {
        t.e(checkContextCheckboxElement, "$this_apply");
        t.e(cVar, "this$0");
        checkContextCheckboxElement.c(true);
        cVar.I2().f25867b.c(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        t.e(view, "view");
        super.o1(view, bundle);
        J2();
    }

    @Override // j8.e
    public Integer w2() {
        return Integer.valueOf(this.f6356a5);
    }

    @Override // j8.e
    protected void y2() {
        o2(new b(null));
    }
}
