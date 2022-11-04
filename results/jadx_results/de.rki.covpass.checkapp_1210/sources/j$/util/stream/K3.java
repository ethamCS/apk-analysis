package j$.util.stream;
/* loaded from: classes2.dex */
final class K3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f13484a;

    /* renamed from: b */
    final /* synthetic */ Runnable f13485b;

    public K3(Runnable runnable, Runnable runnable2) {
        this.f13484a = runnable;
        this.f13485b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f13484a.run();
            this.f13485b.run();
        } catch (Throwable th2) {
            try {
                this.f13485b.run();
            } catch (Throwable th3) {
                try {
                    th2.addSuppressed(th3);
                } catch (Throwable unused) {
                }
            }
            throw th2;
        }
    }
}
