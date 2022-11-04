package u8;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ToggleButton;
import androidx.camera.core.c2;
import androidx.camera.core.g1;
import androidx.camera.core.n1;
import androidx.camera.core.o0;
import androidx.camera.core.p0;
import androidx.camera.core.r;
import androidx.camera.core.s;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.l0;
import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import gc.p;
import hc.e0;
import hc.k0;
import hc.q;
import hc.t;
import hc.v;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k7.z;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import s4.r0;
import tb.s;
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b&\u0018\u00002\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b9\u0010:J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0013\u0010\u0005\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\u0007H\u0002J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H$J\b\u0010\u0018\u001a\u00020\u0002H\u0014J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0007H\u0014J\b\u0010\u001b\u001a\u00020\u0002H\u0004R\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R!\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010+R!\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070(8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010+R\u001a\u00101\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lu8/j;", "Lj8/f;", "Ltb/e0;", "g3", "K2", "J2", "(Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "R2", "on", "d3", "i3", "Q2", "S2", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "o1", "k1", "W0", BuildConfig.FLAVOR, "qrCode", "V2", "e3", "isLoading", "f3", "M2", "Lk8/l;", "binding$delegate", "Lkc/c;", "N2", "()Lk8/l;", "binding", "Lu8/k;", "scannerViewModel$delegate", "Lkotlin/Lazy;", "P2", "()Lu8/k;", "scannerViewModel", "Ls4/l0;", "isTorchOn$delegate", "U2", "()Ls4/l0;", "isTorchOn", "scanEnabled$delegate", "O2", "scanEnabled", BuildConfig.FLAVOR, "announcementAccessibilityRes", "I", "n2", "()Ljava/lang/Integer;", "isCovpass", "Z", "T2", "()Z", "<init>", "()V", "a", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class j extends j8.f {

    /* renamed from: f5 */
    static final /* synthetic */ oc.k<Object>[] f23296f5 = {k0.g(new e0(j.class, "binding", "getBinding()Lde/rki/covpass/commonapp/databinding/FragmentQrScannerBinding;", 0)), k0.g(new e0(j.class, "scanEnabled", "getScanEnabled()Lcom/ensody/reactivestate/MutableValueFlow;", 0)), k0.g(new e0(j.class, "isTorchOn", "isTorchOn()Lcom/ensody/reactivestate/MutableValueFlow;", 0))};
    private final Lazy W4;

    /* renamed from: a5 */
    private androidx.camera.lifecycle.e f23297a5;

    /* renamed from: b5 */
    private ExecutorService f23298b5;

    /* renamed from: c5 */
    private androidx.camera.core.k f23299c5;

    /* renamed from: e5 */
    private final androidx.activity.result.c<String> f23301e5;
    private final kc.c U4 = z.b(this, e.Y3, null, null, 6, null);
    private final kc.c V4 = com.ensody.reactivestate.android.i.b(this, Boolean.TRUE);
    private final int X4 = j8.n.f14093l;
    private final boolean Y4 = true;
    private int Z4 = 1;

    /* renamed from: d5 */
    private final kc.c f23300d5 = com.ensody.reactivestate.android.i.b(this, Boolean.FALSE);

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"Lu8/j$a;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Canvas;", "canvas", "Ltb/e0;", "draw", BuildConfig.FLAVOR, "alpha", "setAlpha", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "getOpacity", "width", "height", BuildConfig.FLAVOR, "border", "<init>", "(IIF)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends Drawable {

        /* renamed from: a */
        private final int f23302a;

        /* renamed from: b */
        private final int f23303b;

        /* renamed from: c */
        private final float f23304c;

        public a(int i10, int i11, float f10) {
            this.f23302a = i10;
            this.f23303b = i11;
            this.f23304c = f10;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            t.e(canvas, "canvas");
            getBounds().set(0, 0, this.f23302a, this.f23303b);
            Path path = new Path();
            path.setFillType(Path.FillType.EVEN_ODD);
            path.addRect(new RectF(0.0f, 0.0f, getBounds().width(), getBounds().height()), Path.Direction.CCW);
            float f10 = 2;
            float min = (Math.min(getBounds().width(), getBounds().height()) - (this.f23304c * f10)) / f10;
            path.addRect(new RectF((getBounds().width() / 2.0f) - min, (getBounds().height() / 2.0f) - min, (getBounds().width() / 2.0f) + min, (getBounds().height() / 2.0f) + min), Path.Direction.CW);
            Paint paint = new Paint();
            paint.setColor(-16777216);
            paint.setAlpha(57);
            canvas.drawPath(path, paint);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    @zb.f(c = "de.rki.covpass.commonapp.scanner.QRScannerFragment", f = "QRScannerFragment.kt", l = {217}, m = "autoFocus")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends zb.d {
        Object U3;
        /* synthetic */ Object V3;
        int X3;

        /* renamed from: x */
        Object f23305x;

        /* renamed from: y */
        Object f23306y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(dVar);
            j.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.V3 = obj;
            this.X3 |= Integer.MIN_VALUE;
            return j.this.J2(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ xb.d<tb.e0> f23307c;

        /* JADX WARN: Multi-variable type inference failed */
        c(xb.d<? super tb.e0> dVar) {
            this.f23307c = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            xb.d<tb.e0> dVar = this.f23307c;
            s.a aVar = s.Companion;
            dVar.y(s.c(tb.e0.f22152a));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "b", "()V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends v implements gc.a<tb.e0> {
        final /* synthetic */ p0 U3;

        /* renamed from: d */
        final /* synthetic */ androidx.camera.lifecycle.e f23309d;

        /* renamed from: q */
        final /* synthetic */ androidx.camera.core.s f23310q;

        /* renamed from: x */
        final /* synthetic */ c2 f23311x;

        /* renamed from: y */
        final /* synthetic */ g1 f23312y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.camera.lifecycle.e eVar, androidx.camera.core.s sVar, c2 c2Var, g1 g1Var, p0 p0Var) {
            super(0);
            j.this = r1;
            this.f23309d = eVar;
            this.f23310q = sVar;
            this.f23311x = c2Var;
            this.f23312y = g1Var;
            this.U3 = p0Var;
        }

        public final void b() {
            j jVar = j.this;
            int i10 = 0;
            jVar.f23299c5 = this.f23309d.e(jVar, this.f23310q, this.f23311x, this.f23312y, this.U3);
            ToggleButton toggleButton = j.this.N2().f14765i;
            t.d(toggleButton, "binding.scannerFlashlightButton");
            if (!j.this.R2()) {
                i10 = 8;
            }
            toggleButton.setVisibility(i10);
            j jVar2 = j.this;
            jVar2.d3(((Boolean) jVar2.U2().getValue()).booleanValue());
        }

        @Override // gc.a
        public /* bridge */ /* synthetic */ tb.e0 invoke() {
            b();
            return tb.e0.f22152a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class e extends q implements gc.q<LayoutInflater, ViewGroup, Boolean, k8.l> {
        public static final e Y3 = new e();

        e() {
            super(3, k8.l.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/commonapp/databinding/FragmentQrScannerBinding;", 0);
        }

        public final k8.l i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            t.e(layoutInflater, "p0");
            return k8.l.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ k8.l s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls4/r0;", "Ltb/e0;", "b", "(Ls4/r0;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f extends v implements gc.l<r0, tb.e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f() {
            super(1);
            j.this = r1;
        }

        public final void b(r0 r0Var) {
            t.e(r0Var, "$this$autoRun");
            j jVar = j.this;
            jVar.i3(((Boolean) s4.d.a(r0Var, jVar.U2())).booleanValue());
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(r0 r0Var) {
            b(r0Var);
            return tb.e0.f22152a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls4/r0;", "Ltb/e0;", "b", "(Ls4/r0;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class g extends v implements gc.l<r0, tb.e0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g() {
            super(1);
            j.this = r1;
        }

        public final void b(r0 r0Var) {
            t.e(r0Var, "$this$autoRun");
            j jVar = j.this;
            jVar.f3(((Number) s4.d.a(r0Var, jVar.b())).intValue() > 0);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(r0 r0Var) {
            b(r0Var);
            return tb.e0.f22152a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.commonapp.scanner.QRScannerFragment$onViewCreated$5", f = "QRScannerFragment.kt", l = {93}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends zb.l implements p<q0, xb.d<? super tb.e0>, Object> {

        /* renamed from: y */
        int f23315y;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "result", "Ltb/e0;", "a", "(Ljava/lang/String;Lxb/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: c */
            final /* synthetic */ j f23316c;

            a(j jVar) {
                this.f23316c = jVar;
            }

            /* renamed from: a */
            public final Object c(String str, xb.d<? super tb.e0> dVar) {
                if (this.f23316c.O2().getValue().booleanValue()) {
                    this.f23316c.O2().setValue(zb.b.a(false));
                    this.f23316c.V2(str);
                }
                return tb.e0.f22152a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(xb.d<? super h> dVar) {
            super(2, dVar);
            j.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f23315y;
            if (i10 == 0) {
                tb.t.b(obj);
                o<String> j10 = j.this.P2().j();
                a aVar = new a(j.this);
                this.f23315y = 1;
                if (j10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            throw new tb.i();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.commonapp.scanner.QRScannerFragment$onViewCreated$6", f = "QRScannerFragment.kt", l = {107, 108}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends zb.l implements p<q0, xb.d<? super tb.e0>, Object> {
        private /* synthetic */ Object U3;

        /* renamed from: y */
        int f23317y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(xb.d<? super i> dVar) {
            super(2, dVar);
            j.this = r1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0066 -> B:16:0x0035). Please submit an issue!!! */
        @Override // zb.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object B(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = yb.b.c()
                int r1 = r7.f23317y
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r7.U3
                kotlinx.coroutines.q0 r1 = (kotlinx.coroutines.q0) r1
                tb.t.b(r8)
                goto L34
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r1 = r7.U3
                kotlinx.coroutines.q0 r1 = (kotlinx.coroutines.q0) r1
                tb.t.b(r8)     // Catch: java.lang.Throwable -> L27
                r8 = r7
                goto L44
            L27:
                r8 = move-exception
                r4 = r1
                r1 = r0
                r0 = r7
                goto L50
            L2c:
                tb.t.b(r8)
                java.lang.Object r8 = r7.U3
                kotlinx.coroutines.q0 r8 = (kotlinx.coroutines.q0) r8
                r1 = r8
            L34:
                r8 = r7
            L35:
                u8.j r4 = u8.j.this
                tb.s$a r5 = tb.s.Companion     // Catch: java.lang.Throwable -> L4a
                r8.U3 = r1     // Catch: java.lang.Throwable -> L4a
                r8.f23317y = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r4 = u8.j.B2(r4, r8)     // Catch: java.lang.Throwable -> L4a
                if (r4 != r0) goto L44
                return r0
            L44:
                tb.e0 r4 = tb.e0.f22152a     // Catch: java.lang.Throwable -> L4a
                tb.s.c(r4)     // Catch: java.lang.Throwable -> L4a
                goto L5c
            L4a:
                r4 = move-exception
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r1
                r1 = r6
            L50:
                tb.s$a r5 = tb.s.Companion
                java.lang.Object r8 = tb.t.a(r8)
                tb.s.c(r8)
                r8 = r0
                r0 = r1
                r1 = r4
            L5c:
                r4 = 1000(0x3e8, double:4.94E-321)
                r8.U3 = r1
                r8.f23317y = r2
                java.lang.Object r4 = kotlinx.coroutines.a1.a(r4, r8)
                if (r4 != r0) goto L35
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: u8.j.i.B(java.lang.Object):java.lang.Object");
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super tb.e0> dVar) {
            return ((i) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            i iVar = new i(dVar);
            iVar.U3 = obj;
            return iVar;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/s0;", "T", "Landroidx/lifecycle/v0$b;", "b", "()Landroidx/lifecycle/v0$b;", "com/ensody/reactivestate/android/g"}, k = 3, mv = {1, 7, 1})
    /* renamed from: u8.j$j */
    /* loaded from: classes.dex */
    public static final class C0401j extends v implements gc.a<v0.b> {

        /* renamed from: c */
        final /* synthetic */ Fragment f23318c;

        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\r"}, d2 = {"com/ensody/reactivestate/android/ViewModelExtKt$stateFlowViewModel$2$1", "Landroidx/lifecycle/a;", "Landroidx/lifecycle/s0;", "T", BuildConfig.FLAVOR, "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/l0;", "handle", "e", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/l0;)Landroidx/lifecycle/s0;", "reactivestate_release", "com/ensody/reactivestate/android/g$a"}, k = 1, mv = {1, 7, 1})
        /* renamed from: u8.j$j$a */
        /* loaded from: classes.dex */
        public static final class a extends androidx.lifecycle.a {
            public a(Fragment fragment) {
                super(fragment, null);
            }

            @Override // androidx.lifecycle.a
            protected <T extends s0> T e(String str, Class<T> cls, l0 l0Var) {
                t.e(str, "key");
                t.e(cls, "modelClass");
                t.e(l0Var, "handle");
                return new com.ensody.reactivestate.android.l(new com.ensody.reactivestate.android.h(l0Var));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0401j(Fragment fragment) {
            super(0);
            this.f23318c = fragment;
        }

        /* renamed from: b */
        public final v0.b invoke() {
            return new a(this.f23318c);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/fragment/app/Fragment;", "com/ensody/reactivestate/android/j", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class k extends v implements gc.a<Fragment> {

        /* renamed from: c */
        final /* synthetic */ Fragment f23319c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment) {
            super(0);
            this.f23319c = fragment;
        }

        /* renamed from: b */
        public final Fragment invoke() {
            return this.f23319c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/lifecycle/y0;", "com/ensody/reactivestate/android/k", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class l extends v implements gc.a<y0> {

        /* renamed from: c */
        final /* synthetic */ gc.a f23320c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(gc.a aVar) {
            super(0);
            this.f23320c = aVar;
        }

        /* renamed from: b */
        public final y0 invoke() {
            y0 I = ((z0) this.f23320c.invoke()).I();
            t.d(I, "ownerProducer().viewModelStore");
            return I;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class m extends v implements gc.l<Object, u8.k> {

        /* renamed from: c */
        public static final m f23321c = new m();

        public m() {
            super(1);
        }

        @Override // gc.l
        public final u8.k invoke(Object obj) {
            if (!(obj instanceof u8.k)) {
                obj = null;
            }
            return (u8.k) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "Lcom/ensody/reactivestate/android/b;", "b", "(Lcom/ensody/reactivestate/android/b;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class n extends v implements gc.l<com.ensody.reactivestate.android.b, u8.k> {
        public n() {
            super(1);
        }

        /* renamed from: b */
        public final u8.k invoke(com.ensody.reactivestate.android.b bVar) {
            t.e(bVar, "$this$buildOnViewModel");
            return new u8.k(bVar.a());
        }
    }

    public j() {
        super(0, 1, null);
        Lazy b10 = com.ensody.reactivestate.android.f.b(androidx.fragment.app.k0.a(this, k0.b(com.ensody.reactivestate.android.l.class), new l(new k(this)), new C0401j(this)), k0.b(u8.k.class), m.f23321c, new n());
        com.ensody.reactivestate.android.f.a(b10, this, this);
        this.W4 = b10;
        androidx.activity.result.c<String> P1 = P1(new d.c(), new androidx.activity.result.b() { // from class: u8.f
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                j.c3(j.this, ((Boolean) obj).booleanValue());
            }
        });
        t.d(P1, "registerForActivityResul…)\n            }\n        }");
        this.f23301e5 = P1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(xb.d<? super tb.e0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof u8.j.b
            if (r0 == 0) goto L13
            r0 = r6
            u8.j$b r0 = (u8.j.b) r0
            int r1 = r0.X3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X3 = r1
            goto L18
        L13:
            u8.j$b r0 = new u8.j$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.V3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.X3
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.U3
            u8.j$b r1 = (u8.j.b) r1
            java.lang.Object r1 = r0.f23306y
            x5.a r1 = (x5.a) r1
            java.lang.Object r0 = r0.f23305x
            u8.j r0 = (u8.j) r0
            tb.t.b(r6)
            goto La1
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3d:
            tb.t.b(r6)
            androidx.camera.core.s2 r6 = new androidx.camera.core.s2
            r2 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r2, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            androidx.camera.core.w1 r6 = r6.b(r2, r2)
            java.lang.String r2 = "SurfaceOrientedMeteringP…   .createPoint(.5f, .5f)"
            hc.t.d(r6, r2)
            androidx.camera.core.i0$a r2 = new androidx.camera.core.i0$a
            r2.<init>(r6, r3)
            androidx.camera.core.i0 r6 = r2.b()
            java.lang.String r2 = "Builder(\n            ini…LAG_AF,\n        ).build()"
            hc.t.d(r6, r2)
            androidx.camera.core.k r2 = r5.f23299c5
            if (r2 == 0) goto La1
            androidx.camera.core.m r2 = r2.d()
            if (r2 == 0) goto La1
            x5.a r6 = r2.i(r6)
            if (r6 == 0) goto La1
            r0.f23305x = r5
            r0.f23306y = r6
            r0.U3 = r0
            r0.X3 = r3
            xb.i r2 = new xb.i
            xb.d r3 = yb.b.b(r0)
            r2.<init>(r3)
            u8.j$c r3 = new u8.j$c
            r3.<init>(r2)
            android.content.Context r4 = r5.S1()
            java.util.concurrent.Executor r4 = androidx.core.content.a.g(r4)
            r6.b(r3, r4)
            java.lang.Object r6 = r2.a()
            java.lang.Object r2 = yb.b.c()
            if (r6 != r2) goto L9e
            zb.h.c(r0)
        L9e:
            if (r6 != r1) goto La1
            return r1
        La1:
            tb.e0 r6 = tb.e0.f22152a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.j.J2(xb.d):java.lang.Object");
    }

    private final void K2() {
        androidx.camera.lifecycle.e eVar = this.f23297a5;
        if (eVar != null) {
            androidx.camera.core.s b10 = new s.a().d(this.Z4).b();
            t.d(b10, "Builder().requireLensFacing(lensFacing).build()");
            c2 c10 = new c2.b().c();
            c10.S(N2().f14758b.getSurfaceProvider());
            t.d(c10, "Builder()\n            .b…ceProvider)\n            }");
            g1 c11 = new g1.f().c();
            t.d(c11, "Builder().build()");
            p0 c12 = new p0.c().c();
            ExecutorService executorService = this.f23298b5;
            if (executorService == null) {
                t.s("cameraExecutor");
                executorService = null;
            }
            c12.Y(executorService, new p0.a() { // from class: u8.g
                @Override // androidx.camera.core.p0.a
                public /* synthetic */ Size a() {
                    return o0.a(this);
                }

                @Override // androidx.camera.core.p0.a
                public final void b(n1 n1Var) {
                    j.L2(j.this, n1Var);
                }
            });
            t.d(c12, "Builder()\n            .b…          }\n            }");
            eVar.n();
            r2(new d(eVar, b10, c10, c11, c12));
            return;
        }
        throw new IllegalStateException("Camera initialization failed.");
    }

    public static final void L2(j jVar, n1 n1Var) {
        t.e(jVar, "this$0");
        t.e(n1Var, "it");
        if (jVar.O2().getValue().booleanValue()) {
            jVar.P2().k(n1Var);
        } else {
            n1Var.close();
        }
    }

    public final k8.l N2() {
        return (k8.l) this.U4.a(this, f23296f5[0]);
    }

    public final u8.k P2() {
        return (u8.k) this.W4.getValue();
    }

    private final boolean Q2() {
        androidx.camera.lifecycle.e eVar = this.f23297a5;
        if (eVar != null) {
            return eVar.h(androidx.camera.core.s.f2464c);
        }
        return false;
    }

    public final boolean R2() {
        r a10;
        androidx.camera.core.k kVar = this.f23299c5;
        if (kVar == null || (a10 = kVar.a()) == null) {
            return false;
        }
        return a10.f();
    }

    private final boolean S2() {
        androidx.camera.lifecycle.e eVar = this.f23297a5;
        if (eVar != null) {
            return eVar.h(androidx.camera.core.s.f2463b);
        }
        return false;
    }

    public final s4.l0<Boolean> U2() {
        return (s4.l0) this.f23300d5.a(this, f23296f5[2]);
    }

    public static final void W2(j jVar, View view) {
        t.e(jVar, "this$0");
        jVar.R1().onBackPressed();
    }

    public static final void X2(j jVar, View view) {
        t.e(jVar, "this$0");
        jVar.R1().onBackPressed();
    }

    public static final void Y2(j jVar, View view) {
        t.e(jVar, "this$0");
        jVar.d3(!jVar.U2().getValue().booleanValue());
    }

    public static final void Z2(j jVar, View view) {
        t.e(jVar, "this$0");
        jVar.d3(!jVar.U2().getValue().booleanValue());
    }

    public static final void a3(j jVar, View view) {
        t.e(jVar, "this$0");
        jVar.e3();
    }

    public static final void b3(j jVar) {
        t.e(jVar, "this$0");
        jVar.N2().f14767k.setImageDrawable(new a(jVar.N2().f14758b.getWidth(), jVar.N2().f14758b.getHeight() - jVar.N2().f14763g.getHeight(), jVar.o0().getDimension(j8.i.a_res_0x7f0600a4)));
    }

    public static final void c3(j jVar, boolean z10) {
        t.e(jVar, "this$0");
        if (z10) {
            jVar.g3();
        } else {
            m7.v.s(m7.g.b(jVar, 0, 1, null), false, 1, null);
        }
    }

    public final void d3(boolean z10) {
        androidx.camera.core.m d10;
        U2().setValue(Boolean.valueOf(z10));
        androidx.camera.core.k kVar = this.f23299c5;
        if (kVar == null || (d10 = kVar.d()) == null) {
            return;
        }
        d10.j(z10);
    }

    private final void g3() {
        final x5.a<androidx.camera.lifecycle.e> f10 = androidx.camera.lifecycle.e.f(S1());
        t.d(f10, "getInstance(requireContext())");
        f10.b(new Runnable() { // from class: u8.i
            @Override // java.lang.Runnable
            public final void run() {
                j.h3(j.this, f10);
            }
        }, androidx.core.content.a.g(S1()));
    }

    public static final void h3(j jVar, x5.a aVar) {
        int i10;
        t.e(jVar, "this$0");
        t.e(aVar, "$cameraProviderFuture");
        jVar.f23297a5 = (androidx.camera.lifecycle.e) aVar.get();
        if (jVar.Q2()) {
            i10 = 1;
        } else if (!jVar.S2()) {
            throw new IllegalStateException("Back and front camera is unavailable");
        } else {
            i10 = 0;
        }
        jVar.Z4 = i10;
        jVar.K2();
    }

    public final void i3(boolean z10) {
        ToggleButton toggleButton;
        int i10;
        Resources resources;
        if (z10) {
            toggleButton = N2().f14765i;
            resources = o0();
            i10 = j8.n.m_res_0x7f100093;
        } else {
            toggleButton = N2().f14765i;
            resources = o0();
            i10 = j8.n.n_res_0x7f100094;
        }
        toggleButton.setContentDescription(resources.getString(i10));
    }

    public final void M2() {
        Context S1 = S1();
        t.d(S1, "requireContext()");
        if (y8.b.a(S1)) {
            g3();
        } else {
            this.f23301e5.a("android.permission.CAMERA");
        }
    }

    public final s4.l0<Boolean> O2() {
        return (s4.l0) this.V4.a(this, f23296f5[1]);
    }

    public boolean T2() {
        return this.Y4;
    }

    protected abstract void V2(String str);

    @Override // androidx.fragment.app.Fragment
    public void W0() {
        super.W0();
        ExecutorService executorService = this.f23298b5;
        if (executorService == null) {
            t.s("cameraExecutor");
            executorService = null;
        }
        executorService.shutdown();
    }

    protected void e3() {
    }

    public void f3(boolean z10) {
        androidx.camera.lifecycle.e eVar;
        LinearLayout linearLayout = N2().f14760d;
        t.d(linearLayout, "binding.loadingLayout");
        linearLayout.setVisibility(z10 ? 0 : 8);
        if (!z10 || (eVar = this.f23297a5) == null) {
            return;
        }
        eVar.n();
    }

    @Override // k7.g, androidx.fragment.app.Fragment
    public void k1() {
        super.k1();
        if (this.f23299c5 != null) {
            d3(U2().getValue().booleanValue());
        }
    }

    @Override // k7.g
    public Integer n2() {
        return Integer.valueOf(this.X4);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        t.e(view, "view");
        super.o1(view, bundle);
        N2().f14761e.setOnClickListener(new View.OnClickListener() { // from class: u8.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                j.W2(j.this, view2);
            }
        });
        N2().f14762f.setOnClickListener(new View.OnClickListener() { // from class: u8.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                j.X2(j.this, view2);
            }
        });
        com.ensody.reactivestate.android.a.b(this, null, null, new f(), 3, null);
        com.ensody.reactivestate.android.a.b(this, null, null, new g(), 3, null);
        o2(new h(null));
        if (Build.VERSION.SDK_INT < 26) {
            o2(new i(null));
        }
        k8.l N2 = N2();
        N2.f14765i.setOnClickListener(new View.OnClickListener() { // from class: u8.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                j.Y2(j.this, view2);
            }
        });
        N2.f14766j.setOnClickListener(new View.OnClickListener() { // from class: u8.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                j.Z2(j.this, view2);
            }
        });
        N2.f14768l.setOnClickListener(new View.OnClickListener() { // from class: u8.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                j.a3(j.this, view2);
            }
        });
        FrameLayout frameLayout = N2.f14763g;
        t.d(frameLayout, "scannerCloseLayout");
        int i10 = 0;
        frameLayout.setVisibility(T2() ^ true ? 0 : 8);
        ConstraintLayout constraintLayout = N2.f14764h;
        t.d(constraintLayout, "scannerCloseLayoutCovpass");
        if (!T2()) {
            i10 = 8;
        }
        constraintLayout.setVisibility(i10);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        t.d(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.f23298b5 = newSingleThreadExecutor;
        view.post(new Runnable() { // from class: u8.h
            @Override // java.lang.Runnable
            public final void run() {
                j.b3(j.this);
            }
        });
    }
}
