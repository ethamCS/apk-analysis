package u1;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    final Executor f22505a;

    /* renamed from: b */
    final Executor f22506b;

    /* renamed from: c */
    final v f22507c;

    /* renamed from: d */
    final j f22508d;

    /* renamed from: e */
    final q f22509e;

    /* renamed from: f */
    final h f22510f;

    /* renamed from: g */
    final String f22511g;

    /* renamed from: h */
    final int f22512h;

    /* renamed from: i */
    final int f22513i;

    /* renamed from: j */
    final int f22514j;

    /* renamed from: k */
    final int f22515k;

    /* renamed from: l */
    private final boolean f22516l;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        Executor f22517a;

        /* renamed from: b */
        v f22518b;

        /* renamed from: c */
        j f22519c;

        /* renamed from: d */
        Executor f22520d;

        /* renamed from: e */
        q f22521e;

        /* renamed from: f */
        h f22522f;

        /* renamed from: g */
        String f22523g;

        /* renamed from: h */
        int f22524h = 4;

        /* renamed from: i */
        int f22525i = 0;

        /* renamed from: j */
        int f22526j = Integer.MAX_VALUE;

        /* renamed from: k */
        int f22527k = 20;

        public b a() {
            return new b(this);
        }
    }

    /* renamed from: u1.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0398b {
        b a();
    }

    b(a aVar) {
        Executor executor = aVar.f22517a;
        this.f22505a = executor == null ? a() : executor;
        Executor executor2 = aVar.f22520d;
        if (executor2 == null) {
            this.f22516l = true;
            executor2 = a();
        } else {
            this.f22516l = false;
        }
        this.f22506b = executor2;
        v vVar = aVar.f22518b;
        this.f22507c = vVar == null ? v.c() : vVar;
        j jVar = aVar.f22519c;
        this.f22508d = jVar == null ? j.c() : jVar;
        q qVar = aVar.f22521e;
        this.f22509e = qVar == null ? new v1.a() : qVar;
        this.f22512h = aVar.f22524h;
        this.f22513i = aVar.f22525i;
        this.f22514j = aVar.f22526j;
        this.f22515k = aVar.f22527k;
        this.f22510f = aVar.f22522f;
        this.f22511g = aVar.f22523g;
    }

    private Executor a() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }

    public String b() {
        return this.f22511g;
    }

    public h c() {
        return this.f22510f;
    }

    public Executor d() {
        return this.f22505a;
    }

    public j e() {
        return this.f22508d;
    }

    public int f() {
        return this.f22514j;
    }

    public int g() {
        return Build.VERSION.SDK_INT == 23 ? this.f22515k / 2 : this.f22515k;
    }

    public int h() {
        return this.f22513i;
    }

    public int i() {
        return this.f22512h;
    }

    public q j() {
        return this.f22509e;
    }

    public Executor k() {
        return this.f22506b;
    }

    public v l() {
        return this.f22507c;
    }
}
