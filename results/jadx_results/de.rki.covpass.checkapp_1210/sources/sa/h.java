package sa;

import bb.l;
import gc.l;
import gc.p;
import hc.v;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.coroutines.q;
import of.b0;
import of.t;
import of.x;
import of.y;
import of.z;
import org.conscrypt.BuildConfig;
import ta.u;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\f\u0010\n\u001a\u00020\t*\u00020\bH\u0000\u001a\f\u0010\r\u001a\u00020\f*\u00020\u000bH\u0000\u001a\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u001a\f\u0010\u0013\u001a\u00020\u0012*\u00020\u000eH\u0002\u001a\f\u0010\u0014\u001a\u00020\u0010*\u00020\u000eH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lof/x;", "Lof/z;", "request", "Lya/d;", "requestData", "Lof/b0;", "b", "(Lof/x;Lof/z;Lya/d;Lxb/d;)Ljava/lang/Object;", "Lof/t;", "Lbb/l;", "c", "Lof/y;", "Lbb/v;", "d", "Ljava/io/IOException;", "origin", BuildConfig.FLAVOR, "f", BuildConfig.FLAVOR, "e", "g", "ktor-client-okhttp"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class h {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21604a;

        static {
            int[] iArr = new int[y.values().length];
            iArr[y.HTTP_1_0.ordinal()] = 1;
            iArr[y.HTTP_1_1.ordinal()] = 2;
            iArr[y.SPDY_3.ordinal()] = 3;
            iArr[y.HTTP_2.ordinal()] = 4;
            iArr[y.H2_PRIOR_KNOWLEDGE.ordinal()] = 5;
            iArr[y.QUIC.ordinal()] = 6;
            f21604a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends v implements l<Throwable, e0> {

        /* renamed from: c */
        final /* synthetic */ of.e f21605c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(of.e eVar) {
            super(1);
            this.f21605c = eVar;
        }

        public final void b(Throwable th2) {
            this.f21605c.cancel();
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
            b(th2);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J \u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\b0\u0006H\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"sa/h$c", "Lbb/l;", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "b", BuildConfig.FLAVOR, "names", BuildConfig.FLAVOR, "a", BuildConfig.FLAVOR, "caseInsensitiveName", "Z", "d", "()Z", "ktor-client-okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c implements bb.l {

        /* renamed from: a */
        private final boolean f21606a = true;

        /* renamed from: b */
        final /* synthetic */ t f21607b;

        c(t tVar) {
            this.f21607b = tVar;
        }

        @Override // fb.v
        public Set<Map.Entry<String, List<String>>> a() {
            return this.f21607b.f().entrySet();
        }

        @Override // fb.v
        public List<String> b(String str) {
            hc.t.e(str, "name");
            List<String> k10 = this.f21607b.k(str);
            if (!k10.isEmpty()) {
                return k10;
            }
            return null;
        }

        @Override // fb.v
        public void c(p<? super String, ? super List<String>, e0> pVar) {
            l.b.a(this, pVar);
        }

        @Override // fb.v
        public boolean d() {
            return this.f21606a;
        }

        @Override // fb.v
        public String e(String str) {
            return l.b.b(this, str);
        }

        @Override // fb.v
        public Set<String> names() {
            return this.f21607b.d();
        }
    }

    public static final Object b(x xVar, z zVar, ya.d dVar, xb.d<? super b0> dVar2) {
        xb.d b10;
        Object c10;
        b10 = yb.c.b(dVar2);
        q qVar = new q(b10, 1);
        qVar.z();
        of.e E = xVar.E(zVar);
        E.r(new sa.b(dVar, qVar));
        qVar.N(new b(E));
        Object s10 = qVar.s();
        c10 = yb.d.c();
        if (s10 == c10) {
            zb.h.c(dVar2);
        }
        return s10;
    }

    public static final bb.l c(t tVar) {
        hc.t.e(tVar, "<this>");
        return new c(tVar);
    }

    public static final bb.v d(y yVar) {
        hc.t.e(yVar, "<this>");
        switch (a.f21604a[yVar.ordinal()]) {
            case 1:
                return bb.v.Companion.a();
            case 2:
                return bb.v.Companion.b();
            case 3:
                return bb.v.Companion.e();
            case 4:
            case 5:
                return bb.v.Companion.c();
            case 6:
                return bb.v.Companion.d();
            default:
                throw new tb.p();
        }
    }

    private static final boolean e(IOException iOException) {
        boolean L;
        String message = iOException.getMessage();
        if (message == null) {
            return false;
        }
        L = bf.y.L(message, "connect", true);
        return L;
    }

    public static final Throwable f(ya.d dVar, IOException iOException) {
        Throwable g10 = g(iOException);
        if (g10 instanceof SocketTimeoutException) {
            return e((IOException) g10) ? u.a(dVar, g10) : u.b(dVar, g10);
        }
        return g10;
    }

    private static final Throwable g(IOException iOException) {
        Throwable[] suppressed = iOException.getSuppressed();
        hc.t.d(suppressed, "suppressed");
        if (!(suppressed.length == 0)) {
            Throwable th2 = iOException.getSuppressed()[0];
            hc.t.d(th2, "suppressed[0]");
            return th2;
        }
        return iOException;
    }
}
