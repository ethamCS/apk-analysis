package w1;

import c2.p;
import java.util.HashMap;
import java.util.Map;
import u1.k;
import u1.q;
/* loaded from: classes.dex */
public class a {

    /* renamed from: d */
    static final String f24661d = k.f("DelayedWorkTracker");

    /* renamed from: a */
    final b f24662a;

    /* renamed from: b */
    private final q f24663b;

    /* renamed from: c */
    private final Map<String, Runnable> f24664c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w1.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0437a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ p f24665c;

        RunnableC0437a(p pVar) {
            a.this = r1;
            this.f24665c = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.c().a(a.f24661d, String.format("Scheduling work %s", this.f24665c.f6164a), new Throwable[0]);
            a.this.f24662a.e(this.f24665c);
        }
    }

    public a(b bVar, q qVar) {
        this.f24662a = bVar;
        this.f24663b = qVar;
    }

    public void a(p pVar) {
        Runnable remove = this.f24664c.remove(pVar.f6164a);
        if (remove != null) {
            this.f24663b.b(remove);
        }
        RunnableC0437a runnableC0437a = new RunnableC0437a(pVar);
        this.f24664c.put(pVar.f6164a, runnableC0437a);
        long currentTimeMillis = System.currentTimeMillis();
        this.f24663b.a(pVar.a() - currentTimeMillis, runnableC0437a);
    }

    public void b(String str) {
        Runnable remove = this.f24664c.remove(str);
        if (remove != null) {
            this.f24663b.b(remove);
        }
    }
}
