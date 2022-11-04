package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class h<S> extends p<S> {
    static final Object i0 = "MONTHS_VIEW_GROUP_TAG";
    static final Object j0 = "NAVIGATION_PREV_TAG";
    static final Object k0 = "NAVIGATION_NEXT_TAG";
    static final Object l0 = "SELECTOR_TOGGLE_TAG";
    private int Y;
    private com.google.android.material.datepicker.d<S> Z;
    private com.google.android.material.datepicker.a a0;
    private com.google.android.material.datepicker.l b0;
    private k c0;
    private com.google.android.material.datepicker.c d0;
    private RecyclerView e0;
    private RecyclerView f0;
    private View g0;
    private View h0;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f3059b;

        a(int i) {
            h.this = r1;
            this.f3059b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f0.u1(this.f3059b);
        }
    }

    /* loaded from: classes.dex */
    class b extends b.g.l.a {
        b(h hVar) {
        }

        @Override // b.g.l.a
        public void g(View view, b.g.l.c0.c cVar) {
            super.g(view, cVar);
            cVar.d0(null);
        }
    }

    /* loaded from: classes.dex */
    class c extends q {
        final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            h.this = r1;
            this.I = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void N1(RecyclerView.a0 a0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = h.this.f0.getWidth();
                iArr[1] = h.this.f0.getWidth();
                return;
            }
            iArr[0] = h.this.f0.getHeight();
            iArr[1] = h.this.f0.getHeight();
        }
    }

    /* loaded from: classes.dex */
    class d implements l {
        d() {
            h.this = r1;
        }

        @Override // com.google.android.material.datepicker.h.l
        public void a(long j) {
            if (h.this.a0.o().g(j)) {
                h.this.Z.i(j);
                Iterator<o<S>> it = h.this.X.iterator();
                while (it.hasNext()) {
                    it.next().a((S) h.this.Z.b());
                }
                h.this.f0.getAdapter().k();
                if (h.this.e0 == null) {
                    return;
                }
                h.this.e0.getAdapter().k();
            }
        }
    }

    /* loaded from: classes.dex */
    public class e extends RecyclerView.n {

        /* renamed from: a */
        private final Calendar f3062a = s.l();

        /* renamed from: b */
        private final Calendar f3063b = s.l();

        e() {
            h.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (!(recyclerView.getAdapter() instanceof t) || !(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                return;
            }
            t tVar = (t) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (b.g.k.d<Long, Long> dVar : h.this.Z.f()) {
                Long l = dVar.f2493a;
                if (l != null && dVar.f2494b != null) {
                    this.f3062a.setTimeInMillis(l.longValue());
                    this.f3063b.setTimeInMillis(dVar.f2494b.longValue());
                    int H = tVar.H(this.f3062a.get(1));
                    int H2 = tVar.H(this.f3063b.get(1));
                    View D = gridLayoutManager.D(H);
                    View D2 = gridLayoutManager.D(H2);
                    int Z2 = H / gridLayoutManager.Z2();
                    int Z22 = H2 / gridLayoutManager.Z2();
                    int i = Z2;
                    while (i <= Z22) {
                        View D3 = gridLayoutManager.D(gridLayoutManager.Z2() * i);
                        if (D3 != null) {
                            canvas.drawRect(i == Z2 ? D.getLeft() + (D.getWidth() / 2) : 0, D3.getTop() + h.this.d0.f3049d.c(), i == Z22 ? D2.getLeft() + (D2.getWidth() / 2) : recyclerView.getWidth(), D3.getBottom() - h.this.d0.f3049d.b(), h.this.d0.f3053h);
                        }
                        i++;
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class f extends b.g.l.a {
        f() {
            h.this = r1;
        }

        @Override // b.g.l.a
        public void g(View view, b.g.l.c0.c cVar) {
            h hVar;
            int i;
            super.g(view, cVar);
            if (h.this.h0.getVisibility() == 0) {
                hVar = h.this;
                i = d.a.a.a.i.n;
            } else {
                hVar = h.this;
                i = d.a.a.a.i.l_res_0x7f1000b8;
            }
            cVar.l0(hVar.N(i));
        }
    }

    /* loaded from: classes.dex */
    public class g extends RecyclerView.t {

        /* renamed from: a */
        final /* synthetic */ n f3066a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f3067b;

        g(n nVar, MaterialButton materialButton) {
            h.this = r1;
            this.f3066a = nVar;
            this.f3067b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f3067b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager P1 = h.this.P1();
            int a2 = i < 0 ? P1.a2() : P1.d2();
            h.this.b0 = this.f3066a.G(a2);
            this.f3067b.setText(this.f3066a.H(a2));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$h */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0073h implements View.OnClickListener {
        View$OnClickListenerC0073h() {
            h.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.U1();
        }
    }

    /* loaded from: classes.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ n f3070b;

        i(n nVar) {
            h.this = r1;
            this.f3070b = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int a2 = h.this.P1().a2() + 1;
            if (a2 < h.this.f0.getAdapter().f()) {
                h.this.S1(this.f3070b.G(a2));
            }
        }
    }

    /* loaded from: classes.dex */
    public class j implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ n f3072b;

        j(n nVar) {
            h.this = r1;
            this.f3072b = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int d2 = h.this.P1().d2() - 1;
            if (d2 >= 0) {
                h.this.S1(this.f3072b.G(d2));
            }
        }
    }

    /* loaded from: classes.dex */
    public enum k {
        DAY,
        YEAR
    }

    /* loaded from: classes.dex */
    public interface l {
        void a(long j);
    }

    private void I1(View view, n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(d.a.a.a.f.f_res_0x7f09010c);
        materialButton.setTag(l0);
        b.g.l.t.i0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(d.a.a.a.f.h_res_0x7f09010e);
        materialButton2.setTag(j0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(d.a.a.a.f.g_res_0x7f09010d);
        materialButton3.setTag(k0);
        this.g0 = view.findViewById(d.a.a.a.f.o_res_0x7f090118);
        this.h0 = view.findViewById(d.a.a.a.f.j_res_0x7f090111);
        T1(k.DAY);
        materialButton.setText(this.b0.p());
        this.f0.l(new g(nVar, materialButton));
        materialButton.setOnClickListener(new View$OnClickListenerC0073h());
        materialButton3.setOnClickListener(new i(nVar));
        materialButton2.setOnClickListener(new j(nVar));
    }

    private RecyclerView.n J1() {
        return new e();
    }

    public static int O1(Context context) {
        return context.getResources().getDimensionPixelSize(d.a.a.a.d.m);
    }

    public static <T> h<T> Q1(com.google.android.material.datepicker.d<T> dVar, int i2, com.google.android.material.datepicker.a aVar) {
        h<T> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.r());
        hVar.o1(bundle);
        return hVar;
    }

    private void R1(int i2) {
        this.f0.post(new a(i2));
    }

    @Override // androidx.fragment.app.Fragment
    public void E0(Bundle bundle) {
        super.E0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.Y);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.Z);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.a0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.b0);
    }

    public com.google.android.material.datepicker.a K1() {
        return this.a0;
    }

    public com.google.android.material.datepicker.c L1() {
        return this.d0;
    }

    public com.google.android.material.datepicker.l M1() {
        return this.b0;
    }

    public com.google.android.material.datepicker.d<S> N1() {
        return this.Z;
    }

    LinearLayoutManager P1() {
        return (LinearLayoutManager) this.f0.getLayoutManager();
    }

    public void S1(com.google.android.material.datepicker.l lVar) {
        RecyclerView recyclerView;
        int i2;
        n nVar = (n) this.f0.getAdapter();
        int I = nVar.I(lVar);
        int I2 = I - nVar.I(this.b0);
        boolean z = true;
        boolean z2 = Math.abs(I2) > 3;
        if (I2 <= 0) {
            z = false;
        }
        this.b0 = lVar;
        if (!z2 || !z) {
            if (z2) {
                recyclerView = this.f0;
                i2 = I + 3;
            }
            R1(I);
        }
        recyclerView = this.f0;
        i2 = I - 3;
        recyclerView.m1(i2);
        R1(I);
    }

    public void T1(k kVar) {
        this.c0 = kVar;
        if (kVar == k.YEAR) {
            this.e0.getLayoutManager().y1(((t) this.e0.getAdapter()).H(this.b0.f3085e));
            this.g0.setVisibility(0);
            this.h0.setVisibility(8);
        } else if (kVar != k.DAY) {
        } else {
            this.g0.setVisibility(8);
            this.h0.setVisibility(0);
            S1(this.b0);
        }
    }

    void U1() {
        k kVar = this.c0;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            T1(k.DAY);
        } else if (kVar != k.DAY) {
        } else {
            T1(kVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void i0(Bundle bundle) {
        super.i0(bundle);
        if (bundle == null) {
            bundle = r();
        }
        this.Y = bundle.getInt("THEME_RES_ID_KEY");
        this.Z = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.a0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.b0 = (com.google.android.material.datepicker.l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(t(), this.Y);
        this.d0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.l s = this.a0.s();
        if (com.google.android.material.datepicker.i.Y1(contextThemeWrapper)) {
            i3 = d.a.a.a.h.m_res_0x7f0c0050;
            i2 = 1;
        } else {
            i3 = d.a.a.a.h.k_res_0x7f0c004b;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i3, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(d.a.a.a.f.k_res_0x7f090112);
        b.g.l.t.i0(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.g());
        gridView.setNumColumns(s.f3086f);
        gridView.setEnabled(false);
        this.f0 = (RecyclerView) inflate.findViewById(d.a.a.a.f.n_res_0x7f090115);
        this.f0.setLayoutManager(new c(t(), i2, false, i2));
        this.f0.setTag(i0);
        n nVar = new n(contextThemeWrapper, this.Z, this.a0, new d());
        this.f0.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(d.a.a.a.g.f3628b);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(d.a.a.a.f.o_res_0x7f090118);
        this.e0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.e0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.e0.setAdapter(new t(this));
            this.e0.h(J1());
        }
        if (inflate.findViewById(d.a.a.a.f.f_res_0x7f09010c) != null) {
            I1(inflate, nVar);
        }
        if (!com.google.android.material.datepicker.i.Y1(contextThemeWrapper)) {
            new androidx.recyclerview.widget.n().b(this.f0);
        }
        this.f0.m1(nVar.I(this.b0));
        return inflate;
    }
}
