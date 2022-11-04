package cj;

import gg.a0;
import gg.d0;
import gg.q;
import gg.r1;
import gg.v;
import hh.n0;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import zg.s;
import zg.w;
/* loaded from: classes3.dex */
public class f extends dk.e {

    /* renamed from: c */
    protected final Map f6624c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b implements cj.e {
        private b() {
            f.this = r1;
        }

        @Override // cj.e
        public cj.d a(byte[] bArr) {
            try {
                d0 F = d0.F(bArr);
                if (F.size() != 6) {
                    throw new cj.c("malformed sequence in DSA private key");
                }
                q E = q.E(F.G(1));
                q E2 = q.E(F.G(2));
                q E3 = q.E(F.G(3));
                q E4 = q.E(F.G(4));
                q E5 = q.E(F.G(5));
                v vVar = ih.o.A0;
                return new cj.d(new n0(new hh.b(vVar, new hh.q(E.G(), E2.G(), E3.G())), E4), new s(new hh.b(vVar, new hh.q(E.G(), E2.G(), E3.G())), E5));
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new cj.c("problem creating DSA private key: " + e11.toString(), e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class c implements dk.d {
        private c() {
            f.this = r1;
        }

        @Override // dk.d
        public Object a(dk.b bVar) {
            try {
                a0 u10 = a0.u(bVar.b());
                if (u10 instanceof v) {
                    return a0.u(bVar.b());
                }
                if (!(u10 instanceof d0)) {
                    return null;
                }
                return ih.i.o(u10);
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new cj.c("exception extracting EC named curve: " + e11.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class d implements cj.e {
        private d() {
            f.this = r1;
        }

        @Override // cj.e
        public cj.d a(byte[] bArr) {
            try {
                bh.a l10 = bh.a.l(d0.F(bArr));
                hh.b bVar = new hh.b(ih.o.Q, l10.o());
                s sVar = new s(bVar, l10);
                return l10.q() != null ? new cj.d(new n0(bVar, l10.q().D()), sVar) : new cj.d(null, sVar);
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new cj.c("problem creating EC private key: " + e11.toString(), e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class e implements dk.d {
        public e() {
            f.this = r1;
        }

        @Override // dk.d
        public Object a(dk.b bVar) {
            try {
                return new ej.b(zg.i.n(bVar.b()));
            } catch (Exception e10) {
                throw new cj.c("problem parsing ENCRYPTED PRIVATE KEY: " + e10.toString(), e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cj.f$f */
    /* loaded from: classes3.dex */
    public class C0094f implements dk.d {

        /* renamed from: a */
        private final cj.e f6629a;

        public C0094f(cj.e eVar) {
            f.this = r1;
            this.f6629a = eVar;
        }

        @Override // dk.d
        public Object a(dk.b bVar) {
            boolean z10 = false;
            String str = null;
            for (dk.a aVar : bVar.c()) {
                if (aVar.b().equals("Proc-Type") && aVar.c().equals("4,ENCRYPTED")) {
                    z10 = true;
                } else if (aVar.b().equals("DEK-Info")) {
                    str = aVar.c();
                }
            }
            byte[] b10 = bVar.b();
            try {
                if (!z10) {
                    return this.f6629a.a(b10);
                }
                StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
                return new cj.b(stringTokenizer.nextToken(), bk.f.a(stringTokenizer.nextToken()), b10, this.f6629a);
            } catch (IOException e10) {
                if (!z10) {
                    throw new cj.c(e10.getMessage(), e10);
                }
                throw new cj.c("exception decoding - please check password and data.", e10);
            } catch (IllegalArgumentException e11) {
                if (!z10) {
                    throw new cj.c(e11.getMessage(), e11);
                }
                throw new cj.c("exception decoding - please check password and data.", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class g implements dk.d {
        private g() {
            f.this = r1;
        }

        @Override // dk.d
        public Object a(dk.b bVar) {
            try {
                return new ej.a(bVar.b());
            } catch (Exception e10) {
                throw new cj.c("problem parsing certrequest: " + e10.toString(), e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class h implements dk.d {
        private h() {
            f.this = r1;
        }

        @Override // dk.d
        public Object a(dk.b bVar) {
            try {
                return jg.a.l(new gg.p(bVar.b()).s());
            } catch (Exception e10) {
                throw new cj.c("problem parsing PKCS7 object: " + e10.toString(), e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class i implements dk.d {
        public i() {
            f.this = r1;
        }

        @Override // dk.d
        public Object a(dk.b bVar) {
            try {
                return s.m(bVar.b());
            } catch (Exception e10) {
                throw new cj.c("problem parsing PRIVATE KEY: " + e10.toString(), e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class j implements dk.d {
        public j() {
            f.this = r1;
        }

        @Override // dk.d
        public Object a(dk.b bVar) {
            return n0.n(bVar.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class k implements cj.e {
        private k() {
            f.this = r1;
        }

        @Override // cj.e
        public cj.d a(byte[] bArr) {
            try {
                d0 F = d0.F(bArr);
                if (F.size() != 9) {
                    throw new cj.c("malformed sequence in RSA private key");
                }
                zg.v o10 = zg.v.o(F);
                w wVar = new w(o10.q(), o10.w());
                hh.b bVar = new hh.b(zg.q.Z0, r1.f10880d);
                return new cj.d(new n0(bVar, wVar), new s(bVar, o10));
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new cj.c("problem creating RSA private key: " + e11.toString(), e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class l implements dk.d {
        public l() {
            f.this = r1;
        }

        @Override // dk.d
        public Object a(dk.b bVar) {
            try {
                return new n0(new hh.b(zg.q.Z0, r1.f10880d), w.l(bVar.b()));
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new cj.c("problem extracting key: " + e11.toString(), e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class m implements dk.d {
        private m() {
            f.this = r1;
        }

        @Override // dk.d
        public Object a(dk.b bVar) {
            return new jh.c(bVar.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class n implements dk.d {
        private n() {
            f.this = r1;
        }

        @Override // dk.d
        public Object a(dk.b bVar) {
            try {
                return new jh.d(bVar.b());
            } catch (Exception e10) {
                throw new cj.c("problem parsing cert: " + e10.toString(), e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class o implements dk.d {
        private o() {
            f.this = r1;
        }

        @Override // dk.d
        public Object a(dk.b bVar) {
            try {
                return new jh.e(bVar.b());
            } catch (Exception e10) {
                throw new cj.c("problem parsing cert: " + e10.toString(), e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class p implements dk.d {
        private p() {
            f.this = r1;
        }

        @Override // dk.d
        public Object a(dk.b bVar) {
            try {
                return new cj.g(bVar.b());
            } catch (Exception e10) {
                throw new cj.c("problem parsing cert: " + e10.toString(), e10);
            }
        }
    }

    public f(Reader reader) {
        super(reader);
        HashMap hashMap = new HashMap();
        this.f6624c = hashMap;
        hashMap.put("CERTIFICATE REQUEST", new g());
        hashMap.put("NEW CERTIFICATE REQUEST", new g());
        hashMap.put("CERTIFICATE", new o());
        hashMap.put("TRUSTED CERTIFICATE", new p());
        hashMap.put("X509 CERTIFICATE", new o());
        hashMap.put("X509 CRL", new n());
        hashMap.put("PKCS7", new h());
        hashMap.put("CMS", new h());
        hashMap.put("ATTRIBUTE CERTIFICATE", new m());
        hashMap.put("EC PARAMETERS", new c());
        hashMap.put("PUBLIC KEY", new j());
        hashMap.put("RSA PUBLIC KEY", new l());
        hashMap.put("RSA PRIVATE KEY", new C0094f(new k()));
        hashMap.put("DSA PRIVATE KEY", new C0094f(new b()));
        hashMap.put("EC PRIVATE KEY", new C0094f(new d()));
        hashMap.put("ENCRYPTED PRIVATE KEY", new e());
        hashMap.put("PRIVATE KEY", new i());
    }

    public Object readObject() {
        dk.b e10 = e();
        if (e10 != null) {
            String d10 = e10.d();
            Object obj = this.f6624c.get(d10);
            if (obj != null) {
                return ((dk.d) obj).a(e10);
            }
            throw new IOException("unrecognised object: " + d10);
        }
        return null;
    }
}
