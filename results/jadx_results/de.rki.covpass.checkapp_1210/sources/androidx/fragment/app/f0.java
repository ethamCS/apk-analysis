package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.m;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a */
    private final n f4071a;

    /* renamed from: b */
    private final ClassLoader f4072b;

    /* renamed from: d */
    int f4074d;

    /* renamed from: e */
    int f4075e;

    /* renamed from: f */
    int f4076f;

    /* renamed from: g */
    int f4077g;

    /* renamed from: h */
    int f4078h;

    /* renamed from: i */
    boolean f4079i;

    /* renamed from: k */
    String f4081k;

    /* renamed from: l */
    int f4082l;

    /* renamed from: m */
    CharSequence f4083m;

    /* renamed from: n */
    int f4084n;

    /* renamed from: o */
    CharSequence f4085o;

    /* renamed from: p */
    ArrayList<String> f4086p;

    /* renamed from: q */
    ArrayList<String> f4087q;

    /* renamed from: s */
    ArrayList<Runnable> f4089s;

    /* renamed from: c */
    ArrayList<a> f4073c = new ArrayList<>();

    /* renamed from: j */
    boolean f4080j = true;

    /* renamed from: r */
    boolean f4088r = false;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        int f4090a;

        /* renamed from: b */
        Fragment f4091b;

        /* renamed from: c */
        boolean f4092c;

        /* renamed from: d */
        int f4093d;

        /* renamed from: e */
        int f4094e;

        /* renamed from: f */
        int f4095f;

        /* renamed from: g */
        int f4096g;

        /* renamed from: h */
        m.c f4097h;

        /* renamed from: i */
        m.c f4098i;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f4090a = i10;
            this.f4091b = fragment;
            this.f4092c = false;
            m.c cVar = m.c.RESUMED;
            this.f4097h = cVar;
            this.f4098i = cVar;
        }

        a(int i10, Fragment fragment, m.c cVar) {
            this.f4090a = i10;
            this.f4091b = fragment;
            this.f4092c = false;
            this.f4097h = fragment.G4;
            this.f4098i = cVar;
        }

        public a(int i10, Fragment fragment, boolean z10) {
            this.f4090a = i10;
            this.f4091b = fragment;
            this.f4092c = z10;
            m.c cVar = m.c.RESUMED;
            this.f4097h = cVar;
            this.f4098i = cVar;
        }
    }

    public f0(n nVar, ClassLoader classLoader) {
        this.f4071a = nVar;
        this.f4072b = classLoader;
    }

    public f0 b(int i10, Fragment fragment) {
        m(i10, fragment, null, 1);
        return this;
    }

    public f0 c(int i10, Fragment fragment, String str) {
        m(i10, fragment, str, 1);
        return this;
    }

    public f0 d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f3926w4 = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    public f0 e(Fragment fragment, String str) {
        m(0, fragment, str, 1);
        return this;
    }

    public void f(a aVar) {
        this.f4073c.add(aVar);
        aVar.f4093d = this.f4074d;
        aVar.f4094e = this.f4075e;
        aVar.f4095f = this.f4076f;
        aVar.f4096g = this.f4077g;
    }

    public f0 g(String str) {
        if (this.f4080j) {
            this.f4079i = true;
            this.f4081k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public abstract void k();

    public f0 l() {
        if (!this.f4079i) {
            this.f4080j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void m(int i10, Fragment fragment, String str, int i11) {
        String str2 = fragment.F4;
        if (str2 != null) {
            b1.d.h(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.f3917o4;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f3917o4 + " now " + str);
            }
            fragment.f3917o4 = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.f3915m4;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f3915m4 + " now " + i10);
            }
            fragment.f3915m4 = i10;
            fragment.f3916n4 = i10;
        }
        f(new a(i11, fragment));
    }

    public f0 n(Fragment fragment) {
        f(new a(4, fragment));
        return this;
    }

    public abstract boolean o();

    public f0 p(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public f0 q(int i10, Fragment fragment) {
        return r(i10, fragment, null);
    }

    public f0 r(int i10, Fragment fragment, String str) {
        if (i10 != 0) {
            m(i10, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public f0 s(Fragment fragment, m.c cVar) {
        f(new a(10, fragment, cVar));
        return this;
    }

    public f0 t(boolean z10) {
        this.f4088r = z10;
        return this;
    }

    public f0 u(int i10) {
        this.f4078h = i10;
        return this;
    }
}
