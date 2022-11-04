package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class h extends RecyclerView.g<l> implements Preference.c {

    /* renamed from: c */
    private PreferenceGroup f1456c;

    /* renamed from: h */
    private Runnable f1461h = new a();

    /* renamed from: g */
    private Handler f1460g = new Handler();

    /* renamed from: d */
    private List<Preference> f1457d = new ArrayList();

    /* renamed from: e */
    private List<Preference> f1458e = new ArrayList();

    /* renamed from: f */
    private List<d> f1459f = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            h.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.M();
        }
    }

    /* loaded from: classes.dex */
    public class b extends f.b {

        /* renamed from: a */
        final /* synthetic */ List f1463a;

        /* renamed from: b */
        final /* synthetic */ List f1464b;

        /* renamed from: c */
        final /* synthetic */ j.d f1465c;

        b(h hVar, List list, List list2, j.d dVar) {
            this.f1463a = list;
            this.f1464b = list2;
        }

        @Override // androidx.recyclerview.widget.f.b
        public boolean a(int i, int i2) {
            return this.f1465c.a((Preference) this.f1463a.get(i), (Preference) this.f1464b.get(i2));
        }

        @Override // androidx.recyclerview.widget.f.b
        public boolean b(int i, int i2) {
            return this.f1465c.b((Preference) this.f1463a.get(i), (Preference) this.f1464b.get(i2));
        }

        @Override // androidx.recyclerview.widget.f.b
        public int d() {
            return this.f1464b.size();
        }

        @Override // androidx.recyclerview.widget.f.b
        public int e() {
            return this.f1463a.size();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Preference.e {

        /* renamed from: a */
        final /* synthetic */ PreferenceGroup f1466a;

        c(PreferenceGroup preferenceGroup) {
            h.this = r1;
            this.f1466a = preferenceGroup;
        }

        @Override // androidx.preference.Preference.e
        public boolean a(Preference preference) {
            this.f1466a.P0(Integer.MAX_VALUE);
            h.this.b(preference);
            PreferenceGroup.a K0 = this.f1466a.K0();
            if (K0 != null) {
                K0.a();
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        int f1468a;

        /* renamed from: b */
        int f1469b;

        /* renamed from: c */
        String f1470c;

        d(Preference preference) {
            this.f1470c = preference.getClass().getName();
            this.f1468a = preference.q();
            this.f1469b = preference.E();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f1468a == dVar.f1468a && this.f1469b == dVar.f1469b && TextUtils.equals(this.f1470c, dVar.f1470c);
        }

        public int hashCode() {
            return ((((527 + this.f1468a) * 31) + this.f1469b) * 31) + this.f1470c.hashCode();
        }
    }

    public h(PreferenceGroup preferenceGroup) {
        this.f1456c = preferenceGroup;
        this.f1456c.s0(this);
        PreferenceGroup preferenceGroup2 = this.f1456c;
        D(preferenceGroup2 instanceof PreferenceScreen ? ((PreferenceScreen) preferenceGroup2).S0() : true);
        M();
    }

    private androidx.preference.b F(PreferenceGroup preferenceGroup, List<Preference> list) {
        androidx.preference.b bVar = new androidx.preference.b(preferenceGroup.i(), list, preferenceGroup.n());
        bVar.u0(new c(preferenceGroup));
        return bVar;
    }

    private List<Preference> G(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int M0 = preferenceGroup.M0();
        int i = 0;
        for (int i2 = 0; i2 < M0; i2++) {
            Preference L0 = preferenceGroup.L0(i2);
            if (L0.K()) {
                if (!J(preferenceGroup) || i < preferenceGroup.J0()) {
                    arrayList.add(L0);
                } else {
                    arrayList2.add(L0);
                }
                if (!(L0 instanceof PreferenceGroup)) {
                    i++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) L0;
                    if (!preferenceGroup2.N0()) {
                        continue;
                    } else if (J(preferenceGroup) && J(preferenceGroup2)) {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    } else {
                        for (Preference preference : G(preferenceGroup2)) {
                            if (!J(preferenceGroup) || i < preferenceGroup.J0()) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                }
            }
        }
        if (J(preferenceGroup) && i > preferenceGroup.J0()) {
            arrayList.add(F(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    private void H(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.R0();
        int M0 = preferenceGroup.M0();
        for (int i = 0; i < M0; i++) {
            Preference L0 = preferenceGroup.L0(i);
            list.add(L0);
            d dVar = new d(L0);
            if (!this.f1459f.contains(dVar)) {
                this.f1459f.add(dVar);
            }
            if (L0 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) L0;
                if (preferenceGroup2.N0()) {
                    H(list, preferenceGroup2);
                }
            }
            L0.s0(this);
        }
    }

    private boolean J(PreferenceGroup preferenceGroup) {
        return preferenceGroup.J0() != Integer.MAX_VALUE;
    }

    public Preference I(int i) {
        if (i < 0 || i >= f()) {
            return null;
        }
        return this.f1458e.get(i);
    }

    /* renamed from: K */
    public void u(l lVar, int i) {
        I(i).R(lVar);
    }

    /* renamed from: L */
    public l w(ViewGroup viewGroup, int i) {
        d dVar = this.f1459f.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, t.f1492a);
        Drawable drawable = obtainStyledAttributes.getDrawable(t.f1493b);
        if (drawable == null) {
            drawable = b.a.k.a.a.d(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(dVar.f1468a, viewGroup, false);
        if (inflate.getBackground() == null) {
            b.g.l.t.l0(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = dVar.f1469b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new l(inflate);
    }

    void M() {
        for (Preference preference : this.f1457d) {
            preference.s0(null);
        }
        ArrayList arrayList = new ArrayList(this.f1457d.size());
        this.f1457d = arrayList;
        H(arrayList, this.f1456c);
        List<Preference> list = this.f1458e;
        List<Preference> G = G(this.f1456c);
        this.f1458e = G;
        j z = this.f1456c.z();
        if (z == null || z.i() == null) {
            k();
        } else {
            androidx.recyclerview.widget.f.a(new b(this, list, G, z.i())).e(this);
        }
        for (Preference preference2 : this.f1457d) {
            preference2.c();
        }
    }

    @Override // androidx.preference.Preference.c
    public void a(Preference preference) {
        b(preference);
    }

    @Override // androidx.preference.Preference.c
    public void b(Preference preference) {
        this.f1460g.removeCallbacks(this.f1461h);
        this.f1460g.post(this.f1461h);
    }

    @Override // androidx.preference.Preference.c
    public void c(Preference preference) {
        int indexOf = this.f1458e.indexOf(preference);
        if (indexOf != -1) {
            m(indexOf, preference);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int f() {
        return this.f1458e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long g(int i) {
        if (!j()) {
            return -1L;
        }
        return I(i).n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int h(int i) {
        d dVar = new d(I(i));
        int indexOf = this.f1459f.indexOf(dVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f1459f.size();
        this.f1459f.add(dVar);
        return size;
    }
}
