package v1;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import u1.k;
import u1.n;
import u1.r;
import u1.u;
/* loaded from: classes.dex */
public class g extends r {

    /* renamed from: j */
    private static final String f23851j = k.f("WorkContinuationImpl");

    /* renamed from: a */
    private final i f23852a;

    /* renamed from: b */
    private final String f23853b;

    /* renamed from: c */
    private final u1.e f23854c;

    /* renamed from: d */
    private final List<? extends u> f23855d;

    /* renamed from: e */
    private final List<String> f23856e;

    /* renamed from: f */
    private final List<String> f23857f;

    /* renamed from: g */
    private final List<g> f23858g;

    /* renamed from: h */
    private boolean f23859h;

    /* renamed from: i */
    private n f23860i;

    public g(i iVar, String str, u1.e eVar, List<? extends u> list, List<g> list2) {
        this.f23852a = iVar;
        this.f23853b = str;
        this.f23854c = eVar;
        this.f23855d = list;
        this.f23858g = list2;
        this.f23856e = new ArrayList(list.size());
        this.f23857f = new ArrayList();
        if (list2 != null) {
            for (g gVar : list2) {
                this.f23857f.addAll(gVar.f23857f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String a10 = list.get(i10).a();
            this.f23856e.add(a10);
            this.f23857f.add(a10);
        }
    }

    public g(i iVar, List<? extends u> list) {
        this(iVar, null, u1.e.KEEP, list, null);
    }

    private static boolean i(g gVar, Set<String> set) {
        set.addAll(gVar.c());
        Set<String> l10 = l(gVar);
        for (String str : set) {
            if (l10.contains(str)) {
                return true;
            }
        }
        List<g> e10 = gVar.e();
        if (e10 != null && !e10.isEmpty()) {
            for (g gVar2 : e10) {
                if (i(gVar2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static Set<String> l(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> e10 = gVar.e();
        if (e10 != null && !e10.isEmpty()) {
            for (g gVar2 : e10) {
                hashSet.addAll(gVar2.c());
            }
        }
        return hashSet;
    }

    public n a() {
        if (!this.f23859h) {
            d2.b bVar = new d2.b(this);
            this.f23852a.q().b(bVar);
            this.f23860i = bVar.d();
        } else {
            k.c().h(f23851j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f23856e)), new Throwable[0]);
        }
        return this.f23860i;
    }

    public u1.e b() {
        return this.f23854c;
    }

    public List<String> c() {
        return this.f23856e;
    }

    public String d() {
        return this.f23853b;
    }

    public List<g> e() {
        return this.f23858g;
    }

    public List<? extends u> f() {
        return this.f23855d;
    }

    public i g() {
        return this.f23852a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f23859h;
    }

    public void k() {
        this.f23859h = true;
    }
}
