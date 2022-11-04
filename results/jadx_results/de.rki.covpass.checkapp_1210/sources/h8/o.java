package h8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import de.rki.covpass.checkapp.uielements.ValidationResult2gCertificateElement;
import de.rki.covpass.checkapp.uielements.ValidationResult2gInfoElement;
import hc.e0;
import hc.k0;
import j$.time.Instant;
import kotlin.Lazy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0014J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f¨\u0006'"}, d2 = {"Lh8/o;", "Lj8/e;", "Ltb/e0;", "J2", "F2", "G2", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "o1", "y2", "z2", "Ll7/b;", "m", "Lh8/p;", "args$delegate", "Lkotlin/Lazy;", "H2", "()Lh8/p;", "args", "Ly7/i;", "binding$delegate", "Lkc/c;", "I2", "()Ly7/i;", "binding", BuildConfig.FLAVOR, "buttonTextRes", "I", "w2", "()Ljava/lang/Integer;", "heightLayoutParams", "x2", "()I", "announcementAccessibilityRes", "n2", "<init>", "()V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o extends j8.e {

    /* renamed from: e5 */
    static final /* synthetic */ oc.k<Object>[] f11514e5 = {k0.g(new e0(o.class, "binding", "getBinding()Lde/rki/covpass/checkapp/databinding/ValidationResult2gPlusBBoosterBinding;", 0))};
    private final Lazy Z4;

    /* renamed from: a5 */
    private final kc.c f11515a5 = k7.z.b(this, b.Y3, null, null, 6, null);

    /* renamed from: b5 */
    private final int f11516b5 = x7.e.W;

    /* renamed from: c5 */
    private final int f11517c5 = -1;

    /* renamed from: d5 */
    private final int f11518d5 = x7.e.f_res_0x7f100098;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh8/p;", "b", "()Lh8/p;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class a extends hc.v implements gc.a<p> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            o.this = r1;
        }

        /* renamed from: b */
        public final p invoke() {
            return (p) m7.k.a(o.this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    /* synthetic */ class b extends hc.q implements gc.q<LayoutInflater, ViewGroup, Boolean, y7.i> {
        public static final b Y3 = new b();

        b() {
            super(3, y7.i.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/checkapp/databinding/ValidationResult2gPlusBBoosterBinding;", 0);
        }

        public final y7.i i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
            hc.t.e(layoutInflater, "p0");
            return y7.i.d(layoutInflater, viewGroup, z10);
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ y7.i s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return i0(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", BuildConfig.FLAVOR, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.l<Object, e> {

        /* renamed from: c */
        public static final c f11520c = new c();

        public c() {
            super(1);
        }

        @Override // gc.l
        public final e invoke(Object obj) {
            hc.t.e(obj, "it");
            if (!(obj instanceof e)) {
                obj = null;
            }
            return (e) obj;
        }
    }

    public o() {
        Lazy a10;
        a10 = tb.m.a(new a());
        this.Z4 = a10;
    }

    private final void F2() {
        Instant k10;
        ValidationResult2gCertificateElement validationResult2gCertificateElement = I2().f25938b;
        Integer valueOf = Integer.valueOf(x7.a.f25471w);
        String u02 = u0(x7.e.I_res_0x7f100185);
        int i10 = x7.e.N;
        Object[] objArr = new Object[1];
        f8.j a10 = H2().a();
        objArr[0] = (a10 == null || (k10 = a10.k()) == null) ? null : Integer.valueOf(z9.q.a(k10));
        validationResult2gCertificateElement.d(valueOf, u02, v0(i10, objArr));
    }

    private final void G2() {
        I2().f25941e.setText(x7.e.K0);
        ValidationResult2gInfoElement validationResult2gInfoElement = I2().f25939c;
        hc.t.d(validationResult2gInfoElement, "binding.validationResult2gPlusBInfoElement");
        Integer valueOf = Integer.valueOf(x7.a.f25466r);
        f8.j a10 = H2().a();
        String str = null;
        String c10 = a10 != null ? a10.c() : null;
        f8.j a11 = H2().a();
        String e10 = a11 != null ? a11.e() : null;
        int i10 = x7.e.N0;
        Object[] objArr = new Object[1];
        f8.j a12 = H2().a();
        if (a12 != null) {
            str = a12.a();
        }
        objArr[0] = str;
        ValidationResult2gInfoElement.c(validationResult2gInfoElement, valueOf, c10, e10, v0(i10, objArr), false, 16, null);
    }

    private final p H2() {
        return (p) this.Z4.getValue();
    }

    private final y7.i I2() {
        return (y7.i) this.f11515a5.a(this, f11514e5[0]);
    }

    private final void J2() {
        v2().f14711p.setText(u0(x7.e.Y));
        F2();
        G2();
    }

    @Override // j8.f, m7.z
    public l7.b m() {
        z2();
        return l7.a.f15852a;
    }

    @Override // k7.g
    public Integer n2() {
        return Integer.valueOf(this.f11518d5);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        hc.t.e(view, "view");
        super.o1(view, bundle);
        J2();
        j8.e.E2(this, 0L, 0L, 3, null);
    }

    @Override // j8.e
    public Integer w2() {
        return Integer.valueOf(this.f11516b5);
    }

    @Override // j8.e
    public int x2() {
        return this.f11517c5;
    }

    @Override // j8.e
    protected void y2() {
        e eVar = (e) m7.g.b(this, 0, 1, null).t(false, c.f11520c);
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // j8.e
    public void z2() {
        m7.v.s(m7.g.b(this, 0, 1, null), false, 1, null);
    }
}
