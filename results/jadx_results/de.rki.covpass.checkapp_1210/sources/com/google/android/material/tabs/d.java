package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private final TabLayout f7556a;

    /* renamed from: b */
    private final ViewPager2 f7557b;

    /* renamed from: c */
    private final boolean f7558c;

    /* renamed from: d */
    private final boolean f7559d;

    /* renamed from: e */
    private final b f7560e;

    /* renamed from: f */
    private RecyclerView.g<?> f7561f;

    /* renamed from: g */
    private boolean f7562g;

    /* renamed from: h */
    private c f7563h;

    /* renamed from: i */
    private TabLayout.d f7564i;

    /* renamed from: j */
    private RecyclerView.i f7565j;

    /* loaded from: classes.dex */
    public class a extends RecyclerView.i {
        a() {
            d.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            d.this.b();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(TabLayout.f fVar, int i10);
    }

    /* loaded from: classes.dex */
    public static class c extends ViewPager2.i {

        /* renamed from: a */
        private final WeakReference<TabLayout> f7567a;

        /* renamed from: b */
        private int f7568b;

        /* renamed from: c */
        private int f7569c;

        c(TabLayout tabLayout) {
            this.f7567a = new WeakReference<>(tabLayout);
            d();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void a(int i10) {
            this.f7568b = this.f7569c;
            this.f7569c = i10;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void b(int i10, float f10, int i11) {
            TabLayout tabLayout = this.f7567a.get();
            if (tabLayout != null) {
                int i12 = this.f7569c;
                boolean z10 = false;
                boolean z11 = i12 != 2 || this.f7568b == 1;
                if (i12 != 2 || this.f7568b != 0) {
                    z10 = true;
                }
                tabLayout.K(i10, f10, z11, z10);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            TabLayout tabLayout = this.f7567a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f7569c;
            tabLayout.H(tabLayout.x(i10), i11 == 0 || (i11 == 2 && this.f7568b == 0));
        }

        void d() {
            this.f7569c = 0;
            this.f7568b = 0;
        }
    }

    /* renamed from: com.google.android.material.tabs.d$d */
    /* loaded from: classes.dex */
    public static class C0108d implements TabLayout.d {

        /* renamed from: a */
        private final ViewPager2 f7570a;

        /* renamed from: b */
        private final boolean f7571b;

        C0108d(ViewPager2 viewPager2, boolean z10) {
            this.f7570a = viewPager2;
            this.f7571b = z10;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.f fVar) {
            this.f7570a.j(fVar.g(), this.f7571b);
        }
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, boolean z10, b bVar) {
        this(tabLayout, viewPager2, z10, true, bVar);
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, boolean z10, boolean z11, b bVar) {
        this.f7556a = tabLayout;
        this.f7557b = viewPager2;
        this.f7558c = z10;
        this.f7559d = z11;
        this.f7560e = bVar;
    }

    public void a() {
        if (!this.f7562g) {
            RecyclerView.g<?> adapter = this.f7557b.getAdapter();
            this.f7561f = adapter;
            if (adapter == null) {
                throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
            }
            this.f7562g = true;
            c cVar = new c(this.f7556a);
            this.f7563h = cVar;
            this.f7557b.g(cVar);
            C0108d c0108d = new C0108d(this.f7557b, this.f7559d);
            this.f7564i = c0108d;
            this.f7556a.d(c0108d);
            if (this.f7558c) {
                a aVar = new a();
                this.f7565j = aVar;
                this.f7561f.t(aVar);
            }
            b();
            this.f7556a.J(this.f7557b.getCurrentItem(), 0.0f, true);
            return;
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    void b() {
        this.f7556a.D();
        RecyclerView.g<?> gVar = this.f7561f;
        if (gVar != null) {
            int e10 = gVar.e();
            for (int i10 = 0; i10 < e10; i10++) {
                TabLayout.f A = this.f7556a.A();
                this.f7560e.a(A, i10);
                this.f7556a.g(A, false);
            }
            if (e10 <= 0) {
                return;
            }
            int min = Math.min(this.f7557b.getCurrentItem(), this.f7556a.getTabCount() - 1);
            if (min == this.f7556a.getSelectedTabPosition()) {
                return;
            }
            TabLayout tabLayout = this.f7556a;
            tabLayout.G(tabLayout.x(min));
        }
    }
}
