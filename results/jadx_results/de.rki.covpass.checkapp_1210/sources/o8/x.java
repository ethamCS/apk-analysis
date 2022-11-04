package o8;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¨\u0006\u0015"}, d2 = {"Lo8/x;", "Lk7/h;", "Lo8/x$a;", "Landroid/view/ViewGroup;", "parent", BuildConfig.FLAVOR, "viewType", "y", "holder", "position", "Ltb/e0;", "x", "e", BuildConfig.FLAVOR, "Lo8/w;", "items", "z", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "a", "common-app_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"NotifyDataSetChanged"})
/* loaded from: classes.dex */
public final class x extends k7.h<a> {

    /* renamed from: d */
    private List<w> f17709d;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u000b"}, d2 = {"Lo8/x$a;", "Lk7/i;", "Lk8/t;", "Lo8/w;", "item", "Ltb/e0;", "N", "Landroid/view/ViewGroup;", "parent", "<init>", "(Lo8/x;Landroid/view/ViewGroup;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public final class a extends k7.i<k8.t> {

        /* renamed from: u */
        final /* synthetic */ x f17710u;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: o8.x$a$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0271a extends hc.q implements gc.q<LayoutInflater, ViewGroup, Boolean, k8.t> {
            public static final C0271a Y3 = new C0271a();

            C0271a() {
                super(3, k8.t.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/commonapp/databinding/SettingItemBinding;", 0);
            }

            public final k8.t i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
                hc.t.e(layoutInflater, "p0");
                return k8.t.d(layoutInflater, viewGroup, z10);
            }

            @Override // gc.q
            public /* bridge */ /* synthetic */ k8.t s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return i0(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x xVar, ViewGroup viewGroup) {
            super(viewGroup, C0271a.Y3);
            hc.t.e(viewGroup, "parent");
            this.f17710u = xVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x003e, code lost:
            if (r4 != null) goto L7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void N(o8.w r4) {
            /*
                r3 = this;
                java.lang.String r0 = "item"
                hc.t.e(r4, r0)
                s1.a r0 = r3.M()
                k8.t r0 = (k8.t) r0
                android.widget.TextView r0 = r0.f14826d
                int r1 = r4.b()
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r1 = k7.w.f(r1, r2)
                r0.setText(r1)
                s1.a r0 = r3.M()
                k8.t r0 = (k8.t) r0
                android.widget.TextView r0 = r0.f14824b
                j$.time.Instant r1 = r4.a()
                if (r1 == 0) goto L41
                j$.time.Instant r4 = r4.a()
                j$.time.ZoneId r1 = j$.time.ZoneId.systemDefault()
                j$.time.LocalDateTime r4 = j$.time.LocalDateTime.ofInstant(r4, r1)
                java.lang.String r1 = "ofInstant(item.date, ZoneId.systemDefault())"
                hc.t.d(r4, r1)
                java.lang.String r4 = z9.l.a(r4)
                if (r4 == 0) goto L41
                goto L43
            L41:
                java.lang.String r4 = ""
            L43:
                r0.setText(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o8.x.a.N(o8.w):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Fragment fragment) {
        super(fragment);
        hc.t.e(fragment, "parent");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        List<w> list = this.f17709d;
        if (list == null) {
            hc.t.s("items");
            list = null;
        }
        return list.size();
    }

    /* renamed from: x */
    public void l(a aVar, int i10) {
        hc.t.e(aVar, "holder");
        List<w> list = this.f17709d;
        if (list == null) {
            hc.t.s("items");
            list = null;
        }
        aVar.N(list.get(i10));
    }

    /* renamed from: y */
    public a n(ViewGroup viewGroup, int i10) {
        hc.t.e(viewGroup, "parent");
        return new a(this, viewGroup);
    }

    public final void z(List<w> list) {
        hc.t.e(list, "items");
        this.f17709d = list;
        j();
    }
}
