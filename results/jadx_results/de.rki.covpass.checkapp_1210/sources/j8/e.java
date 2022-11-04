package j8;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f0;
import hc.k0;
import hc.q;
import hc.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.h1;
import m7.e0;
import m7.v;
import org.conscrypt.BuildConfig;
import s4.t;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0004\u001a\u00020\u0003H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H$J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u001a\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR+\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lj8/e;", "Lj8/f;", "Lm7/e0;", "Ltb/e0;", "u2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "T0", "z2", "y2", "k", BuildConfig.FLAVOR, "durationInMilliseconds", "showTimerMillisecondsInFuture", "D2", "U0", BuildConfig.FLAVOR, "buttonTextRes", "Ljava/lang/Integer;", "w2", "()Ljava/lang/Integer;", "heightLayoutParams", "I", "x2", "()I", "Lk8/b;", "<set-?>", "bottomSheetBinding$delegate", "Lkc/d;", "v2", "()Lk8/b;", "C2", "(Lk8/b;)V", "bottomSheetBinding", "<init>", "()V", "a", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class e extends f implements e0 {
    private final Integer U4;
    private final int V4 = -2;
    private final kc.d W4 = t.f(new b(this));
    private CountDownTimer X4;
    static final /* synthetic */ oc.k<Object>[] Y4 = {k0.e(new y(e.class, "bottomSheetBinding", "getBottomSheetBinding()Lde/rki/covpass/commonapp/databinding/BottomSheetViewBinding;", 0))};
    private static final a Companion = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lj8/e$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "DEFAULT_DURATION_IN_MILLISECONDS", "J", "DEFAULT_SHOW_TIMER_MILLISECONDS_IN_FUTURE", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class b extends q implements gc.l<gc.a<? extends tb.e0>, h1> {
        b(Object obj) {
            super(1, obj, com.ensody.reactivestate.android.e.class, "onDestroyView", "onDestroyView(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/DisposableHandle;", 1);
        }

        /* renamed from: i0 */
        public final h1 invoke(gc.a<tb.e0> aVar) {
            hc.t.e(aVar, "p0");
            return com.ensody.reactivestate.android.e.f((Fragment) this.f11756d, aVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"j8/e$c", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/d;", "info", "Ltb/e0;", "g", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            hc.t.e(view, "host");
            hc.t.e(dVar, "info");
            super.g(view, dVar);
            dVar.g0(true);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"j8/e$d", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Ltb/e0;", "onGlobalLayout", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: c */
        final /* synthetic */ ConstraintLayout f14060c;

        /* renamed from: d */
        final /* synthetic */ e f14061d;

        d(ConstraintLayout constraintLayout, e eVar) {
            this.f14060c = constraintLayout;
            this.f14061d = eVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f14060c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int height = this.f14060c.getHeight();
            try {
                this.f14061d.v2();
                View childAt = this.f14061d.v2().f14704i.getChildAt(0);
                if (childAt == null) {
                    return;
                }
                childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), height);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"j8/e$e", "Landroid/os/CountDownTimer;", BuildConfig.FLAVOR, "p0", "Ltb/e0;", "onTick", "onFinish", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: j8.e$e */
    /* loaded from: classes.dex */
    public static final class CountDownTimerC0202e extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ long f14062a;

        /* renamed from: b */
        final /* synthetic */ e f14063b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CountDownTimerC0202e(long j10, long j11, e eVar) {
            super(j10, 1000L);
            this.f14062a = j11;
            this.f14063b = eVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            v.s(m7.g.b(this.f14063b, 0, 1, null), false, 1, null);
        }

        @Override // android.os.CountDownTimer
        @SuppressLint({"StringFormatInvalid"})
        public void onTick(long j10) {
            int i10 = (int) (j10 / 1000);
            if (j10 < 1000) {
                onFinish();
            } else if (j10 >= this.f14062a) {
            } else {
                TextView textView = this.f14063b.v2().f14705j;
                hc.t.d(textView, "bottomSheetBinding.bottomSheetCountdown");
                textView.setVisibility(0);
                this.f14063b.v2().f14705j.setText(this.f14063b.v0(n.m0_res_0x7f1001a2, Integer.valueOf(i10)));
            }
        }
    }

    public e() {
        super(0, 1, null);
    }

    public static final void A2(e eVar, View view) {
        hc.t.e(eVar, "this$0");
        eVar.z2();
    }

    public static final void B2(e eVar, View view) {
        hc.t.e(eVar, "this$0");
        eVar.y2();
    }

    public static /* synthetic */ void E2(e eVar, long j10, long j11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                j10 = 120000;
            }
            if ((i10 & 2) != 0) {
                j11 = 60000;
            }
            eVar.D2(j10, j11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTimer");
    }

    private final void u2() {
        CountDownTimer countDownTimer = this.X4;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    protected final void C2(k8.b bVar) {
        hc.t.e(bVar, "<set-?>");
        this.W4.b(this, Y4[0], bVar);
    }

    public final void D2(long j10, long j11) {
        CountDownTimerC0202e countDownTimerC0202e = new CountDownTimerC0202e(j10, j11, this);
        this.X4 = countDownTimerC0202e;
        countDownTimerC0202e.start();
    }

    @Override // k7.g, androidx.fragment.app.Fragment
    public View T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        hc.t.e(layoutInflater, "inflater");
        k8.b d10 = k8.b.d(layoutInflater, viewGroup, false);
        hc.t.d(d10, "inflate(inflater, container, false)");
        C2(d10);
        View T0 = super.T0(layoutInflater, v2().f14704i, bundle);
        if (T0 != null) {
            v2().f14704i.addView(T0);
        }
        androidx.core.view.y.o0(v2().f14707l, new c());
        v2().f14697b.getLayoutParams().height = x2();
        v2().f14702g.setOnClickListener(new View.OnClickListener() { // from class: j8.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.A2(e.this, view);
            }
        });
        Integer w22 = w2();
        if (w22 != null) {
            v2().f14698c.setText(u0(w22.intValue()));
        }
        v2().f14698c.setOnClickListener(new View.OnClickListener() { // from class: j8.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.B2(e.this, view);
            }
        });
        ConstraintLayout constraintLayout = v2().f14700e;
        constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new d(constraintLayout, this));
        return v2().a();
    }

    @Override // androidx.fragment.app.Fragment
    public void U0() {
        u2();
        super.U0();
    }

    public void k() {
        e0.a.c(this);
        m7.d.a(this);
    }

    @Override // m7.b0
    public Fragment p() {
        return e0.a.b(this);
    }

    @Override // m7.c
    public void r(f0 f0Var, Fragment fragment) {
        e0.a.a(this, f0Var, fragment);
    }

    public final k8.b v2() {
        return (k8.b) this.W4.a(this, Y4[0]);
    }

    public Integer w2() {
        return this.U4;
    }

    public int x2() {
        return this.V4;
    }

    protected abstract void y2();

    public void z2() {
        m7.d.a(this);
    }
}
