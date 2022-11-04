package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.e;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: b */
    int f1122b;

    /* renamed from: c */
    int f1123c;

    /* renamed from: d */
    int f1124d;

    /* renamed from: e */
    int f1125e;

    /* renamed from: f */
    int f1126f;

    /* renamed from: g */
    boolean f1127g;
    String i;
    int j;
    CharSequence k;
    int l;
    CharSequence m;
    ArrayList<String> n;
    ArrayList<String> o;
    ArrayList<Runnable> q;

    /* renamed from: a */
    ArrayList<a> f1121a = new ArrayList<>();

    /* renamed from: h */
    boolean f1128h = true;
    boolean p = false;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        int f1129a;

        /* renamed from: b */
        Fragment f1130b;

        /* renamed from: c */
        int f1131c;

        /* renamed from: d */
        int f1132d;

        /* renamed from: e */
        int f1133e;

        /* renamed from: f */
        int f1134f;

        /* renamed from: g */
        e.b f1135g;

        /* renamed from: h */
        e.b f1136h;

        public a() {
        }

        public a(int i, Fragment fragment) {
            this.f1129a = i;
            this.f1130b = fragment;
            e.b bVar = e.b.RESUMED;
            this.f1135g = bVar;
            this.f1136h = bVar;
        }
    }

    public t(i iVar, ClassLoader classLoader) {
    }

    public t b(int i, Fragment fragment, String str) {
        m(i, fragment, str, 1);
        return this;
    }

    public t c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.G = viewGroup;
        b(viewGroup.getId(), fragment, str);
        return this;
    }

    public t d(Fragment fragment, String str) {
        m(0, fragment, str, 1);
        return this;
    }

    public void e(a aVar) {
        this.f1121a.add(aVar);
        aVar.f1131c = this.f1122b;
        aVar.f1132d = this.f1123c;
        aVar.f1133e = this.f1124d;
        aVar.f1134f = this.f1125e;
    }

    public t f(View view, String str) {
        if (u.D()) {
            String G = b.g.l.t.G(view);
            if (G == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.n == null) {
                this.n = new ArrayList<>();
                this.o = new ArrayList<>();
            } else if (this.o.contains(str)) {
                throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
            } else if (this.n.contains(G)) {
                throw new IllegalArgumentException("A shared element with the source name '" + G + "' has already been added to the transaction.");
            }
            this.n.add(G);
            this.o.add(str);
        }
        return this;
    }

    public t g(String str) {
        if (this.f1128h) {
            this.f1127g = true;
            this.i = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public abstract void k();

    public t l() {
        if (!this.f1127g) {
            this.f1128h = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void m(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.y;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.y + " now " + str);
            }
            fragment.y = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.w;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.w + " now " + i);
            }
            fragment.w = i;
            fragment.x = i;
        }
        e(new a(i2, fragment));
    }

    public t n(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public t o(int i, Fragment fragment) {
        p(i, fragment, null);
        return this;
    }

    public t p(int i, Fragment fragment, String str) {
        if (i != 0) {
            m(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public t q(int i, int i2, int i3, int i4) {
        this.f1122b = i;
        this.f1123c = i2;
        this.f1124d = i3;
        this.f1125e = i4;
        return this;
    }

    public t r(Fragment fragment) {
        e(new a(8, fragment));
        return this;
    }

    public t s(boolean z) {
        this.p = z;
        return this;
    }
}
