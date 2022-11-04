package y8;

import hc.t;
import j$.time.Instant;
import j8.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import o8.w;
import org.conscrypt.BuildConfig;
import ub.c0;
import ub.u;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0013"}, d2 = {"Ly8/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "isCovPassCheck", BuildConfig.FLAVOR, "Lo8/w;", "c", "j$/time/Instant", "date", "b", "a", "Lv9/e;", "rulesUpdateRepository", "Lv9/b;", "dscRepository", "Lh9/e;", "revocationLocalListRepository", "<init>", "(Lv9/e;Lv9/b;Lh9/e;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private final v9.e f25961a;

    /* renamed from: b */
    private final v9.b f25962b;

    /* renamed from: c */
    private final h9.e f25963c;

    public c(v9.e eVar, v9.b bVar, h9.e eVar2) {
        t.e(eVar, "rulesUpdateRepository");
        t.e(bVar, "dscRepository");
        t.e(eVar2, "revocationLocalListRepository");
        this.f25961a = eVar;
        this.f25962b = bVar;
        this.f25963c = eVar2;
    }

    private final Instant b(Instant instant) {
        if (t.a(instant, v9.b.Companion.a())) {
            return null;
        }
        return instant;
    }

    private final List<w> c(boolean z10) {
        List<w> h10;
        List<w> d10;
        if (z10) {
            d10 = ub.t.d(new w(n.s0_res_0x7f1001b5, b(this.f25963c.v().getValue())));
            return d10;
        }
        h10 = u.h();
        return h10;
    }

    public final List<w> a(boolean z10) {
        List k10;
        List<w> o02;
        k10 = u.k(new w(n.v0_res_0x7f1001b8, b(this.f25961a.c().getValue())), new w(n.u0_res_0x7f1001b7, b(this.f25961a.b().getValue())), new w(n.w0_res_0x7f1001b9, b(this.f25961a.d().getValue())), new w(n.x0_res_0x7f1001ba, b(this.f25962b.c().getValue())), new w(n.t0_res_0x7f1001b6, b(this.f25961a.a().getValue())));
        List<w> c10 = c(z10);
        ArrayList arrayList = new ArrayList();
        for (Object obj : c10) {
            if (!(((w) obj).a() == null)) {
                arrayList.add(obj);
            }
        }
        o02 = c0.o0(k10, arrayList);
        return o02;
    }
}
