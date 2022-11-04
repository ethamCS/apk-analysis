package rf;

import bf.x;
import hc.t;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.b0;
import of.t;
import of.z;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u0005B\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lrf/c;", BuildConfig.FLAVOR, "Lof/z;", "networkRequest", "Lof/z;", "b", "()Lof/z;", "Lof/b0;", "cacheResponse", "Lof/b0;", "a", "()Lof/b0;", "<init>", "(Lof/z;Lof/b0;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final z f21134a;

    /* renamed from: b */
    private final b0 f21135b;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lrf/c$a;", BuildConfig.FLAVOR, "Lof/b0;", "response", "Lof/z;", "request", BuildConfig.FLAVOR, "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(b0 b0Var, z zVar) {
            t.e(b0Var, "response");
            t.e(zVar, "request");
            int i10 = b0Var.i();
            if (i10 != 200 && i10 != 410 && i10 != 414 && i10 != 501 && i10 != 203 && i10 != 204) {
                if (i10 != 307) {
                    if (i10 != 308 && i10 != 404 && i10 != 405) {
                        switch (i10) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (b0.r(b0Var, "Expires", null, 2, null) == null && b0Var.e().d() == -1 && !b0Var.e().c() && !b0Var.e().b()) {
                    return false;
                }
            }
            return !b0Var.e().i() && !zVar.b().i();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\f\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lrf/c$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "f", "Lrf/c;", "c", BuildConfig.FLAVOR, "d", "a", "Lof/z;", "request", "e", "b", "nowMillis", "Lof/b0;", "cacheResponse", "<init>", "(JLof/z;Lof/b0;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final long f21136a;

        /* renamed from: b */
        private final z f21137b;

        /* renamed from: c */
        private final b0 f21138c;

        /* renamed from: d */
        private Date f21139d;

        /* renamed from: e */
        private String f21140e;

        /* renamed from: f */
        private Date f21141f;

        /* renamed from: g */
        private String f21142g;

        /* renamed from: h */
        private Date f21143h;

        /* renamed from: i */
        private long f21144i;

        /* renamed from: j */
        private long f21145j;

        /* renamed from: k */
        private String f21146k;

        /* renamed from: l */
        private int f21147l;

        public b(long j10, z zVar, b0 b0Var) {
            boolean v10;
            boolean v11;
            boolean v12;
            boolean v13;
            boolean v14;
            t.e(zVar, "request");
            this.f21136a = j10;
            this.f21137b = zVar;
            this.f21138c = b0Var;
            this.f21147l = -1;
            if (b0Var != null) {
                this.f21144i = b0Var.e0();
                this.f21145j = b0Var.V();
                of.t s10 = b0Var.s();
                int i10 = 0;
                int size = s10.size();
                while (i10 < size) {
                    int i11 = i10 + 1;
                    String b10 = s10.b(i10);
                    String i12 = s10.i(i10);
                    v10 = x.v(b10, "Date", true);
                    if (v10) {
                        this.f21139d = uf.c.a(i12);
                        this.f21140e = i12;
                    } else {
                        v11 = x.v(b10, "Expires", true);
                        if (v11) {
                            this.f21143h = uf.c.a(i12);
                        } else {
                            v12 = x.v(b10, "Last-Modified", true);
                            if (v12) {
                                this.f21141f = uf.c.a(i12);
                                this.f21142g = i12;
                            } else {
                                v13 = x.v(b10, "ETag", true);
                                if (v13) {
                                    this.f21146k = i12;
                                } else {
                                    v14 = x.v(b10, "Age", true);
                                    if (v14) {
                                        this.f21147l = pf.d.X(i12, -1);
                                    }
                                }
                            }
                        }
                    }
                    i10 = i11;
                }
            }
        }

        private final long a() {
            Date date = this.f21139d;
            long j10 = 0;
            if (date != null) {
                j10 = Math.max(0L, this.f21145j - date.getTime());
            }
            int i10 = this.f21147l;
            if (i10 != -1) {
                j10 = Math.max(j10, TimeUnit.SECONDS.toMillis(i10));
            }
            long j11 = this.f21145j;
            return j10 + (j11 - this.f21144i) + (this.f21136a - j11);
        }

        private final c c() {
            if (this.f21138c == null) {
                return new c(this.f21137b, null);
            }
            if ((!this.f21137b.g() || this.f21138c.n() != null) && c.Companion.a(this.f21138c, this.f21137b)) {
                of.d b10 = this.f21137b.b();
                if (b10.h() || e(this.f21137b)) {
                    return new c(this.f21137b, null);
                }
                of.d e10 = this.f21138c.e();
                long a10 = a();
                long d10 = d();
                if (b10.d() != -1) {
                    d10 = Math.min(d10, TimeUnit.SECONDS.toMillis(b10.d()));
                }
                long j10 = 0;
                long millis = b10.f() != -1 ? TimeUnit.SECONDS.toMillis(b10.f()) : 0L;
                if (!e10.g() && b10.e() != -1) {
                    j10 = TimeUnit.SECONDS.toMillis(b10.e());
                }
                if (!e10.h()) {
                    long j11 = millis + a10;
                    if (j11 < j10 + d10) {
                        b0.a B = this.f21138c.B();
                        if (j11 >= d10) {
                            B.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (a10 > 86400000 && f()) {
                            B.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new c(null, B.c());
                    }
                }
                String str = this.f21146k;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.f21141f != null) {
                    str = this.f21142g;
                } else if (this.f21139d == null) {
                    return new c(this.f21137b, null);
                } else {
                    str = this.f21140e;
                }
                t.a e11 = this.f21137b.f().e();
                hc.t.b(str);
                e11.c(str2, str);
                return new c(this.f21137b.i().e(e11.d()).b(), this.f21138c);
            }
            return new c(this.f21137b, null);
        }

        private final long d() {
            b0 b0Var = this.f21138c;
            hc.t.b(b0Var);
            of.d e10 = b0Var.e();
            if (e10.d() != -1) {
                return TimeUnit.SECONDS.toMillis(e10.d());
            }
            Date date = this.f21143h;
            Long l10 = null;
            if (date != null) {
                Date date2 = this.f21139d;
                if (date2 != null) {
                    l10 = Long.valueOf(date2.getTime());
                }
                long time = date.getTime() - (l10 == null ? this.f21145j : l10.longValue());
                if (time <= 0) {
                    return 0L;
                }
                return time;
            } else if (this.f21141f == null || this.f21138c.W().j().m() != null) {
                return 0L;
            } else {
                Date date3 = this.f21139d;
                if (date3 != null) {
                    l10 = Long.valueOf(date3.getTime());
                }
                long longValue = l10 == null ? this.f21144i : l10.longValue();
                Date date4 = this.f21141f;
                hc.t.b(date4);
                long time2 = longValue - date4.getTime();
                if (time2 <= 0) {
                    return 0L;
                }
                return time2 / 10;
            }
        }

        private final boolean e(z zVar) {
            return (zVar.d("If-Modified-Since") == null && zVar.d("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            b0 b0Var = this.f21138c;
            hc.t.b(b0Var);
            return b0Var.e().d() == -1 && this.f21143h == null;
        }

        public final c b() {
            c c10 = c();
            return (c10.b() == null || !this.f21137b.b().k()) ? c10 : new c(null, null);
        }
    }

    public c(z zVar, b0 b0Var) {
        this.f21134a = zVar;
        this.f21135b = b0Var;
    }

    public final b0 a() {
        return this.f21135b;
    }

    public final z b() {
        return this.f21134a;
    }
}
