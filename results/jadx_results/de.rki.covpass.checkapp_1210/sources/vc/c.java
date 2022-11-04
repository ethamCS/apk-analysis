package vc;

import hc.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uc.k;
import wd.f;
/* JADX WARN: Init of enum V3 can be incorrect */
/* JADX WARN: Init of enum W3 can be incorrect */
/* loaded from: classes.dex */
public enum c {
    Function(k.f23458r, "Function", false, false),
    SuspendFunction(k.f23450j, "SuspendFunction", true, false),
    KFunction(r8, "KFunction", false, true),
    KSuspendFunction(r8, "KSuspendFunction", true, true);
    
    public static final a Companion = new a(null);

    /* renamed from: c */
    private final wd.c f23987c;

    /* renamed from: d */
    private final String f23988d;

    /* renamed from: q */
    private final boolean f23989q;

    /* renamed from: x */
    private final boolean f23990x;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: vc.c$a$a */
        /* loaded from: classes.dex */
        public static final class C0428a {

            /* renamed from: a */
            private final c f23991a;

            /* renamed from: b */
            private final int f23992b;

            public C0428a(c cVar, int i10) {
                t.e(cVar, "kind");
                this.f23991a = cVar;
                this.f23992b = i10;
            }

            public final c a() {
                return this.f23991a;
            }

            public final int b() {
                return this.f23992b;
            }

            public final c c() {
                return this.f23991a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0428a)) {
                    return false;
                }
                C0428a c0428a = (C0428a) obj;
                return this.f23991a == c0428a.f23991a && this.f23992b == c0428a.f23992b;
            }

            public int hashCode() {
                return (this.f23991a.hashCode() * 31) + this.f23992b;
            }

            public String toString() {
                return "KindWithArity(kind=" + this.f23991a + ", arity=" + this.f23992b + ')';
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Integer d(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                int charAt = str.charAt(i11) - '0';
                if (!(charAt >= 0 && charAt < 10)) {
                    return null;
                }
                i10 = (i10 * 10) + charAt;
            }
            return Integer.valueOf(i10);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[LOOP:0: B:3:0x0011->B:13:0x0032, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final vc.c a(wd.c r9, java.lang.String r10) {
            /*
                r8 = this;
                java.lang.String r0 = "packageFqName"
                hc.t.e(r9, r0)
                java.lang.String r0 = "className"
                hc.t.e(r10, r0)
                vc.c[] r0 = vc.c.values()
                int r1 = r0.length
                r2 = 0
                r3 = r2
            L11:
                r4 = 0
                if (r3 >= r1) goto L35
                r5 = r0[r3]
                wd.c r6 = r5.h()
                boolean r6 = hc.t.a(r6, r9)
                if (r6 == 0) goto L2d
                java.lang.String r6 = r5.g()
                r7 = 2
                boolean r4 = bf.o.I(r10, r6, r2, r7, r4)
                if (r4 == 0) goto L2d
                r4 = 1
                goto L2e
            L2d:
                r4 = r2
            L2e:
                if (r4 == 0) goto L32
                r4 = r5
                goto L35
            L32:
                int r3 = r3 + 1
                goto L11
            L35:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: vc.c.a.a(wd.c, java.lang.String):vc.c");
        }

        @fc.c
        public final c b(String str, wd.c cVar) {
            t.e(str, "className");
            t.e(cVar, "packageFqName");
            C0428a c10 = c(str, cVar);
            if (c10 != null) {
                return c10.c();
            }
            return null;
        }

        public final C0428a c(String str, wd.c cVar) {
            t.e(str, "className");
            t.e(cVar, "packageFqName");
            c a10 = a(cVar, str);
            if (a10 == null) {
                return null;
            }
            String substring = str.substring(a10.g().length());
            t.d(substring, "this as java.lang.String).substring(startIndex)");
            Integer d10 = d(substring);
            if (d10 == null) {
                return null;
            }
            return new C0428a(a10, d10.intValue());
        }
    }

    static {
        wd.c cVar = k.f23455o;
    }

    c(wd.c cVar, String str, boolean z10, boolean z11) {
        this.f23987c = cVar;
        this.f23988d = str;
        this.f23989q = z10;
        this.f23990x = z11;
    }

    public final String g() {
        return this.f23988d;
    }

    public final wd.c h() {
        return this.f23987c;
    }

    public final f j(int i10) {
        f j10 = f.j(this.f23988d + i10);
        t.d(j10, "identifier(\"$classNamePrefix$arity\")");
        return j10;
    }
}
