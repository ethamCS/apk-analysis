package of;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002%&B9\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010 \u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010 ¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0017\u0010\u0012\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00188G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001b¨\u0006'"}, d2 = {"Lof/l;", BuildConfig.FLAVOR, "Ljavax/net/ssl/SSLSocket;", "sslSocket", BuildConfig.FLAVOR, "isFallback", "g", "Ltb/e0;", "c", "(Ljavax/net/ssl/SSLSocket;Z)V", "socket", "e", "other", "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "isTls", "Z", "f", "()Z", "supportsTlsExtensions", "h", BuildConfig.FLAVOR, "Lof/i;", "d", "()Ljava/util/List;", "cipherSuites", "Lof/e0;", "i", "tlsVersions", BuildConfig.FLAVOR, "cipherSuitesAsString", "tlsVersionsAsString", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "a", "b", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: e */
    private static final i[] f18249e;

    /* renamed from: f */
    private static final i[] f18250f;

    /* renamed from: g */
    public static final l f18251g;

    /* renamed from: h */
    public static final l f18252h;

    /* renamed from: i */
    public static final l f18253i;

    /* renamed from: a */
    private final boolean f18255a;

    /* renamed from: b */
    private final boolean f18256b;

    /* renamed from: c */
    private final String[] f18257c;

    /* renamed from: d */
    private final String[] f18258d;
    public static final b Companion = new b(null);

    /* renamed from: j */
    public static final l f18254j = new a(false).a();

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b#\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b#\u0010%J!\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\b\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0002\"\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0002\"\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0002\"\u00020\u0007¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0006\u0010\u0013\u001a\u00020\u0012R\"\u0010\u0014\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019¨\u0006&"}, d2 = {"Lof/l$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lof/i;", "cipherSuites", "c", "([Lof/i;)Lof/l$a;", BuildConfig.FLAVOR, "b", "([Ljava/lang/String;)Lof/l$a;", "Lof/e0;", "tlsVersions", "j", "([Lof/e0;)Lof/l$a;", "i", BuildConfig.FLAVOR, "supportsTlsExtensions", "h", "Lof/l;", "a", "tls", "Z", "d", "()Z", "setTls$okhttp", "(Z)V", "[Ljava/lang/String;", "getCipherSuites$okhttp", "()[Ljava/lang/String;", "e", "([Ljava/lang/String;)V", "getTlsVersions$okhttp", "g", "getSupportsTlsExtensions$okhttp", "f", "<init>", "connectionSpec", "(Lof/l;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private boolean f18259a;

        /* renamed from: b */
        private String[] f18260b;

        /* renamed from: c */
        private String[] f18261c;

        /* renamed from: d */
        private boolean f18262d;

        public a(l lVar) {
            hc.t.e(lVar, "connectionSpec");
            this.f18259a = lVar.f();
            this.f18260b = lVar.f18257c;
            this.f18261c = lVar.f18258d;
            this.f18262d = lVar.h();
        }

        public a(boolean z10) {
            this.f18259a = z10;
        }

        public final l a() {
            return new l(this.f18259a, this.f18262d, this.f18260b, this.f18261c);
        }

        public final a b(String... strArr) {
            hc.t.e(strArr, "cipherSuites");
            if (d()) {
                if (!(!(strArr.length == 0))) {
                    throw new IllegalArgumentException("At least one cipher suite is required".toString());
                }
                e((String[]) strArr.clone());
                return this;
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a c(i... iVarArr) {
            hc.t.e(iVarArr, "cipherSuites");
            if (d()) {
                ArrayList arrayList = new ArrayList(iVarArr.length);
                for (i iVar : iVarArr) {
                    arrayList.add(iVar.c());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr = (String[]) array;
                return b((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final boolean d() {
            return this.f18259a;
        }

        public final void e(String[] strArr) {
            this.f18260b = strArr;
        }

        public final void f(boolean z10) {
            this.f18262d = z10;
        }

        public final void g(String[] strArr) {
            this.f18261c = strArr;
        }

        public final a h(boolean z10) {
            if (d()) {
                f(z10);
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final a i(String... strArr) {
            hc.t.e(strArr, "tlsVersions");
            if (d()) {
                if (!(!(strArr.length == 0))) {
                    throw new IllegalArgumentException("At least one TLS version is required".toString());
                }
                g((String[]) strArr.clone());
                return this;
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final a j(e0... e0VarArr) {
            hc.t.e(e0VarArr, "tlsVersions");
            if (d()) {
                ArrayList arrayList = new ArrayList(e0VarArr.length);
                for (e0 e0Var : e0VarArr) {
                    arrayList.add(e0Var.g());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr = (String[]) array;
                return i((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"Lof/l$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lof/i;", "APPROVED_CIPHER_SUITES", "[Lof/i;", "Lof/l;", "CLEARTEXT", "Lof/l;", "COMPATIBLE_TLS", "MODERN_TLS", "RESTRICTED_CIPHER_SUITES", "RESTRICTED_TLS", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        i iVar = i.f18218n1;
        i iVar2 = i.f18221o1;
        i iVar3 = i.f18224p1;
        i iVar4 = i.Z0;
        i iVar5 = i.f18188d1;
        i iVar6 = i.f18179a1;
        i iVar7 = i.f18191e1;
        i iVar8 = i.f18209k1;
        i iVar9 = i.f18206j1;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f18249e = iVarArr;
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.K0, i.L0, i.f18202i0, i.f18205j0, i.G, i.K, i.f18207k};
        f18250f = iVarArr2;
        a c10 = new a(true).c((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        e0 e0Var = e0.TLS_1_3;
        e0 e0Var2 = e0.TLS_1_2;
        f18251g = c10.j(e0Var, e0Var2).h(true).a();
        f18252h = new a(true).c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).j(e0Var, e0Var2).h(true).a();
        f18253i = new a(true).c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).j(e0Var, e0Var2, e0.TLS_1_1, e0.TLS_1_0).h(true).a();
    }

    public l(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f18255a = z10;
        this.f18256b = z11;
        this.f18257c = strArr;
        this.f18258d = strArr2;
    }

    private final l g(SSLSocket sSLSocket, boolean z10) {
        String[] strArr;
        String[] strArr2;
        Comparator b10;
        if (this.f18257c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            hc.t.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            strArr = pf.d.E(enabledCipherSuites, this.f18257c, i.Companion.c());
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f18258d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            hc.t.d(enabledProtocols, "sslSocket.enabledProtocols");
            String[] strArr3 = this.f18258d;
            b10 = wb.b.b();
            strArr2 = pf.d.E(enabledProtocols, strArr3, b10);
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        hc.t.d(supportedCipherSuites, "supportedCipherSuites");
        int x10 = pf.d.x(supportedCipherSuites, "TLS_FALLBACK_SCSV", i.Companion.c());
        if (z10 && x10 != -1) {
            hc.t.d(strArr, "cipherSuitesIntersection");
            String str = supportedCipherSuites[x10];
            hc.t.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            strArr = pf.d.o(strArr, str);
        }
        a aVar = new a(this);
        hc.t.d(strArr, "cipherSuitesIntersection");
        a b11 = aVar.b((String[]) Arrays.copyOf(strArr, strArr.length));
        hc.t.d(strArr2, "tlsVersionsIntersection");
        return b11.i((String[]) Arrays.copyOf(strArr2, strArr2.length)).a();
    }

    public final void c(SSLSocket sSLSocket, boolean z10) {
        hc.t.e(sSLSocket, "sslSocket");
        l g10 = g(sSLSocket, z10);
        if (g10.i() != null) {
            sSLSocket.setEnabledProtocols(g10.f18258d);
        }
        if (g10.d() != null) {
            sSLSocket.setEnabledCipherSuites(g10.f18257c);
        }
    }

    public final List<i> d() {
        List<i> F0;
        String[] strArr = this.f18257c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i.Companion.b(str));
        }
        F0 = ub.c0.F0(arrayList);
        return F0;
    }

    public final boolean e(SSLSocket sSLSocket) {
        Comparator b10;
        hc.t.e(sSLSocket, "socket");
        if (!this.f18255a) {
            return false;
        }
        String[] strArr = this.f18258d;
        if (strArr != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            b10 = wb.b.b();
            if (!pf.d.u(strArr, enabledProtocols, b10)) {
                return false;
            }
        }
        String[] strArr2 = this.f18257c;
        return strArr2 == null || pf.d.u(strArr2, sSLSocket.getEnabledCipherSuites(), i.Companion.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f18255a;
        l lVar = (l) obj;
        if (z10 != lVar.f18255a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f18257c, lVar.f18257c) && Arrays.equals(this.f18258d, lVar.f18258d) && this.f18256b == lVar.f18256b);
    }

    public final boolean f() {
        return this.f18255a;
    }

    public final boolean h() {
        return this.f18256b;
    }

    public int hashCode() {
        if (this.f18255a) {
            String[] strArr = this.f18257c;
            int i10 = 0;
            int hashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
            String[] strArr2 = this.f18258d;
            if (strArr2 != null) {
                i10 = Arrays.hashCode(strArr2);
            }
            return ((hashCode + i10) * 31) + (!this.f18256b ? 1 : 0);
        }
        return 17;
    }

    public final List<e0> i() {
        List<e0> F0;
        String[] strArr = this.f18258d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(e0.Companion.a(str));
        }
        F0 = ub.c0.F0(arrayList);
        return F0;
    }

    public String toString() {
        if (!this.f18255a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(d(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(i(), "[all enabled]")) + ", supportsTlsExtensions=" + this.f18256b + ')';
    }
}
