package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference;
import androidx.preference.j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public abstract class g extends Fragment implements j.c, j.a, j.b, DialogPreference.a {
    private j Y;
    RecyclerView Z;
    private boolean a0;
    private boolean b0;
    private Runnable d0;
    private final c X = new c();
    private int c0 = q.c_res_0x7f0c0076;
    private Handler e0 = new a();
    private final Runnable f0 = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends Handler {
        a() {
            g.this = r1;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            g.this.z1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            g.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = g.this.Z;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public class c extends RecyclerView.n {

        /* renamed from: a */
        private Drawable f1452a;

        /* renamed from: b */
        private int f1453b;

        /* renamed from: c */
        private boolean f1454c = true;

        c() {
            g.this = r1;
        }

        private boolean o(View view, RecyclerView recyclerView) {
            RecyclerView.d0 i0 = recyclerView.i0(view);
            boolean z = false;
            if (!((i0 instanceof l) && ((l) i0).O())) {
                return false;
            }
            boolean z2 = this.f1454c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z2;
            }
            RecyclerView.d0 i02 = recyclerView.i0(recyclerView.getChildAt(indexOfChild + 1));
            if ((i02 instanceof l) && ((l) i02).N()) {
                z = true;
            }
            return z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (o(view, recyclerView)) {
                rect.bottom = this.f1453b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (this.f1452a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (o(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.f1452a.setBounds(0, y, width, this.f1453b + y);
                    this.f1452a.draw(canvas);
                }
            }
        }

        public void l(boolean z) {
            this.f1454c = z;
        }

        public void m(Drawable drawable) {
            this.f1453b = drawable != null ? drawable.getIntrinsicHeight() : 0;
            this.f1452a = drawable;
            g.this.Z.w0();
        }

        public void n(int i) {
            this.f1453b = i;
            g.this.Z.w0();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(g gVar, Preference preference);
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a(g gVar, Preference preference);
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean a(g gVar, PreferenceScreen preferenceScreen);
    }

    private void K1() {
        if (this.e0.hasMessages(1)) {
            return;
        }
        this.e0.obtainMessage(1).sendToTarget();
    }

    private void L1() {
        if (this.Y != null) {
            return;
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }

    private void Q1() {
        B1().setAdapter(null);
        PreferenceScreen D1 = D1();
        if (D1 != null) {
            D1.U();
        }
        J1();
    }

    public Fragment A1() {
        return null;
    }

    public final RecyclerView B1() {
        return this.Z;
    }

    public j C1() {
        return this.Y;
    }

    public PreferenceScreen D1() {
        return this.Y.k();
    }

    @Override // androidx.fragment.app.Fragment
    public void E0(Bundle bundle) {
        super.E0(bundle);
        PreferenceScreen D1 = D1();
        if (D1 != null) {
            Bundle bundle2 = new Bundle();
            D1.m0(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    protected void E1() {
    }

    @Override // androidx.fragment.app.Fragment
    public void F0() {
        super.F0();
        this.Y.q(this);
        this.Y.o(this);
    }

    protected RecyclerView.g F1(PreferenceScreen preferenceScreen) {
        return new h(preferenceScreen);
    }

    @Override // androidx.fragment.app.Fragment
    public void G0() {
        super.G0();
        this.Y.q(null);
        this.Y.o(null);
    }

    public RecyclerView.o G1() {
        return new LinearLayoutManager(t());
    }

    @Override // androidx.fragment.app.Fragment
    public void H0(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen D1;
        super.H0(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (D1 = D1()) != null) {
            D1.l0(bundle2);
        }
        if (this.a0) {
            z1();
            Runnable runnable = this.d0;
            if (runnable != null) {
                runnable.run();
                this.d0 = null;
            }
        }
        this.b0 = true;
    }

    public abstract void H1(Bundle bundle, String str);

    public RecyclerView I1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (!t().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup.findViewById(p.b_res_0x7f090166)) == null) {
            RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(q.d_res_0x7f0c0078, viewGroup, false);
            recyclerView2.setLayoutManager(G1());
            recyclerView2.setAccessibilityDelegateCompat(new k(recyclerView2));
            return recyclerView2;
        }
        return recyclerView;
    }

    protected void J1() {
    }

    public void M1(Drawable drawable) {
        this.X.m(drawable);
    }

    public void N1(int i) {
        this.X.n(i);
    }

    public void O1(PreferenceScreen preferenceScreen) {
        if (!this.Y.r(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        J1();
        this.a0 = true;
        if (!this.b0) {
            return;
        }
        K1();
    }

    public void P1(int i, String str) {
        L1();
        PreferenceScreen m = this.Y.m(t(), i, null);
        Object obj = m;
        if (str != null) {
            Object I0 = m.I0(str);
            boolean z = I0 instanceof PreferenceScreen;
            obj = I0;
            if (!z) {
                throw new IllegalArgumentException("Preference object with key " + str + " is not a PreferenceScreen");
            }
        }
        O1((PreferenceScreen) obj);
    }

    @Override // androidx.preference.j.a
    public void b(Preference preference) {
        androidx.fragment.app.c cVar;
        boolean a2 = A1() instanceof d ? ((d) A1()).a(this, preference) : false;
        if (!a2 && (m() instanceof d)) {
            a2 = ((d) m()).a(this, preference);
        }
        if (!a2 && F().X("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                cVar = androidx.preference.a.R1(preference.p());
            } else if (preference instanceof ListPreference) {
                cVar = androidx.preference.c.R1(preference.p());
            } else if (!(preference instanceof MultiSelectListPreference)) {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            } else {
                cVar = androidx.preference.d.R1(preference.p());
            }
            cVar.v1(this, 0);
            cVar.I1(F(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    @Override // androidx.preference.j.b
    public void e(PreferenceScreen preferenceScreen) {
        if ((A1() instanceof f ? ((f) A1()).a(this, preferenceScreen) : false) || !(m() instanceof f)) {
            return;
        }
        ((f) m()).a(this, preferenceScreen);
    }

    @Override // androidx.preference.j.c
    public boolean f(Preference preference) {
        if (preference.l() != null) {
            boolean a2 = A1() instanceof e ? ((e) A1()).a(this, preference) : false;
            if (!a2 && (m() instanceof e)) {
                a2 = ((e) m()).a(this, preference);
            }
            if (a2) {
                return true;
            }
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            androidx.fragment.app.m p = h1().p();
            Bundle j = preference.j();
            Fragment a3 = p.e0().a(h1().getClassLoader(), preference.l());
            a3.o1(j);
            a3.v1(this, 0);
            androidx.fragment.app.t i = p.i();
            i.o(((View) P().getParent()).getId(), a3);
            i.g(null);
            i.h();
            return true;
        }
        return false;
    }

    @Override // androidx.preference.DialogPreference.a
    public <T extends Preference> T g(CharSequence charSequence) {
        j jVar = this.Y;
        if (jVar == null) {
            return null;
        }
        return (T) jVar.a(charSequence);
    }

    @Override // androidx.fragment.app.Fragment
    public void i0(Bundle bundle) {
        super.i0(bundle);
        TypedValue typedValue = new TypedValue();
        m().getTheme().resolveAttribute(m.j_res_0x7f040298, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = s.a_res_0x7f11011e;
        }
        m().getTheme().applyStyle(i, false);
        j jVar = new j(t());
        this.Y = jVar;
        jVar.p(this);
        H1(bundle, r() != null ? r().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    public View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = t().obtainStyledAttributes(null, t.u0, m.g_res_0x7f040292, 0);
        this.c0 = obtainStyledAttributes.getResourceId(t.v0, this.c0);
        Drawable drawable = obtainStyledAttributes.getDrawable(t.w0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(t.x0, -1);
        boolean z = obtainStyledAttributes.getBoolean(t.y0, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(t());
        View inflate = cloneInContext.inflate(this.c0, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView I1 = I1(cloneInContext, viewGroup2, bundle);
            if (I1 == null) {
                throw new RuntimeException("Could not create RecyclerView");
            }
            this.Z = I1;
            I1.h(this.X);
            M1(drawable);
            if (dimensionPixelSize != -1) {
                N1(dimensionPixelSize);
            }
            this.X.l(z);
            if (this.Z.getParent() == null) {
                viewGroup2.addView(this.Z);
            }
            this.e0.post(this.f0);
            return inflate;
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    @Override // androidx.fragment.app.Fragment
    public void p0() {
        this.e0.removeCallbacks(this.f0);
        this.e0.removeMessages(1);
        if (this.a0) {
            Q1();
        }
        this.Z = null;
        super.p0();
    }

    void z1() {
        PreferenceScreen D1 = D1();
        if (D1 != null) {
            B1().setAdapter(F1(D1));
            D1.O();
        }
        E1();
    }
}
