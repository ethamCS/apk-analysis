package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.preference.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private int I;
    private c J;
    private List<Preference> K;
    private PreferenceGroup L;
    private boolean M;
    private f N;
    private g O;
    private final View.OnClickListener P;

    /* renamed from: b */
    private Context f1430b;

    /* renamed from: c */
    private j f1431c;

    /* renamed from: d */
    private androidx.preference.e f1432d;

    /* renamed from: e */
    private long f1433e;

    /* renamed from: f */
    private boolean f1434f;

    /* renamed from: g */
    private d f1435g;

    /* renamed from: h */
    private e f1436h;
    private int i;
    private int j;
    private CharSequence k;
    private CharSequence l;
    private int m;
    private Drawable n;
    private String o;
    private Intent p;
    private String q;
    private Bundle r;
    private boolean s;
    private boolean t;
    private boolean u;
    private String v;
    private Object w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        a() {
            Preference.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.d0(view);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AbsSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            /* renamed from: b */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(Preference preference);

        void b(Preference preference);

        void c(Preference preference);
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(Preference preference, Object obj);
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a(Preference preference);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: b */
        private final Preference f1438b;

        f(Preference preference) {
            this.f1438b = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence B = this.f1438b.B();
            if (!this.f1438b.G() || TextUtils.isEmpty(B)) {
                return;
            }
            contextMenu.setHeaderTitle(B);
            contextMenu.add(0, 0, 0, r.a_res_0x7f10002b).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            CharSequence B = this.f1438b.B();
            ((ClipboardManager) this.f1438b.i().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", B));
            Toast.makeText(this.f1438b.i(), this.f1438b.i().getString(r.d_res_0x7f1000c6, B), 0).show();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface g<T extends Preference> {
        CharSequence a(T t);
    }

    public Preference(Context context) {
        this(context, null);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.g.d.c.g.a(context, m.i_res_0x7f040297, 16842894));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00d4, code lost:
        if (r6.hasValue(r7) != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Preference(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    private void D0(SharedPreferences.Editor editor) {
        if (this.f1431c.t()) {
            editor.apply();
        }
    }

    private void E0() {
        Preference h2;
        String str = this.v;
        if (str == null || (h2 = h(str)) == null) {
            return;
        }
        h2.F0(this);
    }

    private void F0(Preference preference) {
        List<Preference> list = this.K;
        if (list != null) {
            list.remove(preference);
        }
    }

    private void g() {
        Object obj;
        boolean z = true;
        if (y() != null) {
            b0(true, this.w);
            return;
        }
        if (!C0() || !A().contains(this.o)) {
            obj = this.w;
            if (obj == null) {
                return;
            }
            z = false;
        } else {
            obj = null;
        }
        b0(z, obj);
    }

    private void j0() {
        if (TextUtils.isEmpty(this.v)) {
            return;
        }
        Preference h2 = h(this.v);
        if (h2 != null) {
            h2.k0(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.v + "\" not found for preference \"" + this.o + "\" (title: \"" + ((Object) this.k) + "\"");
    }

    private void k0(Preference preference) {
        if (this.K == null) {
            this.K = new ArrayList();
        }
        this.K.add(preference);
        preference.T(this, B0());
    }

    private void n0(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                n0(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public SharedPreferences A() {
        if (this.f1431c == null || y() != null) {
            return null;
        }
        return this.f1431c.l();
    }

    public final void A0(boolean z) {
        if (this.z != z) {
            this.z = z;
            c cVar = this.J;
            if (cVar == null) {
                return;
            }
            cVar.a(this);
        }
    }

    public CharSequence B() {
        return C() != null ? C().a(this) : this.l;
    }

    public boolean B0() {
        return !H();
    }

    public final g C() {
        return this.O;
    }

    protected boolean C0() {
        return this.f1431c != null && I() && F();
    }

    public CharSequence D() {
        return this.k;
    }

    public final int E() {
        return this.I;
    }

    public boolean F() {
        return !TextUtils.isEmpty(this.o);
    }

    public boolean G() {
        return this.F;
    }

    public boolean H() {
        return this.s && this.x && this.y;
    }

    public boolean I() {
        return this.u;
    }

    public boolean J() {
        return this.t;
    }

    public final boolean K() {
        return this.z;
    }

    public void L() {
        c cVar = this.J;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void M(boolean z) {
        List<Preference> list = this.K;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).T(this, z);
        }
    }

    public void N() {
        c cVar = this.J;
        if (cVar != null) {
            cVar.b(this);
        }
    }

    public void O() {
        j0();
    }

    public void P(j jVar) {
        this.f1431c = jVar;
        if (!this.f1434f) {
            this.f1433e = jVar.f();
        }
        g();
    }

    public void Q(j jVar, long j) {
        this.f1433e = j;
        this.f1434f = true;
        try {
            P(jVar);
        } finally {
            this.f1434f = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void R(androidx.preference.l r9) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.R(androidx.preference.l):void");
    }

    public void S() {
    }

    public void T(Preference preference, boolean z) {
        if (this.x == z) {
            this.x = !z;
            M(B0());
            L();
        }
    }

    public void U() {
        E0();
    }

    protected Object V(TypedArray typedArray, int i) {
        return null;
    }

    @Deprecated
    public void W(b.g.l.c0.c cVar) {
    }

    public void X(Preference preference, boolean z) {
        if (this.y == z) {
            this.y = !z;
            M(B0());
            L();
        }
    }

    public void Y(Parcelable parcelable) {
        this.M = true;
        if (parcelable == AbsSavedState.EMPTY_STATE || parcelable == null) {
            return;
        }
        throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
    }

    public Parcelable Z() {
        this.M = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void a(PreferenceGroup preferenceGroup) {
        if (preferenceGroup == null || this.L == null) {
            this.L = preferenceGroup;
            return;
        }
        throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
    }

    protected void a0(Object obj) {
    }

    public boolean b(Object obj) {
        d dVar = this.f1435g;
        return dVar == null || dVar.a(this, obj);
    }

    @Deprecated
    protected void b0(boolean z, Object obj) {
        a0(obj);
    }

    public final void c() {
    }

    public void c0() {
        j.c h2;
        if (!H() || !J()) {
            return;
        }
        S();
        e eVar = this.f1436h;
        if (eVar != null && eVar.a(this)) {
            return;
        }
        j z = z();
        if ((z != null && (h2 = z.h()) != null && h2.f(this)) || this.p == null) {
            return;
        }
        i().startActivity(this.p);
    }

    /* renamed from: d */
    public int compareTo(Preference preference) {
        int i = this.i;
        int i2 = preference.i;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.k;
        CharSequence charSequence2 = preference.k;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 != null) {
            return charSequence.toString().compareToIgnoreCase(preference.k.toString());
        }
        return -1;
    }

    public void d0(View view) {
        c0();
    }

    public void e(Bundle bundle) {
        Parcelable parcelable;
        if (!F() || (parcelable = bundle.getParcelable(this.o)) == null) {
            return;
        }
        this.M = false;
        Y(parcelable);
        if (!this.M) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public boolean e0(boolean z) {
        if (!C0()) {
            return false;
        }
        if (z == t(!z)) {
            return true;
        }
        androidx.preference.e y = y();
        if (y != null) {
            y.f(this.o, z);
        } else {
            SharedPreferences.Editor e2 = this.f1431c.e();
            e2.putBoolean(this.o, z);
            D0(e2);
        }
        return true;
    }

    public void f(Bundle bundle) {
        if (F()) {
            this.M = false;
            Parcelable Z = Z();
            if (!this.M) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (Z == null) {
                return;
            }
            bundle.putParcelable(this.o, Z);
        }
    }

    public boolean f0(int i) {
        if (!C0()) {
            return false;
        }
        if (i == u(~i)) {
            return true;
        }
        androidx.preference.e y = y();
        if (y != null) {
            y.g(this.o, i);
        } else {
            SharedPreferences.Editor e2 = this.f1431c.e();
            e2.putInt(this.o, i);
            D0(e2);
        }
        return true;
    }

    public boolean g0(long j) {
        if (!C0()) {
            return false;
        }
        if (j == v(~j)) {
            return true;
        }
        androidx.preference.e y = y();
        if (y != null) {
            y.h(this.o, j);
        } else {
            SharedPreferences.Editor e2 = this.f1431c.e();
            e2.putLong(this.o, j);
            D0(e2);
        }
        return true;
    }

    protected <T extends Preference> T h(String str) {
        j jVar = this.f1431c;
        if (jVar == null) {
            return null;
        }
        return (T) jVar.a(str);
    }

    public boolean h0(String str) {
        if (!C0()) {
            return false;
        }
        if (TextUtils.equals(str, w(null))) {
            return true;
        }
        androidx.preference.e y = y();
        if (y != null) {
            y.i(this.o, str);
        } else {
            SharedPreferences.Editor e2 = this.f1431c.e();
            e2.putString(this.o, str);
            D0(e2);
        }
        return true;
    }

    public Context i() {
        return this.f1430b;
    }

    public boolean i0(Set<String> set) {
        if (!C0()) {
            return false;
        }
        if (set.equals(x(null))) {
            return true;
        }
        androidx.preference.e y = y();
        if (y != null) {
            y.j(this.o, set);
        } else {
            SharedPreferences.Editor e2 = this.f1431c.e();
            e2.putStringSet(this.o, set);
            D0(e2);
        }
        return true;
    }

    public Bundle j() {
        if (this.r == null) {
            this.r = new Bundle();
        }
        return this.r;
    }

    StringBuilder k() {
        StringBuilder sb = new StringBuilder();
        CharSequence D = D();
        if (!TextUtils.isEmpty(D)) {
            sb.append(D);
            sb.append(' ');
        }
        CharSequence B = B();
        if (!TextUtils.isEmpty(B)) {
            sb.append(B);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public String l() {
        return this.q;
    }

    public void l0(Bundle bundle) {
        e(bundle);
    }

    public Drawable m() {
        int i;
        if (this.n == null && (i = this.m) != 0) {
            this.n = b.a.k.a.a.d(this.f1430b, i);
        }
        return this.n;
    }

    public void m0(Bundle bundle) {
        f(bundle);
    }

    public long n() {
        return this.f1433e;
    }

    public Intent o() {
        return this.p;
    }

    public void o0(int i) {
        p0(b.a.k.a.a.d(this.f1430b, i));
        this.m = i;
    }

    public String p() {
        return this.o;
    }

    public void p0(Drawable drawable) {
        if (this.n != drawable) {
            this.n = drawable;
            this.m = 0;
            L();
        }
    }

    public final int q() {
        return this.H;
    }

    public void q0(Intent intent) {
        this.p = intent;
    }

    public int r() {
        return this.i;
    }

    public void r0(int i) {
        this.H = i;
    }

    public PreferenceGroup s() {
        return this.L;
    }

    public final void s0(c cVar) {
        this.J = cVar;
    }

    public boolean t(boolean z) {
        if (!C0()) {
            return z;
        }
        androidx.preference.e y = y();
        return y != null ? y.a(this.o, z) : this.f1431c.l().getBoolean(this.o, z);
    }

    public void t0(d dVar) {
        this.f1435g = dVar;
    }

    public String toString() {
        return k().toString();
    }

    public int u(int i) {
        if (!C0()) {
            return i;
        }
        androidx.preference.e y = y();
        return y != null ? y.b(this.o, i) : this.f1431c.l().getInt(this.o, i);
    }

    public void u0(e eVar) {
        this.f1436h = eVar;
    }

    public long v(long j) {
        if (!C0()) {
            return j;
        }
        androidx.preference.e y = y();
        return y != null ? y.c(this.o, j) : this.f1431c.l().getLong(this.o, j);
    }

    public void v0(int i) {
        if (i != this.i) {
            this.i = i;
            N();
        }
    }

    public String w(String str) {
        if (!C0()) {
            return str;
        }
        androidx.preference.e y = y();
        return y != null ? y.d(this.o, str) : this.f1431c.l().getString(this.o, str);
    }

    public void w0(CharSequence charSequence) {
        if (C() == null) {
            if (TextUtils.equals(this.l, charSequence)) {
                return;
            }
            this.l = charSequence;
            L();
            return;
        }
        throw new IllegalStateException("Preference already has a SummaryProvider set.");
    }

    public Set<String> x(Set<String> set) {
        if (!C0()) {
            return set;
        }
        androidx.preference.e y = y();
        return y != null ? y.e(this.o, set) : this.f1431c.l().getStringSet(this.o, set);
    }

    public final void x0(g gVar) {
        this.O = gVar;
        L();
    }

    public androidx.preference.e y() {
        androidx.preference.e eVar = this.f1432d;
        if (eVar != null) {
            return eVar;
        }
        j jVar = this.f1431c;
        if (jVar == null) {
            return null;
        }
        return jVar.j();
    }

    public void y0(int i) {
        z0(this.f1430b.getString(i));
    }

    public j z() {
        return this.f1431c;
    }

    public void z0(CharSequence charSequence) {
        if ((charSequence != null || this.k == null) && (charSequence == null || charSequence.equals(this.k))) {
            return;
        }
        this.k = charSequence;
        L();
    }
}
