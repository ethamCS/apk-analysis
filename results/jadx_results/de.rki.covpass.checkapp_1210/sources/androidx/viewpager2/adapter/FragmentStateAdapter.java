package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.util.h;
import androidx.core.view.y;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f0;
import androidx.fragment.app.w;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.g<androidx.viewpager2.adapter.a> implements androidx.viewpager2.adapter.b {

    /* renamed from: c */
    final m f5189c;

    /* renamed from: d */
    final w f5190d;

    /* renamed from: e */
    final i0.d<Fragment> f5191e;

    /* renamed from: f */
    private final i0.d<Fragment.m> f5192f;

    /* renamed from: g */
    private final i0.d<Integer> f5193g;

    /* renamed from: h */
    private FragmentMaxLifecycleEnforcer f5194h;

    /* renamed from: i */
    boolean f5195i;

    /* renamed from: j */
    private boolean f5196j;

    /* loaded from: classes.dex */
    public class FragmentMaxLifecycleEnforcer {

        /* renamed from: a */
        private ViewPager2.i f5202a;

        /* renamed from: b */
        private RecyclerView.i f5203b;

        /* renamed from: c */
        private s f5204c;

        /* renamed from: d */
        private ViewPager2 f5205d;

        /* renamed from: e */
        private long f5206e = -1;

        /* loaded from: classes.dex */
        public class a extends ViewPager2.i {
            a() {
                FragmentMaxLifecycleEnforcer.this = r1;
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void a(int i10) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void c(int i10) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }
        }

        /* loaded from: classes.dex */
        public class b extends d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b() {
                super(null);
                FragmentMaxLifecycleEnforcer.this = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void a() {
                FragmentMaxLifecycleEnforcer.this.d(true);
            }
        }

        FragmentMaxLifecycleEnforcer() {
            FragmentStateAdapter.this = r3;
        }

        private ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        void b(RecyclerView recyclerView) {
            this.f5205d = a(recyclerView);
            a aVar = new a();
            this.f5202a = aVar;
            this.f5205d.g(aVar);
            b bVar = new b();
            this.f5203b = bVar;
            FragmentStateAdapter.this.t(bVar);
            s sVar = new s() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.s
                public void f(v vVar, m.b bVar2) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.f5204c = sVar;
            FragmentStateAdapter.this.f5189c.a(sVar);
        }

        void c(RecyclerView recyclerView) {
            a(recyclerView).n(this.f5202a);
            FragmentStateAdapter.this.v(this.f5203b);
            FragmentStateAdapter.this.f5189c.c(this.f5204c);
            this.f5205d = null;
        }

        void d(boolean z10) {
            int currentItem;
            Fragment g10;
            if (!FragmentStateAdapter.this.P() && this.f5205d.getScrollState() == 0 && !FragmentStateAdapter.this.f5191e.j() && FragmentStateAdapter.this.e() != 0 && (currentItem = this.f5205d.getCurrentItem()) < FragmentStateAdapter.this.e()) {
                long f10 = FragmentStateAdapter.this.f(currentItem);
                if ((f10 == this.f5206e && !z10) || (g10 = FragmentStateAdapter.this.f5191e.g(f10)) == null || !g10.C0()) {
                    return;
                }
                this.f5206e = f10;
                f0 p10 = FragmentStateAdapter.this.f5190d.p();
                Fragment fragment = null;
                for (int i10 = 0; i10 < FragmentStateAdapter.this.f5191e.p(); i10++) {
                    long k10 = FragmentStateAdapter.this.f5191e.k(i10);
                    Fragment q10 = FragmentStateAdapter.this.f5191e.q(i10);
                    if (q10.C0()) {
                        if (k10 != this.f5206e) {
                            p10.s(q10, m.c.STARTED);
                        } else {
                            fragment = q10;
                        }
                        q10.d2(k10 == this.f5206e);
                    }
                }
                if (fragment != null) {
                    p10.s(fragment, m.c.RESUMED);
                }
                if (p10.o()) {
                    return;
                }
                p10.j();
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f5211a;

        /* renamed from: b */
        final /* synthetic */ androidx.viewpager2.adapter.a f5212b;

        a(FrameLayout frameLayout, androidx.viewpager2.adapter.a aVar) {
            FragmentStateAdapter.this = r1;
            this.f5211a = frameLayout;
            this.f5212b = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (this.f5211a.getParent() != null) {
                this.f5211a.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.L(this.f5212b);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends w.l {

        /* renamed from: a */
        final /* synthetic */ Fragment f5214a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f5215b;

        b(Fragment fragment, FrameLayout frameLayout) {
            FragmentStateAdapter.this = r1;
            this.f5214a = fragment;
            this.f5215b = frameLayout;
        }

        @Override // androidx.fragment.app.w.l
        public void m(w wVar, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f5214a) {
                wVar.A1(this);
                FragmentStateAdapter.this.w(view, this.f5215b);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
            FragmentStateAdapter.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f5195i = false;
            fragmentStateAdapter.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class d extends RecyclerView.i {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    public FragmentStateAdapter(Fragment fragment) {
        this(fragment.S(), fragment.c());
    }

    public FragmentStateAdapter(w wVar, m mVar) {
        this.f5191e = new i0.d<>();
        this.f5192f = new i0.d<>();
        this.f5193g = new i0.d<>();
        this.f5195i = false;
        this.f5196j = false;
        this.f5190d = wVar;
        this.f5189c = mVar;
        super.u(true);
    }

    private void A(int i10) {
        long f10 = f(i10);
        if (!this.f5191e.e(f10)) {
            Fragment y10 = y(i10);
            y10.c2(this.f5192f.g(f10));
            this.f5191e.l(f10, y10);
        }
    }

    private boolean C(long j10) {
        View x02;
        if (this.f5193g.e(j10)) {
            return true;
        }
        Fragment g10 = this.f5191e.g(j10);
        return (g10 == null || (x02 = g10.x0()) == null || x02.getParent() == null) ? false : true;
    }

    private static boolean D(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long E(int i10) {
        Long l10 = null;
        for (int i11 = 0; i11 < this.f5193g.p(); i11++) {
            if (this.f5193g.q(i11).intValue() == i10) {
                if (l10 != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l10 = Long.valueOf(this.f5193g.k(i11));
            }
        }
        return l10;
    }

    private static long K(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void M(long j10) {
        ViewParent parent;
        Fragment g10 = this.f5191e.g(j10);
        if (g10 == null) {
            return;
        }
        if (g10.x0() != null && (parent = g10.x0().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!x(j10)) {
            this.f5192f.m(j10);
        }
        if (!g10.C0()) {
            this.f5191e.m(j10);
        } else if (P()) {
            this.f5196j = true;
        } else {
            if (g10.C0() && x(j10)) {
                this.f5192f.l(j10, this.f5190d.r1(g10));
            }
            this.f5190d.p().p(g10).j();
            this.f5191e.m(j10);
        }
    }

    private void N() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final c cVar = new c();
        this.f5189c.a(new s() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // androidx.lifecycle.s
            public void f(v vVar, m.b bVar) {
                if (bVar == m.b.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    vVar.c().c(this);
                }
            }
        });
        handler.postDelayed(cVar, 10000L);
    }

    private void O(Fragment fragment, FrameLayout frameLayout) {
        this.f5190d.k1(new b(fragment, frameLayout), false);
    }

    private static String z(String str, long j10) {
        return str + j10;
    }

    void B() {
        if (!this.f5196j || P()) {
            return;
        }
        i0.b<Long> bVar = new i0.b();
        for (int i10 = 0; i10 < this.f5191e.p(); i10++) {
            long k10 = this.f5191e.k(i10);
            if (!x(k10)) {
                bVar.add(Long.valueOf(k10));
                this.f5193g.m(k10);
            }
        }
        if (!this.f5195i) {
            this.f5196j = false;
            for (int i11 = 0; i11 < this.f5191e.p(); i11++) {
                long k11 = this.f5191e.k(i11);
                if (!C(k11)) {
                    bVar.add(Long.valueOf(k11));
                }
            }
        }
        for (Long l10 : bVar) {
            M(l10.longValue());
        }
    }

    /* renamed from: F */
    public final void l(androidx.viewpager2.adapter.a aVar, int i10) {
        long k10 = aVar.k();
        int id2 = aVar.N().getId();
        Long E = E(id2);
        if (E != null && E.longValue() != k10) {
            M(E.longValue());
            this.f5193g.m(E.longValue());
        }
        this.f5193g.l(k10, Integer.valueOf(id2));
        A(i10);
        FrameLayout N = aVar.N();
        if (y.R(N)) {
            if (N.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            N.addOnLayoutChangeListener(new a(N, aVar));
        }
        B();
    }

    /* renamed from: G */
    public final androidx.viewpager2.adapter.a n(ViewGroup viewGroup, int i10) {
        return androidx.viewpager2.adapter.a.M(viewGroup);
    }

    /* renamed from: H */
    public final boolean p(androidx.viewpager2.adapter.a aVar) {
        return true;
    }

    /* renamed from: I */
    public final void q(androidx.viewpager2.adapter.a aVar) {
        L(aVar);
        B();
    }

    /* renamed from: J */
    public final void s(androidx.viewpager2.adapter.a aVar) {
        Long E = E(aVar.N().getId());
        if (E != null) {
            M(E.longValue());
            this.f5193g.m(E.longValue());
        }
    }

    void L(final androidx.viewpager2.adapter.a aVar) {
        Fragment g10 = this.f5191e.g(aVar.k());
        if (g10 != null) {
            FrameLayout N = aVar.N();
            View x02 = g10.x0();
            if (!g10.C0() && x02 != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (g10.C0() && x02 == null) {
                O(g10, N);
                return;
            } else if (g10.C0() && x02.getParent() != null) {
                if (x02.getParent() == N) {
                    return;
                }
                w(x02, N);
                return;
            } else if (g10.C0()) {
                w(x02, N);
                return;
            } else if (P()) {
                if (this.f5190d.K0()) {
                    return;
                }
                this.f5189c.a(new s() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                    @Override // androidx.lifecycle.s
                    public void f(v vVar, m.b bVar) {
                        if (FragmentStateAdapter.this.P()) {
                            return;
                        }
                        vVar.c().c(this);
                        if (!y.R(aVar.N())) {
                            return;
                        }
                        FragmentStateAdapter.this.L(aVar);
                    }
                });
                return;
            } else {
                O(g10, N);
                f0 p10 = this.f5190d.p();
                p10.e(g10, "f" + aVar.k()).s(g10, m.c.STARTED).j();
                this.f5194h.d(false);
                return;
            }
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    boolean P() {
        return this.f5190d.R0();
    }

    @Override // androidx.viewpager2.adapter.b
    public final Parcelable a() {
        Bundle bundle = new Bundle(this.f5191e.p() + this.f5192f.p());
        for (int i10 = 0; i10 < this.f5191e.p(); i10++) {
            long k10 = this.f5191e.k(i10);
            Fragment g10 = this.f5191e.g(k10);
            if (g10 != null && g10.C0()) {
                this.f5190d.j1(bundle, z("f#", k10), g10);
            }
        }
        for (int i11 = 0; i11 < this.f5192f.p(); i11++) {
            long k11 = this.f5192f.k(i11);
            if (x(k11)) {
                bundle.putParcelable(z("s#", k11), this.f5192f.g(k11));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.b
    public final void b(Parcelable parcelable) {
        long K;
        Object u02;
        i0.d dVar;
        if (!this.f5192f.j() || !this.f5191e.j()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (D(str, "f#")) {
                K = K(str, "f#");
                u02 = this.f5190d.u0(bundle, str);
                dVar = this.f5191e;
            } else if (!D(str, "s#")) {
                throw new IllegalArgumentException("Unexpected key in savedState: " + str);
            } else {
                K = K(str, "s#");
                u02 = (Fragment.m) bundle.getParcelable(str);
                if (x(K)) {
                    dVar = this.f5192f;
                }
            }
            dVar.l(K, u02);
        }
        if (this.f5191e.j()) {
            return;
        }
        this.f5196j = true;
        this.f5195i = true;
        B();
        N();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long f(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void k(RecyclerView recyclerView) {
        h.a(this.f5194h == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f5194h = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void o(RecyclerView recyclerView) {
        this.f5194h.c(recyclerView);
        this.f5194h = null;
    }

    void w(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public boolean x(long j10) {
        return j10 >= 0 && j10 < ((long) e());
    }

    public abstract Fragment y(int i10);
}
