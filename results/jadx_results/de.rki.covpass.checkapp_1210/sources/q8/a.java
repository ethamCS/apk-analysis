package q8;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import de.rki.covpass.commonapp.license.models.OpenSourceItem;
import hc.q;
import hc.t;
import java.util.List;
import k7.h;
import k7.i;
import k8.r;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.u;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0017J\b\u0010\u0010\u001a\u00020\nH\u0016¨\u0006\u0015"}, d2 = {"Lq8/a;", "Lk7/h;", "Lq8/a$a;", BuildConfig.FLAVOR, "Lde/rki/covpass/commonapp/license/models/OpenSourceItem;", "newOpenSourceItems", "Ltb/e0;", "z", "Landroid/view/ViewGroup;", "parent", BuildConfig.FLAVOR, "viewType", "y", "holder", "position", "x", "e", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "a", "common-app_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"NotifyDataSetChanged"})
/* loaded from: classes.dex */
public final class a extends h<C0318a> {

    /* renamed from: d */
    private List<OpenSourceItem> f19703d;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u000b"}, d2 = {"Lq8/a$a;", "Lk7/i;", "Lk8/r;", "Lde/rki/covpass/commonapp/license/models/OpenSourceItem;", "item", "Ltb/e0;", "N", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: q8.a$a */
    /* loaded from: classes.dex */
    public static final class C0318a extends i<r> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: q8.a$a$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0319a extends q implements gc.q<LayoutInflater, ViewGroup, Boolean, r> {
            public static final C0319a Y3 = new C0319a();

            C0319a() {
                super(3, r.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/commonapp/databinding/OpenSourceItemBinding;", 0);
            }

            public final r i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
                t.e(layoutInflater, "p0");
                return r.d(layoutInflater, viewGroup, z10);
            }

            @Override // gc.q
            public /* bridge */ /* synthetic */ r s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return i0(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0318a(ViewGroup viewGroup) {
            super(viewGroup, C0319a.Y3);
            t.e(viewGroup, "parent");
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
        @android.annotation.SuppressLint({"SetTextI18n"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void N(de.rki.covpass.commonapp.license.models.OpenSourceItem r11) {
            /*
                r10 = this;
                java.lang.String r0 = "item"
                hc.t.e(r11, r0)
                s1.a r0 = r10.M()
                k8.r r0 = (k8.r) r0
                java.lang.String r1 = r11.c()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1c
                int r1 = r1.length()
                if (r1 != 0) goto L1a
                goto L1c
            L1a:
                r1 = r3
                goto L1d
            L1c:
                r1 = r2
            L1d:
                r4 = 8
                if (r1 != 0) goto L55
                java.lang.String r1 = r11.d()
                if (r1 == 0) goto L30
                int r1 = r1.length()
                if (r1 != 0) goto L2e
                goto L30
            L2e:
                r1 = r3
                goto L31
            L30:
                r1 = r2
            L31:
                if (r1 != 0) goto L55
                android.widget.TextView r1 = r0.f14819d
                java.lang.String r5 = r11.c()
                java.lang.String r6 = r11.d()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r5)
                java.lang.String r5 = " - "
                r7.append(r5)
                r7.append(r6)
                java.lang.String r5 = r7.toString()
                r1.setText(r5)
                goto L5f
            L55:
                android.widget.TextView r1 = r0.f14819d
                java.lang.String r5 = "title"
                hc.t.d(r1, r5)
                r1.setVisibility(r4)
            L5f:
                java.util.List r1 = r11.b()
                r5 = 0
                if (r1 == 0) goto L6d
                java.lang.Object r1 = ub.s.X(r1)
                de.rki.covpass.commonapp.license.models.License r1 = (de.rki.covpass.commonapp.license.models.License) r1
                goto L6e
            L6d:
                r1 = r5
            L6e:
                if (r1 == 0) goto Lb9
                android.widget.TextView r6 = r0.f14817b
                java.lang.String r7 = r1.a()
                java.lang.String r8 = r1.b()
                java.lang.String r1 = r1.b()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r7)
                java.lang.String r7 = " (#"
                r9.append(r7)
                r9.append(r8)
                java.lang.String r7 = "::"
                r9.append(r7)
                r9.append(r1)
                java.lang.String r1 = "#)"
                r9.append(r1)
                java.lang.String r1 = r9.toString()
                java.lang.Object[] r7 = new java.lang.Object[r3]
                r8 = 4
                android.text.Spanned r1 = k7.w.e(r1, r7, r3, r8, r5)
                r6.setText(r1)
                android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
                r6.setMovementMethod(r1)
                java.lang.String r1 = ""
                hc.t.d(r6, r1)
                y8.e.a(r6)
                goto Lc3
            Lb9:
                android.widget.TextView r1 = r0.f14817b
                java.lang.String r5 = "copyright"
                hc.t.d(r1, r5)
                r1.setVisibility(r4)
            Lc3:
                java.lang.String r1 = r11.a()
                if (r1 == 0) goto Ld1
                int r1 = r1.length()
                if (r1 != 0) goto Ld0
                goto Ld1
            Ld0:
                r2 = r3
            Ld1:
                if (r2 != 0) goto Ldd
                android.widget.TextView r0 = r0.f14818c
                java.lang.String r11 = r11.a()
                r0.setText(r11)
                goto Le7
            Ldd:
                android.widget.TextView r11 = r0.f14818c
                java.lang.String r0 = "description"
                hc.t.d(r11, r0)
                r11.setVisibility(r4)
            Le7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q8.a.C0318a.N(de.rki.covpass.commonapp.license.models.OpenSourceItem):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Fragment fragment) {
        super(fragment);
        List<OpenSourceItem> h10;
        t.e(fragment, "parent");
        h10 = u.h();
        this.f19703d = h10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.f19703d.size();
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: x */
    public void l(C0318a c0318a, int i10) {
        t.e(c0318a, "holder");
        c0318a.N(this.f19703d.get(i10));
    }

    /* renamed from: y */
    public C0318a n(ViewGroup viewGroup, int i10) {
        t.e(viewGroup, "parent");
        return new C0318a(viewGroup);
    }

    public final void z(List<OpenSourceItem> list) {
        t.e(list, "newOpenSourceItems");
        this.f19703d = list;
        j();
    }
}
