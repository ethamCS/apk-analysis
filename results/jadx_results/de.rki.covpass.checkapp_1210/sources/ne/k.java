package ne;

import tb.e0;
/* loaded from: classes3.dex */
public interface k {
    public static final a Companion = a.f17000a;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f17000a = new a();

        private a() {
        }

        public final d a(Runnable runnable, gc.l<? super InterruptedException, e0> lVar) {
            return (runnable == null || lVar == null) ? new d(null, 1, null) : new c(runnable, lVar);
        }
    }

    void a();

    void b();
}
