package d2;

import androidx.work.impl.WorkDatabase;
import c2.q;
import u1.s;
/* loaded from: classes.dex */
public class i implements Runnable {

    /* renamed from: x */
    private static final String f8229x = u1.k.f("StopWorkRunnable");

    /* renamed from: c */
    private final v1.i f8230c;

    /* renamed from: d */
    private final String f8231d;

    /* renamed from: q */
    private final boolean f8232q;

    public i(v1.i iVar, String str, boolean z10) {
        this.f8230c = iVar;
        this.f8231d = str;
        this.f8232q = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z10;
        WorkDatabase p10 = this.f8230c.p();
        v1.d m10 = this.f8230c.m();
        q O = p10.O();
        p10.e();
        try {
            boolean g10 = m10.g(this.f8231d);
            if (this.f8232q) {
                z10 = this.f8230c.m().m(this.f8231d);
            } else {
                if (!g10 && O.h(this.f8231d) == s.a.RUNNING) {
                    O.l(s.a.ENQUEUED, this.f8231d);
                }
                z10 = this.f8230c.m().n(this.f8231d);
            }
            u1.k.c().a(f8229x, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f8231d, Boolean.valueOf(z10)), new Throwable[0]);
            p10.D();
        } finally {
            p10.i();
        }
    }
}
