package g;

import e.b0;
import e.c0;
import e.g0;
import e.h0;
import e.w;
import e.y;
import e.z;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
final class r {
    private static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    private final String f4598a;

    /* renamed from: b */
    private final z f4599b;
    @Nullable

    /* renamed from: c */
    private String f4600c;
    @Nullable

    /* renamed from: d */
    private z.a f4601d;

    /* renamed from: e */
    private final g0.a f4602e = new g0.a();

    /* renamed from: f */
    private final y.a f4603f;
    @Nullable

    /* renamed from: g */
    private b0 f4604g;

    /* renamed from: h */
    private final boolean f4605h;
    @Nullable
    private c0.a i;
    @Nullable
    private w.a j;
    @Nullable
    private h0 k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends h0 {

        /* renamed from: a */
        private final h0 f4606a;

        /* renamed from: b */
        private final b0 f4607b;

        a(h0 h0Var, b0 b0Var) {
            this.f4606a = h0Var;
            this.f4607b = b0Var;
        }

        @Override // e.h0
        public long a() {
            return this.f4606a.a();
        }

        @Override // e.h0
        public b0 b() {
            return this.f4607b;
        }

        @Override // e.h0
        public void h(f.d dVar) {
            this.f4606a.h(dVar);
        }
    }

    public r(String str, z zVar, @Nullable String str2, @Nullable e.y yVar, @Nullable b0 b0Var, boolean z, boolean z2, boolean z3) {
        this.f4598a = str;
        this.f4599b = zVar;
        this.f4600c = str2;
        this.f4604g = b0Var;
        this.f4605h = z;
        this.f4603f = yVar != null ? yVar.f() : new y.a();
        if (z2) {
            this.j = new w.a();
        } else if (!z3) {
        } else {
            c0.a aVar = new c0.a();
            this.i = aVar;
            aVar.d(c0.f3922f);
        }
    }

    private static String i(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                f.c cVar = new f.c();
                cVar.K0(str, 0, i);
                j(cVar, str, i, length, z);
                return cVar.r0();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    private static void j(f.c cVar, String str, int i, int i2, boolean z) {
        f.c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (cVar2 == null) {
                        cVar2 = new f.c();
                    }
                    cVar2.L0(codePointAt);
                    while (!cVar2.S()) {
                        int d0 = cVar2.d0() & 255;
                        cVar.D0(37);
                        char[] cArr = l;
                        cVar.D0(cArr[(d0 >> 4) & 15]);
                        cVar.D0(cArr[d0 & 15]);
                    }
                } else {
                    cVar.L0(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    public void a(String str, String str2, boolean z) {
        if (z) {
            this.j.b(str, str2);
        } else {
            this.j.a(str, str2);
        }
    }

    public void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f4603f.a(str, str2);
            return;
        }
        try {
            this.f4604g = b0.b(str2);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e2);
        }
    }

    public void c(e.y yVar) {
        this.f4603f.b(yVar);
    }

    public void d(e.y yVar, h0 h0Var) {
        this.i.a(yVar, h0Var);
    }

    public void e(c0.b bVar) {
        this.i.b(bVar);
    }

    public void f(String str, String str2, boolean z) {
        if (this.f4600c != null) {
            String i = i(str2, z);
            String str3 = this.f4600c;
            String replace = str3.replace("{" + str + "}", i);
            if (!m.matcher(replace).matches()) {
                this.f4600c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    public void g(String str, @Nullable String str2, boolean z) {
        String str3 = this.f4600c;
        if (str3 != null) {
            z.a q = this.f4599b.q(str3);
            this.f4601d = q;
            if (q == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f4599b + ", Relative: " + this.f4600c);
            }
            this.f4600c = null;
        }
        if (z) {
            this.f4601d.a(str, str2);
        } else {
            this.f4601d.b(str, str2);
        }
    }

    public <T> void h(Class<T> cls, @Nullable T t) {
        this.f4602e.f(cls, t);
    }

    public g0.a k() {
        z zVar;
        z.a aVar = this.f4601d;
        if (aVar != null) {
            zVar = aVar.c();
        } else {
            zVar = this.f4599b.C(this.f4600c);
            if (zVar == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f4599b + ", Relative: " + this.f4600c);
            }
        }
        a aVar2 = this.k;
        if (aVar2 == null) {
            w.a aVar3 = this.j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                c0.a aVar4 = this.i;
                if (aVar4 != null) {
                    aVar2 = aVar4.c();
                } else if (this.f4605h) {
                    aVar2 = h0.d(null, new byte[0]);
                }
            }
        }
        b0 b0Var = this.f4604g;
        if (b0Var != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, b0Var);
            } else {
                this.f4603f.a("Content-Type", b0Var.toString());
            }
        }
        g0.a aVar5 = this.f4602e;
        aVar5.g(zVar);
        aVar5.c(this.f4603f.e());
        aVar5.d(this.f4598a, aVar2);
        return aVar5;
    }

    public void l(h0 h0Var) {
        this.k = h0Var;
    }

    public void m(Object obj) {
        this.f4600c = obj.toString();
    }
}
