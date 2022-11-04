package e.m0;
/* loaded from: classes.dex */
public abstract class d implements Runnable {

    /* renamed from: b */
    protected final String f4061b;

    public d(String str, Object... objArr) {
        this.f4061b = e.o(str, objArr);
    }

    protected abstract void k();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f4061b);
        try {
            k();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
