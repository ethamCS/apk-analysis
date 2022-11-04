package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    private Context f1479a;

    /* renamed from: c */
    private SharedPreferences f1481c;

    /* renamed from: d */
    private e f1482d;

    /* renamed from: e */
    private SharedPreferences.Editor f1483e;

    /* renamed from: f */
    private boolean f1484f;

    /* renamed from: g */
    private String f1485g;

    /* renamed from: h */
    private int f1486h;
    private PreferenceScreen j;
    private d k;
    private c l;
    private a m;
    private b n;

    /* renamed from: b */
    private long f1480b = 0;
    private int i = 0;

    /* loaded from: classes.dex */
    public interface a {
        void b(Preference preference);
    }

    /* loaded from: classes.dex */
    public interface b {
        void e(PreferenceScreen preferenceScreen);
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean f(Preference preference);
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public abstract boolean a(Preference preference, Preference preference2);

        public abstract boolean b(Preference preference, Preference preference2);
    }

    public j(Context context) {
        this.f1479a = context;
        s(d(context));
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences(d(context), c());
    }

    private static int c() {
        return 0;
    }

    private static String d(Context context) {
        return context.getPackageName() + "_preferences";
    }

    private void n(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.f1483e) != null) {
            editor.apply();
        }
        this.f1484f = z;
    }

    public <T extends Preference> T a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.j;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.I0(charSequence);
    }

    public SharedPreferences.Editor e() {
        if (this.f1482d != null) {
            return null;
        }
        if (!this.f1484f) {
            return l().edit();
        }
        if (this.f1483e == null) {
            this.f1483e = l().edit();
        }
        return this.f1483e;
    }

    public long f() {
        long j;
        synchronized (this) {
            j = this.f1480b;
            this.f1480b = 1 + j;
        }
        return j;
    }

    public b g() {
        return this.n;
    }

    public c h() {
        return this.l;
    }

    public d i() {
        return this.k;
    }

    public e j() {
        return this.f1482d;
    }

    public PreferenceScreen k() {
        return this.j;
    }

    public SharedPreferences l() {
        if (j() != null) {
            return null;
        }
        if (this.f1481c == null) {
            this.f1481c = (this.i != 1 ? this.f1479a : b.g.d.a.a(this.f1479a)).getSharedPreferences(this.f1485g, this.f1486h);
        }
        return this.f1481c;
    }

    public PreferenceScreen m(Context context, int i, PreferenceScreen preferenceScreen) {
        n(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new i(context, this).d(i, preferenceScreen);
        preferenceScreen2.P(this);
        n(false);
        return preferenceScreen2;
    }

    public void o(a aVar) {
        this.m = aVar;
    }

    public void p(b bVar) {
        this.n = bVar;
    }

    public void q(c cVar) {
        this.l = cVar;
    }

    public boolean r(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.j;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.U();
            }
            this.j = preferenceScreen;
            return true;
        }
        return false;
    }

    public void s(String str) {
        this.f1485g = str;
        this.f1481c = null;
    }

    public boolean t() {
        return !this.f1484f;
    }

    public void u(Preference preference) {
        a aVar = this.m;
        if (aVar != null) {
            aVar.b(preference);
        }
    }
}
