package ji;

import java.security.InvalidParameterException;
import java.security.cert.CertPathParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import ji.s;
/* loaded from: classes3.dex */
public class r implements CertPathParameters {

    /* renamed from: c */
    private final s f14421c;

    /* renamed from: d */
    private final Set<X509Certificate> f14422d;

    /* renamed from: q */
    private final int f14423q;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private final s f14424a;

        /* renamed from: b */
        private int f14425b;

        /* renamed from: c */
        private Set<X509Certificate> f14426c;

        public b(PKIXBuilderParameters pKIXBuilderParameters) {
            this.f14425b = 5;
            this.f14426c = new HashSet();
            this.f14424a = new s.b(pKIXBuilderParameters).o();
            this.f14425b = pKIXBuilderParameters.getMaxPathLength();
        }

        public b(s sVar) {
            this.f14425b = 5;
            this.f14426c = new HashSet();
            this.f14424a = sVar;
        }

        public b d(Set<X509Certificate> set) {
            this.f14426c.addAll(set);
            return this;
        }

        public r e() {
            return new r(this);
        }

        public b f(int i10) {
            if (i10 >= -1) {
                this.f14425b = i10;
                return this;
            }
            throw new InvalidParameterException("The maximum path length parameter can not be less than -1.");
        }
    }

    private r(b bVar) {
        this.f14421c = bVar.f14424a;
        this.f14422d = Collections.unmodifiableSet(bVar.f14426c);
        this.f14423q = bVar.f14425b;
    }

    public s a() {
        return this.f14421c;
    }

    public Set c() {
        return this.f14422d;
    }

    @Override // java.security.cert.CertPathParameters
    public Object clone() {
        return this;
    }

    public int d() {
        return this.f14423q;
    }
}
