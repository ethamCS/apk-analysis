package e8;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import hc.q;
import hc.t;
import java.util.List;
import k7.h;
import k7.i;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¨\u0006\u0015"}, d2 = {"Le8/c;", "Lk7/h;", "Le8/c$a;", "Landroid/view/ViewGroup;", "parent", BuildConfig.FLAVOR, "viewType", "y", "holder", "position", "Ltb/e0;", "x", "e", BuildConfig.FLAVOR, "Le8/d;", "items", "z", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "a", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"NotifyDataSetChanged"})
/* loaded from: classes.dex */
public final class c extends h<a> {

    /* renamed from: d */
    private List<d> f9511d;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u000b"}, d2 = {"Le8/c$a;", "Lk7/i;", "Ly7/c;", "Le8/d;", "item", "Ltb/e0;", "N", "Landroid/view/ViewGroup;", "parent", "<init>", "(Le8/c;Landroid/view/ViewGroup;)V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public final class a extends i<y7.c> {

        /* renamed from: u */
        final /* synthetic */ c f9512u;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: e8.c$a$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0137a extends q implements gc.q<LayoutInflater, ViewGroup, Boolean, y7.c> {
            public static final C0137a Y3 = new C0137a();

            C0137a() {
                super(3, y7.c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lde/rki/covpass/checkapp/databinding/RevocationExportDetailItemBinding;", 0);
            }

            public final y7.c i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
                t.e(layoutInflater, "p0");
                return y7.c.d(layoutInflater, viewGroup, z10);
            }

            @Override // gc.q
            public /* bridge */ /* synthetic */ y7.c s(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return i0(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, ViewGroup viewGroup) {
            super(viewGroup, C0137a.Y3);
            t.e(viewGroup, "parent");
            this.f9512u = cVar;
        }

        public final void N(d dVar) {
            t.e(dVar, "item");
            M().f25898b.setText(dVar.a());
            M().f25899c.setText(dVar.b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Fragment fragment) {
        super(fragment);
        t.e(fragment, "parent");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        List<d> list = this.f9511d;
        if (list == null) {
            t.s("items");
            list = null;
        }
        return list.size();
    }

    /* renamed from: x */
    public void l(a aVar, int i10) {
        t.e(aVar, "holder");
        List<d> list = this.f9511d;
        if (list == null) {
            t.s("items");
            list = null;
        }
        aVar.N(list.get(i10));
    }

    /* renamed from: y */
    public a n(ViewGroup viewGroup, int i10) {
        t.e(viewGroup, "parent");
        return new a(this, viewGroup);
    }

    public final void z(List<d> list) {
        t.e(list, "items");
        this.f9511d = list;
        j();
    }
}
