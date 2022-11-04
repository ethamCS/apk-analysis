package e.a.a.e.h;

import android.content.Context;
import e.a.a.g.l;
import e.a.a.g.m;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class e extends b {

    /* renamed from: a */
    public String f814a;

    /* renamed from: b */
    public String f815b;

    /* renamed from: c */
    public String f816c;

    /* renamed from: d */
    public Boolean f817d;

    /* renamed from: e */
    public e.a.a.e.e.f f818e;
    public Boolean f;
    public String g;
    public e.a.a.e.e.b h;
    public Boolean i;
    public long[] j;
    public Boolean k;
    public Integer l;
    public Integer m;
    public Integer n;
    public String o;
    public e.a.a.e.e.d p;
    public e.a.a.e.e.c q;
    public Integer r;
    public String s;
    public Long t;
    public Boolean u;
    public Boolean v;
    public e.a.a.e.e.i w;

    @Override // e.a.a.e.h.b
    public /* bridge */ /* synthetic */ b b(Map map) {
        k(map);
        return this;
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return e.a.a.g.d.a(eVar.r, this.r).booleanValue() && e.a.a.g.d.a(eVar.t, this.t).booleanValue() && e.a.a.g.d.a(eVar.f814a, this.f814a).booleanValue() && e.a.a.g.d.a(eVar.f815b, this.f815b).booleanValue() && e.a.a.g.d.a(eVar.f816c, this.f816c).booleanValue() && e.a.a.g.d.a(eVar.f817d, this.f817d).booleanValue() && e.a.a.g.d.a(eVar.f818e, this.f818e).booleanValue() && e.a.a.g.d.a(eVar.f, this.f).booleanValue() && e.a.a.g.d.a(eVar.g, this.g).booleanValue() && e.a.a.g.d.a(eVar.i, this.i).booleanValue() && e.a.a.g.d.a(eVar.j, this.j).booleanValue() && e.a.a.g.d.a(eVar.k, this.k).booleanValue() && e.a.a.g.d.a(eVar.l, this.l).booleanValue() && e.a.a.g.d.a(eVar.m, this.m).booleanValue() && e.a.a.g.d.a(eVar.n, this.n).booleanValue() && e.a.a.g.d.a(eVar.o, this.o).booleanValue() && e.a.a.g.d.a(eVar.u, this.u).booleanValue() && e.a.a.g.d.a(eVar.v, this.v).booleanValue() && e.a.a.g.d.a(eVar.w, this.w).booleanValue() && e.a.a.g.d.a(eVar.h, this.h).booleanValue() && e.a.a.g.d.a(eVar.p, this.p).booleanValue() && e.a.a.g.d.a(eVar.q, this.q).booleanValue();
    }

    @Override // e.a.a.e.h.b
    public String g() {
        return f();
    }

    @Override // e.a.a.e.h.b
    public Map<String, Object> h() {
        HashMap hashMap = new HashMap();
        hashMap.put("iconResourceId", this.r);
        hashMap.put("icon", this.s);
        hashMap.put("defaultColor", this.t);
        String str = this.f814a;
        if (str != null) {
            hashMap.put("channelKey", str);
        }
        String str2 = this.f815b;
        if (str2 != null) {
            hashMap.put("channelName", str2);
        }
        String str3 = this.f816c;
        if (str3 != null) {
            hashMap.put("channelDescription", str3);
        }
        Boolean bool = this.f817d;
        if (bool != null) {
            hashMap.put("channelShowBadge", bool);
        }
        Boolean bool2 = this.f;
        if (bool2 != null) {
            hashMap.put("playSound", bool2);
        }
        String str4 = this.g;
        if (str4 != null) {
            hashMap.put("soundSource", str4);
        }
        Boolean bool3 = this.i;
        if (bool3 != null) {
            hashMap.put("enableVibration", bool3);
        }
        long[] jArr = this.j;
        if (jArr != null) {
            hashMap.put("vibrationPattern", jArr);
        }
        Boolean bool4 = this.k;
        if (bool4 != null) {
            hashMap.put("enableLights", bool4);
        }
        Integer num = this.l;
        if (num != null) {
            hashMap.put("ledColor", num);
        }
        Integer num2 = this.m;
        if (num2 != null) {
            hashMap.put("ledOnMs", num2);
        }
        Integer num3 = this.n;
        if (num3 != null) {
            hashMap.put("ledOffMs", num3);
        }
        String str5 = this.o;
        if (str5 != null) {
            hashMap.put("groupKey", str5);
        }
        e.a.a.e.e.d dVar = this.p;
        if (dVar != null) {
            hashMap.put("groupSort", dVar.toString());
        }
        e.a.a.e.e.f fVar = this.f818e;
        if (fVar != null) {
            hashMap.put("importance", fVar.toString());
        }
        e.a.a.e.e.c cVar = this.q;
        if (cVar != null) {
            hashMap.put("groupAlertBehavior", cVar.toString());
        }
        e.a.a.e.e.i iVar = this.w;
        if (iVar != null) {
            hashMap.put("defaultPrivacy", iVar.toString());
        }
        e.a.a.e.e.b bVar = this.h;
        if (bVar != null) {
            hashMap.put("defaultRingtoneType", bVar.toString());
        }
        Boolean bool5 = this.u;
        if (bool5 != null) {
            hashMap.put("locked", bool5);
        }
        Boolean bool6 = this.v;
        if (bool6 != null) {
            hashMap.put("onlyAlertOnce", bool6);
        }
        return hashMap;
    }

    @Override // e.a.a.e.h.b
    public void i(Context context) {
        if (!m.c(this.f814a).booleanValue()) {
            if (m.c(this.f815b).booleanValue()) {
                throw new e.a.a.e.f.a("Channel name cannot be null or empty");
            }
            if (m.c(this.f816c).booleanValue()) {
                throw new e.a.a.e.f.a("Channel description cannot be null or empty");
            }
            Boolean bool = this.f;
            if (bool == null) {
                throw new e.a.a.e.f.a("Play sound selector cannot be null or empty");
            }
            if (this.l != null && (this.m == null || this.n == null)) {
                throw new e.a.a.e.f.a("Standard led on and off times cannot be null or empty");
            }
            if (e.a.a.g.c.a(bool) && !m.c(this.g).booleanValue() && !e.a.a.g.a.f(context, this.g).booleanValue()) {
                throw new e.a.a.e.f.a("Audio media is not valid");
            }
            return;
        }
        throw new e.a.a.e.f.a("Channel name cannot be null or empty");
    }

    /* renamed from: j */
    public e a(String str) {
        return (e) super.e(str);
    }

    public e k(Map<String, Object> map) {
        this.r = (Integer) b.d(map, "iconResourceId", Integer.class);
        String str = (String) b.d(map, "icon", String.class);
        this.s = str;
        if (str != null && l.b(str) != e.a.a.e.e.e.Resource) {
            this.s = null;
        }
        this.t = (Long) b.d(map, "defaultColor", Long.class);
        this.f814a = (String) b.d(map, "channelKey", String.class);
        this.f815b = (String) b.d(map, "channelName", String.class);
        this.f816c = (String) b.d(map, "channelDescription", String.class);
        this.f817d = (Boolean) b.d(map, "channelShowBadge", Boolean.class);
        this.f = (Boolean) b.d(map, "playSound", Boolean.class);
        this.g = (String) b.d(map, "soundSource", String.class);
        this.i = (Boolean) b.d(map, "enableVibration", Boolean.class);
        this.j = (long[]) b.d(map, "vibrationPattern", long[].class);
        this.l = (Integer) b.d(map, "ledColor", Integer.class);
        this.k = (Boolean) b.d(map, "enableLights", Boolean.class);
        this.m = (Integer) b.d(map, "ledOnMs", Integer.class);
        this.n = (Integer) b.d(map, "ledOffMs", Integer.class);
        this.f818e = (e.a.a.e.e.f) b.c(map, "importance", e.a.a.e.e.f.class, e.a.a.e.e.f.values());
        this.p = (e.a.a.e.e.d) b.c(map, "groupSort", e.a.a.e.e.d.class, e.a.a.e.e.d.values());
        this.q = (e.a.a.e.e.c) b.c(map, "groupAlertBehavior", e.a.a.e.e.c.class, e.a.a.e.e.c.values());
        this.w = (e.a.a.e.e.i) b.c(map, "defaultPrivacy", e.a.a.e.e.i.class, e.a.a.e.e.i.values());
        this.h = (e.a.a.e.e.b) b.c(map, "defaultRingtoneType", e.a.a.e.e.b.class, e.a.a.e.e.b.values());
        this.o = (String) b.d(map, "groupKey", String.class);
        this.u = (Boolean) b.d(map, "locked", Boolean.class);
        this.v = (Boolean) b.d(map, "onlyAlertOnce", Boolean.class);
        return this;
    }

    public String l() {
        return m.a(g());
    }
}
