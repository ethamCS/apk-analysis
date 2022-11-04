package ra;

import bb.n;
import bb.w;
import bf.x;
import gc.p;
import hc.t;
import hc.v;
import io.ktor.utils.io.h;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.l0;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.l;
import tb.m;
import ub.p0;
import ub.x0;
import ya.g;
import zb.f;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lra/b;", "Lqa/c;", BuildConfig.FLAVOR, "urlString", "Ljava/net/HttpURLConnection;", "j", "Lya/d;", "data", "Lya/g;", "E0", "(Lya/d;Lxb/d;)Ljava/lang/Object;", "Lra/d;", "config", "Lra/d;", "i", "()Lra/d;", "Lkotlinx/coroutines/l0;", "dispatcher$delegate", "Lkotlin/Lazy;", "I0", "()Lkotlinx/coroutines/l0;", "dispatcher", BuildConfig.FLAVOR, "Lqa/e;", "supportedCapabilities", "Ljava/util/Set;", "p0", "()Ljava/util/Set;", "<init>", "(Lra/d;)V", "ktor-client-android"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b extends qa.c {
    private final Set<qa.e<?>> U3;

    /* renamed from: x */
    private final ra.d f20558x;

    /* renamed from: y */
    private final Lazy f20559y = l.a(new a());

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/l0;", "b", "()Lkotlinx/coroutines/l0;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<l0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            b.this = r1;
        }

        /* renamed from: b */
        public final l0 invoke() {
            return ab.c.b(g1.f15390a, b.this.k().b(), "ktor-android-dispatcher");
        }
    }

    @f(c = "io.ktor.client.engine.android.AndroidClientEngine", f = "AndroidClientEngine.kt", l = {41, 85, 88}, m = "execute")
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: ra.b$b */
    /* loaded from: classes.dex */
    public static final class C0329b extends zb.d {
        Object U3;
        Object V3;
        /* synthetic */ Object W3;
        int Y3;

        /* renamed from: x */
        Object f20561x;

        /* renamed from: y */
        Object f20562y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0329b(xb.d<? super C0329b> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.W3 = obj;
            this.Y3 |= Integer.MIN_VALUE;
            return b.this.E0(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/net/HttpURLConnection;", "connection", "Lya/g;", "b", "(Ljava/net/HttpURLConnection;)Lya/g;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.l<HttpURLConnection, g> {

        /* renamed from: c */
        final /* synthetic */ xb.g f20563c;

        /* renamed from: d */
        final /* synthetic */ ya.d f20564d;

        /* renamed from: q */
        final /* synthetic */ ib.b f20565q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(xb.g gVar, ya.d dVar, ib.b bVar) {
            super(1);
            this.f20563c = gVar;
            this.f20564d = dVar;
            this.f20565q = bVar;
        }

        /* renamed from: b */
        public final g invoke(HttpURLConnection httpURLConnection) {
            int d10;
            boolean x10;
            String str;
            t.e(httpURLConnection, "connection");
            int responseCode = httpURLConnection.getResponseCode();
            String responseMessage = httpURLConnection.getResponseMessage();
            w wVar = responseMessage == null ? null : new w(responseCode, responseMessage);
            if (wVar == null) {
                wVar = w.Companion.a(responseCode);
            }
            w wVar2 = wVar;
            h a10 = e.a(httpURLConnection, this.f20563c, this.f20564d);
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            t.d(headerFields, "connection.headerFields");
            d10 = p0.d(headerFields.size());
            LinkedHashMap linkedHashMap = new LinkedHashMap(d10);
            Iterator<T> it = headerFields.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                if (str2 == null) {
                    str = BuildConfig.FLAVOR;
                } else {
                    Locale locale = Locale.getDefault();
                    t.d(locale, "getDefault()");
                    str = str2.toLowerCase(locale);
                    t.d(str, "this as java.lang.String).toLowerCase(locale)");
                }
                linkedHashMap.put(str, entry.getValue());
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                x10 = x.x((CharSequence) entry2.getKey());
                if (!x10) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            return new g(wVar2, this.f20565q, new n(linkedHashMap2), bb.v.Companion.b(), a10, this.f20563c);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "key", "value", "Ltb/e0;", "b", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class d extends v implements p<String, String, e0> {

        /* renamed from: c */
        final /* synthetic */ HttpURLConnection f20566c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(HttpURLConnection httpURLConnection) {
            super(2);
            this.f20566c = httpURLConnection;
        }

        public final void b(String str, String str2) {
            t.e(str, "key");
            t.e(str2, "value");
            this.f20566c.addRequestProperty(str, str2);
        }

        @Override // gc.p
        public /* bridge */ /* synthetic */ e0 u(String str, String str2) {
            b(str, str2);
            return e0.f22152a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ra.d dVar) {
        super("ktor-android");
        Lazy a10;
        Set<qa.e<?>> a11;
        t.e(dVar, "config");
        this.f20558x = dVar;
        a10 = m.a(new a());
        this.f20559y = a10;
        a11 = x0.a(ta.t.f22120d);
        this.U3 = a11;
    }

    private final HttpURLConnection j(String str) {
        URL url = new URL(str);
        Proxy a10 = k().a();
        URLConnection openConnection = a10 == null ? null : url.openConnection(a10);
        if (openConnection == null) {
            openConnection = url.openConnection();
            t.d(openConnection, "url.openConnection()");
        }
        return (HttpURLConnection) openConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8 A[PHI: r1 
      PHI: (r1v2 java.lang.Object) = (r1v4 java.lang.Object), (r1v1 java.lang.Object) binds: [B:52:0x01c5, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // qa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E0(ya.d r26, xb.d<? super ya.g> r27) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.b.E0(ya.d, xb.d):java.lang.Object");
    }

    @Override // qa.b
    public l0 I0() {
        return (l0) this.f20559y.getValue();
    }

    /* renamed from: i */
    public ra.d k() {
        return this.f20558x;
    }

    @Override // qa.c, qa.b
    public Set<qa.e<?>> p0() {
        return this.U3;
    }
}
