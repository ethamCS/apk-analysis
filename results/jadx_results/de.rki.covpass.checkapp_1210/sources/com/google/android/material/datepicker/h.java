package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class h<S> extends p<S> {

    /* renamed from: c5 */
    static final Object f7137c5 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: d5 */
    static final Object f7138d5 = "NAVIGATION_PREV_TAG";

    /* renamed from: e5 */
    static final Object f7139e5 = "NAVIGATION_NEXT_TAG";

    /* renamed from: f5 */
    static final Object f7140f5 = "SELECTOR_TOGGLE_TAG";
    private int S4;
    private com.google.android.material.datepicker.d<S> T4;
    private com.google.android.material.datepicker.a U4;
    private com.google.android.material.datepicker.l V4;
    private k W4;
    private com.google.android.material.datepicker.c X4;
    private RecyclerView Y4;
    private RecyclerView Z4;

    /* renamed from: a5 */
    private View f7141a5;

    /* renamed from: b5 */
    private View f7142b5;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ int f7143c;

        a(int i10) {
            h.this = r1;
            this.f7143c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.Z4.p1(this.f7143c);
        }
    }

    /* loaded from: classes.dex */
    class b extends androidx.core.view.a {
        b() {
            h.this = r1;
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            super.g(view, dVar);
            dVar.Z(null);
        }
    }

    /* loaded from: classes.dex */
    class c extends q {
        final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            h.this = r1;
            this.I = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void M1(RecyclerView.a0 a0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = h.this.Z4.getWidth();
                iArr[1] = h.this.Z4.getWidth();
                return;
            }
            iArr[0] = h.this.Z4.getHeight();
            iArr[1] = h.this.Z4.getHeight();
        }
    }

    /* loaded from: classes.dex */
    class d implements l {
        d() {
            h.this = r1;
        }

        @Override // com.google.android.material.datepicker.h.l
        public void a(long j10) {
            if (h.this.U4.i().p(j10)) {
                h.this.T4.v(j10);
                Iterator<o<S>> it = h.this.R4.iterator();
                while (it.hasNext()) {
                    it.next().a((S) h.this.T4.t());
                }
                h.this.Z4.getAdapter().j();
                if (h.this.Y4 == null) {
                    return;
                }
                h.this.Y4.getAdapter().j();
            }
        }
    }

    /* loaded from: classes.dex */
    public class e extends RecyclerView.n {

        /* renamed from: a */
        private final Calendar f7147a = s.k();

        /* renamed from: b */
        private final Calendar f7148b = s.k();

        e() {
            h.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (!(recyclerView.getAdapter() instanceof t) || !(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                return;
            }
            t tVar = (t) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (androidx.core.util.d<Long, Long> dVar : h.this.T4.j()) {
                Long l10 = dVar.f3596a;
                if (l10 != null && dVar.f3597b != null) {
                    this.f7147a.setTimeInMillis(l10.longValue());
                    this.f7148b.setTimeInMillis(dVar.f3597b.longValue());
                    int y10 = tVar.y(this.f7147a.get(1));
                    int y11 = tVar.y(this.f7148b.get(1));
                    View C = gridLayoutManager.C(y10);
                    View C2 = gridLayoutManager.C(y11);
                    int X2 = y10 / gridLayoutManager.X2();
                    int X22 = y11 / gridLayoutManager.X2();
                    int i10 = X2;
                    while (i10 <= X22) {
                        View C3 = gridLayoutManager.C(gridLayoutManager.X2() * i10);
                        if (C3 != null) {
                            canvas.drawRect(i10 == X2 ? C.getLeft() + (C.getWidth() / 2) : 0, C3.getTop() + h.this.X4.f7127d.c(), i10 == X22 ? C2.getLeft() + (C2.getWidth() / 2) : recyclerView.getWidth(), C3.getBottom() - h.this.X4.f7127d.b(), h.this.X4.f7131h);
                        }
                        i10++;
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class f extends androidx.core.view.a {
        f() {
            h.this = r1;
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            h hVar;
            int i10;
            super.g(view, dVar);
            if (h.this.f7142b5.getVisibility() == 0) {
                hVar = h.this;
                i10 = b5.j.s_res_0x7f100176;
            } else {
                hVar = h.this;
                i10 = b5.j.q_res_0x7f100174;
            }
            dVar.h0(hVar.u0(i10));
        }
    }

    /* loaded from: classes.dex */
    public class g extends RecyclerView.t {

        /* renamed from: a */
        final /* synthetic */ n f7151a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f7152b;

        g(n nVar, MaterialButton materialButton) {
            h.this = r1;
            this.f7151a = nVar;
            this.f7152b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f7152b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i10, int i11) {
            LinearLayoutManager E2 = h.this.E2();
            int Z1 = i10 < 0 ? E2.Z1() : E2.c2();
            h.this.V4 = this.f7151a.x(Z1);
            this.f7152b.setText(this.f7151a.y(Z1));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$h */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0104h implements View.OnClickListener {
        View$OnClickListenerC0104h() {
            h.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.J2();
        }
    }

    /* loaded from: classes.dex */
    public class i implements View.OnClickListener {

        /* renamed from: c */
        final /* synthetic */ n f7155c;

        i(n nVar) {
            h.this = r1;
            this.f7155c = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int Z1 = h.this.E2().Z1() + 1;
            if (Z1 < h.this.Z4.getAdapter().e()) {
                h.this.H2(this.f7155c.x(Z1));
            }
        }
    }

    /* loaded from: classes.dex */
    public class j implements View.OnClickListener {

        /* renamed from: c */
        final /* synthetic */ n f7157c;

        j(n nVar) {
            h.this = r1;
            this.f7157c = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int c22 = h.this.E2().c2() - 1;
            if (c22 >= 0) {
                h.this.H2(this.f7157c.x(c22));
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
        void a(long j10);
    }

    public static int C2(Context context) {
        return context.getResources().getDimensionPixelSize(b5.d.M);
    }

    private static int D2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(b5.d.T) + resources.getDimensionPixelOffset(b5.d.U) + resources.getDimensionPixelOffset(b5.d.S);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(b5.d.O);
        int i10 = m.U3;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(b5.d.M) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(b5.d.R)) + resources.getDimensionPixelOffset(b5.d.K);
    }

    public static <T> h<T> F2(com.google.android.material.datepicker.d<T> dVar, int i10, com.google.android.material.datepicker.a aVar) {
        h<T> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.m());
        hVar.Y1(bundle);
        return hVar;
    }

    private void G2(int i10) {
        this.Z4.post(new a(i10));
    }

    private void w2(View view, n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(b5.f.q_res_0x7f09017b);
        materialButton.setTag(f7140f5);
        y.o0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(b5.f.s_res_0x7f09017d);
        materialButton2.setTag(f7138d5);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(b5.f.r_res_0x7f09017c);
        materialButton3.setTag(f7139e5);
        this.f7141a5 = view.findViewById(b5.f.A_res_0x7f090188);
        this.f7142b5 = view.findViewById(b5.f.v_res_0x7f090181);
        I2(k.DAY);
        materialButton.setText(this.V4.y());
        this.Z4.l(new g(nVar, materialButton));
        materialButton.setOnClickListener(new View$OnClickListenerC0104h());
        materialButton3.setOnClickListener(new i(nVar));
        materialButton2.setOnClickListener(new j(nVar));
    }

    private RecyclerView.n x2() {
        return new e();
    }

    public com.google.android.material.datepicker.l A2() {
        return this.V4;
    }

    public com.google.android.material.datepicker.d<S> B2() {
        return this.T4;
    }

    LinearLayoutManager E2() {
        return (LinearLayoutManager) this.Z4.getLayoutManager();
    }

    public void H2(com.google.android.material.datepicker.l lVar) {
        RecyclerView recyclerView;
        int i10;
        n nVar = (n) this.Z4.getAdapter();
        int z10 = nVar.z(lVar);
        int z11 = z10 - nVar.z(this.V4);
        boolean z12 = true;
        boolean z13 = Math.abs(z11) > 3;
        if (z11 <= 0) {
            z12 = false;
        }
        this.V4 = lVar;
        if (!z13 || !z12) {
            if (z13) {
                recyclerView = this.Z4;
                i10 = z10 + 3;
            }
            G2(z10);
        }
        recyclerView = this.Z4;
        i10 = z10 - 3;
        recyclerView.h1(i10);
        G2(z10);
    }

    public void I2(k kVar) {
        this.W4 = kVar;
        if (kVar == k.YEAR) {
            this.Y4.getLayoutManager().x1(((t) this.Y4.getAdapter()).y(this.V4.f7192q));
            this.f7141a5.setVisibility(0);
            this.f7142b5.setVisibility(8);
        } else if (kVar != k.DAY) {
        } else {
            this.f7141a5.setVisibility(8);
            this.f7142b5.setVisibility(0);
            H2(this.V4);
        }
    }

    void J2() {
        k kVar = this.W4;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            I2(k.DAY);
        } else if (kVar != k.DAY) {
        } else {
            I2(kVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P0(Bundle bundle) {
        super.P0(bundle);
        if (bundle == null) {
            bundle = Q();
        }
        this.S4 = bundle.getInt("THEME_RES_ID_KEY");
        this.T4 = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.U4 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.V4 = (com.google.android.material.datepicker.l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(T(), this.S4);
        this.X4 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.l n10 = this.U4.n();
        if (com.google.android.material.datepicker.i.S2(contextThemeWrapper)) {
            i11 = b5.h.q_res_0x7f0c0061;
            i10 = 1;
        } else {
            i11 = b5.h.o_res_0x7f0c005c;
            i10 = 0;
        }
        View inflate = cloneInContext.inflate(i11, viewGroup, false);
        inflate.setMinimumHeight(D2(S1()));
        GridView gridView = (GridView) inflate.findViewById(b5.f.w_res_0x7f090182);
        y.o0(gridView, new b());
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.g());
        gridView.setNumColumns(n10.f7193x);
        gridView.setEnabled(false);
        this.Z4 = (RecyclerView) inflate.findViewById(b5.f.z_res_0x7f090185);
        this.Z4.setLayoutManager(new c(T(), i10, false, i10));
        this.Z4.setTag(f7137c5);
        n nVar = new n(contextThemeWrapper, this.T4, this.U4, new d());
        this.Z4.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(b5.g.f5485c);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(b5.f.A_res_0x7f090188);
        this.Y4 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.Y4.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.Y4.setAdapter(new t(this));
            this.Y4.h(x2());
        }
        if (inflate.findViewById(b5.f.q_res_0x7f09017b) != null) {
            w2(inflate, nVar);
        }
        if (!com.google.android.material.datepicker.i.S2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.Z4);
        }
        this.Z4.h1(nVar.z(this.V4));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.S4);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.T4);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.U4);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.V4);
    }

    @Override // com.google.android.material.datepicker.p
    public boolean n2(o<S> oVar) {
        return super.n2(oVar);
    }

    public com.google.android.material.datepicker.a y2() {
        return this.U4;
    }

    public com.google.android.material.datepicker.c z2() {
        return this.X4;
    }
}
