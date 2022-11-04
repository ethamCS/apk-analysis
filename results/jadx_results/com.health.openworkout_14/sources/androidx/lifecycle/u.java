package androidx.lifecycle;
/* loaded from: classes.dex */
public class u {

    /* renamed from: a */
    private final a f1260a;

    /* renamed from: b */
    private final v f1261b;

    /* loaded from: classes.dex */
    public interface a {
        <T extends t> T a(Class<T> cls);
    }

    /* loaded from: classes.dex */
    public static abstract class b extends c implements a {
        b() {
        }

        @Override // androidx.lifecycle.u.a
        public <T extends t> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends t> T c(String str, Class<T> cls);
    }

    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        void b(t tVar) {
        }
    }

    public u(v vVar, a aVar) {
        this.f1260a = aVar;
        this.f1261b = vVar;
    }

    public <T extends t> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends t> T b(String str, Class<T> cls) {
        T t = (T) this.f1261b.b(str);
        if (cls.isInstance(t)) {
            a aVar = this.f1260a;
            if (aVar instanceof c) {
                ((c) aVar).b(t);
            }
            return t;
        }
        a aVar2 = this.f1260a;
        T t2 = aVar2 instanceof b ? (T) ((b) aVar2).c(str, cls) : (T) aVar2.a(cls);
        this.f1261b.d(str, t2);
        return t2;
    }
}
