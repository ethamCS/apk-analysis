package e;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: e */
    private static final m[] f4367e;

    /* renamed from: f */
    private static final m[] f4368f;

    /* renamed from: g */
    public static final p f4369g;

    /* renamed from: h */
    public static final p f4370h = new a(false).a();

    /* renamed from: a */
    final boolean f4371a;

    /* renamed from: b */
    final boolean f4372b;
    @Nullable

    /* renamed from: c */
    final String[] f4373c;
    @Nullable

    /* renamed from: d */
    final String[] f4374d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        boolean f4375a;
        @Nullable

        /* renamed from: b */
        String[] f4376b;
        @Nullable

        /* renamed from: c */
        String[] f4377c;

        /* renamed from: d */
        boolean f4378d;

        public a(p pVar) {
            this.f4375a = pVar.f4371a;
            this.f4376b = pVar.f4373c;
            this.f4377c = pVar.f4374d;
            this.f4378d = pVar.f4372b;
        }

        a(boolean z) {
            this.f4375a = z;
        }

        public p a() {
            return new p(this);
        }

        public a b(String... strArr) {
            if (this.f4375a) {
                if (strArr.length == 0) {
                    throw new IllegalArgumentException("At least one cipher suite is required");
                }
                this.f4376b = (String[]) strArr.clone();
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a c(m... mVarArr) {
            if (this.f4375a) {
                String[] strArr = new String[mVarArr.length];
                for (int i = 0; i < mVarArr.length; i++) {
                    strArr[i] = mVarArr[i].f4056a;
                }
                b(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a d(boolean z) {
            if (this.f4375a) {
                this.f4378d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a e(String... strArr) {
            if (this.f4375a) {
                if (strArr.length == 0) {
                    throw new IllegalArgumentException("At least one TLS version is required");
                }
                this.f4377c = (String[]) strArr.clone();
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a f(l0... l0VarArr) {
            if (this.f4375a) {
                String[] strArr = new String[l0VarArr.length];
                for (int i = 0; i < l0VarArr.length; i++) {
                    strArr[i] = l0VarArr[i].f4048b;
                }
                e(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    static {
        m mVar = m.q;
        m mVar2 = m.r;
        m mVar3 = m.s;
        m mVar4 = m.k;
        m mVar5 = m.m;
        m mVar6 = m.l;
        m mVar7 = m.n;
        m mVar8 = m.p;
        m mVar9 = m.o;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9};
        f4367e = mVarArr;
        m[] mVarArr2 = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, m.i, m.j, m.f4054g, m.f4055h, m.f4052e, m.f4053f, m.f4051d};
        f4368f = mVarArr2;
        a aVar = new a(true);
        aVar.c(mVarArr);
        l0 l0Var = l0.TLS_1_3;
        l0 l0Var2 = l0.TLS_1_2;
        aVar.f(l0Var, l0Var2);
        aVar.d(true);
        aVar.a();
        a aVar2 = new a(true);
        aVar2.c(mVarArr2);
        aVar2.f(l0Var, l0Var2);
        aVar2.d(true);
        f4369g = aVar2.a();
        a aVar3 = new a(true);
        aVar3.c(mVarArr2);
        aVar3.f(l0Var, l0Var2, l0.TLS_1_1, l0.TLS_1_0);
        aVar3.d(true);
        aVar3.a();
    }

    p(a aVar) {
        this.f4371a = aVar.f4375a;
        this.f4373c = aVar.f4376b;
        this.f4374d = aVar.f4377c;
        this.f4372b = aVar.f4378d;
    }

    private p e(SSLSocket sSLSocket, boolean z) {
        String[] x = this.f4373c != null ? e.m0.e.x(m.f4049b, sSLSocket.getEnabledCipherSuites(), this.f4373c) : sSLSocket.getEnabledCipherSuites();
        String[] x2 = this.f4374d != null ? e.m0.e.x(e.m0.e.i, sSLSocket.getEnabledProtocols(), this.f4374d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int u = e.m0.e.u(m.f4049b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && u != -1) {
            x = e.m0.e.g(x, supportedCipherSuites[u]);
        }
        a aVar = new a(this);
        aVar.b(x);
        aVar.e(x2);
        return aVar.a();
    }

    public void a(SSLSocket sSLSocket, boolean z) {
        p e2 = e(sSLSocket, z);
        String[] strArr = e2.f4374d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e2.f4373c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Nullable
    public List<m> b() {
        String[] strArr = this.f4373c;
        if (strArr != null) {
            return m.b(strArr);
        }
        return null;
    }

    public boolean c(SSLSocket sSLSocket) {
        if (!this.f4371a) {
            return false;
        }
        String[] strArr = this.f4374d;
        if (strArr != null && !e.m0.e.A(e.m0.e.i, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f4373c;
        return strArr2 == null || e.m0.e.A(m.f4049b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean d() {
        return this.f4371a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        p pVar = (p) obj;
        boolean z = this.f4371a;
        if (z != pVar.f4371a) {
            return false;
        }
        return !z || (Arrays.equals(this.f4373c, pVar.f4373c) && Arrays.equals(this.f4374d, pVar.f4374d) && this.f4372b == pVar.f4372b);
    }

    public boolean f() {
        return this.f4372b;
    }

    @Nullable
    public List<l0> g() {
        String[] strArr = this.f4374d;
        if (strArr != null) {
            return l0.e(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f4371a) {
            return ((((527 + Arrays.hashCode(this.f4373c)) * 31) + Arrays.hashCode(this.f4374d)) * 31) + (!this.f4372b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f4371a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(g(), "[all enabled]") + ", supportsTlsExtensions=" + this.f4372b + ")";
    }
}
