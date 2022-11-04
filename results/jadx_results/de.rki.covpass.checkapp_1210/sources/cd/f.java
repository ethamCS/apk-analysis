package cd;

import bf.x;
import hc.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pd.q;
/* loaded from: classes.dex */
public final class f implements q {

    /* renamed from: c */
    public static final a f6434c = new a(null);

    /* renamed from: a */
    private final Class<?> f6435a;

    /* renamed from: b */
    private final qd.a f6436b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Class<?> cls) {
            t.e(cls, "klass");
            qd.b bVar = new qd.b();
            c.f6432a.b(cls, bVar);
            qd.a m10 = bVar.m();
            if (m10 == null) {
                return null;
            }
            return new f(cls, m10, null);
        }
    }

    private f(Class<?> cls, qd.a aVar) {
        this.f6435a = cls;
        this.f6436b = aVar;
    }

    public /* synthetic */ f(Class cls, qd.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, aVar);
    }

    @Override // pd.q
    public qd.a a() {
        return this.f6436b;
    }

    @Override // pd.q
    public String b() {
        String D;
        StringBuilder sb2 = new StringBuilder();
        String name = this.f6435a.getName();
        t.d(name, "klass.name");
        D = x.D(name, '.', '/', false, 4, null);
        sb2.append(D);
        sb2.append(".class");
        return sb2.toString();
    }

    @Override // pd.q
    public void c(q.d dVar, byte[] bArr) {
        t.e(dVar, "visitor");
        c.f6432a.i(this.f6435a, dVar);
    }

    @Override // pd.q
    public void d(q.c cVar, byte[] bArr) {
        t.e(cVar, "visitor");
        c.f6432a.b(this.f6435a, cVar);
    }

    public final Class<?> e() {
        return this.f6435a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && t.a(this.f6435a, ((f) obj).f6435a);
    }

    public int hashCode() {
        return this.f6435a.hashCode();
    }

    @Override // pd.q
    public wd.b i() {
        return dd.d.a(this.f6435a);
    }

    public String toString() {
        return f.class.getName() + ": " + this.f6435a;
    }
}
