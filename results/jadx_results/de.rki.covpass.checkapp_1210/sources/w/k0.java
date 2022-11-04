package w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import w.o0;
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: h */
    public static final o0.a<Integer> f24491h = o0.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* renamed from: i */
    public static final o0.a<Integer> f24492i = o0.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* renamed from: a */
    final List<r0> f24493a;

    /* renamed from: b */
    final o0 f24494b;

    /* renamed from: c */
    final int f24495c;

    /* renamed from: d */
    final List<h> f24496d;

    /* renamed from: e */
    private final boolean f24497e;

    /* renamed from: f */
    private final j2 f24498f;

    /* renamed from: g */
    private final q f24499g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Set<r0> f24500a;

        /* renamed from: b */
        private p1 f24501b;

        /* renamed from: c */
        private int f24502c;

        /* renamed from: d */
        private List<h> f24503d;

        /* renamed from: e */
        private boolean f24504e;

        /* renamed from: f */
        private r1 f24505f;

        /* renamed from: g */
        private q f24506g;

        public a() {
            this.f24500a = new HashSet();
            this.f24501b = q1.L();
            this.f24502c = -1;
            this.f24503d = new ArrayList();
            this.f24504e = false;
            this.f24505f = r1.f();
        }

        private a(k0 k0Var) {
            HashSet hashSet = new HashSet();
            this.f24500a = hashSet;
            this.f24501b = q1.L();
            this.f24502c = -1;
            this.f24503d = new ArrayList();
            this.f24504e = false;
            this.f24505f = r1.f();
            hashSet.addAll(k0Var.f24493a);
            this.f24501b = q1.M(k0Var.f24494b);
            this.f24502c = k0Var.f24495c;
            this.f24503d.addAll(k0Var.b());
            this.f24504e = k0Var.h();
            this.f24505f = r1.g(k0Var.f());
        }

        public static a j(o2<?> o2Var) {
            b j10 = o2Var.j(null);
            if (j10 != null) {
                a aVar = new a();
                j10.a(o2Var, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + o2Var.B(o2Var.toString()));
        }

        public static a k(k0 k0Var) {
            return new a(k0Var);
        }

        public void a(Collection<h> collection) {
            for (h hVar : collection) {
                c(hVar);
            }
        }

        public void b(j2 j2Var) {
            this.f24505f.e(j2Var);
        }

        public void c(h hVar) {
            if (this.f24503d.contains(hVar)) {
                return;
            }
            this.f24503d.add(hVar);
        }

        public <T> void d(o0.a<T> aVar, T t10) {
            this.f24501b.g(aVar, t10);
        }

        public void e(o0 o0Var) {
            for (o0.a<?> aVar : o0Var.c()) {
                Object a10 = this.f24501b.a(aVar, null);
                Object b10 = o0Var.b(aVar);
                if (a10 instanceof o1) {
                    ((o1) a10).a(((o1) b10).c());
                } else {
                    if (b10 instanceof o1) {
                        b10 = ((o1) b10).clone();
                    }
                    this.f24501b.G(aVar, o0Var.d(aVar), b10);
                }
            }
        }

        public void f(r0 r0Var) {
            this.f24500a.add(r0Var);
        }

        public void g(String str, Object obj) {
            this.f24505f.h(str, obj);
        }

        public k0 h() {
            return new k0(new ArrayList(this.f24500a), u1.J(this.f24501b), this.f24502c, this.f24503d, this.f24504e, j2.b(this.f24505f), this.f24506g);
        }

        public void i() {
            this.f24500a.clear();
        }

        public Set<r0> l() {
            return this.f24500a;
        }

        public int m() {
            return this.f24502c;
        }

        public void n(q qVar) {
            this.f24506g = qVar;
        }

        public void o(o0 o0Var) {
            this.f24501b = q1.M(o0Var);
        }

        public void p(int i10) {
            this.f24502c = i10;
        }

        public void q(boolean z10) {
            this.f24504e = z10;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(o2<?> o2Var, a aVar);
    }

    k0(List<r0> list, o0 o0Var, int i10, List<h> list2, boolean z10, j2 j2Var, q qVar) {
        this.f24493a = list;
        this.f24494b = o0Var;
        this.f24495c = i10;
        this.f24496d = Collections.unmodifiableList(list2);
        this.f24497e = z10;
        this.f24498f = j2Var;
        this.f24499g = qVar;
    }

    public static k0 a() {
        return new a().h();
    }

    public List<h> b() {
        return this.f24496d;
    }

    public q c() {
        return this.f24499g;
    }

    public o0 d() {
        return this.f24494b;
    }

    public List<r0> e() {
        return Collections.unmodifiableList(this.f24493a);
    }

    public j2 f() {
        return this.f24498f;
    }

    public int g() {
        return this.f24495c;
    }

    public boolean h() {
        return this.f24497e;
    }
}
