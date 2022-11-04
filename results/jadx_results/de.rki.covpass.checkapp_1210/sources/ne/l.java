package ne;
/* loaded from: classes3.dex */
class l<T> {

    /* renamed from: a */
    private final T f17001a;

    /* renamed from: b */
    private final Thread f17002b = Thread.currentThread();

    public l(T t10) {
        this.f17001a = t10;
    }

    public T a() {
        if (b()) {
            return this.f17001a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.f17002b == Thread.currentThread();
    }
}
