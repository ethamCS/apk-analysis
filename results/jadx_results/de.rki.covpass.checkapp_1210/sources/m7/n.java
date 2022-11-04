package m7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import m7.o;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lm7/n;", "Landroidx/fragment/app/Fragment;", "Lm7/o;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "T0", "view", "Ltb/e0;", "o1", "<init>", "()V", "navigation_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class n extends Fragment implements o {

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/fragment/app/Fragment;", "it", "b", "(Landroidx/fragment/app/Fragment;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<Fragment, b0> {

        /* renamed from: c */
        public static final a f16408c = new a();

        public a() {
            super(1);
        }

        /* renamed from: b */
        public final b0 invoke(Fragment fragment) {
            hc.t.e(fragment, "it");
            if (!(fragment instanceof b0)) {
                fragment = null;
            }
            return (b0) fragment;
        }
    }

    public static final void o2(n nVar, View view) {
        hc.t.e(nVar, "this$0");
        b0 b0Var = (b0) g.b(nVar, 0, 1, null).h(a.f16408c);
        if (b0Var != null) {
            b0Var.k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        hc.t.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(d0.a_res_0x7f0c0070, viewGroup, false);
        hc.t.d(inflate, "inflater.inflate(R.layou…verlay, container, false)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        hc.t.e(view, "view");
        super.o1(view, bundle);
        View findViewById = view.findViewById(c0.a_res_0x7f09019f);
        findViewById.setAccessibilityDelegate(null);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: m7.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                n.o2(n.this, view2);
            }
        });
    }

    @Override // m7.c
    public void r(androidx.fragment.app.f0 f0Var, Fragment fragment) {
        o.a.a(this, f0Var, fragment);
    }
}
