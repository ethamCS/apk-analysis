package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import u1.g;
import u1.o;
import u1.v;
/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a */
    private UUID f5288a;

    /* renamed from: b */
    private androidx.work.a f5289b;

    /* renamed from: c */
    private Set<String> f5290c;

    /* renamed from: d */
    private a f5291d;

    /* renamed from: e */
    private int f5292e;

    /* renamed from: f */
    private Executor f5293f;

    /* renamed from: g */
    private e2.a f5294g;

    /* renamed from: h */
    private v f5295h;

    /* renamed from: i */
    private o f5296i;

    /* renamed from: j */
    private g f5297j;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public List<String> f5298a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f5299b = Collections.emptyList();

        /* renamed from: c */
        public Network f5300c;
    }

    public WorkerParameters(UUID uuid, androidx.work.a aVar, Collection<String> collection, a aVar2, int i10, Executor executor, e2.a aVar3, v vVar, o oVar, g gVar) {
        this.f5288a = uuid;
        this.f5289b = aVar;
        this.f5290c = new HashSet(collection);
        this.f5291d = aVar2;
        this.f5292e = i10;
        this.f5293f = executor;
        this.f5294g = aVar3;
        this.f5295h = vVar;
        this.f5296i = oVar;
        this.f5297j = gVar;
    }

    public Executor a() {
        return this.f5293f;
    }

    public UUID b() {
        return this.f5288a;
    }

    public androidx.work.a c() {
        return this.f5289b;
    }

    public e2.a d() {
        return this.f5294g;
    }

    public v e() {
        return this.f5295h;
    }
}
