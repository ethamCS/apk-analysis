package e9;

import af.h;
import af.j;
import android.content.Context;
import bf.k;
import bf.y;
import gc.l;
import gc.p;
import hc.t;
import hc.v;
import hh.n0;
import java.io.StringReader;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import zb.f;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u0001\u001a\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\b\u001a\u00020\u0001\u001a\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\u0001\u001a\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0002¨\u0006\u000f"}, d2 = {"Landroid/content/Context;", BuildConfig.FLAVOR, "path", BuildConfig.FLAVOR, "Ljava/security/cert/X509Certificate;", "d", "Ljava/security/PublicKey;", "e", "data", "c", "f", "Laf/h;", BuildConfig.FLAVOR, "g", "b", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private static final k f9536a = new k("#[^\n]*");

    /* renamed from: b */
    private static final k f9537b = new k("\n\n+");

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ljh/e;", "b", "(Ljava/lang/Object;)Ljh/e;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends v implements l<Object, jh.e> {

        /* renamed from: c */
        public static final a f9538c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final jh.e invoke(Object obj) {
            t.e(obj, "it");
            if (obj instanceof jh.e) {
                return (jh.e) obj;
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljh/e;", "it", "Ljava/security/cert/X509Certificate;", "kotlin.jvm.PlatformType", "b", "(Ljh/e;)Ljava/security/cert/X509Certificate;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends v implements l<jh.e, X509Certificate> {

        /* renamed from: c */
        final /* synthetic */ kh.c f9539c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kh.c cVar) {
            super(1);
            this.f9539c = cVar;
        }

        /* renamed from: b */
        public final X509Certificate invoke(jh.e eVar) {
            t.e(eVar, "it");
            return this.f9539c.a(eVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Lhh/n0;", "b", "(Ljava/lang/Object;)Lhh/n0;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: e9.c$c */
    /* loaded from: classes.dex */
    public static final class C0139c extends v implements l<Object, n0> {

        /* renamed from: c */
        public static final C0139c f9540c = new C0139c();

        C0139c() {
            super(1);
        }

        /* renamed from: b */
        public final n0 invoke(Object obj) {
            t.e(obj, "it");
            return n0.n(obj);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhh/n0;", "it", "Ljava/security/PublicKey;", "kotlin.jvm.PlatformType", "b", "(Lhh/n0;)Ljava/security/PublicKey;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends v implements l<n0, PublicKey> {

        /* renamed from: c */
        final /* synthetic */ dj.a f9541c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(dj.a aVar) {
            super(1);
            this.f9541c = aVar;
        }

        /* renamed from: b */
        public final PublicKey invoke(n0 n0Var) {
            t.e(n0Var, "it");
            return this.f9541c.b(n0Var);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Laf/j;", BuildConfig.FLAVOR, "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @f(c = "de.rki.covpass.sdk.crypto.PemUtilsKt$readRawPem$1", f = "PemUtils.kt", l = {50}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends zb.k implements p<j<? super Object>, xb.d<? super e0>, Object> {
        final /* synthetic */ String U3;

        /* renamed from: q */
        Object f9542q;

        /* renamed from: x */
        int f9543x;

        /* renamed from: y */
        private /* synthetic */ Object f9544y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, xb.d<? super e> dVar) {
            super(2, dVar);
            this.U3 = str;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            j jVar;
            cj.f fVar;
            Object readObject;
            c10 = yb.d.c();
            int i10 = this.f9543x;
            if (i10 == 0) {
                tb.t.b(obj);
                fVar = new cj.f(new StringReader(c.b(this.U3)));
                jVar = (j) this.f9544y;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                fVar = (cj.f) this.f9542q;
                jVar = (j) this.f9544y;
                tb.t.b(obj);
            }
            do {
                readObject = fVar.readObject();
                if (readObject == null) {
                    return e0.f22152a;
                }
                this.f9544y = jVar;
                this.f9542q = fVar;
                this.f9543x = 1;
            } while (jVar.d(readObject, this) != c10);
            return c10;
        }

        /* renamed from: W */
        public final Object u(j<Object> jVar, xb.d<? super e0> dVar) {
            return ((e) j(jVar, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            e eVar = new e(this.U3, dVar);
            eVar.f9544y = obj;
            return eVar;
        }
    }

    public static final String b(String str) {
        CharSequence S0;
        S0 = y.S0(f9537b.j(f9536a.j(str, BuildConfig.FLAVOR), "\n"));
        return S0.toString();
    }

    public static final List<X509Certificate> c(String str) {
        h A;
        h z10;
        List<X509Certificate> F;
        t.e(str, "data");
        kh.c cVar = new kh.c();
        A = af.p.A(g(str), a.f9538c);
        z10 = af.p.z(A, new b(cVar));
        F = af.p.F(z10);
        return F;
    }

    public static final List<X509Certificate> d(Context context, String str) {
        t.e(context, "<this>");
        t.e(str, "path");
        return c(z9.a.a(context, str));
    }

    public static final List<PublicKey> e(Context context, String str) {
        t.e(context, "<this>");
        t.e(str, "path");
        return f(z9.a.a(context, str));
    }

    public static final List<PublicKey> f(String str) {
        h A;
        h z10;
        List<PublicKey> F;
        t.e(str, "data");
        dj.a aVar = new dj.a();
        A = af.p.A(g(str), C0139c.f9540c);
        z10 = af.p.z(A, new d(aVar));
        F = af.p.F(z10);
        return F;
    }

    public static final h<Object> g(String str) {
        h<Object> b10;
        t.e(str, "data");
        b10 = af.l.b(new e(str, null));
        return b10;
    }
}
