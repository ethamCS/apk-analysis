package u1;

import android.os.Build;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: i */
    public static final c f22528i = new a().a();

    /* renamed from: a */
    private l f22529a;

    /* renamed from: b */
    private boolean f22530b;

    /* renamed from: c */
    private boolean f22531c;

    /* renamed from: d */
    private boolean f22532d;

    /* renamed from: e */
    private boolean f22533e;

    /* renamed from: f */
    private long f22534f;

    /* renamed from: g */
    private long f22535g;

    /* renamed from: h */
    private d f22536h;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        boolean f22537a = false;

        /* renamed from: b */
        boolean f22538b = false;

        /* renamed from: c */
        l f22539c = l.NOT_REQUIRED;

        /* renamed from: d */
        boolean f22540d = false;

        /* renamed from: e */
        boolean f22541e = false;

        /* renamed from: f */
        long f22542f = -1;

        /* renamed from: g */
        long f22543g = -1;

        /* renamed from: h */
        d f22544h = new d();

        public c a() {
            return new c(this);
        }
    }

    public c() {
        this.f22529a = l.NOT_REQUIRED;
        this.f22534f = -1L;
        this.f22535g = -1L;
        this.f22536h = new d();
    }

    c(a aVar) {
        this.f22529a = l.NOT_REQUIRED;
        this.f22534f = -1L;
        this.f22535g = -1L;
        this.f22536h = new d();
        this.f22530b = aVar.f22537a;
        int i10 = Build.VERSION.SDK_INT;
        this.f22531c = aVar.f22538b;
        this.f22529a = aVar.f22539c;
        this.f22532d = aVar.f22540d;
        this.f22533e = aVar.f22541e;
        if (i10 >= 24) {
            this.f22536h = aVar.f22544h;
            this.f22534f = aVar.f22542f;
            this.f22535g = aVar.f22543g;
        }
    }

    public c(c cVar) {
        this.f22529a = l.NOT_REQUIRED;
        this.f22534f = -1L;
        this.f22535g = -1L;
        this.f22536h = new d();
        this.f22530b = cVar.f22530b;
        this.f22531c = cVar.f22531c;
        this.f22529a = cVar.f22529a;
        this.f22532d = cVar.f22532d;
        this.f22533e = cVar.f22533e;
        this.f22536h = cVar.f22536h;
    }

    public d a() {
        return this.f22536h;
    }

    public l b() {
        return this.f22529a;
    }

    public long c() {
        return this.f22534f;
    }

    public long d() {
        return this.f22535g;
    }

    public boolean e() {
        return this.f22536h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f22530b != cVar.f22530b || this.f22531c != cVar.f22531c || this.f22532d != cVar.f22532d || this.f22533e != cVar.f22533e || this.f22534f != cVar.f22534f || this.f22535g != cVar.f22535g || this.f22529a != cVar.f22529a) {
            return false;
        }
        return this.f22536h.equals(cVar.f22536h);
    }

    public boolean f() {
        return this.f22532d;
    }

    public boolean g() {
        return this.f22530b;
    }

    public boolean h() {
        return this.f22531c;
    }

    public int hashCode() {
        long j10 = this.f22534f;
        long j11 = this.f22535g;
        return (((((((((((((this.f22529a.hashCode() * 31) + (this.f22530b ? 1 : 0)) * 31) + (this.f22531c ? 1 : 0)) * 31) + (this.f22532d ? 1 : 0)) * 31) + (this.f22533e ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f22536h.hashCode();
    }

    public boolean i() {
        return this.f22533e;
    }

    public void j(d dVar) {
        this.f22536h = dVar;
    }

    public void k(l lVar) {
        this.f22529a = lVar;
    }

    public void l(boolean z10) {
        this.f22532d = z10;
    }

    public void m(boolean z10) {
        this.f22530b = z10;
    }

    public void n(boolean z10) {
        this.f22531c = z10;
    }

    public void o(boolean z10) {
        this.f22533e = z10;
    }

    public void p(long j10) {
        this.f22534f = j10;
    }

    public void q(long j10) {
        this.f22535g = j10;
    }
}
