package of;

import eg.f;
import hc.q0;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\b\f\u000fB#\b\u0000\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001c\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J+\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lof/g;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "hostname", BuildConfig.FLAVOR, "Ljava/security/cert/Certificate;", "peerCertificates", "Ltb/e0;", "a", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "b", "(Ljava/lang/String;Lgc/a;)V", "Lof/g$c;", "c", "Lbg/c;", "certificateChainCleaner", "e", "(Lbg/c;)Lof/g;", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", "Lbg/c;", "d", "()Lbg/c;", BuildConfig.FLAVOR, "pins", "<init>", "(Ljava/util/Set;Lbg/c;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class g {
    public static final b Companion = new b(null);

    /* renamed from: c */
    public static final g f18166c = new a().b();

    /* renamed from: a */
    private final Set<c> f18167a;

    /* renamed from: b */
    private final bg.c f18168b;

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\"\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\t\u001a\u00020\bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lof/g$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "pattern", BuildConfig.FLAVOR, "pins", "a", "(Ljava/lang/String;[Ljava/lang/String;)Lof/g$a;", "Lof/g;", "b", BuildConfig.FLAVOR, "Lof/g$c;", "Ljava/util/List;", "c", "()Ljava/util/List;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final List<c> f18169a = new ArrayList();

        public final a a(String str, String... strArr) {
            hc.t.e(str, "pattern");
            hc.t.e(strArr, "pins");
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str2 = strArr[i10];
                i10++;
                c().add(new c(str, str2));
            }
            return this;
        }

        public final g b() {
            Set J0;
            J0 = ub.c0.J0(this.f18169a);
            return new g(J0, null, 2, null);
        }

        public final List<c> c() {
            return this.f18169a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lof/g$b;", BuildConfig.FLAVOR, "Ljava/security/cert/X509Certificate;", "Leg/f;", "b", "c", "Ljava/security/cert/Certificate;", "certificate", BuildConfig.FLAVOR, "a", "Lof/g;", "DEFAULT", "Lof/g;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fc.c
        public final String a(Certificate certificate) {
            hc.t.e(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return hc.t.l("sha256/", c((X509Certificate) certificate).b());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        @fc.c
        public final eg.f b(X509Certificate x509Certificate) {
            hc.t.e(x509Certificate, "<this>");
            f.a aVar = eg.f.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            hc.t.d(encoded, "publicKey.encoded");
            return f.a.f(aVar, encoded, 0, 0, 3, null).N();
        }

        @fc.c
        public final eg.f c(X509Certificate x509Certificate) {
            hc.t.e(x509Certificate, "<this>");
            f.a aVar = eg.f.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            hc.t.d(encoded, "publicKey.encoded");
            return f.a.f(aVar, encoded, 0, 0, 3, null).V();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0013\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lof/g$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "hostname", BuildConfig.FLAVOR, "c", "toString", "other", "equals", BuildConfig.FLAVOR, "hashCode", "hashAlgorithm", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Leg/f;", "hash", "Leg/f;", "a", "()Leg/f;", "pattern", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private final String f18170a;

        /* renamed from: b */
        private final String f18171b;

        /* renamed from: c */
        private final eg.f f18172c;

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
            if (r0 != (-1)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
            if (r0 != (-1)) goto L10;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(java.lang.String r12, java.lang.String r13) {
            /*
                r11 = this;
                java.lang.String r0 = "pattern"
                hc.t.e(r12, r0)
                java.lang.String r0 = "pin"
                hc.t.e(r13, r0)
                r11.<init>()
                java.lang.String r0 = "*."
                r1 = 0
                r2 = 2
                r3 = 0
                boolean r0 = bf.o.I(r12, r0, r1, r2, r3)
                r4 = -1
                if (r0 == 0) goto L26
                r7 = 1
                r8 = 0
                r9 = 4
                r10 = 0
                java.lang.String r6 = "*"
                r5 = r12
                int r0 = bf.o.a0(r5, r6, r7, r8, r9, r10)
                if (r0 == r4) goto L48
            L26:
                java.lang.String r0 = "**."
                boolean r0 = bf.o.I(r12, r0, r1, r2, r3)
                if (r0 == 0) goto L3b
                r7 = 2
                r8 = 0
                r9 = 4
                r10 = 0
                java.lang.String r6 = "*"
                r5 = r12
                int r0 = bf.o.a0(r5, r6, r7, r8, r9, r10)
                if (r0 == r4) goto L48
            L3b:
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                java.lang.String r6 = "*"
                r5 = r12
                int r0 = bf.o.a0(r5, r6, r7, r8, r9, r10)
                if (r0 != r4) goto L4a
            L48:
                r0 = 1
                goto L4b
            L4a:
                r0 = r1
            L4b:
                if (r0 == 0) goto Lc2
                java.lang.String r0 = pf.a.e(r12)
                if (r0 == 0) goto Lb6
                r11.f18170a = r0
                java.lang.String r12 = "sha1/"
                boolean r12 = bf.o.I(r13, r12, r1, r2, r3)
                java.lang.String r0 = "Invalid pin hash: "
                java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
                if (r12 == 0) goto L82
                java.lang.String r12 = "sha1"
                r11.f18171b = r12
                eg.f$a r12 = eg.f.Companion
                r1 = 5
                java.lang.String r1 = r13.substring(r1)
                hc.t.d(r1, r4)
                eg.f r12 = r12.a(r1)
                if (r12 == 0) goto L78
            L75:
                r11.f18172c = r12
                goto L9f
            L78:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = hc.t.l(r0, r13)
                r12.<init>(r13)
                throw r12
            L82:
                java.lang.String r12 = "sha256/"
                boolean r12 = bf.o.I(r13, r12, r1, r2, r3)
                if (r12 == 0) goto Laa
                java.lang.String r12 = "sha256"
                r11.f18171b = r12
                eg.f$a r12 = eg.f.Companion
                r1 = 7
                java.lang.String r1 = r13.substring(r1)
                hc.t.d(r1, r4)
                eg.f r12 = r12.a(r1)
                if (r12 == 0) goto La0
                goto L75
            L9f:
                return
            La0:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = hc.t.l(r0, r13)
                r12.<init>(r13)
                throw r12
            Laa:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "pins must start with 'sha256/' or 'sha1/': "
                java.lang.String r13 = hc.t.l(r0, r13)
                r12.<init>(r13)
                throw r12
            Lb6:
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Invalid pattern: "
                java.lang.String r12 = hc.t.l(r0, r12)
                r13.<init>(r12)
                throw r13
            Lc2:
                java.lang.String r13 = "Unexpected pattern: "
                java.lang.String r12 = hc.t.l(r13, r12)
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r12.toString()
                r13.<init>(r12)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: of.g.c.<init>(java.lang.String, java.lang.String):void");
        }

        public final eg.f a() {
            return this.f18172c;
        }

        public final String b() {
            return this.f18171b;
        }

        public final boolean c(String str) {
            boolean I;
            boolean I2;
            boolean z10;
            int f02;
            boolean z11;
            hc.t.e(str, "hostname");
            I = bf.x.I(this.f18170a, "**.", false, 2, null);
            if (I) {
                int length = this.f18170a.length() - 3;
                int length2 = str.length() - length;
                z11 = bf.x.z(str, str.length() - length, this.f18170a, 3, length, false, 16, null);
                if (!z11) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                I2 = bf.x.I(this.f18170a, "*.", false, 2, null);
                if (!I2) {
                    return hc.t.a(str, this.f18170a);
                }
                int length3 = this.f18170a.length() - 1;
                int length4 = str.length() - length3;
                z10 = bf.x.z(str, str.length() - length3, this.f18170a, 1, length3, false, 16, null);
                if (!z10) {
                    return false;
                }
                f02 = bf.y.f0(str, '.', length4 - 1, false, 4, null);
                if (f02 != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return hc.t.a(this.f18170a, cVar.f18170a) && hc.t.a(this.f18171b, cVar.f18171b) && hc.t.a(this.f18172c, cVar.f18172c);
        }

        public int hashCode() {
            return (((this.f18170a.hashCode() * 31) + this.f18171b.hashCode()) * 31) + this.f18172c.hashCode();
        }

        public String toString() {
            return this.f18171b + '/' + this.f18172c.b();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Ljava/security/cert/X509Certificate;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends hc.v implements gc.a<List<? extends X509Certificate>> {

        /* renamed from: d */
        final /* synthetic */ List<Certificate> f18174d;

        /* renamed from: q */
        final /* synthetic */ String f18175q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends Certificate> list, String str) {
            super(0);
            g.this = r1;
            this.f18174d = list;
            this.f18175q = str;
        }

        @Override // gc.a
        public final List<? extends X509Certificate> invoke() {
            int s10;
            bg.c d10 = g.this.d();
            List<Certificate> a10 = d10 == null ? null : d10.a(this.f18174d, this.f18175q);
            if (a10 == null) {
                a10 = this.f18174d;
            }
            s10 = ub.v.s(a10, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (Certificate certificate : a10) {
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public g(Set<c> set, bg.c cVar) {
        hc.t.e(set, "pins");
        this.f18167a = set;
        this.f18168b = cVar;
    }

    public /* synthetic */ g(Set set, bg.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }

    public final void a(String str, List<? extends Certificate> list) {
        hc.t.e(str, "hostname");
        hc.t.e(list, "peerCertificates");
        b(str, new d(list, str));
    }

    public final void b(String str, gc.a<? extends List<? extends X509Certificate>> aVar) {
        hc.t.e(str, "hostname");
        hc.t.e(aVar, "cleanedPeerCertificatesFn");
        List<c> c10 = c(str);
        if (c10.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = aVar.invoke();
        for (X509Certificate x509Certificate : invoke) {
            eg.f fVar = null;
            eg.f fVar2 = null;
            for (c cVar : c10) {
                String b10 = cVar.b();
                if (hc.t.a(b10, "sha256")) {
                    if (fVar == null) {
                        fVar = Companion.c(x509Certificate);
                    }
                    if (hc.t.a(cVar.a(), fVar)) {
                        return;
                    }
                } else if (!hc.t.a(b10, "sha1")) {
                    throw new AssertionError(hc.t.l("unsupported hashAlgorithm: ", cVar.b()));
                } else {
                    if (fVar2 == null) {
                        fVar2 = Companion.b(x509Certificate);
                    }
                    if (hc.t.a(cVar.a(), fVar2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : invoke) {
            sb2.append("\n    ");
            sb2.append(Companion.a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(":");
        for (c cVar2 : c10) {
            sb2.append("\n    ");
            sb2.append(cVar2);
        }
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb3);
    }

    public final List<c> c(String str) {
        List<c> h10;
        hc.t.e(str, "hostname");
        Set<c> set = this.f18167a;
        h10 = ub.u.h();
        for (Object obj : set) {
            if (((c) obj).c(str)) {
                if (h10.isEmpty()) {
                    h10 = new ArrayList<>();
                }
                q0.b(h10).add(obj);
            }
        }
        return h10;
    }

    public final bg.c d() {
        return this.f18168b;
    }

    public final g e(bg.c cVar) {
        hc.t.e(cVar, "certificateChainCleaner");
        return hc.t.a(this.f18168b, cVar) ? this : new g(this.f18167a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (hc.t.a(gVar.f18167a, this.f18167a) && hc.t.a(gVar.f18168b, this.f18168b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (1517 + this.f18167a.hashCode()) * 41;
        bg.c cVar = this.f18168b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
