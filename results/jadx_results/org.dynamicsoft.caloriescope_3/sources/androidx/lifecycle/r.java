package androidx.lifecycle;
/* loaded from: classes.dex */
public class r {

    /* renamed from: a */
    private final a f997a;

    /* renamed from: b */
    private final s f998b;

    /* loaded from: classes.dex */
    public interface a {
        <T extends q> T a(Class<T> cls);
    }

    /* loaded from: classes.dex */
    public static abstract class b implements a {
        b() {
        }

        @Override // androidx.lifecycle.r.a
        public <T extends q> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends q> T a(String str, Class<T> cls);
    }

    public r(s sVar, a aVar) {
        this.f997a = aVar;
        this.f998b = sVar;
    }

    public <T extends q> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) a("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends q> T a(String str, Class<T> cls) {
        T t = (T) this.f998b.a(str);
        if (cls.isInstance(t)) {
            return t;
        }
        a aVar = this.f997a;
        T t2 = aVar instanceof b ? (T) ((b) aVar).a(str, cls) : (T) aVar.a(cls);
        this.f998b.a(str, t2);
        return t2;
    }
}
