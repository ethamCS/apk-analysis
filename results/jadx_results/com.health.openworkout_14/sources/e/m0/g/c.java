package e.m0.g;

import e.g0;
import e.i;
import e.i0;
import e.m0.i.e;
import e.y;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class c {
    @Nullable

    /* renamed from: a */
    public final g0 f4075a;
    @Nullable

    /* renamed from: b */
    public final i0 f4076b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final long f4077a;

        /* renamed from: b */
        final g0 f4078b;

        /* renamed from: c */
        final i0 f4079c;

        /* renamed from: d */
        private Date f4080d;

        /* renamed from: e */
        private String f4081e;

        /* renamed from: f */
        private Date f4082f;

        /* renamed from: g */
        private String f4083g;

        /* renamed from: h */
        private Date f4084h;
        private long i;
        private long j;
        private String k;
        private int l;

        public a(long j, g0 g0Var, i0 i0Var) {
            this.l = -1;
            this.f4077a = j;
            this.f4078b = g0Var;
            this.f4079c = i0Var;
            if (i0Var != null) {
                this.i = i0Var.n0();
                this.j = i0Var.l0();
                y g0 = i0Var.g0();
                int h2 = g0.h();
                for (int i = 0; i < h2; i++) {
                    String e2 = g0.e(i);
                    String i2 = g0.i(i);
                    if ("Date".equalsIgnoreCase(e2)) {
                        this.f4080d = e.m0.i.d.b(i2);
                        this.f4081e = i2;
                    } else if ("Expires".equalsIgnoreCase(e2)) {
                        this.f4084h = e.m0.i.d.b(i2);
                    } else if ("Last-Modified".equalsIgnoreCase(e2)) {
                        this.f4082f = e.m0.i.d.b(i2);
                        this.f4083g = i2;
                    } else if ("ETag".equalsIgnoreCase(e2)) {
                        this.k = i2;
                    } else if ("Age".equalsIgnoreCase(e2)) {
                        this.l = e.d(i2, -1);
                    }
                }
            }
        }

        private long a() {
            Date date = this.f4080d;
            long j = 0;
            if (date != null) {
                j = Math.max(0L, this.j - date.getTime());
            }
            int i = this.l;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis(i));
            }
            long j2 = this.j;
            return j + (j2 - this.i) + (this.f4077a - j2);
        }

        private long b() {
            i c2 = this.f4079c.c();
            if (c2.d() != -1) {
                return TimeUnit.SECONDS.toMillis(c2.d());
            }
            if (this.f4084h != null) {
                Date date = this.f4080d;
                long time = this.f4084h.getTime() - (date != null ? date.getTime() : this.j);
                if (time <= 0) {
                    return 0L;
                }
                return time;
            } else if (this.f4082f == null || this.f4079c.m0().i().z() != null) {
                return 0L;
            } else {
                Date date2 = this.f4080d;
                long time2 = (date2 != null ? date2.getTime() : this.i) - this.f4082f.getTime();
                if (time2 <= 0) {
                    return 0L;
                }
                return time2 / 10;
            }
        }

        private c d() {
            if (this.f4079c == null) {
                return new c(this.f4078b, null);
            }
            if ((!this.f4078b.e() || this.f4079c.I() != null) && c.a(this.f4079c, this.f4078b)) {
                i b2 = this.f4078b.b();
                if (b2.h() || e(this.f4078b)) {
                    return new c(this.f4078b, null);
                }
                i c2 = this.f4079c.c();
                long a2 = a();
                long b3 = b();
                if (b2.d() != -1) {
                    b3 = Math.min(b3, TimeUnit.SECONDS.toMillis(b2.d()));
                }
                long j = 0;
                long millis = b2.f() != -1 ? TimeUnit.SECONDS.toMillis(b2.f()) : 0L;
                if (!c2.g() && b2.e() != -1) {
                    j = TimeUnit.SECONDS.toMillis(b2.e());
                }
                if (!c2.h()) {
                    long j2 = millis + a2;
                    if (j2 < j + b3) {
                        i0.a j0 = this.f4079c.j0();
                        if (j2 >= b3) {
                            j0.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (a2 > 86400000 && f()) {
                            j0.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new c(null, j0.c());
                    }
                }
                String str = this.k;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.f4082f != null) {
                    str = this.f4083g;
                } else if (this.f4080d == null) {
                    return new c(this.f4078b, null);
                } else {
                    str = this.f4081e;
                }
                y.a f2 = this.f4078b.d().f();
                e.m0.c.f4060a.b(f2, str2, str);
                g0.a g2 = this.f4078b.g();
                g2.c(f2.e());
                return new c(g2.a(), this.f4079c);
            }
            return new c(this.f4078b, null);
        }

        private static boolean e(g0 g0Var) {
            return (g0Var.c("If-Modified-Since") == null && g0Var.c("If-None-Match") == null) ? false : true;
        }

        private boolean f() {
            return this.f4079c.c().d() == -1 && this.f4084h == null;
        }

        public c c() {
            c d2 = d();
            return (d2.f4075a == null || !this.f4078b.b().j()) ? d2 : new c(null, null);
        }
    }

    c(g0 g0Var, i0 i0Var) {
        this.f4075a = g0Var;
        this.f4076b = i0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
        if (r3.c().b() == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(e.i0 r3, e.g0 r4) {
        /*
            int r0 = r3.k()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.N(r0)
            if (r0 != 0) goto L5a
            e.i r0 = r3.c()
            int r0 = r0.d()
            r1 = -1
            if (r0 != r1) goto L5a
            e.i r0 = r3.c()
            boolean r0 = r0.c()
            if (r0 != 0) goto L5a
            e.i r0 = r3.c()
            boolean r0 = r0.b()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            e.i r3 = r3.c()
            boolean r3 = r3.i()
            if (r3 != 0) goto L6f
            e.i r3 = r4.b()
            boolean r3 = r3.i()
            if (r3 != 0) goto L6f
            r2 = 1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.m0.g.c.a(e.i0, e.g0):boolean");
    }
}
