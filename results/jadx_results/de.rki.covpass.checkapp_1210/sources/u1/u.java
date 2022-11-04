package u1;

import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a */
    private UUID f22579a;

    /* renamed from: b */
    private c2.p f22580b;

    /* renamed from: c */
    private Set<String> f22581c;

    /* loaded from: classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends u> {

        /* renamed from: c */
        c2.p f22584c;

        /* renamed from: e */
        Class<? extends ListenableWorker> f22586e;

        /* renamed from: a */
        boolean f22582a = false;

        /* renamed from: d */
        Set<String> f22585d = new HashSet();

        /* renamed from: b */
        UUID f22583b = UUID.randomUUID();

        public a(Class<? extends ListenableWorker> cls) {
            this.f22586e = cls;
            this.f22584c = new c2.p(this.f22583b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(String str) {
            this.f22585d.add(str);
            return d();
        }

        public final W b() {
            W c10 = c();
            this.f22583b = UUID.randomUUID();
            c2.p pVar = new c2.p(this.f22584c);
            this.f22584c = pVar;
            pVar.f6164a = this.f22583b.toString();
            return c10;
        }

        abstract W c();

        abstract B d();
    }

    public u(UUID uuid, c2.p pVar, Set<String> set) {
        this.f22579a = uuid;
        this.f22580b = pVar;
        this.f22581c = set;
    }

    public String a() {
        return this.f22579a.toString();
    }

    public Set<String> b() {
        return this.f22581c;
    }

    public c2.p c() {
        return this.f22580b;
    }
}
