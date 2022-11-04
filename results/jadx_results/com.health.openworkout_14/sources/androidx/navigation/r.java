package androidx.navigation;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a */
    private boolean f1367a;

    /* renamed from: b */
    private int f1368b;

    /* renamed from: c */
    private boolean f1369c;

    /* renamed from: d */
    private int f1370d;

    /* renamed from: e */
    private int f1371e;

    /* renamed from: f */
    private int f1372f;

    /* renamed from: g */
    private int f1373g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        boolean f1374a;

        /* renamed from: c */
        boolean f1376c;

        /* renamed from: b */
        int f1375b = -1;

        /* renamed from: d */
        int f1377d = -1;

        /* renamed from: e */
        int f1378e = -1;

        /* renamed from: f */
        int f1379f = -1;

        /* renamed from: g */
        int f1380g = -1;

        public r a() {
            return new r(this.f1374a, this.f1375b, this.f1376c, this.f1377d, this.f1378e, this.f1379f, this.f1380g);
        }

        public a b(int i) {
            this.f1377d = i;
            return this;
        }

        public a c(int i) {
            this.f1378e = i;
            return this;
        }

        public a d(boolean z) {
            this.f1374a = z;
            return this;
        }

        public a e(int i) {
            this.f1379f = i;
            return this;
        }

        public a f(int i) {
            this.f1380g = i;
            return this;
        }

        public a g(int i, boolean z) {
            this.f1375b = i;
            this.f1376c = z;
            return this;
        }
    }

    r(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5) {
        this.f1367a = z;
        this.f1368b = i;
        this.f1369c = z2;
        this.f1370d = i2;
        this.f1371e = i3;
        this.f1372f = i4;
        this.f1373g = i5;
    }

    public int a() {
        return this.f1370d;
    }

    public int b() {
        return this.f1371e;
    }

    public int c() {
        return this.f1372f;
    }

    public int d() {
        return this.f1373g;
    }

    public int e() {
        return this.f1368b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f1367a == rVar.f1367a && this.f1368b == rVar.f1368b && this.f1369c == rVar.f1369c && this.f1370d == rVar.f1370d && this.f1371e == rVar.f1371e && this.f1372f == rVar.f1372f && this.f1373g == rVar.f1373g;
    }

    public boolean f() {
        return this.f1369c;
    }

    public boolean g() {
        return this.f1367a;
    }

    public int hashCode() {
        return ((((((((((((g() ? 1 : 0) * 31) + e()) * 31) + (f() ? 1 : 0)) * 31) + a()) * 31) + b()) * 31) + c()) * 31) + d();
    }
}
