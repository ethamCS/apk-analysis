package e.a.a.e.h;

import android.content.Context;
import e.a.a.e.e.j;
import e.a.a.g.k;
import e.a.a.g.l;
import e.a.a.g.m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class f extends b {
    public e.a.a.e.e.h A;
    public String B;
    public String C;

    /* renamed from: a */
    public Integer f819a;

    /* renamed from: b */
    public String f820b;

    /* renamed from: c */
    public String f821c;

    /* renamed from: d */
    public String f822d;

    /* renamed from: e */
    public String f823e;
    public Boolean f;
    public List<Object> g;
    public Map<String, String> h;
    public Boolean i;
    public String j;
    public String k;
    public Boolean l;
    public String m;
    public Boolean n;
    public Boolean o;
    public Boolean p;
    public Boolean q;
    public Long r;
    public Long s;
    public Integer t;
    public String u;
    public e.a.a.e.e.i v;
    public String w;
    public e.a.a.e.e.g x;
    public j y;
    public e.a.a.e.e.h z;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f824a;

        static {
            int[] iArr = new int[e.a.a.e.e.g.values().length];
            f824a = iArr;
            try {
                iArr[e.a.a.e.e.g.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f824a[e.a.a.e.e.g.BigPicture.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f824a[e.a.a.e.e.g.BigText.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f824a[e.a.a.e.e.g.Inbox.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f824a[e.a.a.e.e.g.Messaging.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void l(Context context) {
        if ((!m.c(this.k).booleanValue() || !m.c(this.m).booleanValue()) && ((m.c(this.k).booleanValue() || e.a.a.g.b.k(context, this.k).booleanValue()) && (m.c(this.m).booleanValue() || e.a.a.g.b.k(context, this.m).booleanValue()))) {
            return;
        }
        throw new e.a.a.e.f.a("Invalid big picture '" + this.m + "' or large icon '" + this.k + "'");
    }

    private void m(Context context) {
        if (!m.c(this.j).booleanValue()) {
            if (l.b(this.j) == e.a.a.e.e.e.Resource && e.a.a.g.b.k(context, this.j).booleanValue()) {
                return;
            }
            throw new e.a.a.e.f.a("Small icon ('" + this.j + "') must be a valid media native resource type.");
        }
    }

    private void n(Context context) {
        if (m.c(this.k).booleanValue() || e.a.a.g.b.k(context, this.k).booleanValue()) {
            return;
        }
        throw new e.a.a.e.f.a("Invalid large icon '" + this.k + "'");
    }

    @Override // e.a.a.e.h.b
    public String g() {
        return f();
    }

    @Override // e.a.a.e.h.b
    public Map<String, Object> h() {
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.f819a);
        hashMap.put("title", this.f821c);
        hashMap.put("body", this.f822d);
        hashMap.put("summary", this.f823e);
        hashMap.put("showWen", this.f);
        hashMap.put("locked", this.l);
        hashMap.put("playSound", this.i);
        hashMap.put("ticker", this.u);
        hashMap.put("payload", this.h);
        hashMap.put("autoCancel", this.o);
        e.a.a.e.e.g gVar = this.x;
        hashMap.put("notificationLayout", gVar != null ? gVar.toString() : "Default");
        j jVar = this.y;
        hashMap.put("createdSource", jVar != null ? jVar.toString() : "Local");
        e.a.a.e.e.h hVar = this.z;
        if (hVar == null) {
            hVar = e.a.a.a.f;
        }
        hashMap.put("createdLifeCycle", hVar.toString());
        e.a.a.e.e.h hVar2 = this.A;
        String str = null;
        hashMap.put("displayedLifeCycle", hVar2 != null ? hVar2.toString() : null);
        hashMap.put("displayedDate", this.C);
        hashMap.put("createdDate", this.B);
        List<Object> list = this.g;
        if (list != null) {
            hashMap.put("actionButtons", list);
        }
        Boolean bool = this.o;
        if (bool != null) {
            hashMap.put("autoCancel", bool);
        }
        Boolean bool2 = this.p;
        if (bool2 != null) {
            hashMap.put("displayOnForeground", bool2);
        }
        Boolean bool3 = this.q;
        if (bool3 != null) {
            hashMap.put("displayOnBackground", bool3);
        }
        Long l = this.r;
        if (l != null) {
            hashMap.put("color", l);
        }
        Long l2 = this.s;
        if (l2 != null) {
            hashMap.put("backgroundColor", l2);
        }
        String str2 = this.j;
        if (str2 != null) {
            hashMap.put("icon", str2);
        }
        String str3 = this.k;
        if (str3 != null) {
            hashMap.put("largeIcon", str3);
        }
        String str4 = this.m;
        if (str4 != null) {
            hashMap.put("bigPicture", str4);
        }
        Integer num = this.t;
        if (num != null) {
            hashMap.put("progress", num);
        }
        String str5 = this.f820b;
        if (str5 != null) {
            hashMap.put("channelKey", str5);
        }
        e.a.a.e.e.i iVar = this.v;
        if (iVar != null) {
            if (iVar != null) {
                str = iVar.toString();
            }
            hashMap.put("privacy", str);
        }
        String str6 = this.w;
        if (str6 != null) {
            hashMap.put("privateMessage", str6);
        }
        return hashMap;
    }

    @Override // e.a.a.e.h.b
    public void i(Context context) {
        if (e.a.a.e.g.a.b(context, this.f820b) != null) {
            m(context);
            if (a.f824a[this.x.ordinal()] == 2) {
                l(context);
            }
            n(context);
            return;
        }
        throw new e.a.a.e.f.a("Notification channel '" + this.f820b + "' does not exists.");
    }

    /* renamed from: j */
    public f a(String str) {
        return (f) super.e(str);
    }

    /* renamed from: k */
    public f b(Map<String, Object> map) {
        this.B = (String) k.b(map, "createdDate", String.class).c(e.a.a.g.f.c());
        this.C = (String) k.b(map, "displayedDate", String.class).d();
        this.z = (e.a.a.e.e.h) b.c(map, "createdLifeCycle", e.a.a.e.e.h.class, e.a.a.e.e.h.values());
        this.A = (e.a.a.e.e.h) b.c(map, "displayedLifeCycle", e.a.a.e.e.h.class, e.a.a.e.e.h.values());
        this.y = (j) b.c(map, "createdSource", j.class, j.values());
        this.f820b = (String) b.d(map, "channelKey", String.class);
        this.r = (Long) b.d(map, "color", Long.class);
        this.s = (Long) b.d(map, "backgroundColor", Long.class);
        this.f819a = (Integer) b.d(map, "id", Integer.class);
        this.f821c = (String) b.d(map, "title", String.class);
        this.f822d = (String) b.d(map, "body", String.class);
        this.f823e = (String) b.d(map, "summary", String.class);
        this.i = (Boolean) b.d(map, "playSound", Boolean.class);
        this.f = (Boolean) b.d(map, "showWen", Boolean.class);
        this.l = (Boolean) b.d(map, "locked", Boolean.class);
        this.p = (Boolean) b.d(map, "displayOnForeground", Boolean.class);
        this.q = (Boolean) b.d(map, "displayOnBackground", Boolean.class);
        this.n = (Boolean) b.d(map, "hideLargeIconOnExpand", Boolean.class);
        this.x = (e.a.a.e.e.g) b.c(map, "notificationLayout", e.a.a.e.e.g.class, e.a.a.e.e.g.values());
        this.v = (e.a.a.e.e.i) b.c(map, "privacy", e.a.a.e.e.i.class, e.a.a.e.e.i.values());
        this.w = (String) b.d(map, "privateMessage", String.class);
        this.j = (String) b.d(map, "icon", String.class);
        this.k = (String) b.d(map, "largeIcon", String.class);
        this.m = (String) b.d(map, "bigPicture", String.class);
        this.g = (List) b.d(map, "actionButtons", List.class);
        this.h = (Map) b.d(map, "payload", Map.class);
        this.o = (Boolean) b.d(map, "autoCancel", Boolean.class);
        this.t = (Integer) b.d(map, "progress", Integer.class);
        this.u = (String) b.d(map, "ticker", String.class);
        return this;
    }
}
