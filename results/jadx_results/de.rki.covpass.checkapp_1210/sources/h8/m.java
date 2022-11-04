package h8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import de.rki.covpass.checkapp.uielements.ValidationResult2gCertificateElement;
import hc.e0;
import hc.k0;
import j$.time.Instant;
import j$.time.ZonedDateTime;
import kotlin.Lazy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b8\u00109J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\"\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u001a\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0014J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010$\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010#R\u001d\u0010'\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010#R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00101\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001d\u001a\u0004\b/\u00100R\u001a\u00102\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00100¨\u0006:"}, d2 = {"Lh8/m;", "Lj8/e;", "Lh8/w;", "Ltb/e0;", "T2", "Lde/rki/covpass/checkapp/uielements/ValidationResult2gCertificateElement;", "validationResultCertificate", "Lf8/j;", "certificateData", "secondaryCertificateData", "K2", "O2", "N2", BuildConfig.FLAVOR, "W2", BuildConfig.FLAVOR, "V2", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "o1", "y2", "l", "z2", "Ll7/b;", "m", "Lh8/n;", "args$delegate", "Lkotlin/Lazy;", "P2", "()Lh8/n;", "args", "firstCertificateData$delegate", "R2", "()Lf8/j;", "firstCertificateData", "secondCertificateData$delegate", "S2", "secondCertificateData", "Ly7/e;", "binding$delegate", "Lkc/c;", "Q2", "()Ly7/e;", "binding", "buttonTextRes$delegate", "w2", "()Ljava/lang/Integer;", "buttonTextRes", "heightLayoutParams", "I", "x2", "()I", "announcementAccessibilityRes", "n2", "<init>", "()V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class m extends j8.e implements w {

    /* renamed from: g5 */
    static final /* synthetic */ oc.k<Object>[] f11493g5 = {k0.g(new e0(m.class, "binding", "getBinding()Lde/rki/covpass/checkapp/databinding/ValidationResult2gBinding;", 0))};
    private final Lazy Z4;

    /* renamed from: a5 */
    private final Lazy f11494a5;

    /* renamed from: b5 */
    private final Lazy f11495b5;

    /* renamed from: d5 */
    private final Lazy f11497d5;

    /* renamed from: c5 */
    private final kc.c f11496c5 = k7.z.b(this, c.Y3, null, null, 6, null);

    /* renamed from: e5 */
    private final int f11498e5 = -1;

    /* renamed from: f5 */
    private final int f11499f5 = x7.e.f_res_0x7f100098;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11500a;

        static {
            int[] iArr = new int[i8.a.values().length];
            iArr[i8.a.TechnicalError.ordinal()] = 1;
            iArr[i8.a.ValidationError.ordinal()] = 2;
            iArr[i8.a.Success.ordinal()] = 3;
            f11500a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh8/n;", "b", "()Lh8/n;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class b extends hc.v implements gc.a<n> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            m.this = r1;
        }

        /* renamed from: b */
        public final n invoke() {
            return (n) m7.k.a(m.this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    /* synthetic */ class c extends hc.q implements gc.q<LayoutInflater, ViewGroup, Boolean, y7.e> {
        public static final c Y3 = new c();

        c() {
            super(3, y7.e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/checkapp/databinding/ValidationResult2gBinding;", 0);
        }

        public final y7.e i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            hc.t.e(layoutInflater, "p0");
            return y7.e.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ y7.e s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class d extends hc.v implements gc.a<Integer> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(0);
            m.this = r1;
        }

        /* renamed from: b */
        public final Integer invoke() {
            return Integer.valueOf(m.this.V2());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf8/j;", "b", "()Lf8/j;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class e extends hc.v implements gc.a<f8.j> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(0);
            m.this = r1;
        }

        /* renamed from: b */
        public final f8.j invoke() {
            return m.this.P2().a();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", BuildConfig.FLAVOR, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f extends hc.v implements gc.l<Object, h8.e> {

        /* renamed from: c */
        public static final f f11504c = new f();

        public f() {
            super(1);
        }

        @Override // gc.l
        public final h8.e invoke(Object obj) {
            hc.t.e(obj, "it");
            if (!(obj instanceof h8.e)) {
                obj = null;
            }
            return (h8.e) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", BuildConfig.FLAVOR, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class g extends hc.v implements gc.l<Object, h8.e> {

        /* renamed from: c */
        public static final g f11505c = new g();

        public g() {
            super(1);
        }

        @Override // gc.l
        public final h8.e invoke(Object obj) {
            hc.t.e(obj, "it");
            if (!(obj instanceof h8.e)) {
                obj = null;
            }
            return (h8.e) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", BuildConfig.FLAVOR, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class h extends hc.v implements gc.l<Object, h8.e> {

        /* renamed from: c */
        public static final h f11506c = new h();

        public h() {
            super(1);
        }

        @Override // gc.l
        public final h8.e invoke(Object obj) {
            hc.t.e(obj, "it");
            if (!(obj instanceof h8.e)) {
                obj = null;
            }
            return (h8.e) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", BuildConfig.FLAVOR, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class i extends hc.v implements gc.l<Object, h8.e> {

        /* renamed from: c */
        public static final i f11507c = new i();

        public i() {
            super(1);
        }

        @Override // gc.l
        public final h8.e invoke(Object obj) {
            hc.t.e(obj, "it");
            if (!(obj instanceof h8.e)) {
                obj = null;
            }
            return (h8.e) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", BuildConfig.FLAVOR, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class j extends hc.v implements gc.l<Object, h8.e> {

        /* renamed from: c */
        public static final j f11508c = new j();

        public j() {
            super(1);
        }

        @Override // gc.l
        public final h8.e invoke(Object obj) {
            hc.t.e(obj, "it");
            if (!(obj instanceof h8.e)) {
                obj = null;
            }
            return (h8.e) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", BuildConfig.FLAVOR, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class k extends hc.v implements gc.l<Object, h8.e> {

        /* renamed from: c */
        public static final k f11509c = new k();

        public k() {
            super(1);
        }

        @Override // gc.l
        public final h8.e invoke(Object obj) {
            hc.t.e(obj, "it");
            if (!(obj instanceof h8.e)) {
                obj = null;
            }
            return (h8.e) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", BuildConfig.FLAVOR, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class l extends hc.v implements gc.l<Object, h8.e> {

        /* renamed from: c */
        public static final l f11510c = new l();

        public l() {
            super(1);
        }

        @Override // gc.l
        public final h8.e invoke(Object obj) {
            hc.t.e(obj, "it");
            if (!(obj instanceof h8.e)) {
                obj = null;
            }
            return (h8.e) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf8/j;", "b", "()Lf8/j;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: h8.m$m */
    /* loaded from: classes.dex */
    static final class C0172m extends hc.v implements gc.a<f8.j> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0172m() {
            super(0);
            m.this = r1;
        }

        /* renamed from: b */
        public final f8.j invoke() {
            return m.this.P2().c();
        }
    }

    public m() {
        Lazy a10;
        Lazy a11;
        Lazy a12;
        Lazy a13;
        a10 = tb.m.a(new b());
        this.Z4 = a10;
        a11 = tb.m.a(new e());
        this.f11494a5 = a11;
        a12 = tb.m.a(new C0172m());
        this.f11495b5 = a12;
        a13 = tb.m.a(new d());
        this.f11497d5 = a13;
    }

    private final void K2(ValidationResult2gCertificateElement validationResult2gCertificateElement, f8.j jVar, f8.j jVar2) {
        Integer num;
        Integer num2;
        View.OnClickListener onClickListener;
        String str;
        int i10 = a.f11500a[jVar.d().ordinal()];
        if (i10 == 1) {
            num2 = Integer.valueOf(x7.a.f25469u);
            num = Integer.valueOf(x7.e.X);
            onClickListener = new View.OnClickListener() { // from class: h8.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    m.L2(m.this, view);
                }
            };
        } else if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Integer valueOf = Integer.valueOf(((!jVar.u() || jVar2 != null) && (!jVar.u() || jVar2 == null || !jVar2.n())) ? jVar.w() ? x7.a.f25472x : x7.a.f25471w : x7.a.f25470v);
            String u02 = u0(jVar.m() ? x7.e.I_res_0x7f100185 : jVar.y() ? x7.e.H_res_0x7f100184 : jVar.q() ? x7.e.M_res_0x7f100189 : jVar.o() ? x7.e.K_res_0x7f100187 : x7.e.L_res_0x7f100188);
            Integer num3 = null;
            if (jVar.m()) {
                int i11 = x7.e.N;
                Object[] objArr = new Object[1];
                Instant k10 = jVar.k();
                if (k10 != null) {
                    num3 = Integer.valueOf(z9.q.a(k10));
                }
                objArr[0] = num3;
                str = v0(i11, objArr);
            } else if (jVar.w()) {
                int i12 = x7.e.O_res_0x7f10018b;
                Object[] objArr2 = new Object[1];
                ZonedDateTime f10 = jVar.f();
                if (f10 != null) {
                    num3 = Integer.valueOf(z9.q.c(f10));
                }
                objArr2[0] = num3;
                str = v0(i12, objArr2);
            } else {
                int i13 = x7.e.P_res_0x7f10018c;
                Object[] objArr3 = new Object[1];
                Instant k11 = jVar.k();
                if (k11 != null) {
                    num3 = Integer.valueOf(z9.q.d(k11));
                }
                objArr3[0] = num3;
                str = v0(i13, objArr3);
            }
            validationResult2gCertificateElement.d(valueOf, u02, str);
            return;
        } else {
            num2 = Integer.valueOf(x7.a.f25469u);
            num = Integer.valueOf(x7.e.X);
            onClickListener = new View.OnClickListener() { // from class: h8.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    m.M2(m.this, view);
                }
            };
        }
        validationResult2gCertificateElement.c(num2, num, onClickListener);
    }

    public static final void L2(m mVar, View view) {
        hc.t.e(mVar, "this$0");
        m7.v.w(m7.g.b(mVar, 0, 1, null), new a0(), false, 2, null);
    }

    public static final void M2(m mVar, View view) {
        hc.t.e(mVar, "this$0");
        m7.v.w(m7.g.b(mVar, 0, 1, null), new r(), false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void N2() {
        /*
            r11 = this;
            boolean r0 = r11.W2()
            java.lang.String r1 = "binding.validationResultInfoText"
            java.lang.String r2 = "binding.validationResultInfoElement"
            if (r0 == 0) goto L26
            y7.e r0 = r11.Q2()
            android.widget.TextView r0 = r0.f25909e
            hc.t.d(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
            y7.e r0 = r11.Q2()
            de.rki.covpass.checkapp.uielements.ValidationResult2gInfoElement r0 = r0.f25907c
            hc.t.d(r0, r2)
            r0.setVisibility(r1)
            goto Lb2
        L26:
            y7.e r0 = r11.Q2()
            android.widget.TextView r0 = r0.f25909e
            hc.t.d(r0, r1)
            r1 = 0
            r0.setVisibility(r1)
            y7.e r0 = r11.Q2()
            de.rki.covpass.checkapp.uielements.ValidationResult2gInfoElement r0 = r0.f25907c
            hc.t.d(r0, r2)
            r0.setVisibility(r1)
            y7.e r0 = r11.Q2()
            android.widget.TextView r0 = r0.f25909e
            int r3 = x7.e.K0
            r0.setText(r3)
            y7.e r0 = r11.Q2()
            de.rki.covpass.checkapp.uielements.ValidationResult2gInfoElement r3 = r0.f25907c
            hc.t.d(r3, r2)
            int r0 = x7.a.f25466r
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            f8.j r0 = r11.R2()
            java.lang.String r0 = r0.c()
            r2 = 0
            if (r0 != 0) goto L71
            f8.j r0 = r11.S2()
            if (r0 == 0) goto L6f
            java.lang.String r0 = r0.c()
            goto L71
        L6f:
            r5 = r2
            goto L72
        L71:
            r5 = r0
        L72:
            f8.j r0 = r11.R2()
            java.lang.String r0 = r0.e()
            if (r0 != 0) goto L89
            f8.j r0 = r11.S2()
            if (r0 == 0) goto L87
            java.lang.String r0 = r0.e()
            goto L89
        L87:
            r6 = r2
            goto L8a
        L89:
            r6 = r0
        L8a:
            int r0 = x7.e.N0
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            f8.j r8 = r11.R2()
            java.lang.String r8 = r8.a()
            if (r8 != 0) goto La4
            f8.j r8 = r11.S2()
            if (r8 == 0) goto La5
            java.lang.String r2 = r8.a()
            goto La5
        La4:
            r2 = r8
        La5:
            r7[r1] = r2
            java.lang.String r7 = r11.v0(r0, r7)
            r8 = 0
            r9 = 16
            r10 = 0
            de.rki.covpass.checkapp.uielements.ValidationResult2gInfoElement.c(r3, r4, r5, r6, r7, r8, r9, r10)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.m.N2():void");
    }

    private final void O2() {
        int i10;
        Integer num;
        ValidationResult2gCertificateElement validationResult2gCertificateElement;
        TextView textView = Q2().f25911g;
        hc.t.d(textView, "binding.validationResultTypeText");
        int i11 = 0;
        if (!(!R2().y() && !R2().m() && !R2().u())) {
            i11 = 8;
        }
        textView.setVisibility(i11);
        if (R2().y() || R2().m()) {
            validationResult2gCertificateElement = Q2().f25910f;
            num = Integer.valueOf(x7.a.f25468t);
            i10 = x7.e.Q_res_0x7f10018d;
        } else if (R2().q() && R2().u()) {
            validationResult2gCertificateElement = Q2().f25910f;
            num = Integer.valueOf(x7.a.f25468t);
            i10 = x7.e.H_res_0x7f100184;
        } else if (R2().q()) {
            validationResult2gCertificateElement = Q2().f25910f;
            num = Integer.valueOf(x7.a.f25468t);
            i10 = x7.e.R_res_0x7f10018e;
        } else if (!R2().w()) {
            return;
        } else {
            validationResult2gCertificateElement = Q2().f25910f;
            num = Integer.valueOf(x7.a.f25468t);
            i10 = x7.e.S_res_0x7f10018f;
        }
        validationResult2gCertificateElement.b(num, Integer.valueOf(i10), Integer.valueOf(x7.e.J_res_0x7f100186));
    }

    public final n P2() {
        return (n) this.Z4.getValue();
    }

    private final y7.e Q2() {
        return (y7.e) this.f11496c5.a(this, f11493g5[0]);
    }

    private final f8.j R2() {
        return (f8.j) this.f11494a5.getValue();
    }

    private final f8.j S2() {
        return (f8.j) this.f11495b5.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
        if ((r1 != null && r1.z()) == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void T2() {
        /*
            r6 = this;
            k8.b r0 = r6.v2()
            android.widget.TextView r0 = r0.f14711p
            int r1 = x7.e.Y
            java.lang.String r1 = r6.u0(r1)
            r0.setText(r1)
            y7.e r0 = r6.Q2()
            de.rki.covpass.checkapp.uielements.ValidationResult2gCertificateElement r0 = r0.f25906b
            java.lang.String r1 = "binding.validationResultCertificate"
            hc.t.d(r0, r1)
            f8.j r1 = r6.R2()
            f8.j r2 = r6.S2()
            r6.K2(r0, r1, r2)
            f8.j r0 = r6.S2()
            if (r0 == 0) goto L44
            f8.j r0 = r6.S2()
            if (r0 == 0) goto L47
            y7.e r1 = r6.Q2()
            de.rki.covpass.checkapp.uielements.ValidationResult2gCertificateElement r1 = r1.f25910f
            java.lang.String r2 = "binding.validationResultSecondCertificate"
            hc.t.d(r1, r2)
            f8.j r2 = r6.R2()
            r6.K2(r1, r0, r2)
            goto L47
        L44:
            r6.O2()
        L47:
            r6.N2()
            y7.e r0 = r6.Q2()
            android.widget.TextView r0 = r0.f25911g
            int r1 = x7.e.U_res_0x7f100191
            r0.setText(r1)
            k8.b r0 = r6.v2()
            com.google.android.material.button.MaterialButton r0 = r0.f14708m
            java.lang.String r1 = ""
            hc.t.d(r0, r1)
            f8.j r1 = r6.S2()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L83
            f8.j r1 = r6.R2()
            boolean r1 = r1.z()
            if (r1 == 0) goto L83
            f8.j r1 = r6.S2()
            if (r1 == 0) goto L80
            boolean r1 = r1.z()
            if (r1 != r2) goto L80
            r1 = r2
            goto L81
        L80:
            r1 = r3
        L81:
            if (r1 != 0) goto L94
        L83:
            f8.j r1 = r6.S2()
            if (r1 != 0) goto L96
            f8.j r1 = r6.R2()
            boolean r1 = r1.n()
            if (r1 != 0) goto L94
            goto L96
        L94:
            r1 = r3
            goto L97
        L96:
            r1 = r2
        L97:
            r4 = 8
            if (r1 == 0) goto L9d
            r1 = r3
            goto L9e
        L9d:
            r1 = r4
        L9e:
            r0.setVisibility(r1)
            h8.k r1 = new h8.k
            r1.<init>()
            r0.setOnClickListener(r1)
            int r1 = x7.e.W
            r0.setText(r1)
            k8.b r0 = r6.v2()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.f14706k
            java.lang.String r1 = "bottomSheetBinding.bottomSheetExtraButtonLayout"
            hc.t.d(r0, r1)
            k8.b r1 = r6.v2()
            com.google.android.material.button.MaterialButton r1 = r1.f14708m
            java.lang.String r5 = "bottomSheetBinding.botto…condWhiteButtonWithBorder"
            hc.t.d(r1, r5)
            int r1 = r1.getVisibility()
            if (r1 != 0) goto Lcb
            goto Lcc
        Lcb:
            r2 = r3
        Lcc:
            if (r2 == 0) goto Lcf
            r4 = r3
        Lcf:
            r0.setVisibility(r4)
            k8.b r0 = r6.v2()
            com.google.android.material.button.MaterialButton r0 = r0.f14698c
            java.lang.String r1 = "bottomSheetBinding.bottomSheetActionButton"
            hc.t.d(r0, r1)
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.m.T2():void");
    }

    public static final void U2(m mVar, View view) {
        hc.t.e(mVar, "this$0");
        h8.e eVar = (h8.e) m7.g.b(mVar, 0, 1, null).t(false, l.f11510c);
        if (eVar != null) {
            eVar.d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (r1 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int V2() {
        /*
            r3 = this;
            f8.j r0 = r3.S2()
            if (r0 != 0) goto L13
            f8.j r0 = r3.R2()
            boolean r0 = r0.z()
            if (r0 == 0) goto L13
            int r0 = x7.e.T_res_0x7f100190
            goto L4b
        L13:
            f8.j r0 = r3.S2()
            if (r0 != 0) goto L26
            f8.j r0 = r3.R2()
            boolean r0 = r0.n()
            if (r0 == 0) goto L26
        L23:
            int r0 = x7.e.W
            goto L4b
        L26:
            f8.j r0 = r3.S2()
            if (r0 == 0) goto L49
            f8.j r0 = r3.R2()
            boolean r0 = r0.z()
            if (r0 == 0) goto L49
            f8.j r0 = r3.S2()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L45
            boolean r0 = r0.z()
            if (r0 != r1) goto L45
            goto L46
        L45:
            r1 = r2
        L46:
            if (r1 == 0) goto L49
            goto L23
        L49:
            int r0 = x7.e.V
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.m.V2():int");
    }

    private final boolean W2() {
        return S2() == null && R2().n();
    }

    @Override // h8.w
    public void l() {
    }

    @Override // j8.f, m7.z
    public l7.b m() {
        if (R2().n()) {
            h8.e eVar = (h8.e) m7.g.b(this, 0, 1, null).t(false, j.f11508c);
            if (eVar != null) {
                eVar.d();
            }
        } else {
            if (S2() != null) {
                f8.j S2 = S2();
                if (S2 != null && S2.n()) {
                    h8.e eVar2 = (h8.e) m7.g.b(this, 0, 1, null).t(false, k.f11509c);
                    if (eVar2 != null) {
                        eVar2.u(R2());
                    }
                }
            }
            m7.v.s(m7.g.b(this, 0, 1, null), false, 1, null);
        }
        return l7.a.f15852a;
    }

    @Override // k7.g
    public Integer n2() {
        return Integer.valueOf(this.f11499f5);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        hc.t.e(view, "view");
        super.o1(view, bundle);
        T2();
        j8.e.E2(this, 0L, 0L, 3, null);
    }

    @Override // j8.e
    public Integer w2() {
        return (Integer) this.f11497d5.getValue();
    }

    @Override // j8.e
    public int x2() {
        return this.f11498e5;
    }

    @Override // j8.e
    protected void y2() {
        h8.e eVar;
        h8.e eVar2;
        MaterialButton materialButton = v2().f14708m;
        hc.t.d(materialButton, "bottomSheetBinding.botto…condWhiteButtonWithBorder");
        if (!(materialButton.getVisibility() == 0)) {
            eVar2 = (h8.e) m7.g.b(this, 0, 1, null).t(false, f.f11504c);
            if (eVar2 == null) {
                return;
            }
        } else if (!R2().n()) {
            if (S2() != null) {
                f8.j S2 = S2();
                if (S2 != null && S2.n()) {
                    eVar = (h8.e) m7.g.b(this, 0, 1, null).t(false, h.f11506c);
                    if (eVar == null) {
                        return;
                    }
                    eVar.u(R2());
                    return;
                }
            }
            eVar = (h8.e) m7.g.b(this, 0, 1, null).t(false, i.f11507c);
            if (eVar == null) {
                return;
            }
            eVar.u(R2());
            return;
        } else {
            eVar2 = (h8.e) m7.g.b(this, 0, 1, null).t(false, g.f11505c);
            if (eVar2 == null) {
                return;
            }
        }
        eVar2.d();
    }

    @Override // j8.e
    public void z2() {
        m7.v.s(m7.g.b(this, 0, 1, null), false, 1, null);
    }
}
