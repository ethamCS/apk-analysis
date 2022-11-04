package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.navigation.l;
import androidx.navigation.r;
import androidx.navigation.u;
@u.b("dialog")
/* loaded from: classes.dex */
public final class DialogFragmentNavigator extends u<a> {

    /* renamed from: a */
    private final Context f1305a;

    /* renamed from: b */
    private final m f1306b;

    /* renamed from: c */
    private int f1307c = 0;

    /* renamed from: d */
    private g f1308d = new g(this) { // from class: androidx.navigation.fragment.DialogFragmentNavigator.1
        @Override // androidx.lifecycle.g
        public void d(i iVar, e.a aVar) {
            if (aVar == e.a.ON_STOP) {
                androidx.fragment.app.c cVar = (androidx.fragment.app.c) iVar;
                if (cVar.G1().isShowing()) {
                    return;
                }
                NavHostFragment.A1(cVar).u();
            }
        }
    };

    /* loaded from: classes.dex */
    public static class a extends l implements androidx.navigation.c {
        private String j;

        public a(u<? extends a> uVar) {
            super(uVar);
        }

        @Override // androidx.navigation.l
        public void n(Context context, AttributeSet attributeSet) {
            super.n(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, c.f1314a);
            String string = obtainAttributes.getString(c.f1315b);
            if (string != null) {
                u(string);
            }
            obtainAttributes.recycle();
        }

        public final String t() {
            String str = this.j;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }

        public final a u(String str) {
            this.j = str;
            return this;
        }
    }

    public DialogFragmentNavigator(Context context, m mVar) {
        this.f1305a = context;
        this.f1306b = mVar;
    }

    @Override // androidx.navigation.u
    public void c(Bundle bundle) {
        if (bundle != null) {
            this.f1307c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
            for (int i = 0; i < this.f1307c; i++) {
                m mVar = this.f1306b;
                androidx.fragment.app.c cVar = (androidx.fragment.app.c) mVar.X("androidx-nav-fragment:navigator:dialog:" + i);
                if (cVar == null) {
                    throw new IllegalStateException("DialogFragment " + i + " doesn't exist in the FragmentManager");
                }
                cVar.a().a(this.f1308d);
            }
        }
    }

    @Override // androidx.navigation.u
    public Bundle d() {
        if (this.f1307c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f1307c);
        return bundle;
    }

    @Override // androidx.navigation.u
    public boolean e() {
        if (this.f1307c == 0) {
            return false;
        }
        if (this.f1306b.t0()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        m mVar = this.f1306b;
        StringBuilder sb = new StringBuilder();
        sb.append("androidx-nav-fragment:navigator:dialog:");
        int i = this.f1307c - 1;
        this.f1307c = i;
        sb.append(i);
        Fragment X = mVar.X(sb.toString());
        if (X != null) {
            X.a().c(this.f1308d);
            ((androidx.fragment.app.c) X).B1();
        }
        return true;
    }

    /* renamed from: f */
    public a a() {
        return new a(this);
    }

    /* renamed from: g */
    public l b(a aVar, Bundle bundle, r rVar, u.a aVar2) {
        if (this.f1306b.t0()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String t = aVar.t();
        if (t.charAt(0) == '.') {
            t = this.f1305a.getPackageName() + t;
        }
        Fragment a2 = this.f1306b.e0().a(this.f1305a.getClassLoader(), t);
        if (!androidx.fragment.app.c.class.isAssignableFrom(a2.getClass())) {
            throw new IllegalArgumentException("Dialog destination " + aVar.t() + " is not an instance of DialogFragment");
        }
        androidx.fragment.app.c cVar = (androidx.fragment.app.c) a2;
        cVar.o1(bundle);
        cVar.a().a(this.f1308d);
        m mVar = this.f1306b;
        StringBuilder sb = new StringBuilder();
        sb.append("androidx-nav-fragment:navigator:dialog:");
        int i = this.f1307c;
        this.f1307c = i + 1;
        sb.append(i);
        cVar.I1(mVar, sb.toString());
        return aVar;
    }
}
