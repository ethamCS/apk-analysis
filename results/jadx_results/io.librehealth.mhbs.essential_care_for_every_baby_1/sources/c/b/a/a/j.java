package c.b.a.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j<T> extends f<T> {

    /* renamed from: a */
    private final T f388a;

    public j(T t) {
        this.f388a = t;
    }

    @Override // c.b.a.a.f
    public T c(T t) {
        i.i(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.f388a;
    }

    @Override // c.b.a.a.f
    public T d() {
        return this.f388a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f388a.equals(((j) obj).f388a);
        }
        return false;
    }

    public int hashCode() {
        return this.f388a.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f388a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
