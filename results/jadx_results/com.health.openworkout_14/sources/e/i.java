package e;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private final boolean f3992a;

    /* renamed from: b */
    private final boolean f3993b;

    /* renamed from: c */
    private final int f3994c;

    /* renamed from: d */
    private final int f3995d;

    /* renamed from: e */
    private final boolean f3996e;

    /* renamed from: f */
    private final boolean f3997f;

    /* renamed from: g */
    private final boolean f3998g;

    /* renamed from: h */
    private final int f3999h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    @Nullable
    String m;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        boolean f4000a;

        /* renamed from: b */
        boolean f4001b;

        /* renamed from: c */
        int f4002c = -1;

        /* renamed from: d */
        int f4003d = -1;

        /* renamed from: e */
        int f4004e = -1;

        /* renamed from: f */
        boolean f4005f;

        /* renamed from: g */
        boolean f4006g;

        /* renamed from: h */
        boolean f4007h;

        public i a() {
            return new i(this);
        }

        public a b(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                this.f4003d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i);
        }

        public a c() {
            this.f4000a = true;
            return this;
        }

        public a d() {
            this.f4005f = true;
            return this;
        }
    }

    static {
        a aVar = new a();
        aVar.c();
        aVar.a();
        a aVar2 = new a();
        aVar2.d();
        aVar2.b(Integer.MAX_VALUE, TimeUnit.SECONDS);
        aVar2.a();
    }

    i(a aVar) {
        this.f3992a = aVar.f4000a;
        this.f3993b = aVar.f4001b;
        this.f3994c = aVar.f4002c;
        this.f3995d = -1;
        this.f3996e = false;
        this.f3997f = false;
        this.f3998g = false;
        this.f3999h = aVar.f4003d;
        this.i = aVar.f4004e;
        this.j = aVar.f4005f;
        this.k = aVar.f4006g;
        this.l = aVar.f4007h;
    }

    private i(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.f3992a = z;
        this.f3993b = z2;
        this.f3994c = i;
        this.f3995d = i2;
        this.f3996e = z3;
        this.f3997f = z4;
        this.f3998g = z5;
        this.f3999h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        if (this.f3992a) {
            sb.append("no-cache, ");
        }
        if (this.f3993b) {
            sb.append("no-store, ");
        }
        if (this.f3994c != -1) {
            sb.append("max-age=");
            sb.append(this.f3994c);
            sb.append(", ");
        }
        if (this.f3995d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f3995d);
            sb.append(", ");
        }
        if (this.f3996e) {
            sb.append("private, ");
        }
        if (this.f3997f) {
            sb.append("public, ");
        }
        if (this.f3998g) {
            sb.append("must-revalidate, ");
        }
        if (this.f3999h != -1) {
            sb.append("max-stale=");
            sb.append(this.f3999h);
            sb.append(", ");
        }
        if (this.i != -1) {
            sb.append("min-fresh=");
            sb.append(this.i);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e.i k(e.y r22) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.k(e.y):e.i");
    }

    public boolean b() {
        return this.f3996e;
    }

    public boolean c() {
        return this.f3997f;
    }

    public int d() {
        return this.f3994c;
    }

    public int e() {
        return this.f3999h;
    }

    public int f() {
        return this.i;
    }

    public boolean g() {
        return this.f3998g;
    }

    public boolean h() {
        return this.f3992a;
    }

    public boolean i() {
        return this.f3993b;
    }

    public boolean j() {
        return this.j;
    }

    public String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        String a2 = a();
        this.m = a2;
        return a2;
    }
}
