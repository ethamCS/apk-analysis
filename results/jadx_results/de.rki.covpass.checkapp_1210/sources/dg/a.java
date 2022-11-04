package dg;

import bf.x;
import eg.c;
import eg.k;
import hc.t;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.a0;
import of.b0;
import of.c0;
import of.j;
import of.v;
import of.w;
import of.z;
import org.conscrypt.BuildConfig;
import ub.y0;
import uf.e;
import yf.h;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0010\tB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016R*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Ldg/a;", "Lof/v;", "Lof/t;", "headers", BuildConfig.FLAVOR, "i", "Ltb/e0;", "d", BuildConfig.FLAVOR, "b", "Ldg/a$a;", "level", "e", "Lof/v$a;", "chain", "Lof/b0;", "a", "<set-?>", "Ldg/a$a;", "getLevel", "()Ldg/a$a;", "c", "(Ldg/a$a;)V", "Ldg/a$b;", "logger", "<init>", "(Ldg/a$b;)V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class a implements v {

    /* renamed from: a */
    private final b f8935a;

    /* renamed from: b */
    private volatile Set<String> f8936b;

    /* renamed from: c */
    private volatile EnumC0133a f8937c;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Ldg/a$a;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, k = 1, mv = {1, 6, 0})
    /* renamed from: dg.a$a */
    /* loaded from: classes3.dex */
    public enum EnumC0133a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Ldg/a$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "message", "Ltb/e0;", "a", "okhttp-logging-interceptor"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public interface b {
        public static final C0134a Companion = C0134a.f8944a;

        /* renamed from: a */
        public static final b f8943a = new C0134a.C0135a();

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\b"}, d2 = {"Ldg/a$b$a;", BuildConfig.FLAVOR, "Ldg/a$b;", "DEFAULT", "Ldg/a$b;", "<init>", "()V", "a", "okhttp-logging-interceptor"}, k = 1, mv = {1, 6, 0})
        /* renamed from: dg.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C0134a {

            /* renamed from: a */
            static final /* synthetic */ C0134a f8944a = new C0134a();

            @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Ldg/a$b$a$a;", "Ldg/a$b;", BuildConfig.FLAVOR, "message", "Ltb/e0;", "a", "<init>", "()V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 6, 0})
            /* renamed from: dg.a$b$a$a */
            /* loaded from: classes3.dex */
            private static final class C0135a implements b {
                @Override // dg.a.b
                public void a(String str) {
                    t.e(str, "message");
                    h.l(h.Companion.g(), str, 0, null, 6, null);
                }
            }

            private C0134a() {
            }
        }

        void a(String str);
    }

    public a(b bVar) {
        Set<String> b10;
        t.e(bVar, "logger");
        this.f8935a = bVar;
        b10 = y0.b();
        this.f8936b = b10;
        this.f8937c = EnumC0133a.NONE;
    }

    public /* synthetic */ a(b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? b.f8943a : bVar);
    }

    private final boolean b(of.t tVar) {
        boolean v10;
        boolean v11;
        String a10 = tVar.a("Content-Encoding");
        if (a10 == null) {
            return false;
        }
        v10 = x.v(a10, "identity", true);
        if (v10) {
            return false;
        }
        v11 = x.v(a10, "gzip", true);
        return !v11;
    }

    private final void d(of.t tVar, int i10) {
        String i11 = this.f8936b.contains(tVar.b(i10)) ? "██" : tVar.i(i10);
        b bVar = this.f8935a;
        bVar.a(tVar.b(i10) + ": " + i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Throwable] */
    @Override // of.v
    public b0 a(v.a aVar) {
        String str;
        String str2;
        char c10;
        String str3;
        b bVar;
        boolean v10;
        ?? r62;
        Long l10;
        b bVar2;
        String str4;
        StringBuilder sb2;
        StringBuilder sb3;
        String str5;
        t.e(aVar, "chain");
        EnumC0133a enumC0133a = this.f8937c;
        z b10 = aVar.b();
        if (enumC0133a == EnumC0133a.NONE) {
            return aVar.a(b10);
        }
        boolean z10 = enumC0133a == EnumC0133a.BODY;
        boolean z11 = z10 || enumC0133a == EnumC0133a.HEADERS;
        a0 a10 = b10.a();
        j c11 = aVar.c();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("--> ");
        sb4.append(b10.h());
        sb4.append(' ');
        sb4.append(b10.j());
        sb4.append(c11 != null ? t.l(" ", c11.a()) : BuildConfig.FLAVOR);
        String sb5 = sb4.toString();
        if (!z11 && a10 != 0) {
            sb5 = sb5 + " (" + a10.a() + "-byte body)";
        }
        this.f8935a.a(sb5);
        if (z11) {
            of.t f10 = b10.f();
            if (a10 != null) {
                w b11 = a10.b();
                if (b11 != null && f10.a("Content-Type") == null) {
                    this.f8935a.a(t.l("Content-Type: ", b11));
                }
                if (a10.a() != -1 && f10.a("Content-Length") == null) {
                    this.f8935a.a(t.l("Content-Length: ", Long.valueOf(a10.a())));
                }
            }
            int size = f10.size();
            for (int i10 = 0; i10 < size; i10++) {
                d(f10, i10);
            }
            if (!z10 || a10 == null) {
                bVar2 = this.f8935a;
                str4 = t.l("--> END ", b10.h());
            } else {
                if (b(b10.f())) {
                    bVar2 = this.f8935a;
                    sb3 = new StringBuilder();
                    sb3.append("--> END ");
                    sb3.append(b10.h());
                    str5 = " (encoded body omitted)";
                } else if (a10.c()) {
                    bVar2 = this.f8935a;
                    sb3 = new StringBuilder();
                    sb3.append("--> END ");
                    sb3.append(b10.h());
                    str5 = " (duplex request body omitted)";
                } else if (a10.d()) {
                    bVar2 = this.f8935a;
                    sb3 = new StringBuilder();
                    sb3.append("--> END ");
                    sb3.append(b10.h());
                    str5 = " (one-shot body omitted)";
                } else {
                    c cVar = new c();
                    a10.e(cVar);
                    w b12 = a10.b();
                    Charset c12 = b12 == null ? null : b12.c(StandardCharsets.UTF_8);
                    if (c12 == null) {
                        c12 = StandardCharsets.UTF_8;
                        t.d(c12, "UTF_8");
                    }
                    this.f8935a.a(BuildConfig.FLAVOR);
                    if (dg.b.a(cVar)) {
                        this.f8935a.a(cVar.M0(c12));
                        bVar2 = this.f8935a;
                        sb2 = new StringBuilder();
                        sb2.append("--> END ");
                        sb2.append(b10.h());
                        sb2.append(" (");
                        sb2.append(a10.a());
                        sb2.append("-byte body)");
                    } else {
                        bVar2 = this.f8935a;
                        sb2 = new StringBuilder();
                        sb2.append("--> END ");
                        sb2.append(b10.h());
                        sb2.append(" (binary ");
                        sb2.append(a10.a());
                        sb2.append("-byte body omitted)");
                    }
                    str4 = sb2.toString();
                }
                sb3.append(str5);
                str4 = sb3.toString();
            }
            bVar2.a(str4);
        }
        long nanoTime = System.nanoTime();
        try {
            b0 a11 = aVar.a(b10);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            c0 b13 = a11.b();
            t.b(b13);
            long b14 = b13.b();
            String str6 = b14 != -1 ? b14 + "-byte" : "unknown-length";
            b bVar3 = this.f8935a;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("<-- ");
            sb6.append(a11.i());
            if (a11.u().length() == 0) {
                str = "-byte body omitted)";
                str2 = BuildConfig.FLAVOR;
                c10 = ' ';
            } else {
                String u10 = a11.u();
                StringBuilder sb7 = new StringBuilder();
                str = "-byte body omitted)";
                c10 = ' ';
                sb7.append(' ');
                sb7.append(u10);
                str2 = sb7.toString();
            }
            sb6.append(str2);
            sb6.append(c10);
            sb6.append(a11.W().j());
            sb6.append(" (");
            sb6.append(millis);
            sb6.append("ms");
            sb6.append(!z11 ? ", " + str6 + " body" : BuildConfig.FLAVOR);
            sb6.append(')');
            bVar3.a(sb6.toString());
            if (z11) {
                of.t s10 = a11.s();
                int size2 = s10.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    d(s10, i11);
                }
                if (!z10 || !e.b(a11)) {
                    bVar = this.f8935a;
                    str3 = "<-- END HTTP";
                } else if (b(a11.s())) {
                    bVar = this.f8935a;
                    str3 = "<-- END HTTP (encoded body omitted)";
                } else {
                    eg.e f11 = b13.f();
                    f11.P(Long.MAX_VALUE);
                    c c13 = f11.c();
                    v10 = x.v("gzip", s10.a("Content-Encoding"), true);
                    if (v10) {
                        l10 = Long.valueOf(c13.e1());
                        k kVar = new k(c13.clone());
                        try {
                            c13 = new c();
                            c13.G0(kVar);
                            th = 0;
                        } finally {
                        }
                    } else {
                        r62 = 0;
                        l10 = null;
                    }
                    w e10 = b13.e();
                    Charset c14 = e10 == null ? r62 : e10.c(StandardCharsets.UTF_8);
                    if (c14 == null) {
                        c14 = StandardCharsets.UTF_8;
                        t.d(c14, "UTF_8");
                    }
                    if (!dg.b.a(c13)) {
                        this.f8935a.a(BuildConfig.FLAVOR);
                        this.f8935a.a("<-- END HTTP (binary " + c13.e1() + str);
                        return a11;
                    }
                    if (b14 != 0) {
                        this.f8935a.a(BuildConfig.FLAVOR);
                        this.f8935a.a(c13.clone().M0(c14));
                    }
                    if (l10 != null) {
                        this.f8935a.a("<-- END HTTP (" + c13.e1() + "-byte, " + l10 + "-gzipped-byte body)");
                    } else {
                        bVar = this.f8935a;
                        str3 = "<-- END HTTP (" + c13.e1() + "-byte body)";
                    }
                }
                bVar.a(str3);
            }
            return a11;
        } catch (Exception e11) {
            this.f8935a.a(t.l("<-- HTTP FAILED: ", e11));
            throw e11;
        }
    }

    public final void c(EnumC0133a enumC0133a) {
        t.e(enumC0133a, "<set-?>");
        this.f8937c = enumC0133a;
    }

    public final a e(EnumC0133a enumC0133a) {
        t.e(enumC0133a, "level");
        c(enumC0133a);
        return this;
    }
}
