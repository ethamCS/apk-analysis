package androidx.work.impl;

import android.content.Context;
import androidx.room.h0;
import androidx.room.i0;
import androidx.work.impl.a;
import c2.e;
import c2.k;
import c2.n;
import c2.q;
import c2.t;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m1.g;
import m1.h;
import n1.c;
/* loaded from: classes.dex */
public abstract class WorkDatabase extends i0 {

    /* renamed from: o */
    private static final long f5305o = TimeUnit.DAYS.toMillis(1);

    /* loaded from: classes.dex */
    public class a implements h.c {

        /* renamed from: a */
        final /* synthetic */ Context f5306a;

        a(Context context) {
            this.f5306a = context;
        }

        @Override // m1.h.c
        public h a(h.b bVar) {
            h.b.a a10 = h.b.a(this.f5306a);
            a10.c(bVar.f16250b).b(bVar.f16251c).d(true);
            return new c().a(a10.a());
        }
    }

    /* loaded from: classes.dex */
    public class b extends i0.b {
        b() {
        }

        @Override // androidx.room.i0.b
        public void c(g gVar) {
            super.c(gVar);
            gVar.t();
            try {
                gVar.H(WorkDatabase.J());
                gVar.C0();
            } finally {
                gVar.q();
            }
        }
    }

    public static WorkDatabase F(Context context, Executor executor, boolean z10) {
        i0.a aVar;
        if (z10) {
            aVar = h0.c(context, WorkDatabase.class).c();
        } else {
            aVar = h0.a(context, WorkDatabase.class, v1.h.d());
            aVar.f(new a(context));
        }
        return (WorkDatabase) aVar.g(executor).a(H()).b(androidx.work.impl.a.f5315a).b(new a.g(context, 2, 3)).b(androidx.work.impl.a.f5316b).b(androidx.work.impl.a.f5317c).b(new a.g(context, 5, 6)).b(androidx.work.impl.a.f5318d).b(androidx.work.impl.a.f5319e).b(androidx.work.impl.a.f5320f).b(new a.h(context)).b(new a.g(context, 10, 11)).e().d();
    }

    static i0.b H() {
        return new b();
    }

    static long I() {
        return System.currentTimeMillis() - f5305o;
    }

    static String J() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + I() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract c2.b G();

    public abstract e K();

    public abstract c2.h L();

    public abstract k M();

    public abstract n N();

    public abstract q O();

    public abstract t P();
}
