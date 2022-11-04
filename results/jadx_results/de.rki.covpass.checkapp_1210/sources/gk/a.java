package gk;

import ek.g;
import ek.h;
import ek.i;
import ek.j;
import ek.k;
import ek.l;
import hh.n;
import hh.p;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.security.auth.x500.X500Principal;
import oi.d;
import org.bouncycastle.jce.provider.X509AttrCertParser;
import org.bouncycastle.jce.provider.X509CRLParser;
import org.bouncycastle.jce.provider.X509CertPairParser;
import org.bouncycastle.jce.provider.X509CertParser;
import org.conscrypt.BuildConfig;
/* loaded from: classes3.dex */
public class a {

    /* renamed from: c */
    private static String f11060c = "com.sun.jndi.ldap.LdapCtxFactory";

    /* renamed from: d */
    private static String f11061d = "ignore";

    /* renamed from: e */
    private static int f11062e = 32;

    /* renamed from: f */
    private static long f11063f = 60000;

    /* renamed from: a */
    private d f11064a;

    /* renamed from: b */
    private Map f11065b = new HashMap(f11062e);

    public a(d dVar) {
        this.f11064a = dVar;
    }

    private String[] A(String str) {
        return str.split("\\s+");
    }

    private synchronized void a(String str, List list) {
        Map map;
        Date date = new Date(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        arrayList.add(date);
        arrayList.add(list);
        if (this.f11065b.containsKey(str)) {
            map = this.f11065b;
        } else {
            if (this.f11065b.size() >= f11062e) {
                long time = date.getTime();
                Object obj = null;
                for (Map.Entry entry : this.f11065b.entrySet()) {
                    long time2 = ((Date) ((List) entry.getValue()).get(0)).getTime();
                    if (time2 < time) {
                        obj = entry.getKey();
                        time = time2;
                    }
                }
                this.f11065b.remove(obj);
            }
            map = this.f11065b;
        }
        map.put(str, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c A[LOOP:0: B:28:0x009c->B:30:0x009f, LOOP_START, PHI: r4 
      PHI: (r4v5 int) = (r4v1 int), (r4v6 int) binds: [B:27:0x009a, B:30:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9 A[LOOP:1: B:36:0x00d3->B:38:0x00d9, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List b(ek.g r7, java.lang.String[] r8, java.lang.String[] r9, java.lang.String[] r10) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            ek.a r2 = r7.d()
            r3 = 0
            if (r2 == 0) goto L3d
            ek.a r2 = r7.d()
            java.math.BigInteger r2 = r2.i()
            if (r2 == 0) goto L2a
            ek.a r2 = r7.d()
            java.math.BigInteger r2 = r2.i()
            java.lang.String r2 = r2.toString()
            r1.add(r2)
        L2a:
            ek.a r2 = r7.d()
            java.security.Principal[] r2 = r2.d()
            if (r2 == 0) goto L3d
            ek.a r2 = r7.d()
            java.security.Principal[] r2 = r2.d()
            goto L3e
        L3d:
            r2 = r3
        L3e:
            ek.h r4 = r7.a()
            if (r4 == 0) goto L6d
            ek.h r4 = r7.a()
            ek.a r4 = r4.b()
            java.security.Principal[] r4 = r4.d()
            if (r4 == 0) goto L5e
            ek.h r2 = r7.a()
            ek.a r2 = r2.b()
            java.security.Principal[] r2 = r2.d()
        L5e:
            ek.h r4 = r7.a()
            java.math.BigInteger r4 = r4.getSerialNumber()
            java.lang.String r4 = r4.toString()
            r1.add(r4)
        L6d:
            r4 = 0
            if (r2 == 0) goto L87
            r3 = r2[r4]
            boolean r3 = r3 instanceof javax.security.auth.x500.X500Principal
            if (r3 == 0) goto L81
            r2 = r2[r4]
            javax.security.auth.x500.X500Principal r2 = (javax.security.auth.x500.X500Principal) r2
            java.lang.String r3 = "RFC1779"
            java.lang.String r3 = r2.getName(r3)
            goto L87
        L81:
            r2 = r2[r4]
            java.lang.String r3 = r2.getName()
        L87:
            java.math.BigInteger r2 = r7.e()
            if (r2 == 0) goto L98
            java.math.BigInteger r7 = r7.e()
            java.lang.String r7 = r7.toString()
            r1.add(r7)
        L98:
            java.lang.String r7 = "*"
            if (r3 == 0) goto Lc1
        L9c:
            int r2 = r10.length
            if (r4 >= r2) goto Lc1
            r2 = r10[r4]
            java.lang.String r2 = r6.y(r3, r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r2)
            r5.append(r7)
            java.lang.String r2 = r5.toString()
            java.util.List r2 = r6.z(r9, r2, r8)
            r0.addAll(r2)
            int r4 = r4 + 1
            goto L9c
        Lc1:
            int r10 = r1.size()
            if (r10 <= 0) goto Lf1
            oi.d r10 = r6.f11064a
            java.lang.String r10 = r10.P()
            if (r10 == 0) goto Lf1
            java.util.Iterator r10 = r1.iterator()
        Ld3:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Lf1
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            oi.d r4 = r6.f11064a
            java.lang.String r4 = r4.P()
            java.lang.String[] r4 = r6.A(r4)
            java.util.List r2 = r6.z(r4, r2, r8)
            r0.addAll(r2)
            goto Ld3
        Lf1:
            int r10 = r1.size()
            if (r10 != 0) goto L100
            if (r3 != 0) goto L100
            java.util.List r7 = r6.z(r9, r7, r8)
            r0.addAll(r7)
        L100:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.a.b(ek.g, java.lang.String[], java.lang.String[], java.lang.String[]):java.util.List");
    }

    private List c(i iVar, String[] strArr, String[] strArr2, String[] strArr3) {
        ArrayList arrayList = new ArrayList();
        HashSet<X500Principal> hashSet = new HashSet();
        if (iVar.getIssuers() != null) {
            hashSet.addAll(iVar.getIssuers());
        }
        if (iVar.getCertificateChecking() != null) {
            hashSet.add(r(iVar.getCertificateChecking()));
        }
        if (iVar.a() != null) {
            Principal[] c10 = iVar.a().e().c();
            for (int i10 = 0; i10 < c10.length; i10++) {
                if (c10[i10] instanceof X500Principal) {
                    hashSet.add(c10[i10]);
                }
            }
        }
        String str = null;
        for (X500Principal x500Principal : hashSet) {
            str = x500Principal.getName("RFC1779");
            for (String str2 : strArr3) {
                arrayList.addAll(z(strArr2, "*" + y(str, str2) + "*", strArr));
            }
        }
        if (str == null) {
            arrayList.addAll(z(strArr2, "*", strArr));
        }
        return arrayList;
    }

    private List d(k kVar, String[] strArr, String[] strArr2, String[] strArr3) {
        ArrayList arrayList = new ArrayList();
        String w9 = w(kVar);
        String bigInteger = kVar.getSerialNumber() != null ? kVar.getSerialNumber().toString() : null;
        if (kVar.getCertificate() != null) {
            w9 = kVar.getCertificate().getSubjectX500Principal().getName("RFC1779");
            bigInteger = kVar.getCertificate().getSerialNumber().toString();
        }
        if (w9 != null) {
            for (String str : strArr3) {
                arrayList.addAll(z(strArr2, "*" + y(w9, str) + "*", strArr));
            }
        }
        if (bigInteger != null && this.f11064a.P() != null) {
            arrayList.addAll(z(A(this.f11064a.P()), bigInteger, strArr));
        }
        if (bigInteger == null && w9 == null) {
            arrayList.addAll(z(strArr2, "*", strArr));
        }
        return arrayList;
    }

    private DirContext e() {
        Properties properties = new Properties();
        properties.setProperty("java.naming.factory.initial", f11060c);
        properties.setProperty("java.naming.batchsize", "0");
        properties.setProperty("java.naming.provider.url", this.f11064a.N());
        properties.setProperty("java.naming.factory.url.pkgs", "com.sun.jndi.url");
        properties.setProperty("java.naming.referral", f11061d);
        properties.setProperty("java.naming.security.authentication", "none");
        return new InitialDirContext(properties);
    }

    private Set f(List list, g gVar) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        X509AttrCertParser x509AttrCertParser = new X509AttrCertParser();
        while (it.hasNext()) {
            try {
                x509AttrCertParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                h hVar = (h) x509AttrCertParser.engineRead();
                if (gVar.z(hVar)) {
                    hashSet.add(hVar);
                }
            } catch (b unused) {
            }
        }
        return hashSet;
    }

    private Set g(List list, i iVar) {
        HashSet hashSet = new HashSet();
        X509CRLParser x509CRLParser = new X509CRLParser();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                x509CRLParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                X509CRL x509crl = (X509CRL) x509CRLParser.engineRead();
                if (iVar.z(x509crl)) {
                    hashSet.add(x509crl);
                }
            } catch (b unused) {
            }
        }
        return hashSet;
    }

    private Set h(List list, k kVar) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        X509CertParser x509CertParser = new X509CertParser();
        while (it.hasNext()) {
            try {
                x509CertParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                X509Certificate x509Certificate = (X509Certificate) x509CertParser.engineRead();
                if (kVar.z(x509Certificate)) {
                    hashSet.add(x509Certificate);
                }
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }

    private Set i(List list, j jVar) {
        l lVar;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (i10 < list.size()) {
            try {
                try {
                    X509CertPairParser x509CertPairParser = new X509CertPairParser();
                    x509CertPairParser.engineInit(new ByteArrayInputStream((byte[]) list.get(i10)));
                    lVar = (l) x509CertPairParser.engineRead();
                } catch (b unused) {
                    int i11 = i10 + 1;
                    i10 = i11;
                    lVar = new l(new p(n.n(new gg.p((byte[]) list.get(i10)).s()), n.n(new gg.p((byte[]) list.get(i11)).s())));
                }
                if (jVar.z(lVar)) {
                    hashSet.add(lVar);
                }
            } catch (IOException | CertificateParsingException unused2) {
            }
            i10++;
        }
        return hashSet;
    }

    private List j(j jVar, String[] strArr, String[] strArr2, String[] strArr3) {
        ArrayList arrayList = new ArrayList();
        String w9 = jVar.c() != null ? w(jVar.c()) : null;
        if (jVar.a() != null && jVar.a().a() != null) {
            w9 = jVar.a().a().getSubjectX500Principal().getName("RFC1779");
        }
        if (w9 != null) {
            for (String str : strArr3) {
                arrayList.addAll(z(strArr2, "*" + y(w9, str) + "*", strArr));
            }
        }
        if (w9 == null) {
            arrayList.addAll(z(strArr2, "*", strArr));
        }
        return arrayList;
    }

    private X500Principal r(X509Certificate x509Certificate) {
        return x509Certificate.getIssuerX500Principal();
    }

    private List v(String str) {
        List list = (List) this.f11065b.get(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (list == null || ((Date) list.get(0)).getTime() < currentTimeMillis - f11063f) {
            return null;
        }
        return (List) list.get(1);
    }

    private String w(k kVar) {
        try {
            byte[] subjectAsBytes = kVar.getSubjectAsBytes();
            if (subjectAsBytes == null) {
                return null;
            }
            return new X500Principal(subjectAsBytes).getName("RFC1779");
        } catch (IOException e10) {
            throw new ak.p("exception processing name: " + e10.getMessage(), e10);
        }
    }

    private String y(String str, String str2) {
        String lowerCase = str.toLowerCase();
        int indexOf = lowerCase.indexOf(str2.toLowerCase() + "=");
        if (indexOf == -1) {
            return BuildConfig.FLAVOR;
        }
        String substring = str.substring(indexOf + str2.length());
        int indexOf2 = substring.indexOf(44);
        if (indexOf2 == -1) {
            indexOf2 = substring.length();
        }
        while (substring.charAt(indexOf2 - 1) == '\\') {
            indexOf2 = substring.indexOf(44, indexOf2 + 1);
            if (indexOf2 == -1) {
                indexOf2 = substring.length();
            }
        }
        String substring2 = substring.substring(0, indexOf2);
        String substring3 = substring2.substring(substring2.indexOf(61) + 1);
        if (substring3.charAt(0) == ' ') {
            substring3 = substring3.substring(1);
        }
        if (substring3.startsWith("\"")) {
            substring3 = substring3.substring(1);
        }
        return substring3.endsWith("\"") ? substring3.substring(0, substring3.length() - 1) : substring3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0106, code lost:
        if (r3 != null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List z(java.lang.String[] r10, java.lang.String r11, java.lang.String[] r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.a.z(java.lang.String[], java.lang.String, java.lang.String[]):java.util.List");
    }

    public Collection k(g gVar) {
        String[] A = A(this.f11064a.c());
        String[] A2 = A(this.f11064a.C());
        String[] A3 = A(this.f11064a.d());
        Set f10 = f(b(gVar, A, A2, A3), gVar);
        if (f10.size() == 0) {
            f10.addAll(f(b(new g(), A, A2, A3), gVar));
        }
        return f10;
    }

    public Collection l(i iVar) {
        String[] A = A(this.f11064a.e());
        String[] A2 = A(this.f11064a.D());
        String[] A3 = A(this.f11064a.f());
        Set g10 = g(c(iVar, A, A2, A3), iVar);
        if (g10.size() == 0) {
            g10.addAll(g(c(new i(), A, A2, A3), iVar));
        }
        return g10;
    }

    public Collection m(g gVar) {
        String[] A = A(this.f11064a.g());
        String[] A2 = A(this.f11064a.E());
        String[] A3 = A(this.f11064a.h());
        Set f10 = f(b(gVar, A, A2, A3), gVar);
        if (f10.size() == 0) {
            f10.addAll(f(b(new g(), A, A2, A3), gVar));
        }
        return f10;
    }

    public Collection n(i iVar) {
        String[] A = A(this.f11064a.i());
        String[] A2 = A(this.f11064a.F());
        String[] A3 = A(this.f11064a.j());
        Set g10 = g(c(iVar, A, A2, A3), iVar);
        if (g10.size() == 0) {
            g10.addAll(g(c(new i(), A, A2, A3), iVar));
        }
        return g10;
    }

    public Collection o(g gVar) {
        String[] A = A(this.f11064a.k());
        String[] A2 = A(this.f11064a.H());
        String[] A3 = A(this.f11064a.l());
        Set f10 = f(b(gVar, A, A2, A3), gVar);
        if (f10.size() == 0) {
            f10.addAll(f(b(new g(), A, A2, A3), gVar));
        }
        return f10;
    }

    public Collection p(i iVar) {
        String[] A = A(this.f11064a.m());
        String[] A2 = A(this.f11064a.I());
        String[] A3 = A(this.f11064a.o());
        Set g10 = g(c(iVar, A, A2, A3), iVar);
        if (g10.size() == 0) {
            g10.addAll(g(c(new i(), A, A2, A3), iVar));
        }
        return g10;
    }

    public Collection q(k kVar) {
        String[] A = A(this.f11064a.q());
        String[] A2 = A(this.f11064a.J());
        String[] A3 = A(this.f11064a.t());
        Set h10 = h(d(kVar, A, A2, A3), kVar);
        if (h10.size() == 0) {
            h10.addAll(h(d(new k(), A, A2, A3), kVar));
        }
        return h10;
    }

    public Collection s(i iVar) {
        String[] A = A(this.f11064a.v());
        String[] A2 = A(this.f11064a.K());
        String[] A3 = A(this.f11064a.w());
        Set g10 = g(c(iVar, A, A2, A3), iVar);
        if (g10.size() == 0) {
            g10.addAll(g(c(new i(), A, A2, A3), iVar));
        }
        return g10;
    }

    public Collection t(j jVar) {
        String[] A = A(this.f11064a.x());
        String[] A2 = A(this.f11064a.L());
        String[] A3 = A(this.f11064a.y());
        Set i10 = i(j(jVar, A, A2, A3), jVar);
        if (i10.size() == 0) {
            k kVar = new k();
            j jVar2 = new j();
            jVar2.d(kVar);
            jVar2.e(kVar);
            i10.addAll(i(j(jVar2, A, A2, A3), jVar));
        }
        return i10;
    }

    public Collection u(i iVar) {
        String[] A = A(this.f11064a.A());
        String[] A2 = A(this.f11064a.M());
        String[] A3 = A(this.f11064a.B());
        Set g10 = g(c(iVar, A, A2, A3), iVar);
        if (g10.size() == 0) {
            g10.addAll(g(c(new i(), A, A2, A3), iVar));
        }
        return g10;
    }

    public Collection x(k kVar) {
        String[] A = A(this.f11064a.Q());
        String[] A2 = A(this.f11064a.O());
        String[] A3 = A(this.f11064a.R());
        Set h10 = h(d(kVar, A, A2, A3), kVar);
        if (h10.size() == 0) {
            h10.addAll(h(d(new k(), A, A2, A3), kVar));
        }
        return h10;
    }
}
