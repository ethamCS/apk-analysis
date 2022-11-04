package b1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import b1.d;
import hc.t;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import ub.c0;
import ub.q0;
import ub.y0;
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u001e\u001f\u0005B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001a\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J0\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00042\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00132\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0013H\u0002J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¨\u0006 "}, d2 = {"Lb1/d;", BuildConfig.FLAVOR, "Landroidx/fragment/app/Fragment;", "fragment", "Lb1/d$c;", "c", BuildConfig.FLAVOR, "previousFragmentId", "Ltb/e0;", "h", "Landroid/view/ViewGroup;", "container", "i", "j", "k", "Lb1/h;", "violation", "g", "policy", "Ljava/lang/Class;", "fragmentClass", "violationClass", BuildConfig.FLAVOR, "m", "d", "Ljava/lang/Runnable;", "runnable", "l", "<init>", "()V", "a", "b", "fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final d f5431a = new d();

    /* renamed from: b */
    private static c f5432b = c.f5438d;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lb1/d$a;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lb1/d$b;", BuildConfig.FLAVOR, "Lb1/h;", "violation", "Ltb/e0;", "a", "fragment_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public interface b {
        void a(h hVar);
    }

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006BC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012 \u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u00150\r¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR4\u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lb1/d$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lb1/d$a;", "flags", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "Lb1/d$b;", "listener", "Lb1/d$b;", "b", "()Lb1/d$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Ljava/lang/Class;", "Lb1/h;", "mAllowedViolations", "Ljava/util/Map;", "c", "()Ljava/util/Map;", BuildConfig.FLAVOR, "allowedViolations", "<init>", "(Ljava/util/Set;Lb1/d$b;Ljava/util/Map;)V", "fragment_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c {
        public static final a Companion = new a(null);

        /* renamed from: d */
        public static final c f5438d;

        /* renamed from: a */
        private final Set<a> f5439a;

        /* renamed from: b */
        private final b f5440b;

        /* renamed from: c */
        private final Map<String, Set<Class<? extends h>>> f5441c;

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lb1/d$c$a;", BuildConfig.FLAVOR, "Lb1/d$c;", "LAX", "Lb1/d$c;", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            Set b10;
            Map h10;
            b10 = y0.b();
            h10 = q0.h();
            f5438d = new c(b10, null, h10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Set<? extends a> set, b bVar, Map<String, ? extends Set<Class<? extends h>>> map) {
            t.e(set, "flags");
            t.e(map, "allowedViolations");
            this.f5439a = set;
            this.f5440b = bVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends h>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f5441c = linkedHashMap;
        }

        public final Set<a> a() {
            return this.f5439a;
        }

        public final b b() {
            return this.f5440b;
        }

        public final Map<String, Set<Class<? extends h>>> c() {
            return this.f5441c;
        }
    }

    private d() {
    }

    private final c c(Fragment fragment) {
        while (fragment != null) {
            if (fragment.C0()) {
                w i02 = fragment.i0();
                t.d(i02, "declaringFragment.parentFragmentManager");
                if (i02.E0() != null) {
                    c E0 = i02.E0();
                    t.b(E0);
                    return E0;
                }
            }
            fragment = fragment.h0();
        }
        return f5432b;
    }

    private final void d(final c cVar, final h hVar) {
        Fragment b10 = hVar.b();
        final String name = b10.getClass().getName();
        if (cVar.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, hVar);
        }
        if (cVar.b() != null) {
            l(b10, new Runnable() { // from class: b1.b
                @Override // java.lang.Runnable
                public final void run() {
                    d.e(d.c.this, hVar);
                }
            });
        }
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            l(b10, new Runnable() { // from class: b1.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.f(name, hVar);
                }
            });
        }
    }

    public static final void e(c cVar, h hVar) {
        t.e(cVar, "$policy");
        t.e(hVar, "$violation");
        cVar.b().a(hVar);
    }

    public static final void f(String str, h hVar) {
        t.e(hVar, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, hVar);
        throw hVar;
    }

    private final void g(h hVar) {
        if (w.L0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + hVar.b().getClass().getName(), hVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fc.c
    public static final void h(Fragment fragment, String str) {
        t.e(fragment, "fragment");
        t.e(str, "previousFragmentId");
        b1.a aVar = new b1.a(fragment, str);
        d dVar = f5431a;
        dVar.g(aVar);
        c c10 = dVar.c(fragment);
        if (!c10.a().contains(a.DETECT_FRAGMENT_REUSE) || !dVar.m(c10, fragment.getClass(), aVar.getClass())) {
            return;
        }
        dVar.d(c10, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fc.c
    public static final void i(Fragment fragment, ViewGroup viewGroup) {
        t.e(fragment, "fragment");
        e eVar = new e(fragment, viewGroup);
        d dVar = f5431a;
        dVar.g(eVar);
        c c10 = dVar.c(fragment);
        if (!c10.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) || !dVar.m(c10, fragment.getClass(), eVar.getClass())) {
            return;
        }
        dVar.d(c10, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fc.c
    public static final void j(Fragment fragment) {
        t.e(fragment, "fragment");
        f fVar = new f(fragment);
        d dVar = f5431a;
        dVar.g(fVar);
        c c10 = dVar.c(fragment);
        if (!c10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) || !dVar.m(c10, fragment.getClass(), fVar.getClass())) {
            return;
        }
        dVar.d(c10, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fc.c
    public static final void k(Fragment fragment, ViewGroup viewGroup) {
        t.e(fragment, "fragment");
        t.e(viewGroup, "container");
        i iVar = new i(fragment, viewGroup);
        d dVar = f5431a;
        dVar.g(iVar);
        c c10 = dVar.c(fragment);
        if (!c10.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) || !dVar.m(c10, fragment.getClass(), iVar.getClass())) {
            return;
        }
        dVar.d(c10, iVar);
    }

    private final void l(Fragment fragment, Runnable runnable) {
        if (fragment.C0()) {
            Handler k10 = fragment.i0().y0().k();
            t.d(k10, "fragment.parentFragmentManager.host.handler");
            if (!t.a(k10.getLooper(), Looper.myLooper())) {
                k10.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    private final boolean m(c cVar, Class<? extends Fragment> cls, Class<? extends h> cls2) {
        boolean N;
        Set<Class<? extends h>> set = cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!t.a(cls2.getSuperclass(), h.class)) {
            N = c0.N(set, cls2.getSuperclass());
            if (N) {
                return false;
            }
        }
        return !set.contains(cls2);
    }
}
