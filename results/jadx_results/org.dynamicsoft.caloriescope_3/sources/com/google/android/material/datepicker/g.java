package com.google.android.material.datepicker;

import a.g.l.u;
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
public final class g<S> extends m<S> {
    static final Object j0 = "MONTHS_VIEW_GROUP_TAG";
    static final Object k0 = "NAVIGATION_PREV_TAG";
    static final Object l0 = "NAVIGATION_NEXT_TAG";
    static final Object m0 = "SELECTOR_TOGGLE_TAG";
    private int Z;
    private com.google.android.material.datepicker.d<S> a0;
    private com.google.android.material.datepicker.a b0;
    private com.google.android.material.datepicker.i c0;
    private k d0;
    private com.google.android.material.datepicker.c e0;
    private RecyclerView f0;
    private RecyclerView g0;
    private View h0;
    private View i0;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f1457b;

        a(int i) {
            g.this = r1;
            this.f1457b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.g0.smoothScrollToPosition(this.f1457b);
        }
    }

    /* loaded from: classes.dex */
    class b extends a.g.l.a {
        b(g gVar) {
        }

        @Override // a.g.l.a
        public void a(View view, a.g.l.d0.c cVar) {
            super.a(view, cVar);
            cVar.a((Object) null);
        }
    }

    /* loaded from: classes.dex */
    class c extends n {
        final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            g.this = r1;
            this.I = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void a(RecyclerView.a0 a0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = g.this.g0.getWidth();
                iArr[1] = g.this.g0.getWidth();
                return;
            }
            iArr[0] = g.this.g0.getHeight();
            iArr[1] = g.this.g0.getHeight();
        }
    }

    /* loaded from: classes.dex */
    class d implements l {
        d() {
            g.this = r1;
        }

        @Override // com.google.android.material.datepicker.g.l
        public void a(long j) {
            if (g.this.b0.d().b(j)) {
                g.this.a0.a(j);
                Iterator<com.google.android.material.datepicker.l<S>> it = g.this.Y.iterator();
                while (it.hasNext()) {
                    it.next().a((S) g.this.a0.a());
                }
                g.this.g0.getAdapter().d();
                if (g.this.f0 == null) {
                    return;
                }
                g.this.f0.getAdapter().d();
            }
        }
    }

    /* loaded from: classes.dex */
    public class e extends RecyclerView.n {

        /* renamed from: a */
        private final Calendar f1460a = o.d();

        /* renamed from: b */
        private final Calendar f1461b = o.d();

        e() {
            g.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void a(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (!(recyclerView.getAdapter() instanceof p) || !(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                return;
            }
            p pVar = (p) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (a.g.k.d<Long, Long> dVar : g.this.a0.b()) {
                Long l = dVar.f245a;
                if (l != null && dVar.f246b != null) {
                    this.f1460a.setTimeInMillis(l.longValue());
                    this.f1461b.setTimeInMillis(dVar.f246b.longValue());
                    int c2 = pVar.c(this.f1460a.get(1));
                    int c3 = pVar.c(this.f1461b.get(1));
                    View c4 = gridLayoutManager.c(c2);
                    View c5 = gridLayoutManager.c(c3);
                    int M = c2 / gridLayoutManager.M();
                    int M2 = c3 / gridLayoutManager.M();
                    int i = M;
                    while (i <= M2) {
                        View c6 = gridLayoutManager.c(gridLayoutManager.M() * i);
                        if (c6 != null) {
                            canvas.drawRect(i == M ? c4.getLeft() + (c4.getWidth() / 2) : 0, c6.getTop() + g.this.e0.d.b(), i == M2 ? c5.getLeft() + (c5.getWidth() / 2) : recyclerView.getWidth(), c6.getBottom() - g.this.e0.d.a(), g.this.e0.h);
                        }
                        i++;
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class f extends a.g.l.a {
        f() {
            g.this = r1;
        }

        @Override // a.g.l.a
        public void a(View view, a.g.l.d0.c cVar) {
            g gVar;
            int i;
            super.a(view, cVar);
            if (g.this.i0.getVisibility() == 0) {
                gVar = g.this;
                i = b.a.a.a.j.mtrl_picker_toggle_to_year_selection;
            } else {
                gVar = g.this;
                i = b.a.a.a.j.mtrl_picker_toggle_to_day_selection;
            }
            cVar.d(gVar.a(i));
        }
    }

    /* renamed from: com.google.android.material.datepicker.g$g */
    /* loaded from: classes.dex */
    public class C0065g extends RecyclerView.t {

        /* renamed from: a */
        final /* synthetic */ com.google.android.material.datepicker.k f1463a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f1464b;

        C0065g(com.google.android.material.datepicker.k kVar, MaterialButton materialButton) {
            g.this = r1;
            this.f1463a = kVar;
            this.f1464b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f1464b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager m0 = g.this.m0();
            int G = i < 0 ? m0.G() : m0.H();
            g.this.c0 = this.f1463a.c(G);
            this.f1464b.setText(this.f1463a.d(G));
        }
    }

    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        h() {
            g.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.n0();
        }
    }

    /* loaded from: classes.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ com.google.android.material.datepicker.k f1467b;

        i(com.google.android.material.datepicker.k kVar) {
            g.this = r1;
            this.f1467b = kVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int G = g.this.m0().G() + 1;
            if (G < g.this.g0.getAdapter().a()) {
                g.this.a(this.f1467b.c(G));
            }
        }
    }

    /* loaded from: classes.dex */
    public class j implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ com.google.android.material.datepicker.k f1469b;

        j(com.google.android.material.datepicker.k kVar) {
            g.this = r1;
            this.f1469b = kVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int H = g.this.m0().H() - 1;
            if (H >= 0) {
                g.this.a(this.f1469b.c(H));
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

    private void a(View view, com.google.android.material.datepicker.k kVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(b.a.a.a.f.month_navigation_fragment_toggle);
        materialButton.setTag(m0);
        u.a(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(b.a.a.a.f.month_navigation_previous);
        materialButton2.setTag(k0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(b.a.a.a.f.month_navigation_next);
        materialButton3.setTag(l0);
        this.h0 = view.findViewById(b.a.a.a.f.mtrl_calendar_year_selector_frame);
        this.i0 = view.findViewById(b.a.a.a.f.mtrl_calendar_day_selector_frame);
        a(k.DAY);
        materialButton.setText(this.c0.e());
        this.g0.addOnScrollListener(new C0065g(kVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(kVar));
        materialButton2.setOnClickListener(new j(kVar));
    }

    public static int b(Context context) {
        return context.getResources().getDimensionPixelSize(b.a.a.a.d.mtrl_calendar_day_height);
    }

    private void d(int i2) {
        this.g0.post(new a(i2));
    }

    private RecyclerView.n o0() {
        return new e();
    }

    @Override // androidx.fragment.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m(), this.Z);
        this.e0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.i h2 = this.b0.h();
        if (com.google.android.material.datepicker.h.b(contextThemeWrapper)) {
            i3 = b.a.a.a.h.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i3 = b.a.a.a.h.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i3, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(b.a.a.a.f.mtrl_calendar_days_of_week);
        u.a(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.f());
        gridView.setNumColumns(h2.f);
        gridView.setEnabled(false);
        this.g0 = (RecyclerView) inflate.findViewById(b.a.a.a.f.mtrl_calendar_months);
        this.g0.setLayoutManager(new c(m(), i2, false, i2));
        this.g0.setTag(j0);
        com.google.android.material.datepicker.k kVar = new com.google.android.material.datepicker.k(contextThemeWrapper, this.a0, this.b0, new d());
        this.g0.setAdapter(kVar);
        int integer = contextThemeWrapper.getResources().getInteger(b.a.a.a.g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(b.a.a.a.f.mtrl_calendar_year_selector_frame);
        this.f0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f0.setAdapter(new p(this));
            this.f0.addItemDecoration(o0());
        }
        if (inflate.findViewById(b.a.a.a.f.month_navigation_fragment_toggle) != null) {
            a(inflate, kVar);
        }
        if (!com.google.android.material.datepicker.h.b(contextThemeWrapper)) {
            new androidx.recyclerview.widget.h().a(this.g0);
        }
        this.g0.scrollToPosition(kVar.a(this.c0));
        return inflate;
    }

    public void a(k kVar) {
        this.d0 = kVar;
        if (kVar == k.YEAR) {
            this.f0.getLayoutManager().i(((p) this.f0.getAdapter()).c(this.c0.e));
            this.h0.setVisibility(0);
            this.i0.setVisibility(8);
        } else if (kVar != k.DAY) {
        } else {
            this.h0.setVisibility(8);
            this.i0.setVisibility(0);
            a(this.c0);
        }
    }

    public void a(com.google.android.material.datepicker.i iVar) {
        RecyclerView recyclerView;
        int i2;
        com.google.android.material.datepicker.k kVar = (com.google.android.material.datepicker.k) this.g0.getAdapter();
        int a2 = kVar.a(iVar);
        int a3 = a2 - kVar.a(this.c0);
        boolean z = true;
        boolean z2 = Math.abs(a3) > 3;
        if (a3 <= 0) {
            z = false;
        }
        this.c0 = iVar;
        if (!z2 || !z) {
            if (z2) {
                recyclerView = this.g0;
                i2 = a2 + 3;
            }
            d(a2);
        }
        recyclerView = this.g0;
        i2 = a2 - 3;
        recyclerView.scrollToPosition(i2);
        d(a2);
    }

    @Override // androidx.fragment.app.Fragment
    public void c(Bundle bundle) {
        super.c(bundle);
        if (bundle == null) {
            bundle = k();
        }
        this.Z = bundle.getInt("THEME_RES_ID_KEY");
        this.a0 = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.b0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.c0 = (com.google.android.material.datepicker.i) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.Z);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.a0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.b0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.c0);
    }

    public com.google.android.material.datepicker.a i0() {
        return this.b0;
    }

    public com.google.android.material.datepicker.c j0() {
        return this.e0;
    }

    public com.google.android.material.datepicker.i k0() {
        return this.c0;
    }

    public com.google.android.material.datepicker.d<S> l0() {
        return this.a0;
    }

    LinearLayoutManager m0() {
        return (LinearLayoutManager) this.g0.getLayoutManager();
    }

    void n0() {
        k kVar;
        k kVar2 = this.d0;
        if (kVar2 == k.YEAR) {
            kVar = k.DAY;
        } else if (kVar2 != k.DAY) {
            return;
        } else {
            kVar = k.YEAR;
        }
        a(kVar);
    }
}
