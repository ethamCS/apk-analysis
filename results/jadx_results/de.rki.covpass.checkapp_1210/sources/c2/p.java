package c2;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import u1.s;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: r */
    private static final String f6162r = u1.k.f("WorkSpec");

    /* renamed from: s */
    public static final o.a<List<c>, List<u1.s>> f6163s = new a();

    /* renamed from: a */
    public String f6164a;

    /* renamed from: b */
    public s.a f6165b;

    /* renamed from: c */
    public String f6166c;

    /* renamed from: d */
    public String f6167d;

    /* renamed from: e */
    public androidx.work.a f6168e;

    /* renamed from: f */
    public androidx.work.a f6169f;

    /* renamed from: g */
    public long f6170g;

    /* renamed from: h */
    public long f6171h;

    /* renamed from: i */
    public long f6172i;

    /* renamed from: j */
    public u1.c f6173j;

    /* renamed from: k */
    public int f6174k;

    /* renamed from: l */
    public u1.a f6175l;

    /* renamed from: m */
    public long f6176m;

    /* renamed from: n */
    public long f6177n;

    /* renamed from: o */
    public long f6178o;

    /* renamed from: p */
    public long f6179p;

    /* renamed from: q */
    public boolean f6180q;

    /* loaded from: classes.dex */
    class a implements o.a<List<c>, List<u1.s>> {
        a() {
        }

        /* renamed from: a */
        public List<u1.s> apply(List<c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (c cVar : list) {
                arrayList.add(cVar.a());
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public String f6181a;

        /* renamed from: b */
        public s.a f6182b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f6182b == bVar.f6182b) {
                return this.f6181a.equals(bVar.f6181a);
            }
            return false;
        }

        public int hashCode() {
            return (this.f6181a.hashCode() * 31) + this.f6182b.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public String f6183a;

        /* renamed from: b */
        public s.a f6184b;

        /* renamed from: c */
        public androidx.work.a f6185c;

        /* renamed from: d */
        public int f6186d;

        /* renamed from: e */
        public List<String> f6187e;

        /* renamed from: f */
        public List<androidx.work.a> f6188f;

        public u1.s a() {
            List<androidx.work.a> list = this.f6188f;
            return new u1.s(UUID.fromString(this.f6183a), this.f6184b, this.f6185c, this.f6187e, (list == null || list.isEmpty()) ? androidx.work.a.f5302c : this.f6188f.get(0), this.f6186d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f6186d != cVar.f6186d) {
                return false;
            }
            String str = this.f6183a;
            if (str == null ? cVar.f6183a != null : !str.equals(cVar.f6183a)) {
                return false;
            }
            if (this.f6184b != cVar.f6184b) {
                return false;
            }
            androidx.work.a aVar = this.f6185c;
            if (aVar == null ? cVar.f6185c != null : !aVar.equals(cVar.f6185c)) {
                return false;
            }
            List<String> list = this.f6187e;
            if (list == null ? cVar.f6187e != null : !list.equals(cVar.f6187e)) {
                return false;
            }
            List<androidx.work.a> list2 = this.f6188f;
            List<androidx.work.a> list3 = cVar.f6188f;
            return list2 != null ? list2.equals(list3) : list3 == null;
        }

        public int hashCode() {
            String str = this.f6183a;
            int i10 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            s.a aVar = this.f6184b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            androidx.work.a aVar2 = this.f6185c;
            int hashCode3 = (((hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31) + this.f6186d) * 31;
            List<String> list = this.f6187e;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<androidx.work.a> list2 = this.f6188f;
            if (list2 != null) {
                i10 = list2.hashCode();
            }
            return hashCode4 + i10;
        }
    }

    public p(p pVar) {
        this.f6165b = s.a.ENQUEUED;
        androidx.work.a aVar = androidx.work.a.f5302c;
        this.f6168e = aVar;
        this.f6169f = aVar;
        this.f6173j = u1.c.f22528i;
        this.f6175l = u1.a.EXPONENTIAL;
        this.f6176m = 30000L;
        this.f6179p = -1L;
        this.f6164a = pVar.f6164a;
        this.f6166c = pVar.f6166c;
        this.f6165b = pVar.f6165b;
        this.f6167d = pVar.f6167d;
        this.f6168e = new androidx.work.a(pVar.f6168e);
        this.f6169f = new androidx.work.a(pVar.f6169f);
        this.f6170g = pVar.f6170g;
        this.f6171h = pVar.f6171h;
        this.f6172i = pVar.f6172i;
        this.f6173j = new u1.c(pVar.f6173j);
        this.f6174k = pVar.f6174k;
        this.f6175l = pVar.f6175l;
        this.f6176m = pVar.f6176m;
        this.f6177n = pVar.f6177n;
        this.f6178o = pVar.f6178o;
        this.f6179p = pVar.f6179p;
        this.f6180q = pVar.f6180q;
    }

    public p(String str, String str2) {
        this.f6165b = s.a.ENQUEUED;
        androidx.work.a aVar = androidx.work.a.f5302c;
        this.f6168e = aVar;
        this.f6169f = aVar;
        this.f6173j = u1.c.f22528i;
        this.f6175l = u1.a.EXPONENTIAL;
        this.f6176m = 30000L;
        this.f6179p = -1L;
        this.f6164a = str;
        this.f6166c = str2;
    }

    public long a() {
        boolean z10 = false;
        if (c()) {
            if (this.f6175l == u1.a.LINEAR) {
                z10 = true;
            }
            return this.f6177n + Math.min(18000000L, z10 ? this.f6176m * this.f6174k : Math.scalb((float) this.f6176m, this.f6174k - 1));
        }
        long j10 = 0;
        if (!d()) {
            long j11 = this.f6177n;
            if (j11 == 0) {
                j11 = System.currentTimeMillis();
            }
            return j11 + this.f6170g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j12 = this.f6177n;
        long j13 = j12 == 0 ? currentTimeMillis + this.f6170g : j12;
        long j14 = this.f6172i;
        long j15 = this.f6171h;
        if (j14 != j15) {
            z10 = true;
        }
        int i10 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        if (z10) {
            if (i10 == 0) {
                j10 = j14 * (-1);
            }
            return j13 + j15 + j10;
        }
        if (i10 != 0) {
            j10 = j15;
        }
        return j13 + j10;
    }

    public boolean b() {
        return !u1.c.f22528i.equals(this.f6173j);
    }

    public boolean c() {
        return this.f6165b == s.a.ENQUEUED && this.f6174k > 0;
    }

    public boolean d() {
        return this.f6171h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f6170g != pVar.f6170g || this.f6171h != pVar.f6171h || this.f6172i != pVar.f6172i || this.f6174k != pVar.f6174k || this.f6176m != pVar.f6176m || this.f6177n != pVar.f6177n || this.f6178o != pVar.f6178o || this.f6179p != pVar.f6179p || this.f6180q != pVar.f6180q || !this.f6164a.equals(pVar.f6164a) || this.f6165b != pVar.f6165b || !this.f6166c.equals(pVar.f6166c)) {
            return false;
        }
        String str = this.f6167d;
        if (str == null ? pVar.f6167d != null : !str.equals(pVar.f6167d)) {
            return false;
        }
        return this.f6168e.equals(pVar.f6168e) && this.f6169f.equals(pVar.f6169f) && this.f6173j.equals(pVar.f6173j) && this.f6175l == pVar.f6175l;
    }

    public int hashCode() {
        int hashCode = ((((this.f6164a.hashCode() * 31) + this.f6165b.hashCode()) * 31) + this.f6166c.hashCode()) * 31;
        String str = this.f6167d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j10 = this.f6170g;
        long j11 = this.f6171h;
        long j12 = this.f6172i;
        long j13 = this.f6176m;
        long j14 = this.f6177n;
        long j15 = this.f6178o;
        long j16 = this.f6179p;
        return ((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f6168e.hashCode()) * 31) + this.f6169f.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f6173j.hashCode()) * 31) + this.f6174k) * 31) + this.f6175l.hashCode()) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f6180q ? 1 : 0);
    }

    public String toString() {
        return "{WorkSpec: " + this.f6164a + "}";
    }
}
