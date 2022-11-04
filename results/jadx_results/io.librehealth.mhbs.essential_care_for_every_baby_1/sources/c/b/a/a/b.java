package c.b.a.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b<T> extends f<T> {

    /* renamed from: a */
    static final b<Object> f378a = new b<>();

    private b() {
    }

    public static <T> f<T> e() {
        return f378a;
    }

    @Override // c.b.a.a.f
    public T c(T t) {
        i.i(t, "use Optional.orNull() instead of Optional.or(null)");
        return t;
    }

    @Override // c.b.a.a.f
    public T d() {
        return null;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
